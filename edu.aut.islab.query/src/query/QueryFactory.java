/**
 */
package query;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see query.QueryPackage
 * @generated
 */
public interface QueryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryFactory eINSTANCE = query.impl.QueryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Surface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surface</em>'.
	 * @generated
	 */
	QuerySurface createQuerySurface();

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
	 * Returns a new object of class '<em>Sort Instalment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sort Instalment</em>'.
	 * @generated
	 */
	SortInstalment createSortInstalment();

	/**
	 * Returns a new object of class '<em>Group Instalment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Instalment</em>'.
	 * @generated
	 */
	GroupInstalment createGroupInstalment();

	/**
	 * Returns a new object of class '<em>Where Instalment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Where Instalment</em>'.
	 * @generated
	 */
	WhereInstalment createWhereInstalment();

	/**
	 * Returns a new object of class '<em>Having Instalment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Having Instalment</em>'.
	 * @generated
	 */
	HavingInstalment createHavingInstalment();

	/**
	 * Returns a new object of class '<em>Innerjoin Rels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Innerjoin Rels</em>'.
	 * @generated
	 */
	InnerjoinRels createInnerjoinRels();

	/**
	 * Returns a new object of class '<em>Left Outer Join Rels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Outer Join Rels</em>'.
	 * @generated
	 */
	LeftOuterJoinRels createLeftOuterJoinRels();

	/**
	 * Returns a new object of class '<em>Right Outer Join Rels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Outer Join Rels</em>'.
	 * @generated
	 */
	RightOuterJoinRels createRightOuterJoinRels();

	/**
	 * Returns a new object of class '<em>Full Outer Join Rels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Full Outer Join Rels</em>'.
	 * @generated
	 */
	FullOuterJoinRels createFullOuterJoinRels();

	/**
	 * Returns a new object of class '<em>Field GPointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field GPointer</em>'.
	 * @generated
	 */
	FieldGPointer createFieldGPointer();

	/**
	 * Returns a new object of class '<em>Field SPointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field SPointer</em>'.
	 * @generated
	 */
	FieldSPointer createFieldSPointer();

	/**
	 * Returns a new object of class '<em>My Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Table</em>'.
	 * @generated
	 */
	MyTable createMyTable();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Literal</em>'.
	 * @generated
	 */
	NullLiteral createNullLiteral();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Function Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Def</em>'.
	 * @generated
	 */
	FunctionDef createFunctionDef();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>Input String Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input String Def</em>'.
	 * @generated
	 */
	InputStringDef createInputStringDef();

	/**
	 * Returns a new object of class '<em>Input Int Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Int Def</em>'.
	 * @generated
	 */
	InputIntDef createInputIntDef();

	/**
	 * Returns a new object of class '<em>Input Date Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Date Def</em>'.
	 * @generated
	 */
	InputDateDef createInputDateDef();

	/**
	 * Returns a new object of class '<em>Input Bits Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Bits Def</em>'.
	 * @generated
	 */
	InputBitsDef createInputBitsDef();

	/**
	 * Returns a new object of class '<em>Input Float Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Float Def</em>'.
	 * @generated
	 */
	InputFloatDef createInputFloatDef();

	/**
	 * Returns a new object of class '<em>Call Query Surface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Query Surface</em>'.
	 * @generated
	 */
	CallQuerySurface createCallQuerySurface();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Subtype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtype</em>'.
	 * @generated
	 */
	Subtype createSubtype();

	/**
	 * Returns a new object of class '<em>Junction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Junction</em>'.
	 * @generated
	 */
	Junction createJunction();

	/**
	 * Returns a new object of class '<em>Root Junction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Junction</em>'.
	 * @generated
	 */
	RootJunction createRootJunction();

	/**
	 * Returns a new object of class '<em>Junc Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Junc Relationship</em>'.
	 * @generated
	 */
	JuncRelationship createJuncRelationship();

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	Term createTerm();

	/**
	 * Returns a new object of class '<em>Equal Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal Link</em>'.
	 * @generated
	 */
	EqualLink createEqualLink();

	/**
	 * Returns a new object of class '<em>Greater Than Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than Link</em>'.
	 * @generated
	 */
	GreaterThanLink createGreaterThanLink();

	/**
	 * Returns a new object of class '<em>Greater Equal Than Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Equal Than Link</em>'.
	 * @generated
	 */
	GreaterEqualThanLink createGreaterEqualThanLink();

	/**
	 * Returns a new object of class '<em>Lower Than Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lower Than Link</em>'.
	 * @generated
	 */
	LowerThanLink createLowerThanLink();

	/**
	 * Returns a new object of class '<em>Lower Equal Than Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lower Equal Than Link</em>'.
	 * @generated
	 */
	LowerEqualThanLink createLowerEqualThanLink();

	/**
	 * Returns a new object of class '<em>In Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Link</em>'.
	 * @generated
	 */
	InLink createInLink();

	/**
	 * Returns a new object of class '<em>Like Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Like Link</em>'.
	 * @generated
	 */
	LikeLink createLikeLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QueryPackage getQueryPackage();

} //QueryFactory
