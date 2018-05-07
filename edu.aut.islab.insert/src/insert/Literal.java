/**
 */
package insert;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link insert.Literal#getValue <em>Value</em>}</li>
 *   <li>{@link insert.Literal#getLtype <em>Ltype</em>}</li>
 * </ul>
 *
 * @see insert.InsertPackage#getLiteral()
 * @model annotation="gmf.node label='value,column_name' label.pattern='{0}/{1}'"
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
	 * @see insert.InsertPackage#getLiteral_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link insert.Literal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Ltype</b></em>' attribute.
	 * The literals are from the enumeration {@link insert.LiteralType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ltype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ltype</em>' attribute.
	 * @see insert.LiteralType
	 * @see #setLtype(LiteralType)
	 * @see insert.InsertPackage#getLiteral_Ltype()
	 * @model
	 * @generated
	 */
	LiteralType getLtype();

	/**
	 * Sets the value of the '{@link insert.Literal#getLtype <em>Ltype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ltype</em>' attribute.
	 * @see insert.LiteralType
	 * @see #getLtype()
	 * @generated
	 */
	void setLtype(LiteralType value);

} // Literal
