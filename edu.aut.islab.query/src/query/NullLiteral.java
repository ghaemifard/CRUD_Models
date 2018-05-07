/**
 */
package query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.NullLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getNullLiteral()
 * @model annotation="gmf.node label='column_name' label.pattern='{0}'"
 * @generated
 */
public interface NullLiteral extends Node {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see query.QueryPackage#getNullLiteral_Value()
	 * @model default="null" changeable="false"
	 * @generated
	 */
	String getValue();

} // NullLiteral
