/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Surface#getType <em>Type</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Surface#getFuncDefs <em>Func Defs</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getSurface()
 * @model abstract="true"
 * @generated
 */
public interface Surface extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.aut.islab.ghaemi.ghaemi.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getSurface_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getType();

	/**
	 * Returns the value of the '<em><b>Func Defs</b></em>' containment reference list.
	 * The list contents are of type {@link edu.aut.islab.ghaemi.ghaemi.FuncDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func Defs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Defs</em>' containment reference list.
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getSurface_FuncDefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<FuncDefinition> getFuncDefs();

} // Surface
