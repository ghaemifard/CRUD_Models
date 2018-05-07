/**
 */
package query.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import query.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryFactoryImpl extends EFactoryImpl implements QueryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QueryFactory init() {
		try {
			QueryFactory theQueryFactory = (QueryFactory)EPackage.Registry.INSTANCE.getEFactory(QueryPackage.eNS_URI);
			if (theQueryFactory != null) {
				return theQueryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QueryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFactoryImpl() {
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
			case QueryPackage.QUERY_SURFACE: return createQuerySurface();
			case QueryPackage.OUTPUT_INSTALMENT: return createOutputInstalment();
			case QueryPackage.INPUT_INSTALMENT: return createInputInstalment();
			case QueryPackage.SORT_INSTALMENT: return createSortInstalment();
			case QueryPackage.GROUP_INSTALMENT: return createGroupInstalment();
			case QueryPackage.WHERE_INSTALMENT: return createWhereInstalment();
			case QueryPackage.HAVING_INSTALMENT: return createHavingInstalment();
			case QueryPackage.INNERJOIN_RELS: return createInnerjoinRels();
			case QueryPackage.LEFT_OUTER_JOIN_RELS: return createLeftOuterJoinRels();
			case QueryPackage.RIGHT_OUTER_JOIN_RELS: return createRightOuterJoinRels();
			case QueryPackage.FULL_OUTER_JOIN_RELS: return createFullOuterJoinRels();
			case QueryPackage.FIELD_GPOINTER: return createFieldGPointer();
			case QueryPackage.FIELD_SPOINTER: return createFieldSPointer();
			case QueryPackage.MY_TABLE: return createMyTable();
			case QueryPackage.FIELD: return createField();
			case QueryPackage.LITERAL: return createLiteral();
			case QueryPackage.NULL_LITERAL: return createNullLiteral();
			case QueryPackage.FUNCTION: return createFunction();
			case QueryPackage.FUNCTION_DEF: return createFunctionDef();
			case QueryPackage.INPUT: return createInput();
			case QueryPackage.INPUT_STRING_DEF: return createInputStringDef();
			case QueryPackage.INPUT_INT_DEF: return createInputIntDef();
			case QueryPackage.INPUT_DATE_DEF: return createInputDateDef();
			case QueryPackage.INPUT_BITS_DEF: return createInputBitsDef();
			case QueryPackage.INPUT_FLOAT_DEF: return createInputFloatDef();
			case QueryPackage.CALL_QUERY_SURFACE: return createCallQuerySurface();
			case QueryPackage.TYPE: return createType();
			case QueryPackage.SUBTYPE: return createSubtype();
			case QueryPackage.JUNCTION: return createJunction();
			case QueryPackage.ROOT_JUNCTION: return createRootJunction();
			case QueryPackage.JUNC_RELATIONSHIP: return createJuncRelationship();
			case QueryPackage.TERM: return createTerm();
			case QueryPackage.EQUAL_LINK: return createEqualLink();
			case QueryPackage.GREATER_THAN_LINK: return createGreaterThanLink();
			case QueryPackage.GREATER_EQUAL_THAN_LINK: return createGreaterEqualThanLink();
			case QueryPackage.LOWER_THAN_LINK: return createLowerThanLink();
			case QueryPackage.LOWER_EQUAL_THAN_LINK: return createLowerEqualThanLink();
			case QueryPackage.IN_LINK: return createInLink();
			case QueryPackage.LIKE_LINK: return createLikeLink();
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
			case QueryPackage.QUERY_TYPE:
				return createQueryTypeFromString(eDataType, initialValue);
			case QueryPackage.RELATION_SELECT_OPERATION_TYPE:
				return createRelationSelectOperationTypeFromString(eDataType, initialValue);
			case QueryPackage.RELATION_SELECT_TYPE:
				return createRelationSelectTypeFromString(eDataType, initialValue);
			case QueryPackage.SORT_TYPE:
				return createSortTypeFromString(eDataType, initialValue);
			case QueryPackage.LITERAL_TYPE:
				return createLiteralTypeFromString(eDataType, initialValue);
			case QueryPackage.JUNC_TYPE:
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
			case QueryPackage.QUERY_TYPE:
				return convertQueryTypeToString(eDataType, instanceValue);
			case QueryPackage.RELATION_SELECT_OPERATION_TYPE:
				return convertRelationSelectOperationTypeToString(eDataType, instanceValue);
			case QueryPackage.RELATION_SELECT_TYPE:
				return convertRelationSelectTypeToString(eDataType, instanceValue);
			case QueryPackage.SORT_TYPE:
				return convertSortTypeToString(eDataType, instanceValue);
			case QueryPackage.LITERAL_TYPE:
				return convertLiteralTypeToString(eDataType, instanceValue);
			case QueryPackage.JUNC_TYPE:
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
	public QuerySurface createQuerySurface() {
		QuerySurfaceImpl querySurface = new QuerySurfaceImpl();
		return querySurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputInstalment createOutputInstalment() {
		OutputInstalmentImpl outputInstalment = new OutputInstalmentImpl();
		return outputInstalment;
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
	public GroupInstalment createGroupInstalment() {
		GroupInstalmentImpl groupInstalment = new GroupInstalmentImpl();
		return groupInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereInstalment createWhereInstalment() {
		WhereInstalmentImpl whereInstalment = new WhereInstalmentImpl();
		return whereInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HavingInstalment createHavingInstalment() {
		HavingInstalmentImpl havingInstalment = new HavingInstalmentImpl();
		return havingInstalment;
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
	public FieldGPointer createFieldGPointer() {
		FieldGPointerImpl fieldGPointer = new FieldGPointerImpl();
		return fieldGPointer;
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
	public CallQuerySurface createCallQuerySurface() {
		CallQuerySurfaceImpl callQuerySurface = new CallQuerySurfaceImpl();
		return callQuerySurface;
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
	public QueryType createQueryTypeFromString(EDataType eDataType, String initialValue) {
		QueryType result = QueryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public QueryPackage getQueryPackage() {
		return (QueryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QueryPackage getPackage() {
		return QueryPackage.eINSTANCE;
	}

} //QueryFactoryImpl
