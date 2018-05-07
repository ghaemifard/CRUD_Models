/*
* 
*/
package query.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import query.QueryPackage;
import query.QuerySurface;
import query.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class QueryVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "edu.aut.islab.query.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (QuerySurfaceEditPart.MODEL_ID.equals(view.getType())) {
				return QuerySurfaceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return query.diagram.part.QueryVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				QueryDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (QueryPackage.eINSTANCE.getQuerySurface().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((QuerySurface) domainElement)) {
			return QuerySurfaceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = query.diagram.part.QueryVisualIDRegistry.getModelID(containerView);
		if (!QuerySurfaceEditPart.MODEL_ID.equals(containerModelID) && !"mext".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (QuerySurfaceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = query.diagram.part.QueryVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = QuerySurfaceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case QuerySurfaceEditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getWhereInstalment().isSuperTypeOf(domainElement.eClass())) {
				return WhereInstalmentEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getHavingInstalment().isSuperTypeOf(domainElement.eClass())) {
				return HavingInstalmentEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getOutputInstalment().isSuperTypeOf(domainElement.eClass())) {
				return OutputInstalmentEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getInputInstalment().isSuperTypeOf(domainElement.eClass())) {
				return InputInstalmentEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getGroupInstalment().isSuperTypeOf(domainElement.eClass())) {
				return GroupInstalmentEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getSortInstalment().isSuperTypeOf(domainElement.eClass())) {
				return SortInstalmentEditPart.VISUAL_ID;
			}
			break;
		case WhereInstalmentWhereInstalmentPartsCompartmentEditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getRootJunction().isSuperTypeOf(domainElement.eClass())) {
				return RootJunctionEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getJunction().isSuperTypeOf(domainElement.eClass())) {
				return JunctionEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getTerm().isSuperTypeOf(domainElement.eClass())) {
				return TermEditPart.VISUAL_ID;
			}
			break;
		case TermTermParamsCompartmentEditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getCallQuerySurface().isSuperTypeOf(domainElement.eClass())) {
				return CallQuerySurfaceEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field2EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return Literal2EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteral2EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return Function2EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input2EditPart.VISUAL_ID;
			}
			break;
		case CallQuerySurfaceCallQuerySurfaceParamsCompartmentEditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getCallQuerySurface().isSuperTypeOf(domainElement.eClass())) {
				return CallQuerySurface2EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return FieldEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case CallQuerySurfaceCallQuerySurfaceParamsCompartment2EditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getCallQuerySurface().isSuperTypeOf(domainElement.eClass())) {
				return CallQuerySurface2EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return FieldEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getCallQuerySurface().isSuperTypeOf(domainElement.eClass())) {
				return CallQuerySurface2EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return FieldEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getCallQuerySurface().isSuperTypeOf(domainElement.eClass())) {
				return CallQuerySurface2EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return FieldEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case HavingInstalmentHavingInstalmentPartsCompartmentEditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getRootJunction().isSuperTypeOf(domainElement.eClass())) {
				return RootJunctionEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getJunction().isSuperTypeOf(domainElement.eClass())) {
				return JunctionEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getTerm().isSuperTypeOf(domainElement.eClass())) {
				return TermEditPart.VISUAL_ID;
			}
			break;
		case OutputInstalmentOutputInstalmentNodesCompartmentEditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getCallQuerySurface().isSuperTypeOf(domainElement.eClass())) {
				return CallQuerySurface3EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field3EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return Literal3EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteral3EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return Function3EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input3EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getMyTable().isSuperTypeOf(domainElement.eClass())) {
				return MyTableEditPart.VISUAL_ID;
			}
			break;
		case CallQuerySurfaceCallQuerySurfaceParamsCompartment3EditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getCallQuerySurface().isSuperTypeOf(domainElement.eClass())) {
				return CallQuerySurface2EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return FieldEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionParamsCompartment3EditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getCallQuerySurface().isSuperTypeOf(domainElement.eClass())) {
				return CallQuerySurface2EditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return FieldEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case MyTableMyTableFieldsCompartmentEditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field4EditPart.VISUAL_ID;
			}
			break;
		case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getInputStringDef().isSuperTypeOf(domainElement.eClass())) {
				return InputStringDefEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getInputIntDef().isSuperTypeOf(domainElement.eClass())) {
				return InputIntDefEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getInputDateDef().isSuperTypeOf(domainElement.eClass())) {
				return InputDateDefEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getInputBitsDef().isSuperTypeOf(domainElement.eClass())) {
				return InputBitsDefEditPart.VISUAL_ID;
			}
			if (QueryPackage.eINSTANCE.getInputFloatDef().isSuperTypeOf(domainElement.eClass())) {
				return InputFloatDefEditPart.VISUAL_ID;
			}
			break;
		case GroupInstalmentGroupInstalmentPointersCompartmentEditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getFieldGPointer().isSuperTypeOf(domainElement.eClass())) {
				return FieldGPointerEditPart.VISUAL_ID;
			}
			break;
		case SortInstalmentSortInstalmentPointersCompartmentEditPart.VISUAL_ID:
			if (QueryPackage.eINSTANCE.getFieldSPointer().isSuperTypeOf(domainElement.eClass())) {
				return FieldSPointerEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = query.diagram.part.QueryVisualIDRegistry.getModelID(containerView);
		if (!QuerySurfaceEditPart.MODEL_ID.equals(containerModelID) && !"mext".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (QuerySurfaceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = query.diagram.part.QueryVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = QuerySurfaceEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case QuerySurfaceEditPart.VISUAL_ID:
			if (WhereInstalmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HavingInstalmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputInstalmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputInstalmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupInstalmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SortInstalmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhereInstalmentEditPart.VISUAL_ID:
			if (WhereInstalmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhereInstalmentWhereInstalmentPartsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HavingInstalmentEditPart.VISUAL_ID:
			if (HavingInstalmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HavingInstalmentHavingInstalmentPartsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputInstalmentEditPart.VISUAL_ID:
			if (OutputInstalmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputInstalmentOutputInstalmentNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputInstalmentEditPart.VISUAL_ID:
			if (InputInstalmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupInstalmentEditPart.VISUAL_ID:
			if (GroupInstalmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupInstalmentGroupInstalmentPointersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SortInstalmentEditPart.VISUAL_ID:
			if (SortInstalmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SortInstalmentSortInstalmentPointersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RootJunctionEditPart.VISUAL_ID:
			if (RootJunctionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JunctionEditPart.VISUAL_ID:
			if (JunctionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TermEditPart.VISUAL_ID:
			if (TermTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TermTermParamsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallQuerySurfaceEditPart.VISUAL_ID:
			if (CallQuerySurfaceColumn_nameNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallQuerySurfaceCallQuerySurfaceParamsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallQuerySurface2EditPart.VISUAL_ID:
			if (CallQuerySurfaceColumn_nameName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallQuerySurfaceCallQuerySurfaceParamsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FieldEditPart.VISUAL_ID:
			if (FieldNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LiteralEditPart.VISUAL_ID:
			if (LiteralColumn_nameValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NullLiteralEditPart.VISUAL_ID:
			if (NullLiteralColumn_nameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionEditPart.VISUAL_ID:
			if (FunctionColumn_nameNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionFunctionParamsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputEditPart.VISUAL_ID:
			if (InputColumn_nameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Field2EditPart.VISUAL_ID:
			if (FieldName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Literal2EditPart.VISUAL_ID:
			if (LiteralColumn_nameValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NullLiteral2EditPart.VISUAL_ID:
			if (NullLiteralColumn_name2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Function2EditPart.VISUAL_ID:
			if (FunctionColumn_nameName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionFunctionParamsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Input2EditPart.VISUAL_ID:
			if (InputColumn_name2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallQuerySurface3EditPart.VISUAL_ID:
			if (CallQuerySurfaceColumn_nameName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallQuerySurfaceCallQuerySurfaceParamsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Field3EditPart.VISUAL_ID:
			if (FieldName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Literal3EditPart.VISUAL_ID:
			if (LiteralColumn_nameValue3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NullLiteral3EditPart.VISUAL_ID:
			if (NullLiteralColumn_name3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Function3EditPart.VISUAL_ID:
			if (FunctionColumn_nameName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionFunctionParamsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Input3EditPart.VISUAL_ID:
			if (InputColumn_name3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MyTableEditPart.VISUAL_ID:
			if (MyTableNameAliasEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MyTableMyTableFieldsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Field4EditPart.VISUAL_ID:
			if (FieldName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputStringDefEditPart.VISUAL_ID:
			if (InputStringDefNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputIntDefEditPart.VISUAL_ID:
			if (InputIntDefNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputDateDefEditPart.VISUAL_ID:
			if (InputDateDefNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputBitsDefEditPart.VISUAL_ID:
			if (InputBitsDefNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputFloatDefEditPart.VISUAL_ID:
			if (InputFloatDefNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FieldGPointerEditPart.VISUAL_ID:
			if (FieldGPointerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FieldSPointerEditPart.VISUAL_ID:
			if (FieldSPointerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhereInstalmentWhereInstalmentPartsCompartmentEditPart.VISUAL_ID:
			if (RootJunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TermEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TermTermParamsCompartmentEditPart.VISUAL_ID:
			if (CallQuerySurfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Field2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Literal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NullLiteral2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Function2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallQuerySurfaceCallQuerySurfaceParamsCompartmentEditPart.VISUAL_ID:
			if (CallQuerySurface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NullLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallQuerySurfaceCallQuerySurfaceParamsCompartment2EditPart.VISUAL_ID:
			if (CallQuerySurface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NullLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
			if (CallQuerySurface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NullLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
			if (CallQuerySurface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NullLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HavingInstalmentHavingInstalmentPartsCompartmentEditPart.VISUAL_ID:
			if (RootJunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TermEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputInstalmentOutputInstalmentNodesCompartmentEditPart.VISUAL_ID:
			if (CallQuerySurface3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Field3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Literal3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NullLiteral3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Function3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MyTableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallQuerySurfaceCallQuerySurfaceParamsCompartment3EditPart.VISUAL_ID:
			if (CallQuerySurface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NullLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionFunctionParamsCompartment3EditPart.VISUAL_ID:
			if (CallQuerySurface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NullLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MyTableMyTableFieldsCompartmentEditPart.VISUAL_ID:
			if (Field4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
			if (InputStringDefEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputIntDefEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputDateDefEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputBitsDefEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputFloatDefEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupInstalmentGroupInstalmentPointersCompartmentEditPart.VISUAL_ID:
			if (FieldGPointerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SortInstalmentSortInstalmentPointersCompartmentEditPart.VISUAL_ID:
			if (FieldSPointerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InnerjoinRelsEditPart.VISUAL_ID:
			if (InnerjoinRelsTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			if (LeftOuterJoinRelsTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			if (RightOuterJoinRelsTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			if (FullOuterJoinRelsTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EqualLinkEditPart.VISUAL_ID:
			if (EqualLinkDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GreaterThanLinkEditPart.VISUAL_ID:
			if (GreaterThanLinkDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			if (GreaterEqualThanLinkDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LowerThanLinkEditPart.VISUAL_ID:
			if (LowerThanLinkDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			if (LowerEqualThanLinkDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InLinkEditPart.VISUAL_ID:
			if (InLinkDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LikeLinkEditPart.VISUAL_ID:
			if (LikeLinkDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JuncRelationshipEditPart.VISUAL_ID:
			if (JuncRelationshipIndexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (QueryPackage.eINSTANCE.getInnerjoinRels().isSuperTypeOf(domainElement.eClass())) {
			return InnerjoinRelsEditPart.VISUAL_ID;
		}
		if (QueryPackage.eINSTANCE.getLeftOuterJoinRels().isSuperTypeOf(domainElement.eClass())) {
			return LeftOuterJoinRelsEditPart.VISUAL_ID;
		}
		if (QueryPackage.eINSTANCE.getRightOuterJoinRels().isSuperTypeOf(domainElement.eClass())) {
			return RightOuterJoinRelsEditPart.VISUAL_ID;
		}
		if (QueryPackage.eINSTANCE.getFullOuterJoinRels().isSuperTypeOf(domainElement.eClass())) {
			return FullOuterJoinRelsEditPart.VISUAL_ID;
		}
		if (QueryPackage.eINSTANCE.getEqualLink().isSuperTypeOf(domainElement.eClass())) {
			return EqualLinkEditPart.VISUAL_ID;
		}
		if (QueryPackage.eINSTANCE.getGreaterThanLink().isSuperTypeOf(domainElement.eClass())) {
			return GreaterThanLinkEditPart.VISUAL_ID;
		}
		if (QueryPackage.eINSTANCE.getGreaterEqualThanLink().isSuperTypeOf(domainElement.eClass())) {
			return GreaterEqualThanLinkEditPart.VISUAL_ID;
		}
		if (QueryPackage.eINSTANCE.getLowerThanLink().isSuperTypeOf(domainElement.eClass())) {
			return LowerThanLinkEditPart.VISUAL_ID;
		}
		if (QueryPackage.eINSTANCE.getLowerEqualThanLink().isSuperTypeOf(domainElement.eClass())) {
			return LowerEqualThanLinkEditPart.VISUAL_ID;
		}
		if (QueryPackage.eINSTANCE.getInLink().isSuperTypeOf(domainElement.eClass())) {
			return InLinkEditPart.VISUAL_ID;
		}
		if (QueryPackage.eINSTANCE.getLikeLink().isSuperTypeOf(domainElement.eClass())) {
			return LikeLinkEditPart.VISUAL_ID;
		}
		if (QueryPackage.eINSTANCE.getJuncRelationship().isSuperTypeOf(domainElement.eClass())) {
			return JuncRelationshipEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(QuerySurface element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case WhereInstalmentWhereInstalmentPartsCompartmentEditPart.VISUAL_ID:
		case TermTermParamsCompartmentEditPart.VISUAL_ID:
		case CallQuerySurfaceCallQuerySurfaceParamsCompartmentEditPart.VISUAL_ID:
		case CallQuerySurfaceCallQuerySurfaceParamsCompartment2EditPart.VISUAL_ID:
		case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
		case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
		case HavingInstalmentHavingInstalmentPartsCompartmentEditPart.VISUAL_ID:
		case OutputInstalmentOutputInstalmentNodesCompartmentEditPart.VISUAL_ID:
		case CallQuerySurfaceCallQuerySurfaceParamsCompartment3EditPart.VISUAL_ID:
		case FunctionFunctionParamsCompartment3EditPart.VISUAL_ID:
		case MyTableMyTableFieldsCompartmentEditPart.VISUAL_ID:
		case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
		case GroupInstalmentGroupInstalmentPointersCompartmentEditPart.VISUAL_ID:
		case SortInstalmentSortInstalmentPointersCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case QuerySurfaceEditPart.VISUAL_ID:
			return false;
		case RootJunctionEditPart.VISUAL_ID:
		case JunctionEditPart.VISUAL_ID:
		case FieldEditPart.VISUAL_ID:
		case LiteralEditPart.VISUAL_ID:
		case NullLiteralEditPart.VISUAL_ID:
		case InputEditPart.VISUAL_ID:
		case Field2EditPart.VISUAL_ID:
		case Literal2EditPart.VISUAL_ID:
		case NullLiteral2EditPart.VISUAL_ID:
		case Input2EditPart.VISUAL_ID:
		case Field3EditPart.VISUAL_ID:
		case Literal3EditPart.VISUAL_ID:
		case NullLiteral3EditPart.VISUAL_ID:
		case Input3EditPart.VISUAL_ID:
		case Field4EditPart.VISUAL_ID:
		case InputStringDefEditPart.VISUAL_ID:
		case InputIntDefEditPart.VISUAL_ID:
		case InputDateDefEditPart.VISUAL_ID:
		case InputBitsDefEditPart.VISUAL_ID:
		case FieldGPointerEditPart.VISUAL_ID:
		case FieldSPointerEditPart.VISUAL_ID:
		case InputFloatDefEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return query.diagram.part.QueryVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return query.diagram.part.QueryVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return query.diagram.part.QueryVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return query.diagram.part.QueryVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return query.diagram.part.QueryVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return query.diagram.part.QueryVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
