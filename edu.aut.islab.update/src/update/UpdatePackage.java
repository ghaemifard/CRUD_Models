/**
 */
package update;

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
 * @see update.UpdateFactory
 * @model kind="package"
 * @generated
 */
public interface UpdatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "update";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.update.it.is/v1.0/beta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "update";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UpdatePackage eINSTANCE = update.impl.UpdatePackageImpl.init();

	/**
	 * The meta object id for the '{@link update.impl.UpdateSurfaceImpl <em>Surface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.UpdateSurfaceImpl
	 * @see update.impl.UpdatePackageImpl#getUpdateSurface()
	 * @generated
	 */
	int UPDATE_SURFACE = 0;

	/**
	 * The feature id for the '<em><b>Input Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__INPUT_INSTALMENT = 0;

	/**
	 * The feature id for the '<em><b>Prepare List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__PREPARE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Table Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__TABLE_INSTALMENT = 2;

	/**
	 * The feature id for the '<em><b>Sort Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__SORT_INSTALMENT = 3;

	/**
	 * The feature id for the '<em><b>Where Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__WHERE_INSTALMENT = 4;

	/**
	 * The feature id for the '<em><b>Lfs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__LFS = 5;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__TYPES = 6;

	/**
	 * The feature id for the '<em><b>Funcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__FUNCS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Associated Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__ASSOCIATED_CLASS = 10;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__USER_NAME = 11;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__PASSWORD = 12;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE__URI = 13;

	/**
	 * The number of structural features of the '<em>Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_SURFACE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link update.impl.LinkFieldImpl <em>Link Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.LinkFieldImpl
	 * @see update.impl.UpdatePackageImpl#getLinkField()
	 * @generated
	 */
	int LINK_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FIELD__SRC = 0;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FIELD__DST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FIELD__NAME = 2;

	/**
	 * The number of structural features of the '<em>Link Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FIELD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link update.impl.InputInstalmentImpl <em>Input Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.InputInstalmentImpl
	 * @see update.impl.UpdatePackageImpl#getInputInstalment()
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
	 * The meta object id for the '{@link update.impl.PrepareListImpl <em>Prepare List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.PrepareListImpl
	 * @see update.impl.UpdatePackageImpl#getPrepareList()
	 * @generated
	 */
	int PREPARE_LIST = 3;

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
	 * The meta object id for the '{@link update.impl.ConditionInstalmentImpl <em>Condition Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.ConditionInstalmentImpl
	 * @see update.impl.UpdatePackageImpl#getConditionInstalment()
	 * @generated
	 */
	int CONDITION_INSTALMENT = 4;

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
	 * The meta object id for the '{@link update.impl.TableSelectionImpl <em>Table Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.TableSelectionImpl
	 * @see update.impl.UpdatePackageImpl#getTableSelection()
	 * @generated
	 */
	int TABLE_SELECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SELECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SELECTION__TABLES = 1;

	/**
	 * The feature id for the '<em><b>Rels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SELECTION__RELS = 2;

	/**
	 * The number of structural features of the '<em>Table Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SELECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link update.impl.RelationSelectImpl <em>Relation Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.RelationSelectImpl
	 * @see update.impl.UpdatePackageImpl#getRelationSelect()
	 * @generated
	 */
	int RELATION_SELECT = 6;

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
	 * The meta object id for the '{@link update.impl.InnerjoinRelsImpl <em>Innerjoin Rels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.InnerjoinRelsImpl
	 * @see update.impl.UpdatePackageImpl#getInnerjoinRels()
	 * @generated
	 */
	int INNERJOIN_RELS = 7;

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
	 * The meta object id for the '{@link update.impl.LeftOuterJoinRelsImpl <em>Left Outer Join Rels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.LeftOuterJoinRelsImpl
	 * @see update.impl.UpdatePackageImpl#getLeftOuterJoinRels()
	 * @generated
	 */
	int LEFT_OUTER_JOIN_RELS = 8;

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
	 * The meta object id for the '{@link update.impl.RightOuterJoinRelsImpl <em>Right Outer Join Rels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.RightOuterJoinRelsImpl
	 * @see update.impl.UpdatePackageImpl#getRightOuterJoinRels()
	 * @generated
	 */
	int RIGHT_OUTER_JOIN_RELS = 9;

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
	 * The meta object id for the '{@link update.impl.FullOuterJoinRelsImpl <em>Full Outer Join Rels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.FullOuterJoinRelsImpl
	 * @see update.impl.UpdatePackageImpl#getFullOuterJoinRels()
	 * @generated
	 */
	int FULL_OUTER_JOIN_RELS = 10;

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
	 * The meta object id for the '{@link update.impl.SortInstalmentImpl <em>Sort Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.SortInstalmentImpl
	 * @see update.impl.UpdatePackageImpl#getSortInstalment()
	 * @generated
	 */
	int SORT_INSTALMENT = 11;

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
	 * The meta object id for the '{@link update.impl.FieldSPointerImpl <em>Field SPointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.FieldSPointerImpl
	 * @see update.impl.UpdatePackageImpl#getFieldSPointer()
	 * @generated
	 */
	int FIELD_SPOINTER = 12;

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
	 * The meta object id for the '{@link update.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.AbstractNodeImpl
	 * @see update.impl.UpdatePackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 13;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link update.impl.MyTableImpl <em>My Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.MyTableImpl
	 * @see update.impl.UpdatePackageImpl#getMyTable()
	 * @generated
	 */
	int MY_TABLE = 14;

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
	 * The feature id for the '<em><b>Fakes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_TABLE__FAKES = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>My Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_TABLE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link update.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.NodeImpl
	 * @see update.impl.UpdatePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 15;

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
	 * The meta object id for the '{@link update.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.FieldImpl
	 * @see update.impl.UpdatePackageImpl#getField()
	 * @generated
	 */
	int FIELD = 16;

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
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TABLE_NAME = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TABLE_REF = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Distict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DISTICT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link update.impl.RealFieldImpl <em>Real Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.RealFieldImpl
	 * @see update.impl.UpdatePackageImpl#getRealField()
	 * @generated
	 */
	int REAL_FIELD = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIELD__TABLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIELD__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIELD__SUBTYPE = 3;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIELD__LISTABLE = 4;

	/**
	 * The feature id for the '<em><b>Linkf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIELD__LINKF = 5;

	/**
	 * The feature id for the '<em><b>Distict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIELD__DISTICT = 6;

	/**
	 * The number of structural features of the '<em>Real Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIELD_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link update.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.LiteralImpl
	 * @see update.impl.UpdatePackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 18;

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
	 * The meta object id for the '{@link update.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.NullLiteralImpl
	 * @see update.impl.UpdatePackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 19;

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
	 * The meta object id for the '{@link update.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.FunctionImpl
	 * @see update.impl.UpdatePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 20;

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
	 * The meta object id for the '{@link update.impl.FunctionDefImpl <em>Function Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.FunctionDefImpl
	 * @see update.impl.UpdatePackageImpl#getFunctionDef()
	 * @generated
	 */
	int FUNCTION_DEF = 21;

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
	 * The meta object id for the '{@link update.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.InputImpl
	 * @see update.impl.UpdatePackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 22;

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
	 * The meta object id for the '{@link update.impl.InputDefImpl <em>Input Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.InputDefImpl
	 * @see update.impl.UpdatePackageImpl#getInputDef()
	 * @generated
	 */
	int INPUT_DEF = 23;

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
	 * The meta object id for the '{@link update.impl.InputStringDefImpl <em>Input String Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.InputStringDefImpl
	 * @see update.impl.UpdatePackageImpl#getInputStringDef()
	 * @generated
	 */
	int INPUT_STRING_DEF = 24;

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
	 * The meta object id for the '{@link update.impl.InputIntDefImpl <em>Input Int Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.InputIntDefImpl
	 * @see update.impl.UpdatePackageImpl#getInputIntDef()
	 * @generated
	 */
	int INPUT_INT_DEF = 25;

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
	 * The meta object id for the '{@link update.impl.InputDateDefImpl <em>Input Date Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.InputDateDefImpl
	 * @see update.impl.UpdatePackageImpl#getInputDateDef()
	 * @generated
	 */
	int INPUT_DATE_DEF = 26;

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
	 * The meta object id for the '{@link update.impl.InputBitsDefImpl <em>Input Bits Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.InputBitsDefImpl
	 * @see update.impl.UpdatePackageImpl#getInputBitsDef()
	 * @generated
	 */
	int INPUT_BITS_DEF = 27;

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
	 * The meta object id for the '{@link update.impl.InputFloatDefImpl <em>Input Float Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.InputFloatDefImpl
	 * @see update.impl.UpdatePackageImpl#getInputFloatDef()
	 * @generated
	 */
	int INPUT_FLOAT_DEF = 28;

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
	 * The meta object id for the '{@link update.impl.CallSurfaceQueryImpl <em>Call Surface Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.CallSurfaceQueryImpl
	 * @see update.impl.UpdatePackageImpl#getCallSurfaceQuery()
	 * @generated
	 */
	int CALL_SURFACE_QUERY = 29;

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
	 * The meta object id for the '{@link update.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.TypeImpl
	 * @see update.impl.UpdatePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 30;

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
	 * The meta object id for the '{@link update.impl.SubtypeImpl <em>Subtype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.SubtypeImpl
	 * @see update.impl.UpdatePackageImpl#getSubtype()
	 * @generated
	 */
	int SUBTYPE = 31;

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
	 * The meta object id for the '{@link update.impl.AbstractConditionElementImpl <em>Abstract Condition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.AbstractConditionElementImpl
	 * @see update.impl.UpdatePackageImpl#getAbstractConditionElement()
	 * @generated
	 */
	int ABSTRACT_CONDITION_ELEMENT = 32;

	/**
	 * The number of structural features of the '<em>Abstract Condition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link update.impl.JunctionImpl <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.JunctionImpl
	 * @see update.impl.UpdatePackageImpl#getJunction()
	 * @generated
	 */
	int JUNCTION = 33;

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
	 * The meta object id for the '{@link update.impl.RootJunctionImpl <em>Root Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.RootJunctionImpl
	 * @see update.impl.UpdatePackageImpl#getRootJunction()
	 * @generated
	 */
	int ROOT_JUNCTION = 34;

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
	 * The meta object id for the '{@link update.impl.JuncRelationshipImpl <em>Junc Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.JuncRelationshipImpl
	 * @see update.impl.UpdatePackageImpl#getJuncRelationship()
	 * @generated
	 */
	int JUNC_RELATIONSHIP = 35;

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
	 * The meta object id for the '{@link update.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.TermImpl
	 * @see update.impl.UpdatePackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 36;

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
	 * The meta object id for the '{@link update.impl.ConditionLinkImpl <em>Condition Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.ConditionLinkImpl
	 * @see update.impl.UpdatePackageImpl#getConditionLink()
	 * @generated
	 */
	int CONDITION_LINK = 37;

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
	 * The meta object id for the '{@link update.impl.EqualLinkImpl <em>Equal Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.EqualLinkImpl
	 * @see update.impl.UpdatePackageImpl#getEqualLink()
	 * @generated
	 */
	int EQUAL_LINK = 38;

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
	 * The meta object id for the '{@link update.impl.GreaterThanLinkImpl <em>Greater Than Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.GreaterThanLinkImpl
	 * @see update.impl.UpdatePackageImpl#getGreaterThanLink()
	 * @generated
	 */
	int GREATER_THAN_LINK = 39;

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
	 * The meta object id for the '{@link update.impl.GreaterEqualThanLinkImpl <em>Greater Equal Than Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.GreaterEqualThanLinkImpl
	 * @see update.impl.UpdatePackageImpl#getGreaterEqualThanLink()
	 * @generated
	 */
	int GREATER_EQUAL_THAN_LINK = 40;

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
	 * The meta object id for the '{@link update.impl.LowerThanLinkImpl <em>Lower Than Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.LowerThanLinkImpl
	 * @see update.impl.UpdatePackageImpl#getLowerThanLink()
	 * @generated
	 */
	int LOWER_THAN_LINK = 41;

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
	 * The meta object id for the '{@link update.impl.LowerEqualThanLinkImpl <em>Lower Equal Than Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.LowerEqualThanLinkImpl
	 * @see update.impl.UpdatePackageImpl#getLowerEqualThanLink()
	 * @generated
	 */
	int LOWER_EQUAL_THAN_LINK = 42;

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
	 * The meta object id for the '{@link update.impl.InLinkImpl <em>In Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.InLinkImpl
	 * @see update.impl.UpdatePackageImpl#getInLink()
	 * @generated
	 */
	int IN_LINK = 43;

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
	 * The meta object id for the '{@link update.impl.LikeLinkImpl <em>Like Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.impl.LikeLinkImpl
	 * @see update.impl.UpdatePackageImpl#getLikeLink()
	 * @generated
	 */
	int LIKE_LINK = 44;

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
	 * The meta object id for the '{@link update.RelationSelectOperationType <em>Relation Select Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.RelationSelectOperationType
	 * @see update.impl.UpdatePackageImpl#getRelationSelectOperationType()
	 * @generated
	 */
	int RELATION_SELECT_OPERATION_TYPE = 45;

	/**
	 * The meta object id for the '{@link update.RelationSelectType <em>Relation Select Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.RelationSelectType
	 * @see update.impl.UpdatePackageImpl#getRelationSelectType()
	 * @generated
	 */
	int RELATION_SELECT_TYPE = 46;

	/**
	 * The meta object id for the '{@link update.LiteralType <em>Literal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.LiteralType
	 * @see update.impl.UpdatePackageImpl#getLiteralType()
	 * @generated
	 */
	int LITERAL_TYPE = 47;

	/**
	 * The meta object id for the '{@link update.SortType <em>Sort Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.SortType
	 * @see update.impl.UpdatePackageImpl#getSortType()
	 * @generated
	 */
	int SORT_TYPE = 48;

	/**
	 * The meta object id for the '{@link update.JuncType <em>Junc Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see update.JuncType
	 * @see update.impl.UpdatePackageImpl#getJuncType()
	 * @generated
	 */
	int JUNC_TYPE = 49;


	/**
	 * Returns the meta object for class '{@link update.UpdateSurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface</em>'.
	 * @see update.UpdateSurface
	 * @generated
	 */
	EClass getUpdateSurface();

	/**
	 * Returns the meta object for the containment reference '{@link update.UpdateSurface#getInputInstalment <em>Input Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Instalment</em>'.
	 * @see update.UpdateSurface#getInputInstalment()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EReference getUpdateSurface_InputInstalment();

	/**
	 * Returns the meta object for the containment reference '{@link update.UpdateSurface#getPrepareList <em>Prepare List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prepare List</em>'.
	 * @see update.UpdateSurface#getPrepareList()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EReference getUpdateSurface_PrepareList();

	/**
	 * Returns the meta object for the containment reference '{@link update.UpdateSurface#getTableInstalment <em>Table Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Instalment</em>'.
	 * @see update.UpdateSurface#getTableInstalment()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EReference getUpdateSurface_TableInstalment();

	/**
	 * Returns the meta object for the containment reference '{@link update.UpdateSurface#getSortInstalment <em>Sort Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort Instalment</em>'.
	 * @see update.UpdateSurface#getSortInstalment()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EReference getUpdateSurface_SortInstalment();

	/**
	 * Returns the meta object for the containment reference '{@link update.UpdateSurface#getWhereInstalment <em>Where Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where Instalment</em>'.
	 * @see update.UpdateSurface#getWhereInstalment()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EReference getUpdateSurface_WhereInstalment();

	/**
	 * Returns the meta object for the containment reference list '{@link update.UpdateSurface#getLfs <em>Lfs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lfs</em>'.
	 * @see update.UpdateSurface#getLfs()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EReference getUpdateSurface_Lfs();

	/**
	 * Returns the meta object for the reference list '{@link update.UpdateSurface#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see update.UpdateSurface#getTypes()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EReference getUpdateSurface_Types();

	/**
	 * Returns the meta object for the reference list '{@link update.UpdateSurface#getFuncs <em>Funcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Funcs</em>'.
	 * @see update.UpdateSurface#getFuncs()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EReference getUpdateSurface_Funcs();

	/**
	 * Returns the meta object for the attribute '{@link update.UpdateSurface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.UpdateSurface#getName()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EAttribute getUpdateSurface_Name();

	/**
	 * Returns the meta object for the attribute '{@link update.UpdateSurface#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see update.UpdateSurface#getDescription()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EAttribute getUpdateSurface_Description();

	/**
	 * Returns the meta object for the attribute '{@link update.UpdateSurface#getAssociatedClass <em>Associated Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated Class</em>'.
	 * @see update.UpdateSurface#getAssociatedClass()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EAttribute getUpdateSurface_AssociatedClass();

	/**
	 * Returns the meta object for the attribute '{@link update.UpdateSurface#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see update.UpdateSurface#getUserName()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EAttribute getUpdateSurface_UserName();

	/**
	 * Returns the meta object for the attribute '{@link update.UpdateSurface#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see update.UpdateSurface#getPassword()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EAttribute getUpdateSurface_Password();

	/**
	 * Returns the meta object for the attribute '{@link update.UpdateSurface#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see update.UpdateSurface#getUri()
	 * @see #getUpdateSurface()
	 * @generated
	 */
	EAttribute getUpdateSurface_Uri();

	/**
	 * Returns the meta object for class '{@link update.LinkField <em>Link Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Field</em>'.
	 * @see update.LinkField
	 * @generated
	 */
	EClass getLinkField();

	/**
	 * Returns the meta object for the reference '{@link update.LinkField#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see update.LinkField#getSrc()
	 * @see #getLinkField()
	 * @generated
	 */
	EReference getLinkField_Src();

	/**
	 * Returns the meta object for the reference '{@link update.LinkField#getDst <em>Dst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dst</em>'.
	 * @see update.LinkField#getDst()
	 * @see #getLinkField()
	 * @generated
	 */
	EReference getLinkField_Dst();

	/**
	 * Returns the meta object for the attribute '{@link update.LinkField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.LinkField#getName()
	 * @see #getLinkField()
	 * @generated
	 */
	EAttribute getLinkField_Name();

	/**
	 * Returns the meta object for class '{@link update.InputInstalment <em>Input Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Instalment</em>'.
	 * @see update.InputInstalment
	 * @generated
	 */
	EClass getInputInstalment();

	/**
	 * Returns the meta object for the attribute '{@link update.InputInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.InputInstalment#getName()
	 * @see #getInputInstalment()
	 * @generated
	 */
	EAttribute getInputInstalment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link update.InputInstalment#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see update.InputInstalment#getInputs()
	 * @see #getInputInstalment()
	 * @generated
	 */
	EReference getInputInstalment_Inputs();

	/**
	 * Returns the meta object for class '{@link update.PrepareList <em>Prepare List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepare List</em>'.
	 * @see update.PrepareList
	 * @generated
	 */
	EClass getPrepareList();

	/**
	 * Returns the meta object for the attribute '{@link update.PrepareList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.PrepareList#getName()
	 * @see #getPrepareList()
	 * @generated
	 */
	EAttribute getPrepareList_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link update.PrepareList#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see update.PrepareList#getNodes()
	 * @see #getPrepareList()
	 * @generated
	 */
	EReference getPrepareList_Nodes();

	/**
	 * Returns the meta object for class '{@link update.ConditionInstalment <em>Condition Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Instalment</em>'.
	 * @see update.ConditionInstalment
	 * @generated
	 */
	EClass getConditionInstalment();

	/**
	 * Returns the meta object for the attribute '{@link update.ConditionInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.ConditionInstalment#getName()
	 * @see #getConditionInstalment()
	 * @generated
	 */
	EAttribute getConditionInstalment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link update.ConditionInstalment#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see update.ConditionInstalment#getParts()
	 * @see #getConditionInstalment()
	 * @generated
	 */
	EReference getConditionInstalment_Parts();

	/**
	 * Returns the meta object for the containment reference list '{@link update.ConditionInstalment#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see update.ConditionInstalment#getLinks()
	 * @see #getConditionInstalment()
	 * @generated
	 */
	EReference getConditionInstalment_Links();

	/**
	 * Returns the meta object for class '{@link update.TableSelection <em>Table Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Selection</em>'.
	 * @see update.TableSelection
	 * @generated
	 */
	EClass getTableSelection();

	/**
	 * Returns the meta object for the attribute '{@link update.TableSelection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.TableSelection#getName()
	 * @see #getTableSelection()
	 * @generated
	 */
	EAttribute getTableSelection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link update.TableSelection#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see update.TableSelection#getTables()
	 * @see #getTableSelection()
	 * @generated
	 */
	EReference getTableSelection_Tables();

	/**
	 * Returns the meta object for the containment reference list '{@link update.TableSelection#getRels <em>Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rels</em>'.
	 * @see update.TableSelection#getRels()
	 * @see #getTableSelection()
	 * @generated
	 */
	EReference getTableSelection_Rels();

	/**
	 * Returns the meta object for class '{@link update.RelationSelect <em>Relation Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Select</em>'.
	 * @see update.RelationSelect
	 * @generated
	 */
	EClass getRelationSelect();

	/**
	 * Returns the meta object for the reference '{@link update.RelationSelect#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see update.RelationSelect#getSource()
	 * @see #getRelationSelect()
	 * @generated
	 */
	EReference getRelationSelect_Source();

	/**
	 * Returns the meta object for the reference '{@link update.RelationSelect#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see update.RelationSelect#getTarget()
	 * @see #getRelationSelect()
	 * @generated
	 */
	EReference getRelationSelect_Target();

	/**
	 * Returns the meta object for the attribute '{@link update.RelationSelect#getOpType <em>Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Type</em>'.
	 * @see update.RelationSelect#getOpType()
	 * @see #getRelationSelect()
	 * @generated
	 */
	EAttribute getRelationSelect_OpType();

	/**
	 * Returns the meta object for class '{@link update.InnerjoinRels <em>Innerjoin Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Innerjoin Rels</em>'.
	 * @see update.InnerjoinRels
	 * @generated
	 */
	EClass getInnerjoinRels();

	/**
	 * Returns the meta object for the attribute '{@link update.InnerjoinRels#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see update.InnerjoinRels#getType()
	 * @see #getInnerjoinRels()
	 * @generated
	 */
	EAttribute getInnerjoinRels_Type();

	/**
	 * Returns the meta object for class '{@link update.LeftOuterJoinRels <em>Left Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Outer Join Rels</em>'.
	 * @see update.LeftOuterJoinRels
	 * @generated
	 */
	EClass getLeftOuterJoinRels();

	/**
	 * Returns the meta object for the attribute '{@link update.LeftOuterJoinRels#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see update.LeftOuterJoinRels#getType()
	 * @see #getLeftOuterJoinRels()
	 * @generated
	 */
	EAttribute getLeftOuterJoinRels_Type();

	/**
	 * Returns the meta object for class '{@link update.RightOuterJoinRels <em>Right Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Outer Join Rels</em>'.
	 * @see update.RightOuterJoinRels
	 * @generated
	 */
	EClass getRightOuterJoinRels();

	/**
	 * Returns the meta object for the attribute '{@link update.RightOuterJoinRels#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see update.RightOuterJoinRels#getType()
	 * @see #getRightOuterJoinRels()
	 * @generated
	 */
	EAttribute getRightOuterJoinRels_Type();

	/**
	 * Returns the meta object for class '{@link update.FullOuterJoinRels <em>Full Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full Outer Join Rels</em>'.
	 * @see update.FullOuterJoinRels
	 * @generated
	 */
	EClass getFullOuterJoinRels();

	/**
	 * Returns the meta object for the attribute '{@link update.FullOuterJoinRels#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see update.FullOuterJoinRels#getType()
	 * @see #getFullOuterJoinRels()
	 * @generated
	 */
	EAttribute getFullOuterJoinRels_Type();

	/**
	 * Returns the meta object for class '{@link update.SortInstalment <em>Sort Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Instalment</em>'.
	 * @see update.SortInstalment
	 * @generated
	 */
	EClass getSortInstalment();

	/**
	 * Returns the meta object for the attribute '{@link update.SortInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.SortInstalment#getName()
	 * @see #getSortInstalment()
	 * @generated
	 */
	EAttribute getSortInstalment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link update.SortInstalment#getPointers <em>Pointers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointers</em>'.
	 * @see update.SortInstalment#getPointers()
	 * @see #getSortInstalment()
	 * @generated
	 */
	EReference getSortInstalment_Pointers();

	/**
	 * Returns the meta object for class '{@link update.FieldSPointer <em>Field SPointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field SPointer</em>'.
	 * @see update.FieldSPointer
	 * @generated
	 */
	EClass getFieldSPointer();

	/**
	 * Returns the meta object for the attribute '{@link update.FieldSPointer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.FieldSPointer#getName()
	 * @see #getFieldSPointer()
	 * @generated
	 */
	EAttribute getFieldSPointer_Name();

	/**
	 * Returns the meta object for the attribute '{@link update.FieldSPointer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see update.FieldSPointer#getType()
	 * @see #getFieldSPointer()
	 * @generated
	 */
	EAttribute getFieldSPointer_Type();

	/**
	 * Returns the meta object for the reference '{@link update.FieldSPointer#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see update.FieldSPointer#getField()
	 * @see #getFieldSPointer()
	 * @generated
	 */
	EReference getFieldSPointer_Field();

	/**
	 * Returns the meta object for class '{@link update.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see update.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for class '{@link update.MyTable <em>My Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Table</em>'.
	 * @see update.MyTable
	 * @generated
	 */
	EClass getMyTable();

	/**
	 * Returns the meta object for the attribute '{@link update.MyTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.MyTable#getName()
	 * @see #getMyTable()
	 * @generated
	 */
	EAttribute getMyTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link update.MyTable#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see update.MyTable#getAlias()
	 * @see #getMyTable()
	 * @generated
	 */
	EAttribute getMyTable_Alias();

	/**
	 * Returns the meta object for the containment reference list '{@link update.MyTable#getFakes <em>Fakes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fakes</em>'.
	 * @see update.MyTable#getFakes()
	 * @see #getMyTable()
	 * @generated
	 */
	EReference getMyTable_Fakes();

	/**
	 * Returns the meta object for class '{@link update.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see update.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link update.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see update.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Type();

	/**
	 * Returns the meta object for the reference '{@link update.Node#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subtype</em>'.
	 * @see update.Node#getSubtype()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link update.Node#isListable <em>Listable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listable</em>'.
	 * @see update.Node#isListable()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Listable();

	/**
	 * Returns the meta object for the attribute '{@link update.Node#getColumn_name <em>Column name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column name</em>'.
	 * @see update.Node#getColumn_name()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Column_name();

	/**
	 * Returns the meta object for class '{@link update.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see update.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link update.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link update.Field#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see update.Field#getTableName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_TableName();

	/**
	 * Returns the meta object for the reference '{@link update.Field#getTable_ref <em>Table ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table ref</em>'.
	 * @see update.Field#getTable_ref()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Table_ref();

	/**
	 * Returns the meta object for the attribute '{@link update.Field#isDistict <em>Distict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distict</em>'.
	 * @see update.Field#isDistict()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Distict();

	/**
	 * Returns the meta object for class '{@link update.RealField <em>Real Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Field</em>'.
	 * @see update.RealField
	 * @generated
	 */
	EClass getRealField();

	/**
	 * Returns the meta object for the attribute '{@link update.RealField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.RealField#getName()
	 * @see #getRealField()
	 * @generated
	 */
	EAttribute getRealField_Name();

	/**
	 * Returns the meta object for the container reference '{@link update.RealField#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see update.RealField#getTable()
	 * @see #getRealField()
	 * @generated
	 */
	EReference getRealField_Table();

	/**
	 * Returns the meta object for the reference '{@link update.RealField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see update.RealField#getType()
	 * @see #getRealField()
	 * @generated
	 */
	EReference getRealField_Type();

	/**
	 * Returns the meta object for the reference '{@link update.RealField#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subtype</em>'.
	 * @see update.RealField#getSubtype()
	 * @see #getRealField()
	 * @generated
	 */
	EReference getRealField_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link update.RealField#isListable <em>Listable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listable</em>'.
	 * @see update.RealField#isListable()
	 * @see #getRealField()
	 * @generated
	 */
	EAttribute getRealField_Listable();

	/**
	 * Returns the meta object for the reference '{@link update.RealField#getLinkf <em>Linkf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linkf</em>'.
	 * @see update.RealField#getLinkf()
	 * @see #getRealField()
	 * @generated
	 */
	EReference getRealField_Linkf();

	/**
	 * Returns the meta object for the attribute '{@link update.RealField#isDistict <em>Distict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distict</em>'.
	 * @see update.RealField#isDistict()
	 * @see #getRealField()
	 * @generated
	 */
	EAttribute getRealField_Distict();

	/**
	 * Returns the meta object for class '{@link update.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see update.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link update.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see update.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link update.Literal#getLtype <em>Ltype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ltype</em>'.
	 * @see update.Literal#getLtype()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Ltype();

	/**
	 * Returns the meta object for class '{@link update.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see update.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for the attribute '{@link update.NullLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see update.NullLiteral#getValue()
	 * @see #getNullLiteral()
	 * @generated
	 */
	EAttribute getNullLiteral_Value();

	/**
	 * Returns the meta object for class '{@link update.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see update.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link update.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the reference '{@link update.Function#getFuncDef <em>Func Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Func Def</em>'.
	 * @see update.Function#getFuncDef()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_FuncDef();

	/**
	 * Returns the meta object for the containment reference list '{@link update.Function#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see update.Function#getParams()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Params();

	/**
	 * Returns the meta object for class '{@link update.FunctionDef <em>Function Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Def</em>'.
	 * @see update.FunctionDef
	 * @generated
	 */
	EClass getFunctionDef();

	/**
	 * Returns the meta object for the attribute '{@link update.FunctionDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.FunctionDef#getName()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EAttribute getFunctionDef_Name();

	/**
	 * Returns the meta object for the reference '{@link update.FunctionDef#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Returntype</em>'.
	 * @see update.FunctionDef#getReturntype()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_Returntype();

	/**
	 * Returns the meta object for the reference '{@link update.FunctionDef#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Args</em>'.
	 * @see update.FunctionDef#getArgs()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_Args();

	/**
	 * Returns the meta object for class '{@link update.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see update.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link update.Input#getInputRef <em>Input Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Ref</em>'.
	 * @see update.Input#getInputRef()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_InputRef();

	/**
	 * Returns the meta object for class '{@link update.InputDef <em>Input Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Def</em>'.
	 * @see update.InputDef
	 * @generated
	 */
	EClass getInputDef();

	/**
	 * Returns the meta object for the attribute '{@link update.InputDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.InputDef#getName()
	 * @see #getInputDef()
	 * @generated
	 */
	EAttribute getInputDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link update.InputDef#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see update.InputDef#getIndex()
	 * @see #getInputDef()
	 * @generated
	 */
	EAttribute getInputDef_Index();

	/**
	 * Returns the meta object for the attribute '{@link update.InputDef#isListable <em>Listable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listable</em>'.
	 * @see update.InputDef#isListable()
	 * @see #getInputDef()
	 * @generated
	 */
	EAttribute getInputDef_Listable();

	/**
	 * Returns the meta object for class '{@link update.InputStringDef <em>Input String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input String Def</em>'.
	 * @see update.InputStringDef
	 * @generated
	 */
	EClass getInputStringDef();

	/**
	 * Returns the meta object for class '{@link update.InputIntDef <em>Input Int Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Int Def</em>'.
	 * @see update.InputIntDef
	 * @generated
	 */
	EClass getInputIntDef();

	/**
	 * Returns the meta object for class '{@link update.InputDateDef <em>Input Date Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Date Def</em>'.
	 * @see update.InputDateDef
	 * @generated
	 */
	EClass getInputDateDef();

	/**
	 * Returns the meta object for class '{@link update.InputBitsDef <em>Input Bits Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Bits Def</em>'.
	 * @see update.InputBitsDef
	 * @generated
	 */
	EClass getInputBitsDef();

	/**
	 * Returns the meta object for class '{@link update.InputFloatDef <em>Input Float Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Float Def</em>'.
	 * @see update.InputFloatDef
	 * @generated
	 */
	EClass getInputFloatDef();

	/**
	 * Returns the meta object for class '{@link update.CallSurfaceQuery <em>Call Surface Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Surface Query</em>'.
	 * @see update.CallSurfaceQuery
	 * @generated
	 */
	EClass getCallSurfaceQuery();

	/**
	 * Returns the meta object for the attribute '{@link update.CallSurfaceQuery#getSurfaceName <em>Surface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface Name</em>'.
	 * @see update.CallSurfaceQuery#getSurfaceName()
	 * @see #getCallSurfaceQuery()
	 * @generated
	 */
	EAttribute getCallSurfaceQuery_SurfaceName();

	/**
	 * Returns the meta object for class '{@link update.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see update.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link update.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the reference list '{@link update.Type#getSubtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtypes</em>'.
	 * @see update.Type#getSubtypes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Subtypes();

	/**
	 * Returns the meta object for class '{@link update.Subtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtype</em>'.
	 * @see update.Subtype
	 * @generated
	 */
	EClass getSubtype();

	/**
	 * Returns the meta object for the attribute '{@link update.Subtype#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see update.Subtype#getName()
	 * @see #getSubtype()
	 * @generated
	 */
	EAttribute getSubtype_Name();

	/**
	 * Returns the meta object for class '{@link update.AbstractConditionElement <em>Abstract Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Condition Element</em>'.
	 * @see update.AbstractConditionElement
	 * @generated
	 */
	EClass getAbstractConditionElement();

	/**
	 * Returns the meta object for class '{@link update.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see update.Junction
	 * @generated
	 */
	EClass getJunction();

	/**
	 * Returns the meta object for the attribute '{@link update.Junction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see update.Junction#getType()
	 * @see #getJunction()
	 * @generated
	 */
	EAttribute getJunction_Type();

	/**
	 * Returns the meta object for the reference list '{@link update.Junction#getRels <em>Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rels</em>'.
	 * @see update.Junction#getRels()
	 * @see #getJunction()
	 * @generated
	 */
	EReference getJunction_Rels();

	/**
	 * Returns the meta object for class '{@link update.RootJunction <em>Root Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Junction</em>'.
	 * @see update.RootJunction
	 * @generated
	 */
	EClass getRootJunction();

	/**
	 * Returns the meta object for class '{@link update.JuncRelationship <em>Junc Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junc Relationship</em>'.
	 * @see update.JuncRelationship
	 * @generated
	 */
	EClass getJuncRelationship();

	/**
	 * Returns the meta object for the reference '{@link update.JuncRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see update.JuncRelationship#getSource()
	 * @see #getJuncRelationship()
	 * @generated
	 */
	EReference getJuncRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link update.JuncRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see update.JuncRelationship#getTarget()
	 * @see #getJuncRelationship()
	 * @generated
	 */
	EReference getJuncRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link update.JuncRelationship#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see update.JuncRelationship#getIndex()
	 * @see #getJuncRelationship()
	 * @generated
	 */
	EAttribute getJuncRelationship_Index();

	/**
	 * Returns the meta object for the attribute '{@link update.JuncRelationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see update.JuncRelationship#getType()
	 * @see #getJuncRelationship()
	 * @generated
	 */
	EAttribute getJuncRelationship_Type();

	/**
	 * Returns the meta object for class '{@link update.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see update.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link update.Term#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see update.Term#getParams()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Params();

	/**
	 * Returns the meta object for the attribute '{@link update.Term#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see update.Term#getTitle()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Title();

	/**
	 * Returns the meta object for the containment reference '{@link update.Term#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see update.Term#getLink()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Link();

	/**
	 * Returns the meta object for class '{@link update.ConditionLink <em>Condition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Link</em>'.
	 * @see update.ConditionLink
	 * @generated
	 */
	EClass getConditionLink();

	/**
	 * Returns the meta object for the reference '{@link update.ConditionLink#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see update.ConditionLink#getSrc()
	 * @see #getConditionLink()
	 * @generated
	 */
	EReference getConditionLink_Src();

	/**
	 * Returns the meta object for the reference '{@link update.ConditionLink#getDst <em>Dst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dst</em>'.
	 * @see update.ConditionLink#getDst()
	 * @see #getConditionLink()
	 * @generated
	 */
	EReference getConditionLink_Dst();

	/**
	 * Returns the meta object for the attribute '{@link update.ConditionLink#isNegative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative</em>'.
	 * @see update.ConditionLink#isNegative()
	 * @see #getConditionLink()
	 * @generated
	 */
	EAttribute getConditionLink_Negative();

	/**
	 * Returns the meta object for class '{@link update.EqualLink <em>Equal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal Link</em>'.
	 * @see update.EqualLink
	 * @generated
	 */
	EClass getEqualLink();

	/**
	 * Returns the meta object for the attribute '{@link update.EqualLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see update.EqualLink#getDesc()
	 * @see #getEqualLink()
	 * @generated
	 */
	EAttribute getEqualLink_Desc();

	/**
	 * Returns the meta object for class '{@link update.GreaterThanLink <em>Greater Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Link</em>'.
	 * @see update.GreaterThanLink
	 * @generated
	 */
	EClass getGreaterThanLink();

	/**
	 * Returns the meta object for the attribute '{@link update.GreaterThanLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see update.GreaterThanLink#getDesc()
	 * @see #getGreaterThanLink()
	 * @generated
	 */
	EAttribute getGreaterThanLink_Desc();

	/**
	 * Returns the meta object for class '{@link update.GreaterEqualThanLink <em>Greater Equal Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Equal Than Link</em>'.
	 * @see update.GreaterEqualThanLink
	 * @generated
	 */
	EClass getGreaterEqualThanLink();

	/**
	 * Returns the meta object for the attribute '{@link update.GreaterEqualThanLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see update.GreaterEqualThanLink#getDesc()
	 * @see #getGreaterEqualThanLink()
	 * @generated
	 */
	EAttribute getGreaterEqualThanLink_Desc();

	/**
	 * Returns the meta object for class '{@link update.LowerThanLink <em>Lower Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Than Link</em>'.
	 * @see update.LowerThanLink
	 * @generated
	 */
	EClass getLowerThanLink();

	/**
	 * Returns the meta object for the attribute '{@link update.LowerThanLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see update.LowerThanLink#getDesc()
	 * @see #getLowerThanLink()
	 * @generated
	 */
	EAttribute getLowerThanLink_Desc();

	/**
	 * Returns the meta object for class '{@link update.LowerEqualThanLink <em>Lower Equal Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Equal Than Link</em>'.
	 * @see update.LowerEqualThanLink
	 * @generated
	 */
	EClass getLowerEqualThanLink();

	/**
	 * Returns the meta object for the attribute '{@link update.LowerEqualThanLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see update.LowerEqualThanLink#getDesc()
	 * @see #getLowerEqualThanLink()
	 * @generated
	 */
	EAttribute getLowerEqualThanLink_Desc();

	/**
	 * Returns the meta object for class '{@link update.InLink <em>In Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Link</em>'.
	 * @see update.InLink
	 * @generated
	 */
	EClass getInLink();

	/**
	 * Returns the meta object for the attribute '{@link update.InLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see update.InLink#getDesc()
	 * @see #getInLink()
	 * @generated
	 */
	EAttribute getInLink_Desc();

	/**
	 * Returns the meta object for class '{@link update.LikeLink <em>Like Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Like Link</em>'.
	 * @see update.LikeLink
	 * @generated
	 */
	EClass getLikeLink();

	/**
	 * Returns the meta object for the attribute '{@link update.LikeLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see update.LikeLink#getDesc()
	 * @see #getLikeLink()
	 * @generated
	 */
	EAttribute getLikeLink_Desc();

	/**
	 * Returns the meta object for enum '{@link update.RelationSelectOperationType <em>Relation Select Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Select Operation Type</em>'.
	 * @see update.RelationSelectOperationType
	 * @generated
	 */
	EEnum getRelationSelectOperationType();

	/**
	 * Returns the meta object for enum '{@link update.RelationSelectType <em>Relation Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Select Type</em>'.
	 * @see update.RelationSelectType
	 * @generated
	 */
	EEnum getRelationSelectType();

	/**
	 * Returns the meta object for enum '{@link update.LiteralType <em>Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Literal Type</em>'.
	 * @see update.LiteralType
	 * @generated
	 */
	EEnum getLiteralType();

	/**
	 * Returns the meta object for enum '{@link update.SortType <em>Sort Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Type</em>'.
	 * @see update.SortType
	 * @generated
	 */
	EEnum getSortType();

	/**
	 * Returns the meta object for enum '{@link update.JuncType <em>Junc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Junc Type</em>'.
	 * @see update.JuncType
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
	UpdateFactory getUpdateFactory();

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
		 * The meta object literal for the '{@link update.impl.UpdateSurfaceImpl <em>Surface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.UpdateSurfaceImpl
		 * @see update.impl.UpdatePackageImpl#getUpdateSurface()
		 * @generated
		 */
		EClass UPDATE_SURFACE = eINSTANCE.getUpdateSurface();

		/**
		 * The meta object literal for the '<em><b>Input Instalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_SURFACE__INPUT_INSTALMENT = eINSTANCE.getUpdateSurface_InputInstalment();

		/**
		 * The meta object literal for the '<em><b>Prepare List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_SURFACE__PREPARE_LIST = eINSTANCE.getUpdateSurface_PrepareList();

		/**
		 * The meta object literal for the '<em><b>Table Instalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_SURFACE__TABLE_INSTALMENT = eINSTANCE.getUpdateSurface_TableInstalment();

		/**
		 * The meta object literal for the '<em><b>Sort Instalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_SURFACE__SORT_INSTALMENT = eINSTANCE.getUpdateSurface_SortInstalment();

		/**
		 * The meta object literal for the '<em><b>Where Instalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_SURFACE__WHERE_INSTALMENT = eINSTANCE.getUpdateSurface_WhereInstalment();

		/**
		 * The meta object literal for the '<em><b>Lfs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_SURFACE__LFS = eINSTANCE.getUpdateSurface_Lfs();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_SURFACE__TYPES = eINSTANCE.getUpdateSurface_Types();

		/**
		 * The meta object literal for the '<em><b>Funcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_SURFACE__FUNCS = eINSTANCE.getUpdateSurface_Funcs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_SURFACE__NAME = eINSTANCE.getUpdateSurface_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_SURFACE__DESCRIPTION = eINSTANCE.getUpdateSurface_Description();

		/**
		 * The meta object literal for the '<em><b>Associated Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_SURFACE__ASSOCIATED_CLASS = eINSTANCE.getUpdateSurface_AssociatedClass();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_SURFACE__USER_NAME = eINSTANCE.getUpdateSurface_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_SURFACE__PASSWORD = eINSTANCE.getUpdateSurface_Password();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_SURFACE__URI = eINSTANCE.getUpdateSurface_Uri();

		/**
		 * The meta object literal for the '{@link update.impl.LinkFieldImpl <em>Link Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.LinkFieldImpl
		 * @see update.impl.UpdatePackageImpl#getLinkField()
		 * @generated
		 */
		EClass LINK_FIELD = eINSTANCE.getLinkField();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_FIELD__SRC = eINSTANCE.getLinkField_Src();

		/**
		 * The meta object literal for the '<em><b>Dst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_FIELD__DST = eINSTANCE.getLinkField_Dst();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_FIELD__NAME = eINSTANCE.getLinkField_Name();

		/**
		 * The meta object literal for the '{@link update.impl.InputInstalmentImpl <em>Input Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.InputInstalmentImpl
		 * @see update.impl.UpdatePackageImpl#getInputInstalment()
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
		 * The meta object literal for the '{@link update.impl.PrepareListImpl <em>Prepare List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.PrepareListImpl
		 * @see update.impl.UpdatePackageImpl#getPrepareList()
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
		 * The meta object literal for the '{@link update.impl.ConditionInstalmentImpl <em>Condition Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.ConditionInstalmentImpl
		 * @see update.impl.UpdatePackageImpl#getConditionInstalment()
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
		 * The meta object literal for the '{@link update.impl.TableSelectionImpl <em>Table Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.TableSelectionImpl
		 * @see update.impl.UpdatePackageImpl#getTableSelection()
		 * @generated
		 */
		EClass TABLE_SELECTION = eINSTANCE.getTableSelection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_SELECTION__NAME = eINSTANCE.getTableSelection_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_SELECTION__TABLES = eINSTANCE.getTableSelection_Tables();

		/**
		 * The meta object literal for the '<em><b>Rels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_SELECTION__RELS = eINSTANCE.getTableSelection_Rels();

		/**
		 * The meta object literal for the '{@link update.impl.RelationSelectImpl <em>Relation Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.RelationSelectImpl
		 * @see update.impl.UpdatePackageImpl#getRelationSelect()
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
		 * The meta object literal for the '{@link update.impl.InnerjoinRelsImpl <em>Innerjoin Rels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.InnerjoinRelsImpl
		 * @see update.impl.UpdatePackageImpl#getInnerjoinRels()
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
		 * The meta object literal for the '{@link update.impl.LeftOuterJoinRelsImpl <em>Left Outer Join Rels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.LeftOuterJoinRelsImpl
		 * @see update.impl.UpdatePackageImpl#getLeftOuterJoinRels()
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
		 * The meta object literal for the '{@link update.impl.RightOuterJoinRelsImpl <em>Right Outer Join Rels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.RightOuterJoinRelsImpl
		 * @see update.impl.UpdatePackageImpl#getRightOuterJoinRels()
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
		 * The meta object literal for the '{@link update.impl.FullOuterJoinRelsImpl <em>Full Outer Join Rels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.FullOuterJoinRelsImpl
		 * @see update.impl.UpdatePackageImpl#getFullOuterJoinRels()
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
		 * The meta object literal for the '{@link update.impl.SortInstalmentImpl <em>Sort Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.SortInstalmentImpl
		 * @see update.impl.UpdatePackageImpl#getSortInstalment()
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
		 * The meta object literal for the '{@link update.impl.FieldSPointerImpl <em>Field SPointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.FieldSPointerImpl
		 * @see update.impl.UpdatePackageImpl#getFieldSPointer()
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
		 * The meta object literal for the '{@link update.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.AbstractNodeImpl
		 * @see update.impl.UpdatePackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '{@link update.impl.MyTableImpl <em>My Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.MyTableImpl
		 * @see update.impl.UpdatePackageImpl#getMyTable()
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
		 * The meta object literal for the '<em><b>Fakes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_TABLE__FAKES = eINSTANCE.getMyTable_Fakes();

		/**
		 * The meta object literal for the '{@link update.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.NodeImpl
		 * @see update.impl.UpdatePackageImpl#getNode()
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
		 * The meta object literal for the '{@link update.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.FieldImpl
		 * @see update.impl.UpdatePackageImpl#getField()
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
		 * The meta object literal for the '{@link update.impl.RealFieldImpl <em>Real Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.RealFieldImpl
		 * @see update.impl.UpdatePackageImpl#getRealField()
		 * @generated
		 */
		EClass REAL_FIELD = eINSTANCE.getRealField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_FIELD__NAME = eINSTANCE.getRealField_Name();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_FIELD__TABLE = eINSTANCE.getRealField_Table();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_FIELD__TYPE = eINSTANCE.getRealField_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_FIELD__SUBTYPE = eINSTANCE.getRealField_Subtype();

		/**
		 * The meta object literal for the '<em><b>Listable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_FIELD__LISTABLE = eINSTANCE.getRealField_Listable();

		/**
		 * The meta object literal for the '<em><b>Linkf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_FIELD__LINKF = eINSTANCE.getRealField_Linkf();

		/**
		 * The meta object literal for the '<em><b>Distict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_FIELD__DISTICT = eINSTANCE.getRealField_Distict();

		/**
		 * The meta object literal for the '{@link update.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.LiteralImpl
		 * @see update.impl.UpdatePackageImpl#getLiteral()
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
		 * The meta object literal for the '{@link update.impl.NullLiteralImpl <em>Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.NullLiteralImpl
		 * @see update.impl.UpdatePackageImpl#getNullLiteral()
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
		 * The meta object literal for the '{@link update.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.FunctionImpl
		 * @see update.impl.UpdatePackageImpl#getFunction()
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
		 * The meta object literal for the '{@link update.impl.FunctionDefImpl <em>Function Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.FunctionDefImpl
		 * @see update.impl.UpdatePackageImpl#getFunctionDef()
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
		 * The meta object literal for the '{@link update.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.InputImpl
		 * @see update.impl.UpdatePackageImpl#getInput()
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
		 * The meta object literal for the '{@link update.impl.InputDefImpl <em>Input Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.InputDefImpl
		 * @see update.impl.UpdatePackageImpl#getInputDef()
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
		 * The meta object literal for the '{@link update.impl.InputStringDefImpl <em>Input String Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.InputStringDefImpl
		 * @see update.impl.UpdatePackageImpl#getInputStringDef()
		 * @generated
		 */
		EClass INPUT_STRING_DEF = eINSTANCE.getInputStringDef();

		/**
		 * The meta object literal for the '{@link update.impl.InputIntDefImpl <em>Input Int Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.InputIntDefImpl
		 * @see update.impl.UpdatePackageImpl#getInputIntDef()
		 * @generated
		 */
		EClass INPUT_INT_DEF = eINSTANCE.getInputIntDef();

		/**
		 * The meta object literal for the '{@link update.impl.InputDateDefImpl <em>Input Date Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.InputDateDefImpl
		 * @see update.impl.UpdatePackageImpl#getInputDateDef()
		 * @generated
		 */
		EClass INPUT_DATE_DEF = eINSTANCE.getInputDateDef();

		/**
		 * The meta object literal for the '{@link update.impl.InputBitsDefImpl <em>Input Bits Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.InputBitsDefImpl
		 * @see update.impl.UpdatePackageImpl#getInputBitsDef()
		 * @generated
		 */
		EClass INPUT_BITS_DEF = eINSTANCE.getInputBitsDef();

		/**
		 * The meta object literal for the '{@link update.impl.InputFloatDefImpl <em>Input Float Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.InputFloatDefImpl
		 * @see update.impl.UpdatePackageImpl#getInputFloatDef()
		 * @generated
		 */
		EClass INPUT_FLOAT_DEF = eINSTANCE.getInputFloatDef();

		/**
		 * The meta object literal for the '{@link update.impl.CallSurfaceQueryImpl <em>Call Surface Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.CallSurfaceQueryImpl
		 * @see update.impl.UpdatePackageImpl#getCallSurfaceQuery()
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
		 * The meta object literal for the '{@link update.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.TypeImpl
		 * @see update.impl.UpdatePackageImpl#getType()
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
		 * The meta object literal for the '{@link update.impl.SubtypeImpl <em>Subtype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.SubtypeImpl
		 * @see update.impl.UpdatePackageImpl#getSubtype()
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
		 * The meta object literal for the '{@link update.impl.AbstractConditionElementImpl <em>Abstract Condition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.AbstractConditionElementImpl
		 * @see update.impl.UpdatePackageImpl#getAbstractConditionElement()
		 * @generated
		 */
		EClass ABSTRACT_CONDITION_ELEMENT = eINSTANCE.getAbstractConditionElement();

		/**
		 * The meta object literal for the '{@link update.impl.JunctionImpl <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.JunctionImpl
		 * @see update.impl.UpdatePackageImpl#getJunction()
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
		 * The meta object literal for the '{@link update.impl.RootJunctionImpl <em>Root Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.RootJunctionImpl
		 * @see update.impl.UpdatePackageImpl#getRootJunction()
		 * @generated
		 */
		EClass ROOT_JUNCTION = eINSTANCE.getRootJunction();

		/**
		 * The meta object literal for the '{@link update.impl.JuncRelationshipImpl <em>Junc Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.JuncRelationshipImpl
		 * @see update.impl.UpdatePackageImpl#getJuncRelationship()
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
		 * The meta object literal for the '{@link update.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.TermImpl
		 * @see update.impl.UpdatePackageImpl#getTerm()
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
		 * The meta object literal for the '{@link update.impl.ConditionLinkImpl <em>Condition Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.ConditionLinkImpl
		 * @see update.impl.UpdatePackageImpl#getConditionLink()
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
		 * The meta object literal for the '{@link update.impl.EqualLinkImpl <em>Equal Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.EqualLinkImpl
		 * @see update.impl.UpdatePackageImpl#getEqualLink()
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
		 * The meta object literal for the '{@link update.impl.GreaterThanLinkImpl <em>Greater Than Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.GreaterThanLinkImpl
		 * @see update.impl.UpdatePackageImpl#getGreaterThanLink()
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
		 * The meta object literal for the '{@link update.impl.GreaterEqualThanLinkImpl <em>Greater Equal Than Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.GreaterEqualThanLinkImpl
		 * @see update.impl.UpdatePackageImpl#getGreaterEqualThanLink()
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
		 * The meta object literal for the '{@link update.impl.LowerThanLinkImpl <em>Lower Than Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.LowerThanLinkImpl
		 * @see update.impl.UpdatePackageImpl#getLowerThanLink()
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
		 * The meta object literal for the '{@link update.impl.LowerEqualThanLinkImpl <em>Lower Equal Than Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.LowerEqualThanLinkImpl
		 * @see update.impl.UpdatePackageImpl#getLowerEqualThanLink()
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
		 * The meta object literal for the '{@link update.impl.InLinkImpl <em>In Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.InLinkImpl
		 * @see update.impl.UpdatePackageImpl#getInLink()
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
		 * The meta object literal for the '{@link update.impl.LikeLinkImpl <em>Like Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.impl.LikeLinkImpl
		 * @see update.impl.UpdatePackageImpl#getLikeLink()
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
		 * The meta object literal for the '{@link update.RelationSelectOperationType <em>Relation Select Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.RelationSelectOperationType
		 * @see update.impl.UpdatePackageImpl#getRelationSelectOperationType()
		 * @generated
		 */
		EEnum RELATION_SELECT_OPERATION_TYPE = eINSTANCE.getRelationSelectOperationType();

		/**
		 * The meta object literal for the '{@link update.RelationSelectType <em>Relation Select Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.RelationSelectType
		 * @see update.impl.UpdatePackageImpl#getRelationSelectType()
		 * @generated
		 */
		EEnum RELATION_SELECT_TYPE = eINSTANCE.getRelationSelectType();

		/**
		 * The meta object literal for the '{@link update.LiteralType <em>Literal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.LiteralType
		 * @see update.impl.UpdatePackageImpl#getLiteralType()
		 * @generated
		 */
		EEnum LITERAL_TYPE = eINSTANCE.getLiteralType();

		/**
		 * The meta object literal for the '{@link update.SortType <em>Sort Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.SortType
		 * @see update.impl.UpdatePackageImpl#getSortType()
		 * @generated
		 */
		EEnum SORT_TYPE = eINSTANCE.getSortType();

		/**
		 * The meta object literal for the '{@link update.JuncType <em>Junc Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see update.JuncType
		 * @see update.impl.UpdatePackageImpl#getJuncType()
		 * @generated
		 */
		EEnum JUNC_TYPE = eINSTANCE.getJuncType();

	}

} //UpdatePackage
