/**
 */
package query.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import query.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see query.QueryPackage
 * @generated
 */
public class QueryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QueryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QueryPackage.eINSTANCE;
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
	protected QuerySwitch<Adapter> modelSwitch =
		new QuerySwitch<Adapter>() {
			@Override
			public Adapter caseQuerySurface(QuerySurface object) {
				return createQuerySurfaceAdapter();
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
			public Adapter caseSortInstalment(SortInstalment object) {
				return createSortInstalmentAdapter();
			}
			@Override
			public Adapter caseGroupInstalment(GroupInstalment object) {
				return createGroupInstalmentAdapter();
			}
			@Override
			public Adapter caseConditionInstalment(ConditionInstalment object) {
				return createConditionInstalmentAdapter();
			}
			@Override
			public Adapter caseWhereInstalment(WhereInstalment object) {
				return createWhereInstalmentAdapter();
			}
			@Override
			public Adapter caseHavingInstalment(HavingInstalment object) {
				return createHavingInstalmentAdapter();
			}
			@Override
			public Adapter caseRelationSelect(RelationSelect object) {
				return createRelationSelectAdapter();
			}
			@Override
			public Adapter caseInnerjoinRels(InnerjoinRels object) {
				return createInnerjoinRelsAdapter();
			}
			@Override
			public Adapter caseLeftOuterJoinRels(LeftOuterJoinRels object) {
				return createLeftOuterJoinRelsAdapter();
			}
			@Override
			public Adapter caseRightOuterJoinRels(RightOuterJoinRels object) {
				return createRightOuterJoinRelsAdapter();
			}
			@Override
			public Adapter caseFullOuterJoinRels(FullOuterJoinRels object) {
				return createFullOuterJoinRelsAdapter();
			}
			@Override
			public Adapter caseAbstractNode(AbstractNode object) {
				return createAbstractNodeAdapter();
			}
			@Override
			public Adapter caseFieldGPointer(FieldGPointer object) {
				return createFieldGPointerAdapter();
			}
			@Override
			public Adapter caseFieldSPointer(FieldSPointer object) {
				return createFieldSPointerAdapter();
			}
			@Override
			public Adapter caseMyTable(MyTable object) {
				return createMyTableAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseNullLiteral(NullLiteral object) {
				return createNullLiteralAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseFunctionDef(FunctionDef object) {
				return createFunctionDefAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseInputDef(InputDef object) {
				return createInputDefAdapter();
			}
			@Override
			public Adapter caseInputStringDef(InputStringDef object) {
				return createInputStringDefAdapter();
			}
			@Override
			public Adapter caseInputIntDef(InputIntDef object) {
				return createInputIntDefAdapter();
			}
			@Override
			public Adapter caseInputDateDef(InputDateDef object) {
				return createInputDateDefAdapter();
			}
			@Override
			public Adapter caseInputBitsDef(InputBitsDef object) {
				return createInputBitsDefAdapter();
			}
			@Override
			public Adapter caseInputFloatDef(InputFloatDef object) {
				return createInputFloatDefAdapter();
			}
			@Override
			public Adapter caseCallQuerySurface(CallQuerySurface object) {
				return createCallQuerySurfaceAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseSubtype(Subtype object) {
				return createSubtypeAdapter();
			}
			@Override
			public Adapter caseAbstractConditionElement(AbstractConditionElement object) {
				return createAbstractConditionElementAdapter();
			}
			@Override
			public Adapter caseJunction(Junction object) {
				return createJunctionAdapter();
			}
			@Override
			public Adapter caseRootJunction(RootJunction object) {
				return createRootJunctionAdapter();
			}
			@Override
			public Adapter caseJuncRelationship(JuncRelationship object) {
				return createJuncRelationshipAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseConditionLink(ConditionLink object) {
				return createConditionLinkAdapter();
			}
			@Override
			public Adapter caseEqualLink(EqualLink object) {
				return createEqualLinkAdapter();
			}
			@Override
			public Adapter caseGreaterThanLink(GreaterThanLink object) {
				return createGreaterThanLinkAdapter();
			}
			@Override
			public Adapter caseGreaterEqualThanLink(GreaterEqualThanLink object) {
				return createGreaterEqualThanLinkAdapter();
			}
			@Override
			public Adapter caseLowerThanLink(LowerThanLink object) {
				return createLowerThanLinkAdapter();
			}
			@Override
			public Adapter caseLowerEqualThanLink(LowerEqualThanLink object) {
				return createLowerEqualThanLinkAdapter();
			}
			@Override
			public Adapter caseInLink(InLink object) {
				return createInLinkAdapter();
			}
			@Override
			public Adapter caseLikeLink(LikeLink object) {
				return createLikeLinkAdapter();
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
	 * Creates a new adapter for an object of class '{@link query.QuerySurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.QuerySurface
	 * @generated
	 */
	public Adapter createQuerySurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.OutputInstalment <em>Output Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.OutputInstalment
	 * @generated
	 */
	public Adapter createOutputInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.InputInstalment <em>Input Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.InputInstalment
	 * @generated
	 */
	public Adapter createInputInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.SortInstalment <em>Sort Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.SortInstalment
	 * @generated
	 */
	public Adapter createSortInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.GroupInstalment <em>Group Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.GroupInstalment
	 * @generated
	 */
	public Adapter createGroupInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.ConditionInstalment <em>Condition Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.ConditionInstalment
	 * @generated
	 */
	public Adapter createConditionInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.WhereInstalment <em>Where Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.WhereInstalment
	 * @generated
	 */
	public Adapter createWhereInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.HavingInstalment <em>Having Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.HavingInstalment
	 * @generated
	 */
	public Adapter createHavingInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.RelationSelect <em>Relation Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.RelationSelect
	 * @generated
	 */
	public Adapter createRelationSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.InnerjoinRels <em>Innerjoin Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.InnerjoinRels
	 * @generated
	 */
	public Adapter createInnerjoinRelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.LeftOuterJoinRels <em>Left Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.LeftOuterJoinRels
	 * @generated
	 */
	public Adapter createLeftOuterJoinRelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.RightOuterJoinRels <em>Right Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.RightOuterJoinRels
	 * @generated
	 */
	public Adapter createRightOuterJoinRelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.FullOuterJoinRels <em>Full Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.FullOuterJoinRels
	 * @generated
	 */
	public Adapter createFullOuterJoinRelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.AbstractNode
	 * @generated
	 */
	public Adapter createAbstractNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.FieldGPointer <em>Field GPointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.FieldGPointer
	 * @generated
	 */
	public Adapter createFieldGPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.FieldSPointer <em>Field SPointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.FieldSPointer
	 * @generated
	 */
	public Adapter createFieldSPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.MyTable <em>My Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.MyTable
	 * @generated
	 */
	public Adapter createMyTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.NullLiteral
	 * @generated
	 */
	public Adapter createNullLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.FunctionDef <em>Function Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.FunctionDef
	 * @generated
	 */
	public Adapter createFunctionDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.InputDef <em>Input Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.InputDef
	 * @generated
	 */
	public Adapter createInputDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.InputStringDef <em>Input String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.InputStringDef
	 * @generated
	 */
	public Adapter createInputStringDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.InputIntDef <em>Input Int Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.InputIntDef
	 * @generated
	 */
	public Adapter createInputIntDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.InputDateDef <em>Input Date Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.InputDateDef
	 * @generated
	 */
	public Adapter createInputDateDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.InputBitsDef <em>Input Bits Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.InputBitsDef
	 * @generated
	 */
	public Adapter createInputBitsDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.InputFloatDef <em>Input Float Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.InputFloatDef
	 * @generated
	 */
	public Adapter createInputFloatDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.CallQuerySurface <em>Call Query Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.CallQuerySurface
	 * @generated
	 */
	public Adapter createCallQuerySurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.Subtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.Subtype
	 * @generated
	 */
	public Adapter createSubtypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.AbstractConditionElement <em>Abstract Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.AbstractConditionElement
	 * @generated
	 */
	public Adapter createAbstractConditionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.Junction
	 * @generated
	 */
	public Adapter createJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.RootJunction <em>Root Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.RootJunction
	 * @generated
	 */
	public Adapter createRootJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.JuncRelationship <em>Junc Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.JuncRelationship
	 * @generated
	 */
	public Adapter createJuncRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.ConditionLink <em>Condition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.ConditionLink
	 * @generated
	 */
	public Adapter createConditionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.EqualLink <em>Equal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.EqualLink
	 * @generated
	 */
	public Adapter createEqualLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.GreaterThanLink <em>Greater Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.GreaterThanLink
	 * @generated
	 */
	public Adapter createGreaterThanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.GreaterEqualThanLink <em>Greater Equal Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.GreaterEqualThanLink
	 * @generated
	 */
	public Adapter createGreaterEqualThanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.LowerThanLink <em>Lower Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.LowerThanLink
	 * @generated
	 */
	public Adapter createLowerThanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.LowerEqualThanLink <em>Lower Equal Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.LowerEqualThanLink
	 * @generated
	 */
	public Adapter createLowerEqualThanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.InLink <em>In Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.InLink
	 * @generated
	 */
	public Adapter createInLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link query.LikeLink <em>Like Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see query.LikeLink
	 * @generated
	 */
	public Adapter createLikeLinkAdapter() {
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

} //QueryAdapterFactory
