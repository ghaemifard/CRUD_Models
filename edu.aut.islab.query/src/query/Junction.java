/**
 */
package query;

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
 *   <li>{@link query.Junction#getType <em>Type</em>}</li>
 *   <li>{@link query.Junction#getRels <em>Rels</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getJunction()
 * @model annotation="gmf.node label='type' figure='ellipse'"
 * @generated
 */
public interface Junction extends AbstractConditionElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link query.JuncType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see query.JuncType
	 * @see #setType(JuncType)
	 * @see query.QueryPackage#getJunction_Type()
	 * @model
	 * @generated
	 */
	JuncType getType();

	/**
	 * Sets the value of the '{@link query.Junction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see query.JuncType
	 * @see #getType()
	 * @generated
	 */
	void setType(JuncType value);

	/**
	 * Returns the value of the '<em><b>Rels</b></em>' reference list.
	 * The list contents are of type {@link query.JuncRelationship}.
	 * It is bidirectional and its opposite is '{@link query.JuncRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rels</em>' reference list.
	 * @see query.QueryPackage#getJunction_Rels()
	 * @see query.JuncRelationship#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<JuncRelationship> getRels();

} // Junction
