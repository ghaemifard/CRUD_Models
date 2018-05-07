/**
 */
package delete;

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
 *   <li>{@link delete.Function#getName <em>Name</em>}</li>
 *   <li>{@link delete.Function#getFuncDef <em>Func Def</em>}</li>
 *   <li>{@link delete.Function#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getFunction()
 * @model annotation="gmf.node label='name' label.pattern='{0}'"
 * @generated
 */
public interface Function extends Node {
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
	 * @see delete.DeletePackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link delete.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Func Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Def</em>' reference.
	 * @see #setFuncDef(FunctionDef)
	 * @see delete.DeletePackage#getFunction_FuncDef()
	 * @model required="true"
	 * @generated
	 */
	FunctionDef getFuncDef();

	/**
	 * Sets the value of the '{@link delete.Function#getFuncDef <em>Func Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func Def</em>' reference.
	 * @see #getFuncDef()
	 * @generated
	 */
	void setFuncDef(FunctionDef value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link delete.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see delete.DeletePackage#getFunction_Params()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Node> getParams();

} // Function
