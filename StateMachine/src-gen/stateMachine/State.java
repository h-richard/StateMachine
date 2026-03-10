/**
 */
package stateMachine;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachine.State#getContainer <em>Container</em>}</li>
 *   <li>{@link stateMachine.State#getName <em>Name</em>}</li>
 *   <li>{@link stateMachine.State#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link stateMachine.State#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see stateMachine.StateMachinePackage#getState()
 * @model annotation="Xmod_exec"
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link stateMachine.CompositeState#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(CompositeState)
	 * @see stateMachine.StateMachinePackage#getState_Container()
	 * @see stateMachine.CompositeState#getStates
	 * @model opposite="states" transient="false"
	 * @generated
	 */
	CompositeState getContainer();

	/**
	 * Sets the value of the '{@link stateMachine.State#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(CompositeState value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see stateMachine.StateMachinePackage#getState_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link stateMachine.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see stateMachine.StateMachinePackage#getState_IsActive()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link stateMachine.State#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link stateMachine.Xmod_Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see stateMachine.StateMachinePackage#getState_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Xmod_Action> getActions();

} // State
