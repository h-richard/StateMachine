import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import util.Font;

import stateMachine.CompositeState;
import stateMachine.Event;
import stateMachine.HistoryState;
import stateMachine.InitialState;
import stateMachine.State;
import stateMachine.StateMachine;
import stateMachine.Transition;
import stateMachine.Xmod_Action;
import stateMachine.util.StateMachineUtils;

public class StateMachinePlayer {
	
	private StateMachine STM;
	private HashMap<Thread,Object> runningThreads;
	
	public StateMachinePlayer(StateMachine stm) {
		STM = stm;
		runningThreads = new HashMap<>();
	}
	
	public Set<Thread> getRunningThreads() {
		return runningThreads.keySet();
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/// Printing informations
	
	public void printStateMachine(StateMachine stm) {
		System.out.println("### States ("+stm.getStates().size()+")");
		printStatesOf(stm,0);
		
		System.out.println("\n### Events ("+stm.getEvents().size()+")");
		for (Event e : stm.getEvents()) 
			System.out.println(e.getName());
		
		System.out.println("\n### Transitions ("+stm.getTransitions().size()+")");
		for (Transition t : stm.getTransitions())
			System.out.println(t.getSource().getName() + " -> " + t.getTarget().getName() + " on " + t.getEvent().getName());
	}
	
	public void printStatesOf(CompositeState s, int depth) {
		for (State child : s.getStates()) {
			for (int i = 0; i < depth; i++) System.out.print("  ");
			if (child instanceof InitialState init) 
				System.out.println(child.getName()+" > "+init.getReferencedState().getName());
			else 
				System.out.println(child.getName());
			if (child instanceof CompositeState comp)
				printStatesOf(comp,depth+1);
		}
	}
	
	public void printActiveState() {
		List<State> activeStateHierarchy = getActiveStates(STM);
		
		StringBuilder sb = new StringBuilder();
		for (State s : activeStateHierarchy)
			sb.append(s.getName()).append(" > ");
		sb.setCharAt(sb.length()-2, ' ');
		
		System.out.println("Active state : "+sb.toString());
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/// Main manipulations

	public void init() {
        activateState(STM);
        State s = STM.getInitialState().getReferencedState();
        while (s != null) {
            activateState(s);
            setAsHistory(s);
            if (s instanceof CompositeState)
                s = ((CompositeState) s).getInitialState().getReferencedState();
            else s = null;
        }
	}
	
	// Process one event on the state machine
	public void processEvent(String event) {
		Transition trans = this.getTriggerableTransition(event);
        if (trans == null) {
            System.out.println(Font.bold("No valid transition found for : '" + event + "'"));
            return;
        }
        onTransition(trans);

        State target = trans.getTarget();

		if (target instanceof HistoryState) {
			State histState = ((HistoryState)target).getReferencedState();
			if (histState == null)
				target = target.getContainer().getInitialState().getReferencedState();
			else target = histState;
		}
		
        updateStateHierarchy(target);
        System.out.println(Font.bold(trans.getSource().getName() + " -> " + trans.getTarget().getName()));
        
        for (State s : getActiveStates(STM)) onDo(s);
	}
	
	// Gets the available transition, if it exists, depending on a given event
	// Prioritize the most specific transition (according to UML execution semantics)
	private Transition getTriggerableTransition(String event) {
	    State activeState = getLeafActiveState(STM);

	    while (activeState != null) {
	        for (Transition t : STM.getTransitions()) {
	            if (t.getEvent().getName().equals(event) && t.getSource().equals(activeState)) {
	            	if (evaluateGuards(t)) return t;
	            	else System.out.println(t.getSource().getName() + " -> " + t.getTarget().getName() + Font.red(" guards denied"));
	            }
	        }
	        activeState = activeState.getContainer();
	    }

	    return null;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/// Manipulation of state hierarchy
	
	// Gets the currently active state with no child below
	private State getLeafActiveState(CompositeState comp) {
        for (State s : comp.getStates())
            if (s.isIsActive())
                if (s instanceof CompositeState)
                    return getLeafActiveState((CompositeState) s);
                else return s;
        return null;
    }
	
	// Sets a state as history if possible
	public void setAsHistory(State s) {
		if (s.getContainer() == null) return;
		if (s.getContainer().getHistoryState() == null) return;
		s.getContainer().getHistoryState().setReferencedState(s);
	}
	
	// Deactivates given state and performs its "onExit" action
	private void deactivateState(State s) {
		onExit(s);
		s.setIsActive(false);
	}
	
	// Activates given state and performs its "onEntry" action
	private void activateState(State s) {
		onEntry(s);
		s.setIsActive(true);
		setAsHistory(s);
	}
	
	// Updates the state hierarchy by activating and deactivating states
	private void updateStateHierarchy(State stateToActivate) {
		// get all active states
		List<State> previouslyActive = getActiveStates(STM);
		// get all states to active
		List<State> toActivate = getStatesToActivate(stateToActivate);
		// deactivate states in first list and not in second
		for (State s : previouslyActive)
			if (!toActivate.contains(s))
				deactivateState(s);
		// activate states in second list and not in first
		for (State s : toActivate)
			if (!previouslyActive.contains(s))
				activateState(s);
	}
	
	// Gets all currently active states down from the given state
	private List<State> getActiveStates(State s) {
		List<State> states = new ArrayList<>();
		states.add(s);
		if (s instanceof CompositeState)
			for (State child : ((CompositeState)s).getStates())
				if (child.isIsActive())
					states.addAll(getActiveStates(child));
		return states;
	}
	
	// Gets all states to activate, up and down from the given state
	private List<State> getStatesToActivate(State s) {
		List<State> states = new ArrayList<>();
		states.add(s);
		if (s instanceof CompositeState comp) states.addAll(getStatesToActivateDown(comp));
		states.addAll(getStatesToActivateUp(s));
		return states;
	}
	
	// Gets all states to activate down from the given state
	private List<State> getStatesToActivateDown(CompositeState s) {
		List<State> states = new ArrayList<>();
		State child = null;
		if (s.getHistoryState() != null) 
			child = s.getHistoryState().getReferencedState();
		if (child == null)
			child = s.getInitialState().getReferencedState();
		states.add(child);
		if (child instanceof CompositeState comp) states.addAll(getStatesToActivateDown(comp));
		return states;
	}
	
	// Gets all states to activate up from the given state
	private List<State> getStatesToActivateUp(State s) {
		State up = s.getContainer();
		List<State> states = new ArrayList<>();
		while (up != null) {
			states.add(up);
			up = up.getContainer();
		}
		return states;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/// Actions
	
	// Performs the "guards" action of a given transition and returns the result stored in the external map if there is one, or true
	private boolean evaluateGuards(Transition t) {
		for (Xmod_Action action : t.getActions())
			if (action.getXmod_id().equals("guards")) {
				action.execute();
				return (boolean) StateMachineUtils.getExtMap().get("guardsResult");
			}
		return true;
	}
	
	// Actions performed upon use of the given transition
	private void onTransition(Transition t) {
		for (Xmod_Action action : t.getActions())
			if (action.getXmod_id().equals("onTransition"))
				action.execute();
	}
	
	// Actions performed upon activation of the given state
	private void onEntry(State s) {
		for (Xmod_Action action : s.getActions())
			if (action.getXmod_id().equals("onEntry"))
				executeActionAsThread(s, action);
				
	}
	
	// Actions performed while the state is active
	private void onDo(State s) {
		for (Xmod_Action action : s.getActions())
			if (action.getXmod_id().equals("onDo"))
				executeActionAsThread(s, action);
	}
	
	// Actions performed upon deactivation of the given state
	private void onExit(State s) {
		for (Xmod_Action action : s.getActions())
			if (action.getXmod_id().equals("onExit"))
				executeActionAsThread(s, action);
	}
	
	private void executeActionAsThread(State s, Xmod_Action a) {
		Thread t = new Thread(a::execute);
		runningThreads.put(t, s);
		t.start();
	}
}
