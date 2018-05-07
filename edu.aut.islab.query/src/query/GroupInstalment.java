/**
 */
package query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Instalment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.GroupInstalment#getName <em>Name</em>}</li>
 *   <li>{@link query.GroupInstalment#getPointers <em>Pointers</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getGroupInstalment()
 * @model annotation="gmf.node label='name' size='100,300'"
 * @generated
 */
public interface GroupInstalment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Grouped"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see query.QueryPackage#getGroupInstalment_Name()
	 * @model default="Grouped" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Pointers</b></em>' containment reference list.
	 * The list contents are of type {@link query.FieldGPointer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointers</em>' containment reference list.
	 * @see query.QueryPackage#getGroupInstalment_Pointers()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<FieldGPointer> getPointers();

} // GroupInstalment
