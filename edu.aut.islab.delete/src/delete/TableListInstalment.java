/**
 */
package delete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table List Instalment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.TableListInstalment#getName <em>Name</em>}</li>
 *   <li>{@link delete.TableListInstalment#getTables <em>Tables</em>}</li>
 *   <li>{@link delete.TableListInstalment#getRels <em>Rels</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getTableListInstalment()
 * @model annotation="gmf.node label='name' size='100,500'"
 * @generated
 */
public interface TableListInstalment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Table Selection"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see delete.DeletePackage#getTableListInstalment_Name()
	 * @model default="Table Selection" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link delete.MyTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see delete.DeletePackage#getTableListInstalment_Tables()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<MyTable> getTables();

	/**
	 * Returns the value of the '<em><b>Rels</b></em>' containment reference list.
	 * The list contents are of type {@link delete.RelationSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rels</em>' containment reference list.
	 * @see delete.DeletePackage#getTableListInstalment_Rels()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationSelect> getRels();

} // TableListInstalment
