/**
 */
package stateMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachine.CompositeState#getStates <em>States</em>}</li>
 *   <li>{@link stateMachine.CompositeState#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link stateMachine.CompositeState#getHistoryState <em>History State</em>}</li>
 * </ul>
 *
 * @see stateMachine.StateMachinePackage#getCompositeState()
 * @model
 * @generated
 */
public interface CompositeState extends State {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link stateMachine.State}.
	 * It is bidirectional and its opposite is '{@link stateMachine.State#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see stateMachine.StateMachinePackage#getCompositeState_States()
	 * @see stateMachine.State#getContainer
	 * @model opposite="container" containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(InitialState)
	 * @see stateMachine.StateMachinePackage#getCompositeState_InitialState()
	 * @model required="true"
	 * @generated
	 */
	InitialState getInitialState();

	/**
	 * Sets the value of the '{@link stateMachine.CompositeState#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(InitialState value);

	/**
	 * Returns the value of the '<em><b>History State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History State</em>' reference.
	 * @see #setHistoryState(HistoryState)
	 * @see stateMachine.StateMachinePackage#getCompositeState_HistoryState()
	 * @model
	 * @generated
	 */
	HistoryState getHistoryState();

	/**
	 * Sets the value of the '{@link stateMachine.CompositeState#getHistoryState <em>History State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History State</em>' reference.
	 * @see #getHistoryState()
	 * @generated
	 */
	void setHistoryState(HistoryState value);

} // CompositeState
