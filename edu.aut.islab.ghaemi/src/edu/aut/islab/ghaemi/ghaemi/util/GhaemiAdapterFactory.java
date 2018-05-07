/**
 */
package edu.aut.islab.ghaemi.ghaemi.util;

import edu.aut.islab.ghaemi.ghaemi.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage
 * @generated
 */
public class GhaemiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GhaemiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhaemiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GhaemiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GhaemiSwitch<Adapter> modelSwitch =
		new GhaemiSwitch<Adapter>() {
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseCallQuerySurface(CallQuerySurface object) {
				return createCallQuerySurfaceAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseSubtypes(Subtypes object) {
				return createSubtypesAdapter();
			}
			@Override
			public Adapter caseSurface(Surface object) {
				return createSurfaceAdapter();
			}
			@Override
			public Adapter caseQuerySurface(QuerySurface object) {
				return createQuerySurfaceAdapter();
			}
			@Override
			public Adapter caseInsertSurface(InsertSurface object) {
				return createInsertSurfaceAdapter();
			}
			@Override
			public Adapter caseUpdateSurface(UpdateSurface object) {
				return createUpdateSurfaceAdapter();
			}
			@Override
			public Adapter caseDeleteSurface(DeleteSurface object) {
				return createDeleteSurfaceAdapter();
			}
			@Override
			public Adapter caseRelationShip(RelationShip object) {
				return createRelationShipAdapter();
			}
			@Override
			public Adapter caseQueryConditionalInstalmnet(QueryConditionalInstalmnet object) {
				return createQueryConditionalInstalmnetAdapter();
			}
			@Override
			public Adapter caseQuerySelectInstalment(QuerySelectInstalment object) {
				return createQuerySelectInstalmentAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseConditionalOperator(ConditionalOperator object) {
				return createConditionalOperatorAdapter();
			}
			@Override
			public Adapter caseDisjunction(Disjunction object) {
				return createDisjunctionAdapter();
			}
			@Override
			public Adapter caseAbstractCondElement(AbstractCondElement object) {
				return createAbstractCondElementAdapter();
			}
			@Override
			public Adapter caseDisjunctionRelationship(DisjunctionRelationship object) {
				return createDisjunctionRelationshipAdapter();
			}
			@Override
			public Adapter caseFuncDefinition(FuncDefinition object) {
				return createFuncDefinitionAdapter();
			}
			@Override
			public Adapter caseOutputNode(OutputNode object) {
				return createOutputNodeAdapter();
			}
			@Override
			public Adapter caseOutputInstalment(OutputInstalment object) {
				return createOutputInstalmentAdapter();
			}
			@Override
			public Adapter caseInputInstalment(InputInstalment object) {
				return createInputInstalmentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.CallQuerySurface <em>Call Query Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.CallQuerySurface
	 * @generated
	 */
	public Adapter createCallQuerySurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.Subtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.Subtypes
	 * @generated
	 */
	public Adapter createSubtypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.Surface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.Surface
	 * @generated
	 */
	public Adapter createSurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface <em>Query Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.QuerySurface
	 * @generated
	 */
	public Adapter createQuerySurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.InsertSurface <em>Insert Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.InsertSurface
	 * @generated
	 */
	public Adapter createInsertSurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.UpdateSurface <em>Update Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.UpdateSurface
	 * @generated
	 */
	public Adapter createUpdateSurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.DeleteSurface <em>Delete Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.DeleteSurface
	 * @generated
	 */
	public Adapter createDeleteSurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.RelationShip <em>Relation Ship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.RelationShip
	 * @generated
	 */
	public Adapter createRelationShipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.QueryConditionalInstalmnet <em>Query Conditional Instalmnet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.QueryConditionalInstalmnet
	 * @generated
	 */
	public Adapter createQueryConditionalInstalmnetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.QuerySelectInstalment <em>Query Select Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.QuerySelectInstalment
	 * @generated
	 */
	public Adapter createQuerySelectInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.ConditionalOperator <em>Conditional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.ConditionalOperator
	 * @generated
	 */
	public Adapter createConditionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.Disjunction
	 * @generated
	 */
	public Adapter createDisjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.AbstractCondElement <em>Abstract Cond Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.AbstractCondElement
	 * @generated
	 */
	public Adapter createAbstractCondElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship <em>Disjunction Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship
	 * @generated
	 */
	public Adapter createDisjunctionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.FuncDefinition <em>Func Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.FuncDefinition
	 * @generated
	 */
	public Adapter createFuncDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.OutputNode <em>Output Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.OutputNode
	 * @generated
	 */
	public Adapter createOutputNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.OutputInstalment <em>Output Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.OutputInstalment
	 * @generated
	 */
	public Adapter createOutputInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.aut.islab.ghaemi.ghaemi.InputInstalment <em>Input Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.aut.islab.ghaemi.ghaemi.InputInstalment
	 * @generated
	 */
	public Adapter createInputInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GhaemiAdapterFactory
