/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Instalment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.OutputInstalment#getOutputnode <em>Outputnode</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getOutputInstalment()
 * @model
 * @generated
 */
public interface OutputInstalment extends EObject {
	/**
	 * Returns the value of the '<em><b>Outputnode</b></em>' containment reference list.
	 * The list contents are of type {@link edu.aut.islab.ghaemi.ghaemi.OutputNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputnode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputnode</em>' containment reference list.
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getOutputInstalment_Outputnode()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputNode> getOutputnode();

} // OutputInstalment
