/**
 */
package stateMachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see stateMachine.StateMachineFactory
 * @model kind="package"
 * @generated
 */
public interface StateMachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stateMachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/stateMachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stateMachine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachinePackage eINSTANCE = stateMachine.impl.StateMachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link stateMachine.impl.Xmod_ElementImpl <em>Xmod Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.impl.Xmod_ElementImpl
	 * @see stateMachine.impl.StateMachinePackageImpl#getXmod_Element()
	 * @generated
	 */
	int XMOD_ELEMENT = 11;

	/**
	 * The meta object id for the '{@link stateMachine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.impl.StateImpl
	 * @see stateMachine.impl.StateMachinePackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_ACTIVE = 2;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIONS = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stateMachine.impl.CompositeStateImpl <em>Composite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.impl.CompositeStateImpl
	 * @see stateMachine.impl.StateMachinePackageImpl#getCompositeState()
	 * @generated
	 */
	int COMPOSITE_STATE = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__CONTAINER = STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__IS_ACTIVE = STATE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__ACTIONS = STATE__ACTIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__STATES = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__INITIAL_STATE = STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>History State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__HISTORY_STATE = STATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stateMachine.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.impl.StateMachineImpl
	 * @see stateMachine.impl.StateMachinePackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CONTAINER = COMPOSITE_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = COMPOSITE_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__IS_ACTIVE = COMPOSITE_STATE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__ACTIONS = COMPOSITE_STATE__ACTIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = COMPOSITE_STATE__STATES;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__INITIAL_STATE = COMPOSITE_STATE__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>History State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__HISTORY_STATE = COMPOSITE_STATE__HISTORY_STATE;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__EVENTS = COMPOSITE_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TRANSITIONS = COMPOSITE_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = COMPOSITE_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = COMPOSITE_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stateMachine.impl.PseudoStateImpl <em>Pseudo State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.impl.PseudoStateImpl
	 * @see stateMachine.impl.StateMachinePackageImpl#getPseudoState()
	 * @generated
	 */
	int PSEUDO_STATE = 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__CONTAINER = STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__IS_ACTIVE = STATE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__ACTIONS = STATE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__REFERENCED_STATE = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pseudo State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pseudo State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stateMachine.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.impl.InitialStateImpl
	 * @see stateMachine.impl.StateMachinePackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 4;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__CONTAINER = PSEUDO_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = PSEUDO_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__IS_ACTIVE = PSEUDO_STATE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ACTIONS = PSEUDO_STATE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__REFERENCED_STATE = PSEUDO_STATE__REFERENCED_STATE;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stateMachine.impl.HistoryStateImpl <em>History State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.impl.HistoryStateImpl
	 * @see stateMachine.impl.StateMachinePackageImpl#getHistoryState()
	 * @generated
	 */
	int HISTORY_STATE = 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__CONTAINER = PSEUDO_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__NAME = PSEUDO_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__IS_ACTIVE = PSEUDO_STATE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__ACTIONS = PSEUDO_STATE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__REFERENCED_STATE = PSEUDO_STATE__REFERENCED_STATE;

	/**
	 * The number of structural features of the '<em>History State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>History State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stateMachine.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.impl.TransitionImpl
	 * @see stateMachine.impl.StateMachinePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTIONS = 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stateMachine.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.impl.EventImpl
	 * @see stateMachine.impl.StateMachinePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stateMachine.impl.Xmod_ExceptionImpl <em>Xmod Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.impl.Xmod_ExceptionImpl
	 * @see stateMachine.impl.StateMachinePackageImpl#getXmod_Exception()
	 * @generated
	 */
	int XMOD_EXCEPTION = 8;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION__KIND = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION__FILTER = 1;

	/**
	 * The feature id for the '<em><b>Reaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION__REACTION = 2;

	/**
	 * The feature id for the '<em><b>Called Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION__CALLED_OPERATION = 3;

	/**
	 * The number of structural features of the '<em>Xmod Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Xmod Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stateMachine.impl.Xmod_ActionImpl <em>Xmod Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.impl.Xmod_ActionImpl
	 * @see stateMachine.impl.StateMachinePackageImpl#getXmod_Action()
	 * @generated
	 */
	int XMOD_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION__OPERATIONS = 1;

	/**
	 * The number of structural features of the '<em>Xmod Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Xmod Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link stateMachine.impl.Xmod_OperationImpl <em>Xmod Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.impl.Xmod_OperationImpl
	 * @see stateMachine.impl.StateMachinePackageImpl#getXmod_Operation()
	 * @generated
	 */
	int XMOD_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Object Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION__OBJECT_TAG = 1;

	/**
	 * The feature id for the '<em><b>Parameters Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION__PARAMETERS_TAG = 2;

	/**
	 * The feature id for the '<em><b>Return Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION__RETURN_TAG = 3;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION__EXCEPTIONS = 4;

	/**
	 * The number of structural features of the '<em>Xmod Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Call Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION___CALL_OPERATION = 0;

	/**
	 * The number of operations of the '<em>Xmod Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Xmod id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ELEMENT__XMOD_ID = 0;

	/**
	 * The number of structural features of the '<em>Xmod Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Xmod Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stateMachine.Xmod_ExceptionReaction <em>Xmod Exception Reaction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.Xmod_ExceptionReaction
	 * @see stateMachine.impl.StateMachinePackageImpl#getXmod_ExceptionReaction()
	 * @generated
	 */
	int XMOD_EXCEPTION_REACTION = 12;

	/**
	 * The meta object id for the '{@link stateMachine.Xmod_ExceptionKind <em>Xmod Exception Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachine.Xmod_ExceptionKind
	 * @see stateMachine.impl.StateMachinePackageImpl#getXmod_ExceptionKind()
	 * @generated
	 */
	int XMOD_EXCEPTION_KIND = 13;

	/**
	 * Returns the meta object for class '{@link stateMachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see stateMachine.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link stateMachine.StateMachine#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see stateMachine.StateMachine#getEvents()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link stateMachine.StateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see stateMachine.StateMachine#getTransitions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Transitions();

	/**
	 * Returns the meta object for class '{@link stateMachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see stateMachine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the container reference '{@link stateMachine.State#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see stateMachine.State#getContainer()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Container();

	/**
	 * Returns the meta object for the attribute '{@link stateMachine.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see stateMachine.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link stateMachine.State#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see stateMachine.State#isIsActive()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsActive();

	/**
	 * Returns the meta object for the containment reference list '{@link stateMachine.State#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see stateMachine.State#getActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Actions();

	/**
	 * Returns the meta object for class '{@link stateMachine.CompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite State</em>'.
	 * @see stateMachine.CompositeState
	 * @generated
	 */
	EClass getCompositeState();

	/**
	 * Returns the meta object for the containment reference list '{@link stateMachine.CompositeState#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see stateMachine.CompositeState#getStates()
	 * @see #getCompositeState()
	 * @generated
	 */
	EReference getCompositeState_States();

	/**
	 * Returns the meta object for the reference '{@link stateMachine.CompositeState#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see stateMachine.CompositeState#getInitialState()
	 * @see #getCompositeState()
	 * @generated
	 */
	EReference getCompositeState_InitialState();

	/**
	 * Returns the meta object for the reference '{@link stateMachine.CompositeState#getHistoryState <em>History State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>History State</em>'.
	 * @see stateMachine.CompositeState#getHistoryState()
	 * @see #getCompositeState()
	 * @generated
	 */
	EReference getCompositeState_HistoryState();

	/**
	 * Returns the meta object for class '{@link stateMachine.PseudoState <em>Pseudo State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo State</em>'.
	 * @see stateMachine.PseudoState
	 * @generated
	 */
	EClass getPseudoState();

	/**
	 * Returns the meta object for the reference '{@link stateMachine.PseudoState#getReferencedState <em>Referenced State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced State</em>'.
	 * @see stateMachine.PseudoState#getReferencedState()
	 * @see #getPseudoState()
	 * @generated
	 */
	EReference getPseudoState_ReferencedState();

	/**
	 * Returns the meta object for class '{@link stateMachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see stateMachine.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link stateMachine.HistoryState <em>History State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History State</em>'.
	 * @see stateMachine.HistoryState
	 * @generated
	 */
	EClass getHistoryState();

	/**
	 * Returns the meta object for class '{@link stateMachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see stateMachine.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link stateMachine.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see stateMachine.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Event();

	/**
	 * Returns the meta object for the reference '{@link stateMachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see stateMachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link stateMachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see stateMachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link stateMachine.Transition#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see stateMachine.Transition#getActions()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Actions();

	/**
	 * Returns the meta object for class '{@link stateMachine.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see stateMachine.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link stateMachine.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see stateMachine.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link stateMachine.Xmod_Exception <em>Xmod Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xmod Exception</em>'.
	 * @see stateMachine.Xmod_Exception
	 * @generated
	 */
	EClass getXmod_Exception();

	/**
	 * Returns the meta object for the attribute '{@link stateMachine.Xmod_Exception#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see stateMachine.Xmod_Exception#getKind()
	 * @see #getXmod_Exception()
	 * @generated
	 */
	EAttribute getXmod_Exception_Kind();

	/**
	 * Returns the meta object for the attribute '{@link stateMachine.Xmod_Exception#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see stateMachine.Xmod_Exception#getFilter()
	 * @see #getXmod_Exception()
	 * @generated
	 */
	EAttribute getXmod_Exception_Filter();

	/**
	 * Returns the meta object for the attribute '{@link stateMachine.Xmod_Exception#getReaction <em>Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reaction</em>'.
	 * @see stateMachine.Xmod_Exception#getReaction()
	 * @see #getXmod_Exception()
	 * @generated
	 */
	EAttribute getXmod_Exception_Reaction();

	/**
	 * Returns the meta object for the containment reference '{@link stateMachine.Xmod_Exception#getCalledOperation <em>Called Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Called Operation</em>'.
	 * @see stateMachine.Xmod_Exception#getCalledOperation()
	 * @see #getXmod_Exception()
	 * @generated
	 */
	EReference getXmod_Exception_CalledOperation();

	/**
	 * Returns the meta object for class '{@link stateMachine.Xmod_Action <em>Xmod Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xmod Action</em>'.
	 * @see stateMachine.Xmod_Action
	 * @generated
	 */
	EClass getXmod_Action();

	/**
	 * Returns the meta object for the attribute '{@link stateMachine.Xmod_Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see stateMachine.Xmod_Action#getName()
	 * @see #getXmod_Action()
	 * @generated
	 */
	EAttribute getXmod_Action_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link stateMachine.Xmod_Action#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see stateMachine.Xmod_Action#getOperations()
	 * @see #getXmod_Action()
	 * @generated
	 */
	EReference getXmod_Action_Operations();

	/**
	 * Returns the meta object for the '{@link stateMachine.Xmod_Action#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see stateMachine.Xmod_Action#execute()
	 * @generated
	 */
	EOperation getXmod_Action__Execute();

	/**
	 * Returns the meta object for class '{@link stateMachine.Xmod_Operation <em>Xmod Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xmod Operation</em>'.
	 * @see stateMachine.Xmod_Operation
	 * @generated
	 */
	EClass getXmod_Operation();

	/**
	 * Returns the meta object for the attribute '{@link stateMachine.Xmod_Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see stateMachine.Xmod_Operation#getName()
	 * @see #getXmod_Operation()
	 * @generated
	 */
	EAttribute getXmod_Operation_Name();

	/**
	 * Returns the meta object for the attribute '{@link stateMachine.Xmod_Operation#getObjectTag <em>Object Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Tag</em>'.
	 * @see stateMachine.Xmod_Operation#getObjectTag()
	 * @see #getXmod_Operation()
	 * @generated
	 */
	EAttribute getXmod_Operation_ObjectTag();

	/**
	 * Returns the meta object for the attribute list '{@link stateMachine.Xmod_Operation#getParametersTag <em>Parameters Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters Tag</em>'.
	 * @see stateMachine.Xmod_Operation#getParametersTag()
	 * @see #getXmod_Operation()
	 * @generated
	 */
	EAttribute getXmod_Operation_ParametersTag();

	/**
	 * Returns the meta object for the attribute '{@link stateMachine.Xmod_Operation#getReturnTag <em>Return Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Tag</em>'.
	 * @see stateMachine.Xmod_Operation#getReturnTag()
	 * @see #getXmod_Operation()
	 * @generated
	 */
	EAttribute getXmod_Operation_ReturnTag();

	/**
	 * Returns the meta object for the containment reference list '{@link stateMachine.Xmod_Operation#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see stateMachine.Xmod_Operation#getExceptions()
	 * @see #getXmod_Operation()
	 * @generated
	 */
	EReference getXmod_Operation_Exceptions();

	/**
	 * Returns the meta object for the '{@link stateMachine.Xmod_Operation#callOperation() <em>Call Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Operation</em>' operation.
	 * @see stateMachine.Xmod_Operation#callOperation()
	 * @generated
	 */
	EOperation getXmod_Operation__CallOperation();

	/**
	 * Returns the meta object for class '{@link stateMachine.Xmod_Element <em>Xmod Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xmod Element</em>'.
	 * @see stateMachine.Xmod_Element
	 * @generated
	 */
	EClass getXmod_Element();

	/**
	 * Returns the meta object for the attribute '{@link stateMachine.Xmod_Element#getXmod_id <em>Xmod id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmod id</em>'.
	 * @see stateMachine.Xmod_Element#getXmod_id()
	 * @see #getXmod_Element()
	 * @generated
	 */
	EAttribute getXmod_Element_Xmod_id();

	/**
	 * Returns the meta object for enum '{@link stateMachine.Xmod_ExceptionReaction <em>Xmod Exception Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Xmod Exception Reaction</em>'.
	 * @see stateMachine.Xmod_ExceptionReaction
	 * @generated
	 */
	EEnum getXmod_ExceptionReaction();

	/**
	 * Returns the meta object for enum '{@link stateMachine.Xmod_ExceptionKind <em>Xmod Exception Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Xmod Exception Kind</em>'.
	 * @see stateMachine.Xmod_ExceptionKind
	 * @generated
	 */
	EEnum getXmod_ExceptionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateMachineFactory getStateMachineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link stateMachine.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.impl.StateMachineImpl
		 * @see stateMachine.impl.StateMachinePackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__EVENTS = eINSTANCE.getStateMachine_Events();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__TRANSITIONS = eINSTANCE.getStateMachine_Transitions();

		/**
		 * The meta object literal for the '{@link stateMachine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.impl.StateImpl
		 * @see stateMachine.impl.StateMachinePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CONTAINER = eINSTANCE.getState_Container();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_ACTIVE = eINSTANCE.getState_IsActive();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

		/**
		 * The meta object literal for the '{@link stateMachine.impl.CompositeStateImpl <em>Composite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.impl.CompositeStateImpl
		 * @see stateMachine.impl.StateMachinePackageImpl#getCompositeState()
		 * @generated
		 */
		EClass COMPOSITE_STATE = eINSTANCE.getCompositeState();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATE__STATES = eINSTANCE.getCompositeState_States();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATE__INITIAL_STATE = eINSTANCE.getCompositeState_InitialState();

		/**
		 * The meta object literal for the '<em><b>History State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATE__HISTORY_STATE = eINSTANCE.getCompositeState_HistoryState();

		/**
		 * The meta object literal for the '{@link stateMachine.impl.PseudoStateImpl <em>Pseudo State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.impl.PseudoStateImpl
		 * @see stateMachine.impl.StateMachinePackageImpl#getPseudoState()
		 * @generated
		 */
		EClass PSEUDO_STATE = eINSTANCE.getPseudoState();

		/**
		 * The meta object literal for the '<em><b>Referenced State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSEUDO_STATE__REFERENCED_STATE = eINSTANCE.getPseudoState_ReferencedState();

		/**
		 * The meta object literal for the '{@link stateMachine.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.impl.InitialStateImpl
		 * @see stateMachine.impl.StateMachinePackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link stateMachine.impl.HistoryStateImpl <em>History State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.impl.HistoryStateImpl
		 * @see stateMachine.impl.StateMachinePackageImpl#getHistoryState()
		 * @generated
		 */
		EClass HISTORY_STATE = eINSTANCE.getHistoryState();

		/**
		 * The meta object literal for the '{@link stateMachine.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.impl.TransitionImpl
		 * @see stateMachine.impl.StateMachinePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ACTIONS = eINSTANCE.getTransition_Actions();

		/**
		 * The meta object literal for the '{@link stateMachine.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.impl.EventImpl
		 * @see stateMachine.impl.StateMachinePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link stateMachine.impl.Xmod_ExceptionImpl <em>Xmod Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.impl.Xmod_ExceptionImpl
		 * @see stateMachine.impl.StateMachinePackageImpl#getXmod_Exception()
		 * @generated
		 */
		EClass XMOD_EXCEPTION = eINSTANCE.getXmod_Exception();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_EXCEPTION__KIND = eINSTANCE.getXmod_Exception_Kind();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_EXCEPTION__FILTER = eINSTANCE.getXmod_Exception_Filter();

		/**
		 * The meta object literal for the '<em><b>Reaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_EXCEPTION__REACTION = eINSTANCE.getXmod_Exception_Reaction();

		/**
		 * The meta object literal for the '<em><b>Called Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMOD_EXCEPTION__CALLED_OPERATION = eINSTANCE.getXmod_Exception_CalledOperation();

		/**
		 * The meta object literal for the '{@link stateMachine.impl.Xmod_ActionImpl <em>Xmod Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.impl.Xmod_ActionImpl
		 * @see stateMachine.impl.StateMachinePackageImpl#getXmod_Action()
		 * @generated
		 */
		EClass XMOD_ACTION = eINSTANCE.getXmod_Action();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_ACTION__NAME = eINSTANCE.getXmod_Action_Name();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMOD_ACTION__OPERATIONS = eINSTANCE.getXmod_Action_Operations();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XMOD_ACTION___EXECUTE = eINSTANCE.getXmod_Action__Execute();

		/**
		 * The meta object literal for the '{@link stateMachine.impl.Xmod_OperationImpl <em>Xmod Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.impl.Xmod_OperationImpl
		 * @see stateMachine.impl.StateMachinePackageImpl#getXmod_Operation()
		 * @generated
		 */
		EClass XMOD_OPERATION = eINSTANCE.getXmod_Operation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_OPERATION__NAME = eINSTANCE.getXmod_Operation_Name();

		/**
		 * The meta object literal for the '<em><b>Object Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_OPERATION__OBJECT_TAG = eINSTANCE.getXmod_Operation_ObjectTag();

		/**
		 * The meta object literal for the '<em><b>Parameters Tag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_OPERATION__PARAMETERS_TAG = eINSTANCE.getXmod_Operation_ParametersTag();

		/**
		 * The meta object literal for the '<em><b>Return Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_OPERATION__RETURN_TAG = eINSTANCE.getXmod_Operation_ReturnTag();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMOD_OPERATION__EXCEPTIONS = eINSTANCE.getXmod_Operation_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Call Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XMOD_OPERATION___CALL_OPERATION = eINSTANCE.getXmod_Operation__CallOperation();

		/**
		 * The meta object literal for the '{@link stateMachine.impl.Xmod_ElementImpl <em>Xmod Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.impl.Xmod_ElementImpl
		 * @see stateMachine.impl.StateMachinePackageImpl#getXmod_Element()
		 * @generated
		 */
		EClass XMOD_ELEMENT = eINSTANCE.getXmod_Element();

		/**
		 * The meta object literal for the '<em><b>Xmod id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_ELEMENT__XMOD_ID = eINSTANCE.getXmod_Element_Xmod_id();

		/**
		 * The meta object literal for the '{@link stateMachine.Xmod_ExceptionReaction <em>Xmod Exception Reaction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.Xmod_ExceptionReaction
		 * @see stateMachine.impl.StateMachinePackageImpl#getXmod_ExceptionReaction()
		 * @generated
		 */
		EEnum XMOD_EXCEPTION_REACTION = eINSTANCE.getXmod_ExceptionReaction();

		/**
		 * The meta object literal for the '{@link stateMachine.Xmod_ExceptionKind <em>Xmod Exception Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachine.Xmod_ExceptionKind
		 * @see stateMachine.impl.StateMachinePackageImpl#getXmod_ExceptionKind()
		 * @generated
		 */
		EEnum XMOD_EXCEPTION_KIND = eINSTANCE.getXmod_ExceptionKind();

	}

} //StateMachinePackage
