/**
 */
package query;

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
 * @see query.QueryFactory
 * @model kind="package"
 * @generated
 */
public interface QueryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "query";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.query.this.is/v1.0/beta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "query";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryPackage eINSTANCE = query.impl.QueryPackageImpl.init();

	/**
	 * The meta object id for the '{@link query.impl.QuerySurfaceImpl <em>Surface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.QuerySurfaceImpl
	 * @see query.impl.QueryPackageImpl#getQuerySurface()
	 * @generated
	 */
	int QUERY_SURFACE = 0;

	/**
	 * The feature id for the '<em><b>Output Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__OUTPUT_INSTALMENT = 0;

	/**
	 * The feature id for the '<em><b>Input Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__INPUT_INSTALMENT = 1;

	/**
	 * The feature id for the '<em><b>Where Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__WHERE_INSTALMENT = 2;

	/**
	 * The feature id for the '<em><b>Having Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__HAVING_INSTALMENT = 3;

	/**
	 * The feature id for the '<em><b>Group Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__GROUP_INSTALMENT = 4;

	/**
	 * The feature id for the '<em><b>Sort Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__SORT_INSTALMENT = 5;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__TYPES = 6;

	/**
	 * The feature id for the '<em><b>Funcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__FUNCS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__NAME = 8;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__USER_NAME = 9;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__PASSWORD = 10;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__URI = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__DESCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>Number Of Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__NUMBER_OF_ROW = 13;

	/**
	 * The feature id for the '<em><b>Index Of Roes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__INDEX_OF_ROES = 14;

	/**
	 * The feature id for the '<em><b>Create Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__CREATE_CLASS = 15;

	/**
	 * The feature id for the '<em><b>Associated Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__ASSOCIATED_CLASS = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE__TYPE = 17;

	/**
	 * The number of structural features of the '<em>Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SURFACE_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link query.impl.OutputInstalmentImpl <em>Output Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.OutputInstalmentImpl
	 * @see query.impl.QueryPackageImpl#getOutputInstalment()
	 * @generated
	 */
	int OUTPUT_INSTALMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INSTALMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INSTALMENT__NODES = 1;

	/**
	 * The feature id for the '<em><b>Rels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INSTALMENT__RELS = 2;

	/**
	 * The number of structural features of the '<em>Output Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INSTALMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link query.impl.InputInstalmentImpl <em>Input Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.InputInstalmentImpl
	 * @see query.impl.QueryPackageImpl#getInputInstalment()
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
	 * The meta object id for the '{@link query.impl.SortInstalmentImpl <em>Sort Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.SortInstalmentImpl
	 * @see query.impl.QueryPackageImpl#getSortInstalment()
	 * @generated
	 */
	int SORT_INSTALMENT = 3;

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
	 * The meta object id for the '{@link query.impl.GroupInstalmentImpl <em>Group Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.GroupInstalmentImpl
	 * @see query.impl.QueryPackageImpl#getGroupInstalment()
	 * @generated
	 */
	int GROUP_INSTALMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_INSTALMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pointers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_INSTALMENT__POINTERS = 1;

	/**
	 * The number of structural features of the '<em>Group Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_INSTALMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link query.impl.ConditionInstalmentImpl <em>Condition Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.ConditionInstalmentImpl
	 * @see query.impl.QueryPackageImpl#getConditionInstalment()
	 * @generated
	 */
	int CONDITION_INSTALMENT = 5;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INSTALMENT__PARTS = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INSTALMENT__LINKS = 1;

	/**
	 * The number of structural features of the '<em>Condition Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INSTALMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link query.impl.WhereInstalmentImpl <em>Where Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.WhereInstalmentImpl
	 * @see query.impl.QueryPackageImpl#getWhereInstalment()
	 * @generated
	 */
	int WHERE_INSTALMENT = 6;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_INSTALMENT__PARTS = CONDITION_INSTALMENT__PARTS;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_INSTALMENT__LINKS = CONDITION_INSTALMENT__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_INSTALMENT__NAME = CONDITION_INSTALMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Where Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_INSTALMENT_FEATURE_COUNT = CONDITION_INSTALMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link query.impl.HavingInstalmentImpl <em>Having Instalment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.HavingInstalmentImpl
	 * @see query.impl.QueryPackageImpl#getHavingInstalment()
	 * @generated
	 */
	int HAVING_INSTALMENT = 7;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVING_INSTALMENT__PARTS = CONDITION_INSTALMENT__PARTS;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVING_INSTALMENT__LINKS = CONDITION_INSTALMENT__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVING_INSTALMENT__NAME = CONDITION_INSTALMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Having Instalment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVING_INSTALMENT_FEATURE_COUNT = CONDITION_INSTALMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link query.impl.RelationSelectImpl <em>Relation Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.RelationSelectImpl
	 * @see query.impl.QueryPackageImpl#getRelationSelect()
	 * @generated
	 */
	int RELATION_SELECT = 8;

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
	 * The meta object id for the '{@link query.impl.InnerjoinRelsImpl <em>Innerjoin Rels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.InnerjoinRelsImpl
	 * @see query.impl.QueryPackageImpl#getInnerjoinRels()
	 * @generated
	 */
	int INNERJOIN_RELS = 9;

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
	 * The meta object id for the '{@link query.impl.LeftOuterJoinRelsImpl <em>Left Outer Join Rels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.LeftOuterJoinRelsImpl
	 * @see query.impl.QueryPackageImpl#getLeftOuterJoinRels()
	 * @generated
	 */
	int LEFT_OUTER_JOIN_RELS = 10;

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
	 * The meta object id for the '{@link query.impl.RightOuterJoinRelsImpl <em>Right Outer Join Rels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.RightOuterJoinRelsImpl
	 * @see query.impl.QueryPackageImpl#getRightOuterJoinRels()
	 * @generated
	 */
	int RIGHT_OUTER_JOIN_RELS = 11;

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
	 * The meta object id for the '{@link query.impl.FullOuterJoinRelsImpl <em>Full Outer Join Rels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.FullOuterJoinRelsImpl
	 * @see query.impl.QueryPackageImpl#getFullOuterJoinRels()
	 * @generated
	 */
	int FULL_OUTER_JOIN_RELS = 12;

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
	 * The meta object id for the '{@link query.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.AbstractNodeImpl
	 * @see query.impl.QueryPackageImpl#getAbstractNode()
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
	 * The meta object id for the '{@link query.impl.FieldGPointerImpl <em>Field GPointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.FieldGPointerImpl
	 * @see query.impl.QueryPackageImpl#getFieldGPointer()
	 * @generated
	 */
	int FIELD_GPOINTER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GPOINTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GPOINTER__FIELD = 1;

	/**
	 * The number of structural features of the '<em>Field GPointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GPOINTER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link query.impl.FieldSPointerImpl <em>Field SPointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.FieldSPointerImpl
	 * @see query.impl.QueryPackageImpl#getFieldSPointer()
	 * @generated
	 */
	int FIELD_SPOINTER = 15;

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
	 * The meta object id for the '{@link query.impl.MyTableImpl <em>My Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.MyTableImpl
	 * @see query.impl.QueryPackageImpl#getMyTable()
	 * @generated
	 */
	int MY_TABLE = 16;

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
	 * The meta object id for the '{@link query.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.NodeImpl
	 * @see query.impl.QueryPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 17;

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
	 * The meta object id for the '{@link query.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.FieldImpl
	 * @see query.impl.QueryPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 18;

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
	 * The meta object id for the '{@link query.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.LiteralImpl
	 * @see query.impl.QueryPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 19;

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
	 * The meta object id for the '{@link query.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.NullLiteralImpl
	 * @see query.impl.QueryPackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 20;

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
	 * The meta object id for the '{@link query.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.FunctionImpl
	 * @see query.impl.QueryPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 21;

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
	 * The meta object id for the '{@link query.impl.FunctionDefImpl <em>Function Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.FunctionDefImpl
	 * @see query.impl.QueryPackageImpl#getFunctionDef()
	 * @generated
	 */
	int FUNCTION_DEF = 22;

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
	 * The meta object id for the '{@link query.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.InputImpl
	 * @see query.impl.QueryPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 23;

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
	 * The meta object id for the '{@link query.impl.InputDefImpl <em>Input Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.InputDefImpl
	 * @see query.impl.QueryPackageImpl#getInputDef()
	 * @generated
	 */
	int INPUT_DEF = 24;

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
	 * The meta object id for the '{@link query.impl.InputStringDefImpl <em>Input String Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.InputStringDefImpl
	 * @see query.impl.QueryPackageImpl#getInputStringDef()
	 * @generated
	 */
	int INPUT_STRING_DEF = 25;

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
	 * The meta object id for the '{@link query.impl.InputIntDefImpl <em>Input Int Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.InputIntDefImpl
	 * @see query.impl.QueryPackageImpl#getInputIntDef()
	 * @generated
	 */
	int INPUT_INT_DEF = 26;

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
	 * The meta object id for the '{@link query.impl.InputDateDefImpl <em>Input Date Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.InputDateDefImpl
	 * @see query.impl.QueryPackageImpl#getInputDateDef()
	 * @generated
	 */
	int INPUT_DATE_DEF = 27;

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
	 * The meta object id for the '{@link query.impl.InputBitsDefImpl <em>Input Bits Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.InputBitsDefImpl
	 * @see query.impl.QueryPackageImpl#getInputBitsDef()
	 * @generated
	 */
	int INPUT_BITS_DEF = 28;

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
	 * The meta object id for the '{@link query.impl.InputFloatDefImpl <em>Input Float Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.InputFloatDefImpl
	 * @see query.impl.QueryPackageImpl#getInputFloatDef()
	 * @generated
	 */
	int INPUT_FLOAT_DEF = 29;

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
	 * The meta object id for the '{@link query.impl.CallQuerySurfaceImpl <em>Call Query Surface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.CallQuerySurfaceImpl
	 * @see query.impl.QueryPackageImpl#getCallQuerySurface()
	 * @generated
	 */
	int CALL_QUERY_SURFACE = 30;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__TYPE = FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__SUBTYPE = FUNCTION__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__COLUMN_NAME = FUNCTION__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__LISTABLE = FUNCTION__LISTABLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Func Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__FUNC_DEF = FUNCTION__FUNC_DEF;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__PARAMS = FUNCTION__PARAMS;

	/**
	 * The feature id for the '<em><b>Surface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE__SURFACE_NAME = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Query Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_SURFACE_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link query.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.TypeImpl
	 * @see query.impl.QueryPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 31;

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
	 * The meta object id for the '{@link query.impl.SubtypeImpl <em>Subtype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.SubtypeImpl
	 * @see query.impl.QueryPackageImpl#getSubtype()
	 * @generated
	 */
	int SUBTYPE = 32;

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
	 * The meta object id for the '{@link query.impl.AbstractConditionElementImpl <em>Abstract Condition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.AbstractConditionElementImpl
	 * @see query.impl.QueryPackageImpl#getAbstractConditionElement()
	 * @generated
	 */
	int ABSTRACT_CONDITION_ELEMENT = 33;

	/**
	 * The number of structural features of the '<em>Abstract Condition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link query.impl.JunctionImpl <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.JunctionImpl
	 * @see query.impl.QueryPackageImpl#getJunction()
	 * @generated
	 */
	int JUNCTION = 34;

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
	 * The meta object id for the '{@link query.impl.RootJunctionImpl <em>Root Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.RootJunctionImpl
	 * @see query.impl.QueryPackageImpl#getRootJunction()
	 * @generated
	 */
	int ROOT_JUNCTION = 35;

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
	 * The meta object id for the '{@link query.impl.JuncRelationshipImpl <em>Junc Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.JuncRelationshipImpl
	 * @see query.impl.QueryPackageImpl#getJuncRelationship()
	 * @generated
	 */
	int JUNC_RELATIONSHIP = 36;

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
	 * The meta object id for the '{@link query.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.TermImpl
	 * @see query.impl.QueryPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 37;

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
	 * The meta object id for the '{@link query.impl.ConditionLinkImpl <em>Condition Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.ConditionLinkImpl
	 * @see query.impl.QueryPackageImpl#getConditionLink()
	 * @generated
	 */
	int CONDITION_LINK = 38;

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
	 * The meta object id for the '{@link query.impl.EqualLinkImpl <em>Equal Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.EqualLinkImpl
	 * @see query.impl.QueryPackageImpl#getEqualLink()
	 * @generated
	 */
	int EQUAL_LINK = 39;

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
	 * The meta object id for the '{@link query.impl.GreaterThanLinkImpl <em>Greater Than Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.GreaterThanLinkImpl
	 * @see query.impl.QueryPackageImpl#getGreaterThanLink()
	 * @generated
	 */
	int GREATER_THAN_LINK = 40;

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
	 * The meta object id for the '{@link query.impl.GreaterEqualThanLinkImpl <em>Greater Equal Than Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.GreaterEqualThanLinkImpl
	 * @see query.impl.QueryPackageImpl#getGreaterEqualThanLink()
	 * @generated
	 */
	int GREATER_EQUAL_THAN_LINK = 41;

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
	 * The meta object id for the '{@link query.impl.LowerThanLinkImpl <em>Lower Than Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.LowerThanLinkImpl
	 * @see query.impl.QueryPackageImpl#getLowerThanLink()
	 * @generated
	 */
	int LOWER_THAN_LINK = 42;

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
	 * The meta object id for the '{@link query.impl.LowerEqualThanLinkImpl <em>Lower Equal Than Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.LowerEqualThanLinkImpl
	 * @see query.impl.QueryPackageImpl#getLowerEqualThanLink()
	 * @generated
	 */
	int LOWER_EQUAL_THAN_LINK = 43;

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
	 * The meta object id for the '{@link query.impl.InLinkImpl <em>In Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.InLinkImpl
	 * @see query.impl.QueryPackageImpl#getInLink()
	 * @generated
	 */
	int IN_LINK = 44;

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
	 * The meta object id for the '{@link query.impl.LikeLinkImpl <em>Like Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.LikeLinkImpl
	 * @see query.impl.QueryPackageImpl#getLikeLink()
	 * @generated
	 */
	int LIKE_LINK = 45;

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
	 * The meta object id for the '{@link query.QueryType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.QueryType
	 * @see query.impl.QueryPackageImpl#getQueryType()
	 * @generated
	 */
	int QUERY_TYPE = 46;

	/**
	 * The meta object id for the '{@link query.RelationSelectOperationType <em>Relation Select Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.RelationSelectOperationType
	 * @see query.impl.QueryPackageImpl#getRelationSelectOperationType()
	 * @generated
	 */
	int RELATION_SELECT_OPERATION_TYPE = 47;

	/**
	 * The meta object id for the '{@link query.RelationSelectType <em>Relation Select Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.RelationSelectType
	 * @see query.impl.QueryPackageImpl#getRelationSelectType()
	 * @generated
	 */
	int RELATION_SELECT_TYPE = 48;

	/**
	 * The meta object id for the '{@link query.SortType <em>Sort Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.SortType
	 * @see query.impl.QueryPackageImpl#getSortType()
	 * @generated
	 */
	int SORT_TYPE = 49;

	/**
	 * The meta object id for the '{@link query.LiteralType <em>Literal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.LiteralType
	 * @see query.impl.QueryPackageImpl#getLiteralType()
	 * @generated
	 */
	int LITERAL_TYPE = 50;

	/**
	 * The meta object id for the '{@link query.JuncType <em>Junc Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.JuncType
	 * @see query.impl.QueryPackageImpl#getJuncType()
	 * @generated
	 */
	int JUNC_TYPE = 51;

	/**
	 * Returns the meta object for class '{@link query.QuerySurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface</em>'.
	 * @see query.QuerySurface
	 * @generated
	 */
	EClass getQuerySurface();

	/**
	 * Returns the meta object for the containment reference '{@link query.QuerySurface#getOutputInstalment <em>Output Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Instalment</em>'.
	 * @see query.QuerySurface#getOutputInstalment()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EReference getQuerySurface_OutputInstalment();

	/**
	 * Returns the meta object for the containment reference '{@link query.QuerySurface#getInputInstalment <em>Input Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Instalment</em>'.
	 * @see query.QuerySurface#getInputInstalment()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EReference getQuerySurface_InputInstalment();

	/**
	 * Returns the meta object for the containment reference '{@link query.QuerySurface#getWhereInstalment <em>Where Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where Instalment</em>'.
	 * @see query.QuerySurface#getWhereInstalment()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EReference getQuerySurface_WhereInstalment();

	/**
	 * Returns the meta object for the containment reference '{@link query.QuerySurface#getHavingInstalment <em>Having Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Having Instalment</em>'.
	 * @see query.QuerySurface#getHavingInstalment()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EReference getQuerySurface_HavingInstalment();

	/**
	 * Returns the meta object for the containment reference '{@link query.QuerySurface#getGroupInstalment <em>Group Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group Instalment</em>'.
	 * @see query.QuerySurface#getGroupInstalment()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EReference getQuerySurface_GroupInstalment();

	/**
	 * Returns the meta object for the containment reference '{@link query.QuerySurface#getSortInstalment <em>Sort Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort Instalment</em>'.
	 * @see query.QuerySurface#getSortInstalment()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EReference getQuerySurface_SortInstalment();

	/**
	 * Returns the meta object for the reference list '{@link query.QuerySurface#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see query.QuerySurface#getTypes()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EReference getQuerySurface_Types();

	/**
	 * Returns the meta object for the reference list '{@link query.QuerySurface#getFuncs <em>Funcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Funcs</em>'.
	 * @see query.QuerySurface#getFuncs()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EReference getQuerySurface_Funcs();

	/**
	 * Returns the meta object for the attribute '{@link query.QuerySurface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.QuerySurface#getName()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EAttribute getQuerySurface_Name();

	/**
	 * Returns the meta object for the attribute '{@link query.QuerySurface#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see query.QuerySurface#getUserName()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EAttribute getQuerySurface_UserName();

	/**
	 * Returns the meta object for the attribute '{@link query.QuerySurface#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see query.QuerySurface#getPassword()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EAttribute getQuerySurface_Password();

	/**
	 * Returns the meta object for the attribute '{@link query.QuerySurface#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see query.QuerySurface#getUri()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EAttribute getQuerySurface_Uri();

	/**
	 * Returns the meta object for the attribute '{@link query.QuerySurface#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see query.QuerySurface#getDescription()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EAttribute getQuerySurface_Description();

	/**
	 * Returns the meta object for the attribute '{@link query.QuerySurface#getNumberOfRow <em>Number Of Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Row</em>'.
	 * @see query.QuerySurface#getNumberOfRow()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EAttribute getQuerySurface_NumberOfRow();

	/**
	 * Returns the meta object for the attribute '{@link query.QuerySurface#getIndexOfRoes <em>Index Of Roes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Of Roes</em>'.
	 * @see query.QuerySurface#getIndexOfRoes()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EAttribute getQuerySurface_IndexOfRoes();

	/**
	 * Returns the meta object for the attribute '{@link query.QuerySurface#isCreateClass <em>Create Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Class</em>'.
	 * @see query.QuerySurface#isCreateClass()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EAttribute getQuerySurface_CreateClass();

	/**
	 * Returns the meta object for the attribute '{@link query.QuerySurface#getAssociatedClass <em>Associated Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated Class</em>'.
	 * @see query.QuerySurface#getAssociatedClass()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EAttribute getQuerySurface_AssociatedClass();

	/**
	 * Returns the meta object for the attribute '{@link query.QuerySurface#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see query.QuerySurface#getType()
	 * @see #getQuerySurface()
	 * @generated
	 */
	EAttribute getQuerySurface_Type();

	/**
	 * Returns the meta object for class '{@link query.OutputInstalment <em>Output Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Instalment</em>'.
	 * @see query.OutputInstalment
	 * @generated
	 */
	EClass getOutputInstalment();

	/**
	 * Returns the meta object for the attribute '{@link query.OutputInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.OutputInstalment#getName()
	 * @see #getOutputInstalment()
	 * @generated
	 */
	EAttribute getOutputInstalment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link query.OutputInstalment#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see query.OutputInstalment#getNodes()
	 * @see #getOutputInstalment()
	 * @generated
	 */
	EReference getOutputInstalment_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link query.OutputInstalment#getRels <em>Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rels</em>'.
	 * @see query.OutputInstalment#getRels()
	 * @see #getOutputInstalment()
	 * @generated
	 */
	EReference getOutputInstalment_Rels();

	/**
	 * Returns the meta object for class '{@link query.InputInstalment <em>Input Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Instalment</em>'.
	 * @see query.InputInstalment
	 * @generated
	 */
	EClass getInputInstalment();

	/**
	 * Returns the meta object for the attribute '{@link query.InputInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.InputInstalment#getName()
	 * @see #getInputInstalment()
	 * @generated
	 */
	EAttribute getInputInstalment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link query.InputInstalment#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see query.InputInstalment#getInputs()
	 * @see #getInputInstalment()
	 * @generated
	 */
	EReference getInputInstalment_Inputs();

	/**
	 * Returns the meta object for class '{@link query.SortInstalment <em>Sort Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Instalment</em>'.
	 * @see query.SortInstalment
	 * @generated
	 */
	EClass getSortInstalment();

	/**
	 * Returns the meta object for the attribute '{@link query.SortInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.SortInstalment#getName()
	 * @see #getSortInstalment()
	 * @generated
	 */
	EAttribute getSortInstalment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link query.SortInstalment#getPointers <em>Pointers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointers</em>'.
	 * @see query.SortInstalment#getPointers()
	 * @see #getSortInstalment()
	 * @generated
	 */
	EReference getSortInstalment_Pointers();

	/**
	 * Returns the meta object for class '{@link query.GroupInstalment <em>Group Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Instalment</em>'.
	 * @see query.GroupInstalment
	 * @generated
	 */
	EClass getGroupInstalment();

	/**
	 * Returns the meta object for the attribute '{@link query.GroupInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.GroupInstalment#getName()
	 * @see #getGroupInstalment()
	 * @generated
	 */
	EAttribute getGroupInstalment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link query.GroupInstalment#getPointers <em>Pointers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointers</em>'.
	 * @see query.GroupInstalment#getPointers()
	 * @see #getGroupInstalment()
	 * @generated
	 */
	EReference getGroupInstalment_Pointers();

	/**
	 * Returns the meta object for class '{@link query.ConditionInstalment <em>Condition Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Instalment</em>'.
	 * @see query.ConditionInstalment
	 * @generated
	 */
	EClass getConditionInstalment();

	/**
	 * Returns the meta object for the containment reference list '{@link query.ConditionInstalment#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see query.ConditionInstalment#getParts()
	 * @see #getConditionInstalment()
	 * @generated
	 */
	EReference getConditionInstalment_Parts();

	/**
	 * Returns the meta object for the containment reference list '{@link query.ConditionInstalment#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see query.ConditionInstalment#getLinks()
	 * @see #getConditionInstalment()
	 * @generated
	 */
	EReference getConditionInstalment_Links();

	/**
	 * Returns the meta object for class '{@link query.WhereInstalment <em>Where Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where Instalment</em>'.
	 * @see query.WhereInstalment
	 * @generated
	 */
	EClass getWhereInstalment();

	/**
	 * Returns the meta object for the attribute '{@link query.WhereInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.WhereInstalment#getName()
	 * @see #getWhereInstalment()
	 * @generated
	 */
	EAttribute getWhereInstalment_Name();

	/**
	 * Returns the meta object for class '{@link query.HavingInstalment <em>Having Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Having Instalment</em>'.
	 * @see query.HavingInstalment
	 * @generated
	 */
	EClass getHavingInstalment();

	/**
	 * Returns the meta object for the attribute '{@link query.HavingInstalment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.HavingInstalment#getName()
	 * @see #getHavingInstalment()
	 * @generated
	 */
	EAttribute getHavingInstalment_Name();

	/**
	 * Returns the meta object for class '{@link query.RelationSelect <em>Relation Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Select</em>'.
	 * @see query.RelationSelect
	 * @generated
	 */
	EClass getRelationSelect();

	/**
	 * Returns the meta object for the reference '{@link query.RelationSelect#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see query.RelationSelect#getSource()
	 * @see #getRelationSelect()
	 * @generated
	 */
	EReference getRelationSelect_Source();

	/**
	 * Returns the meta object for the reference '{@link query.RelationSelect#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see query.RelationSelect#getTarget()
	 * @see #getRelationSelect()
	 * @generated
	 */
	EReference getRelationSelect_Target();

	/**
	 * Returns the meta object for the attribute '{@link query.RelationSelect#getOpType <em>Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Type</em>'.
	 * @see query.RelationSelect#getOpType()
	 * @see #getRelationSelect()
	 * @generated
	 */
	EAttribute getRelationSelect_OpType();

	/**
	 * Returns the meta object for class '{@link query.InnerjoinRels <em>Innerjoin Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Innerjoin Rels</em>'.
	 * @see query.InnerjoinRels
	 * @generated
	 */
	EClass getInnerjoinRels();

	/**
	 * Returns the meta object for the attribute '{@link query.InnerjoinRels#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see query.InnerjoinRels#getType()
	 * @see #getInnerjoinRels()
	 * @generated
	 */
	EAttribute getInnerjoinRels_Type();

	/**
	 * Returns the meta object for class '{@link query.LeftOuterJoinRels <em>Left Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Outer Join Rels</em>'.
	 * @see query.LeftOuterJoinRels
	 * @generated
	 */
	EClass getLeftOuterJoinRels();

	/**
	 * Returns the meta object for the attribute '{@link query.LeftOuterJoinRels#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see query.LeftOuterJoinRels#getType()
	 * @see #getLeftOuterJoinRels()
	 * @generated
	 */
	EAttribute getLeftOuterJoinRels_Type();

	/**
	 * Returns the meta object for class '{@link query.RightOuterJoinRels <em>Right Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Outer Join Rels</em>'.
	 * @see query.RightOuterJoinRels
	 * @generated
	 */
	EClass getRightOuterJoinRels();

	/**
	 * Returns the meta object for the attribute '{@link query.RightOuterJoinRels#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see query.RightOuterJoinRels#getType()
	 * @see #getRightOuterJoinRels()
	 * @generated
	 */
	EAttribute getRightOuterJoinRels_Type();

	/**
	 * Returns the meta object for class '{@link query.FullOuterJoinRels <em>Full Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full Outer Join Rels</em>'.
	 * @see query.FullOuterJoinRels
	 * @generated
	 */
	EClass getFullOuterJoinRels();

	/**
	 * Returns the meta object for the attribute '{@link query.FullOuterJoinRels#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see query.FullOuterJoinRels#getType()
	 * @see #getFullOuterJoinRels()
	 * @generated
	 */
	EAttribute getFullOuterJoinRels_Type();

	/**
	 * Returns the meta object for class '{@link query.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see query.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for class '{@link query.FieldGPointer <em>Field GPointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field GPointer</em>'.
	 * @see query.FieldGPointer
	 * @generated
	 */
	EClass getFieldGPointer();

	/**
	 * Returns the meta object for the attribute '{@link query.FieldGPointer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.FieldGPointer#getName()
	 * @see #getFieldGPointer()
	 * @generated
	 */
	EAttribute getFieldGPointer_Name();

	/**
	 * Returns the meta object for the reference '{@link query.FieldGPointer#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see query.FieldGPointer#getField()
	 * @see #getFieldGPointer()
	 * @generated
	 */
	EReference getFieldGPointer_Field();

	/**
	 * Returns the meta object for class '{@link query.FieldSPointer <em>Field SPointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field SPointer</em>'.
	 * @see query.FieldSPointer
	 * @generated
	 */
	EClass getFieldSPointer();

	/**
	 * Returns the meta object for the attribute '{@link query.FieldSPointer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.FieldSPointer#getName()
	 * @see #getFieldSPointer()
	 * @generated
	 */
	EAttribute getFieldSPointer_Name();

	/**
	 * Returns the meta object for the attribute '{@link query.FieldSPointer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see query.FieldSPointer#getType()
	 * @see #getFieldSPointer()
	 * @generated
	 */
	EAttribute getFieldSPointer_Type();

	/**
	 * Returns the meta object for the reference '{@link query.FieldSPointer#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see query.FieldSPointer#getField()
	 * @see #getFieldSPointer()
	 * @generated
	 */
	EReference getFieldSPointer_Field();

	/**
	 * Returns the meta object for class '{@link query.MyTable <em>My Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Table</em>'.
	 * @see query.MyTable
	 * @generated
	 */
	EClass getMyTable();

	/**
	 * Returns the meta object for the attribute '{@link query.MyTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.MyTable#getName()
	 * @see #getMyTable()
	 * @generated
	 */
	EAttribute getMyTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link query.MyTable#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see query.MyTable#getAlias()
	 * @see #getMyTable()
	 * @generated
	 */
	EAttribute getMyTable_Alias();

	/**
	 * Returns the meta object for the containment reference list '{@link query.MyTable#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see query.MyTable#getFields()
	 * @see #getMyTable()
	 * @generated
	 */
	EReference getMyTable_Fields();

	/**
	 * Returns the meta object for class '{@link query.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see query.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link query.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see query.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Type();

	/**
	 * Returns the meta object for the reference '{@link query.Node#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subtype</em>'.
	 * @see query.Node#getSubtype()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link query.Node#getColumn_name <em>Column name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column name</em>'.
	 * @see query.Node#getColumn_name()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Column_name();

	/**
	 * Returns the meta object for the attribute '{@link query.Node#isListable <em>Listable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listable</em>'.
	 * @see query.Node#isListable()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Listable();

	/**
	 * Returns the meta object for class '{@link query.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see query.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link query.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the container reference '{@link query.Field#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see query.Field#getTable()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Table();

	/**
	 * Returns the meta object for the attribute '{@link query.Field#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see query.Field#getTableName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_TableName();

	/**
	 * Returns the meta object for the reference '{@link query.Field#getTable_ref <em>Table ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table ref</em>'.
	 * @see query.Field#getTable_ref()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Table_ref();

	/**
	 * Returns the meta object for the attribute '{@link query.Field#isDistict <em>Distict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distict</em>'.
	 * @see query.Field#isDistict()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Distict();

	/**
	 * Returns the meta object for class '{@link query.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see query.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link query.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see query.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link query.Literal#getLtype <em>Ltype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ltype</em>'.
	 * @see query.Literal#getLtype()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Ltype();

	/**
	 * Returns the meta object for class '{@link query.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see query.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for the attribute '{@link query.NullLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see query.NullLiteral#getValue()
	 * @see #getNullLiteral()
	 * @generated
	 */
	EAttribute getNullLiteral_Value();

	/**
	 * Returns the meta object for class '{@link query.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see query.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link query.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the reference '{@link query.Function#getFuncDef <em>Func Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Func Def</em>'.
	 * @see query.Function#getFuncDef()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_FuncDef();

	/**
	 * Returns the meta object for the containment reference list '{@link query.Function#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see query.Function#getParams()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Params();

	/**
	 * Returns the meta object for class '{@link query.FunctionDef <em>Function Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Def</em>'.
	 * @see query.FunctionDef
	 * @generated
	 */
	EClass getFunctionDef();

	/**
	 * Returns the meta object for the attribute '{@link query.FunctionDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.FunctionDef#getName()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EAttribute getFunctionDef_Name();

	/**
	 * Returns the meta object for the reference '{@link query.FunctionDef#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Returntype</em>'.
	 * @see query.FunctionDef#getReturntype()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_Returntype();

	/**
	 * Returns the meta object for the reference '{@link query.FunctionDef#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Args</em>'.
	 * @see query.FunctionDef#getArgs()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_Args();

	/**
	 * Returns the meta object for class '{@link query.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see query.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link query.Input#getInputRef <em>Input Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Ref</em>'.
	 * @see query.Input#getInputRef()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_InputRef();

	/**
	 * Returns the meta object for class '{@link query.InputDef <em>Input Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Def</em>'.
	 * @see query.InputDef
	 * @generated
	 */
	EClass getInputDef();

	/**
	 * Returns the meta object for the attribute '{@link query.InputDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.InputDef#getName()
	 * @see #getInputDef()
	 * @generated
	 */
	EAttribute getInputDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link query.InputDef#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see query.InputDef#getIndex()
	 * @see #getInputDef()
	 * @generated
	 */
	EAttribute getInputDef_Index();

	/**
	 * Returns the meta object for the attribute '{@link query.InputDef#isListable <em>Listable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listable</em>'.
	 * @see query.InputDef#isListable()
	 * @see #getInputDef()
	 * @generated
	 */
	EAttribute getInputDef_Listable();

	/**
	 * Returns the meta object for class '{@link query.InputStringDef <em>Input String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input String Def</em>'.
	 * @see query.InputStringDef
	 * @generated
	 */
	EClass getInputStringDef();

	/**
	 * Returns the meta object for class '{@link query.InputIntDef <em>Input Int Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Int Def</em>'.
	 * @see query.InputIntDef
	 * @generated
	 */
	EClass getInputIntDef();

	/**
	 * Returns the meta object for class '{@link query.InputDateDef <em>Input Date Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Date Def</em>'.
	 * @see query.InputDateDef
	 * @generated
	 */
	EClass getInputDateDef();

	/**
	 * Returns the meta object for class '{@link query.InputBitsDef <em>Input Bits Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Bits Def</em>'.
	 * @see query.InputBitsDef
	 * @generated
	 */
	EClass getInputBitsDef();

	/**
	 * Returns the meta object for class '{@link query.InputFloatDef <em>Input Float Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Float Def</em>'.
	 * @see query.InputFloatDef
	 * @generated
	 */
	EClass getInputFloatDef();

	/**
	 * Returns the meta object for class '{@link query.CallQuerySurface <em>Call Query Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Query Surface</em>'.
	 * @see query.CallQuerySurface
	 * @generated
	 */
	EClass getCallQuerySurface();

	/**
	 * Returns the meta object for the attribute '{@link query.CallQuerySurface#getSurfaceName <em>Surface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface Name</em>'.
	 * @see query.CallQuerySurface#getSurfaceName()
	 * @see #getCallQuerySurface()
	 * @generated
	 */
	EAttribute getCallQuerySurface_SurfaceName();

	/**
	 * Returns the meta object for class '{@link query.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see query.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link query.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the reference list '{@link query.Type#getSubtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtypes</em>'.
	 * @see query.Type#getSubtypes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Subtypes();

	/**
	 * Returns the meta object for class '{@link query.Subtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtype</em>'.
	 * @see query.Subtype
	 * @generated
	 */
	EClass getSubtype();

	/**
	 * Returns the meta object for the attribute '{@link query.Subtype#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.Subtype#getName()
	 * @see #getSubtype()
	 * @generated
	 */
	EAttribute getSubtype_Name();

	/**
	 * Returns the meta object for class '{@link query.AbstractConditionElement <em>Abstract Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Condition Element</em>'.
	 * @see query.AbstractConditionElement
	 * @generated
	 */
	EClass getAbstractConditionElement();

	/**
	 * Returns the meta object for class '{@link query.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see query.Junction
	 * @generated
	 */
	EClass getJunction();

	/**
	 * Returns the meta object for the attribute '{@link query.Junction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see query.Junction#getType()
	 * @see #getJunction()
	 * @generated
	 */
	EAttribute getJunction_Type();

	/**
	 * Returns the meta object for the reference list '{@link query.Junction#getRels <em>Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rels</em>'.
	 * @see query.Junction#getRels()
	 * @see #getJunction()
	 * @generated
	 */
	EReference getJunction_Rels();

	/**
	 * Returns the meta object for class '{@link query.RootJunction <em>Root Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Junction</em>'.
	 * @see query.RootJunction
	 * @generated
	 */
	EClass getRootJunction();

	/**
	 * Returns the meta object for class '{@link query.JuncRelationship <em>Junc Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junc Relationship</em>'.
	 * @see query.JuncRelationship
	 * @generated
	 */
	EClass getJuncRelationship();

	/**
	 * Returns the meta object for the reference '{@link query.JuncRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see query.JuncRelationship#getSource()
	 * @see #getJuncRelationship()
	 * @generated
	 */
	EReference getJuncRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link query.JuncRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see query.JuncRelationship#getTarget()
	 * @see #getJuncRelationship()
	 * @generated
	 */
	EReference getJuncRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link query.JuncRelationship#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see query.JuncRelationship#getIndex()
	 * @see #getJuncRelationship()
	 * @generated
	 */
	EAttribute getJuncRelationship_Index();

	/**
	 * Returns the meta object for the attribute '{@link query.JuncRelationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see query.JuncRelationship#getType()
	 * @see #getJuncRelationship()
	 * @generated
	 */
	EAttribute getJuncRelationship_Type();

	/**
	 * Returns the meta object for class '{@link query.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see query.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link query.Term#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see query.Term#getParams()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Params();

	/**
	 * Returns the meta object for the attribute '{@link query.Term#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see query.Term#getTitle()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Title();

	/**
	 * Returns the meta object for the containment reference '{@link query.Term#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see query.Term#getLink()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Link();

	/**
	 * Returns the meta object for class '{@link query.ConditionLink <em>Condition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Link</em>'.
	 * @see query.ConditionLink
	 * @generated
	 */
	EClass getConditionLink();

	/**
	 * Returns the meta object for the reference '{@link query.ConditionLink#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see query.ConditionLink#getSrc()
	 * @see #getConditionLink()
	 * @generated
	 */
	EReference getConditionLink_Src();

	/**
	 * Returns the meta object for the reference '{@link query.ConditionLink#getDst <em>Dst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dst</em>'.
	 * @see query.ConditionLink#getDst()
	 * @see #getConditionLink()
	 * @generated
	 */
	EReference getConditionLink_Dst();

	/**
	 * Returns the meta object for the attribute '{@link query.ConditionLink#isNegative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative</em>'.
	 * @see query.ConditionLink#isNegative()
	 * @see #getConditionLink()
	 * @generated
	 */
	EAttribute getConditionLink_Negative();

	/**
	 * Returns the meta object for class '{@link query.EqualLink <em>Equal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal Link</em>'.
	 * @see query.EqualLink
	 * @generated
	 */
	EClass getEqualLink();

	/**
	 * Returns the meta object for the attribute '{@link query.EqualLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see query.EqualLink#getDesc()
	 * @see #getEqualLink()
	 * @generated
	 */
	EAttribute getEqualLink_Desc();

	/**
	 * Returns the meta object for class '{@link query.GreaterThanLink <em>Greater Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Link</em>'.
	 * @see query.GreaterThanLink
	 * @generated
	 */
	EClass getGreaterThanLink();

	/**
	 * Returns the meta object for the attribute '{@link query.GreaterThanLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see query.GreaterThanLink#getDesc()
	 * @see #getGreaterThanLink()
	 * @generated
	 */
	EAttribute getGreaterThanLink_Desc();

	/**
	 * Returns the meta object for class '{@link query.GreaterEqualThanLink <em>Greater Equal Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Equal Than Link</em>'.
	 * @see query.GreaterEqualThanLink
	 * @generated
	 */
	EClass getGreaterEqualThanLink();

	/**
	 * Returns the meta object for the attribute '{@link query.GreaterEqualThanLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see query.GreaterEqualThanLink#getDesc()
	 * @see #getGreaterEqualThanLink()
	 * @generated
	 */
	EAttribute getGreaterEqualThanLink_Desc();

	/**
	 * Returns the meta object for class '{@link query.LowerThanLink <em>Lower Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Than Link</em>'.
	 * @see query.LowerThanLink
	 * @generated
	 */
	EClass getLowerThanLink();

	/**
	 * Returns the meta object for the attribute '{@link query.LowerThanLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see query.LowerThanLink#getDesc()
	 * @see #getLowerThanLink()
	 * @generated
	 */
	EAttribute getLowerThanLink_Desc();

	/**
	 * Returns the meta object for class '{@link query.LowerEqualThanLink <em>Lower Equal Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Equal Than Link</em>'.
	 * @see query.LowerEqualThanLink
	 * @generated
	 */
	EClass getLowerEqualThanLink();

	/**
	 * Returns the meta object for the attribute '{@link query.LowerEqualThanLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see query.LowerEqualThanLink#getDesc()
	 * @see #getLowerEqualThanLink()
	 * @generated
	 */
	EAttribute getLowerEqualThanLink_Desc();

	/**
	 * Returns the meta object for class '{@link query.InLink <em>In Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Link</em>'.
	 * @see query.InLink
	 * @generated
	 */
	EClass getInLink();

	/**
	 * Returns the meta object for the attribute '{@link query.InLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see query.InLink#getDesc()
	 * @see #getInLink()
	 * @generated
	 */
	EAttribute getInLink_Desc();

	/**
	 * Returns the meta object for class '{@link query.LikeLink <em>Like Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Like Link</em>'.
	 * @see query.LikeLink
	 * @generated
	 */
	EClass getLikeLink();

	/**
	 * Returns the meta object for the attribute '{@link query.LikeLink#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see query.LikeLink#getDesc()
	 * @see #getLikeLink()
	 * @generated
	 */
	EAttribute getLikeLink_Desc();

	/**
	 * Returns the meta object for enum '{@link query.QueryType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see query.QueryType
	 * @generated
	 */
	EEnum getQueryType();

	/**
	 * Returns the meta object for enum '{@link query.RelationSelectOperationType <em>Relation Select Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Select Operation Type</em>'.
	 * @see query.RelationSelectOperationType
	 * @generated
	 */
	EEnum getRelationSelectOperationType();

	/**
	 * Returns the meta object for enum '{@link query.RelationSelectType <em>Relation Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Select Type</em>'.
	 * @see query.RelationSelectType
	 * @generated
	 */
	EEnum getRelationSelectType();

	/**
	 * Returns the meta object for enum '{@link query.SortType <em>Sort Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Type</em>'.
	 * @see query.SortType
	 * @generated
	 */
	EEnum getSortType();

	/**
	 * Returns the meta object for enum '{@link query.LiteralType <em>Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Literal Type</em>'.
	 * @see query.LiteralType
	 * @generated
	 */
	EEnum getLiteralType();

	/**
	 * Returns the meta object for enum '{@link query.JuncType <em>Junc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Junc Type</em>'.
	 * @see query.JuncType
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
	QueryFactory getQueryFactory();

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
		 * The meta object literal for the '{@link query.impl.QuerySurfaceImpl <em>Surface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.QuerySurfaceImpl
		 * @see query.impl.QueryPackageImpl#getQuerySurface()
		 * @generated
		 */
		EClass QUERY_SURFACE = eINSTANCE.getQuerySurface();

		/**
		 * The meta object literal for the '<em><b>Output Instalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SURFACE__OUTPUT_INSTALMENT = eINSTANCE.getQuerySurface_OutputInstalment();

		/**
		 * The meta object literal for the '<em><b>Input Instalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SURFACE__INPUT_INSTALMENT = eINSTANCE.getQuerySurface_InputInstalment();

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
		 * The meta object literal for the '<em><b>Group Instalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SURFACE__GROUP_INSTALMENT = eINSTANCE.getQuerySurface_GroupInstalment();

		/**
		 * The meta object literal for the '<em><b>Sort Instalment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SURFACE__SORT_INSTALMENT = eINSTANCE.getQuerySurface_SortInstalment();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SURFACE__TYPES = eINSTANCE.getQuerySurface_Types();

		/**
		 * The meta object literal for the '<em><b>Funcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SURFACE__FUNCS = eINSTANCE.getQuerySurface_Funcs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SURFACE__NAME = eINSTANCE.getQuerySurface_Name();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SURFACE__USER_NAME = eINSTANCE.getQuerySurface_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SURFACE__PASSWORD = eINSTANCE.getQuerySurface_Password();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SURFACE__URI = eINSTANCE.getQuerySurface_Uri();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SURFACE__DESCRIPTION = eINSTANCE.getQuerySurface_Description();

		/**
		 * The meta object literal for the '<em><b>Number Of Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SURFACE__NUMBER_OF_ROW = eINSTANCE.getQuerySurface_NumberOfRow();

		/**
		 * The meta object literal for the '<em><b>Index Of Roes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SURFACE__INDEX_OF_ROES = eINSTANCE.getQuerySurface_IndexOfRoes();

		/**
		 * The meta object literal for the '<em><b>Create Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SURFACE__CREATE_CLASS = eINSTANCE.getQuerySurface_CreateClass();

		/**
		 * The meta object literal for the '<em><b>Associated Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SURFACE__ASSOCIATED_CLASS = eINSTANCE.getQuerySurface_AssociatedClass();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SURFACE__TYPE = eINSTANCE.getQuerySurface_Type();

		/**
		 * The meta object literal for the '{@link query.impl.OutputInstalmentImpl <em>Output Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.OutputInstalmentImpl
		 * @see query.impl.QueryPackageImpl#getOutputInstalment()
		 * @generated
		 */
		EClass OUTPUT_INSTALMENT = eINSTANCE.getOutputInstalment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_INSTALMENT__NAME = eINSTANCE.getOutputInstalment_Name();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_INSTALMENT__NODES = eINSTANCE.getOutputInstalment_Nodes();

		/**
		 * The meta object literal for the '<em><b>Rels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_INSTALMENT__RELS = eINSTANCE.getOutputInstalment_Rels();

		/**
		 * The meta object literal for the '{@link query.impl.InputInstalmentImpl <em>Input Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.InputInstalmentImpl
		 * @see query.impl.QueryPackageImpl#getInputInstalment()
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
		 * The meta object literal for the '{@link query.impl.SortInstalmentImpl <em>Sort Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.SortInstalmentImpl
		 * @see query.impl.QueryPackageImpl#getSortInstalment()
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
		 * The meta object literal for the '{@link query.impl.GroupInstalmentImpl <em>Group Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.GroupInstalmentImpl
		 * @see query.impl.QueryPackageImpl#getGroupInstalment()
		 * @generated
		 */
		EClass GROUP_INSTALMENT = eINSTANCE.getGroupInstalment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_INSTALMENT__NAME = eINSTANCE.getGroupInstalment_Name();

		/**
		 * The meta object literal for the '<em><b>Pointers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_INSTALMENT__POINTERS = eINSTANCE.getGroupInstalment_Pointers();

		/**
		 * The meta object literal for the '{@link query.impl.ConditionInstalmentImpl <em>Condition Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.ConditionInstalmentImpl
		 * @see query.impl.QueryPackageImpl#getConditionInstalment()
		 * @generated
		 */
		EClass CONDITION_INSTALMENT = eINSTANCE.getConditionInstalment();

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
		 * The meta object literal for the '{@link query.impl.WhereInstalmentImpl <em>Where Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.WhereInstalmentImpl
		 * @see query.impl.QueryPackageImpl#getWhereInstalment()
		 * @generated
		 */
		EClass WHERE_INSTALMENT = eINSTANCE.getWhereInstalment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHERE_INSTALMENT__NAME = eINSTANCE.getWhereInstalment_Name();

		/**
		 * The meta object literal for the '{@link query.impl.HavingInstalmentImpl <em>Having Instalment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.HavingInstalmentImpl
		 * @see query.impl.QueryPackageImpl#getHavingInstalment()
		 * @generated
		 */
		EClass HAVING_INSTALMENT = eINSTANCE.getHavingInstalment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAVING_INSTALMENT__NAME = eINSTANCE.getHavingInstalment_Name();

		/**
		 * The meta object literal for the '{@link query.impl.RelationSelectImpl <em>Relation Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.RelationSelectImpl
		 * @see query.impl.QueryPackageImpl#getRelationSelect()
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
		 * The meta object literal for the '{@link query.impl.InnerjoinRelsImpl <em>Innerjoin Rels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.InnerjoinRelsImpl
		 * @see query.impl.QueryPackageImpl#getInnerjoinRels()
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
		 * The meta object literal for the '{@link query.impl.LeftOuterJoinRelsImpl <em>Left Outer Join Rels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.LeftOuterJoinRelsImpl
		 * @see query.impl.QueryPackageImpl#getLeftOuterJoinRels()
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
		 * The meta object literal for the '{@link query.impl.RightOuterJoinRelsImpl <em>Right Outer Join Rels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.RightOuterJoinRelsImpl
		 * @see query.impl.QueryPackageImpl#getRightOuterJoinRels()
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
		 * The meta object literal for the '{@link query.impl.FullOuterJoinRelsImpl <em>Full Outer Join Rels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.FullOuterJoinRelsImpl
		 * @see query.impl.QueryPackageImpl#getFullOuterJoinRels()
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
		 * The meta object literal for the '{@link query.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.AbstractNodeImpl
		 * @see query.impl.QueryPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '{@link query.impl.FieldGPointerImpl <em>Field GPointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.FieldGPointerImpl
		 * @see query.impl.QueryPackageImpl#getFieldGPointer()
		 * @generated
		 */
		EClass FIELD_GPOINTER = eINSTANCE.getFieldGPointer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_GPOINTER__NAME = eINSTANCE.getFieldGPointer_Name();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_GPOINTER__FIELD = eINSTANCE.getFieldGPointer_Field();

		/**
		 * The meta object literal for the '{@link query.impl.FieldSPointerImpl <em>Field SPointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.FieldSPointerImpl
		 * @see query.impl.QueryPackageImpl#getFieldSPointer()
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
		 * The meta object literal for the '{@link query.impl.MyTableImpl <em>My Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.MyTableImpl
		 * @see query.impl.QueryPackageImpl#getMyTable()
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
		 * The meta object literal for the '{@link query.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.NodeImpl
		 * @see query.impl.QueryPackageImpl#getNode()
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
		 * The meta object literal for the '{@link query.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.FieldImpl
		 * @see query.impl.QueryPackageImpl#getField()
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
		 * The meta object literal for the '{@link query.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.LiteralImpl
		 * @see query.impl.QueryPackageImpl#getLiteral()
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
		 * The meta object literal for the '{@link query.impl.NullLiteralImpl <em>Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.NullLiteralImpl
		 * @see query.impl.QueryPackageImpl#getNullLiteral()
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
		 * The meta object literal for the '{@link query.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.FunctionImpl
		 * @see query.impl.QueryPackageImpl#getFunction()
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
		 * The meta object literal for the '{@link query.impl.FunctionDefImpl <em>Function Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.FunctionDefImpl
		 * @see query.impl.QueryPackageImpl#getFunctionDef()
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
		 * The meta object literal for the '{@link query.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.InputImpl
		 * @see query.impl.QueryPackageImpl#getInput()
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
		 * The meta object literal for the '{@link query.impl.InputDefImpl <em>Input Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.InputDefImpl
		 * @see query.impl.QueryPackageImpl#getInputDef()
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
		 * The meta object literal for the '{@link query.impl.InputStringDefImpl <em>Input String Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.InputStringDefImpl
		 * @see query.impl.QueryPackageImpl#getInputStringDef()
		 * @generated
		 */
		EClass INPUT_STRING_DEF = eINSTANCE.getInputStringDef();

		/**
		 * The meta object literal for the '{@link query.impl.InputIntDefImpl <em>Input Int Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.InputIntDefImpl
		 * @see query.impl.QueryPackageImpl#getInputIntDef()
		 * @generated
		 */
		EClass INPUT_INT_DEF = eINSTANCE.getInputIntDef();

		/**
		 * The meta object literal for the '{@link query.impl.InputDateDefImpl <em>Input Date Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.InputDateDefImpl
		 * @see query.impl.QueryPackageImpl#getInputDateDef()
		 * @generated
		 */
		EClass INPUT_DATE_DEF = eINSTANCE.getInputDateDef();

		/**
		 * The meta object literal for the '{@link query.impl.InputBitsDefImpl <em>Input Bits Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.InputBitsDefImpl
		 * @see query.impl.QueryPackageImpl#getInputBitsDef()
		 * @generated
		 */
		EClass INPUT_BITS_DEF = eINSTANCE.getInputBitsDef();

		/**
		 * The meta object literal for the '{@link query.impl.InputFloatDefImpl <em>Input Float Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.InputFloatDefImpl
		 * @see query.impl.QueryPackageImpl#getInputFloatDef()
		 * @generated
		 */
		EClass INPUT_FLOAT_DEF = eINSTANCE.getInputFloatDef();

		/**
		 * The meta object literal for the '{@link query.impl.CallQuerySurfaceImpl <em>Call Query Surface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.CallQuerySurfaceImpl
		 * @see query.impl.QueryPackageImpl#getCallQuerySurface()
		 * @generated
		 */
		EClass CALL_QUERY_SURFACE = eINSTANCE.getCallQuerySurface();

		/**
		 * The meta object literal for the '<em><b>Surface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_QUERY_SURFACE__SURFACE_NAME = eINSTANCE.getCallQuerySurface_SurfaceName();

		/**
		 * The meta object literal for the '{@link query.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.TypeImpl
		 * @see query.impl.QueryPackageImpl#getType()
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
		 * The meta object literal for the '{@link query.impl.SubtypeImpl <em>Subtype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.SubtypeImpl
		 * @see query.impl.QueryPackageImpl#getSubtype()
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
		 * The meta object literal for the '{@link query.impl.AbstractConditionElementImpl <em>Abstract Condition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.AbstractConditionElementImpl
		 * @see query.impl.QueryPackageImpl#getAbstractConditionElement()
		 * @generated
		 */
		EClass ABSTRACT_CONDITION_ELEMENT = eINSTANCE.getAbstractConditionElement();

		/**
		 * The meta object literal for the '{@link query.impl.JunctionImpl <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.JunctionImpl
		 * @see query.impl.QueryPackageImpl#getJunction()
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
		 * The meta object literal for the '{@link query.impl.RootJunctionImpl <em>Root Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.RootJunctionImpl
		 * @see query.impl.QueryPackageImpl#getRootJunction()
		 * @generated
		 */
		EClass ROOT_JUNCTION = eINSTANCE.getRootJunction();

		/**
		 * The meta object literal for the '{@link query.impl.JuncRelationshipImpl <em>Junc Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.JuncRelationshipImpl
		 * @see query.impl.QueryPackageImpl#getJuncRelationship()
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
		 * The meta object literal for the '{@link query.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.TermImpl
		 * @see query.impl.QueryPackageImpl#getTerm()
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
		 * The meta object literal for the '{@link query.impl.ConditionLinkImpl <em>Condition Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.ConditionLinkImpl
		 * @see query.impl.QueryPackageImpl#getConditionLink()
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
		 * The meta object literal for the '{@link query.impl.EqualLinkImpl <em>Equal Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.EqualLinkImpl
		 * @see query.impl.QueryPackageImpl#getEqualLink()
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
		 * The meta object literal for the '{@link query.impl.GreaterThanLinkImpl <em>Greater Than Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.GreaterThanLinkImpl
		 * @see query.impl.QueryPackageImpl#getGreaterThanLink()
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
		 * The meta object literal for the '{@link query.impl.GreaterEqualThanLinkImpl <em>Greater Equal Than Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.GreaterEqualThanLinkImpl
		 * @see query.impl.QueryPackageImpl#getGreaterEqualThanLink()
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
		 * The meta object literal for the '{@link query.impl.LowerThanLinkImpl <em>Lower Than Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.LowerThanLinkImpl
		 * @see query.impl.QueryPackageImpl#getLowerThanLink()
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
		 * The meta object literal for the '{@link query.impl.LowerEqualThanLinkImpl <em>Lower Equal Than Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.LowerEqualThanLinkImpl
		 * @see query.impl.QueryPackageImpl#getLowerEqualThanLink()
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
		 * The meta object literal for the '{@link query.impl.InLinkImpl <em>In Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.InLinkImpl
		 * @see query.impl.QueryPackageImpl#getInLink()
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
		 * The meta object literal for the '{@link query.impl.LikeLinkImpl <em>Like Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.LikeLinkImpl
		 * @see query.impl.QueryPackageImpl#getLikeLink()
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
		 * The meta object literal for the '{@link query.QueryType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.QueryType
		 * @see query.impl.QueryPackageImpl#getQueryType()
		 * @generated
		 */
		EEnum QUERY_TYPE = eINSTANCE.getQueryType();

		/**
		 * The meta object literal for the '{@link query.RelationSelectOperationType <em>Relation Select Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.RelationSelectOperationType
		 * @see query.impl.QueryPackageImpl#getRelationSelectOperationType()
		 * @generated
		 */
		EEnum RELATION_SELECT_OPERATION_TYPE = eINSTANCE.getRelationSelectOperationType();

		/**
		 * The meta object literal for the '{@link query.RelationSelectType <em>Relation Select Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.RelationSelectType
		 * @see query.impl.QueryPackageImpl#getRelationSelectType()
		 * @generated
		 */
		EEnum RELATION_SELECT_TYPE = eINSTANCE.getRelationSelectType();

		/**
		 * The meta object literal for the '{@link query.SortType <em>Sort Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.SortType
		 * @see query.impl.QueryPackageImpl#getSortType()
		 * @generated
		 */
		EEnum SORT_TYPE = eINSTANCE.getSortType();

		/**
		 * The meta object literal for the '{@link query.LiteralType <em>Literal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.LiteralType
		 * @see query.impl.QueryPackageImpl#getLiteralType()
		 * @generated
		 */
		EEnum LITERAL_TYPE = eINSTANCE.getLiteralType();

		/**
		 * The meta object literal for the '{@link query.JuncType <em>Junc Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.JuncType
		 * @see query.impl.QueryPackageImpl#getJuncType()
		 * @generated
		 */
		EEnum JUNC_TYPE = eINSTANCE.getJuncType();

	}

} //QueryPackage
