/**
 */
package stateMachine.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import stateMachine.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see stateMachine.StateMachinePackage
 * @generated
 */
public class StateMachineAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StateMachinePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StateMachinePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineSwitch<Adapter> modelSwitch = new StateMachineSwitch<Adapter>() {
		@Override
		public Adapter caseStateMachine(StateMachine object) {
			return createStateMachineAdapter();
		}

		@Override
		public Adapter caseState(State object) {
			return createStateAdapter();
		}

		@Override
		public Adapter caseCompositeState(CompositeState object) {
			return createCompositeStateAdapter();
		}

		@Override
		public Adapter casePseudoState(PseudoState object) {
			return createPseudoStateAdapter();
		}

		@Override
		public Adapter caseInitialState(InitialState object) {
			return createInitialStateAdapter();
		}

		@Override
		public Adapter caseHistoryState(HistoryState object) {
			return createHistoryStateAdapter();
		}

		@Override
		public Adapter caseTransition(Transition object) {
			return createTransitionAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseXmod_Exception(Xmod_Exception object) {
			return createXmod_ExceptionAdapter();
		}

		@Override
		public Adapter caseXmod_Action(Xmod_Action object) {
			return createXmod_ActionAdapter();
		}

		@Override
		public Adapter caseXmod_Operation(Xmod_Operation object) {
			return createXmod_OperationAdapter();
		}

		@Override
		public Adapter caseXmod_Element(Xmod_Element object) {
			return createXmod_ElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link stateMachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stateMachine.StateMachine
	 * @generated
	 */
	public Adapter createStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stateMachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stateMachine.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stateMachine.CompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stateMachine.CompositeState
	 * @generated
	 */
	public Adapter createCompositeStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stateMachine.PseudoState <em>Pseudo State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stateMachine.PseudoState
	 * @generated
	 */
	public Adapter createPseudoStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stateMachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stateMachine.InitialState
	 * @generated
	 */
	public Adapter createInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stateMachine.HistoryState <em>History State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stateMachine.HistoryState
	 * @generated
	 */
	public Adapter createHistoryStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stateMachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stateMachine.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stateMachine.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stateMachine.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stateMachine.Xmod_Exception <em>Xmod Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stateMachine.Xmod_Exception
	 * @generated
	 */
	public Adapter createXmod_ExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stateMachine.Xmod_Action <em>Xmod Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stateMachine.Xmod_Action
	 * @generated
	 */
	public Adapter createXmod_ActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stateMachine.Xmod_Operation <em>Xmod Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stateMachine.Xmod_Operation
	 * @generated
	 */
	public Adapter createXmod_OperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stateMachine.Xmod_Element <em>Xmod Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stateMachine.Xmod_Element
	 * @generated
	 */
	public Adapter createXmod_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StateMachineAdapterFactory
