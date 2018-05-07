/*
 * 
 */
package insert.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import insert.diagram.part.InsertVisualIDRegistry;

/**
 * @generated
 */
public class InsertEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (InsertVisualIDRegistry.getVisualID(view)) {

			case InsertSurfaceEditPart.VISUAL_ID:
				return new InsertSurfaceEditPart(view);

			case TableEditPart.VISUAL_ID:
				return new TableEditPart(view);

			case TableNameEditPart.VISUAL_ID:
				return new TableNameEditPart(view);

			case InputInstalmentEditPart.VISUAL_ID:
				return new InputInstalmentEditPart(view);

			case InputInstalmentNameEditPart.VISUAL_ID:
				return new InputInstalmentNameEditPart(view);

			case PrepareListEditPart.VISUAL_ID:
				return new PrepareListEditPart(view);

			case PrepareListNameEditPart.VISUAL_ID:
				return new PrepareListNameEditPart(view);

			case FieldEditPart.VISUAL_ID:
				return new FieldEditPart(view);

			case FieldColumn_nameNameEditPart.VISUAL_ID:
				return new FieldColumn_nameNameEditPart(view);

			case InputStringDefEditPart.VISUAL_ID:
				return new InputStringDefEditPart(view);

			case InputStringDefNameEditPart.VISUAL_ID:
				return new InputStringDefNameEditPart(view);

			case InputIntDefEditPart.VISUAL_ID:
				return new InputIntDefEditPart(view);

			case InputIntDefNameEditPart.VISUAL_ID:
				return new InputIntDefNameEditPart(view);

			case InputDateDefEditPart.VISUAL_ID:
				return new InputDateDefEditPart(view);

			case InputDateDefNameEditPart.VISUAL_ID:
				return new InputDateDefNameEditPart(view);

			case InputBitsDefEditPart.VISUAL_ID:
				return new InputBitsDefEditPart(view);

			case InputBitsDefNameEditPart.VISUAL_ID:
				return new InputBitsDefNameEditPart(view);

			case InputFloatDefEditPart.VISUAL_ID:
				return new InputFloatDefEditPart(view);

			case InputFloatDefNameEditPart.VISUAL_ID:
				return new InputFloatDefNameEditPart(view);

			case CallSurfaceQueryEditPart.VISUAL_ID:
				return new CallSurfaceQueryEditPart(view);

			case CallSurfaceQueryNameEditPart.VISUAL_ID:
				return new CallSurfaceQueryNameEditPart(view);

			case CallSurfaceQuery2EditPart.VISUAL_ID:
				return new CallSurfaceQuery2EditPart(view);

			case CallSurfaceQueryName2EditPart.VISUAL_ID:
				return new CallSurfaceQueryName2EditPart(view);

			case Field2EditPart.VISUAL_ID:
				return new Field2EditPart(view);

			case FieldColumn_nameName2EditPart.VISUAL_ID:
				return new FieldColumn_nameName2EditPart(view);

			case LiteralEditPart.VISUAL_ID:
				return new LiteralEditPart(view);

			case LiteralColumn_nameValueEditPart.VISUAL_ID:
				return new LiteralColumn_nameValueEditPart(view);

			case NullLiteralEditPart.VISUAL_ID:
				return new NullLiteralEditPart(view);

			case NullLiteralColumn_nameEditPart.VISUAL_ID:
				return new NullLiteralColumn_nameEditPart(view);

			case FunctionEditPart.VISUAL_ID:
				return new FunctionEditPart(view);

			case FunctionNameEditPart.VISUAL_ID:
				return new FunctionNameEditPart(view);

			case InputEditPart.VISUAL_ID:
				return new InputEditPart(view);

			case InputNameEditPart.VISUAL_ID:
				return new InputNameEditPart(view);

			case Field3EditPart.VISUAL_ID:
				return new Field3EditPart(view);

			case FieldColumn_nameName3EditPart.VISUAL_ID:
				return new FieldColumn_nameName3EditPart(view);

			case Literal2EditPart.VISUAL_ID:
				return new Literal2EditPart(view);

			case LiteralColumn_nameValue2EditPart.VISUAL_ID:
				return new LiteralColumn_nameValue2EditPart(view);

			case NullLiteral2EditPart.VISUAL_ID:
				return new NullLiteral2EditPart(view);

			case NullLiteralColumn_name2EditPart.VISUAL_ID:
				return new NullLiteralColumn_name2EditPart(view);

			case Function2EditPart.VISUAL_ID:
				return new Function2EditPart(view);

			case FunctionName2EditPart.VISUAL_ID:
				return new FunctionName2EditPart(view);

			case Input2EditPart.VISUAL_ID:
				return new Input2EditPart(view);

			case InputName2EditPart.VISUAL_ID:
				return new InputName2EditPart(view);

			case TableTableFieldsCompartmentEditPart.VISUAL_ID:
				return new TableTableFieldsCompartmentEditPart(view);

			case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
				return new InputInstalmentInputInstalmentInputsCompartmentEditPart(view);

			case PrepareListPrepareListNodesCompartmentEditPart.VISUAL_ID:
				return new PrepareListPrepareListNodesCompartmentEditPart(view);

			case CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID:
				return new CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart(view);

			case CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID:
				return new CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart(view);

			case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionParamsCompartmentEditPart(view);

			case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
				return new FunctionFunctionParamsCompartment2EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
