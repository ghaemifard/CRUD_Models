/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GhaemiFactoryImpl extends EFactoryImpl implements GhaemiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GhaemiFactory init() {
		try {
			GhaemiFactory theGhaemiFactory = (GhaemiFactory)EPackage.Registry.INSTANCE.getEFactory(GhaemiPackage.eNS_URI);
			if (theGhaemiFactory != null) {
				return theGhaemiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GhaemiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhaemiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GhaemiPackage.LITERAL: return createLiteral();
			case GhaemiPackage.FIELD: return createField();
			case GhaemiPackage.FUNCTION: return createFunction();
			case GhaemiPackage.CALL_QUERY_SURFACE: return createCallQuerySurface();
			case GhaemiPackage.INPUT: return createInput();
			case GhaemiPackage.TYPE: return createType();
			case GhaemiPackage.SUBTYPES: return createSubtypes();
			case GhaemiPackage.QUERY_SURFACE: return createQuerySurface();
			case GhaemiPackage.INSERT_SURFACE: return createInsertSurface();
			case GhaemiPackage.UPDATE_SURFACE: return createUpdateSurface();
			case GhaemiPackage.DELETE_SURFACE: return createDeleteSurface();
			case GhaemiPackage.RELATION_SHIP: return createRelationShip();
			case GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET: return createQueryConditionalInstalmnet();
			case GhaemiPackage.QUERY_SELECT_INSTALMENT: return createQuerySelectInstalment();
			case GhaemiPackage.TERM: return createTerm();
			case GhaemiPackage.CONDITIONAL_OPERATOR: return createConditionalOperator();
			case GhaemiPackage.DISJUNCTION: return createDisjunction();
			case GhaemiPackage.DISJUNCTION_RELATIONSHIP: return createDisjunctionRelationship();
			case GhaemiPackage.FUNC_DEFINITION: return createFuncDefinition();
			case GhaemiPackage.OUTPUT_NODE: return createOutputNode();
			case GhaemiPackage.OUTPUT_INSTALMENT: return createOutputInstalment();
			case GhaemiPackage.INPUT_INSTALMENT: return createInputInstalment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GhaemiPackage.QUERY_RELATION_TYPE:
				return createQueryRelationTypeFromString(eDataType, initialValue);
			case GhaemiPackage.OPERATOR_TYPE:
				return createOperatorTypeFromString(eDataType, initialValue);
			case GhaemiPackage.DISJUNC_TYPE:
				return createDisjuncTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GhaemiPackage.QUERY_RELATION_TYPE:
				return convertQueryRelationTypeToString(eDataType, instanceValue);
			case GhaemiPackage.OPERATOR_TYPE:
				return convertOperatorTypeToString(eDataType, instanceValue);
			case GhaemiPackage.DISJUNC_TYPE:
				return convertDisjuncTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallQuerySurface createCallQuerySurface() {
		CallQuerySurfaceImpl callQuerySurface = new CallQuerySurfaceImpl();
		return callQuerySurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtypes createSubtypes() {
		SubtypesImpl subtypes = new SubtypesImpl();
		return subtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuerySurface createQuerySurface() {
		QuerySurfaceImpl querySurface = new QuerySurfaceImpl();
		return querySurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertSurface createInsertSurface() {
		InsertSurfaceImpl insertSurface = new InsertSurfaceImpl();
		return insertSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateSurface createUpdateSurface() {
		UpdateSurfaceImpl updateSurface = new UpdateSurfaceImpl();
		return updateSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteSurface createDeleteSurface() {
		DeleteSurfaceImpl deleteSurface = new DeleteSurfaceImpl();
		return deleteSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationShip createRelationShip() {
		RelationShipImpl relationShip = new RelationShipImpl();
		return relationShip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryConditionalInstalmnet createQueryConditionalInstalmnet() {
		QueryConditionalInstalmnetImpl queryConditionalInstalmnet = new QueryConditionalInstalmnetImpl();
		return queryConditionalInstalmnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuerySelectInstalment createQuerySelectInstalment() {
		QuerySelectInstalmentImpl querySelectInstalment = new QuerySelectInstalmentImpl();
		return querySelectInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalOperator createConditionalOperator() {
		ConditionalOperatorImpl conditionalOperator = new ConditionalOperatorImpl();
		return conditionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disjunction createDisjunction() {
		DisjunctionImpl disjunction = new DisjunctionImpl();
		return disjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjunctionRelationship createDisjunctionRelationship() {
		DisjunctionRelationshipImpl disjunctionRelationship = new DisjunctionRelationshipImpl();
		return disjunctionRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncDefinition createFuncDefinition() {
		FuncDefinitionImpl funcDefinition = new FuncDefinitionImpl();
		return funcDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputNode createOutputNode() {
		OutputNodeImpl outputNode = new OutputNodeImpl();
		return outputNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputInstalment createOutputInstalment() {
		OutputInstalmentImpl outputInstalment = new OutputInstalmentImpl();
		return outputInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputInstalment createInputInstalment() {
		InputInstalmentImpl inputInstalment = new InputInstalmentImpl();
		return inputInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryRelationType createQueryRelationTypeFromString(EDataType eDataType, String initialValue) {
		QueryRelationType result = QueryRelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryRelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorType createOperatorTypeFromString(EDataType eDataType, String initialValue) {
		OperatorType result = OperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjuncType createDisjuncTypeFromString(EDataType eDataType, String initialValue) {
		DisjuncType result = DisjuncType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisjuncTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhaemiPackage getGhaemiPackage() {
		return (GhaemiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GhaemiPackage getPackage() {
		return GhaemiPackage.eINSTANCE;
	}

} //GhaemiFactoryImpl
