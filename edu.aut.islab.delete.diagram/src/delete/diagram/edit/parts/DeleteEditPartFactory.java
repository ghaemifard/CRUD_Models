/*
 * 
 */
package delete.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import delete.diagram.part.DeleteVisualIDRegistry;

/**
 * @generated
 */
public class DeleteEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DeleteVisualIDRegistry.getVisualID(view)) {

			case DeleteSurfaceEditPart.VISUAL_ID:
				return new DeleteSurfaceEditPart(view);

			case InputInstalmentEditPart.VISUAL_ID:
				return new InputInstalmentEditPart(view);

			case InputInstalmentNameEditPart.VISUAL_ID:
				return new InputInstalmentNameEditPart(view);

			case TableListInstalmentEditPart.VISUAL_ID:
				return new TableListInstalmentEditPart(view);

			case TableListInstalmentNameEditPart.VISUAL_ID:
				return new TableListInstalmentNameEditPart(view);

			case ConditionInstalmentEditPart.VISUAL_ID:
				return new ConditionInstalmentEditPart(view);

			case ConditionInstalmentNameEditPart.VISUAL_ID:
				return new ConditionInstalmentNameEditPart(view);

			case SortInstalmentEditPart.VISUAL_ID:
				return new SortInstalmentEditPart(view);

			case SortInstalmentNameEditPart.VISUAL_ID:
				return new SortInstalmentNameEditPart(view);

			case DummyEditPart.VISUAL_ID:
				return new DummyEditPart(view);

			case DummyNameEditPart.VISUAL_ID:
				return new DummyNameEditPart(view);

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

			case MyTableEditPart.VISUAL_ID:
				return new MyTableEditPart(view);

			case MyTableNameAliasEditPart.VISUAL_ID:
				return new MyTableNameAliasEditPart(view);

			case FieldEditPart.VISUAL_ID:
				return new FieldEditPart(view);

			case FieldColumn_nameEditPart.VISUAL_ID:
				return new FieldColumn_nameEditPart(view);

			case RootJunctionEditPart.VISUAL_ID:
				return new RootJunctionEditPart(view);

			case RootJunctionTypeEditPart.VISUAL_ID:
				return new RootJunctionTypeEditPart(view);

			case JunctionEditPart.VISUAL_ID:
				return new JunctionEditPart(view);

			case JunctionTypeEditPart.VISUAL_ID:
				return new JunctionTypeEditPart(view);

			case TermEditPart.VISUAL_ID:
				return new TermEditPart(view);

			case TermTitleEditPart.VISUAL_ID:
				return new TermTitleEditPart(view);

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

			case FieldColumn_name2EditPart.VISUAL_ID:
				return new FieldColumn_name2EditPart(view);

			case LiteralEditPart.VISUAL_ID:
				return new LiteralEditPart(view);

			case LiteralValueEditPart.VISUAL_ID:
				return new LiteralValueEditPart(view);

			case NullLiteralEditPart.VISUAL_ID:
				return new NullLiteralEditPart(view);

			case NullLiteralValueEditPart.VISUAL_ID:
				return new NullLiteralValueEditPart(view);

			case FunctionEditPart.VISUAL_ID:
				return new FunctionEditPart(view);

			case FunctionNameEditPart.VISUAL_ID:
				return new FunctionNameEditPart(view);

			case InputEditPart.VISUAL_ID:
				return new InputEditPart(view);

			case InputColumn_nameEditPart.VISUAL_ID:
				return new InputColumn_nameEditPart(view);

			case Field3EditPart.VISUAL_ID:
				return new Field3EditPart(view);

			case FieldColumn_name3EditPart.VISUAL_ID:
				return new FieldColumn_name3EditPart(view);

			case Literal2EditPart.VISUAL_ID:
				return new Literal2EditPart(view);

			case LiteralValue2EditPart.VISUAL_ID:
				return new LiteralValue2EditPart(view);

			case NullLiteral2EditPart.VISUAL_ID:
				return new NullLiteral2EditPart(view);

			case NullLiteralValue2EditPart.VISUAL_ID:
				return new NullLiteralValue2EditPart(view);

			case Function2EditPart.VISUAL_ID:
				return new Function2EditPart(view);

			case FunctionName2EditPart.VISUAL_ID:
				return new FunctionName2EditPart(view);

			case Input2EditPart.VISUAL_ID:
				return new Input2EditPart(view);

			case InputColumn_name2EditPart.VISUAL_ID:
				return new InputColumn_name2EditPart(view);

			case FieldSPointerEditPart.VISUAL_ID:
				return new FieldSPointerEditPart(view);

			case FieldSPointerNameEditPart.VISUAL_ID:
				return new FieldSPointerNameEditPart(view);

			case CallSurfaceQuery3EditPart.VISUAL_ID:
				return new CallSurfaceQuery3EditPart(view);

			case CallSurfaceQueryName3EditPart.VISUAL_ID:
				return new CallSurfaceQueryName3EditPart(view);

			case Field4EditPart.VISUAL_ID:
				return new Field4EditPart(view);

			case FieldColumn_name4EditPart.VISUAL_ID:
				return new FieldColumn_name4EditPart(view);

			case Literal3EditPart.VISUAL_ID:
				return new Literal3EditPart(view);

			case LiteralValue3EditPart.VISUAL_ID:
				return new LiteralValue3EditPart(view);

