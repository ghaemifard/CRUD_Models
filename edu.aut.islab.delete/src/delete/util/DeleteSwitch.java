/**
 */
package delete.util;

import delete.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see delete.DeletePackage
 * @generated
 */
public class DeleteSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeletePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteSwitch() {
		if (modelPackage == null) {
			modelPackage = DeletePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DeletePackage.DELETE_SURFACE: {
				DeleteSurface deleteSurface = (DeleteSurface)theEObject;
				T result = caseDeleteSurface(deleteSurface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.CONDITION_INSTALMENT: {
				ConditionInstalment conditionInstalment = (ConditionInstalment)theEObject;
				T result = caseConditionInstalment(conditionInstalment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.DUMMY: {
				Dummy dummy = (Dummy)theEObject;
				T result = caseDummy(dummy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.TABLE_LIST_INSTALMENT: {
				TableListInstalment tableListInstalment = (TableListInstalment)theEObject;
				T result = caseTableListInstalment(tableListInstalment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.RELATION_SELECT: {
				RelationSelect relationSelect = (RelationSelect)theEObject;
				T result = caseRelationSelect(relationSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.INNERJOIN_RELS: {
				InnerjoinRels innerjoinRels = (InnerjoinRels)theEObject;
				T result = caseInnerjoinRels(innerjoinRels);
				if (result == null) result = caseRelationSelect(innerjoinRels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.LEFT_OUTER_JOIN_RELS: {
				LeftOuterJoinRels leftOuterJoinRels = (LeftOuterJoinRels)theEObject;
				T result = caseLeftOuterJoinRels(leftOuterJoinRels);
				if (result == null) result = caseRelationSelect(leftOuterJoinRels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.RIGHT_OUTER_JOIN_RELS: {
				RightOuterJoinRels rightOuterJoinRels = (RightOuterJoinRels)theEObject;
				T result = caseRightOuterJoinRels(rightOuterJoinRels);
				if (result == null) result = caseRelationSelect(rightOuterJoinRels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.FULL_OUTER_JOIN_RELS: {
				FullOuterJoinRels fullOuterJoinRels = (FullOuterJoinRels)theEObject;
				T result = caseFullOuterJoinRels(fullOuterJoinRels);
				if (result == null) result = caseRelationSelect(fullOuterJoinRels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.INPUT_INSTALMENT: {
				InputInstalment inputInstalment = (InputInstalment)theEObject;
				T result = caseInputInstalment(inputInstalment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.SORT_INSTALMENT: {
				SortInstalment sortInstalment = (SortInstalment)theEObject;
				T result = caseSortInstalment(sortInstalment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.FIELD_SPOINTER: {
				FieldSPointer fieldSPointer = (FieldSPointer)theEObject;
				T result = caseFieldSPointer(fieldSPointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.ABSTRACT_NODE: {
				AbstractNode abstractNode = (AbstractNode)theEObject;
				T result = caseAbstractNode(abstractNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.MY_TABLE: {
				MyTable myTable = (MyTable)theEObject;
				T result = caseMyTable(myTable);
				if (result == null) result = caseAbstractNode(myTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseAbstractNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseNode(field);
				if (result == null) result = caseAbstractNode(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseNode(literal);
				if (result == null) result = caseAbstractNode(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.NULL_LITERAL: {
				NullLiteral nullLiteral = (NullLiteral)theEObject;
				T result = caseNullLiteral(nullLiteral);
				if (result == null) result = caseNode(nullLiteral);
				if (result == null) result = caseAbstractNode(nullLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseNode(function);
				if (result == null) result = caseAbstractNode(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.FUNCTION_DEF: {
				FunctionDef functionDef = (FunctionDef)theEObject;
				T result = caseFunctionDef(functionDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = caseNode(input);
				if (result == null) result = caseAbstractNode(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.INPUT_DEF: {
				InputDef inputDef = (InputDef)theEObject;
				T result = caseInputDef(inputDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.INPUT_STRING_DEF: {
				InputStringDef inputStringDef = (InputStringDef)theEObject;
				T result = caseInputStringDef(inputStringDef);
				if (result == null) result = caseInputDef(inputStringDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.INPUT_INT_DEF: {
				InputIntDef inputIntDef = (InputIntDef)theEObject;
				T result = caseInputIntDef(inputIntDef);
				if (result == null) result = caseInputDef(inputIntDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.INPUT_DATE_DEF: {
				InputDateDef inputDateDef = (InputDateDef)theEObject;
				T result = caseInputDateDef(inputDateDef);
				if (result == null) result = caseInputDef(inputDateDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.INPUT_BITS_DEF: {
				InputBitsDef inputBitsDef = (InputBitsDef)theEObject;
				T result = caseInputBitsDef(inputBitsDef);
				if (result == null) result = caseInputDef(inputBitsDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.INPUT_FLOAT_DEF: {
				InputFloatDef inputFloatDef = (InputFloatDef)theEObject;
				T result = caseInputFloatDef(inputFloatDef);
				if (result == null) result = caseInputDef(inputFloatDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.CALL_SURFACE_QUERY: {
				CallSurfaceQuery callSurfaceQuery = (CallSurfaceQuery)theEObject;
				T result = caseCallSurfaceQuery(callSurfaceQuery);
				if (result == null) result = caseFunction(callSurfaceQuery);
				if (result == null) result = caseNode(callSurfaceQuery);
				if (result == null) result = caseAbstractNode(callSurfaceQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.SUBTYPE: {
				Subtype subtype = (Subtype)theEObject;
				T result = caseSubtype(subtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.ABSTRACT_CONDITION_ELEMENT: {
				AbstractConditionElement abstractConditionElement = (AbstractConditionElement)theEObject;
				T result = caseAbstractConditionElement(abstractConditionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.JUNCTION: {
				Junction junction = (Junction)theEObject;
				T result = caseJunction(junction);
				if (result == null) result = caseAbstractConditionElement(junction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.ROOT_JUNCTION: {
				RootJunction rootJunction = (RootJunction)theEObject;
				T result = caseRootJunction(rootJunction);
				if (result == null) result = caseJunction(rootJunction);
				if (result == null) result = caseAbstractConditionElement(rootJunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.JUNC_RELATIONSHIP: {
				JuncRelationship juncRelationship = (JuncRelationship)theEObject;
				T result = caseJuncRelationship(juncRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseAbstractConditionElement(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.CONDITION_LINK: {
				ConditionLink conditionLink = (ConditionLink)theEObject;
				T result = caseConditionLink(conditionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.EQUAL_LINK: {
				EqualLink equalLink = (EqualLink)theEObject;
				T result = caseEqualLink(equalLink);
				if (result == null) result = caseConditionLink(equalLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.GREATER_THAN_LINK: {
				GreaterThanLink greaterThanLink = (GreaterThanLink)theEObject;
				T result = caseGreaterThanLink(greaterThanLink);
				if (result == null) result = caseConditionLink(greaterThanLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.GREATER_EQUAL_THAN_LINK: {
				GreaterEqualThanLink greaterEqualThanLink = (GreaterEqualThanLink)theEObject;
				T result = caseGreaterEqualThanLink(greaterEqualThanLink);
				if (result == null) result = caseConditionLink(greaterEqualThanLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.LOWER_THAN_LINK: {
				LowerThanLink lowerThanLink = (LowerThanLink)theEObject;
				T result = caseLowerThanLink(lowerThanLink);
				if (result == null) result = caseConditionLink(lowerThanLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.LOWER_EQUAL_THAN_LINK: {
				LowerEqualThanLink lowerEqualThanLink = (LowerEqualThanLink)theEObject;
				T result = caseLowerEqualThanLink(lowerEqualThanLink);
				if (result == null) result = caseConditionLink(lowerEqualThanLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.IN_LINK: {
				InLink inLink = (InLink)theEObject;
				T result = caseInLink(inLink);
				if (result == null) result = caseConditionLink(inLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeletePackage.LIKE_LINK: {
				LikeLink likeLink = (LikeLink)theEObject;
				T result = caseLikeLink(likeLink);
				if (result == null) result = caseConditionLink(likeLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteSurface(DeleteSurface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Instalment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Instalment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionInstalment(ConditionInstalment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dummy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dummy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDummy(Dummy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table List Instalment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table List Instalment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableListInstalment(TableListInstalment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationSelect(RelationSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Innerjoin Rels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Innerjoin Rels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInnerjoinRels(InnerjoinRels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Outer Join Rels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Outer Join Rels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftOuterJoinRels(LeftOuterJoinRels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Outer Join Rels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Outer Join Rels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightOuterJoinRels(RightOuterJoinRels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full Outer Join Rels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full Outer Join Rels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFullOuterJoinRels(FullOuterJoinRels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Instalment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Instalment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputInstalment(InputInstalment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Instalment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Instalment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortInstalment(SortInstalment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field SPointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field SPointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldSPointer(FieldSPointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNode(AbstractNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>My Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>My Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMyTable(MyTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullLiteral(NullLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDef(FunctionDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputDef(InputDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input String Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input String Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputStringDef(InputStringDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Int Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Int Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputIntDef(InputIntDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Date Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Date Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputDateDef(InputDateDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Bits Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Bits Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputBitsDef(InputBitsDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Float Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Float Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputFloatDef(InputFloatDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Surface Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Surface Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallSurfaceQuery(CallSurfaceQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtype(Subtype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Condition Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Condition Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConditionElement(AbstractConditionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJunction(Junction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootJunction(RootJunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Junc Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Junc Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJuncRelationship(JuncRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionLink(ConditionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualLink(EqualLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanLink(GreaterThanLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Equal Than Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Equal Than Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterEqualThanLink(GreaterEqualThanLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Than Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Than Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowerThanLink(LowerThanLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Equal Than Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Equal Than Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowerEqualThanLink(LowerEqualThanLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInLink(InLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Like Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Like Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLikeLink(LikeLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DeleteSwitch
