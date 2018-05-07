/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.FuncDefinition#getRetType <em>Ret Type</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.FuncDefinition#getParams <em>Params</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.FuncDefinition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getFuncDefinition()
 * @model
 * @generated
 */
public interface FuncDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Ret Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ret Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ret Type</em>' reference.
	 * @see #setRetType(Subtypes)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getFuncDefinition_RetType()
	 * @model required="true"
	 * @generated
	 */
	Subtypes getRetType();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.FuncDefinition#getRetType <em>Ret Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ret Type</em>' reference.
	 * @see #getRetType()
	 * @generated
	 */
	void setRetType(Subtypes value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link edu.aut.islab.ghaemi.ghaemi.Subtypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getFuncDefinition_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subtypes> getParams();

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
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getFuncDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.FuncDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FuncDefinition
