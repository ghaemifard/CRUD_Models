/*
* 
*/
package insert.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import insert.InsertPackage;
import insert.InsertSurface;
import insert.diagram.edit.parts.CallSurfaceQuery2EditPart;
import insert.diagram.edit.parts.CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart;
import insert.diagram.edit.parts.CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart;
import insert.diagram.edit.parts.CallSurfaceQueryEditPart;
import insert.diagram.edit.parts.CallSurfaceQueryName2EditPart;
import insert.diagram.edit.parts.CallSurfaceQueryNameEditPart;
import insert.diagram.edit.parts.Field2EditPart;
import insert.diagram.edit.parts.Field3EditPart;
import insert.diagram.edit.parts.FieldColumn_nameName2EditPart;
import insert.diagram.edit.parts.FieldColumn_nameName3EditPart;
import insert.diagram.edit.parts.FieldColumn_nameNameEditPart;
import insert.diagram.edit.parts.FieldEditPart;
import insert.diagram.edit.parts.Function2EditPart;
import insert.diagram.edit.parts.FunctionEditPart;
import insert.diagram.edit.parts.FunctionFunctionParamsCompartment2EditPart;
import insert.diagram.edit.parts.FunctionFunctionParamsCompartmentEditPart;
import insert.diagram.edit.parts.FunctionName2EditPart;
import insert.diagram.edit.parts.FunctionNameEditPart;
import insert.diagram.edit.parts.Input2EditPart;
import insert.diagram.edit.parts.InputBitsDefEditPart;
import insert.diagram.edit.parts.InputBitsDefNameEditPart;
import insert.diagram.edit.parts.InputDateDefEditPart;
import insert.diagram.edit.parts.InputDateDefNameEditPart;
import insert.diagram.edit.parts.InputEditPart;
import insert.diagram.edit.parts.InputFloatDefEditPart;
import insert.diagram.edit.parts.InputFloatDefNameEditPart;
import insert.diagram.edit.parts.InputInstalmentEditPart;
import insert.diagram.edit.parts.InputInstalmentInputInstalmentInputsCompartmentEditPart;
import insert.diagram.edit.parts.InputInstalmentNameEditPart;
import insert.diagram.edit.parts.InputIntDefEditPart;
import insert.diagram.edit.parts.InputIntDefNameEditPart;
import insert.diagram.edit.parts.InputName2EditPart;
import insert.diagram.edit.parts.InputNameEditPart;
import insert.diagram.edit.parts.InputStringDefEditPart;
import insert.diagram.edit.parts.InputStringDefNameEditPart;
import insert.diagram.edit.parts.InsertSurfaceEditPart;
import insert.diagram.edit.parts.Literal2EditPart;
import insert.diagram.edit.parts.LiteralColumn_nameValue2EditPart;
import insert.diagram.edit.parts.LiteralColumn_nameValueEditPart;
import insert.diagram.edit.parts.LiteralEditPart;
import insert.diagram.edit.parts.NullLiteral2EditPart;
import insert.diagram.edit.parts.NullLiteralColumn_name2EditPart;
import insert.diagram.edit.parts.NullLiteralColumn_nameEditPart;
import insert.diagram.edit.parts.NullLiteralEditPart;
import insert.diagram.edit.parts.PrepareListEditPart;
import insert.diagram.edit.parts.PrepareListNameEditPart;
import insert.diagram.edit.parts.PrepareListPrepareListNodesCompartmentEditPart;
import insert.diagram.edit.parts.TableEditPart;
import insert.diagram.edit.parts.TableNameEditPart;
import insert.diagram.edit.parts.TableTableFieldsCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class InsertVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "edu.aut.islab.insert.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (InsertSurfaceEditPart.MODEL_ID.equals(view.getType())) {
				return InsertSurfaceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return insert.diagram.part.InsertVisualIDRegistry.getVisualID(view.getType());
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
				InsertDiagramEditorPlugin.getInstance()
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
		if (InsertPackage.eINSTANCE.getInsertSurface().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((InsertSurface) domainElement)) {
			return InsertSurfaceEditPart.VISUAL_ID;
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
		String containerModelID = insert.diagram.part.InsertVisualIDRegistry.getModelID(containerView);
		if (!InsertSurfaceEditPart.MODEL_ID.equals(containerModelID) && !"imext".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (InsertSurfaceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = insert.diagram.part.InsertVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = InsertSurfaceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case InsertSurfaceEditPart.VISUAL_ID:
			if (InsertPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getInputInstalment().isSuperTypeOf(domainElement.eClass())) {
				return InputInstalmentEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getPrepareList().isSuperTypeOf(domainElement.eClass())) {
				return PrepareListEditPart.VISUAL_ID;
			}
			break;
		case TableTableFieldsCompartmentEditPart.VISUAL_ID:
			if (InsertPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return FieldEditPart.VISUAL_ID;
			}
			break;
		case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
			if (InsertPackage.eINSTANCE.getInputStringDef().isSuperTypeOf(domainElement.eClass())) {
				return InputStringDefEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getInputIntDef().isSuperTypeOf(domainElement.eClass())) {
				return InputIntDefEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getInputDateDef().isSuperTypeOf(domainElement.eClass())) {
				return InputDateDefEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getInputBitsDef().isSuperTypeOf(domainElement.eClass())) {
				return InputBitsDefEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getInputFloatDef().isSuperTypeOf(domainElement.eClass())) {
				return InputFloatDefEditPart.VISUAL_ID;
			}
			break;
		case PrepareListPrepareListNodesCompartmentEditPart.VISUAL_ID:
			if (InsertPackage.eINSTANCE.getCallSurfaceQuery().isSuperTypeOf(domainElement.eClass())) {
				return CallSurfaceQueryEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field3EditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return Literal2EditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteral2EditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return Function2EditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input2EditPart.VISUAL_ID;
			}
			break;
		case CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID:
			if (InsertPackage.eINSTANCE.getCallSurfaceQuery().isSuperTypeOf(domainElement.eClass())) {
				return CallSurfaceQuery2EditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field2EditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID:
			if (InsertPackage.eINSTANCE.getCallSurfaceQuery().isSuperTypeOf(domainElement.eClass())) {
				return CallSurfaceQuery2EditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field2EditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
			if (InsertPackage.eINSTANCE.getCallSurfaceQuery().isSuperTypeOf(domainElement.eClass())) {
				return CallSurfaceQuery2EditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field2EditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
			if (InsertPackage.eINSTANCE.getCallSurfaceQuery().isSuperTypeOf(domainElement.eClass())) {
				return CallSurfaceQuery2EditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getField().isSuperTypeOf(domainElement.eClass())) {
				return Field2EditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getLiteral().isSuperTypeOf(domainElement.eClass())) {
				return LiteralEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getNullLiteral().isSuperTypeOf(domainElement.eClass())) {
				return NullLiteralEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (InsertPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = insert.diagram.part.InsertVisualIDRegistry.getModelID(containerView);
		if (!InsertSurfaceEditPart.MODEL_ID.equals(containerModelID) && !"imext".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (InsertSurfaceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = insert.diagram.part.InsertVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = InsertSurfaceEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case InsertSurfaceEditPart.VISUAL_ID:
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputInstalmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrepareListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableEditPart.VISUAL_ID:
			if (TableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableFieldsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
		case PrepareListEditPart.VISUAL_ID:
			if (PrepareListNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrepareListPrepareListNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FieldEditPart.VISUAL_ID:
			if (FieldColumn_nameNameEditPart.VISUAL_ID == nodeVisualID) {
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
			if (FieldColumn_nameName2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (FunctionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionFunctionParamsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputEditPart.VISUAL_ID:
			if (InputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Field3EditPart.VISUAL_ID:
			if (FieldColumn_nameName3EditPart.VISUAL_ID == nodeVisualID) {
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
			if (FunctionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionFunctionParamsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Input2EditPart.VISUAL_ID:
			if (InputName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableFieldsCompartmentEditPart.VISUAL_ID:
			if (FieldEditPart.VISUAL_ID == nodeVisualID) {
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
		case PrepareListPrepareListNodesCompartmentEditPart.VISUAL_ID:
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
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(InsertSurface element) {
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
		case TableTableFieldsCompartmentEditPart.VISUAL_ID:
		case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
		case PrepareListPrepareListNodesCompartmentEditPart.VISUAL_ID:
		case CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID:
		case CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID:
		case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
		case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
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
		case InsertSurfaceEditPart.VISUAL_ID:
			return false;
		case InputStringDefEditPart.VISUAL_ID:
		case InputIntDefEditPart.VISUAL_ID:
		case InputDateDefEditPart.VISUAL_ID:
		case InputBitsDefEditPart.VISUAL_ID:
		case Field2EditPart.VISUAL_ID:
		case LiteralEditPart.VISUAL_ID:
		case NullLiteralEditPart.VISUAL_ID:
		case InputEditPart.VISUAL_ID:
		case Field3EditPart.VISUAL_ID:
		case Literal2EditPart.VISUAL_ID:
		case NullLiteral2EditPart.VISUAL_ID:
		case Input2EditPart.VISUAL_ID:
		case FieldEditPart.VISUAL_ID:
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
			return insert.diagram.part.InsertVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return insert.diagram.part.InsertVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return insert.diagram.part.InsertVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return insert.diagram.part.InsertVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return insert.diagram.part.InsertVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return insert.diagram.part.InsertVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
