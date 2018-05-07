/**
 */
package update.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import update.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see update.UpdatePackage
 * @generated
 */
public class UpdateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UpdatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UpdatePackage.eINSTANCE;
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
	protected UpdateSwitch<Adapter> modelSwitch =
		new UpdateSwitch<Adapter>() {
			@Override
			public Adapter caseUpdateSurface(UpdateSurface object) {
				return createUpdateSurfaceAdapter();
			}
			@Override
			public Adapter caseLinkField(LinkField object) {
				return createLinkFieldAdapter();
			}
			@Override
			public Adapter caseInputInstalment(InputInstalment object) {
				return createInputInstalmentAdapter();
			}
			@Override
			public Adapter casePrepareList(PrepareList object) {
				return createPrepareListAdapter();
			}
			@Override
			public Adapter caseConditionInstalment(ConditionInstalment object) {
				return createConditionInstalmentAdapter();
			}
			@Override
			public Adapter caseTableSelection(TableSelection object) {
				return createTableSelectionAdapter();
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
			public Adapter caseRealField(RealField object) {
				return createRealFieldAdapter();
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
	 * Creates a new adapter for an object of class '{@link update.UpdateSurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.UpdateSurface
	 * @generated
	 */
	public Adapter createUpdateSurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.LinkField <em>Link Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.LinkField
	 * @generated
	 */
	public Adapter createLinkFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.InputInstalment <em>Input Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.InputInstalment
	 * @generated
	 */
	public Adapter createInputInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.PrepareList <em>Prepare List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.PrepareList
	 * @generated
	 */
	public Adapter createPrepareListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.ConditionInstalment <em>Condition Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.ConditionInstalment
	 * @generated
	 */
	public Adapter createConditionInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.TableSelection <em>Table Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.TableSelection
	 * @generated
	 */
	public Adapter createTableSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.RelationSelect <em>Relation Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.RelationSelect
	 * @generated
	 */
	public Adapter createRelationSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.InnerjoinRels <em>Innerjoin Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.InnerjoinRels
	 * @generated
	 */
	public Adapter createInnerjoinRelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.LeftOuterJoinRels <em>Left Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.LeftOuterJoinRels
	 * @generated
	 */
	public Adapter createLeftOuterJoinRelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.RightOuterJoinRels <em>Right Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.RightOuterJoinRels
	 * @generated
	 */
	public Adapter createRightOuterJoinRelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.FullOuterJoinRels <em>Full Outer Join Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.FullOuterJoinRels
	 * @generated
	 */
	public Adapter createFullOuterJoinRelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.SortInstalment <em>Sort Instalment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.SortInstalment
	 * @generated
	 */
	public Adapter createSortInstalmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.FieldSPointer <em>Field SPointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.FieldSPointer
	 * @generated
	 */
	public Adapter createFieldSPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.AbstractNode
	 * @generated
	 */
	public Adapter createAbstractNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.MyTable <em>My Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.MyTable
	 * @generated
	 */
	public Adapter createMyTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.RealField <em>Real Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.RealField
	 * @generated
	 */
	public Adapter createRealFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.NullLiteral
	 * @generated
	 */
	public Adapter createNullLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.FunctionDef <em>Function Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.FunctionDef
	 * @generated
	 */
	public Adapter createFunctionDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.InputDef <em>Input Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.InputDef
	 * @generated
	 */
	public Adapter createInputDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.InputStringDef <em>Input String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.InputStringDef
	 * @generated
	 */
	public Adapter createInputStringDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.InputIntDef <em>Input Int Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.InputIntDef
	 * @generated
	 */
	public Adapter createInputIntDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.InputDateDef <em>Input Date Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.InputDateDef
	 * @generated
	 */
	public Adapter createInputDateDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.InputBitsDef <em>Input Bits Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.InputBitsDef
	 * @generated
	 */
	public Adapter createInputBitsDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.InputFloatDef <em>Input Float Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.InputFloatDef
	 * @generated
	 */
	public Adapter createInputFloatDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.CallSurfaceQuery <em>Call Surface Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.CallSurfaceQuery
	 * @generated
	 */
	public Adapter createCallSurfaceQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.Subtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.Subtype
	 * @generated
	 */
	public Adapter createSubtypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.AbstractConditionElement <em>Abstract Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.AbstractConditionElement
	 * @generated
	 */
	public Adapter createAbstractConditionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.Junction
	 * @generated
	 */
	public Adapter createJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.RootJunction <em>Root Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.RootJunction
	 * @generated
	 */
	public Adapter createRootJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.JuncRelationship <em>Junc Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.JuncRelationship
	 * @generated
	 */
	public Adapter createJuncRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.ConditionLink <em>Condition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.ConditionLink
	 * @generated
	 */
	public Adapter createConditionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.EqualLink <em>Equal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.EqualLink
	 * @generated
	 */
	public Adapter createEqualLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.GreaterThanLink <em>Greater Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.GreaterThanLink
	 * @generated
	 */
	public Adapter createGreaterThanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.GreaterEqualThanLink <em>Greater Equal Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.GreaterEqualThanLink
	 * @generated
	 */
	public Adapter createGreaterEqualThanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.LowerThanLink <em>Lower Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.LowerThanLink
	 * @generated
	 */
	public Adapter createLowerThanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.LowerEqualThanLink <em>Lower Equal Than Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.LowerEqualThanLink
	 * @generated
	 */
	public Adapter createLowerEqualThanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.InLink <em>In Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.InLink
	 * @generated
	 */
	public Adapter createInLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link update.LikeLink <em>Like Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see update.LikeLink
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

} //UpdateAdapterFactory
