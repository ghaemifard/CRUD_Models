/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.AbstractCondElement;
import edu.aut.islab.ghaemi.ghaemi.CallQuerySurface;
import edu.aut.islab.ghaemi.ghaemi.ConditionalOperator;
import edu.aut.islab.ghaemi.ghaemi.DeleteSurface;
import edu.aut.islab.ghaemi.ghaemi.DisjuncType;
import edu.aut.islab.ghaemi.ghaemi.Disjunction;
import edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship;
import edu.aut.islab.ghaemi.ghaemi.Field;
import edu.aut.islab.ghaemi.ghaemi.FuncDefinition;
import edu.aut.islab.ghaemi.ghaemi.Function;
import edu.aut.islab.ghaemi.ghaemi.GhaemiFactory;
import edu.aut.islab.ghaemi.ghaemi.GhaemiPackage;
import edu.aut.islab.ghaemi.ghaemi.Input;
import edu.aut.islab.ghaemi.ghaemi.InputInstalment;
import edu.aut.islab.ghaemi.ghaemi.InsertSurface;
import edu.aut.islab.ghaemi.ghaemi.Literal;
import edu.aut.islab.ghaemi.ghaemi.Node;
import edu.aut.islab.ghaemi.ghaemi.OperatorType;
import edu.aut.islab.ghaemi.ghaemi.OutputInstalment;
import edu.aut.islab.ghaemi.ghaemi.OutputNode;
import edu.aut.islab.ghaemi.ghaemi.QueryConditionalInstalmnet;
import edu.aut.islab.ghaemi.ghaemi.QueryRelationType;
import edu.aut.islab.ghaemi.ghaemi.QuerySelectInstalment;
import edu.aut.islab.ghaemi.ghaemi.QuerySurface;
import edu.aut.islab.ghaemi.ghaemi.RelationShip;
import edu.aut.islab.ghaemi.ghaemi.Subtypes;
import edu.aut.islab.ghaemi.ghaemi.Surface;
import edu.aut.islab.ghaemi.ghaemi.Term;
import edu.aut.islab.ghaemi.ghaemi.Type;
import edu.aut.islab.ghaemi.ghaemi.UpdateSurface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GhaemiPackageImpl extends EPackageImpl implements GhaemiPackage {
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
	private EClass literalEClass = null;

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
	private EClass functionEClass = null;

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
	private EClass inputEClass = null;

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
	private EClass subtypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceEClass = null;

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
	private EClass insertSurfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateSurfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteSurfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationShipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryConditionalInstalmnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass querySelectInstalmentEClass = null;

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
	private EClass conditionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCondElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjunctionRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputNodeEClass = null;

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
	private EEnum queryRelationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum disjuncTypeEEnum = null;

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
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GhaemiPackageImpl() {
		super(eNS_URI, GhaemiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GhaemiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GhaemiPackage init() {
		if (isInited) return (GhaemiPackage)EPackage.Registry.INSTANCE.getEPackage(GhaemiPackage.eNS_URI);

		// Obtain or create and register package
		GhaemiPackageImpl theGhaemiPackage = (GhaemiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GhaemiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GhaemiPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGhaemiPackage.createPackageContents();

		// Initialize created meta-data
		theGhaemiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGhaemiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GhaemiPackage.eNS_URI, theGhaemiPackage);
		return theGhaemiPackage;
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
	public EReference getNode_Subtypes() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_ID() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_AsOutput() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getLiteral_ConstantValue() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getField_TableName() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
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
	public EReference getFunction_Params() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_FuncRef() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getCallQuerySurface_QuerySurface() {
		return (EAttribute)callQuerySurfaceEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getInput_Name() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Index() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(1);
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
	public EReference getType_Subtypes() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtypes() {
		return subtypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypes_Parent() {
		return (EReference)subtypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtypes_Name() {
		return (EAttribute)subtypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurface() {
		return surfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurface_Type() {
		return (EReference)surfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurface_FuncDefs() {
		return (EReference)surfaceEClass.getEStructuralFeatures().get(1);
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
	public EReference getQuerySurface_Queryselectinstalment() {
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
	public EReference getQuerySurface_Outputinstalment() {
		return (EReference)querySurfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuerySurface_Inputinstalment() {
		return (EReference)querySurfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertSurface() {
		return insertSurfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateSurface() {
		return updateSurfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteSurface() {
		return deleteSurfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationShip() {
		return relationShipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationShip_DstNode() {
		return (EReference)relationShipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationShip_SrcNode() {
		return (EReference)relationShipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationShip_Type() {
		return (EAttribute)relationShipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryConditionalInstalmnet() {
		return queryConditionalInstalmnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryConditionalInstalmnet_Disjunctionrelationships() {
		return (EReference)queryConditionalInstalmnetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryConditionalInstalmnet_Disjunctions() {
		return (EReference)queryConditionalInstalmnetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuerySelectInstalment() {
		return querySelectInstalmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuerySelectInstalment_Nodes() {
		return (EReference)querySelectInstalmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuerySelectInstalment_Relationships() {
		return (EReference)querySelectInstalmentEClass.getEStructuralFeatures().get(1);
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
	public EReference getTerm_Operand_one() {
		return (EReference)termEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Operand_two() {
		return (EReference)termEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Operator() {
		return (EReference)termEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalOperator() {
		return conditionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalOperator_Type() {
		return (EAttribute)conditionalOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalOperator_Negative() {
		return (EAttribute)conditionalOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjunction() {
		return disjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisjunction_Type() {
		return (EAttribute)disjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjunction_Relations() {
		return (EReference)disjunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCondElement() {
		return abstractCondElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjunctionRelationship() {
		return disjunctionRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjunctionRelationship_Src() {
		return (EReference)disjunctionRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjunctionRelationship_Dst() {
		return (EReference)disjunctionRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncDefinition() {
		return funcDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuncDefinition_RetType() {
		return (EReference)funcDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuncDefinition_Params() {
		return (EReference)funcDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncDefinition_Name() {
		return (EAttribute)funcDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputNode() {
		return outputNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputNode_Index() {
		return (EAttribute)outputNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputNode_NodeRef() {
		return (EReference)outputNodeEClass.getEStructuralFeatures().get(1);
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
	public EReference getOutputInstalment_Outputnode() {
		return (EReference)outputInstalmentEClass.getEStructuralFeatures().get(0);
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
	public EReference getInputInstalment_Inputs() {
		return (EReference)inputInstalmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQueryRelationType() {
		return queryRelationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperatorType() {
		return operatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisjuncType() {
		return disjuncTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhaemiFactory getGhaemiFactory() {
		return (GhaemiFactory)getEFactoryInstance();
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
		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__TYPE);
		createEReference(nodeEClass, NODE__SUBTYPES);
		createEAttribute(nodeEClass, NODE__ID);
		createEAttribute(nodeEClass, NODE__AS_OUTPUT);

		literalEClass = createEClass(LITERAL);
		createEAttribute(literalEClass, LITERAL__CONSTANT_VALUE);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEAttribute(fieldEClass, FIELD__TABLE_NAME);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__PARAMS);
		createEReference(functionEClass, FUNCTION__FUNC_REF);

		callQuerySurfaceEClass = createEClass(CALL_QUERY_SURFACE);
		createEAttribute(callQuerySurfaceEClass, CALL_QUERY_SURFACE__QUERY_SURFACE);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__NAME);
		createEAttribute(inputEClass, INPUT__INDEX);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__SUBTYPES);
		createEAttribute(typeEClass, TYPE__NAME);

		subtypesEClass = createEClass(SUBTYPES);
		createEReference(subtypesEClass, SUBTYPES__PARENT);
		createEAttribute(subtypesEClass, SUBTYPES__NAME);

		surfaceEClass = createEClass(SURFACE);
		createEReference(surfaceEClass, SURFACE__TYPE);
		createEReference(surfaceEClass, SURFACE__FUNC_DEFS);

		querySurfaceEClass = createEClass(QUERY_SURFACE);
		createEReference(querySurfaceEClass, QUERY_SURFACE__OUTPUTINSTALMENT);
		createEReference(querySurfaceEClass, QUERY_SURFACE__QUERYSELECTINSTALMENT);
		createEReference(querySurfaceEClass, QUERY_SURFACE__WHERE_INSTALMENT);
		createEReference(querySurfaceEClass, QUERY_SURFACE__HAVING_INSTALMENT);
		createEReference(querySurfaceEClass, QUERY_SURFACE__INPUTINSTALMENT);

		insertSurfaceEClass = createEClass(INSERT_SURFACE);

		updateSurfaceEClass = createEClass(UPDATE_SURFACE);

		deleteSurfaceEClass = createEClass(DELETE_SURFACE);

		relationShipEClass = createEClass(RELATION_SHIP);
		createEReference(relationShipEClass, RELATION_SHIP__DST_NODE);
		createEReference(relationShipEClass, RELATION_SHIP__SRC_NODE);
		createEAttribute(relationShipEClass, RELATION_SHIP__TYPE);

		queryConditionalInstalmnetEClass = createEClass(QUERY_CONDITIONAL_INSTALMNET);
		createEReference(queryConditionalInstalmnetEClass, QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONRELATIONSHIPS);
		createEReference(queryConditionalInstalmnetEClass, QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONS);

		querySelectInstalmentEClass = createEClass(QUERY_SELECT_INSTALMENT);
		createEReference(querySelectInstalmentEClass, QUERY_SELECT_INSTALMENT__NODES);
		createEReference(querySelectInstalmentEClass, QUERY_SELECT_INSTALMENT__RELATIONSHIPS);

		termEClass = createEClass(TERM);
		createEReference(termEClass, TERM__OPERAND_ONE);
		createEReference(termEClass, TERM__OPERAND_TWO);
		createEReference(termEClass, TERM__OPERATOR);

		conditionalOperatorEClass = createEClass(CONDITIONAL_OPERATOR);
		createEAttribute(conditionalOperatorEClass, CONDITIONAL_OPERATOR__TYPE);
		createEAttribute(conditionalOperatorEClass, CONDITIONAL_OPERATOR__NEGATIVE);

		disjunctionEClass = createEClass(DISJUNCTION);
		createEAttribute(disjunctionEClass, DISJUNCTION__TYPE);
		createEReference(disjunctionEClass, DISJUNCTION__RELATIONS);

		abstractCondElementEClass = createEClass(ABSTRACT_COND_ELEMENT);

		disjunctionRelationshipEClass = createEClass(DISJUNCTION_RELATIONSHIP);
		createEReference(disjunctionRelationshipEClass, DISJUNCTION_RELATIONSHIP__SRC);
		createEReference(disjunctionRelationshipEClass, DISJUNCTION_RELATIONSHIP__DST);

		funcDefinitionEClass = createEClass(FUNC_DEFINITION);
		createEReference(funcDefinitionEClass, FUNC_DEFINITION__RET_TYPE);
		createEReference(funcDefinitionEClass, FUNC_DEFINITION__PARAMS);
		createEAttribute(funcDefinitionEClass, FUNC_DEFINITION__NAME);

		outputNodeEClass = createEClass(OUTPUT_NODE);
		createEAttribute(outputNodeEClass, OUTPUT_NODE__INDEX);
		createEReference(outputNodeEClass, OUTPUT_NODE__NODE_REF);

		outputInstalmentEClass = createEClass(OUTPUT_INSTALMENT);
		createEReference(outputInstalmentEClass, OUTPUT_INSTALMENT__OUTPUTNODE);

		inputInstalmentEClass = createEClass(INPUT_INSTALMENT);
		createEReference(inputInstalmentEClass, INPUT_INSTALMENT__INPUTS);

		// Create enums
		queryRelationTypeEEnum = createEEnum(QUERY_RELATION_TYPE);
		operatorTypeEEnum = createEEnum(OPERATOR_TYPE);
		disjuncTypeEEnum = createEEnum(DISJUNC_TYPE);
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
		literalEClass.getESuperTypes().add(this.getNode());
		fieldEClass.getESuperTypes().add(this.getNode());
		functionEClass.getESuperTypes().add(this.getNode());
		callQuerySurfaceEClass.getESuperTypes().add(this.getFunction());
		inputEClass.getESuperTypes().add(this.getNode());
		querySurfaceEClass.getESuperTypes().add(this.getSurface());
		insertSurfaceEClass.getESuperTypes().add(this.getSurface());
		updateSurfaceEClass.getESuperTypes().add(this.getSurface());
		deleteSurfaceEClass.getESuperTypes().add(this.getSurface());
		termEClass.getESuperTypes().add(this.getAbstractCondElement());
		disjunctionEClass.getESuperTypes().add(this.getAbstractCondElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Type(), this.getType(), null, "type", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Subtypes(), this.getSubtypes(), null, "subtypes", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_AsOutput(), ecorePackage.getEBoolean(), "asOutput", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteral_ConstantValue(), ecorePackage.getEString(), "constantValue", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Params(), this.getNode(), null, "params", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_FuncRef(), this.getFuncDefinition(), null, "funcRef", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callQuerySurfaceEClass, CallQuerySurface.class, "CallQuerySurface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallQuerySurface_QuerySurface(), ecorePackage.getEString(), "querySurface", null, 0, 1, CallQuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Name(), ecorePackage.getEString(), "name", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Index(), ecorePackage.getEInt(), "index", "0", 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Subtypes(), this.getSubtypes(), null, "subtypes", null, 1, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subtypesEClass, Subtypes.class, "Subtypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubtypes_Parent(), this.getType(), null, "parent", null, 1, 1, Subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubtypes_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surfaceEClass, Surface.class, "Surface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurface_Type(), this.getType(), null, "type", null, 0, -1, Surface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurface_FuncDefs(), this.getFuncDefinition(), null, "funcDefs", null, 0, -1, Surface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(querySurfaceEClass, QuerySurface.class, "QuerySurface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuerySurface_Outputinstalment(), this.getOutputInstalment(), null, "outputinstalment", null, 1, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuerySurface_Queryselectinstalment(), this.getQuerySelectInstalment(), null, "queryselectinstalment", null, 1, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuerySurface_WhereInstalment(), this.getQueryConditionalInstalmnet(), null, "whereInstalment", null, 1, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuerySurface_HavingInstalment(), this.getQueryConditionalInstalmnet(), null, "havingInstalment", null, 1, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuerySurface_Inputinstalment(), this.getInputInstalment(), null, "inputinstalment", null, 1, 1, QuerySurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertSurfaceEClass, InsertSurface.class, "InsertSurface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateSurfaceEClass, UpdateSurface.class, "UpdateSurface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteSurfaceEClass, DeleteSurface.class, "DeleteSurface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationShipEClass, RelationShip.class, "RelationShip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationShip_DstNode(), this.getNode(), null, "dstNode", null, 1, 1, RelationShip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationShip_SrcNode(), this.getNode(), null, "srcNode", null, 1, 1, RelationShip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationShip_Type(), this.getQueryRelationType(), "type", null, 0, 1, RelationShip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryConditionalInstalmnetEClass, QueryConditionalInstalmnet.class, "QueryConditionalInstalmnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryConditionalInstalmnet_Disjunctionrelationships(), this.getDisjunctionRelationship(), null, "disjunctionrelationships", null, 0, -1, QueryConditionalInstalmnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryConditionalInstalmnet_Disjunctions(), this.getDisjunction(), null, "disjunctions", null, 0, -1, QueryConditionalInstalmnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(querySelectInstalmentEClass, QuerySelectInstalment.class, "QuerySelectInstalment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuerySelectInstalment_Nodes(), this.getNode(), null, "nodes", null, 1, -1, QuerySelectInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuerySelectInstalment_Relationships(), this.getRelationShip(), null, "relationships", null, 0, -1, QuerySelectInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerm_Operand_one(), this.getNode(), null, "operand_one", null, 1, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_Operand_two(), this.getNode(), null, "operand_two", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_Operator(), this.getConditionalOperator(), null, "operator", null, 1, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalOperatorEClass, ConditionalOperator.class, "ConditionalOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionalOperator_Type(), this.getOperatorType(), "type", null, 0, 1, ConditionalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionalOperator_Negative(), ecorePackage.getEBoolean(), "negative", null, 0, 1, ConditionalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disjunctionEClass, Disjunction.class, "Disjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisjunction_Type(), this.getDisjuncType(), "type", null, 0, 1, Disjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisjunction_Relations(), this.getDisjunctionRelationship(), null, "relations", null, 0, -1, Disjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCondElementEClass, AbstractCondElement.class, "AbstractCondElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disjunctionRelationshipEClass, DisjunctionRelationship.class, "DisjunctionRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjunctionRelationship_Src(), this.getDisjunction(), null, "src", null, 1, 1, DisjunctionRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisjunctionRelationship_Dst(), this.getAbstractCondElement(), null, "dst", null, 1, 1, DisjunctionRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcDefinitionEClass, FuncDefinition.class, "FuncDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFuncDefinition_RetType(), this.getSubtypes(), null, "retType", null, 1, 1, FuncDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuncDefinition_Params(), this.getSubtypes(), null, "params", null, 0, -1, FuncDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuncDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, FuncDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputNodeEClass, OutputNode.class, "OutputNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputNode_Index(), ecorePackage.getEInt(), "index", "0", 0, 1, OutputNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputNode_NodeRef(), this.getNode(), null, "nodeRef", null, 1, 1, OutputNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputInstalmentEClass, OutputInstalment.class, "OutputInstalment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputInstalment_Outputnode(), this.getOutputNode(), null, "outputnode", null, 0, -1, OutputInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputInstalmentEClass, InputInstalment.class, "InputInstalment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputInstalment_Inputs(), this.getInput(), null, "inputs", null, 0, -1, InputInstalment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(queryRelationTypeEEnum, QueryRelationType.class, "QueryRelationType");
		addEEnumLiteral(queryRelationTypeEEnum, QueryRelationType.INNER_JOIN);
		addEEnumLiteral(queryRelationTypeEEnum, QueryRelationType.LEFT_OUTER_JOIN);
		addEEnumLiteral(queryRelationTypeEEnum, QueryRelationType.EIGHT_OUTER_JOIN);
		addEEnumLiteral(queryRelationTypeEEnum, QueryRelationType.FULL_OUTER_JOIN);

		initEEnum(operatorTypeEEnum, OperatorType.class, "OperatorType");
		addEEnumLiteral(operatorTypeEEnum, OperatorType.EQUAL);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.GR);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.GRE);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.LO);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.LOE);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.IN);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.BETWEEN);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.IS_NULL);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.EXIST);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.LIKE);

		initEEnum(disjuncTypeEEnum, DisjuncType.class, "DisjuncType");
		addEEnumLiteral(disjuncTypeEEnum, DisjuncType.OR);
		addEEnumLiteral(disjuncTypeEEnum, DisjuncType.AND);

		// Create resource
		createResource(eNS_URI);
	}

} //GhaemiPackageImpl
