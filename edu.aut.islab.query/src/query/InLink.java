/**
 */
package query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.InLink#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getInLink()
 * @model
 * @generated
 */
public interface InLink extends ConditionLink {
	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * The default value is <code>"In"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see query.QueryPackage#getInLink_Desc()
	 * @model default="In" changeable="false"
	 * @generated
	 */
	String getDesc();

} // InLink
