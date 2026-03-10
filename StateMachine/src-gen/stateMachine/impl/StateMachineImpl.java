/**
 */
package stateMachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stateMachine.Event;
import stateMachine.StateMachine;
import stateMachine.StateMachinePackage;
import stateMachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stateMachine.impl.StateMachineImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link stateMachine.impl.StateMachineImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends CompositeStateImpl implements StateMachine {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, StateMachinePackage.STATE_MACHINE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this,
					StateMachinePackage.STATE_MACHINE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StateMachinePackage.STATE_MACHINE__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
		case StateMachinePackage.STATE_MACHINE__TRANSITIONS:
			return ((InternalEList<?>) getTransitions()).basicRemove(otherEnd, msgs);
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
		case StateMachinePackage.STATE_MACHINE__EVENTS:
			return getEvents();
		case StateMachinePackage.STATE_MACHINE__TRANSITIONS:
			return getTransitions();
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
		case StateMachinePackage.STATE_MACHINE__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends Event>) newValue);
			return;
		case StateMachinePackage.STATE_MACHINE__TRANSITIONS:
			getTransitions().clear();
			getTransitions().addAll((Collection<? extends Transition>) newValue);
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
		case StateMachinePackage.STATE_MACHINE__EVENTS:
			getEvents().clear();
			return;
		case StateMachinePackage.STATE_MACHINE__TRANSITIONS:
			getTransitions().clear();
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
		case StateMachinePackage.STATE_MACHINE__EVENTS:
			return events != null && !events.isEmpty();
		case StateMachinePackage.STATE_MACHINE__TRANSITIONS:
			return transitions != null && !transitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateMachineImpl
