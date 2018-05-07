/**
 */
package query;

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
 *   <li>{@link query.FunctionDef#getName <em>Name</em>}</li>
 *   <li>{@link query.FunctionDef#getReturntype <em>Returntype</em>}</li>
 *   <li>{@link query.FunctionDef#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getFunctionDef()
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
	 * @see query.QueryPackage#getFunctionDef_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link query.FunctionDef#getName <em>Name</em>}' attribute.
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
	 * @see query.QueryPackage#getFunctionDef_Returntype()
	 * @model
	 * @generated
	 */
	Subtype getReturntype();

	/**
	 * Sets the value of the '{@link query.FunctionDef#getReturntype <em>Returntype</em>}' reference.
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
	 * @see query.QueryPackage#getFunctionDef_Args()
	 * @model
	 * @generated
	 */
	Type getArgs();

	/**
	 * Sets the value of the '{@link query.FunctionDef#getArgs <em>Args</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' reference.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(Type value);

} // FunctionDef
