/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Disjunction#getType <em>Type</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Disjunction#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getDisjunction()
 * @model
 * @generated
 */
public interface Disjunction extends AbstractCondElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.aut.islab.ghaemi.ghaemi.DisjuncType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.aut.islab.ghaemi.ghaemi.DisjuncType
	 * @see #setType(DisjuncType)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getDisjunction_Type()
	 * @model
	 * @generated
	 */
	DisjuncType getType();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.Disjunction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.aut.islab.ghaemi.ghaemi.DisjuncType
	 * @see #getType()
	 * @generated
	 */
	void setType(DisjuncType value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getDisjunction_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DisjunctionRelationship> getRelations();

} // Disjunction
