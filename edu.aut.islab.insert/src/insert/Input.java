/**
 */
package insert;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link insert.Input#getInpDef <em>Inp Def</em>}</li>
 *   <li>{@link insert.Input#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see insert.InsertPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends Node {
	/**
	 * Returns the value of the '<em><b>Inp Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inp Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inp Def</em>' reference.
	 * @see #setInpDef(InputDef)
	 * @see insert.InsertPackage#getInput_InpDef()
	 * @model required="true"
	 * @generated
	 */
	InputDef getInpDef();

	/**
	 * Sets the value of the '{@link insert.Input#getInpDef <em>Inp Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inp Def</em>' reference.
	 * @see #getInpDef()
	 * @generated
	 */
	void setInpDef(InputDef value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see insert.InsertPackage#getInput_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link insert.Input#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Input
