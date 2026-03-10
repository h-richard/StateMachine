/**
 */
package stateMachine.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import stateMachine.CompositeState;
import stateMachine.Event;
import stateMachine.HistoryState;
import stateMachine.InitialState;
import stateMachine.PseudoState;
import stateMachine.State;
import stateMachine.StateMachine;
import stateMachine.StateMachineFactory;
import stateMachine.StateMachinePackage;
import stateMachine.Transition;
import stateMachine.Xmod_Action;
import stateMachine.Xmod_Element;
import stateMachine.Xmod_Exception;
import stateMachine.Xmod_ExceptionKind;
import stateMachine.Xmod_ExceptionReaction;
import stateMachine.Xmod_Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateMachinePackageImpl extends EPackageImpl implements StateMachinePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudoStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmod_ExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmod_ActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmod_OperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmod_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xmod_ExceptionReactionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xmod_ExceptionKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see stateMachine.StateMachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StateMachinePackageImpl() {
		super(eNS_URI, StateMachineFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StateMachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StateMachinePackage init() {
		if (isInited)
			return (StateMachinePackage) EPackage.Registry.INSTANCE.getEPackage(StateMachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStateMachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StateMachinePackageImpl theStateMachinePackage = registeredStateMachinePackage instanceof StateMachinePackageImpl
				? (StateMachinePackageImpl) registeredStateMachinePackage
				: new StateMachinePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theStateMachinePackage.createPackageContents();

		// Initialize created meta-data
		theStateMachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStateMachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StateMachinePackage.eNS_URI, theStateMachinePackage);
		return theStateMachinePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateMachine_Events() {
		return (EReference) stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateMachine_Transitions() {
		return (EReference) stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Container() {
		return (EReference) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Name() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_IsActive() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Actions() {
		return (EReference) stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeState() {
		return compositeStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeState_States() {
		return (EReference) compositeStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeState_InitialState() {
		return (EReference) compositeStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeState_HistoryState() {
		return (EReference) compositeStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPseudoState() {
		return pseudoStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPseudoState_ReferencedState() {
		return (EReference) pseudoStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialState() {
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoryState() {
		return historyStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Event() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Source() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Target() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Actions() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Name() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmod_Exception() {
		return xmod_ExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Exception_Kind() {
		return (EAttribute) xmod_ExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Exception_Filter() {
		return (EAttribute) xmod_ExceptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Exception_Reaction() {
		return (EAttribute) xmod_ExceptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmod_Exception_CalledOperation() {
		return (EReference) xmod_ExceptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmod_Action() {
		return xmod_ActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Action_Name() {
		return (EAttribute) xmod_ActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmod_Action_Operations() {
		return (EReference) xmod_ActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmod_Action__Execute() {
		return xmod_ActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmod_Operation() {
		return xmod_OperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Operation_Name() {
		return (EAttribute) xmod_OperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Operation_ObjectTag() {
		return (EAttribute) xmod_OperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Operation_ParametersTag() {
		return (EAttribute) xmod_OperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Operation_ReturnTag() {
		return (EAttribute) xmod_OperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmod_Operation_Exceptions() {
		return (EReference) xmod_OperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmod_Operation__CallOperation() {
		return xmod_OperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmod_Element() {
		return xmod_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Element_Xmod_id() {
		return (EAttribute) xmod_ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getXmod_ExceptionReaction() {
		return xmod_ExceptionReactionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getXmod_ExceptionKind() {
		return xmod_ExceptionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachineFactory getStateMachineFactory() {
		return (StateMachineFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__EVENTS);
		createEReference(stateMachineEClass, STATE_MACHINE__TRANSITIONS);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__CONTAINER);
		createEAttribute(stateEClass, STATE__NAME);
		createEAttribute(stateEClass, STATE__IS_ACTIVE);
		createEReference(stateEClass, STATE__ACTIONS);

		compositeStateEClass = createEClass(COMPOSITE_STATE);
		createEReference(compositeStateEClass, COMPOSITE_STATE__STATES);
		createEReference(compositeStateEClass, COMPOSITE_STATE__INITIAL_STATE);
		createEReference(compositeStateEClass, COMPOSITE_STATE__HISTORY_STATE);

		pseudoStateEClass = createEClass(PSEUDO_STATE);
		createEReference(pseudoStateEClass, PSEUDO_STATE__REFERENCED_STATE);

		initialStateEClass = createEClass(INITIAL_STATE);

		historyStateEClass = createEClass(HISTORY_STATE);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__EVENT);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__ACTIONS);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);

		xmod_ExceptionEClass = createEClass(XMOD_EXCEPTION);
		createEAttribute(xmod_ExceptionEClass, XMOD_EXCEPTION__KIND);
		createEAttribute(xmod_ExceptionEClass, XMOD_EXCEPTION__FILTER);
		createEAttribute(xmod_ExceptionEClass, XMOD_EXCEPTION__REACTION);
		createEReference(xmod_ExceptionEClass, XMOD_EXCEPTION__CALLED_OPERATION);

		xmod_ActionEClass = createEClass(XMOD_ACTION);
		createEAttribute(xmod_ActionEClass, XMOD_ACTION__NAME);
		createEReference(xmod_ActionEClass, XMOD_ACTION__OPERATIONS);
		createEOperation(xmod_ActionEClass, XMOD_ACTION___EXECUTE);

		xmod_OperationEClass = createEClass(XMOD_OPERATION);
		createEAttribute(xmod_OperationEClass, XMOD_OPERATION__NAME);
		createEAttribute(xmod_OperationEClass, XMOD_OPERATION__OBJECT_TAG);
		createEAttribute(xmod_OperationEClass, XMOD_OPERATION__PARAMETERS_TAG);
		createEAttribute(xmod_OperationEClass, XMOD_OPERATION__RETURN_TAG);
		createEReference(xmod_OperationEClass, XMOD_OPERATION__EXCEPTIONS);
		createEOperation(xmod_OperationEClass, XMOD_OPERATION___CALL_OPERATION);

		xmod_ElementEClass = createEClass(XMOD_ELEMENT);
		createEAttribute(xmod_ElementEClass, XMOD_ELEMENT__XMOD_ID);

		// Create enums
		xmod_ExceptionReactionEEnum = createEEnum(XMOD_EXCEPTION_REACTION);
		xmod_ExceptionKindEEnum = createEEnum(XMOD_EXCEPTION_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stateMachineEClass.getESuperTypes().add(this.getCompositeState());
		compositeStateEClass.getESuperTypes().add(this.getState());
		pseudoStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getPseudoState());
		historyStateEClass.getESuperTypes().add(this.getPseudoState());

		// Initialize classes, features, and operations; add parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Events(), this.getEvent(), null, "events", null, 0, -1, StateMachine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_Transitions(), this.getTransition(), null, "transitions", null, 0, -1,
				StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Container(), this.getCompositeState(), this.getCompositeState_States(), "container",
				null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 1, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_IsActive(), ecorePackage.getEBoolean(), "isActive", "false", 1, 1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Actions(), this.getXmod_Action(), null, "actions", null, 0, -1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeStateEClass, CompositeState.class, "CompositeState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeState_States(), this.getState(), this.getState_Container(), "states", null, 1, -1,
				CompositeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeState_InitialState(), this.getInitialState(), null, "initialState", null, 1, 1,
				CompositeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeState_HistoryState(), this.getHistoryState(), null, "historyState", null, 0, 1,
				CompositeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pseudoStateEClass, PseudoState.class, "PseudoState", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPseudoState_ReferencedState(), this.getState(), null, "referencedState", null, 0, 1,
				PseudoState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(historyStateEClass, HistoryState.class, "HistoryState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Event(), this.getEvent(), null, "event", null, 1, 1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 1, 1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 1, 1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Actions(), this.getXmod_Action(), null, "actions", null, 0, -1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 1, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmod_ExceptionEClass, Xmod_Exception.class, "Xmod_Exception", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmod_Exception_Kind(), this.getXmod_ExceptionKind(), "kind", null, 1, 1, Xmod_Exception.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmod_Exception_Filter(), ecorePackage.getEString(), "filter", null, 0, 1,
				Xmod_Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmod_Exception_Reaction(), this.getXmod_ExceptionReaction(), "reaction", null, 1, 1,
				Xmod_Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getXmod_Exception_CalledOperation(), this.getXmod_Operation(), null, "calledOperation", null, 0,
				1, Xmod_Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmod_ActionEClass, Xmod_Action.class, "Xmod_Action", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmod_Action_Name(), ecorePackage.getEString(), "name", null, 1, 1, Xmod_Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmod_Action_Operations(), this.getXmod_Operation(), null, "operations", null, 1, -1,
				Xmod_Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getXmod_Action__Execute(), this.getXmod_ExceptionReaction(), "execute", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(xmod_OperationEClass, Xmod_Operation.class, "Xmod_Operation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmod_Operation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Xmod_Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmod_Operation_ObjectTag(), ecorePackage.getEString(), "objectTag", null, 1, 1,
				Xmod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmod_Operation_ParametersTag(), ecorePackage.getEString(), "parametersTag", null, 0, -1,
				Xmod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmod_Operation_ReturnTag(), ecorePackage.getEString(), "returnTag", null, 0, 1,
				Xmod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getXmod_Operation_Exceptions(), this.getXmod_Exception(), null, "exceptions", null, 0, -1,
				Xmod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getXmod_Operation__CallOperation(), this.getXmod_Exception(), "callOperation", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(xmod_ElementEClass, Xmod_Element.class, "Xmod_Element", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmod_Element_Xmod_id(), ecorePackage.getEString(), "xmod_id", null, 0, 1, Xmod_Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(xmod_ExceptionReactionEEnum, Xmod_ExceptionReaction.class, "Xmod_ExceptionReaction");
		addEEnumLiteral(xmod_ExceptionReactionEEnum, Xmod_ExceptionReaction.CONTINUE);
		addEEnumLiteral(xmod_ExceptionReactionEEnum, Xmod_ExceptionReaction.SKIP);
		addEEnumLiteral(xmod_ExceptionReactionEEnum, Xmod_ExceptionReaction.EXIT);

		initEEnum(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.class, "Xmod_ExceptionKind");
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.OK);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.UNKNOWN_NAMESPACE);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.OBJECT_NOT_FOUND);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.METHOD_NOT_FOUND);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.PARAMETERS_NOT_MATCHING);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.RETURN_TYPE_NOT_MATCHING);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.METHOD_EXCEPTION);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.OTHER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Xmod_main
		createXmod_mainAnnotations();
		// Xmod_exec
		createXmod_execAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Xmod_main</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXmod_mainAnnotations() {
		String source = "Xmod_main";
		addAnnotation(stateMachineEClass, source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>Xmod_exec</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXmod_execAnnotations() {
		String source = "Xmod_exec";
		addAnnotation(stateEClass, source, new String[] {});
		addAnnotation(transitionEClass, source, new String[] {});
	}

} //StateMachinePackageImpl
