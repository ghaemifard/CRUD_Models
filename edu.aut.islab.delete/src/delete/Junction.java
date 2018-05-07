/**
 */
package delete;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Junction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.Junction#getType <em>Type</em>}</li>
 *   <li>{@link delete.Junction#getRels <em>Rels</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getJunction()
 * @model annotation="gmf.node label='type' figure='ellipse'"
 * @generated
 */
public interface Junction extends AbstractConditionElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link delete.JuncType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see delete.JuncType
	 * @see #setType(JuncType)
	 * @see delete.DeletePackage#getJunction_Type()
	 * @model
	 * @generated
	 */
	JuncType getType();

	/**
	 * Sets the value of the '{@link delete.Junction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see delete.JuncType
	 * @see #getType()
	 * @generated
	 */
	void setType(JuncType value);

	/**
	 * Returns the value of the '<em><b>Rels</b></em>' reference list.
	 * The list contents are of type {@link delete.JuncRelationship}.
	 * It is bidirectional and its opposite is '{@link delete.JuncRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rels</em>' reference list.
	 * @see delete.DeletePackage#getJunction_Rels()
	 * @see delete.JuncRelationship#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<JuncRelationship> getRels();

} // Junction
