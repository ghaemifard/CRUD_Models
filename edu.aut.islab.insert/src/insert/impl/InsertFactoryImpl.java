/**
 */
package insert.impl;

import insert.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InsertFactoryImpl extends EFactoryImpl implements InsertFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InsertFactory init() {
		try {
			InsertFactory theInsertFactory = (InsertFactory)EPackage.Registry.INSTANCE.getEFactory(InsertPackage.eNS_URI);
			if (theInsertFactory != null) {
				return theInsertFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InsertFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertFactoryImpl() {
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
			case InsertPackage.INSERT_SURFACE: return createInsertSurface();
			case InsertPackage.PREPARE_LIST: return createPrepareList();
			case InsertPackage.INPUT_INSTALMENT: return createInputInstalment();
			case InsertPackage.TABLE: return createTable();
			case InsertPackage.FIELD: return createField();
			case InsertPackage.LITERAL: return createLiteral();
			case InsertPackage.NULL_LITERAL: return createNullLiteral();
			case InsertPackage.FUNCTION: return createFunction();
			case InsertPackage.FUNCTION_DEF: return createFunctionDef();
			case InsertPackage.INPUT: return createInput();
			case InsertPackage.INPUT_STRING_DEF: return createInputStringDef();
			case InsertPackage.INPUT_INT_DEF: return createInputIntDef();
			case InsertPackage.INPUT_DATE_DEF: return createInputDateDef();
			case InsertPackage.INPUT_BITS_DEF: return createInputBitsDef();
			case InsertPackage.INPUT_FLOAT_DEF: return createInputFloatDef();
			case InsertPackage.CALL_SURFACE_QUERY: return createCallSurfaceQuery();
			case InsertPackage.TYPE: return createType();
			case InsertPackage.SUBTYPE: return createSubtype();
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
			case InsertPackage.LITERAL_TYPE:
				return createLiteralTypeFromString(eDataType, initialValue);
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
			case InsertPackage.LITERAL_TYPE:
				return convertLiteralTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertSurface createInsertSurface() {
		InsertSurfaceImpl insertSurface = new InsertSurfaceImpl();
		return insertSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrepareList createPrepareList() {
		PrepareListImpl prepareList = new PrepareListImpl();
		return prepareList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputInstalment createInputInstalment() {
		InputInstalmentImpl inputInstalment = new InputInstalmentImpl();
		return inputInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteral createNullLiteral() {
		NullLiteralImpl nullLiteral = new NullLiteralImpl();
		return nullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDef createFunctionDef() {
		FunctionDefImpl functionDef = new FunctionDefImpl();
		return functionDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStringDef createInputStringDef() {
		InputStringDefImpl inputStringDef = new InputStringDefImpl();
		return inputStringDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputIntDef createInputIntDef() {
		InputIntDefImpl inputIntDef = new InputIntDefImpl();
		return inputIntDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDateDef createInputDateDef() {
		InputDateDefImpl inputDateDef = new InputDateDefImpl();
		return inputDateDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBitsDef createInputBitsDef() {
		InputBitsDefImpl inputBitsDef = new InputBitsDefImpl();
		return inputBitsDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFloatDef createInputFloatDef() {
		InputFloatDefImpl inputFloatDef = new InputFloatDefImpl();
		return inputFloatDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallSurfaceQuery createCallSurfaceQuery() {
		CallSurfaceQueryImpl callSurfaceQuery = new CallSurfaceQueryImpl();
		return callSurfaceQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtype createSubtype() {
		SubtypeImpl subtype = new SubtypeImpl();
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralType createLiteralTypeFromString(EDataType eDataType, String initialValue) {
		LiteralType result = LiteralType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLiteralTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertPackage getInsertPackage() {
		return (InsertPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InsertPackage getPackage() {
		return InsertPackage.eINSTANCE;
	}

} //InsertFactoryImpl
