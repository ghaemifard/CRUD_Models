/**
 */
package edu.aut.islab.ghaemi.ghaemi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Term#getOperand_one <em>Operand one</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Term#getOperand_two <em>Operand two</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.Term#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends AbstractCondElement {
	/**
	 * Returns the value of the '<em><b>Operand one</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand one</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand one</em>' reference.
	 * @see #setOperand_one(Node)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getTerm_Operand_one()
	 * @model required="true"
	 * @generated
	 */
	Node getOperand_one();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.Term#getOperand_one <em>Operand one</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand one</em>' reference.
	 * @see #getOperand_one()
	 * @generated
	 */
	void setOperand_one(Node value);

	/**
	 * Returns the value of the '<em><b>Operand two</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand two</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand two</em>' reference.
	 * @see #setOperand_two(Node)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getTerm_Operand_two()
	 * @model
	 * @generated
	 */
	Node getOperand_two();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.Term#getOperand_two <em>Operand two</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand two</em>' reference.
	 * @see #getOperand_two()
	 * @generated
	 */
	void setOperand_two(Node value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' reference.
	 * @see #setOperator(ConditionalOperator)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getTerm_Operator()
	 * @model required="true"
	 * @generated
	 */
	ConditionalOperator getOperator();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.Term#getOperator <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ConditionalOperator value);

} // Term
