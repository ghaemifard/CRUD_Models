/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage
 * @generated
 */
public interface GhaemiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GhaemiFactory eINSTANCE = edu.aut.islab.ghaemi.ghaemi.impl.GhaemiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Call Query Surface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Query Surface</em>'.
	 * @generated
	 */
	CallQuerySurface createCallQuerySurface();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Subtypes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtypes</em>'.
	 * @generated
	 */
	Subtypes createSubtypes();

	/**
	 * Returns a new object of class '<em>Query Surface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Surface</em>'.
	 * @generated
	 */
	QuerySurface createQuerySurface();

	/**
	 * Returns a new object of class '<em>Insert Surface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert Surface</em>'.
	 * @generated
	 */
	InsertSurface createInsertSurface();

	/**
	 * Returns a new object of class '<em>Update Surface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Surface</em>'.
	 * @generated
	 */
	UpdateSurface createUpdateSurface();

	/**
	 * Returns a new object of class '<em>Delete Surface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Surface</em>'.
	 * @generated
	 */
	DeleteSurface createDeleteSurface();

	/**
	 * Returns a new object of class '<em>Relation Ship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Ship</em>'.
	 * @generated
	 */
	RelationShip createRelationShip();

	/**
	 * Returns a new object of class '<em>Query Conditional Instalmnet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Conditional Instalmnet</em>'.
	 * @generated
	 */
	QueryConditionalInstalmnet createQueryConditionalInstalmnet();

	/**
	 * Returns a new object of class '<em>Query Select Instalment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Select Instalment</em>'.
	 * @generated
	 */
	QuerySelectInstalment createQuerySelectInstalment();

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	Term createTerm();

	/**
	 * Returns a new object of class '<em>Conditional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Operator</em>'.
	 * @generated
	 */
	ConditionalOperator createConditionalOperator();

	/**
	 * Returns a new object of class '<em>Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disjunction</em>'.
	 * @generated
	 */
	Disjunction createDisjunction();

	/**
	 * Returns a new object of class '<em>Disjunction Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disjunction Relationship</em>'.
	 * @generated
	 */
	DisjunctionRelationship createDisjunctionRelationship();

	/**
	 * Returns a new object of class '<em>Func Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Func Definition</em>'.
	 * @generated
	 */
	FuncDefinition createFuncDefinition();

	/**
	 * Returns a new object of class '<em>Output Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Node</em>'.
	 * @generated
	 */
	OutputNode createOutputNode();

	/**
	 * Returns a new object of class '<em>Output Instalment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Instalment</em>'.
	 * @generated
	 */
	OutputInstalment createOutputInstalment();

	/**
	 * Returns a new object of class '<em>Input Instalment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Instalment</em>'.
	 * @generated
	 */
	InputInstalment createInputInstalment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GhaemiPackage getGhaemiPackage();

} //GhaemiFactory
