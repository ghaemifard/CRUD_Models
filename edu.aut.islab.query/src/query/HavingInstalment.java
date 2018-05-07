/**
 */
package query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Having Instalment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.HavingInstalment#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getHavingInstalment()
 * @model
 * @generated
 */
public interface HavingInstalment extends ConditionInstalment {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Having"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see query.QueryPackage#getHavingInstalment_Name()
	 * @model default="Having" changeable="false"
	 * @generated
	 */
	String getName();

} // HavingInstalment
