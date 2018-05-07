/**
 */
package delete.impl;

import delete.*;

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
public class DeleteFactoryImpl extends EFactoryImpl implements DeleteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeleteFactory init() {
		try {
			DeleteFactory theDeleteFactory = (DeleteFactory)EPackage.Registry.INSTANCE.getEFactory(DeletePackage.eNS_URI);
			if (theDeleteFactory != null) {
				return theDeleteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeleteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteFactoryImpl() {
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
			case DeletePackage.DELETE_SURFACE: return createDeleteSurface();
			case DeletePackage.CONDITION_INSTALMENT: return createConditionInstalment();
			case DeletePackage.DUMMY: return createDummy();
			case DeletePackage.TABLE_LIST_INSTALMENT: return createTableListInstalment();
			case DeletePackage.INNERJOIN_RELS: return createInnerjoinRels();
			case DeletePackage.LEFT_OUTER_JOIN_RELS: return createLeftOuterJoinRels();
			case DeletePackage.RIGHT_OUTER_JOIN_RELS: return createRightOuterJoinRels();
			case DeletePackage.FULL_OUTER_JOIN_RELS: return createFullOuterJoinRels();
			case DeletePackage.INPUT_INSTALMENT: return createInputInstalment();
			case DeletePackage.SORT_INSTALMENT: return createSortInstalment();
			case DeletePackage.FIELD_SPOINTER: return createFieldSPointer();
			case DeletePackage.MY_TABLE: return createMyTable();
			case DeletePackage.FIELD: return createField();
			case DeletePackage.LITERAL: return createLiteral();
			case DeletePackage.NULL_LITERAL: return createNullLiteral();
			case DeletePackage.FUNCTION: return createFunction();
			case DeletePackage.FUNCTION_DEF: return createFunctionDef();
			case DeletePackage.INPUT: return createInput();
			case DeletePackage.INPUT_STRING_DEF: return createInputStringDef();
			case DeletePackage.INPUT_INT_DEF: return createInputIntDef();
			case DeletePackage.INPUT_DATE_DEF: return createInputDateDef();
			case DeletePackage.INPUT_BITS_DEF: return createInputBitsDef();
			case DeletePackage.INPUT_FLOAT_DEF: return createInputFloatDef();
			case DeletePackage.CALL_SURFACE_QUERY: return createCallSurfaceQuery();
			case DeletePackage.TYPE: return createType();
			case DeletePackage.SUBTYPE: return createSubtype();
			case DeletePackage.JUNCTION: return createJunction();
			case DeletePackage.ROOT_JUNCTION: return createRootJunction();
			case DeletePackage.JUNC_RELATIONSHIP: return createJuncRelationship();
			case DeletePackage.TERM: return createTerm();
			case DeletePackage.EQUAL_LINK: return createEqualLink();
			case DeletePackage.GREATER_THAN_LINK: return createGreaterThanLink();
			case DeletePackage.GREATER_EQUAL_THAN_LINK: return createGreaterEqualThanLink();
			case DeletePackage.LOWER_THAN_LINK: return createLowerThanLink();
			case DeletePackage.LOWER_EQUAL_THAN_LINK: return createLowerEqualThanLink();
			case DeletePackage.IN_LINK: return createInLink();
			case DeletePackage.LIKE_LINK: return createLikeLink();
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
			case DeletePackage.RELATION_SELECT_OPERATION_TYPE:
				return createRelationSelectOperationTypeFromString(eDataType, initialValue);
			case DeletePackage.RELATION_SELECT_TYPE:
				return createRelationSelectTypeFromString(eDataType, initialValue);
			case DeletePackage.SORT_TYPE:
				return createSortTypeFromString(eDataType, initialValue);
			case DeletePackage.LITERAL_TYPE:
				return createLiteralTypeFromString(eDataType, initialValue);
			case DeletePackage.JUNC_TYPE:
				return createJuncTypeFromString(eDataType, initialValue);
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
			case DeletePackage.RELATION_SELECT_OPERATION_TYPE:
				return convertRelationSelectOperationTypeToString(eDataType, instanceValue);
			case DeletePackage.RELATION_SELECT_TYPE:
				return convertRelationSelectTypeToString(eDataType, instanceValue);
			case DeletePackage.SORT_TYPE:
				return convertSortTypeToString(eDataType, instanceValue);
			case DeletePackage.LITERAL_TYPE:
				return convertLiteralTypeToString(eDataType, instanceValue);
			case DeletePackage.JUNC_TYPE:
				return convertJuncTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteSurface createDeleteSurface() {
		DeleteSurfaceImpl deleteSurface = new DeleteSurfaceImpl();
		return deleteSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionInstalment createConditionInstalment() {
		ConditionInstalmentImpl conditionInstalment = new ConditionInstalmentImpl();
		return conditionInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dummy createDummy() {
		DummyImpl dummy = new DummyImpl();
		return dummy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableListInstalment createTableListInstalment() {
		TableListInstalmentImpl tableListInstalment = new TableListInstalmentImpl();
		return tableListInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerjoinRels createInnerjoinRels() {
		InnerjoinRelsImpl innerjoinRels = new InnerjoinRelsImpl();
		return innerjoinRels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftOuterJoinRels createLeftOuterJoinRels() {
		LeftOuterJoinRelsImpl leftOuterJoinRels = new LeftOuterJoinRelsImpl();
		return leftOuterJoinRels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightOuterJoinRels createRightOuterJoinRels() {
		RightOuterJoinRelsImpl rightOuterJoinRels = new RightOuterJoinRelsImpl();
		return rightOuterJoinRels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullOuterJoinRels createFullOuterJoinRels() {
		FullOuterJoinRelsImpl fullOuterJoinRels = new FullOuterJoinRelsImpl();
		return fullOuterJoinRels;
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
	public SortInstalment createSortInstalment() {
		SortInstalmentImpl sortInstalment = new SortInstalmentImpl();
		return sortInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldSPointer createFieldSPointer() {
		FieldSPointerImpl fieldSPointer = new FieldSPointerImpl();
		return fieldSPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyTable createMyTable() {
		MyTableImpl myTable = new MyTableImpl();
		return myTable;
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
	public Junction createJunction() {
		JunctionImpl junction = new JunctionImpl();
		return junction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootJunction createRootJunction() {
		RootJunctionImpl rootJunction = new RootJunctionImpl();
		return rootJunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JuncRelationship createJuncRelationship() {
		JuncRelationshipImpl juncRelationship = new JuncRelationshipImpl();
		return juncRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualLink createEqualLink() {
		EqualLinkImpl equalLink = new EqualLinkImpl();
		return equalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThanLink createGreaterThanLink() {
		GreaterThanLinkImpl greaterThanLink = new GreaterThanLinkImpl();
		return greaterThanLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterEqualThanLink createGreaterEqualThanLink() {
		GreaterEqualThanLinkImpl greaterEqualThanLink = new GreaterEqualThanLinkImpl();
		return greaterEqualThanLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerThanLink createLowerThanLink() {
		LowerThanLinkImpl lowerThanLink = new LowerThanLinkImpl();
		return lowerThanLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerEqualThanLink createLowerEqualThanLink() {
		LowerEqualThanLinkImpl lowerEqualThanLink = new LowerEqualThanLinkImpl();
		return lowerEqualThanLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InLink createInLink() {
		InLinkImpl inLink = new InLinkImpl();
		return inLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LikeLink createLikeLink() {
		LikeLinkImpl likeLink = new LikeLinkImpl();
		return likeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationSelectOperationType createRelationSelectOperationTypeFromString(EDataType eDataType, String initialValue) {
		RelationSelectOperationType result = RelationSelectOperationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationSelectOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationSelectType createRelationSelectTypeFromString(EDataType eDataType, String initialValue) {
		RelationSelectType result = RelationSelectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationSelectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortType createSortTypeFromString(EDataType eDataType, String initialValue) {
		SortType result = SortType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public JuncType createJuncTypeFromString(EDataType eDataType, String initialValue) {
		JuncType result = JuncType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJuncTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletePackage getDeletePackage() {
		return (DeletePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeletePackage getPackage() {
		return DeletePackage.eINSTANCE;
	}

} //DeleteFactoryImpl
