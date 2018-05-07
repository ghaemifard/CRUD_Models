/**
 */
package delete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Surface Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.CallSurfaceQuery#getSurfaceName <em>Surface Name</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getCallSurfaceQuery()
 * @model
 * @generated
 */
public interface CallSurfaceQuery extends Function {
	/**
	 * Returns the value of the '<em><b>Surface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Name</em>' attribute.
	 * @see #setSurfaceName(String)
	 * @see delete.DeletePackage#getCallSurfaceQuery_SurfaceName()
	 * @model
	 * @generated
	 */
	String getSurfaceName();

	/**
	 * Sets the value of the '{@link delete.CallSurfaceQuery#getSurfaceName <em>Surface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Name</em>' attribute.
	 * @see #getSurfaceName()
	 * @generated
	 */
	void setSurfaceName(String value);

} // CallSurfaceQuery
