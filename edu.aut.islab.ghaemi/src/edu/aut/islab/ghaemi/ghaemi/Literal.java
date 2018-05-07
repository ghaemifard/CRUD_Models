/**
 */
package edu.aut.islab.ghaemi.ghaemi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Literal#getConstantValue <em>Constant Value</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends Node {
	/**
	 * Returns the value of the '<em><b>Constant Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Value</em>' attribute.
	 * @see #setConstantValue(String)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getLiteral_ConstantValue()
	 * @model
	 * @generated
	 */
	String getConstantValue();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.Literal#getConstantValue <em>Constant Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Value</em>' attribute.
	 * @see #getConstantValue()
	 * @generated
	 */
	void setConstantValue(String value);

} // Literal
