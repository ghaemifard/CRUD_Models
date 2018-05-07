/**
 */
package delete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lower Equal Than Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.LowerEqualThanLink#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getLowerEqualThanLink()
 * @model
 * @generated
 */
public interface LowerEqualThanLink extends ConditionLink {
	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * The default value is <code>"<="</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see delete.DeletePackage#getLowerEqualThanLink_Desc()
	 * @model default="<=" changeable="false"
	 * @generated
	 */
	String getDesc();

} // LowerEqualThanLink
