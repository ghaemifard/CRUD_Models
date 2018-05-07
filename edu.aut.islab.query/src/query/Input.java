/**
 */
package query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.Input#getInputRef <em>Input Ref</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getInput()
 * @model annotation="gmf.node label='column_name'"
 * @generated
 */
public interface Input extends Node {
	/**
	 * Returns the value of the '<em><b>Input Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Ref</em>' reference.
	 * @see #setInputRef(InputDef)
	 * @see query.QueryPackage#getInput_InputRef()
	 * @model required="true"
	 * @generated
	 */
	InputDef getInputRef();

	/**
	 * Sets the value of the '{@link query.Input#getInputRef <em>Input Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Ref</em>' reference.
	 * @see #getInputRef()
	 * @generated
	 */
	void setInputRef(InputDef value);

} // Input
