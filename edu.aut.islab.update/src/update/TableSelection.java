/**
 */
package update;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link update.TableSelection#getName <em>Name</em>}</li>
 *   <li>{@link update.TableSelection#getTables <em>Tables</em>}</li>
 *   <li>{@link update.TableSelection#getRels <em>Rels</em>}</li>
 * </ul>
 *
 * @see update.UpdatePackage#getTableSelection()
 * @model annotation="gmf.node label='name' size='250,500'"
 * @generated
 */
public interface TableSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"TableSelection"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see update.UpdatePackage#getTableSelection_Name()
	 * @model default="TableSelection" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link update.MyTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see update.UpdatePackage#getTableSelection_Tables()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<MyTable> getTables();

	/**
	 * Returns the value of the '<em><b>Rels</b></em>' containment reference list.
	 * The list contents are of type {@link update.RelationSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rels</em>' containment reference list.
	 * @see update.UpdatePackage#getTableSelection_Rels()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationSelect> getRels();

} // TableSelection
