/**
 */
package query;

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
 *   <li>{@link query.Function#getName <em>Name</em>}</li>
 *   <li>{@link query.Function#getFuncDef <em>Func Def</em>}</li>
 *   <li>{@link query.Function#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getFunction()
 * @model annotation="gmf.node label='name,column_name' label.pattern='{0} {1}'"
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
	 * @see query.QueryPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link query.Function#getName <em>Name</em>}' attribute.
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
	 * @see query.QueryPackage#getFunction_FuncDef()
	 * @model required="true"
	 * @generated
	 */
	FunctionDef getFuncDef();

	/**
	 * Sets the value of the '{@link query.Function#getFuncDef <em>Func Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func Def</em>' reference.
	 * @see #getFuncDef()
	 * @generated
	 */
	void setFuncDef(FunctionDef value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link query.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see query.QueryPackage#getFunction_Params()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Node> getParams();

} // Function
