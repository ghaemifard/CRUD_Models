/**
 */
package edu.aut.islab.ghaemi.ghaemi.util;

import edu.aut.islab.ghaemi.ghaemi.*;

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
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage
 * @generated
 */
public class GhaemiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GhaemiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhaemiSwitch() {
		if (modelPackage == null) {
			modelPackage = GhaemiPackage.eINSTANCE;
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
			case GhaemiPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseNode(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseNode(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseNode(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.CALL_QUERY_SURFACE: {
				CallQuerySurface callQuerySurface = (CallQuerySurface)theEObject;
				T result = caseCallQuerySurface(callQuerySurface);
				if (result == null) result = caseFunction(callQuerySurface);
				if (result == null) result = caseNode(callQuerySurface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = caseNode(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.SUBTYPES: {
				Subtypes subtypes = (Subtypes)theEObject;
				T result = caseSubtypes(subtypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.SURFACE: {
				Surface surface = (Surface)theEObject;
				T result = caseSurface(surface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.QUERY_SURFACE: {
				QuerySurface querySurface = (QuerySurface)theEObject;
				T result = caseQuerySurface(querySurface);
				if (result == null) result = caseSurface(querySurface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.INSERT_SURFACE: {
				InsertSurface insertSurface = (InsertSurface)theEObject;
				T result = caseInsertSurface(insertSurface);
				if (result == null) result = caseSurface(insertSurface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.UPDATE_SURFACE: {
				UpdateSurface updateSurface = (UpdateSurface)theEObject;
				T result = caseUpdateSurface(updateSurface);
				if (result == null) result = caseSurface(updateSurface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.DELETE_SURFACE: {
				DeleteSurface deleteSurface = (DeleteSurface)theEObject;
				T result = caseDeleteSurface(deleteSurface);
				if (result == null) result = caseSurface(deleteSurface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.RELATION_SHIP: {
				RelationShip relationShip = (RelationShip)theEObject;
				T result = caseRelationShip(relationShip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET: {
				QueryConditionalInstalmnet queryConditionalInstalmnet = (QueryConditionalInstalmnet)theEObject;
				T result = caseQueryConditionalInstalmnet(queryConditionalInstalmnet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.QUERY_SELECT_INSTALMENT: {
				QuerySelectInstalment querySelectInstalment = (QuerySelectInstalment)theEObject;
				T result = caseQuerySelectInstalment(querySelectInstalment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseAbstractCondElement(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.CONDITIONAL_OPERATOR: {
				ConditionalOperator conditionalOperator = (ConditionalOperator)theEObject;
				T result = caseConditionalOperator(conditionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.DISJUNCTION: {
				Disjunction disjunction = (Disjunction)theEObject;
				T result = caseDisjunction(disjunction);
				if (result == null) result = caseAbstractCondElement(disjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.ABSTRACT_COND_ELEMENT: {
				AbstractCondElement abstractCondElement = (AbstractCondElement)theEObject;
				T result = caseAbstractCondElement(abstractCondElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.DISJUNCTION_RELATIONSHIP: {
				DisjunctionRelationship disjunctionRelationship = (DisjunctionRelationship)theEObject;
				T result = caseDisjunctionRelationship(disjunctionRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.FUNC_DEFINITION: {
				FuncDefinition funcDefinition = (FuncDefinition)theEObject;
				T result = caseFuncDefinition(funcDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.OUTPUT_NODE: {
				OutputNode outputNode = (OutputNode)theEObject;
				T result = caseOutputNode(outputNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.OUTPUT_INSTALMENT: {
				OutputInstalment outputInstalment = (OutputInstalment)theEObject;
				T result = caseOutputInstalment(outputInstalment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GhaemiPackage.INPUT_INSTALMENT: {
				InputInstalment inputInstalment = (InputInstalment)theEObject;
				T result = caseInputInstalment(inputInstalment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Call Query Surface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Query Surface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallQuerySurface(CallQuerySurface object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Subtypes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtypes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtypes(Subtypes object) {
		return null;
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
	public T caseSurface(Surface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Surface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Surface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuerySurface(QuerySurface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert Surface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert Surface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertSurface(InsertSurface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Surface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Surface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateSurface(UpdateSurface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Surface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Surface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteSurface(DeleteSurface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Ship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Ship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationShip(RelationShip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Conditional Instalmnet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Conditional Instalmnet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryConditionalInstalmnet(QueryConditionalInstalmnet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Select Instalment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Select Instalment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuerySelectInstalment(QuerySelectInstalment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalOperator(ConditionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjunction(Disjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Cond Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Cond Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCondElement(AbstractCondElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjunction Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjunction Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjunctionRelationship(DisjunctionRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Func Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Func Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncDefinition(FuncDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputNode(OutputNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Instalment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Instalment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputInstalment(OutputInstalment object) {
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

} //GhaemiSwitch
