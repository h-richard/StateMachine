/**
*/
package stateMachine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import stateMachine.StateMachinePackage;
import stateMachine.Xmod_Exception;
import stateMachine.Xmod_ExceptionKind;
import stateMachine.Xmod_ExceptionReaction;
import stateMachine.Xmod_Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xmod Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StateMachine.impl.Xmod_ExceptionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link StateMachine.impl.Xmod_ExceptionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link StateMachine.impl.Xmod_ExceptionImpl#getReaction <em>Reaction</em>}</li>
 *   <li>{@link StateMachine.impl.Xmod_ExceptionImpl#getCalledOperation <em>Called Operation</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
public class Xmod_ExceptionImpl extends MinimalEObjectImpl.Container implements Xmod_Exception {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Xmod_ExceptionKind KIND_EDEFAULT = Xmod_ExceptionKind.OK;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated NOT
	 * @ordered
	 */
	protected Xmod_ExceptionKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated NOT
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReaction() <em>Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaction()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Xmod_ExceptionReaction REACTION_EDEFAULT = Xmod_ExceptionReaction.CONTINUE;

	/**
	 * The cached value of the '{@link #getReaction() <em>Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaction()
	 * @generated NOT
	 * @ordered
	 */
	protected Xmod_ExceptionReaction reaction = REACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCalledOperation() <em>Called Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledOperation()
	 * @generated NOT
	 * @ordered
	 */
	protected Xmod_Operation calledOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Xmod_ExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.XMOD_EXCEPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Xmod_ExceptionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setKind(Xmod_ExceptionKind newKind) {
		Xmod_ExceptionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.XMOD_EXCEPTION__KIND, oldKind,
					kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.XMOD_EXCEPTION__FILTER, oldFilter,
					filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Xmod_ExceptionReaction getReaction() {
		return reaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setReaction(Xmod_ExceptionReaction newReaction) {
		Xmod_ExceptionReaction oldReaction = reaction;
		reaction = newReaction == null ? REACTION_EDEFAULT : newReaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.XMOD_EXCEPTION__REACTION,
					oldReaction, reaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Xmod_Operation getCalledOperation() {
		return calledOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetCalledOperation(Xmod_Operation newCalledOperation, NotificationChain msgs) {
		Xmod_Operation oldCalledOperation = calledOperation;
		calledOperation = newCalledOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StateMachinePackage.XMOD_EXCEPTION__CALLED_OPERATION, oldCalledOperation, newCalledOperation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setCalledOperation(Xmod_Operation newCalledOperation) {
		if (newCalledOperation != calledOperation) {
			NotificationChain msgs = null;
			if (calledOperation != null)
				msgs = ((InternalEObject) calledOperation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StateMachinePackage.XMOD_EXCEPTION__CALLED_OPERATION, null, msgs);
			if (newCalledOperation != null)
				msgs = ((InternalEObject) newCalledOperation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StateMachinePackage.XMOD_EXCEPTION__CALLED_OPERATION, null, msgs);
			msgs = basicSetCalledOperation(newCalledOperation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.XMOD_EXCEPTION__CALLED_OPERATION,
					newCalledOperation, newCalledOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StateMachinePackage.XMOD_EXCEPTION__CALLED_OPERATION:
			return basicSetCalledOperation(null, msgs);
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
		case StateMachinePackage.XMOD_EXCEPTION__KIND:
			return getKind();
		case StateMachinePackage.XMOD_EXCEPTION__FILTER:
			return getFilter();
		case StateMachinePackage.XMOD_EXCEPTION__REACTION:
			return getReaction();
		case StateMachinePackage.XMOD_EXCEPTION__CALLED_OPERATION:
			return getCalledOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StateMachinePackage.XMOD_EXCEPTION__KIND:
			setKind((Xmod_ExceptionKind) newValue);
			return;
		case StateMachinePackage.XMOD_EXCEPTION__FILTER:
			setFilter((String) newValue);
			return;
		case StateMachinePackage.XMOD_EXCEPTION__REACTION:
			setReaction((Xmod_ExceptionReaction) newValue);
			return;
		case StateMachinePackage.XMOD_EXCEPTION__CALLED_OPERATION:
			setCalledOperation((Xmod_Operation) newValue);
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
		case StateMachinePackage.XMOD_EXCEPTION__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case StateMachinePackage.XMOD_EXCEPTION__FILTER:
			setFilter(FILTER_EDEFAULT);
			return;
		case StateMachinePackage.XMOD_EXCEPTION__REACTION:
			setReaction(REACTION_EDEFAULT);
			return;
		case StateMachinePackage.XMOD_EXCEPTION__CALLED_OPERATION:
			setCalledOperation((Xmod_Operation) null);
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
		case StateMachinePackage.XMOD_EXCEPTION__KIND:
			return kind != KIND_EDEFAULT;
		case StateMachinePackage.XMOD_EXCEPTION__FILTER:
			return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
		case StateMachinePackage.XMOD_EXCEPTION__REACTION:
			return reaction != REACTION_EDEFAULT;
		case StateMachinePackage.XMOD_EXCEPTION__CALLED_OPERATION:
			return calledOperation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(", filter: ");
		result.append(filter);
		result.append(", reaction: ");
		result.append(reaction);
		result.append(')');
		return result.toString();
	}

} //Xmod_ExceptionImpl
