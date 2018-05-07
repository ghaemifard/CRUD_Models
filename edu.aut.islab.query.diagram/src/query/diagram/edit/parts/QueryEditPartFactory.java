/*
 * 
 */
package query.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import query.diagram.part.QueryVisualIDRegistry;

/**
 * @generated
 */
public class QueryEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (QueryVisualIDRegistry.getVisualID(view)) {

			case QuerySurfaceEditPart.VISUAL_ID:
				return new QuerySurfaceEditPart(view);

			case WhereInstalmentEditPart.VISUAL_ID:
				return new WhereInstalmentEditPart(view);

			case WhereInstalmentNameEditPart.VISUAL_ID:
				return new WhereInstalmentNameEditPart(view);

			case HavingInstalmentEditPart.VISUAL_ID:
				return new HavingInstalmentEditPart(view);

			case HavingInstalmentNameEditPart.VISUAL_ID:
				return new HavingInstalmentNameEditPart(view);

			case OutputInstalmentEditPart.VISUAL_ID:
				return new OutputInstalmentEditPart(view);

			case OutputInstalmentNameEditPart.VISUAL_ID:
				return new OutputInstalmentNameEditPart(view);

			case InputInstalmentEditPart.VISUAL_ID:
				return new InputInstalmentEditPart(view);

			case InputInstalmentNameEditPart.VISUAL_ID:
				return new InputInstalmentNameEditPart(view);

			case GroupInstalmentEditPart.VISUAL_ID:
				return new GroupInstalmentEditPart(view);

			case GroupInstalmentNameEditPart.VISUAL_ID:
				return new GroupInstalmentNameEditPart(view);

			case SortInstalmentEditPart.VISUAL_ID:
				return new SortInstalmentEditPart(view);

			case SortInstalmentNameEditPart.VISUAL_ID:
				return new SortInstalmentNameEditPart(view);

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

			case CallQuerySurfaceEditPart.VISUAL_ID:
				return new CallQuerySurfaceEditPart(view);

			case CallQuerySurfaceColumn_nameNameEditPart.VISUAL_ID:
				return new CallQuerySurfaceColumn_nameNameEditPart(view);

			case CallQuerySurface2EditPart.VISUAL_ID:
				return new CallQuerySurface2EditPart(view);

			case CallQuerySurfaceColumn_nameName2EditPart.VISUAL_ID:
				return new CallQuerySurfaceColumn_nameName2EditPart(view);

			case FieldEditPart.VISUAL_ID:
				return new FieldEditPart(view);

			case FieldNameEditPart.VISUAL_ID:
				return new FieldNameEditPart(view);

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

			case FunctionColumn_nameNameEditPart.VISUAL_ID:
				return new FunctionColumn_nameNameEditPart(view);

			case InputEditPart.VISUAL_ID:
				return new InputEditPart(view);

			case InputColumn_nameEditPart.VISUAL_ID:
				return new InputColumn_nameEditPart(view);

			case Field2EditPart.VISUAL_ID:
				return new Field2EditPart(view);

			case FieldName2EditPart.VISUAL_ID:
				return new FieldName2EditPart(view);

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

			case FunctionColumn_nameName2EditPart.VISUAL_ID:
				return new FunctionColumn_nameName2EditPart(view);

			case Input2EditPart.VISUAL_ID:
				return new Input2EditPart(view);

			case InputColumn_name2EditPart.VISUAL_ID:
				return new InputColumn_name2EditPart(view);

			case CallQuerySurface3EditPart.VISUAL_ID:
				return new CallQuerySurface3EditPart(view);

			case CallQuerySurfaceColumn_nameName3EditPart.VISUAL_ID:
				return new CallQuerySurfaceColumn_nameName3EditPart(view);

			case Field3EditPart.VISUAL_ID:
				return new Field3EditPart(view);

			case FieldName3EditPart.VISUAL_ID:
				return new FieldName3EditPart(view);

