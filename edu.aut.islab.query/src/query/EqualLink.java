/**
 */
package query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equal Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.EqualLink#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getEqualLink()
 * @model
 * @generated
 */
public interface EqualLink extends ConditionLink {
	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * The default value is <code>"="</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see query.QueryPackage#getEqualLink_Desc()
	 * @model default="=" changeable="false"
	 * @generated
	 */
	String getDesc();

} // EqualLink
