/**
 */
package stateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachine.PseudoState#getReferencedState <em>Referenced State</em>}</li>
 * </ul>
 *
 * @see stateMachine.StateMachinePackage#getPseudoState()
 * @model abstract="true"
 * @generated
 */
public interface PseudoState extends State {
	/**
	 * Returns the value of the '<em><b>Referenced State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced State</em>' reference.
	 * @see #setReferencedState(State)
	 * @see stateMachine.StateMachinePackage#getPseudoState_ReferencedState()
	 * @model
	 * @generated
	 */
	State getReferencedState();

	/**
	 * Sets the value of the '{@link stateMachine.PseudoState#getReferencedState <em>Referenced State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced State</em>' reference.
	 * @see #getReferencedState()
	 * @generated
	 */
	void setReferencedState(State value);

} // PseudoState
