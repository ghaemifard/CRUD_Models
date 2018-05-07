/**
 */
package query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greater Equal Than Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.GreaterEqualThanLink#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getGreaterEqualThanLink()
 * @model
 * @generated
 */
public interface GreaterEqualThanLink extends ConditionLink {
	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * The default value is <code>">="</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see query.QueryPackage#getGreaterEqualThanLink_Desc()
	 * @model default=">=" changeable="false"
	 * @generated
	 */
	String getDesc();

} // GreaterEqualThanLink
