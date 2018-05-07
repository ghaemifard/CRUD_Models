/**
 */
package insert;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see insert.InsertFactory
 * @model kind="package"
 * @generated
 */
public interface InsertPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "insert";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.insert.it.is/v1.0/beta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "insert";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InsertPackage eINSTANCE = insert.impl.InsertPackageImpl.init();

	/**
	 * The meta object id for the '{@link insert.impl.InsertSurfaceImpl <em>Surface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.InsertSurfaceImpl
	 * @see insert.impl.InsertPackageImpl#getInsertSurface()
	 * @generated
	 */
	int INSERT_SURFACE = 0;

	/**
	 * The feature id for the '<em><b>Input Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE__INPUT_INSTALMENT = 0;

	/**
	 * The feature id for the '<em><b>Prepare List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE__PREPARE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Table Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE__TABLE_INSTALMENT = 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE__TYPES = 3;

	/**
	 * The feature id for the '<em><b>Funcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE__FUNCS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Associated Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE__ASSOCIATED_CLASS = 7;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE__USER_NAME = 8;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE__PASSWORD = 9;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE__URI = 10;

	/**
	 * The number of structural features of the '<em>Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_SURFACE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link insert.impl.PrepareListImpl <em>Prepare List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.PrepareListImpl
	 * @see insert.impl.InsertPackageImpl#getPrepareList()
	 * @generated
	 */
	int PREPARE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARE_LIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARE_LIST__NODES = 1;

	/**
	 * The number of structural features of the '<em>Prepare List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARE_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link insert.impl.InputInstalmentImpl <em>Input Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.InputInstalmentImpl
	 * @see insert.impl.InsertPackageImpl#getInputInstalment()
	 * @generated
	 */
	int INPUT_INSTALMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INSTALMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INSTALMENT__INPUTS = 1;

	/**
	 * The number of structural features of the '<em>Input Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INSTALMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link insert.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.AbstractNodeImpl
	 * @see insert.impl.InsertPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 3;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link insert.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.TableImpl
	 * @see insert.impl.InsertPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FIELDS = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link insert.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.NodeImpl
	 * @see insert.impl.InsertPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUBTYPE = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LISTABLE = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COLUMN_NAME = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link insert.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.FieldImpl
	 * @see insert.impl.InsertPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SUBTYPE = NODE__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__LISTABLE = NODE__LISTABLE;

	/**
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COLUMN_NAME = NODE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TABLE = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TABLE_NAME = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Table ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TABLE_REF = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Distict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DISTICT = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link insert.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.LiteralImpl
	 * @see insert.impl.InsertPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__SUBTYPE = NODE__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LISTABLE = NODE__LISTABLE;

	/**
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__COLUMN_NAME = NODE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ltype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LTYPE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link insert.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.NullLiteralImpl
	 * @see insert.impl.InsertPackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__SUBTYPE = NODE__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__LISTABLE = NODE__LISTABLE;

	/**
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__COLUMN_NAME = NODE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__VALUE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link insert.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.FunctionImpl
	 * @see insert.impl.InsertPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SUBTYPE = NODE__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LISTABLE = NODE__LISTABLE;

	/**
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__COLUMN_NAME = NODE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Func Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FUNC_DEF = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMS = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link insert.impl.FunctionDefImpl <em>Function Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.FunctionDefImpl
	 * @see insert.impl.InsertPackageImpl#getFunctionDef()
	 * @generated
	 */
	int FUNCTION_DEF = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__RETURNTYPE = 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__ARGS = 2;

	/**
	 * The number of structural features of the '<em>Function Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link insert.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.InputImpl
	 * @see insert.impl.InsertPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SUBTYPE = NODE__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__LISTABLE = NODE__LISTABLE;

	/**
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__COLUMN_NAME = NODE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Inp Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INP_DEF = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link insert.impl.InputDefImpl <em>Input Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.InputDefImpl
	 * @see insert.impl.InsertPackageImpl#getInputDef()
	 * @generated
	 */
	int INPUT_DEF = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEF__INDEX = 1;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEF__LISTABLE = 2;

	/**
	 * The number of structural features of the '<em>Input Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEF_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link insert.impl.InputStringDefImpl <em>Input String Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.InputStringDefImpl
	 * @see insert.impl.InsertPackageImpl#getInputStringDef()
	 * @generated
	 */
	int INPUT_STRING_DEF = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STRING_DEF__NAME = INPUT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STRING_DEF__INDEX = INPUT_DEF__INDEX;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STRING_DEF__LISTABLE = INPUT_DEF__LISTABLE;

	/**
	 * The number of structural features of the '<em>Input String Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STRING_DEF_FEATURE_COUNT = INPUT_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link insert.impl.InputIntDefImpl <em>Input Int Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.InputIntDefImpl
	 * @see insert.impl.InsertPackageImpl#getInputIntDef()
	 * @generated
	 */
	int INPUT_INT_DEF = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INT_DEF__NAME = INPUT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INT_DEF__INDEX = INPUT_DEF__INDEX;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INT_DEF__LISTABLE = INPUT_DEF__LISTABLE;

	/**
	 * The number of structural features of the '<em>Input Int Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INT_DEF_FEATURE_COUNT = INPUT_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link insert.impl.InputDateDefImpl <em>Input Date Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.InputDateDefImpl
	 * @see insert.impl.InsertPackageImpl#getInputDateDef()
	 * @generated
	 */
	int INPUT_DATE_DEF = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_DEF__NAME = INPUT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_DEF__INDEX = INPUT_DEF__INDEX;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_DEF__LISTABLE = INPUT_DEF__LISTABLE;

	/**
	 * The number of structural features of the '<em>Input Date Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_DEF_FEATURE_COUNT = INPUT_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link insert.impl.InputBitsDefImpl <em>Input Bits Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.InputBitsDefImpl
	 * @see insert.impl.InsertPackageImpl#getInputBitsDef()
	 * @generated
	 */
	int INPUT_BITS_DEF = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BITS_DEF__NAME = INPUT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BITS_DEF__INDEX = INPUT_DEF__INDEX;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BITS_DEF__LISTABLE = INPUT_DEF__LISTABLE;

	/**
	 * The number of structural features of the '<em>Input Bits Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BITS_DEF_FEATURE_COUNT = INPUT_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link insert.impl.InputFloatDefImpl <em>Input Float Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.InputFloatDefImpl
	 * @see insert.impl.InsertPackageImpl#getInputFloatDef()
	 * @generated
	 */
	int INPUT_FLOAT_DEF = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FLOAT_DEF__NAME = INPUT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FLOAT_DEF__INDEX = INPUT_DEF__INDEX;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FLOAT_DEF__LISTABLE = INPUT_DEF__LISTABLE;

	/**
	 * The number of structural features of the '<em>Input Float Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FLOAT_DEF_FEATURE_COUNT = INPUT_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link insert.impl.CallSurfaceQueryImpl <em>Call Surface Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.CallSurfaceQueryImpl
	 * @see insert.impl.InsertPackageImpl#getCallSurfaceQuery()
	 * @generated
	 */
	int CALL_SURFACE_QUERY = 18;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SURFACE_QUERY__TYPE = FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SURFACE_QUERY__SUBTYPE = FUNCTION__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SURFACE_QUERY__LISTABLE = FUNCTION__LISTABLE;

	/**
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SURFACE_QUERY__COLUMN_NAME = FUNCTION__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SURFACE_QUERY__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Func Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SURFACE_QUERY__FUNC_DEF = FUNCTION__FUNC_DEF;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SURFACE_QUERY__PARAMS = FUNCTION__PARAMS;

	/**
	 * The feature id for the '<em><b>Surface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SURFACE_QUERY__SURFACE_NAME = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Surface Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SURFACE_QUERY_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link insert.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.TypeImpl
	 * @see insert.impl.InsertPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUBTYPES = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link insert.impl.SubtypeImpl <em>Subtype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.impl.SubtypeImpl
	 * @see insert.impl.InsertPackageImpl#getSubtype()
	 * @generated
	 */
	int SUBTYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Subtype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link insert.LiteralType <em>Literal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see insert.LiteralType
	 * @see insert.impl.InsertPackageImpl#getLiteralType()
	 * @generated
	 */
	int LITERAL_TYPE = 21;


	/**
	 * Returns the meta object for class '{@link insert.InsertSurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface</em>'.
	 * @see insert.InsertSurface
	 * @generated
	 */
	EClass getInsertSurface();

	/**
	 * Returns the meta object for the containment reference '{@link insert.InsertSurface#getInputInstalment <em>Input Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Instalment</em>'.
	 * @see insert.InsertSurface#getInputInstalment()
	 * @see #getInsertSurface()
	 * @generated
	 */
	EReference getInsertSurface_InputInstalment();

	/**
	 * Returns the meta object for the containment reference '{@link insert.InsertSurface#getPrepareList <em>Prepare List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prepare List</em>'.
	 * @see insert.InsertSurface#getPrepareList()
	 * @see #getInsertSurface()
	 * @generated
	 */
	EReference getInsertSurface_PrepareList();

	/**
	 * Returns the meta object for the containment reference '{@link insert.InsertSurface#getTableInstalment <em>Table Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Instalment</em>'.
	 * @see insert.InsertSurface#getTableInstalment()
	 * @see #getInsertSurface()
	 * @generated
	 */
	EReference getInsertSurface_TableInstalment();

	/**
	 * Returns the meta object for the reference list '{@link insert.InsertSurface#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see insert.InsertSurface#getTypes()
	 * @see #getInsertSurface()
	 * @generated
	 */
	EReference getInsertSurface_Types();

	/**
	 * Returns the meta object for the reference list '{@link insert.InsertSurface#getFuncs <em>Funcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Funcs</em>'.
	 * @see insert.InsertSurface#getFuncs()
	 * @see #getInsertSurface()
	 * @generated
	 */
	EReference getInsertSurface_Funcs();

	/**
	 * Returns the meta object for the attribute '{@link insert.InsertSurface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see insert.InsertSurface#getName()
	 * @see #getInsertSurface()
	 * @generated
	 */
	EAttribute getInsertSurface_Name();

	/**
	 * Returns the meta object for the attribute '{@link insert.InsertSurface#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see insert.InsertSurface#getDescription()
	 * @see #getInsertSurface()
	 * @generated
	 */
	EAttribute getInsertSurface_Description();

	/**
	 * Returns the meta object for the attribute '{@link insert.InsertSurface#getAssociatedClass <em>Associated Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated Class</em>'.
	 * @see insert.InsertSurface#getAssociatedClass()
	 * @see #getInsertSurface()
	 * @generated
	 */
	EAttribute getInsertSurface_AssociatedClass();

	/**
	 * Returns the meta object for the attribute '{@link insert.InsertSurface#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see insert.InsertSurface#getUserName()
	 * @see #getInsertSurface()
	 * @generated
	 */
	EAttribute getInsertSurface_UserName();

	/**
	 * Returns the meta object for the attribute '{@link insert.InsertSurface#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see insert.InsertSurface#getPassword()
	 * @see #getInsertSurface()
	 * @generated
	 */
	EAttribute getInsertSurface_Password();

	/**
	 * Returns the meta object for the attribute '{@link insert.InsertSurface#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see insert.InsertSurface#getUri()
	 * @see #getInsertSurface()
	 * @generated
	 */
	EAttribute getInsertSurface_Uri();

	/**
	 * Returns the meta object for class '{@link insert.PrepareList <em>Prepare List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepare List</em>'.
	 * @see insert.PrepareList
	 * @generated
	 */
	EClass getPrepareList();

	/**
	 * Returns the meta object for the attribute '{@link insert.PrepareList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see insert.PrepareList#getName()
	 * @see #getPrepareList()
	 * @generated
	 */
	EAttribute getPrepareList_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link insert.PrepareList#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see insert.PrepareList#getNodes()
	 * @see #getPrepareList()
	 * @generated
	 */
	EReference getPrepareList_Nodes();

	/**
	 * Returns the meta object for class '{@link insert.InputInstalment <em>Input Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Instalment</em>'.
	 * @see insert.InputInstalment
	 * @generated
	 */
	EClass getInputInstalment();

	/**
	 * Returns the meta object for the attribute '{@link insert.InputInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see insert.InputInstalment#getName()
	 * @see #getInputInstalment()
	 * @generated
	 */
	EAttribute getInputInstalment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link insert.InputInstalment#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see insert.InputInstalment#getInputs()
	 * @see #getInputInstalment()
	 * @generated
	 */
	EReference getInputInstalment_Inputs();

	/**
	 * Returns the meta object for class '{@link insert.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see insert.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for class '{@link insert.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see insert.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link insert.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see insert.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link insert.Table#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see insert.Table#getFields()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Fields();

	/**
	 * Returns the meta object for class '{@link insert.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see insert.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link insert.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see insert.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Type();

	/**
	 * Returns the meta object for the reference '{@link insert.Node#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subtype</em>'.
	 * @see insert.Node#getSubtype()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link insert.Node#isListable <em>Listable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listable</em>'.
	 * @see insert.Node#isListable()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Listable();

	/**
	 * Returns the meta object for the attribute '{@link insert.Node#getColumn_name <em>Column name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column name</em>'.
	 * @see insert.Node#getColumn_name()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Column_name();

	/**
	 * Returns the meta object for class '{@link insert.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see insert.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link insert.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see insert.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the container reference '{@link insert.Field#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see insert.Field#getTable()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Table();

	/**
	 * Returns the meta object for the attribute '{@link insert.Field#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see insert.Field#getTableName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_TableName();

	/**
	 * Returns the meta object for the reference '{@link insert.Field#getTable_ref <em>Table ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table ref</em>'.
	 * @see insert.Field#getTable_ref()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Table_ref();

	/**
	 * Returns the meta object for the attribute '{@link insert.Field#isDistict <em>Distict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distict</em>'.
	 * @see insert.Field#isDistict()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Distict();

	/**
	 * Returns the meta object for class '{@link insert.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see insert.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link insert.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see insert.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link insert.Literal#getLtype <em>Ltype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ltype</em>'.
	 * @see insert.Literal#getLtype()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Ltype();

	/**
	 * Returns the meta object for class '{@link insert.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see insert.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for the attribute '{@link insert.NullLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see insert.NullLiteral#getValue()
	 * @see #getNullLiteral()
	 * @generated
	 */
	EAttribute getNullLiteral_Value();

	/**
	 * Returns the meta object for class '{@link insert.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see insert.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link insert.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see insert.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the reference '{@link insert.Function#getFuncDef <em>Func Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Func Def</em>'.
	 * @see insert.Function#getFuncDef()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_FuncDef();

	/**
	 * Returns the meta object for the containment reference list '{@link insert.Function#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see insert.Function#getParams()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Params();

	/**
	 * Returns the meta object for class '{@link insert.FunctionDef <em>Function Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Def</em>'.
	 * @see insert.FunctionDef
	 * @generated
	 */
	EClass getFunctionDef();

	/**
	 * Returns the meta object for the attribute '{@link insert.FunctionDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see insert.FunctionDef#getName()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EAttribute getFunctionDef_Name();

	/**
	 * Returns the meta object for the reference '{@link insert.FunctionDef#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Returntype</em>'.
	 * @see insert.FunctionDef#getReturntype()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_Returntype();

	/**
	 * Returns the meta object for the reference '{@link insert.FunctionDef#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Args</em>'.
	 * @see insert.FunctionDef#getArgs()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_Args();

	/**
	 * Returns the meta object for class '{@link insert.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see insert.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link insert.Input#getInpDef <em>Inp Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inp Def</em>'.
	 * @see insert.Input#getInpDef()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_InpDef();

	/**
	 * Returns the meta object for the attribute '{@link insert.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see insert.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for class '{@link insert.InputDef <em>Input Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Def</em>'.
	 * @see insert.InputDef
	 * @generated
	 */
	EClass getInputDef();

	/**
	 * Returns the meta object for the attribute '{@link insert.InputDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see insert.InputDef#getName()
	 * @see #getInputDef()
	 * @generated
	 */
	EAttribute getInputDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link insert.InputDef#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see insert.InputDef#getIndex()
	 * @see #getInputDef()
	 * @generated
	 */
	EAttribute getInputDef_Index();

	/**
	 * Returns the meta object for the attribute '{@link insert.InputDef#isListable <em>Listable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listable</em>'.
	 * @see insert.InputDef#isListable()
	 * @see #getInputDef()
	 * @generated
	 */
	EAttribute getInputDef_Listable();

	/**
	 * Returns the meta object for class '{@link insert.InputStringDef <em>Input String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input String Def</em>'.
	 * @see insert.InputStringDef
	 * @generated
	 */
	EClass getInputStringDef();

	/**
	 * Returns the meta object for class '{@link insert.InputIntDef <em>Input Int Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Int Def</em>'.
	 * @see insert.InputIntDef
	 * @generated
	 */
	EClass getInputIntDef();

	/**
	 * Returns the meta object for class '{@link insert.InputDateDef <em>Input Date Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Date Def</em>'.
	 * @see insert.InputDateDef
	 * @generated
	 */
	EClass getInputDateDef();

	/**
	 * Returns the meta object for class '{@link insert.InputBitsDef <em>Input Bits Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Bits Def</em>'.
	 * @see insert.InputBitsDef
	 * @generated
	 */
	EClass getInputBitsDef();

	/**
	 * Returns the meta object for class '{@link insert.InputFloatDef <em>Input Float Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Float Def</em>'.
	 * @see insert.InputFloatDef
	 * @generated
	 */
	EClass getInputFloatDef();

	/**
	 * Returns the meta object for class '{@link insert.CallSurfaceQuery <em>Call Surface Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Surface Query</em>'.
	 * @see insert.CallSurfaceQuery
	 * @generated
	 */
	EClass getCallSurfaceQuery();

	/**
	 * Returns the meta object for the attribute '{@link insert.CallSurfaceQuery#getSurfaceName <em>Surface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface Name</em>'.
	 * @see insert.CallSurfaceQuery#getSurfaceName()
	 * @see #getCallSurfaceQuery()
	 * @generated
	 */
	EAttribute getCallSurfaceQuery_SurfaceName();

	/**
	 * Returns the meta object for class '{@link insert.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see insert.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link insert.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see insert.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the reference list '{@link insert.Type#getSubtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtypes</em>'.
	 * @see insert.Type#getSubtypes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Subtypes();

	/**
	 * Returns the meta object for class '{@link insert.Subtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtype</em>'.
	 * @see insert.Subtype
	 * @generated
	 */
	EClass getSubtype();

	/**
	 * Returns the meta object for the attribute '{@link insert.Subtype#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see insert.Subtype#getName()
	 * @see #getSubtype()
	 * @generated
	 */
	EAttribute getSubtype_Name();

	/**
	 * Returns the meta object for enum '{@link insert.LiteralType <em>Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Literal Type</em>'.
	 * @see insert.LiteralType
	 * @generated
	 */
	EEnum getLiteralType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InsertFactory getInsertFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link insert.impl.InsertSurfaceImpl <em>Surface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.InsertSurfaceImpl
		 * @see insert.impl.InsertPackageImpl#getInsertSurface()
		 * @generated
		 */
		EClass INSERT_SURFACE = eINSTANCE.getInsertSurface();

		/**
		 * The meta object literal for the '<em><b>Input Instalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_SURFACE__INPUT_INSTALMENT = eINSTANCE.getInsertSurface_InputInstalment();

		/**
		 * The meta object literal for the '<em><b>Prepare List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_SURFACE__PREPARE_LIST = eINSTANCE.getInsertSurface_PrepareList();

		/**
		 * The meta object literal for the '<em><b>Table Instalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_SURFACE__TABLE_INSTALMENT = eINSTANCE.getInsertSurface_TableInstalment();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_SURFACE__TYPES = eINSTANCE.getInsertSurface_Types();

		/**
		 * The meta object literal for the '<em><b>Funcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_SURFACE__FUNCS = eINSTANCE.getInsertSurface_Funcs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_SURFACE__NAME = eINSTANCE.getInsertSurface_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_SURFACE__DESCRIPTION = eINSTANCE.getInsertSurface_Description();

		/**
		 * The meta object literal for the '<em><b>Associated Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_SURFACE__ASSOCIATED_CLASS = eINSTANCE.getInsertSurface_AssociatedClass();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_SURFACE__USER_NAME = eINSTANCE.getInsertSurface_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_SURFACE__PASSWORD = eINSTANCE.getInsertSurface_Password();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_SURFACE__URI = eINSTANCE.getInsertSurface_Uri();

		/**
		 * The meta object literal for the '{@link insert.impl.PrepareListImpl <em>Prepare List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.PrepareListImpl
		 * @see insert.impl.InsertPackageImpl#getPrepareList()
		 * @generated
		 */
		EClass PREPARE_LIST = eINSTANCE.getPrepareList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPARE_LIST__NAME = eINSTANCE.getPrepareList_Name();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPARE_LIST__NODES = eINSTANCE.getPrepareList_Nodes();

		/**
		 * The meta object literal for the '{@link insert.impl.InputInstalmentImpl <em>Input Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.InputInstalmentImpl
		 * @see insert.impl.InsertPackageImpl#getInputInstalment()
		 * @generated
		 */
		EClass INPUT_INSTALMENT = eINSTANCE.getInputInstalment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_INSTALMENT__NAME = eINSTANCE.getInputInstalment_Name();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_INSTALMENT__INPUTS = eINSTANCE.getInputInstalment_Inputs();

		/**
		 * The meta object literal for the '{@link insert.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.AbstractNodeImpl
		 * @see insert.impl.InsertPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '{@link insert.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.TableImpl
		 * @see insert.impl.InsertPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FIELDS = eINSTANCE.getTable_Fields();

		/**
		 * The meta object literal for the '{@link insert.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.NodeImpl
		 * @see insert.impl.InsertPackageImpl#getNode()
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
		 * The meta object literal for the '<em><b>Subtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUBTYPE = eINSTANCE.getNode_Subtype();

		/**
		 * The meta object literal for the '<em><b>Listable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LISTABLE = eINSTANCE.getNode_Listable();

		/**
		 * The meta object literal for the '<em><b>Column name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__COLUMN_NAME = eINSTANCE.getNode_Column_name();

		/**
		 * The meta object literal for the '{@link insert.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.FieldImpl
		 * @see insert.impl.InsertPackageImpl#getField()
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
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TABLE = eINSTANCE.getField_Table();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TABLE_NAME = eINSTANCE.getField_TableName();

		/**
		 * The meta object literal for the '<em><b>Table ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TABLE_REF = eINSTANCE.getField_Table_ref();

		/**
		 * The meta object literal for the '<em><b>Distict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__DISTICT = eINSTANCE.getField_Distict();

		/**
		 * The meta object literal for the '{@link insert.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.LiteralImpl
		 * @see insert.impl.InsertPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Ltype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__LTYPE = eINSTANCE.getLiteral_Ltype();

		/**
		 * The meta object literal for the '{@link insert.impl.NullLiteralImpl <em>Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.NullLiteralImpl
		 * @see insert.impl.InsertPackageImpl#getNullLiteral()
		 * @generated
		 */
		EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL_LITERAL__VALUE = eINSTANCE.getNullLiteral_Value();

		/**
		 * The meta object literal for the '{@link insert.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.FunctionImpl
		 * @see insert.impl.InsertPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Func Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__FUNC_DEF = eINSTANCE.getFunction_FuncDef();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMS = eINSTANCE.getFunction_Params();

		/**
		 * The meta object literal for the '{@link insert.impl.FunctionDefImpl <em>Function Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.FunctionDefImpl
		 * @see insert.impl.InsertPackageImpl#getFunctionDef()
		 * @generated
		 */
		EClass FUNCTION_DEF = eINSTANCE.getFunctionDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_DEF__NAME = eINSTANCE.getFunctionDef_Name();

		/**
		 * The meta object literal for the '<em><b>Returntype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEF__RETURNTYPE = eINSTANCE.getFunctionDef_Returntype();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEF__ARGS = eINSTANCE.getFunctionDef_Args();

		/**
		 * The meta object literal for the '{@link insert.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.InputImpl
		 * @see insert.impl.InsertPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Inp Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INP_DEF = eINSTANCE.getInput_InpDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '{@link insert.impl.InputDefImpl <em>Input Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.InputDefImpl
		 * @see insert.impl.InsertPackageImpl#getInputDef()
		 * @generated
		 */
		EClass INPUT_DEF = eINSTANCE.getInputDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DEF__NAME = eINSTANCE.getInputDef_Name();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DEF__INDEX = eINSTANCE.getInputDef_Index();

		/**
		 * The meta object literal for the '<em><b>Listable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DEF__LISTABLE = eINSTANCE.getInputDef_Listable();

		/**
		 * The meta object literal for the '{@link insert.impl.InputStringDefImpl <em>Input String Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.InputStringDefImpl
		 * @see insert.impl.InsertPackageImpl#getInputStringDef()
		 * @generated
		 */
		EClass INPUT_STRING_DEF = eINSTANCE.getInputStringDef();

		/**
		 * The meta object literal for the '{@link insert.impl.InputIntDefImpl <em>Input Int Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.InputIntDefImpl
		 * @see insert.impl.InsertPackageImpl#getInputIntDef()
		 * @generated
		 */
		EClass INPUT_INT_DEF = eINSTANCE.getInputIntDef();

		/**
		 * The meta object literal for the '{@link insert.impl.InputDateDefImpl <em>Input Date Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.InputDateDefImpl
		 * @see insert.impl.InsertPackageImpl#getInputDateDef()
		 * @generated
		 */
		EClass INPUT_DATE_DEF = eINSTANCE.getInputDateDef();

		/**
		 * The meta object literal for the '{@link insert.impl.InputBitsDefImpl <em>Input Bits Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.InputBitsDefImpl
		 * @see insert.impl.InsertPackageImpl#getInputBitsDef()
		 * @generated
		 */
		EClass INPUT_BITS_DEF = eINSTANCE.getInputBitsDef();

		/**
		 * The meta object literal for the '{@link insert.impl.InputFloatDefImpl <em>Input Float Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.InputFloatDefImpl
		 * @see insert.impl.InsertPackageImpl#getInputFloatDef()
		 * @generated
		 */
		EClass INPUT_FLOAT_DEF = eINSTANCE.getInputFloatDef();

		/**
		 * The meta object literal for the '{@link insert.impl.CallSurfaceQueryImpl <em>Call Surface Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.CallSurfaceQueryImpl
		 * @see insert.impl.InsertPackageImpl#getCallSurfaceQuery()
		 * @generated
		 */
		EClass CALL_SURFACE_QUERY = eINSTANCE.getCallSurfaceQuery();

		/**
		 * The meta object literal for the '<em><b>Surface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_SURFACE_QUERY__SURFACE_NAME = eINSTANCE.getCallSurfaceQuery_SurfaceName();

		/**
		 * The meta object literal for the '{@link insert.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.TypeImpl
		 * @see insert.impl.InsertPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Subtypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__SUBTYPES = eINSTANCE.getType_Subtypes();

		/**
		 * The meta object literal for the '{@link insert.impl.SubtypeImpl <em>Subtype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.impl.SubtypeImpl
		 * @see insert.impl.InsertPackageImpl#getSubtype()
		 * @generated
		 */
		EClass SUBTYPE = eINSTANCE.getSubtype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTYPE__NAME = eINSTANCE.getSubtype_Name();

		/**
		 * The meta object literal for the '{@link insert.LiteralType <em>Literal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see insert.LiteralType
		 * @see insert.impl.InsertPackageImpl#getLiteralType()
		 * @generated
		 */
		EEnum LITERAL_TYPE = eINSTANCE.getLiteralType();

	}

} //InsertPackage
