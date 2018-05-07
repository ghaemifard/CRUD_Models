/**
 */
package delete;

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
 * @see delete.DeleteFactory
 * @model kind="package"
 * @generated
 */
public interface DeletePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "delete";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.delete.it.is/v1.0/beta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "delete";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeletePackage eINSTANCE = delete.impl.DeletePackageImpl.init();

	/**
	 * The meta object id for the '{@link delete.impl.DeleteSurfaceImpl <em>Surface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.DeleteSurfaceImpl
	 * @see delete.impl.DeletePackageImpl#getDeleteSurface()
	 * @generated
	 */
	int DELETE_SURFACE = 0;

	/**
	 * The feature id for the '<em><b>Input Insta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__INPUT_INSTA = 0;

	/**
	 * The feature id for the '<em><b>Table Insta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__TABLE_INSTA = 1;

	/**
	 * The feature id for the '<em><b>Where Insta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__WHERE_INSTA = 2;

	/**
	 * The feature id for the '<em><b>Sort Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__SORT_INSTALMENT = 3;

	/**
	 * The feature id for the '<em><b>Dummy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__DUMMY = 4;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__TYPES = 5;

	/**
	 * The feature id for the '<em><b>Funcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__FUNCS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Associated Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__ASSOCIATED_CLASS = 9;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__USER_NAME = 10;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__PASSWORD = 11;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE__URI = 12;

	/**
	 * The number of structural features of the '<em>Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_SURFACE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link delete.impl.ConditionInstalmentImpl <em>Condition Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.ConditionInstalmentImpl
	 * @see delete.impl.DeletePackageImpl#getConditionInstalment()
	 * @generated
	 */
	int CONDITION_INSTALMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INSTALMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INSTALMENT__PARTS = 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INSTALMENT__LINKS = 2;

	/**
	 * The number of structural features of the '<em>Condition Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INSTALMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link delete.impl.DummyImpl <em>Dummy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.DummyImpl
	 * @see delete.impl.DeletePackageImpl#getDummy()
	 * @generated
	 */
	int DUMMY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY__PARTS = 1;

	/**
	 * The number of structural features of the '<em>Dummy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link delete.impl.TableListInstalmentImpl <em>Table List Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.TableListInstalmentImpl
	 * @see delete.impl.DeletePackageImpl#getTableListInstalment()
	 * @generated
	 */
	int TABLE_LIST_INSTALMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LIST_INSTALMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LIST_INSTALMENT__TABLES = 1;

	/**
	 * The feature id for the '<em><b>Rels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LIST_INSTALMENT__RELS = 2;

	/**
	 * The number of structural features of the '<em>Table List Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LIST_INSTALMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link delete.impl.RelationSelectImpl <em>Relation Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.RelationSelectImpl
	 * @see delete.impl.DeletePackageImpl#getRelationSelect()
	 * @generated
	 */
	int RELATION_SELECT = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SELECT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SELECT__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Op Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SELECT__OP_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Relation Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SELECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link delete.impl.InnerjoinRelsImpl <em>Innerjoin Rels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.InnerjoinRelsImpl
	 * @see delete.impl.DeletePackageImpl#getInnerjoinRels()
	 * @generated
	 */
	int INNERJOIN_RELS = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNERJOIN_RELS__SOURCE = RELATION_SELECT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNERJOIN_RELS__TARGET = RELATION_SELECT__TARGET;

	/**
	 * The feature id for the '<em><b>Op Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNERJOIN_RELS__OP_TYPE = RELATION_SELECT__OP_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNERJOIN_RELS__TYPE = RELATION_SELECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Innerjoin Rels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNERJOIN_RELS_FEATURE_COUNT = RELATION_SELECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link delete.impl.LeftOuterJoinRelsImpl <em>Left Outer Join Rels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.LeftOuterJoinRelsImpl
	 * @see delete.impl.DeletePackageImpl#getLeftOuterJoinRels()
	 * @generated
	 */
	int LEFT_OUTER_JOIN_RELS = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_OUTER_JOIN_RELS__SOURCE = RELATION_SELECT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_OUTER_JOIN_RELS__TARGET = RELATION_SELECT__TARGET;

	/**
	 * The feature id for the '<em><b>Op Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_OUTER_JOIN_RELS__OP_TYPE = RELATION_SELECT__OP_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_OUTER_JOIN_RELS__TYPE = RELATION_SELECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Left Outer Join Rels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_OUTER_JOIN_RELS_FEATURE_COUNT = RELATION_SELECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link delete.impl.RightOuterJoinRelsImpl <em>Right Outer Join Rels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.RightOuterJoinRelsImpl
	 * @see delete.impl.DeletePackageImpl#getRightOuterJoinRels()
	 * @generated
	 */
	int RIGHT_OUTER_JOIN_RELS = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OUTER_JOIN_RELS__SOURCE = RELATION_SELECT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OUTER_JOIN_RELS__TARGET = RELATION_SELECT__TARGET;

	/**
	 * The feature id for the '<em><b>Op Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OUTER_JOIN_RELS__OP_TYPE = RELATION_SELECT__OP_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OUTER_JOIN_RELS__TYPE = RELATION_SELECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Right Outer Join Rels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OUTER_JOIN_RELS_FEATURE_COUNT = RELATION_SELECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link delete.impl.FullOuterJoinRelsImpl <em>Full Outer Join Rels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.FullOuterJoinRelsImpl
	 * @see delete.impl.DeletePackageImpl#getFullOuterJoinRels()
	 * @generated
	 */
	int FULL_OUTER_JOIN_RELS = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_OUTER_JOIN_RELS__SOURCE = RELATION_SELECT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_OUTER_JOIN_RELS__TARGET = RELATION_SELECT__TARGET;

	/**
	 * The feature id for the '<em><b>Op Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_OUTER_JOIN_RELS__OP_TYPE = RELATION_SELECT__OP_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_OUTER_JOIN_RELS__TYPE = RELATION_SELECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Full Outer Join Rels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_OUTER_JOIN_RELS_FEATURE_COUNT = RELATION_SELECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link delete.impl.InputInstalmentImpl <em>Input Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.InputInstalmentImpl
	 * @see delete.impl.DeletePackageImpl#getInputInstalment()
	 * @generated
	 */
	int INPUT_INSTALMENT = 9;

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
	 * The meta object id for the '{@link delete.impl.SortInstalmentImpl <em>Sort Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.SortInstalmentImpl
	 * @see delete.impl.DeletePackageImpl#getSortInstalment()
	 * @generated
	 */
	int SORT_INSTALMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_INSTALMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pointers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_INSTALMENT__POINTERS = 1;

	/**
	 * The number of structural features of the '<em>Sort Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_INSTALMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link delete.impl.FieldSPointerImpl <em>Field SPointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.FieldSPointerImpl
	 * @see delete.impl.DeletePackageImpl#getFieldSPointer()
	 * @generated
	 */
	int FIELD_SPOINTER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SPOINTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SPOINTER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SPOINTER__FIELD = 2;

	/**
	 * The number of structural features of the '<em>Field SPointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SPOINTER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link delete.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.AbstractNodeImpl
	 * @see delete.impl.DeletePackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 12;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link delete.impl.MyTableImpl <em>My Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.MyTableImpl
	 * @see delete.impl.DeletePackageImpl#getMyTable()
	 * @generated
	 */
	int MY_TABLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_TABLE__NAME = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_TABLE__ALIAS = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_TABLE__FIELDS = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>My Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_TABLE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link delete.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.NodeImpl
	 * @see delete.impl.DeletePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 14;

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
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COLUMN_NAME = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LISTABLE = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link delete.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.FieldImpl
	 * @see delete.impl.DeletePackageImpl#getField()
	 * @generated
	 */
	int FIELD = 15;

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
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COLUMN_NAME = NODE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__LISTABLE = NODE__LISTABLE;

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
	 * The meta object id for the '{@link delete.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.LiteralImpl
	 * @see delete.impl.DeletePackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 16;

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
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__COLUMN_NAME = NODE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LISTABLE = NODE__LISTABLE;

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
	 * The meta object id for the '{@link delete.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.NullLiteralImpl
	 * @see delete.impl.DeletePackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 17;

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
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__COLUMN_NAME = NODE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__LISTABLE = NODE__LISTABLE;

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
	 * The meta object id for the '{@link delete.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.FunctionImpl
	 * @see delete.impl.DeletePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 18;

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
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__COLUMN_NAME = NODE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LISTABLE = NODE__LISTABLE;

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
	 * The meta object id for the '{@link delete.impl.FunctionDefImpl <em>Function Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.FunctionDefImpl
	 * @see delete.impl.DeletePackageImpl#getFunctionDef()
	 * @generated
	 */
	int FUNCTION_DEF = 19;

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
	 * The meta object id for the '{@link delete.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.InputImpl
	 * @see delete.impl.DeletePackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 20;

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
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__COLUMN_NAME = NODE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__LISTABLE = NODE__LISTABLE;

	/**
	 * The feature id for the '<em><b>Input Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPUT_REF = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link delete.impl.InputDefImpl <em>Input Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.InputDefImpl
	 * @see delete.impl.DeletePackageImpl#getInputDef()
	 * @generated
	 */
	int INPUT_DEF = 21;

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
	 * The meta object id for the '{@link delete.impl.InputStringDefImpl <em>Input String Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.InputStringDefImpl
	 * @see delete.impl.DeletePackageImpl#getInputStringDef()
	 * @generated
	 */
	int INPUT_STRING_DEF = 22;

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
	 * The meta object id for the '{@link delete.impl.InputIntDefImpl <em>Input Int Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.InputIntDefImpl
	 * @see delete.impl.DeletePackageImpl#getInputIntDef()
	 * @generated
	 */
	int INPUT_INT_DEF = 23;

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
	 * The meta object id for the '{@link delete.impl.InputDateDefImpl <em>Input Date Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.InputDateDefImpl
	 * @see delete.impl.DeletePackageImpl#getInputDateDef()
	 * @generated
	 */
	int INPUT_DATE_DEF = 24;

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
	 * The meta object id for the '{@link delete.impl.InputBitsDefImpl <em>Input Bits Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.InputBitsDefImpl
	 * @see delete.impl.DeletePackageImpl#getInputBitsDef()
	 * @generated
	 */
	int INPUT_BITS_DEF = 25;

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
	 * The meta object id for the '{@link delete.impl.InputFloatDefImpl <em>Input Float Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.InputFloatDefImpl
	 * @see delete.impl.DeletePackageImpl#getInputFloatDef()
	 * @generated
	 */
	int INPUT_FLOAT_DEF = 26;

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
	 * The meta object id for the '{@link delete.impl.CallSurfaceQueryImpl <em>Call Surface Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.CallSurfaceQueryImpl
	 * @see delete.impl.DeletePackageImpl#getCallSurfaceQuery()
	 * @generated
	 */
	int CALL_SURFACE_QUERY = 27;

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
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SURFACE_QUERY__COLUMN_NAME = FUNCTION__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SURFACE_QUERY__LISTABLE = FUNCTION__LISTABLE;

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
	 * The meta object id for the '{@link delete.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.TypeImpl
	 * @see delete.impl.DeletePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 28;

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
	 * The meta object id for the '{@link delete.impl.SubtypeImpl <em>Subtype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.SubtypeImpl
	 * @see delete.impl.DeletePackageImpl#getSubtype()
	 * @generated
	 */
	int SUBTYPE = 29;

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
	 * The meta object id for the '{@link delete.impl.AbstractConditionElementImpl <em>Abstract Condition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.AbstractConditionElementImpl
	 * @see delete.impl.DeletePackageImpl#getAbstractConditionElement()
	 * @generated
	 */
	int ABSTRACT_CONDITION_ELEMENT = 30;

	/**
	 * The number of structural features of the '<em>Abstract Condition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link delete.impl.JunctionImpl <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.JunctionImpl
	 * @see delete.impl.DeletePackageImpl#getJunction()
	 * @generated
	 */
	int JUNCTION = 31;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__TYPE = ABSTRACT_CONDITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__RELS = ABSTRACT_CONDITION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_FEATURE_COUNT = ABSTRACT_CONDITION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link delete.impl.RootJunctionImpl <em>Root Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.RootJunctionImpl
	 * @see delete.impl.DeletePackageImpl#getRootJunction()
	 * @generated
	 */
	int ROOT_JUNCTION = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_JUNCTION__TYPE = JUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Rels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_JUNCTION__RELS = JUNCTION__RELS;

	/**
	 * The number of structural features of the '<em>Root Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_JUNCTION_FEATURE_COUNT = JUNCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link delete.impl.JuncRelationshipImpl <em>Junc Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.JuncRelationshipImpl
	 * @see delete.impl.DeletePackageImpl#getJuncRelationship()
	 * @generated
	 */
	int JUNC_RELATIONSHIP = 33;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNC_RELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNC_RELATIONSHIP__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNC_RELATIONSHIP__INDEX = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNC_RELATIONSHIP__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Junc Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNC_RELATIONSHIP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link delete.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.TermImpl
	 * @see delete.impl.DeletePackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 34;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__PARAMS = ABSTRACT_CONDITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TITLE = ABSTRACT_CONDITION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__LINK = ABSTRACT_CONDITION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = ABSTRACT_CONDITION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link delete.impl.ConditionLinkImpl <em>Condition Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.ConditionLinkImpl
	 * @see delete.impl.DeletePackageImpl#getConditionLink()
	 * @generated
	 */
	int CONDITION_LINK = 35;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_LINK__SRC = 0;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_LINK__DST = 1;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_LINK__NEGATIVE = 2;

	/**
	 * The number of structural features of the '<em>Condition Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_LINK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link delete.impl.EqualLinkImpl <em>Equal Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.EqualLinkImpl
	 * @see delete.impl.DeletePackageImpl#getEqualLink()
	 * @generated
	 */
	int EQUAL_LINK = 36;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_LINK__SRC = CONDITION_LINK__SRC;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_LINK__DST = CONDITION_LINK__DST;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_LINK__NEGATIVE = CONDITION_LINK__NEGATIVE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_LINK__DESC = CONDITION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_LINK_FEATURE_COUNT = CONDITION_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link delete.impl.GreaterThanLinkImpl <em>Greater Than Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.GreaterThanLinkImpl
	 * @see delete.impl.DeletePackageImpl#getGreaterThanLink()
	 * @generated
	 */
	int GREATER_THAN_LINK = 37;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_LINK__SRC = CONDITION_LINK__SRC;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_LINK__DST = CONDITION_LINK__DST;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_LINK__NEGATIVE = CONDITION_LINK__NEGATIVE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_LINK__DESC = CONDITION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Greater Than Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_LINK_FEATURE_COUNT = CONDITION_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link delete.impl.GreaterEqualThanLinkImpl <em>Greater Equal Than Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.GreaterEqualThanLinkImpl
	 * @see delete.impl.DeletePackageImpl#getGreaterEqualThanLink()
	 * @generated
	 */
	int GREATER_EQUAL_THAN_LINK = 38;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_THAN_LINK__SRC = CONDITION_LINK__SRC;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_THAN_LINK__DST = CONDITION_LINK__DST;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_THAN_LINK__NEGATIVE = CONDITION_LINK__NEGATIVE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_THAN_LINK__DESC = CONDITION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Greater Equal Than Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_THAN_LINK_FEATURE_COUNT = CONDITION_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link delete.impl.LowerThanLinkImpl <em>Lower Than Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.LowerThanLinkImpl
	 * @see delete.impl.DeletePackageImpl#getLowerThanLink()
	 * @generated
	 */
	int LOWER_THAN_LINK = 39;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_LINK__SRC = CONDITION_LINK__SRC;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_LINK__DST = CONDITION_LINK__DST;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_LINK__NEGATIVE = CONDITION_LINK__NEGATIVE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_LINK__DESC = CONDITION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lower Than Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_LINK_FEATURE_COUNT = CONDITION_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link delete.impl.LowerEqualThanLinkImpl <em>Lower Equal Than Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.LowerEqualThanLinkImpl
	 * @see delete.impl.DeletePackageImpl#getLowerEqualThanLink()
	 * @generated
	 */
	int LOWER_EQUAL_THAN_LINK = 40;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_EQUAL_THAN_LINK__SRC = CONDITION_LINK__SRC;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_EQUAL_THAN_LINK__DST = CONDITION_LINK__DST;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_EQUAL_THAN_LINK__NEGATIVE = CONDITION_LINK__NEGATIVE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_EQUAL_THAN_LINK__DESC = CONDITION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lower Equal Than Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_EQUAL_THAN_LINK_FEATURE_COUNT = CONDITION_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link delete.impl.InLinkImpl <em>In Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.InLinkImpl
	 * @see delete.impl.DeletePackageImpl#getInLink()
	 * @generated
	 */
	int IN_LINK = 41;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_LINK__SRC = CONDITION_LINK__SRC;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_LINK__DST = CONDITION_LINK__DST;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_LINK__NEGATIVE = CONDITION_LINK__NEGATIVE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_LINK__DESC = CONDITION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_LINK_FEATURE_COUNT = CONDITION_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link delete.impl.LikeLinkImpl <em>Like Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.impl.LikeLinkImpl
	 * @see delete.impl.DeletePackageImpl#getLikeLink()
	 * @generated
	 */
	int LIKE_LINK = 42;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_LINK__SRC = CONDITION_LINK__SRC;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_LINK__DST = CONDITION_LINK__DST;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_LINK__NEGATIVE = CONDITION_LINK__NEGATIVE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_LINK__DESC = CONDITION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Like Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_LINK_FEATURE_COUNT = CONDITION_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link delete.RelationSelectOperationType <em>Relation Select Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.RelationSelectOperationType
	 * @see delete.impl.DeletePackageImpl#getRelationSelectOperationType()
	 * @generated
	 */
	int RELATION_SELECT_OPERATION_TYPE = 43;

	/**
	 * The meta object id for the '{@link delete.RelationSelectType <em>Relation Select Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.RelationSelectType
	 * @see delete.impl.DeletePackageImpl#getRelationSelectType()
	 * @generated
	 */
	int RELATION_SELECT_TYPE = 44;

	/**
	 * The meta object id for the '{@link delete.SortType <em>Sort Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.SortType
	 * @see delete.impl.DeletePackageImpl#getSortType()
	 * @generated
	 */
	int SORT_TYPE = 45;

	/**
	 * The meta object id for the '{@link delete.LiteralType <em>Literal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.LiteralType
	 * @see delete.impl.DeletePackageImpl#getLiteralType()
	 * @generated
	 */
	int LITERAL_TYPE = 46;

	/**
	 * The meta object id for the '{@link delete.JuncType <em>Junc Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delete.JuncType
	 * @see delete.impl.DeletePackageImpl#getJuncType()
	 * @generated
	 */
	int JUNC_TYPE = 47;


	/**
	 * Returns the meta object for class '{@link delete.DeleteSurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface</em>'.
	 * @see delete.DeleteSurface
	 * @generated
	 */
	EClass getDeleteSurface();

	/**
	 * Returns the meta object for the containment reference '{@link delete.DeleteSurface#getInputInsta <em>Input Insta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Insta</em>'.
	 * @see delete.DeleteSurface#getInputInsta()
	 * @see #getDeleteSurface()
	 * @generated
	 */
	EReference getDeleteSurface_InputInsta();

	/**
	 * Returns the meta object for the containment reference '{@link delete.DeleteSurface#getTableInsta <em>Table Insta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Insta</em>'.
	 * @see delete.DeleteSurface#getTableInsta()
	 * @see #getDeleteSurface()
	 * @generated
	 */
	EReference getDeleteSurface_TableInsta();

	/**
	 * Returns the meta object for the containment reference '{@link delete.DeleteSurface#getWhereInsta <em>Where Insta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where Insta</em>'.
	 * @see delete.DeleteSurface#getWhereInsta()
	 * @see #getDeleteSurface()
	 * @generated
	 */
	EReference getDeleteSurface_WhereInsta();

	/**
	 * Returns the meta object for the containment reference '{@link delete.DeleteSurface#getSortInstalment <em>Sort Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort Instalment</em>'.
	 * @see delete.DeleteSurface#getSortInstalment()
	 * @see #getDeleteSurface()
	 * @generated
	 */
	EReference getDeleteSurface_SortInstalment();

	/**
	 * Returns the meta object for the containment reference '{@link delete.DeleteSurface#getDummy <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dummy</em>'.
	 * @see delete.DeleteSurface#getDummy()
	 * @see #getDeleteSurface()
	 * @generated
	 */
	EReference getDeleteSurface_Dummy();

	/**
	 * Returns the meta object for the reference list '{@link delete.DeleteSurface#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see delete.DeleteSurface#getTypes()
	 * @see #getDeleteSurface()
	 * @generated
	 */
	EReference getDeleteSurface_Types();

	/**
	 * Returns the meta object for the reference list '{@link delete.DeleteSurface#getFuncs <em>Funcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Funcs</em>'.
	 * @see delete.DeleteSurface#getFuncs()
	 * @see #getDeleteSurface()
	 * @generated
	 */
	EReference getDeleteSurface_Funcs();

	/**
	 * Returns the meta object for the attribute '{@link delete.DeleteSurface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.DeleteSurface#getName()
	 * @see #getDeleteSurface()
	 * @generated
	 */
	EAttribute getDeleteSurface_Name();

	/**
	 * Returns the meta object for the attribute '{@link delete.DeleteSurface#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see delete.DeleteSurface#getDescription()
	 * @see #getDeleteSurface()
	 * @generated
	 */
	EAttribute getDeleteSurface_Description();

	/**
	 * Returns the meta object for the attribute '{@link delete.DeleteSurface#getAssociatedClass <em>Associated Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated Class</em>'.
	 * @see delete.DeleteSurface#getAssociatedClass()
	 * @see #getDeleteSurface()
	 * @generated
	 */
	EAttribute getDeleteSurface_AssociatedClass();

	/**
	 * Returns the meta object for the attribute '{@link delete.DeleteSurface#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see delete.DeleteSurface#getUserName()
	 * @see #getDeleteSurface()
	 * @generated
	 */
	EAttribute getDeleteSurface_UserName();

	/**
	 * Returns the meta object for the attribute '{@link delete.DeleteSurface#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see delete.DeleteSurface#getPassword()
	 * @see #getDeleteSurface()
	 * @generated
	 */
	EAttribute getDeleteSurface_Password();

	/**
	 * Returns the meta object for the attribute '{@link delete.DeleteSurface#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see delete.DeleteSurface#getUri()
	 * @see #getDeleteSurface()
	 * @generated
	 */
	EAttribute getDeleteSurface_Uri();

	/**
	 * Returns the meta object for class '{@link delete.ConditionInstalment <em>Condition Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Instalment</em>'.
	 * @see delete.ConditionInstalment
	 * @generated
	 */
	EClass getConditionInstalment();

	/**
	 * Returns the meta object for the attribute '{@link delete.ConditionInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.ConditionInstalment#getName()
	 * @see #getConditionInstalment()
	 * @generated
	 */
	EAttribute getConditionInstalment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link delete.ConditionInstalment#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see delete.ConditionInstalment#getParts()
	 * @see #getConditionInstalment()
	 * @generated
	 */
	EReference getConditionInstalment_Parts();

	/**
	 * Returns the meta object for the containment reference list '{@link delete.ConditionInstalment#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see delete.ConditionInstalment#getLinks()
	 * @see #getConditionInstalment()
	 * @generated
	 */
	EReference getConditionInstalment_Links();

	/**
	 * Returns the meta object for class '{@link delete.Dummy <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy</em>'.
	 * @see delete.Dummy
	 * @generated
	 */
	EClass getDummy();

	/**
	 * Returns the meta object for the attribute '{@link delete.Dummy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.Dummy#getName()
	 * @see #getDummy()
	 * @generated
	 */
	EAttribute getDummy_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link delete.Dummy#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see delete.Dummy#getParts()
	 * @see #getDummy()
	 * @generated
	 */
	EReference getDummy_Parts();

	/**
	 * Returns the meta object for class '{@link delete.TableListInstalment <em>Table List Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table List Instalment</em>'.
	 * @see delete.TableListInstalment
	 * @generated
	 */
	EClass getTableListInstalment();

	/**
	 * Returns the meta object for the attribute '{@link delete.TableListInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.TableListInstalment#getName()
	 * @see #getTableListInstalment()
	 * @generated
	 */
	EAttribute getTableListInstalment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link delete.TableListInstalment#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see delete.TableListInstalment#getTables()
	 * @see #getTableListInstalment()
	 * @generated
	 */
	EReference getTableListInstalment_Tables();

	/**
	 * Returns the meta object for the containment reference list '{@link delete.TableListInstalment#getRels <em>Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rels</em>'.
	 * @see delete.TableListInstalment#getRels()
	 * @see #getTableListInstalment()
	 * @generated
	 */
	EReference getTableListInstalment_Rels();

	/**
	 * Returns the meta object for class '{@link delete.RelationSelect <em>Relation Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Select</em>'.
	 * @see delete.RelationSelect
	 * @generated
	 */
	EClass getRelationSelect();

	/**
	 * Returns the meta object for the reference '{@link delete.RelationSelect#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see delete.RelationSelect#getSource()
	 * @see #getRelationSelect()
	 * @generated
	 */
	EReference getRelationSelect_Source();

	/**
	 * Returns the meta object for the reference '{@link delete.RelationSelect#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see delete.RelationSelect#getTarget()
	 * @see #getRelationSelect()
	 * @generated
	 */
	EReference getRelationSelect_Target();

	/**
	 * Returns the meta object for the attribute '{@link delete.RelationSelect#getOpType <em>Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Type</em>'.
	 * @see delete.RelationSelect#getOpType()
	 * @see #getRelationSelect()
	 * @generated
	 */
	EAttribute getRelationSelect_OpType();

	/**
	 * Returns the meta object for class '{@link delete.InnerjoinRels <em>Innerjoin Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Innerjoin Rels</em>'.
	 * @see delete.InnerjoinRels
	 * @generated
	 */
	EClass getInnerjoinRels();

	/**
	 * Returns the meta object for the attribute '{@link delete.InnerjoinRels#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see delete.InnerjoinRels#getType()
	 * @see #getInnerjoinRels()
	 * @generated
	 */
	EAttribute getInnerjoinRels_Type();

	/**
	 * Returns the meta object for class '{@link delete.LeftOuterJoinRels <em>Left Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Outer Join Rels</em>'.
	 * @see delete.LeftOuterJoinRels
	 * @generated
	 */
	EClass getLeftOuterJoinRels();

	/**
	 * Returns the meta object for the attribute '{@link delete.LeftOuterJoinRels#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see delete.LeftOuterJoinRels#getType()
	 * @see #getLeftOuterJoinRels()
	 * @generated
	 */
	EAttribute getLeftOuterJoinRels_Type();

	/**
	 * Returns the meta object for class '{@link delete.RightOuterJoinRels <em>Right Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Outer Join Rels</em>'.
	 * @see delete.RightOuterJoinRels
	 * @generated
	 */
	EClass getRightOuterJoinRels();

	/**
	 * Returns the meta object for the attribute '{@link delete.RightOuterJoinRels#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see delete.RightOuterJoinRels#getType()
	 * @see #getRightOuterJoinRels()
	 * @generated
	 */
	EAttribute getRightOuterJoinRels_Type();

	/**
	 * Returns the meta object for class '{@link delete.FullOuterJoinRels <em>Full Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full Outer Join Rels</em>'.
	 * @see delete.FullOuterJoinRels
	 * @generated
	 */
	EClass getFullOuterJoinRels();

	/**
	 * Returns the meta object for the attribute '{@link delete.FullOuterJoinRels#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see delete.FullOuterJoinRels#getType()
	 * @see #getFullOuterJoinRels()
	 * @generated
	 */
	EAttribute getFullOuterJoinRels_Type();

	/**
	 * Returns the meta object for class '{@link delete.InputInstalment <em>Input Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Instalment</em>'.
	 * @see delete.InputInstalment
	 * @generated
	 */
	EClass getInputInstalment();

	/**
	 * Returns the meta object for the attribute '{@link delete.InputInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.InputInstalment#getName()
	 * @see #getInputInstalment()
	 * @generated
	 */
	EAttribute getInputInstalment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link delete.InputInstalment#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see delete.InputInstalment#getInputs()
	 * @see #getInputInstalment()
	 * @generated
	 */
	EReference getInputInstalment_Inputs();

	/**
	 * Returns the meta object for class '{@link delete.SortInstalment <em>Sort Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Instalment</em>'.
	 * @see delete.SortInstalment
	 * @generated
	 */
	EClass getSortInstalment();

	/**
	 * Returns the meta object for the attribute '{@link delete.SortInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.SortInstalment#getName()
	 * @see #getSortInstalment()
	 * @generated
	 */
	EAttribute getSortInstalment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link delete.SortInstalment#getPointers <em>Pointers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointers</em>'.
	 * @see delete.SortInstalment#getPointers()
	 * @see #getSortInstalment()
	 * @generated
	 */
	EReference getSortInstalment_Pointers();

	/**
	 * Returns the meta object for class '{@link delete.FieldSPointer <em>Field SPointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field SPointer</em>'.
	 * @see delete.FieldSPointer
	 * @generated
	 */
	EClass getFieldSPointer();

	/**
	 * Returns the meta object for the attribute '{@link delete.FieldSPointer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.FieldSPointer#getName()
	 * @see #getFieldSPointer()
	 * @generated
	 */
	EAttribute getFieldSPointer_Name();

	/**
	 * Returns the meta object for the attribute '{@link delete.FieldSPointer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see delete.FieldSPointer#getType()
	 * @see #getFieldSPointer()
	 * @generated
	 */
	EAttribute getFieldSPointer_Type();

	/**
	 * Returns the meta object for the reference '{@link delete.FieldSPointer#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see delete.FieldSPointer#getField()
	 * @see #getFieldSPointer()
	 * @generated
	 */
	EReference getFieldSPointer_Field();

	/**
	 * Returns the meta object for class '{@link delete.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see delete.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for class '{@link delete.MyTable <em>My Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Table</em>'.
	 * @see delete.MyTable
	 * @generated
	 */
	EClass getMyTable();

	/**
	 * Returns the meta object for the attribute '{@link delete.MyTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.MyTable#getName()
	 * @see #getMyTable()
	 * @generated
	 */
	EAttribute getMyTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link delete.MyTable#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see delete.MyTable#getAlias()
	 * @see #getMyTable()
	 * @generated
	 */
	EAttribute getMyTable_Alias();

	/**
	 * Returns the meta object for the containment reference list '{@link delete.MyTable#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see delete.MyTable#getFields()
	 * @see #getMyTable()
	 * @generated
	 */
	EReference getMyTable_Fields();

	/**
	 * Returns the meta object for class '{@link delete.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see delete.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link delete.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see delete.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Type();

	/**
	 * Returns the meta object for the reference '{@link delete.Node#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subtype</em>'.
	 * @see delete.Node#getSubtype()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link delete.Node#getColumn_name <em>Column name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column name</em>'.
	 * @see delete.Node#getColumn_name()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Column_name();

	/**
	 * Returns the meta object for the attribute '{@link delete.Node#isListable <em>Listable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listable</em>'.
	 * @see delete.Node#isListable()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Listable();

	/**
	 * Returns the meta object for class '{@link delete.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see delete.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link delete.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the container reference '{@link delete.Field#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see delete.Field#getTable()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Table();

	/**
	 * Returns the meta object for the attribute '{@link delete.Field#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see delete.Field#getTableName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_TableName();

	/**
	 * Returns the meta object for the reference '{@link delete.Field#getTable_ref <em>Table ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table ref</em>'.
	 * @see delete.Field#getTable_ref()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Table_ref();

	/**
	 * Returns the meta object for the attribute '{@link delete.Field#isDistict <em>Distict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distict</em>'.
	 * @see delete.Field#isDistict()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Distict();

	/**
	 * Returns the meta object for class '{@link delete.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see delete.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link delete.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see delete.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link delete.Literal#getLtype <em>Ltype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ltype</em>'.
	 * @see delete.Literal#getLtype()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Ltype();

	/**
	 * Returns the meta object for class '{@link delete.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see delete.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for the attribute '{@link delete.NullLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see delete.NullLiteral#getValue()
	 * @see #getNullLiteral()
	 * @generated
	 */
	EAttribute getNullLiteral_Value();

	/**
	 * Returns the meta object for class '{@link delete.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see delete.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link delete.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the reference '{@link delete.Function#getFuncDef <em>Func Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Func Def</em>'.
	 * @see delete.Function#getFuncDef()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_FuncDef();

	/**
	 * Returns the meta object for the containment reference list '{@link delete.Function#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see delete.Function#getParams()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Params();

	/**
	 * Returns the meta object for class '{@link delete.FunctionDef <em>Function Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Def</em>'.
	 * @see delete.FunctionDef
	 * @generated
	 */
	EClass getFunctionDef();

	/**
	 * Returns the meta object for the attribute '{@link delete.FunctionDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.FunctionDef#getName()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EAttribute getFunctionDef_Name();

	/**
	 * Returns the meta object for the reference '{@link delete.FunctionDef#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Returntype</em>'.
	 * @see delete.FunctionDef#getReturntype()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_Returntype();

	/**
	 * Returns the meta object for the reference '{@link delete.FunctionDef#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Args</em>'.
	 * @see delete.FunctionDef#getArgs()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_Args();

	/**
	 * Returns the meta object for class '{@link delete.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see delete.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link delete.Input#getInputRef <em>Input Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Ref</em>'.
	 * @see delete.Input#getInputRef()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_InputRef();

	/**
	 * Returns the meta object for class '{@link delete.InputDef <em>Input Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Def</em>'.
	 * @see delete.InputDef
	 * @generated
	 */
	EClass getInputDef();

	/**
	 * Returns the meta object for the attribute '{@link delete.InputDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.InputDef#getName()
	 * @see #getInputDef()
	 * @generated
	 */
	EAttribute getInputDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link delete.InputDef#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see delete.InputDef#getIndex()
	 * @see #getInputDef()
	 * @generated
	 */
	EAttribute getInputDef_Index();

	/**
	 * Returns the meta object for the attribute '{@link delete.InputDef#isListable <em>Listable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listable</em>'.
	 * @see delete.InputDef#isListable()
	 * @see #getInputDef()
	 * @generated
	 */
	EAttribute getInputDef_Listable();

	/**
	 * Returns the meta object for class '{@link delete.InputStringDef <em>Input String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input String Def</em>'.
	 * @see delete.InputStringDef
	 * @generated
	 */
	EClass getInputStringDef();

	/**
	 * Returns the meta object for class '{@link delete.InputIntDef <em>Input Int Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Int Def</em>'.
	 * @see delete.InputIntDef
	 * @generated
	 */
	EClass getInputIntDef();

	/**
	 * Returns the meta object for class '{@link delete.InputDateDef <em>Input Date Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Date Def</em>'.
	 * @see delete.InputDateDef
	 * @generated
	 */
	EClass getInputDateDef();

	/**
	 * Returns the meta object for class '{@link delete.InputBitsDef <em>Input Bits Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Bits Def</em>'.
	 * @see delete.InputBitsDef
	 * @generated
	 */
	EClass getInputBitsDef();

	/**
	 * Returns the meta object for class '{@link delete.InputFloatDef <em>Input Float Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Float Def</em>'.
	 * @see delete.InputFloatDef
	 * @generated
	 */
	EClass getInputFloatDef();

	/**
	 * Returns the meta object for class '{@link delete.CallSurfaceQuery <em>Call Surface Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Surface Query</em>'.
	 * @see delete.CallSurfaceQuery
	 * @generated
	 */
	EClass getCallSurfaceQuery();

	/**
	 * Returns the meta object for the attribute '{@link delete.CallSurfaceQuery#getSurfaceName <em>Surface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface Name</em>'.
	 * @see delete.CallSurfaceQuery#getSurfaceName()
	 * @see #getCallSurfaceQuery()
	 * @generated
	 */
	EAttribute getCallSurfaceQuery_SurfaceName();

	/**
	 * Returns the meta object for class '{@link delete.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see delete.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link delete.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the reference list '{@link delete.Type#getSubtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtypes</em>'.
	 * @see delete.Type#getSubtypes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Subtypes();

	/**
	 * Returns the meta object for class '{@link delete.Subtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtype</em>'.
	 * @see delete.Subtype
	 * @generated
	 */
	EClass getSubtype();

	/**
	 * Returns the meta object for the attribute '{@link delete.Subtype#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see delete.Subtype#getName()
	 * @see #getSubtype()
	 * @generated
	 */
	EAttribute getSubtype_Name();

	/**
	 * Returns the meta object for class '{@link delete.AbstractConditionElement <em>Abstract Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Condition Element</em>'.
	 * @see delete.AbstractConditionElement
	 * @generated
	 */
	EClass getAbstractConditionElement();

	/**
	 * Returns the meta object for class '{@link delete.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see delete.Junction
	 * @generated
	 */
	EClass getJunction();

	/**
	 * Returns the meta object for the attribute '{@link delete.Junction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see delete.Junction#getType()
	 * @see #getJunction()
	 * @generated
	 */
	EAttribute getJunction_Type();

	/**
	 * Returns the meta object for the reference list '{@link delete.Junction#getRels <em>Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rels</em>'.
	 * @see delete.Junction#getRels()
	 * @see #getJunction()
	 * @generated
	 */
	EReference getJunction_Rels();

	/**
	 * Returns the meta object for class '{@link delete.RootJunction <em>Root Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Junction</em>'.
	 * @see delete.RootJunction
	 * @generated
	 */
	EClass getRootJunction();

	/**
	 * Returns the meta object for class '{@link delete.JuncRelationship <em>Junc Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junc Relationship</em>'.
	 * @see delete.JuncRelationship
	 * @generated
	 */
	EClass getJuncRelationship();

	/**
	 * Returns the meta object for the reference '{@link delete.JuncRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see delete.JuncRelationship#getSource()
	 * @see #getJuncRelationship()
	 * @generated
	 */
	EReference getJuncRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link delete.JuncRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see delete.JuncRelationship#getTarget()
	 * @see #getJuncRelationship()
	 * @generated
	 */
	EReference getJuncRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link delete.JuncRelationship#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see delete.JuncRelationship#getIndex()
	 * @see #getJuncRelationship()
	 * @generated
	 */
	EAttribute getJuncRelationship_Index();

	/**
	 * Returns the meta object for the attribute '{@link delete.JuncRelationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see delete.JuncRelationship#getType()
	 * @see #getJuncRelationship()
	 * @generated
	 */
	EAttribute getJuncRelationship_Type();

	/**
	 * Returns the meta object for class '{@link delete.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see delete.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link delete.Term#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see delete.Term#getParams()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Params();

	/**
	 * Returns the meta object for the attribute '{@link delete.Term#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see delete.Term#getTitle()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Title();

	/**
	 * Returns the meta object for the containment reference '{@link delete.Term#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see delete.Term#getLink()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Link();

	/**
	 * Returns the meta object for class '{@link delete.ConditionLink <em>Condition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Link</em>'.
	 * @see delete.ConditionLink
	 * @generated
	 */
	EClass getConditionLink();

	/**
	 * Returns the meta object for the reference '{@link delete.ConditionLink#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see delete.ConditionLink#getSrc()
	 * @see #getConditionLink()
	 * @generated
	 */
	EReference getConditionLink_Src();

	/**
	 * Returns the meta object for the reference '{@link delete.ConditionLink#getDst <em>Dst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dst</em>'.
	 * @see delete.ConditionLink#getDst()
	 * @see #getConditionLink()
	 * @generated
	 */
	EReference getConditionLink_Dst();

	/**
	 * Returns the meta object for the attribute '{@link delete.ConditionLink#isNegative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative</em>'.
	 * @see delete.ConditionLink#isNegative()
	 * @see #getConditionLink()
	 * @generated
	 */
	EAttribute getConditionLink_Negative();

	/**
	 * Returns the meta object for class '{@link delete.EqualLink <em>Equal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal Link</em>'.
	 * @see delete.EqualLink
	 * @generated
	 */
	EClass getEqualLink();

	/**
	 * Returns the meta object for the attribute '{@link delete.EqualLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see delete.EqualLink#getDesc()
	 * @see #getEqualLink()
	 * @generated
	 */
	EAttribute getEqualLink_Desc();

	/**
	 * Returns the meta object for class '{@link delete.GreaterThanLink <em>Greater Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Link</em>'.
	 * @see delete.GreaterThanLink
	 * @generated
	 */
	EClass getGreaterThanLink();

	/**
	 * Returns the meta object for the attribute '{@link delete.GreaterThanLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see delete.GreaterThanLink#getDesc()
	 * @see #getGreaterThanLink()
	 * @generated
	 */
	EAttribute getGreaterThanLink_Desc();

	/**
	 * Returns the meta object for class '{@link delete.GreaterEqualThanLink <em>Greater Equal Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Equal Than Link</em>'.
	 * @see delete.GreaterEqualThanLink
	 * @generated
	 */
	EClass getGreaterEqualThanLink();

	/**
	 * Returns the meta object for the attribute '{@link delete.GreaterEqualThanLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see delete.GreaterEqualThanLink#getDesc()
	 * @see #getGreaterEqualThanLink()
	 * @generated
	 */
	EAttribute getGreaterEqualThanLink_Desc();

	/**
	 * Returns the meta object for class '{@link delete.LowerThanLink <em>Lower Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Than Link</em>'.
	 * @see delete.LowerThanLink
	 * @generated
	 */
	EClass getLowerThanLink();

	/**
	 * Returns the meta object for the attribute '{@link delete.LowerThanLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see delete.LowerThanLink#getDesc()
	 * @see #getLowerThanLink()
	 * @generated
	 */
	EAttribute getLowerThanLink_Desc();

	/**
	 * Returns the meta object for class '{@link delete.LowerEqualThanLink <em>Lower Equal Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Equal Than Link</em>'.
	 * @see delete.LowerEqualThanLink
	 * @generated
	 */
	EClass getLowerEqualThanLink();

	/**
	 * Returns the meta object for the attribute '{@link delete.LowerEqualThanLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see delete.LowerEqualThanLink#getDesc()
	 * @see #getLowerEqualThanLink()
	 * @generated
	 */
	EAttribute getLowerEqualThanLink_Desc();

	/**
	 * Returns the meta object for class '{@link delete.InLink <em>In Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Link</em>'.
	 * @see delete.InLink
	 * @generated
	 */
	EClass getInLink();

	/**
	 * Returns the meta object for the attribute '{@link delete.InLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see delete.InLink#getDesc()
	 * @see #getInLink()
	 * @generated
	 */
	EAttribute getInLink_Desc();

	/**
	 * Returns the meta object for class '{@link delete.LikeLink <em>Like Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Like Link</em>'.
	 * @see delete.LikeLink
	 * @generated
	 */
	EClass getLikeLink();

	/**
	 * Returns the meta object for the attribute '{@link delete.LikeLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see delete.LikeLink#getDesc()
	 * @see #getLikeLink()
	 * @generated
	 */
	EAttribute getLikeLink_Desc();

	/**
	 * Returns the meta object for enum '{@link delete.RelationSelectOperationType <em>Relation Select Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Select Operation Type</em>'.
	 * @see delete.RelationSelectOperationType
	 * @generated
	 */
	EEnum getRelationSelectOperationType();

	/**
	 * Returns the meta object for enum '{@link delete.RelationSelectType <em>Relation Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Select Type</em>'.
	 * @see delete.RelationSelectType
	 * @generated
	 */
	EEnum getRelationSelectType();

	/**
	 * Returns the meta object for enum '{@link delete.SortType <em>Sort Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Type</em>'.
	 * @see delete.SortType
	 * @generated
	 */
	EEnum getSortType();

	/**
	 * Returns the meta object for enum '{@link delete.LiteralType <em>Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Literal Type</em>'.
	 * @see delete.LiteralType
	 * @generated
	 */
	EEnum getLiteralType();

	/**
	 * Returns the meta object for enum '{@link delete.JuncType <em>Junc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Junc Type</em>'.
	 * @see delete.JuncType
	 * @generated
	 */
	EEnum getJuncType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeleteFactory getDeleteFactory();

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
		 * The meta object literal for the '{@link delete.impl.DeleteSurfaceImpl <em>Surface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.DeleteSurfaceImpl
		 * @see delete.impl.DeletePackageImpl#getDeleteSurface()
		 * @generated
		 */
		EClass DELETE_SURFACE = eINSTANCE.getDeleteSurface();

		/**
		 * The meta object literal for the '<em><b>Input Insta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_SURFACE__INPUT_INSTA = eINSTANCE.getDeleteSurface_InputInsta();

		/**
		 * The meta object literal for the '<em><b>Table Insta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_SURFACE__TABLE_INSTA = eINSTANCE.getDeleteSurface_TableInsta();

		/**
		 * The meta object literal for the '<em><b>Where Insta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_SURFACE__WHERE_INSTA = eINSTANCE.getDeleteSurface_WhereInsta();

		/**
		 * The meta object literal for the '<em><b>Sort Instalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_SURFACE__SORT_INSTALMENT = eINSTANCE.getDeleteSurface_SortInstalment();

		/**
		 * The meta object literal for the '<em><b>Dummy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_SURFACE__DUMMY = eINSTANCE.getDeleteSurface_Dummy();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_SURFACE__TYPES = eINSTANCE.getDeleteSurface_Types();

		/**
		 * The meta object literal for the '<em><b>Funcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_SURFACE__FUNCS = eINSTANCE.getDeleteSurface_Funcs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_SURFACE__NAME = eINSTANCE.getDeleteSurface_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_SURFACE__DESCRIPTION = eINSTANCE.getDeleteSurface_Description();

		/**
		 * The meta object literal for the '<em><b>Associated Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_SURFACE__ASSOCIATED_CLASS = eINSTANCE.getDeleteSurface_AssociatedClass();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_SURFACE__USER_NAME = eINSTANCE.getDeleteSurface_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_SURFACE__PASSWORD = eINSTANCE.getDeleteSurface_Password();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_SURFACE__URI = eINSTANCE.getDeleteSurface_Uri();

		/**
		 * The meta object literal for the '{@link delete.impl.ConditionInstalmentImpl <em>Condition Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.ConditionInstalmentImpl
		 * @see delete.impl.DeletePackageImpl#getConditionInstalment()
		 * @generated
		 */
		EClass CONDITION_INSTALMENT = eINSTANCE.getConditionInstalment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_INSTALMENT__NAME = eINSTANCE.getConditionInstalment_Name();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_INSTALMENT__PARTS = eINSTANCE.getConditionInstalment_Parts();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_INSTALMENT__LINKS = eINSTANCE.getConditionInstalment_Links();

		/**
		 * The meta object literal for the '{@link delete.impl.DummyImpl <em>Dummy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.DummyImpl
		 * @see delete.impl.DeletePackageImpl#getDummy()
		 * @generated
		 */
		EClass DUMMY = eINSTANCE.getDummy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUMMY__NAME = eINSTANCE.getDummy_Name();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUMMY__PARTS = eINSTANCE.getDummy_Parts();

		/**
		 * The meta object literal for the '{@link delete.impl.TableListInstalmentImpl <em>Table List Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.TableListInstalmentImpl
		 * @see delete.impl.DeletePackageImpl#getTableListInstalment()
		 * @generated
		 */
		EClass TABLE_LIST_INSTALMENT = eINSTANCE.getTableListInstalment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_LIST_INSTALMENT__NAME = eINSTANCE.getTableListInstalment_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_LIST_INSTALMENT__TABLES = eINSTANCE.getTableListInstalment_Tables();

		/**
		 * The meta object literal for the '<em><b>Rels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_LIST_INSTALMENT__RELS = eINSTANCE.getTableListInstalment_Rels();

		/**
		 * The meta object literal for the '{@link delete.impl.RelationSelectImpl <em>Relation Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.RelationSelectImpl
		 * @see delete.impl.DeletePackageImpl#getRelationSelect()
		 * @generated
		 */
		EClass RELATION_SELECT = eINSTANCE.getRelationSelect();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_SELECT__SOURCE = eINSTANCE.getRelationSelect_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_SELECT__TARGET = eINSTANCE.getRelationSelect_Target();

		/**
		 * The meta object literal for the '<em><b>Op Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_SELECT__OP_TYPE = eINSTANCE.getRelationSelect_OpType();

		/**
		 * The meta object literal for the '{@link delete.impl.InnerjoinRelsImpl <em>Innerjoin Rels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.InnerjoinRelsImpl
		 * @see delete.impl.DeletePackageImpl#getInnerjoinRels()
		 * @generated
		 */
		EClass INNERJOIN_RELS = eINSTANCE.getInnerjoinRels();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INNERJOIN_RELS__TYPE = eINSTANCE.getInnerjoinRels_Type();

		/**
		 * The meta object literal for the '{@link delete.impl.LeftOuterJoinRelsImpl <em>Left Outer Join Rels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.LeftOuterJoinRelsImpl
		 * @see delete.impl.DeletePackageImpl#getLeftOuterJoinRels()
		 * @generated
		 */
		EClass LEFT_OUTER_JOIN_RELS = eINSTANCE.getLeftOuterJoinRels();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEFT_OUTER_JOIN_RELS__TYPE = eINSTANCE.getLeftOuterJoinRels_Type();

		/**
		 * The meta object literal for the '{@link delete.impl.RightOuterJoinRelsImpl <em>Right Outer Join Rels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.RightOuterJoinRelsImpl
		 * @see delete.impl.DeletePackageImpl#getRightOuterJoinRels()
		 * @generated
		 */
		EClass RIGHT_OUTER_JOIN_RELS = eINSTANCE.getRightOuterJoinRels();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIGHT_OUTER_JOIN_RELS__TYPE = eINSTANCE.getRightOuterJoinRels_Type();

		/**
		 * The meta object literal for the '{@link delete.impl.FullOuterJoinRelsImpl <em>Full Outer Join Rels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.FullOuterJoinRelsImpl
		 * @see delete.impl.DeletePackageImpl#getFullOuterJoinRels()
		 * @generated
		 */
		EClass FULL_OUTER_JOIN_RELS = eINSTANCE.getFullOuterJoinRels();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULL_OUTER_JOIN_RELS__TYPE = eINSTANCE.getFullOuterJoinRels_Type();

		/**
		 * The meta object literal for the '{@link delete.impl.InputInstalmentImpl <em>Input Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.InputInstalmentImpl
		 * @see delete.impl.DeletePackageImpl#getInputInstalment()
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
		 * The meta object literal for the '{@link delete.impl.SortInstalmentImpl <em>Sort Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.SortInstalmentImpl
		 * @see delete.impl.DeletePackageImpl#getSortInstalment()
		 * @generated
		 */
		EClass SORT_INSTALMENT = eINSTANCE.getSortInstalment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORT_INSTALMENT__NAME = eINSTANCE.getSortInstalment_Name();

		/**
		 * The meta object literal for the '<em><b>Pointers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT_INSTALMENT__POINTERS = eINSTANCE.getSortInstalment_Pointers();

		/**
		 * The meta object literal for the '{@link delete.impl.FieldSPointerImpl <em>Field SPointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.FieldSPointerImpl
		 * @see delete.impl.DeletePackageImpl#getFieldSPointer()
		 * @generated
		 */
		EClass FIELD_SPOINTER = eINSTANCE.getFieldSPointer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_SPOINTER__NAME = eINSTANCE.getFieldSPointer_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_SPOINTER__TYPE = eINSTANCE.getFieldSPointer_Type();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_SPOINTER__FIELD = eINSTANCE.getFieldSPointer_Field();

		/**
		 * The meta object literal for the '{@link delete.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.AbstractNodeImpl
		 * @see delete.impl.DeletePackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '{@link delete.impl.MyTableImpl <em>My Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.MyTableImpl
		 * @see delete.impl.DeletePackageImpl#getMyTable()
		 * @generated
		 */
		EClass MY_TABLE = eINSTANCE.getMyTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_TABLE__NAME = eINSTANCE.getMyTable_Name();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_TABLE__ALIAS = eINSTANCE.getMyTable_Alias();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_TABLE__FIELDS = eINSTANCE.getMyTable_Fields();

		/**
		 * The meta object literal for the '{@link delete.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.NodeImpl
		 * @see delete.impl.DeletePackageImpl#getNode()
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
		 * The meta object literal for the '<em><b>Column name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__COLUMN_NAME = eINSTANCE.getNode_Column_name();

		/**
		 * The meta object literal for the '<em><b>Listable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LISTABLE = eINSTANCE.getNode_Listable();

		/**
		 * The meta object literal for the '{@link delete.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.FieldImpl
		 * @see delete.impl.DeletePackageImpl#getField()
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
		 * The meta object literal for the '{@link delete.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.LiteralImpl
		 * @see delete.impl.DeletePackageImpl#getLiteral()
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
		 * The meta object literal for the '{@link delete.impl.NullLiteralImpl <em>Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.NullLiteralImpl
		 * @see delete.impl.DeletePackageImpl#getNullLiteral()
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
		 * The meta object literal for the '{@link delete.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.FunctionImpl
		 * @see delete.impl.DeletePackageImpl#getFunction()
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
		 * The meta object literal for the '{@link delete.impl.FunctionDefImpl <em>Function Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.FunctionDefImpl
		 * @see delete.impl.DeletePackageImpl#getFunctionDef()
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
		 * The meta object literal for the '{@link delete.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.InputImpl
		 * @see delete.impl.DeletePackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Input Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INPUT_REF = eINSTANCE.getInput_InputRef();

		/**
		 * The meta object literal for the '{@link delete.impl.InputDefImpl <em>Input Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.InputDefImpl
		 * @see delete.impl.DeletePackageImpl#getInputDef()
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
		 * The meta object literal for the '{@link delete.impl.InputStringDefImpl <em>Input String Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.InputStringDefImpl
		 * @see delete.impl.DeletePackageImpl#getInputStringDef()
		 * @generated
		 */
		EClass INPUT_STRING_DEF = eINSTANCE.getInputStringDef();

		/**
		 * The meta object literal for the '{@link delete.impl.InputIntDefImpl <em>Input Int Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.InputIntDefImpl
		 * @see delete.impl.DeletePackageImpl#getInputIntDef()
		 * @generated
		 */
		EClass INPUT_INT_DEF = eINSTANCE.getInputIntDef();

		/**
		 * The meta object literal for the '{@link delete.impl.InputDateDefImpl <em>Input Date Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.InputDateDefImpl
		 * @see delete.impl.DeletePackageImpl#getInputDateDef()
		 * @generated
		 */
		EClass INPUT_DATE_DEF = eINSTANCE.getInputDateDef();

		/**
		 * The meta object literal for the '{@link delete.impl.InputBitsDefImpl <em>Input Bits Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.InputBitsDefImpl
		 * @see delete.impl.DeletePackageImpl#getInputBitsDef()
		 * @generated
		 */
		EClass INPUT_BITS_DEF = eINSTANCE.getInputBitsDef();

		/**
		 * The meta object literal for the '{@link delete.impl.InputFloatDefImpl <em>Input Float Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.InputFloatDefImpl
		 * @see delete.impl.DeletePackageImpl#getInputFloatDef()
		 * @generated
		 */
		EClass INPUT_FLOAT_DEF = eINSTANCE.getInputFloatDef();

		/**
		 * The meta object literal for the '{@link delete.impl.CallSurfaceQueryImpl <em>Call Surface Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.CallSurfaceQueryImpl
		 * @see delete.impl.DeletePackageImpl#getCallSurfaceQuery()
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
		 * The meta object literal for the '{@link delete.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.TypeImpl
		 * @see delete.impl.DeletePackageImpl#getType()
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
		 * The meta object literal for the '{@link delete.impl.SubtypeImpl <em>Subtype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.SubtypeImpl
		 * @see delete.impl.DeletePackageImpl#getSubtype()
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
		 * The meta object literal for the '{@link delete.impl.AbstractConditionElementImpl <em>Abstract Condition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.AbstractConditionElementImpl
		 * @see delete.impl.DeletePackageImpl#getAbstractConditionElement()
		 * @generated
		 */
		EClass ABSTRACT_CONDITION_ELEMENT = eINSTANCE.getAbstractConditionElement();

		/**
		 * The meta object literal for the '{@link delete.impl.JunctionImpl <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.JunctionImpl
		 * @see delete.impl.DeletePackageImpl#getJunction()
		 * @generated
		 */
		EClass JUNCTION = eINSTANCE.getJunction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNCTION__TYPE = eINSTANCE.getJunction_Type();

		/**
		 * The meta object literal for the '<em><b>Rels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUNCTION__RELS = eINSTANCE.getJunction_Rels();

		/**
		 * The meta object literal for the '{@link delete.impl.RootJunctionImpl <em>Root Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.RootJunctionImpl
		 * @see delete.impl.DeletePackageImpl#getRootJunction()
		 * @generated
		 */
		EClass ROOT_JUNCTION = eINSTANCE.getRootJunction();

		/**
		 * The meta object literal for the '{@link delete.impl.JuncRelationshipImpl <em>Junc Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.JuncRelationshipImpl
		 * @see delete.impl.DeletePackageImpl#getJuncRelationship()
		 * @generated
		 */
		EClass JUNC_RELATIONSHIP = eINSTANCE.getJuncRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUNC_RELATIONSHIP__SOURCE = eINSTANCE.getJuncRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUNC_RELATIONSHIP__TARGET = eINSTANCE.getJuncRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNC_RELATIONSHIP__INDEX = eINSTANCE.getJuncRelationship_Index();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNC_RELATIONSHIP__TYPE = eINSTANCE.getJuncRelationship_Type();

		/**
		 * The meta object literal for the '{@link delete.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.TermImpl
		 * @see delete.impl.DeletePackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__PARAMS = eINSTANCE.getTerm_Params();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__TITLE = eINSTANCE.getTerm_Title();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__LINK = eINSTANCE.getTerm_Link();

		/**
		 * The meta object literal for the '{@link delete.impl.ConditionLinkImpl <em>Condition Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.ConditionLinkImpl
		 * @see delete.impl.DeletePackageImpl#getConditionLink()
		 * @generated
		 */
		EClass CONDITION_LINK = eINSTANCE.getConditionLink();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_LINK__SRC = eINSTANCE.getConditionLink_Src();

		/**
		 * The meta object literal for the '<em><b>Dst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_LINK__DST = eINSTANCE.getConditionLink_Dst();

		/**
		 * The meta object literal for the '<em><b>Negative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_LINK__NEGATIVE = eINSTANCE.getConditionLink_Negative();

		/**
		 * The meta object literal for the '{@link delete.impl.EqualLinkImpl <em>Equal Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.EqualLinkImpl
		 * @see delete.impl.DeletePackageImpl#getEqualLink()
		 * @generated
		 */
		EClass EQUAL_LINK = eINSTANCE.getEqualLink();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUAL_LINK__DESC = eINSTANCE.getEqualLink_Desc();

		/**
		 * The meta object literal for the '{@link delete.impl.GreaterThanLinkImpl <em>Greater Than Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.GreaterThanLinkImpl
		 * @see delete.impl.DeletePackageImpl#getGreaterThanLink()
		 * @generated
		 */
		EClass GREATER_THAN_LINK = eINSTANCE.getGreaterThanLink();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREATER_THAN_LINK__DESC = eINSTANCE.getGreaterThanLink_Desc();

		/**
		 * The meta object literal for the '{@link delete.impl.GreaterEqualThanLinkImpl <em>Greater Equal Than Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.GreaterEqualThanLinkImpl
		 * @see delete.impl.DeletePackageImpl#getGreaterEqualThanLink()
		 * @generated
		 */
		EClass GREATER_EQUAL_THAN_LINK = eINSTANCE.getGreaterEqualThanLink();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREATER_EQUAL_THAN_LINK__DESC = eINSTANCE.getGreaterEqualThanLink_Desc();

		/**
		 * The meta object literal for the '{@link delete.impl.LowerThanLinkImpl <em>Lower Than Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.LowerThanLinkImpl
		 * @see delete.impl.DeletePackageImpl#getLowerThanLink()
		 * @generated
		 */
		EClass LOWER_THAN_LINK = eINSTANCE.getLowerThanLink();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOWER_THAN_LINK__DESC = eINSTANCE.getLowerThanLink_Desc();

		/**
		 * The meta object literal for the '{@link delete.impl.LowerEqualThanLinkImpl <em>Lower Equal Than Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.LowerEqualThanLinkImpl
		 * @see delete.impl.DeletePackageImpl#getLowerEqualThanLink()
		 * @generated
		 */
		EClass LOWER_EQUAL_THAN_LINK = eINSTANCE.getLowerEqualThanLink();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOWER_EQUAL_THAN_LINK__DESC = eINSTANCE.getLowerEqualThanLink_Desc();

		/**
		 * The meta object literal for the '{@link delete.impl.InLinkImpl <em>In Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.InLinkImpl
		 * @see delete.impl.DeletePackageImpl#getInLink()
		 * @generated
		 */
		EClass IN_LINK = eINSTANCE.getInLink();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_LINK__DESC = eINSTANCE.getInLink_Desc();

		/**
		 * The meta object literal for the '{@link delete.impl.LikeLinkImpl <em>Like Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.impl.LikeLinkImpl
		 * @see delete.impl.DeletePackageImpl#getLikeLink()
		 * @generated
		 */
		EClass LIKE_LINK = eINSTANCE.getLikeLink();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIKE_LINK__DESC = eINSTANCE.getLikeLink_Desc();

		/**
		 * The meta object literal for the '{@link delete.RelationSelectOperationType <em>Relation Select Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.RelationSelectOperationType
		 * @see delete.impl.DeletePackageImpl#getRelationSelectOperationType()
		 * @generated
		 */
		EEnum RELATION_SELECT_OPERATION_TYPE = eINSTANCE.getRelationSelectOperationType();

		/**
		 * The meta object literal for the '{@link delete.RelationSelectType <em>Relation Select Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.RelationSelectType
		 * @see delete.impl.DeletePackageImpl#getRelationSelectType()
		 * @generated
		 */
		EEnum RELATION_SELECT_TYPE = eINSTANCE.getRelationSelectType();

		/**
		 * The meta object literal for the '{@link delete.SortType <em>Sort Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.SortType
		 * @see delete.impl.DeletePackageImpl#getSortType()
		 * @generated
		 */
		EEnum SORT_TYPE = eINSTANCE.getSortType();

		/**
		 * The meta object literal for the '{@link delete.LiteralType <em>Literal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.LiteralType
		 * @see delete.impl.DeletePackageImpl#getLiteralType()
		 * @generated
		 */
		EEnum LITERAL_TYPE = eINSTANCE.getLiteralType();

		/**
		 * The meta object literal for the '{@link delete.JuncType <em>Junc Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delete.JuncType
		 * @see delete.impl.DeletePackageImpl#getJuncType()
		 * @generated
		 */
		EEnum JUNC_TYPE = eINSTANCE.getJuncType();

	}

} //DeletePackage
