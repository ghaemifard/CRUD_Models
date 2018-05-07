/**
 */
package insert;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link insert.FunctionDef#getName <em>Name</em>}</li>
 *   <li>{@link insert.FunctionDef#getReturntype <em>Returntype</em>}</li>
 *   <li>{@link insert.FunctionDef#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see insert.InsertPackage#getFunctionDef()
 * @model
 * @generated
 */
public interface FunctionDef extends EObject {
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
	 * @see insert.InsertPackage#getFunctionDef_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link insert.FunctionDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returntype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returntype</em>' reference.
	 * @see #setReturntype(Subtype)
	 * @see insert.InsertPackage#getFunctionDef_Returntype()
	 * @model
	 * @generated
	 */
	Subtype getReturntype();

	/**
	 * Sets the value of the '{@link insert.FunctionDef#getReturntype <em>Returntype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returntype</em>' reference.
	 * @see #getReturntype()
	 * @generated
	 */
	void setReturntype(Subtype value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' reference.
	 * @see #setArgs(Type)
	 * @see insert.InsertPackage#getFunctionDef_Args()
	 * @model
	 * @generated
	 */
	Type getArgs();

	/**
	 * Sets the value of the '{@link insert.FunctionDef#getArgs <em>Args</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' reference.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(Type value);

} // FunctionDef
