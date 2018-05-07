/**
 */
package delete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.Type#getName <em>Name</em>}</li>
 *   <li>{@link delete.Type#getSubtypes <em>Subtypes</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see delete.DeletePackage#getType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link delete.Type#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subtypes</b></em>' reference list.
	 * The list contents are of type {@link delete.Subtype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtypes</em>' reference list.
	 * @see delete.DeletePackage#getType_Subtypes()
	 * @model
	 * @generated
	 */
	EList<Subtype> getSubtypes();

} // Type
