/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Function#getParams <em>Params</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Function#getFuncRef <em>Func Ref</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Node {
	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link edu.aut.islab.ghaemi.ghaemi.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getFunction_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getParams();

	/**
	 * Returns the value of the '<em><b>Func Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Ref</em>' reference.
	 * @see #setFuncRef(FuncDefinition)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getFunction_FuncRef()
	 * @model required="true"
	 * @generated
	 */
	FuncDefinition getFuncRef();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.Function#getFuncRef <em>Func Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func Ref</em>' reference.
	 * @see #getFuncRef()
	 * @generated
	 */
	void setFuncRef(FuncDefinition value);

} // Function
