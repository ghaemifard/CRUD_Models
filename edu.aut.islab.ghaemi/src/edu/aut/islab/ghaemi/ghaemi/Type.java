/**
 */
package edu.aut.islab.ghaemi.ghaemi;

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
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Type#getSubtypes <em>Subtypes</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Type#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Subtypes</b></em>' containment reference list.
	 * The list contents are of type {@link edu.aut.islab.ghaemi.ghaemi.Subtypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtypes</em>' containment reference list.
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getType_Subtypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Subtypes> getSubtypes();

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
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.Type#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Type