			case NullLiteral3EditPart.VISUAL_ID:
				return new NullLiteral3EditPart(view);

			case NullLiteralValue3EditPart.VISUAL_ID:
				return new NullLiteralValue3EditPart(view);

			case Function3EditPart.VISUAL_ID:
				return new Function3EditPart(view);

			case FunctionName3EditPart.VISUAL_ID:
				return new FunctionName3EditPart(view);

			case Input3EditPart.VISUAL_ID:
				return new Input3EditPart(view);

			case InputColumn_name3EditPart.VISUAL_ID:
				return new InputColumn_name3EditPart(view);

			case MyTable2EditPart.VISUAL_ID:
				return new MyTable2EditPart(view);

			case MyTableNameAlias2EditPart.VISUAL_ID:
				return new MyTableNameAlias2EditPart(view);

			case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
				return new InputInstalmentInputInstalmentInputsCompartmentEditPart(view);

			case TableListInstalmentTableListInstalmentTablesCompartmentEditPart.VISUAL_ID:
				return new TableListInstalmentTableListInstalmentTablesCompartmentEditPart(view);

			case MyTableMyTableFieldsCompartmentEditPart.VISUAL_ID:
				return new MyTableMyTableFieldsCompartmentEditPart(view);

			case ConditionInstalmentConditionInstalmentPartsCompartmentEditPart.VISUAL_ID:
				return new ConditionInstalmentConditionInstalmentPartsCompartmentEditPart(view);

			case TermTermParamsCompartmentEditPart.VISUAL_ID:
				return new TermTermParamsCompartmentEditPart(view);

			case CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID:
				return new CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart(view);

			case CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID:
				return new CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart(view);

			case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionParamsCompartmentEditPart(view);

			case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
				return new FunctionFunctionParamsCompartment2EditPart(view);

			case SortInstalmentSortInstalmentPointersCompartmentEditPart.VISUAL_ID:
				return new SortInstalmentSortInstalmentPointersCompartmentEditPart(view);

			case DummyDummyPartsCompartmentEditPart.VISUAL_ID:
				return new DummyDummyPartsCompartmentEditPart(view);

			case CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart.VISUAL_ID:
				return new CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart(view);

			case FunctionFunctionParamsCompartment3EditPart.VISUAL_ID:
				return new FunctionFunctionParamsCompartment3EditPart(view);

			case MyTableMyTableFieldsCompartment2EditPart.VISUAL_ID:
				return new MyTableMyTableFieldsCompartment2EditPart(view);

			case InnerjoinRelsEditPart.VISUAL_ID:
				return new InnerjoinRelsEditPart(view);

			case InnerjoinRelsTypeEditPart.VISUAL_ID:
				return new InnerjoinRelsTypeEditPart(view);

			case LeftOuterJoinRelsEditPart.VISUAL_ID:
				return new LeftOuterJoinRelsEditPart(view);

			case LeftOuterJoinRelsTypeEditPart.VISUAL_ID:
				return new LeftOuterJoinRelsTypeEditPart(view);

			case RightOuterJoinRelsEditPart.VISUAL_ID:
				return new RightOuterJoinRelsEditPart(view);

			case RightOuterJoinRelsTypeEditPart.VISUAL_ID:
				return new RightOuterJoinRelsTypeEditPart(view);

			case FullOuterJoinRelsEditPart.VISUAL_ID:
				return new FullOuterJoinRelsEditPart(view);

			case FullOuterJoinRelsTypeEditPart.VISUAL_ID:
				return new FullOuterJoinRelsTypeEditPart(view);

			case EqualLinkEditPart.VISUAL_ID:
				return new EqualLinkEditPart(view);

			case EqualLinkDescEditPart.VISUAL_ID:
				return new EqualLinkDescEditPart(view);

			case GreaterThanLinkEditPart.VISUAL_ID:
				return new GreaterThanLinkEditPart(view);

			case GreaterThanLinkDescEditPart.VISUAL_ID:
				return new GreaterThanLinkDescEditPart(view);

			case GreaterEqualThanLinkEditPart.VISUAL_ID:
				return new GreaterEqualThanLinkEditPart(view);

			case GreaterEqualThanLinkDescEditPart.VISUAL_ID:
				return new GreaterEqualThanLinkDescEditPart(view);

			case LowerThanLinkEditPart.VISUAL_ID:
				return new LowerThanLinkEditPart(view);

			case LowerThanLinkDescEditPart.VISUAL_ID:
				return new LowerThanLinkDescEditPart(view);

			case LowerEqualThanLinkEditPart.VISUAL_ID:
				return new LowerEqualThanLinkEditPart(view);

			case LowerEqualThanLinkDescEditPart.VISUAL_ID:
				return new LowerEqualThanLinkDescEditPart(view);

			case InLinkEditPart.VISUAL_ID:
				return new InLinkEditPart(view);

			case InLinkDescEditPart.VISUAL_ID:
				return new InLinkDescEditPart(view);

			case LikeLinkEditPart.VISUAL_ID:
				return new LikeLinkEditPart(view);

			case LikeLinkDescEditPart.VISUAL_ID:
				return new LikeLinkDescEditPart(view);

			case JuncRelationshipEditPart.VISUAL_ID:
				return new JuncRelationshipEditPart(view);

			case JuncRelationshipIndexEditPart.VISUAL_ID:
				return new JuncRelationshipIndexEditPart(view);

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
