/**
 */
package query.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import query.AbstractConditionElement;
import query.AbstractNode;
import query.CallQuerySurface;
import query.ConditionInstalment;
import query.ConditionLink;
import query.ConditionOperationType;
import query.EqualLink;
import query.Field;
import query.FieldGPointer;
import query.FieldPointer;
import query.FieldSPointer;
import query.FullOuterJoinRels;
import query.Function;
import query.FunctionDef;
import query.GreaterEqualThanLink;
import query.GreaterThanLink;
import query.GroupInstalment;
import query.HavingInstalment;
import query.InLink;
import query.InnerjoinRels;
import query.Input;
import query.InputBitsDef;
import query.InputDateDef;
import query.InputDef;
import query.InputFloatDef;
import query.InputInstalment;
import query.InputIntDef;
import query.InputStringDef;
import query.JuncRelationship;
import query.JuncType;
import query.Junction;
import query.LeftOuterJoinRels;
import query.LikeLink;
import query.Literal;
import query.LiteralType;
import query.LowerEqualThanLink;
import query.LowerThanLink;
import query.MyTable;
import query.Node;
import query.NullLiteral;
import query.OutputInstalment;
import query.QueryFactory;
import query.QueryPackage;
import query.QuerySurface;
import query.QueryType;
import query.RelationSelect;
import query.RelationSelectOperationType;
import query.RelationSelectType;
import query.RightOuterJoinRels;
import query.RootJunction;
import query.SortInstalment;
import query.SortType;
import query.Subtype;
import query.Term;
import query.Type;
import query.WhereInstalment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryPackageImpl extends EPackageImpl implements QueryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass querySurfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputInstalmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputInstalmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortInstalmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupInstalmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionInstalmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whereInstalmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass havingInstalmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerjoinRelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftOuterJoinRelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightOuterJoinRelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullOuterJoinRelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldGPointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldSPointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputStringDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputIntDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDateDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputBitsDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputFloatDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callQuerySurfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConditionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass junctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootJunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass juncRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEqualThanLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerThanLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerEqualThanLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass likeLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationSelectOperationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationSelectTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum literalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum juncTypeEEnum = null;

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
	 * @see query.QueryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QueryPackageImpl() {
		super(eNS_URI, QueryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QueryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QueryPackage init() {
		if (isInited) return (QueryPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);

		// Obtain or create and register package
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QueryPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theQueryPackage.createPackageContents();

		// Initialize created meta-data
		theQueryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQueryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QueryPackage.eNS_URI, theQueryPackage);
		return theQueryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuerySurface() {
		return querySurfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuerySurface_OutputInstalment() {
		return (EReference)querySurfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuerySurface_InputInstalment() {
		return (EReference)querySurfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuerySurface_WhereInstalment() {
		return (EReference)querySurfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuerySurface_HavingInstalment() {
		return (EReference)querySurfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuerySurface_GroupInstalment() {
		return (EReference)querySurfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuerySurface_SortInstalment() {
		return (EReference)querySurfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuerySurface_Types() {
		return (EReference)querySurfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuerySurface_Funcs() {
		return (EReference)querySurfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuerySurface_Name() {
		return (EAttribute)querySurfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuerySurface_UserName() {
		return (EAttribute)querySurfaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuerySurface_Password() {
		return (EAttribute)querySurfaceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuerySurface_Uri() {
		return (EAttribute)querySurfaceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuerySurface_Description() {
		return (EAttribute)querySurfaceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuerySurface_NumberOfRow() {
		return (EAttribute)querySurfaceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuerySurface_IndexOfRoes() {
		return (EAttribute)querySurfaceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuerySurface_CreateClass() {
		return (EAttribute)querySurfaceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuerySurface_AssociatedClass() {
		return (EAttribute)querySurfaceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuerySurface_Type() {
		return (EAttribute)querySurfaceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputInstalment() {
		return outputInstalmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputInstalment_Name() {
		return (EAttribute)outputInstalmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputInstalment_Nodes() {
		return (EReference)outputInstalmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputInstalment_Rels() {
		return (EReference)outputInstalmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputInstalment() {
		return inputInstalmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputInstalment_Name() {
		return (EAttribute)inputInstalmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputInstalment_Inputs() {
		return (EReference)inputInstalmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortInstalment() {
		return sortInstalmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortInstalment_Name() {
		return (EAttribute)sortInstalmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortInstalment_Pointers() {
		return (EReference)sortInstalmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupInstalment() {
		return groupInstalmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupInstalment_Name() {
		return (EAttribute)groupInstalmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupInstalment_Pointers() {
		return (EReference)groupInstalmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionInstalment() {
		return conditionInstalmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionInstalment_Parts() {
		return (EReference)conditionInstalmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionInstalment_Links() {
		return (EReference)conditionInstalmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhereInstalment() {
		return whereInstalmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhereInstalment_Name() {
		return (EAttribute)whereInstalmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHavingInstalment() {
		return havingInstalmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHavingInstalment_Name() {
		return (EAttribute)havingInstalmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationSelect() {
		return relationSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationSelect_Source() {
		return (EReference)relationSelectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationSelect_Target() {
		return (EReference)relationSelectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationSelect_OpType() {
		return (EAttribute)relationSelectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInnerjoinRels() {
		return innerjoinRelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInnerjoinRels_Type() {
		return (EAttribute)innerjoinRelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftOuterJoinRels() {
		return leftOuterJoinRelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeftOuterJoinRels_Type() {
		return (EAttribute)leftOuterJoinRelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightOuterJoinRels() {
		return rightOuterJoinRelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRightOuterJoinRels_Type() {
		return (EAttribute)rightOuterJoinRelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFullOuterJoinRels() {
		return fullOuterJoinRelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFullOuterJoinRels_Type() {
		return (EAttribute)fullOuterJoinRelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNode() {
		return abstractNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldGPointer() {
		return fieldGPointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldGPointer_Name() {
		return (EAttribute)fieldGPointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldGPointer_Field() {
		return (EReference)fieldGPointerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldSPointer() {
		return fieldSPointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldSPointer_Name() {
		return (EAttribute)fieldSPointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldSPointer_Type() {
		return (EAttribute)fieldSPointerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldSPointer_Field() {
		return (EReference)fieldSPointerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyTable() {
		return myTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMyTable_Name() {
		return (EAttribute)myTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMyTable_Alias() {
		return (EAttribute)myTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMyTable_Fields() {
		return (EReference)myTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Type() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Subtype() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Column_name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Listable() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Table() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_TableName() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Table_ref() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Distict() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Value() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Ltype() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullLiteral() {
		return nullLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullLiteral_Value() {
		return (EAttribute)nullLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Name() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_FuncDef() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Params() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDef() {
		return functionDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionDef_Name() {
		return (EAttribute)functionDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDef_Returntype() {
		return (EReference)functionDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDef_Args() {
		return (EReference)functionDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_InputRef() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputDef() {
		return inputDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputDef_Name() {
		return (EAttribute)inputDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputDef_Index() {
		return (EAttribute)inputDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputDef_Listable() {
		return (EAttribute)inputDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputStringDef() {
		return inputStringDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputIntDef() {
		return inputIntDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputDateDef() {
		return inputDateDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputBitsDef() {
		return inputBitsDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputFloatDef() {
		return inputFloatDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallQuerySurface() {
		return callQuerySurfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallQuerySurface_SurfaceName() {
		return (EAttribute)callQuerySurfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Subtypes() {
		return (EReference)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtype() {
		return subtypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtype_Name() {
		return (EAttribute)subtypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConditionElement() {
		return abstractConditionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJunction() {
		return junctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJunction_Type() {
		return (EAttribute)junctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJunction_Rels() {
		return (EReference)junctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootJunction() {
		return rootJunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJuncRelationship() {
		return juncRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJuncRelationship_Source() {
		return (EReference)juncRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJuncRelationship_Target() {
		return (EReference)juncRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJuncRelationship_Index() {
		return (EAttribute)juncRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJuncRelationship_Type() {
		return (EAttribute)juncRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Params() {
		return (EReference)termEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerm_Title() {
		return (EAttribute)termEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Link() {
		return (EReference)termEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionLink() {
		return conditionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionLink_Src() {
		return (EReference)conditionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionLink_Dst() {
		return (EReference)conditionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionLink_Negative() {
		return (EAttribute)conditionLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualLink() {
		return equalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqualLink_Desc() {
		return (EAttribute)equalLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThanLink() {
		return greaterThanLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGreaterThanLink_Desc() {
		return (EAttribute)greaterThanLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterEqualThanLink() {
		return greaterEqualThanLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGreaterEqualThanLink_Desc() {
		return (EAttribute)greaterEqualThanLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLowerThanLink() {
		return lowerThanLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLowerThanLink_Desc() {
		return (EAttribute)lowerThanLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLowerEqualThanLink() {
		return lowerEqualThanLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLowerEqualThanLink_Desc() {
		return (EAttribute)lowerEqualThanLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInLink() {
		return inLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInLink_Desc() {
		return (EAttribute)inLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLikeLink() {
		return likeLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLikeLink_Desc() {
		return (EAttribute)likeLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQueryType() {
		return queryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationSelectOperationType() {
		return relationSelectOperationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationSelectType() {
		return relationSelectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSortType() {
		return sortTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLiteralType() {
		return literalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJuncType() {
		return juncTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFactory getQueryFactory() {
		return (QueryFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		querySurfaceEClass = createEClass(QUERY_SURFACE);
		createEReference(querySurfaceEClass, QUERY_SURFACE__OUTPUT_INSTALMENT);
		createEReference(querySurfaceEClass, QUERY_SURFACE__INPUT_INSTALMENT);
		createEReference(querySurfaceEClass, QUERY_SURFACE__WHERE_INSTALMENT);
		createEReference(querySurfaceEClass, QUERY_SURFACE__HAVING_INSTALMENT);
		createEReference(querySurfaceEClass, QUERY_SURFACE__GROUP_INSTALMENT);
		createEReference(querySurfaceEClass, QUERY_SURFACE__SORT_INSTALMENT);
		createEReference(querySurfaceEClass, QUERY_SURFACE__TYPES);
		createEReference(querySurfaceEClass, QUERY_SURFACE__FUNCS);
		createEAttribute(querySurfaceEClass, QUERY_SURFACE__NAME);
		createEAttribute(querySurfaceEClass, QUERY_SURFACE__USER_NAME);
		createEAttribute(querySurfaceEClass, QUERY_SURFACE__PASSWORD);
		createEAttribute(querySurfaceEClass, QUERY_SURFACE__URI);
		createEAttribute(querySurfaceEClass, QUERY_SURFACE__DESCRIPTION);
		createEAttribute(querySurfaceEClass, QUERY_SURFACE__NUMBER_OF_ROW);
		createEAttribute(querySurfaceEClass, QUERY_SURFACE__INDEX_OF_ROES);
		createEAttribute(querySurfaceEClass, QUERY_SURFACE__CREATE_CLASS);
		createEAttribute(querySurfaceEClass, QUERY_SURFACE__ASSOCIATED_CLASS);
		createEAttribute(querySurfaceEClass, QUERY_SURFACE__TYPE);

		outputInstalmentEClass = createEClass(OUTPUT_INSTALMENT);
		createEAttribute(outputInstalmentEClass, OUTPUT_INSTALMENT__NAME);
		createEReference(outputInstalmentEClass, OUTPUT_INSTALMENT__NODES);
		createEReference(outputInstalmentEClass, OUTPUT_INSTALMENT__RELS);

		inputInstalmentEClass = createEClass(INPUT_INSTALMENT);
		createEAttribute(inputInstalmentEClass, INPUT_INSTALMENT__NAME);
		createEReference(inputInstalmentEClass, INPUT_INSTALMENT__INPUTS);

		sortInstalmentEClass = createEClass(SORT_INSTALMENT);
		createEAttribute(sortInstalmentEClass, SORT_INSTALMENT__NAME);
		createEReference(sortInstalmentEClass, SORT_INSTALMENT__POINTERS);

		groupInstalmentEClass = createEClass(GROUP_INSTALMENT);
		createEAttribute(groupInstalmentEClass, GROUP_INSTALMENT__NAME);
		createEReference(groupInstalmentEClass, GROUP_INSTALMENT__POINTERS);

		conditionInstalmentEClass = createEClass(CONDITION_INSTALMENT);
		createEReference(conditionInstalmentEClass, CONDITION_INSTALMENT__PARTS);
		createEReference(conditionInstalmentEClass, CONDITION_INSTALMENT__LINKS);

		whereInstalmentEClass = createEClass(WHERE_INSTALMENT);
		createEAttribute(whereInstalmentEClass, WHERE_INSTALMENT__NAME);

		havingInstalmentEClass = createEClass(HAVING_INSTALMENT);
		createEAttribute(havingInstalmentEClass, HAVING_INSTALMENT__NAME);

		relationSelectEClass = createEClass(RELATION_SELECT);
		createEReference(relationSelectEClass, RELATION_SELECT__SOURCE);
		createEReference(relationSelectEClass, RELATION_SELECT__TARGET);
		createEAttribute(relationSelectEClass, RELATION_SELECT__OP_TYPE);

		innerjoinRelsEClass = createEClass(INNERJOIN_RELS);
		createEAttribute(innerjoinRelsEClass, INNERJOIN_RELS__TYPE);

		leftOuterJoinRelsEClass = createEClass(LEFT_OUTER_JOIN_RELS);
		createEAttribute(leftOuterJoinRelsEClass, LEFT_OUTER_JOIN_RELS__TYPE);

		rightOuterJoinRelsEClass = createEClass(RIGHT_OUTER_JOIN_RELS);
		createEAttribute(rightOuterJoinRelsEClass, RIGHT_OUTER_JOIN_RELS__TYPE);

		fullOuterJoinRelsEClass = createEClass(FULL_OUTER_JOIN_RELS);
		createEAttribute(fullOuterJoinRelsEClass, FULL_OUTER_JOIN_RELS__TYPE);

		abstractNodeEClass = createEClass(ABSTRACT_NODE);

		fieldGPointerEClass = createEClass(FIELD_GPOINTER);
		createEAttribute(fieldGPointerEClass, FIELD_GPOINTER__NAME);
		createEReference(fieldGPointerEClass, FIELD_GPOINTER__FIELD);

		fieldSPointerEClass = createEClass(FIELD_SPOINTER);
		createEAttribute(fieldSPointerEClass, FIELD_SPOINTER__NAME);
		createEAttribute(fieldSPointerEClass, FIELD_SPOINTER__TYPE);
		createEReference(fieldSPointerEClass, FIELD_SPOINTER__FIELD);

		myTableEClass = createEClass(MY_TABLE);
		createEAttribute(myTableEClass, MY_TABLE__NAME);
		createEAttribute(myTableEClass, MY_TABLE__ALIAS);
		createEReference(myTableEClass, MY_TABLE__FIELDS);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__TYPE);
		createEReference(nodeEClass, NODE__SUBTYPE);
		createEAttribute(nodeEClass, NODE__COLUMN_NAME);
		createEAttribute(nodeEClass, NODE__LISTABLE);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEReference(fieldEClass, FIELD__TABLE);
		createEAttribute(fieldEClass, FIELD__TABLE_NAME);
		createEReference(fieldEClass, FIELD__TABLE_REF);
		createEAttribute(fieldEClass, FIELD__DISTICT);

		literalEClass = createEClass(LITERAL);
		createEAttribute(literalEClass, LITERAL__VALUE);
		createEAttribute(literalEClass, LITERAL__LTYPE);

		nullLiteralEClass = createEClass(NULL_LITERAL);
		createEAttribute(nullLiteralEClass, NULL_LITERAL__VALUE);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__NAME);
		createEReference(functionEClass, FUNCTION__FUNC_DEF);
		createEReference(functionEClass, FUNCTION__PARAMS);

		functionDefEClass = createEClass(FUNCTION_DEF);
		createEAttribute(functionDefEClass, FUNCTION_DEF__NAME);
		createEReference(functionDefEClass, FUNCTION_DEF__RETURNTYPE);
		createEReference(functionDefEClass, FUNCTION_DEF__ARGS);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__INPUT_REF);

		inputDefEClass = createEClass(INPUT_DEF);
		createEAttribute(inputDefEClass, INPUT_DEF__NAME);
		createEAttribute(inputDefEClass, INPUT_DEF__INDEX);
		createEAttribute(inputDefEClass, INPUT_DEF__LISTABLE);

		inputStringDefEClass = createEClass(INPUT_STRING_DEF);

		inputIntDefEClass = createEClass(INPUT_INT_DEF);

		inputDateDefEClass = createEClass(INPUT_DATE_DEF);

		inputBitsDefEClass = createEClass(INPUT_BITS_DEF);

		inputFloatDefEClass = createEClass(INPUT_FLOAT_DEF);

		callQuerySurfaceEClass = createEClass(CALL_QUERY_SURFACE);
		createEAttribute(callQuerySurfaceEClass, CALL_QUERY_SURFACE__SURFACE_NAME);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);
		createEReference(typeEClass, TYPE__SUBTYPES);

		subtypeEClass = createEClass(SUBTYPE);
		createEAttribute(subtypeEClass, SUBTYPE__NAME);

		abstractConditionElementEClass = createEClass(ABSTRACT_CONDITION_ELEMENT);

		junctionEClass = createEClass(JUNCTION);
		createEAttribute(junctionEClass, JUNCTION__TYPE);
		createEReference(junctionEClass, JUNCTION__RELS);

		rootJunctionEClass = createEClass(ROOT_JUNCTION);

		juncRelationshipEClass = createEClass(JUNC_RELATIONSHIP);
		createEReference(juncRelationshipEClass, JUNC_RELATIONSHIP__SOURCE);
		createEReference(juncRelationshipEClass, JUNC_RELATIONSHIP__TARGET);
		createEAttribute(juncRelationshipEClass, JUNC_RELATIONSHIP__INDEX);
		createEAttribute(juncRelationshipEClass, JUNC_RELATIONSHIP__TYPE);

		termEClass = createEClass(TERM);
		createEReference(termEClass, TERM__PARAMS);
		createEAttribute(termEClass, TERM__TITLE);
		createEReference(termEClass, TERM__LINK);

		conditionLinkEClass = createEClass(CONDITION_LINK);
		createEReference(conditionLinkEClass, CONDITION_LINK__SRC);
		createEReference(conditionLinkEClass, CONDITION_LINK__DST);
		createEAttribute(conditionLinkEClass, CONDITION_LINK__NEGATIVE);

		equalLinkEClass = createEClass(EQUAL_LINK);
		createEAttribute(equalLinkEClass, EQUAL_LINK__DESC);

		greaterThanLinkEClass = createEClass(GREATER_THAN_LINK);
		createEAttribute(greaterThanLinkEClass, GREATER_THAN_LINK__DESC);

		greaterEqualThanLinkEClass = createEClass(GREATER_EQUAL_THAN_LINK);
		createEAttribute(greaterEqualThanLinkEClass, GREATER_EQUAL_THAN_LINK__DESC);

		lowerThanLinkEClass = createEClass(LOWER_THAN_LINK);
		createEAttribute(lowerThanLinkEClass, LOWER_THAN_LINK__DESC);

		lowerEqualThanLinkEClass = createEClass(LOWER_EQUAL_THAN_LINK);
		createEAttribute(lowerEqualThanLinkEClass, LOWER_EQUAL_THAN_LINK__DESC);

		inLinkEClass = createEClass(IN_LINK);
		createEAttribute(inLinkEClass, IN_LINK__DESC);

		likeLinkEClass = createEClass(LIKE_LINK);
		createEAttribute(likeLinkEClass, LIKE_LINK__DESC);

		// Create enums
		queryTypeEEnum = createEEnum(QUERY_TYPE);
		relationSelectOperationTypeEEnum = createEEnum(RELATION_SELECT_OPERATION_TYPE);
		relationSelectTypeEEnum = createEEnum(RELATION_SELECT_TYPE);
		sortTypeEEnum = createEEnum(SORT_TYPE);
		literalTypeEEnum = createEEnum(LITERAL_TYPE);
		juncTypeEEnum = createEEnum(JUNC_TYPE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		whereInstalmentEClass.getESuperTypes().add(this.getConditionInstalment());
		havingInstalmentEClass.getESuperTypes().add(this.getConditionInstalment());
		innerjoinRelsEClass.getESuperTypes().add(this.getRelationSelect());
		leftOuterJoinRelsEClass.getESuperTypes().add(this.getRelationSelect());
		rightOuterJoinRelsEClass.getESuperTypes().add(this.getRelationSelect());
		fullOuterJoinRelsEClass.getESuperTypes().add(this.getRelationSelect());
		myTableEClass.getESuperTypes().add(this.getAbstractNode());
		nodeEClass.getESuperTypes().add(this.getAbstractNode());
		fieldEClass.getESuperTypes().add(this.getNode());
		literalEClass.getESuperTypes().add(this.getNode());
		nullLiteralEClass.getESuperTypes().add(this.getNode());
		functionEClass.getESuperTypes().add(this.getNode());
		inputEClass.getESuperTypes().add(this.getNode());
		inputStringDefEClass.getESuperTypes().add(this.getInputDef());
		inputIntDefEClass.getESuperTypes().add(this.getInputDef());
		inputDateDefEClass.getESuperTypes().add(this.getInputDef());
		inputBitsDefEClass.getESuperTypes().add(this.getInputDef());
		inputFloatDefEClass.getESuperTypes().add(this.getInputDef());
		callQuerySurfaceEClass.getESuperTypes().add(this.getFunction());
		junctionEClass.getESuperTypes().add(this.getAbstractConditionElement());
		rootJunctionEClass.getESuperTypes().add(this.getJunction());
		termEClass.getESuperTypes().add(this.getAbstractConditionElement());
		equalLinkEClass.getESuperTypes().add(this.getConditionLink());
		greaterThanLinkEClass.getESuperTypes().add(this.getConditionLink());
		greaterEqualThanLinkEClass.getESuperTypes().add(this.getConditionLink());
		lowerThanLinkEClass.getESuperTypes().add(this.getConditionLink());
		lowerEqualThanLinkEClass.getESuperTypes().add(this.getConditionLink());
		inLinkEClass.getESuperTypes().add(this.getConditionLink());
		likeLinkEClass.getESuperTypes().add(this.getConditionLink());

		// Initialize classes and features; add operations and parameters
		initEClass(querySurfaceEClass, QuerySurface.class, "QuerySurface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuerySurface_OutputInstalment(), this.getOutputInstalment(), null, "outputInstalment", null, 1, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuerySurface_InputInstalment(), this.getInputInstalment(), null, "inputInstalment", null, 1, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuerySurface_WhereInstalment(), this.getWhereInstalment(), null, "whereInstalment", null, 1, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuerySurface_HavingInstalment(), this.getHavingInstalment(), null, "havingInstalment", null, 1, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuerySurface_GroupInstalment(), this.getGroupInstalment(), null, "groupInstalment", null, 1, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuerySurface_SortInstalment(), this.getSortInstalment(), null, "sortInstalment", null, 1, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuerySurface_Types(), this.getType(), null, "types", null, 0, -1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuerySurface_Funcs(), this.getFunctionDef(), null, "funcs", null, 0, -1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuerySurface_Name(), ecorePackage.getEString(), "name", null, 0, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuerySurface_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuerySurface_Password(), ecorePackage.getEString(), "password", null, 0, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuerySurface_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuerySurface_Description(), ecorePackage.getEString(), "description", null, 0, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuerySurface_NumberOfRow(), ecorePackage.getEInt(), "numberOfRow", "0", 0, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuerySurface_IndexOfRoes(), ecorePackage.getEInt(), "indexOfRoes", "0", 0, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuerySurface_CreateClass(), ecorePackage.getEBoolean(), "createClass", "false", 0, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuerySurface_AssociatedClass(), ecorePackage.getEString(), "associatedClass", null, 0, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuerySurface_Type(), this.getQueryType(), "type", null, 0, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputInstalmentEClass, OutputInstalment.class, "OutputInstalment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputInstalment_Name(), ecorePackage.getEString(), "name", "Output", 0, 1, OutputInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputInstalment_Nodes(), this.getAbstractNode(), null, "nodes", null, 0, -1, OutputInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputInstalment_Rels(), this.getRelationSelect(), null, "rels", null, 0, -1, OutputInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputInstalmentEClass, InputInstalment.class, "InputInstalment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputInstalment_Name(), ecorePackage.getEString(), "name", "Input", 0, 1, InputInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputInstalment_Inputs(), this.getInputDef(), null, "inputs", null, 0, -1, InputInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortInstalmentEClass, SortInstalment.class, "SortInstalment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSortInstalment_Name(), ecorePackage.getEString(), "name", "Sorted", 0, 1, SortInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortInstalment_Pointers(), this.getFieldSPointer(), null, "pointers", null, 0, -1, SortInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupInstalmentEClass, GroupInstalment.class, "GroupInstalment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupInstalment_Name(), ecorePackage.getEString(), "name", "Grouped", 0, 1, GroupInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupInstalment_Pointers(), this.getFieldGPointer(), null, "pointers", null, 0, -1, GroupInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionInstalmentEClass, ConditionInstalment.class, "ConditionInstalment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionInstalment_Parts(), this.getAbstractConditionElement(), null, "parts", null, 0, -1, ConditionInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionInstalment_Links(), this.getJuncRelationship(), null, "links", null, 0, -1, ConditionInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whereInstalmentEClass, WhereInstalment.class, "WhereInstalment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhereInstalment_Name(), ecorePackage.getEString(), "name", "Where", 0, 1, WhereInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(havingInstalmentEClass, HavingInstalment.class, "HavingInstalment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHavingInstalment_Name(), ecorePackage.getEString(), "name", "Having", 0, 1, HavingInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationSelectEClass, RelationSelect.class, "RelationSelect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationSelect_Source(), this.getField(), null, "source", null, 1, 1, RelationSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationSelect_Target(), this.getField(), null, "target", null, 1, 1, RelationSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationSelect_OpType(), this.getRelationSelectOperationType(), "opType", null, 0, 1, RelationSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(innerjoinRelsEClass, InnerjoinRels.class, "InnerjoinRels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInnerjoinRels_Type(), this.getRelationSelectType(), "type", "InnerJoin", 1, 1, InnerjoinRels.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leftOuterJoinRelsEClass, LeftOuterJoinRels.class, "LeftOuterJoinRels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeftOuterJoinRels_Type(), this.getRelationSelectType(), "type", "LeftOuterJoin", 1, 1, LeftOuterJoinRels.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rightOuterJoinRelsEClass, RightOuterJoinRels.class, "RightOuterJoinRels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRightOuterJoinRels_Type(), this.getRelationSelectType(), "type", "RightOuterJoin", 1, 1, RightOuterJoinRels.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fullOuterJoinRelsEClass, FullOuterJoinRels.class, "FullOuterJoinRels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFullOuterJoinRels_Type(), this.getRelationSelectType(), "type", "FullOuterJoin", 1, 1, FullOuterJoinRels.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldGPointerEClass, FieldGPointer.class, "FieldGPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldGPointer_Name(), ecorePackage.getEString(), "name", null, 0, 1, FieldGPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldGPointer_Field(), this.getField(), null, "field", null, 0, 1, FieldGPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldSPointerEClass, FieldSPointer.class, "FieldSPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldSPointer_Name(), ecorePackage.getEString(), "name", null, 0, 1, FieldSPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldSPointer_Type(), this.getSortType(), "type", null, 0, 1, FieldSPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldSPointer_Field(), this.getField(), null, "field", null, 0, 1, FieldSPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myTableEClass, MyTable.class, "MyTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMyTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, MyTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMyTable_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, MyTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMyTable_Fields(), this.getField(), this.getField_Table(), "fields", null, 0, -1, MyTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Type(), this.getType(), null, "type", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Subtype(), this.getSubtype(), null, "subtype", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Column_name(), ecorePackage.getEString(), "column_name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Listable(), ecorePackage.getEBoolean(), "listable", "false", 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Table(), this.getMyTable(), this.getMyTable_Fields(), "table", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Table_ref(), this.getMyTable(), null, "table_ref", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Distict(), ecorePackage.getEBoolean(), "distict", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_Ltype(), this.getLiteralType(), "ltype", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullLiteralEClass, NullLiteral.class, "NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNullLiteral_Value(), ecorePackage.getEString(), "value", "null", 0, 1, NullLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_FuncDef(), this.getFunctionDef(), null, "funcDef", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Params(), this.getNode(), null, "params", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionDefEClass, FunctionDef.class, "FunctionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDef_Returntype(), this.getSubtype(), null, "returntype", null, 0, 1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDef_Args(), this.getType(), null, "args", null, 0, 1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_InputRef(), this.getInputDef(), null, "inputRef", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputDefEClass, InputDef.class, "InputDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, InputDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputDef_Index(), ecorePackage.getEInt(), "index", null, 0, 1, InputDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputDef_Listable(), ecorePackage.getEBoolean(), "listable", "false", 0, 1, InputDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputStringDefEClass, InputStringDef.class, "InputStringDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputIntDefEClass, InputIntDef.class, "InputIntDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputDateDefEClass, InputDateDef.class, "InputDateDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputBitsDefEClass, InputBitsDef.class, "InputBitsDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputFloatDefEClass, InputFloatDef.class, "InputFloatDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callQuerySurfaceEClass, CallQuerySurface.class, "CallQuerySurface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallQuerySurface_SurfaceName(), ecorePackage.getEString(), "surfaceName", null, 0, 1, CallQuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Subtypes(), this.getSubtype(), null, "subtypes", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subtypeEClass, Subtype.class, "Subtype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubtype_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subtype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConditionElementEClass, AbstractConditionElement.class, "AbstractConditionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(junctionEClass, Junction.class, "Junction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJunction_Type(), this.getJuncType(), "type", null, 0, 1, Junction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJunction_Rels(), this.getJuncRelationship(), this.getJuncRelationship_Source(), "rels", null, 0, -1, Junction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootJunctionEClass, RootJunction.class, "RootJunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(juncRelationshipEClass, JuncRelationship.class, "JuncRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJuncRelationship_Source(), this.getJunction(), this.getJunction_Rels(), "source", null, 1, 1, JuncRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJuncRelationship_Target(), this.getAbstractConditionElement(), null, "target", null, 1, 1, JuncRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJuncRelationship_Index(), ecorePackage.getEInt(), "index", "0", 0, 1, JuncRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJuncRelationship_Type(), ecorePackage.getEString(), "type", "relates", 0, 1, JuncRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerm_Params(), this.getNode(), null, "params", null, 1, 2, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTerm_Title(), ecorePackage.getEString(), "title", "Term", 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_Link(), this.getConditionLink(), null, "link", null, 1, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionLinkEClass, ConditionLink.class, "ConditionLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionLink_Src(), this.getNode(), null, "src", null, 0, 1, ConditionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionLink_Dst(), this.getNode(), null, "dst", null, 0, 1, ConditionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionLink_Negative(), ecorePackage.getEBoolean(), "negative", null, 0, 1, ConditionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalLinkEClass, EqualLink.class, "EqualLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEqualLink_Desc(), ecorePackage.getEString(), "desc", "=", 0, 1, EqualLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(greaterThanLinkEClass, GreaterThanLink.class, "GreaterThanLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGreaterThanLink_Desc(), ecorePackage.getEString(), "desc", ">", 0, 1, GreaterThanLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(greaterEqualThanLinkEClass, GreaterEqualThanLink.class, "GreaterEqualThanLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGreaterEqualThanLink_Desc(), ecorePackage.getEString(), "desc", ">=", 0, 1, GreaterEqualThanLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lowerThanLinkEClass, LowerThanLink.class, "LowerThanLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLowerThanLink_Desc(), ecorePackage.getEString(), "desc", "<", 0, 1, LowerThanLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lowerEqualThanLinkEClass, LowerEqualThanLink.class, "LowerEqualThanLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLowerEqualThanLink_Desc(), ecorePackage.getEString(), "desc", "<=", 0, 1, LowerEqualThanLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inLinkEClass, InLink.class, "InLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInLink_Desc(), ecorePackage.getEString(), "desc", "In", 0, 1, InLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(likeLinkEClass, LikeLink.class, "LikeLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLikeLink_Desc(), ecorePackage.getEString(), "desc", "Like", 0, 1, LikeLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(queryTypeEEnum, QueryType.class, "QueryType");
		addEEnumLiteral(queryTypeEEnum, QueryType.SELECT);
		addEEnumLiteral(queryTypeEEnum, QueryType.CREATE);

		initEEnum(relationSelectOperationTypeEEnum, RelationSelectOperationType.class, "RelationSelectOperationType");
		addEEnumLiteral(relationSelectOperationTypeEEnum, RelationSelectOperationType.EQUAL);
		addEEnumLiteral(relationSelectOperationTypeEEnum, RelationSelectOperationType.GREATER);
		addEEnumLiteral(relationSelectOperationTypeEEnum, RelationSelectOperationType.GEREATER_EQUAL);
		addEEnumLiteral(relationSelectOperationTypeEEnum, RelationSelectOperationType.LOWER);
		addEEnumLiteral(relationSelectOperationTypeEEnum, RelationSelectOperationType.LOWER_EQUAL);

		initEEnum(relationSelectTypeEEnum, RelationSelectType.class, "RelationSelectType");
		addEEnumLiteral(relationSelectTypeEEnum, RelationSelectType.INNER_JOIN);
		addEEnumLiteral(relationSelectTypeEEnum, RelationSelectType.LEFT_OUTER_JOIN);
		addEEnumLiteral(relationSelectTypeEEnum, RelationSelectType.RIGHT_OUTER_JOIN);
		addEEnumLiteral(relationSelectTypeEEnum, RelationSelectType.FULL_OUTER_JOIN);

		initEEnum(sortTypeEEnum, SortType.class, "SortType");
		addEEnumLiteral(sortTypeEEnum, SortType.ASC);
		addEEnumLiteral(sortTypeEEnum, SortType.DESC);

		initEEnum(literalTypeEEnum, LiteralType.class, "LiteralType");
		addEEnumLiteral(literalTypeEEnum, LiteralType.STRING);
		addEEnumLiteral(literalTypeEEnum, LiteralType.INT);
		addEEnumLiteral(literalTypeEEnum, LiteralType.DOUBLE);
		addEEnumLiteral(literalTypeEEnum, LiteralType.DATE);
		addEEnumLiteral(literalTypeEEnum, LiteralType.BITS);

		initEEnum(juncTypeEEnum, JuncType.class, "JuncType");
		addEEnumLiteral(juncTypeEEnum, JuncType.OR);
		addEEnumLiteral(juncTypeEEnum, JuncType.AND);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (querySurfaceEClass, 
		   source, 
		   new String[] {
			 "diagram.extension", "dext",
			 "model.extension", "mext"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (outputInstalmentEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "size", "100,500"
		   });	
		addAnnotation
		  (inputInstalmentEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "size", "100,500"
		   });	
		addAnnotation
		  (sortInstalmentEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "size", "100,300"
		   });	
		addAnnotation
		  (groupInstalmentEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "size", "100,300"
		   });	
		addAnnotation
		  (conditionInstalmentEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "size", "250,500"
		   });	
		addAnnotation
		  (abstractNodeEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (fieldGPointerEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (fieldSPointerEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (myTableEClass, 
		   source, 
		   new String[] {
			 "label", "name,alias",
			 "label.pattern", "{0} / {1}"
		   });	
		addAnnotation
		  (fieldEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "padding", "10"
		   });	
		addAnnotation
		  (literalEClass, 
		   source, 
		   new String[] {
			 "label", "value,column_name",
			 "label.pattern", "{0} {1}"
		   });	
		addAnnotation
		  (nullLiteralEClass, 
		   source, 
		   new String[] {
			 "label", "column_name",
			 "label.pattern", "{0}"
		   });	
		addAnnotation
		  (functionEClass, 
		   source, 
		   new String[] {
			 "label", "name,column_name",
			 "label.pattern", "{0} {1}"
		   });	
		addAnnotation
		  (inputEClass, 
		   source, 
		   new String[] {
			 "label", "column_name"
		   });	
		addAnnotation
		  (inputDefEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (junctionEClass, 
		   source, 
		   new String[] {
			 "label", "type",
			 "figure", "ellipse"
		   });	
		addAnnotation
		  (termEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle",
			 "label", "title",
			 "label.icon", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getOutputInstalment_Nodes(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getInputInstalment_Inputs(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getSortInstalment_Pointers(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getGroupInstalment_Pointers(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getConditionInstalment_Parts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMyTable_Fields(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getFunction_Params(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getTerm_Params(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (relationSelectEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "color", "100,22,222",
			 "style", "dot",
			 "width", "3",
			 "label", "type"
		   });	
		addAnnotation
		  (juncRelationshipEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dash",
			 "width", "1",
			 "label", "index",
			 "target.decoration", "arrow",
			 "color", "230,22,89"
		   });	
		addAnnotation
		  (conditionLinkEClass, 
		   source, 
		   new String[] {
			 "source", "src",
			 "target", "dst",
			 "style", "dash",
			 "width", "1",
			 "label", "desc",
			 "target.decoration", "arrow",
			 "color", "20,182,19"
		   });
	}

} //QueryPackageImpl
