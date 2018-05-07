/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Conditional Instalmnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.QueryConditionalInstalmnet#getDisjunctionrelationships <em>Disjunctionrelationships</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.QueryConditionalInstalmnet#getDisjunctions <em>Disjunctions</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getQueryConditionalInstalmnet()
 * @model
 * @generated
 */
public interface QueryConditionalInstalmnet extends EObject {
	/**
	 * Returns the value of the '<em><b>Disjunctionrelationships</b></em>' containment reference list.
	 * The list contents are of type {@link edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjunctionrelationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjunctionrelationships</em>' containment reference list.
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getQueryConditionalInstalmnet_Disjunctionrelationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<DisjunctionRelationship> getDisjunctionrelationships();

	/**
	 * Returns the value of the '<em><b>Disjunctions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.aut.islab.ghaemi.ghaemi.Disjunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjunctions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjunctions</em>' containment reference list.
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getQueryConditionalInstalmnet_Disjunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Disjunction> getDisjunctions();

} // QueryConditionalInstalmnet