			case Literal3EditPart.VISUAL_ID:
				return new Literal3EditPart(view);

			case LiteralColumn_nameValue3EditPart.VISUAL_ID:
				return new LiteralColumn_nameValue3EditPart(view);

			case NullLiteral3EditPart.VISUAL_ID:
				return new NullLiteral3EditPart(view);

			case NullLiteralColumn_name3EditPart.VISUAL_ID:
				return new NullLiteralColumn_name3EditPart(view);

			case Function3EditPart.VISUAL_ID:
				return new Function3EditPart(view);

			case FunctionColumn_nameName3EditPart.VISUAL_ID:
				return new FunctionColumn_nameName3EditPart(view);

			case Input3EditPart.VISUAL_ID:
				return new Input3EditPart(view);

			case InputColumn_name3EditPart.VISUAL_ID:
				return new InputColumn_name3EditPart(view);

			case MyTableEditPart.VISUAL_ID:
				return new MyTableEditPart(view);

			case MyTableNameAliasEditPart.VISUAL_ID:
				return new MyTableNameAliasEditPart(view);

			case Field4EditPart.VISUAL_ID:
				return new Field4EditPart(view);

			case FieldName4EditPart.VISUAL_ID:
				return new FieldName4EditPart(view);

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

			case FieldGPointerEditPart.VISUAL_ID:
				return new FieldGPointerEditPart(view);

			case FieldGPointerNameEditPart.VISUAL_ID:
				return new FieldGPointerNameEditPart(view);

			case FieldSPointerEditPart.VISUAL_ID:
				return new FieldSPointerEditPart(view);

			case FieldSPointerNameEditPart.VISUAL_ID:
				return new FieldSPointerNameEditPart(view);

			case WhereInstalmentWhereInstalmentPartsCompartmentEditPart.VISUAL_ID:
				return new WhereInstalmentWhereInstalmentPartsCompartmentEditPart(view);

			case TermTermParamsCompartmentEditPart.VISUAL_ID:
				return new TermTermParamsCompartmentEditPart(view);

			case CallQuerySurfaceCallQuerySurfaceParamsCompartmentEditPart.VISUAL_ID:
				return new CallQuerySurfaceCallQuerySurfaceParamsCompartmentEditPart(view);

			case CallQuerySurfaceCallQuerySurfaceParamsCompartment2EditPart.VISUAL_ID:
				return new CallQuerySurfaceCallQuerySurfaceParamsCompartment2EditPart(view);

			case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionParamsCompartmentEditPart(view);

			case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
				return new FunctionFunctionParamsCompartment2EditPart(view);

			case HavingInstalmentHavingInstalmentPartsCompartmentEditPart.VISUAL_ID:
				return new HavingInstalmentHavingInstalmentPartsCompartmentEditPart(view);

			case OutputInstalmentOutputInstalmentNodesCompartmentEditPart.VISUAL_ID:
				return new OutputInstalmentOutputInstalmentNodesCompartmentEditPart(view);

			case CallQuerySurfaceCallQuerySurfaceParamsCompartment3EditPart.VISUAL_ID:
				return new CallQuerySurfaceCallQuerySurfaceParamsCompartment3EditPart(view);

			case FunctionFunctionParamsCompartment3EditPart.VISUAL_ID:
				return new FunctionFunctionParamsCompartment3EditPart(view);

			case MyTableMyTableFieldsCompartmentEditPart.VISUAL_ID:
				return new MyTableMyTableFieldsCompartmentEditPart(view);

			case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
				return new InputInstalmentInputInstalmentInputsCompartmentEditPart(view);

			case GroupInstalmentGroupInstalmentPointersCompartmentEditPart.VISUAL_ID:
				return new GroupInstalmentGroupInstalmentPointersCompartmentEditPart(view);

			case SortInstalmentSortInstalmentPointersCompartmentEditPart.VISUAL_ID:
				return new SortInstalmentSortInstalmentPointersCompartmentEditPart(view);

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
