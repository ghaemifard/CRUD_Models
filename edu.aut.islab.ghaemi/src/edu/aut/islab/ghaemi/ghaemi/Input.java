/**
 */
package edu.aut.islab.ghaemi.ghaemi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Input#getName <em>Name</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Input#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends Node {
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
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getInput_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.Input#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getInput_Index()
	 * @model default="0"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.Input#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

} // Input
