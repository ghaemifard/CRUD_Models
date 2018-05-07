/**
 */
package delete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Like Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.LikeLink#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getLikeLink()
 * @model
 * @generated
 */
public interface LikeLink extends ConditionLink {
	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * The default value is <code>"Like"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see delete.DeletePackage#getLikeLink_Desc()
	 * @model default="Like" changeable="false"
	 * @generated
	 */
	String getDesc();

} // LikeLink
