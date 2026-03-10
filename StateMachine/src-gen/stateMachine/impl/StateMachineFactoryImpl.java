/**
 */
package stateMachine.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import stateMachine.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateMachineFactoryImpl extends EFactoryImpl implements StateMachineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateMachineFactory init() {
		try {
			StateMachineFactory theStateMachineFactory = (StateMachineFactory) EPackage.Registry.INSTANCE
					.getEFactory(StateMachinePackage.eNS_URI);
			if (theStateMachineFactory != null) {
				return theStateMachineFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StateMachineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StateMachinePackage.STATE_MACHINE:
			return createStateMachine();
		case StateMachinePackage.STATE:
			return createState();
		case StateMachinePackage.COMPOSITE_STATE:
			return createCompositeState();
		case StateMachinePackage.INITIAL_STATE:
			return createInitialState();
		case StateMachinePackage.HISTORY_STATE:
			return createHistoryState();
		case StateMachinePackage.TRANSITION:
			return createTransition();
		case StateMachinePackage.EVENT:
			return createEvent();
		case StateMachinePackage.XMOD_EXCEPTION:
			return createXmod_Exception();
		case StateMachinePackage.XMOD_ACTION:
			return createXmod_Action();
		case StateMachinePackage.XMOD_OPERATION:
			return createXmod_Operation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case StateMachinePackage.XMOD_EXCEPTION_REACTION:
			return createXmod_ExceptionReactionFromString(eDataType, initialValue);
		case StateMachinePackage.XMOD_EXCEPTION_KIND:
			return createXmod_ExceptionKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case StateMachinePackage.XMOD_EXCEPTION_REACTION:
			return convertXmod_ExceptionReactionToString(eDataType, instanceValue);
		case StateMachinePackage.XMOD_EXCEPTION_KIND:
			return convertXmod_ExceptionKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeState createCompositeState() {
		CompositeStateImpl compositeState = new CompositeStateImpl();
		return compositeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryState createHistoryState() {
		HistoryStateImpl historyState = new HistoryStateImpl();
		return historyState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Xmod_Exception createXmod_Exception() {
		Xmod_ExceptionImpl xmod_Exception = new Xmod_ExceptionImpl();
		return xmod_Exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Xmod_Action createXmod_Action() {
		Xmod_ActionImpl xmod_Action = new Xmod_ActionImpl();
		return xmod_Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Xmod_Operation createXmod_Operation() {
		Xmod_OperationImpl xmod_Operation = new Xmod_OperationImpl();
		return xmod_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmod_ExceptionReaction createXmod_ExceptionReactionFromString(EDataType eDataType, String initialValue) {
		Xmod_ExceptionReaction result = Xmod_ExceptionReaction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXmod_ExceptionReactionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmod_ExceptionKind createXmod_ExceptionKindFromString(EDataType eDataType, String initialValue) {
		Xmod_ExceptionKind result = Xmod_ExceptionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXmod_ExceptionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachinePackage getStateMachinePackage() {
		return (StateMachinePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StateMachinePackage getPackage() {
		return StateMachinePackage.eINSTANCE;
	}

} //StateMachineFactoryImpl
