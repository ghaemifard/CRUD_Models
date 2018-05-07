/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.ConditionalOperator#getType <em>Type</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.ConditionalOperator#isNegative <em>Negative</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getConditionalOperator()
 * @model
 * @generated
 */
public interface ConditionalOperator extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.aut.islab.ghaemi.ghaemi.OperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.aut.islab.ghaemi.ghaemi.OperatorType
	 * @see #setType(OperatorType)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getConditionalOperator_Type()
	 * @model
	 * @generated
	 */
	OperatorType getType();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.ConditionalOperator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.aut.islab.ghaemi.ghaemi.OperatorType
	 * @see #getType()
	 * @generated
	 */
	void setType(OperatorType value);

	/**
	 * Returns the value of the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative</em>' attribute.
	 * @see #setNegative(boolean)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getConditionalOperator_Negative()
	 * @model
	 * @generated
	 */
	boolean isNegative();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.ConditionalOperator#isNegative <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative</em>' attribute.
	 * @see #isNegative()
	 * @generated
	 */
	void setNegative(boolean value);

} // ConditionalOperator
