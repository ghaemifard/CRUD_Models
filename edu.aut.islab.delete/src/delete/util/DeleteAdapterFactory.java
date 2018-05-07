/**
 */
package delete.util;

import delete.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see delete.DeletePackage
 * @generated
 */
public class DeleteAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeletePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DeletePackage.eINSTANCE;
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
	protected DeleteSwitch<Adapter> modelSwitch =
		new DeleteSwitch<Adapter>() {
			@Override
			public Adapter caseDeleteSurface(DeleteSurface object) {
				return createDeleteSurfaceAdapter();
			}
			@Override
			public Adapter caseConditionInstalment(ConditionInstalment object) {
				return createConditionInstalmentAdapter();
			}
			@Override
			public Adapter caseDummy(Dummy object) {
				return createDummyAdapter();
			}
			@Override
			public Adapter caseTableListInstalment(TableListInstalment object) {
				return createTableListInstalmentAdapter();
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
			public Adapter caseInputInstalment(InputInstalment object) {
				return createInputInstalmentAdapter();
			}
			@Override
			public Adapter caseSortInstalment(SortInstalment object) {
				return createSortInstalmentAdapter();
			}
			@Override
			public Adapter caseFieldSPointer(FieldSPointer object) {
				return createFieldSPointerAdapter();
			}
			@Override
			public Adapter caseAbstractNode(AbstractNode object) {
				return createAbstractNodeAdapter();
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
			public Adapter caseCallSurfaceQuery(CallSurfaceQuery object) {
				return createCallSurfaceQueryAdapter();
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
	 * Creates a new adapter for an object of class '{@link delete.DeleteSurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.DeleteSurface
	 * @generated
	 */
	public Adapter createDeleteSurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.ConditionInstalment <em>Condition Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.ConditionInstalment
	 * @generated
	 */
	public Adapter createConditionInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.Dummy <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.Dummy
	 * @generated
	 */
	public Adapter createDummyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.TableListInstalment <em>Table List Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.TableListInstalment
	 * @generated
	 */
	public Adapter createTableListInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.RelationSelect <em>Relation Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.RelationSelect
	 * @generated
	 */
	public Adapter createRelationSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.InnerjoinRels <em>Innerjoin Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.InnerjoinRels
	 * @generated
	 */
	public Adapter createInnerjoinRelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.LeftOuterJoinRels <em>Left Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.LeftOuterJoinRels
	 * @generated
	 */
	public Adapter createLeftOuterJoinRelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.RightOuterJoinRels <em>Right Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.RightOuterJoinRels
	 * @generated
	 */
	public Adapter createRightOuterJoinRelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.FullOuterJoinRels <em>Full Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.FullOuterJoinRels
	 * @generated
	 */
	public Adapter createFullOuterJoinRelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.InputInstalment <em>Input Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.InputInstalment
	 * @generated
	 */
	public Adapter createInputInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.SortInstalment <em>Sort Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.SortInstalment
	 * @generated
	 */
	public Adapter createSortInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.FieldSPointer <em>Field SPointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.FieldSPointer
	 * @generated
	 */
	public Adapter createFieldSPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.AbstractNode
	 * @generated
	 */
	public Adapter createAbstractNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.MyTable <em>My Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.MyTable
	 * @generated
	 */
	public Adapter createMyTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.NullLiteral
	 * @generated
	 */
	public Adapter createNullLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.FunctionDef <em>Function Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.FunctionDef
	 * @generated
	 */
	public Adapter createFunctionDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.InputDef <em>Input Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.InputDef
	 * @generated
	 */
	public Adapter createInputDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.InputStringDef <em>Input String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.InputStringDef
	 * @generated
	 */
	public Adapter createInputStringDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.InputIntDef <em>Input Int Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.InputIntDef
	 * @generated
	 */
	public Adapter createInputIntDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.InputDateDef <em>Input Date Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.InputDateDef
	 * @generated
	 */
	public Adapter createInputDateDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.InputBitsDef <em>Input Bits Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.InputBitsDef
	 * @generated
	 */
	public Adapter createInputBitsDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.InputFloatDef <em>Input Float Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.InputFloatDef
	 * @generated
	 */
	public Adapter createInputFloatDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.CallSurfaceQuery <em>Call Surface Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.CallSurfaceQuery
	 * @generated
	 */
	public Adapter createCallSurfaceQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.Subtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.Subtype
	 * @generated
	 */
	public Adapter createSubtypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.AbstractConditionElement <em>Abstract Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.AbstractConditionElement
	 * @generated
	 */
	public Adapter createAbstractConditionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.Junction
	 * @generated
	 */
	public Adapter createJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.RootJunction <em>Root Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.RootJunction
	 * @generated
	 */
	public Adapter createRootJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.JuncRelationship <em>Junc Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.JuncRelationship
	 * @generated
	 */
	public Adapter createJuncRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.ConditionLink <em>Condition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.ConditionLink
	 * @generated
	 */
	public Adapter createConditionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.EqualLink <em>Equal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.EqualLink
	 * @generated
	 */
	public Adapter createEqualLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.GreaterThanLink <em>Greater Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.GreaterThanLink
	 * @generated
	 */
	public Adapter createGreaterThanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.GreaterEqualThanLink <em>Greater Equal Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.GreaterEqualThanLink
	 * @generated
	 */
	public Adapter createGreaterEqualThanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.LowerThanLink <em>Lower Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.LowerThanLink
	 * @generated
	 */
	public Adapter createLowerThanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.LowerEqualThanLink <em>Lower Equal Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.LowerEqualThanLink
	 * @generated
	 */
	public Adapter createLowerEqualThanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.InLink <em>In Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.InLink
	 * @generated
	 */
	public Adapter createInLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link delete.LikeLink <em>Like Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see delete.LikeLink
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

} //DeleteAdapterFactory
