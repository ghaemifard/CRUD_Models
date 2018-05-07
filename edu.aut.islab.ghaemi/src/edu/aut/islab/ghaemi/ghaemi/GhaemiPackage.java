/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiFactory
 * @model kind="package"
 * @generated
 */
public interface GhaemiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ghaemi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ghaemi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ghaemi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GhaemiPackage eINSTANCE = edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.NodeImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUBTYPES = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 2;

	/**
	 * The feature id for the '<em><b>As Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__AS_OUTPUT = 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.LiteralImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__SUBTYPES = NODE__SUBTYPES;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>As Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__AS_OUTPUT = NODE__AS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Constant Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__CONSTANT_VALUE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.FieldImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SUBTYPES = NODE__SUBTYPES;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>As Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__AS_OUTPUT = NODE__AS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TABLE_NAME = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.FunctionImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SUBTYPES = NODE__SUBTYPES;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>As Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__AS_OUTPUT = NODE__AS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMS = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Func Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FUNC_REF = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.CallQuerySurfaceImpl <em>Call Query Surface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.CallQuerySurfaceImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getCallQuerySurface()
	 * @generated
	 */
	int CALL_QUERY_SURFACE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__TYPE = FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__SUBTYPES = FUNCTION__SUBTYPES;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>As Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__AS_OUTPUT = FUNCTION__AS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__PARAMS = FUNCTION__PARAMS;

	/**
	 * The feature id for the '<em><b>Func Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__FUNC_REF = FUNCTION__FUNC_REF;

	/**
	 * The feature id for the '<em><b>Query Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__QUERY_SURFACE = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Query Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Query Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.InputImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SUBTYPES = NODE__SUBTYPES;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>As Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__AS_OUTPUT = NODE__AS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INDEX = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.TypeImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 6;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUBTYPES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.SubtypesImpl <em>Subtypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.SubtypesImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getSubtypes()
	 * @generated
	 */
	int SUBTYPES = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPES__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPES__NAME = 1;

	/**
	 * The number of structural features of the '<em>Subtypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subtypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.SurfaceImpl <em>Surface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.SurfaceImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getSurface()
	 * @generated
	 */
	int SURFACE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Func Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE__FUNC_DEFS = 1;

	/**
	 * The number of structural features of the '<em>Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.QuerySurfaceImpl <em>Query Surface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.QuerySurfaceImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getQuerySurface()
	 * @generated
	 */
	int QUERY_SURFACE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__TYPE = SURFACE__TYPE;

	/**
	 * The feature id for the '<em><b>Func Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__FUNC_DEFS = SURFACE__FUNC_DEFS;

	/**
	 * The feature id for the '<em><b>Outputinstalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__OUTPUTINSTALMENT = SURFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Queryselectinstalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__QUERYSELECTINSTALMENT = SURFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Where Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__WHERE_INSTALMENT = SURFACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Having Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__HAVING_INSTALMENT = SURFACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inputinstalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__INPUTINSTALMENT = SURFACE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Query Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE_FEATURE_COUNT = SURFACE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Query Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE_OPERATION_COUNT = SURFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.InsertSurfaceImpl <em>Insert Surface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.InsertSurfaceImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getInsertSurface()
	 * @generated
	 */
	int INSERT_SURFACE = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE__TYPE = SURFACE__TYPE;

	/**
	 * The feature id for the '<em><b>Func Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE__FUNC_DEFS = SURFACE__FUNC_DEFS;

	/**
	 * The number of structural features of the '<em>Insert Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE_FEATURE_COUNT = SURFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Insert Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE_OPERATION_COUNT = SURFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.UpdateSurfaceImpl <em>Update Surface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.UpdateSurfaceImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getUpdateSurface()
	 * @generated
	 */
	int UPDATE_SURFACE = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__TYPE = SURFACE__TYPE;

	/**
	 * The feature id for the '<em><b>Func Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__FUNC_DEFS = SURFACE__FUNC_DEFS;

	/**
	 * The number of structural features of the '<em>Update Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE_FEATURE_COUNT = SURFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE_OPERATION_COUNT = SURFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.DeleteSurfaceImpl <em>Delete Surface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.DeleteSurfaceImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getDeleteSurface()
	 * @generated
	 */
	int DELETE_SURFACE = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__TYPE = SURFACE__TYPE;

	/**
	 * The feature id for the '<em><b>Func Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__FUNC_DEFS = SURFACE__FUNC_DEFS;

	/**
	 * The number of structural features of the '<em>Delete Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE_FEATURE_COUNT = SURFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE_OPERATION_COUNT = SURFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.RelationShipImpl <em>Relation Ship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.RelationShipImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getRelationShip()
	 * @generated
	 */
	int RELATION_SHIP = 13;

	/**
	 * The feature id for the '<em><b>Dst Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SHIP__DST_NODE = 0;

	/**
	 * The feature id for the '<em><b>Src Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SHIP__SRC_NODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SHIP__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Relation Ship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relation Ship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.QueryConditionalInstalmnetImpl <em>Query Conditional Instalmnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.QueryConditionalInstalmnetImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getQueryConditionalInstalmnet()
	 * @generated
	 */
	int QUERY_CONDITIONAL_INSTALMNET = 14;

	/**
	 * The feature id for the '<em><b>Disjunctionrelationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONRELATIONSHIPS = 0;

	/**
	 * The feature id for the '<em><b>Disjunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONS = 1;

	/**
	 * The number of structural features of the '<em>Query Conditional Instalmnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONDITIONAL_INSTALMNET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Query Conditional Instalmnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONDITIONAL_INSTALMNET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.QuerySelectInstalmentImpl <em>Query Select Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.QuerySelectInstalmentImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getQuerySelectInstalment()
	 * @generated
	 */
	int QUERY_SELECT_INSTALMENT = 15;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SELECT_INSTALMENT__NODES = 0;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SELECT_INSTALMENT__RELATIONSHIPS = 1;

	/**
	 * The number of structural features of the '<em>Query Select Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SELECT_INSTALMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Query Select Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SELECT_INSTALMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.AbstractCondElementImpl <em>Abstract Cond Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.AbstractCondElementImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getAbstractCondElement()
	 * @generated
	 */
	int ABSTRACT_COND_ELEMENT = 19;

	/**
	 * The number of structural features of the '<em>Abstract Cond Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COND_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Cond Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COND_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.TermImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 16;

	/**
	 * The feature id for the '<em><b>Operand one</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__OPERAND_ONE = ABSTRACT_COND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand two</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__OPERAND_TWO = ABSTRACT_COND_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__OPERATOR = ABSTRACT_COND_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = ABSTRACT_COND_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = ABSTRACT_COND_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.ConditionalOperatorImpl <em>Conditional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.ConditionalOperatorImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getConditionalOperator()
	 * @generated
	 */
	int CONDITIONAL_OPERATOR = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATOR__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATOR__NEGATIVE = 1;

	/**
	 * The number of structural features of the '<em>Conditional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conditional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.DisjunctionImpl <em>Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.DisjunctionImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getDisjunction()
	 * @generated
	 */
	int DISJUNCTION = 18;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__TYPE = ABSTRACT_COND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__RELATIONS = ABSTRACT_COND_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_FEATURE_COUNT = ABSTRACT_COND_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_OPERATION_COUNT = ABSTRACT_COND_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.DisjunctionRelationshipImpl <em>Disjunction Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.DisjunctionRelationshipImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getDisjunctionRelationship()
	 * @generated
	 */
	int DISJUNCTION_RELATIONSHIP = 20;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_RELATIONSHIP__SRC = 0;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_RELATIONSHIP__DST = 1;

	/**
	 * The number of structural features of the '<em>Disjunction Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_RELATIONSHIP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Disjunction Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.FuncDefinitionImpl <em>Func Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.FuncDefinitionImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getFuncDefinition()
	 * @generated
	 */
	int FUNC_DEFINITION = 21;

	/**
	 * The feature id for the '<em><b>Ret Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_DEFINITION__RET_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_DEFINITION__PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_DEFINITION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Func Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Func Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.OutputNodeImpl <em>Output Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.OutputNodeImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getOutputNode()
	 * @generated
	 */
	int OUTPUT_NODE = 22;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Node Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE__NODE_REF = 1;

	/**
	 * The number of structural features of the '<em>Output Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.OutputInstalmentImpl <em>Output Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.OutputInstalmentImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getOutputInstalment()
	 * @generated
	 */
	int OUTPUT_INSTALMENT = 23;

	/**
	 * The feature id for the '<em><b>Outputnode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INSTALMENT__OUTPUTNODE = 0;

	/**
	 * The number of structural features of the '<em>Output Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INSTALMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INSTALMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.InputInstalmentImpl <em>Input Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.InputInstalmentImpl
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getInputInstalment()
	 * @generated
	 */
	int INPUT_INSTALMENT = 24;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INSTALMENT__INPUTS = 0;

	/**
	 * The number of structural features of the '<em>Input Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INSTALMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INSTALMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.QueryRelationType <em>Query Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.QueryRelationType
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getQueryRelationType()
	 * @generated
	 */
	int QUERY_RELATION_TYPE = 25;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.OperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.OperatorType
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getOperatorType()
	 * @generated
	 */
	int OPERATOR_TYPE = 26;

	/**
	 * The meta object id for the '{@link edu.aut.islab.ghaemi.ghaemi.DisjuncType <em>Disjunc Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.aut.islab.ghaemi.ghaemi.DisjuncType
	 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getDisjuncType()
	 * @generated
	 */
	int DISJUNC_TYPE = 27;


	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link edu.aut.islab.ghaemi.ghaemi.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Type();

	/**
	 * Returns the meta object for the reference '{@link edu.aut.islab.ghaemi.ghaemi.Node#getSubtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subtypes</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Node#getSubtypes()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Subtypes();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.Node#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Node#getID()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_ID();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.Node#isAsOutput <em>As Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As Output</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Node#isAsOutput()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_AsOutput();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.Literal#getConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Value</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Literal#getConstantValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_ConstantValue();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.Field#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Field#getTableName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_TableName();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.aut.islab.ghaemi.ghaemi.Function#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Function#getParams()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Params();

	/**
	 * Returns the meta object for the reference '{@link edu.aut.islab.ghaemi.ghaemi.Function#getFuncRef <em>Func Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Func Ref</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Function#getFuncRef()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_FuncRef();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.CallQuerySurface <em>Call Query Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Query Surface</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.CallQuerySurface
	 * @generated
	 */
	EClass getCallQuerySurface();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.CallQuerySurface#getQuerySurface <em>Query Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Surface</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.CallQuerySurface#getQuerySurface()
	 * @see #getCallQuerySurface()
	 * @generated
	 */
	EAttribute getCallQuerySurface_QuerySurface();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.Input#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Input#getIndex()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Index();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.aut.islab.ghaemi.ghaemi.Type#getSubtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtypes</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Type#getSubtypes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Subtypes();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.Subtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtypes</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Subtypes
	 * @generated
	 */
	EClass getSubtypes();

	/**
	 * Returns the meta object for the reference '{@link edu.aut.islab.ghaemi.ghaemi.Subtypes#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Subtypes#getParent()
	 * @see #getSubtypes()
	 * @generated
	 */
	EReference getSubtypes_Parent();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.Subtypes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Subtypes#getName()
	 * @see #getSubtypes()
	 * @generated
	 */
	EAttribute getSubtypes_Name();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.Surface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Surface
	 * @generated
	 */
	EClass getSurface();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.aut.islab.ghaemi.ghaemi.Surface#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Surface#getType()
	 * @see #getSurface()
	 * @generated
	 */
	EReference getSurface_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.aut.islab.ghaemi.ghaemi.Surface#getFuncDefs <em>Func Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Func Defs</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Surface#getFuncDefs()
	 * @see #getSurface()
	 * @generated
	 */
	EReference getSurface_FuncDefs();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface <em>Query Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Surface</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.QuerySurface
	 * @generated
	 */
	EClass getQuerySurface();

	/**
	 * Returns the meta object for the containment reference '{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getQueryselectinstalment <em>Queryselectinstalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queryselectinstalment</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.QuerySurface#getQueryselectinstalment()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EReference getQuerySurface_Queryselectinstalment();

	/**
	 * Returns the meta object for the containment reference '{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getWhereInstalment <em>Where Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where Instalment</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.QuerySurface#getWhereInstalment()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EReference getQuerySurface_WhereInstalment();

	/**
	 * Returns the meta object for the containment reference '{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getHavingInstalment <em>Having Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Having Instalment</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.QuerySurface#getHavingInstalment()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EReference getQuerySurface_HavingInstalment();

	/**
	 * Returns the meta object for the containment reference '{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getOutputinstalment <em>Outputinstalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputinstalment</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.QuerySurface#getOutputinstalment()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EReference getQuerySurface_Outputinstalment();

	/**
	 * Returns the meta object for the containment reference '{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getInputinstalment <em>Inputinstalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputinstalment</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.QuerySurface#getInputinstalment()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EReference getQuerySurface_Inputinstalment();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.InsertSurface <em>Insert Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Surface</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.InsertSurface
	 * @generated
	 */
	EClass getInsertSurface();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.UpdateSurface <em>Update Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Surface</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.UpdateSurface
	 * @generated
	 */
	EClass getUpdateSurface();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.DeleteSurface <em>Delete Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Surface</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.DeleteSurface
	 * @generated
	 */
	EClass getDeleteSurface();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.RelationShip <em>Relation Ship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Ship</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.RelationShip
	 * @generated
	 */
	EClass getRelationShip();

	/**
	 * Returns the meta object for the reference '{@link edu.aut.islab.ghaemi.ghaemi.RelationShip#getDstNode <em>Dst Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dst Node</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.RelationShip#getDstNode()
	 * @see #getRelationShip()
	 * @generated
	 */
	EReference getRelationShip_DstNode();

	/**
	 * Returns the meta object for the reference '{@link edu.aut.islab.ghaemi.ghaemi.RelationShip#getSrcNode <em>Src Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src Node</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.RelationShip#getSrcNode()
	 * @see #getRelationShip()
	 * @generated
	 */
	EReference getRelationShip_SrcNode();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.RelationShip#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.RelationShip#getType()
	 * @see #getRelationShip()
	 * @generated
	 */
	EAttribute getRelationShip_Type();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.QueryConditionalInstalmnet <em>Query Conditional Instalmnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Conditional Instalmnet</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.QueryConditionalInstalmnet
	 * @generated
	 */
	EClass getQueryConditionalInstalmnet();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.aut.islab.ghaemi.ghaemi.QueryConditionalInstalmnet#getDisjunctionrelationships <em>Disjunctionrelationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disjunctionrelationships</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.QueryConditionalInstalmnet#getDisjunctionrelationships()
	 * @see #getQueryConditionalInstalmnet()
	 * @generated
	 */
	EReference getQueryConditionalInstalmnet_Disjunctionrelationships();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.aut.islab.ghaemi.ghaemi.QueryConditionalInstalmnet#getDisjunctions <em>Disjunctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disjunctions</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.QueryConditionalInstalmnet#getDisjunctions()
	 * @see #getQueryConditionalInstalmnet()
	 * @generated
	 */
	EReference getQueryConditionalInstalmnet_Disjunctions();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.QuerySelectInstalment <em>Query Select Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Select Instalment</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.QuerySelectInstalment
	 * @generated
	 */
	EClass getQuerySelectInstalment();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.aut.islab.ghaemi.ghaemi.QuerySelectInstalment#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.QuerySelectInstalment#getNodes()
	 * @see #getQuerySelectInstalment()
	 * @generated
	 */
	EReference getQuerySelectInstalment_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.aut.islab.ghaemi.ghaemi.QuerySelectInstalment#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.QuerySelectInstalment#getRelationships()
	 * @see #getQuerySelectInstalment()
	 * @generated
	 */
	EReference getQuerySelectInstalment_Relationships();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the reference '{@link edu.aut.islab.ghaemi.ghaemi.Term#getOperand_one <em>Operand one</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand one</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Term#getOperand_one()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Operand_one();

	/**
	 * Returns the meta object for the reference '{@link edu.aut.islab.ghaemi.ghaemi.Term#getOperand_two <em>Operand two</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand two</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Term#getOperand_two()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Operand_two();

	/**
	 * Returns the meta object for the reference '{@link edu.aut.islab.ghaemi.ghaemi.Term#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operator</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Term#getOperator()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Operator();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.ConditionalOperator <em>Conditional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Operator</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.ConditionalOperator
	 * @generated
	 */
	EClass getConditionalOperator();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.ConditionalOperator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.ConditionalOperator#getType()
	 * @see #getConditionalOperator()
	 * @generated
	 */
	EAttribute getConditionalOperator_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.ConditionalOperator#isNegative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.ConditionalOperator#isNegative()
	 * @see #getConditionalOperator()
	 * @generated
	 */
	EAttribute getConditionalOperator_Negative();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjunction</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Disjunction
	 * @generated
	 */
	EClass getDisjunction();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.Disjunction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Disjunction#getType()
	 * @see #getDisjunction()
	 * @generated
	 */
	EAttribute getDisjunction_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.aut.islab.ghaemi.ghaemi.Disjunction#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.Disjunction#getRelations()
	 * @see #getDisjunction()
	 * @generated
	 */
	EReference getDisjunction_Relations();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.AbstractCondElement <em>Abstract Cond Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Cond Element</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.AbstractCondElement
	 * @generated
	 */
	EClass getAbstractCondElement();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship <em>Disjunction Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjunction Relationship</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship
	 * @generated
	 */
	EClass getDisjunctionRelationship();

	/**
	 * Returns the meta object for the reference '{@link edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship#getSrc()
	 * @see #getDisjunctionRelationship()
	 * @generated
	 */
	EReference getDisjunctionRelationship_Src();

	/**
	 * Returns the meta object for the reference '{@link edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship#getDst <em>Dst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dst</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship#getDst()
	 * @see #getDisjunctionRelationship()
	 * @generated
	 */
	EReference getDisjunctionRelationship_Dst();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.FuncDefinition <em>Func Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Func Definition</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.FuncDefinition
	 * @generated
	 */
	EClass getFuncDefinition();

	/**
	 * Returns the meta object for the reference '{@link edu.aut.islab.ghaemi.ghaemi.FuncDefinition#getRetType <em>Ret Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ret Type</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.FuncDefinition#getRetType()
	 * @see #getFuncDefinition()
	 * @generated
	 */
	EReference getFuncDefinition_RetType();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.aut.islab.ghaemi.ghaemi.FuncDefinition#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.FuncDefinition#getParams()
	 * @see #getFuncDefinition()
	 * @generated
	 */
	EReference getFuncDefinition_Params();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.FuncDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.FuncDefinition#getName()
	 * @see #getFuncDefinition()
	 * @generated
	 */
	EAttribute getFuncDefinition_Name();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.OutputNode <em>Output Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Node</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.OutputNode
	 * @generated
	 */
	EClass getOutputNode();

	/**
	 * Returns the meta object for the attribute '{@link edu.aut.islab.ghaemi.ghaemi.OutputNode#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.OutputNode#getIndex()
	 * @see #getOutputNode()
	 * @generated
	 */
	EAttribute getOutputNode_Index();

	/**
	 * Returns the meta object for the reference '{@link edu.aut.islab.ghaemi.ghaemi.OutputNode#getNodeRef <em>Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Ref</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.OutputNode#getNodeRef()
	 * @see #getOutputNode()
	 * @generated
	 */
	EReference getOutputNode_NodeRef();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.OutputInstalment <em>Output Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Instalment</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.OutputInstalment
	 * @generated
	 */
	EClass getOutputInstalment();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.aut.islab.ghaemi.ghaemi.OutputInstalment#getOutputnode <em>Outputnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputnode</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.OutputInstalment#getOutputnode()
	 * @see #getOutputInstalment()
	 * @generated
	 */
	EReference getOutputInstalment_Outputnode();

	/**
	 * Returns the meta object for class '{@link edu.aut.islab.ghaemi.ghaemi.InputInstalment <em>Input Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Instalment</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.InputInstalment
	 * @generated
	 */
	EClass getInputInstalment();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.aut.islab.ghaemi.ghaemi.InputInstalment#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.InputInstalment#getInputs()
	 * @see #getInputInstalment()
	 * @generated
	 */
	EReference getInputInstalment_Inputs();

	/**
	 * Returns the meta object for enum '{@link edu.aut.islab.ghaemi.ghaemi.QueryRelationType <em>Query Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Query Relation Type</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.QueryRelationType
	 * @generated
	 */
	EEnum getQueryRelationType();

	/**
	 * Returns the meta object for enum '{@link edu.aut.islab.ghaemi.ghaemi.OperatorType <em>Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Type</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.OperatorType
	 * @generated
	 */
	EEnum getOperatorType();

	/**
	 * Returns the meta object for enum '{@link edu.aut.islab.ghaemi.ghaemi.DisjuncType <em>Disjunc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Disjunc Type</em>'.
	 * @see edu.aut.islab.ghaemi.ghaemi.DisjuncType
	 * @generated
	 */
	EEnum getDisjuncType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GhaemiFactory getGhaemiFactory();

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
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.NodeImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '<em><b>Subtypes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUBTYPES = eINSTANCE.getNode_Subtypes();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_ID();

		/**
		 * The meta object literal for the '<em><b>As Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__AS_OUTPUT = eINSTANCE.getNode_AsOutput();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.LiteralImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Constant Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__CONSTANT_VALUE = eINSTANCE.getLiteral_ConstantValue();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.FieldImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TABLE_NAME = eINSTANCE.getField_TableName();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.FunctionImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMS = eINSTANCE.getFunction_Params();

		/**
		 * The meta object literal for the '<em><b>Func Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__FUNC_REF = eINSTANCE.getFunction_FuncRef();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.CallQuerySurfaceImpl <em>Call Query Surface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.CallQuerySurfaceImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getCallQuerySurface()
		 * @generated
		 */
		EClass CALL_QUERY_SURFACE = eINSTANCE.getCallQuerySurface();

		/**
		 * The meta object literal for the '<em><b>Query Surface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_QUERY_SURFACE__QUERY_SURFACE = eINSTANCE.getCallQuerySurface_QuerySurface();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.InputImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__INDEX = eINSTANCE.getInput_Index();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.TypeImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Subtypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__SUBTYPES = eINSTANCE.getType_Subtypes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.SubtypesImpl <em>Subtypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.SubtypesImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getSubtypes()
		 * @generated
		 */
		EClass SUBTYPES = eINSTANCE.getSubtypes();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTYPES__PARENT = eINSTANCE.getSubtypes_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTYPES__NAME = eINSTANCE.getSubtypes_Name();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.SurfaceImpl <em>Surface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.SurfaceImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getSurface()
		 * @generated
		 */
		EClass SURFACE = eINSTANCE.getSurface();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURFACE__TYPE = eINSTANCE.getSurface_Type();

		/**
		 * The meta object literal for the '<em><b>Func Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURFACE__FUNC_DEFS = eINSTANCE.getSurface_FuncDefs();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.QuerySurfaceImpl <em>Query Surface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.QuerySurfaceImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getQuerySurface()
		 * @generated
		 */
		EClass QUERY_SURFACE = eINSTANCE.getQuerySurface();

		/**
		 * The meta object literal for the '<em><b>Queryselectinstalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SURFACE__QUERYSELECTINSTALMENT = eINSTANCE.getQuerySurface_Queryselectinstalment();

		/**
		 * The meta object literal for the '<em><b>Where Instalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SURFACE__WHERE_INSTALMENT = eINSTANCE.getQuerySurface_WhereInstalment();

		/**
		 * The meta object literal for the '<em><b>Having Instalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SURFACE__HAVING_INSTALMENT = eINSTANCE.getQuerySurface_HavingInstalment();

		/**
		 * The meta object literal for the '<em><b>Outputinstalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SURFACE__OUTPUTINSTALMENT = eINSTANCE.getQuerySurface_Outputinstalment();

		/**
		 * The meta object literal for the '<em><b>Inputinstalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SURFACE__INPUTINSTALMENT = eINSTANCE.getQuerySurface_Inputinstalment();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.InsertSurfaceImpl <em>Insert Surface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.InsertSurfaceImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getInsertSurface()
		 * @generated
		 */
		EClass INSERT_SURFACE = eINSTANCE.getInsertSurface();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.UpdateSurfaceImpl <em>Update Surface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.UpdateSurfaceImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getUpdateSurface()
		 * @generated
		 */
		EClass UPDATE_SURFACE = eINSTANCE.getUpdateSurface();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.DeleteSurfaceImpl <em>Delete Surface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.DeleteSurfaceImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getDeleteSurface()
		 * @generated
		 */
		EClass DELETE_SURFACE = eINSTANCE.getDeleteSurface();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.RelationShipImpl <em>Relation Ship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.RelationShipImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getRelationShip()
		 * @generated
		 */
		EClass RELATION_SHIP = eINSTANCE.getRelationShip();

		/**
		 * The meta object literal for the '<em><b>Dst Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_SHIP__DST_NODE = eINSTANCE.getRelationShip_DstNode();

		/**
		 * The meta object literal for the '<em><b>Src Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_SHIP__SRC_NODE = eINSTANCE.getRelationShip_SrcNode();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_SHIP__TYPE = eINSTANCE.getRelationShip_Type();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.QueryConditionalInstalmnetImpl <em>Query Conditional Instalmnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.QueryConditionalInstalmnetImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getQueryConditionalInstalmnet()
		 * @generated
		 */
		EClass QUERY_CONDITIONAL_INSTALMNET = eINSTANCE.getQueryConditionalInstalmnet();

		/**
		 * The meta object literal for the '<em><b>Disjunctionrelationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONRELATIONSHIPS = eINSTANCE.getQueryConditionalInstalmnet_Disjunctionrelationships();

		/**
		 * The meta object literal for the '<em><b>Disjunctions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONS = eINSTANCE.getQueryConditionalInstalmnet_Disjunctions();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.QuerySelectInstalmentImpl <em>Query Select Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.QuerySelectInstalmentImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getQuerySelectInstalment()
		 * @generated
		 */
		EClass QUERY_SELECT_INSTALMENT = eINSTANCE.getQuerySelectInstalment();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SELECT_INSTALMENT__NODES = eINSTANCE.getQuerySelectInstalment_Nodes();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SELECT_INSTALMENT__RELATIONSHIPS = eINSTANCE.getQuerySelectInstalment_Relationships();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.TermImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Operand one</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__OPERAND_ONE = eINSTANCE.getTerm_Operand_one();

		/**
		 * The meta object literal for the '<em><b>Operand two</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__OPERAND_TWO = eINSTANCE.getTerm_Operand_two();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__OPERATOR = eINSTANCE.getTerm_Operator();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.ConditionalOperatorImpl <em>Conditional Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.ConditionalOperatorImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getConditionalOperator()
		 * @generated
		 */
		EClass CONDITIONAL_OPERATOR = eINSTANCE.getConditionalOperator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_OPERATOR__TYPE = eINSTANCE.getConditionalOperator_Type();

		/**
		 * The meta object literal for the '<em><b>Negative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_OPERATOR__NEGATIVE = eINSTANCE.getConditionalOperator_Negative();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.DisjunctionImpl <em>Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.DisjunctionImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getDisjunction()
		 * @generated
		 */
		EClass DISJUNCTION = eINSTANCE.getDisjunction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISJUNCTION__TYPE = eINSTANCE.getDisjunction_Type();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJUNCTION__RELATIONS = eINSTANCE.getDisjunction_Relations();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.AbstractCondElementImpl <em>Abstract Cond Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.AbstractCondElementImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getAbstractCondElement()
		 * @generated
		 */
		EClass ABSTRACT_COND_ELEMENT = eINSTANCE.getAbstractCondElement();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.DisjunctionRelationshipImpl <em>Disjunction Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.DisjunctionRelationshipImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getDisjunctionRelationship()
		 * @generated
		 */
		EClass DISJUNCTION_RELATIONSHIP = eINSTANCE.getDisjunctionRelationship();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJUNCTION_RELATIONSHIP__SRC = eINSTANCE.getDisjunctionRelationship_Src();

		/**
		 * The meta object literal for the '<em><b>Dst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJUNCTION_RELATIONSHIP__DST = eINSTANCE.getDisjunctionRelationship_Dst();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.FuncDefinitionImpl <em>Func Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.FuncDefinitionImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getFuncDefinition()
		 * @generated
		 */
		EClass FUNC_DEFINITION = eINSTANCE.getFuncDefinition();

		/**
		 * The meta object literal for the '<em><b>Ret Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNC_DEFINITION__RET_TYPE = eINSTANCE.getFuncDefinition_RetType();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNC_DEFINITION__PARAMS = eINSTANCE.getFuncDefinition_Params();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNC_DEFINITION__NAME = eINSTANCE.getFuncDefinition_Name();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.OutputNodeImpl <em>Output Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.OutputNodeImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getOutputNode()
		 * @generated
		 */
		EClass OUTPUT_NODE = eINSTANCE.getOutputNode();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_NODE__INDEX = eINSTANCE.getOutputNode_Index();

		/**
		 * The meta object literal for the '<em><b>Node Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_NODE__NODE_REF = eINSTANCE.getOutputNode_NodeRef();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.OutputInstalmentImpl <em>Output Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.OutputInstalmentImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getOutputInstalment()
		 * @generated
		 */
		EClass OUTPUT_INSTALMENT = eINSTANCE.getOutputInstalment();

		/**
		 * The meta object literal for the '<em><b>Outputnode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_INSTALMENT__OUTPUTNODE = eINSTANCE.getOutputInstalment_Outputnode();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.impl.InputInstalmentImpl <em>Input Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.InputInstalmentImpl
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getInputInstalment()
		 * @generated
		 */
		EClass INPUT_INSTALMENT = eINSTANCE.getInputInstalment();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_INSTALMENT__INPUTS = eINSTANCE.getInputInstalment_Inputs();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.QueryRelationType <em>Query Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.QueryRelationType
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getQueryRelationType()
		 * @generated
		 */
		EEnum QUERY_RELATION_TYPE = eINSTANCE.getQueryRelationType();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.OperatorType <em>Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.OperatorType
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getOperatorType()
		 * @generated
		 */
		EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

		/**
		 * The meta object literal for the '{@link edu.aut.islab.ghaemi.ghaemi.DisjuncType <em>Disjunc Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.aut.islab.ghaemi.ghaemi.DisjuncType
		 * @see edu.aut.islab.ghaemi.ghaemi.impl.GhaemiPackageImpl#getDisjuncType()
		 * @generated
		 */
		EEnum DISJUNC_TYPE = eINSTANCE.getDisjuncType();

	}

} //GhaemiPackage
