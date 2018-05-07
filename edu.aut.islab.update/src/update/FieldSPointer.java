/**
 */
package update;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field SPointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link update.FieldSPointer#getName <em>Name</em>}</li>
 *   <li>{@link update.FieldSPointer#getType <em>Type</em>}</li>
 *   <li>{@link update.FieldSPointer#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see update.UpdatePackage#getFieldSPointer()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface FieldSPointer extends EObject {
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
	 * @see update.UpdatePackage#getFieldSPointer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link update.FieldSPointer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link update.SortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see update.SortType
	 * @see #setType(SortType)
	 * @see update.UpdatePackage#getFieldSPointer_Type()
	 * @model
	 * @generated
	 */
	SortType getType();

	/**
	 * Sets the value of the '{@link update.FieldSPointer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see update.SortType
	 * @see #getType()
	 * @generated
	 */
	void setType(SortType value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see update.UpdatePackage#getFieldSPointer_Field()
	 * @model
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link update.FieldSPointer#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // FieldSPointer
