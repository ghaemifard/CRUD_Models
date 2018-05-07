/**
 */
package query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Instalment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.SortInstalment#getName <em>Name</em>}</li>
 *   <li>{@link query.SortInstalment#getPointers <em>Pointers</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getSortInstalment()
 * @model annotation="gmf.node label='name' size='100,300'"
 * @generated
 */
public interface SortInstalment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Sorted"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see query.QueryPackage#getSortInstalment_Name()
	 * @model default="Sorted" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Pointers</b></em>' containment reference list.
	 * The list contents are of type {@link query.FieldSPointer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointers</em>' containment reference list.
	 * @see query.QueryPackage#getSortInstalment_Pointers()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<FieldSPointer> getPointers();

} // SortInstalment
