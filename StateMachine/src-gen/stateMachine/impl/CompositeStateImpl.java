/**
 */
package stateMachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stateMachine.CompositeState;
import stateMachine.HistoryState;
import stateMachine.InitialState;
import stateMachine.State;
import stateMachine.StateMachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stateMachine.impl.CompositeStateImpl#getStates <em>States</em>}</li>
 *   <li>{@link stateMachine.impl.CompositeStateImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link stateMachine.impl.CompositeStateImpl#getHistoryState <em>History State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeStateImpl extends StateImpl implements CompositeState {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected InitialState initialState;

	/**
	 * The cached value of the '{@link #getHistoryState() <em>History State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryState()
	 * @generated
	 * @ordered
	 */
	protected HistoryState historyState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.COMPOSITE_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<State>(State.class, this,
					StateMachinePackage.COMPOSITE_STATE__STATES, StateMachinePackage.STATE__CONTAINER);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject) initialState;
			initialState = (InitialState) eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StateMachinePackage.COMPOSITE_STATE__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialState(InitialState newInitialState) {
		InitialState oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.COMPOSITE_STATE__INITIAL_STATE,
					oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryState getHistoryState() {
		if (historyState != null && historyState.eIsProxy()) {
			InternalEObject oldHistoryState = (InternalEObject) historyState;
			historyState = (HistoryState) eResolveProxy(oldHistoryState);
			if (historyState != oldHistoryState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StateMachinePackage.COMPOSITE_STATE__HISTORY_STATE, oldHistoryState, historyState));
			}
		}
		return historyState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryState basicGetHistoryState() {
		return historyState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHistoryState(HistoryState newHistoryState) {
		HistoryState oldHistoryState = historyState;
		historyState = newHistoryState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.COMPOSITE_STATE__HISTORY_STATE,
					oldHistoryState, historyState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StateMachinePackage.COMPOSITE_STATE__STATES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StateMachinePackage.COMPOSITE_STATE__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StateMachinePackage.COMPOSITE_STATE__STATES:
			return getStates();
		case StateMachinePackage.COMPOSITE_STATE__INITIAL_STATE:
			if (resolve)
				return getInitialState();
			return basicGetInitialState();
		case StateMachinePackage.COMPOSITE_STATE__HISTORY_STATE:
			if (resolve)
				return getHistoryState();
			return basicGetHistoryState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StateMachinePackage.COMPOSITE_STATE__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends State>) newValue);
			return;
		case StateMachinePackage.COMPOSITE_STATE__INITIAL_STATE:
			setInitialState((InitialState) newValue);
			return;
		case StateMachinePackage.COMPOSITE_STATE__HISTORY_STATE:
			setHistoryState((HistoryState) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StateMachinePackage.COMPOSITE_STATE__STATES:
			getStates().clear();
			return;
		case StateMachinePackage.COMPOSITE_STATE__INITIAL_STATE:
			setInitialState((InitialState) null);
			return;
		case StateMachinePackage.COMPOSITE_STATE__HISTORY_STATE:
			setHistoryState((HistoryState) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StateMachinePackage.COMPOSITE_STATE__STATES:
			return states != null && !states.isEmpty();
		case StateMachinePackage.COMPOSITE_STATE__INITIAL_STATE:
			return initialState != null;
		case StateMachinePackage.COMPOSITE_STATE__HISTORY_STATE:
			return historyState != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeStateImpl
