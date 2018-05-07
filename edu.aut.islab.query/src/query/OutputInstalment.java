/**
 */
package query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Instalment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.OutputInstalment#getName <em>Name</em>}</li>
 *   <li>{@link query.OutputInstalment#getNodes <em>Nodes</em>}</li>
 *   <li>{@link query.OutputInstalment#getRels <em>Rels</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getOutputInstalment()
 * @model annotation="gmf.node label='name' size='100,500'"
 * @generated
 */
public interface OutputInstalment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Output"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see query.QueryPackage#getOutputInstalment_Name()
	 * @model default="Output" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link query.AbstractNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see query.QueryPackage#getOutputInstalment_Nodes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<AbstractNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Rels</b></em>' containment reference list.
	 * The list contents are of type {@link query.RelationSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rels</em>' containment reference list.
	 * @see query.QueryPackage#getOutputInstalment_Rels()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationSelect> getRels();

} // OutputInstalment
