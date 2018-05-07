/*
* 
*/
package delete.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import delete.DeletePackage;
import delete.DeleteSurface;
import delete.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DeleteVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "edu.aut.islab.delete.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DeleteSurfaceEditPart.MODEL_ID.equals(view.getType())) {
				return DeleteSurfaceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return delete.diagram.part.DeleteVisualIDRegistry.getVisualID(view.getType());
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
				DeleteDiagramEditorPlugin.getInstance()
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
		if (DeletePackage.eINSTANCE.getDeleteSurface().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((DeleteSurface) domainElement)) {
			return DeleteSurfaceEditPart.VISUAL_ID;
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
		String containerModelID = delete.diagram.part.DeleteVisualIDRegistry.getModelID(containerView);
		if (!DeleteSurfaceEditPart.MODEL_ID.equals(containerModelID) && !"dmext".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (DeleteSurfaceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = delete.diagram.part.DeleteVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DeleteSurfaceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DeleteSurfaceEditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getInputInstalment().isSuperTypeOf(domainElement.eClass())) {
				return InputInstalmentEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getTableListInstalment().isSuperTypeOf(domainElement.eClass())) {
				return TableListInstalmentEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getConditionInstalment().isSuperTypeOf(domainElement.eClass())) {
				return ConditionInstalmentEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getSortInstalment().isSuperTypeOf(domainElement.eClass())) {
				return SortInstalmentEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getDummy().isSuperTypeOf(domainElement.eClass())) {
				return DummyEditPart.VISUAL_ID;
			}
			break;
		case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getInputStringDef().isSuperTypeOf(domainElement.eClass())) {
				return InputStringDefEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getInputIntDef().isSuperTypeOf(domainElement.eClass())) {
				return InputIntDefEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getInputDateDef().isSuperTypeOf(domainElement.eClass())) {
				return InputDateDefEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getInputBitsDef().isSuperTypeOf(domainElement.eClass())) {
				return InputBitsDefEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getInputFloatDef().isSuperTypeOf(domainElement.eClass())) {
				return InputFloatDefEditPart.VISUAL_ID;
			}
			break;
		case TableListInstalmentTableListInstalmentTablesCompartmentEditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getMyTable().isSuperTypeOf(domainElement.eClass())) {
				return MyTableEditPart.VISUAL_ID;
			}
			break;
		case MyTableMyTableFieldsCompartmentEditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return FieldEditPart.VISUAL_ID;
			}
			break;
		case ConditionInstalmentConditionInstalmentPartsCompartmentEditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getRootJunction().isSuperTypeOf(domainElement.eClass())) {
				return RootJunctionEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getJunction().isSuperTypeOf(domainElement.eClass())) {
				return JunctionEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getTerm().isSuperTypeOf(domainElement.eClass())) {
				return TermEditPart.VISUAL_ID;
			}
			break;
		case TermTermParamsCompartmentEditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getCallSurfaceQuery().isSuperTypeOf(domainElement.eClass())) {
				return CallSurfaceQueryEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field3EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return Literal2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteral2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return Function2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input2EditPart.VISUAL_ID;
			}
			break;
		case CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getCallSurfaceQuery().isSuperTypeOf(domainElement.eClass())) {
				return CallSurfaceQuery2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getCallSurfaceQuery().isSuperTypeOf(domainElement.eClass())) {
				return CallSurfaceQuery2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getCallSurfaceQuery().isSuperTypeOf(domainElement.eClass())) {
				return CallSurfaceQuery2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getCallSurfaceQuery().isSuperTypeOf(domainElement.eClass())) {
				return CallSurfaceQuery2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case SortInstalmentSortInstalmentPointersCompartmentEditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getFieldSPointer().isSuperTypeOf(domainElement.eClass())) {
				return FieldSPointerEditPart.VISUAL_ID;
			}
			break;
		case DummyDummyPartsCompartmentEditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getCallSurfaceQuery().isSuperTypeOf(domainElement.eClass())) {
				return CallSurfaceQuery3EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field4EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return Literal3EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteral3EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return Function3EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input3EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getMyTable().isSuperTypeOf(domainElement.eClass())) {
				return MyTable2EditPart.VISUAL_ID;
			}
			break;
		case CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getCallSurfaceQuery().isSuperTypeOf(domainElement.eClass())) {
				return CallSurfaceQuery2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionParamsCompartment3EditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getCallSurfaceQuery().isSuperTypeOf(domainElement.eClass())) {
				return CallSurfaceQuery2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field2EditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (DeletePackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case MyTableMyTableFieldsCompartment2EditPart.VISUAL_ID:
			if (DeletePackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return FieldEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = delete.diagram.part.DeleteVisualIDRegistry.getModelID(containerView);
		if (!DeleteSurfaceEditPart.MODEL_ID.equals(containerModelID) && !"dmext".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (DeleteSurfaceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = delete.diagram.part.DeleteVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DeleteSurfaceEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DeleteSurfaceEditPart.VISUAL_ID:
			if (InputInstalmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableListInstalmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionInstalmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SortInstalmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DummyEditPart.VISUAL_ID == nodeVisualID) {
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
		case TableListInstalmentEditPart.VISUAL_ID:
			if (TableListInstalmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableListInstalmentTableListInstalmentTablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionInstalmentEditPart.VISUAL_ID:
			if (ConditionInstalmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionInstalmentConditionInstalmentPartsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
		case DummyEditPart.VISUAL_ID:
			if (DummyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DummyDummyPartsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
		case MyTableEditPart.VISUAL_ID:
			if (MyTableNameAliasEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MyTableMyTableFieldsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FieldEditPart.VISUAL_ID:
			if (FieldColumn_nameEditPart.VISUAL_ID == nodeVisualID) {
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
		case CallSurfaceQueryEditPart.VISUAL_ID:
			if (CallSurfaceQueryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			if (CallSurfaceQueryName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Field2EditPart.VISUAL_ID:
			if (FieldColumn_name2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LiteralEditPart.VISUAL_ID:
			if (LiteralValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NullLiteralEditPart.VISUAL_ID:
			if (NullLiteralValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionEditPart.VISUAL_ID:
			if (FunctionNameEditPart.VISUAL_ID == nodeVisualID) {
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
		case Field3EditPart.VISUAL_ID:
			if (FieldColumn_name3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Literal2EditPart.VISUAL_ID:
			if (LiteralValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NullLiteral2EditPart.VISUAL_ID:
			if (NullLiteralValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Function2EditPart.VISUAL_ID:
			if (FunctionName2EditPart.VISUAL_ID == nodeVisualID) {
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
		case FieldSPointerEditPart.VISUAL_ID:
			if (FieldSPointerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallSurfaceQuery3EditPart.VISUAL_ID:
			if (CallSurfaceQueryName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Field4EditPart.VISUAL_ID:
			if (FieldColumn_name4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Literal3EditPart.VISUAL_ID:
			if (LiteralValue3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NullLiteral3EditPart.VISUAL_ID:
			if (NullLiteralValue3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Function3EditPart.VISUAL_ID:
			if (FunctionName3EditPart.VISUAL_ID == nodeVisualID) {
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
		case MyTable2EditPart.VISUAL_ID:
			if (MyTableNameAlias2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MyTableMyTableFieldsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
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
		case TableListInstalmentTableListInstalmentTablesCompartmentEditPart.VISUAL_ID:
			if (MyTableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MyTableMyTableFieldsCompartmentEditPart.VISUAL_ID:
			if (FieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionInstalmentConditionInstalmentPartsCompartmentEditPart.VISUAL_ID:
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
			if (CallSurfaceQueryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Field3EditPart.VISUAL_ID == nodeVisualID) {
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
		case CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID:
			if (CallSurfaceQuery2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Field2EditPart.VISUAL_ID == nodeVisualID) {
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
		case CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID:
			if (CallSurfaceQuery2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Field2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (CallSurfaceQuery2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Field2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (CallSurfaceQuery2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Field2EditPart.VISUAL_ID == nodeVisualID) {
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
		case SortInstalmentSortInstalmentPointersCompartmentEditPart.VISUAL_ID:
			if (FieldSPointerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DummyDummyPartsCompartmentEditPart.VISUAL_ID:
			if (CallSurfaceQuery3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Field4EditPart.VISUAL_ID == nodeVisualID) {
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
			if (MyTable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart.VISUAL_ID:
			if (CallSurfaceQuery2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Field2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (CallSurfaceQuery2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Field2EditPart.VISUAL_ID == nodeVisualID) {
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
		case MyTableMyTableFieldsCompartment2EditPart.VISUAL_ID:
			if (FieldEditPart.VISUAL_ID == nodeVisualID) {
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
		if (DeletePackage.eINSTANCE.getInnerjoinRels().isSuperTypeOf(domainElement.eClass())) {
			return InnerjoinRelsEditPart.VISUAL_ID;
		}
		if (DeletePackage.eINSTANCE.getLeftOuterJoinRels().isSuperTypeOf(domainElement.eClass())) {
			return LeftOuterJoinRelsEditPart.VISUAL_ID;
		}
		if (DeletePackage.eINSTANCE.getRightOuterJoinRels().isSuperTypeOf(domainElement.eClass())) {
			return RightOuterJoinRelsEditPart.VISUAL_ID;
		}
		if (DeletePackage.eINSTANCE.getFullOuterJoinRels().isSuperTypeOf(domainElement.eClass())) {
			return FullOuterJoinRelsEditPart.VISUAL_ID;
		}
		if (DeletePackage.eINSTANCE.getEqualLink().isSuperTypeOf(domainElement.eClass())) {
			return EqualLinkEditPart.VISUAL_ID;
		}
		if (DeletePackage.eINSTANCE.getGreaterThanLink().isSuperTypeOf(domainElement.eClass())) {
			return GreaterThanLinkEditPart.VISUAL_ID;
		}
		if (DeletePackage.eINSTANCE.getGreaterEqualThanLink().isSuperTypeOf(domainElement.eClass())) {
			return GreaterEqualThanLinkEditPart.VISUAL_ID;
		}
		if (DeletePackage.eINSTANCE.getLowerThanLink().isSuperTypeOf(domainElement.eClass())) {
			return LowerThanLinkEditPart.VISUAL_ID;
		}
		if (DeletePackage.eINSTANCE.getLowerEqualThanLink().isSuperTypeOf(domainElement.eClass())) {
			return LowerEqualThanLinkEditPart.VISUAL_ID;
		}
		if (DeletePackage.eINSTANCE.getInLink().isSuperTypeOf(domainElement.eClass())) {
			return InLinkEditPart.VISUAL_ID;
		}
		if (DeletePackage.eINSTANCE.getLikeLink().isSuperTypeOf(domainElement.eClass())) {
			return LikeLinkEditPart.VISUAL_ID;
		}
		if (DeletePackage.eINSTANCE.getJuncRelationship().isSuperTypeOf(domainElement.eClass())) {
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
	private static boolean isDiagram(DeleteSurface element) {
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
		case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
		case TableListInstalmentTableListInstalmentTablesCompartmentEditPart.VISUAL_ID:
		case MyTableMyTableFieldsCompartmentEditPart.VISUAL_ID:
		case ConditionInstalmentConditionInstalmentPartsCompartmentEditPart.VISUAL_ID:
		case TermTermParamsCompartmentEditPart.VISUAL_ID:
		case CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID:
		case CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID:
		case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
		case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
		case SortInstalmentSortInstalmentPointersCompartmentEditPart.VISUAL_ID:
		case DummyDummyPartsCompartmentEditPart.VISUAL_ID:
		case CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart.VISUAL_ID:
		case FunctionFunctionParamsCompartment3EditPart.VISUAL_ID:
		case MyTableMyTableFieldsCompartment2EditPart.VISUAL_ID:
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
		case DeleteSurfaceEditPart.VISUAL_ID:
			return false;
		case InputStringDefEditPart.VISUAL_ID:
		case InputIntDefEditPart.VISUAL_ID:
		case InputDateDefEditPart.VISUAL_ID:
		case InputBitsDefEditPart.VISUAL_ID:
		case Field3EditPart.VISUAL_ID:
		case Field2EditPart.VISUAL_ID:
		case LiteralEditPart.VISUAL_ID:
		case NullLiteralEditPart.VISUAL_ID:
		case InputEditPart.VISUAL_ID:
		case Literal2EditPart.VISUAL_ID:
		case NullLiteral2EditPart.VISUAL_ID:
		case Input2EditPart.VISUAL_ID:
		case InputFloatDefEditPart.VISUAL_ID:
		case RootJunctionEditPart.VISUAL_ID:
		case JunctionEditPart.VISUAL_ID:
		case FieldSPointerEditPart.VISUAL_ID:
		case Field4EditPart.VISUAL_ID:
		case Literal3EditPart.VISUAL_ID:
		case NullLiteral3EditPart.VISUAL_ID:
		case Input3EditPart.VISUAL_ID:
		case FieldEditPart.VISUAL_ID:
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
			return delete.diagram.part.DeleteVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return delete.diagram.part.DeleteVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return delete.diagram.part.DeleteVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return delete.diagram.part.DeleteVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return delete.diagram.part.DeleteVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return delete.diagram.part.DeleteVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
