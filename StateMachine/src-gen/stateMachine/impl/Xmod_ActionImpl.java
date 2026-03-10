/**
 */
package stateMachine.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stateMachine.StateMachinePackage;
import stateMachine.Xmod_Action;
import stateMachine.Xmod_Exception;
import stateMachine.Xmod_ExceptionKind;
import stateMachine.Xmod_ExceptionReaction;
import stateMachine.Xmod_Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object <em><b>Xmod Action</b></em>.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StateMachine.impl.Xmod_ActionImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
public class Xmod_ActionImpl extends Xmod_ElementImpl implements Xmod_Action {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated NOT
	 * @ordered
	 */
	protected EList<Xmod_Operation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Xmod_ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.XMOD_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Xmod_Operation> getOperations() {
		if (operations == null)
			operations = new EObjectContainmentEList<Xmod_Operation>(Xmod_Operation.class, this,
					StateMachinePackage.XMOD_ACTION__OPERATIONS);
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Xmod_ExceptionReaction execute() {
		if (operations == null)
			return null;
		ArrayDeque<Xmod_Operation> queuedOperations = new ArrayDeque<>();
		queuedOperations.addAll(operations);

		while (!queuedOperations.isEmpty()) {
			Xmod_Operation op = queuedOperations.pollFirst();
			Xmod_Exception xme = executeSingle(op);
			Xmod_ExceptionReaction reaction = xme.getReaction();

			switch (reaction) {
			case CONTINUE:
				continue;
			case SKIP:
				return null;
			case EXIT:
				System.exit(0);
			default:
				return reaction;
			}
		}

		return null;
	}

	private Xmod_Exception executeSingle(Xmod_Operation op) {
		Xmod_Exception xme = op.callOperation();

		if (xme.getKind() != Xmod_ExceptionKind.OK && xme.getCalledOperation() != null) {
			Xmod_Exception lowerXme = executeSingle(xme.getCalledOperation());
			// comparing the current selected reaction with the lower one using their ordinal as weight
			xme = xme.getReaction().getValue() > lowerXme.getReaction().getValue() ? xme : lowerXme;
		}

		return xme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StateMachinePackage.XMOD_ACTION__OPERATIONS:
			return ((InternalEList<?>) getOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StateMachinePackage.XMOD_ACTION__OPERATIONS:
			return getOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StateMachinePackage.XMOD_ACTION__OPERATIONS:
			getOperations().clear();
			getOperations().addAll((Collection<? extends Xmod_Operation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StateMachinePackage.XMOD_ACTION__OPERATIONS:
			getOperations().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StateMachinePackage.XMOD_ACTION__OPERATIONS:
			return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case StateMachinePackage.XMOD_ACTION___EXECUTE:
			return execute();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Xmod_ActionImpl
