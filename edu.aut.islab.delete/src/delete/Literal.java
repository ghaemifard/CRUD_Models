/**
 */
package delete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.Literal#getValue <em>Value</em>}</li>
 *   <li>{@link delete.Literal#getLtype <em>Ltype</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getLiteral()
 * @model annotation="gmf.node label='value' label.pattern='{0}'"
 * @generated
 */
public interface Literal extends Node {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see delete.DeletePackage#getLiteral_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link delete.Literal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Ltype</b></em>' attribute.
	 * The literals are from the enumeration {@link delete.LiteralType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ltype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ltype</em>' attribute.
	 * @see delete.LiteralType
	 * @see #setLtype(LiteralType)
	 * @see delete.DeletePackage#getLiteral_Ltype()
	 * @model
	 * @generated
	 */
	LiteralType getLtype();

	/**
	 * Sets the value of the '{@link delete.Literal#getLtype <em>Ltype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ltype</em>' attribute.
	 * @see delete.LiteralType
	 * @see #getLtype()
	 * @generated
	 */
	void setLtype(LiteralType value);

} // Literal
