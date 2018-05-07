/**
 */
package update.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import update.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpdateFactoryImpl extends EFactoryImpl implements UpdateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UpdateFactory init() {
		try {
			UpdateFactory theUpdateFactory = (UpdateFactory)EPackage.Registry.INSTANCE.getEFactory(UpdatePackage.eNS_URI);
			if (theUpdateFactory != null) {
				return theUpdateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UpdateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateFactoryImpl() {
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
			case UpdatePackage.UPDATE_SURFACE: return createUpdateSurface();
			case UpdatePackage.LINK_FIELD: return createLinkField();
			case UpdatePackage.INPUT_INSTALMENT: return createInputInstalment();
			case UpdatePackage.PREPARE_LIST: return createPrepareList();
			case UpdatePackage.CONDITION_INSTALMENT: return createConditionInstalment();
			case UpdatePackage.TABLE_SELECTION: return createTableSelection();
			case UpdatePackage.INNERJOIN_RELS: return createInnerjoinRels();
			case UpdatePackage.LEFT_OUTER_JOIN_RELS: return createLeftOuterJoinRels();
			case UpdatePackage.RIGHT_OUTER_JOIN_RELS: return createRightOuterJoinRels();
			case UpdatePackage.FULL_OUTER_JOIN_RELS: return createFullOuterJoinRels();
			case UpdatePackage.SORT_INSTALMENT: return createSortInstalment();
			case UpdatePackage.FIELD_SPOINTER: return createFieldSPointer();
			case UpdatePackage.MY_TABLE: return createMyTable();
			case UpdatePackage.FIELD: return createField();
			case UpdatePackage.REAL_FIELD: return createRealField();
			case UpdatePackage.LITERAL: return createLiteral();
			case UpdatePackage.NULL_LITERAL: return createNullLiteral();
			case UpdatePackage.FUNCTION: return createFunction();
			case UpdatePackage.FUNCTION_DEF: return createFunctionDef();
			case UpdatePackage.INPUT: return createInput();
			case UpdatePackage.INPUT_STRING_DEF: return createInputStringDef();
			case UpdatePackage.INPUT_INT_DEF: return createInputIntDef();
			case UpdatePackage.INPUT_DATE_DEF: return createInputDateDef();
			case UpdatePackage.INPUT_BITS_DEF: return createInputBitsDef();
			case UpdatePackage.INPUT_FLOAT_DEF: return createInputFloatDef();
			case UpdatePackage.CALL_SURFACE_QUERY: return createCallSurfaceQuery();
			case UpdatePackage.TYPE: return createType();
			case UpdatePackage.SUBTYPE: return createSubtype();
			case UpdatePackage.JUNCTION: return createJunction();
			case UpdatePackage.ROOT_JUNCTION: return createRootJunction();
			case UpdatePackage.JUNC_RELATIONSHIP: return createJuncRelationship();
			case UpdatePackage.TERM: return createTerm();
			case UpdatePackage.EQUAL_LINK: return createEqualLink();
			case UpdatePackage.GREATER_THAN_LINK: return createGreaterThanLink();
			case UpdatePackage.GREATER_EQUAL_THAN_LINK: return createGreaterEqualThanLink();
			case UpdatePackage.LOWER_THAN_LINK: return createLowerThanLink();
			case UpdatePackage.LOWER_EQUAL_THAN_LINK: return createLowerEqualThanLink();
			case UpdatePackage.IN_LINK: return createInLink();
			case UpdatePackage.LIKE_LINK: return createLikeLink();
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
			case UpdatePackage.RELATION_SELECT_OPERATION_TYPE:
				return createRelationSelectOperationTypeFromString(eDataType, initialValue);
			case UpdatePackage.RELATION_SELECT_TYPE:
				return createRelationSelectTypeFromString(eDataType, initialValue);
			case UpdatePackage.LITERAL_TYPE:
				return createLiteralTypeFromString(eDataType, initialValue);
			case UpdatePackage.SORT_TYPE:
				return createSortTypeFromString(eDataType, initialValue);
			case UpdatePackage.JUNC_TYPE:
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
			case UpdatePackage.RELATION_SELECT_OPERATION_TYPE:
				return convertRelationSelectOperationTypeToString(eDataType, instanceValue);
			case UpdatePackage.RELATION_SELECT_TYPE:
				return convertRelationSelectTypeToString(eDataType, instanceValue);
			case UpdatePackage.LITERAL_TYPE:
				return convertLiteralTypeToString(eDataType, instanceValue);
			case UpdatePackage.SORT_TYPE:
				return convertSortTypeToString(eDataType, instanceValue);
			case UpdatePackage.JUNC_TYPE:
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
	public UpdateSurface createUpdateSurface() {
		UpdateSurfaceImpl updateSurface = new UpdateSurfaceImpl();
		return updateSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkField createLinkField() {
		LinkFieldImpl linkField = new LinkFieldImpl();
		return linkField;
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
	public PrepareList createPrepareList() {
		PrepareListImpl prepareList = new PrepareListImpl();
		return prepareList;
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
	public TableSelection createTableSelection() {
		TableSelectionImpl tableSelection = new TableSelectionImpl();
		return tableSelection;
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
	public RealField createRealField() {
		RealFieldImpl realField = new RealFieldImpl();
		return realField;
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
	public UpdatePackage getUpdatePackage() {
		return (UpdatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UpdatePackage getPackage() {
		return UpdatePackage.eINSTANCE;
	}

} //UpdateFactoryImpl
