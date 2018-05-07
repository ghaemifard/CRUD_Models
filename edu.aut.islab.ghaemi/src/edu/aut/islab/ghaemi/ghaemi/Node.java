/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Node#getType <em>Type</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Node#getSubtypes <em>Subtypes</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Node#getID <em>ID</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Node#isAsOutput <em>As Output</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getNode_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.Node#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Subtypes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtypes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtypes</em>' reference.
	 * @see #setSubtypes(Subtypes)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getNode_Subtypes()
	 * @model required="true"
	 * @generated
	 */
	Subtypes getSubtypes();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.Node#getSubtypes <em>Subtypes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtypes</em>' reference.
	 * @see #getSubtypes()
	 * @generated
	 */
	void setSubtypes(Subtypes value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getNode_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.Node#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>As Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Output</em>' attribute.
	 * @see #setAsOutput(boolean)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getNode_AsOutput()
	 * @model
	 * @generated
	 */
	boolean isAsOutput();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.Node#isAsOutput <em>As Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Output</em>' attribute.
	 * @see #isAsOutput()
	 * @generated
	 */
	void setAsOutput(boolean value);

} // Node
