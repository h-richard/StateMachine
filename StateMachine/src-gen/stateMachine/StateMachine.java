/**
 */
package stateMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachine.StateMachine#getEvents <em>Events</em>}</li>
 *   <li>{@link stateMachine.StateMachine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see stateMachine.StateMachinePackage#getStateMachine()
 * @model annotation="Xmod_main"
 * @generated
 */
public interface StateMachine extends CompositeState {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link stateMachine.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see stateMachine.StateMachinePackage#getStateMachine_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link stateMachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see stateMachine.StateMachinePackage#getStateMachine_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // StateMachine
