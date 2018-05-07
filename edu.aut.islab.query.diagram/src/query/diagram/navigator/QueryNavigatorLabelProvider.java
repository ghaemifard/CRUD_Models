/*
* 
*/
package query.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import query.QuerySurface;
import query.diagram.edit.parts.*;
import query.diagram.edit.parts.CallQuerySurface2EditPart;
import query.diagram.edit.parts.CallQuerySurface3EditPart;
import query.diagram.edit.parts.CallQuerySurfaceEditPart;
import query.diagram.edit.parts.CallQuerySurfaceName2EditPart;
import query.diagram.edit.parts.CallQuerySurfaceName3EditPart;
import query.diagram.edit.parts.CallQuerySurfaceNameEditPart;
import query.diagram.edit.parts.EqualLinkDescEditPart;
import query.diagram.edit.parts.EqualLinkEditPart;
import query.diagram.edit.parts.Field2EditPart;
import query.diagram.edit.parts.Field3EditPart;
import query.diagram.edit.parts.Field4EditPart;
import query.diagram.edit.parts.FieldEditPart;
import query.diagram.edit.parts.FieldGPointerEditPart;
import query.diagram.edit.parts.FieldGPointerNameEditPart;
import query.diagram.edit.parts.FieldName2EditPart;
import query.diagram.edit.parts.FieldName3EditPart;
import query.diagram.edit.parts.FieldName4EditPart;
import query.diagram.edit.parts.FieldNameEditPart;
import query.diagram.edit.parts.FieldSPointerEditPart;
import query.diagram.edit.parts.FieldSPointerNameEditPart;
import query.diagram.edit.parts.FullOuterJoinRelsEditPart;
import query.diagram.edit.parts.FullOuterJoinRelsTypeEditPart;
import query.diagram.edit.parts.Function2EditPart;
import query.diagram.edit.parts.Function3EditPart;
import query.diagram.edit.parts.FunctionEditPart;
import query.diagram.edit.parts.FunctionName2EditPart;
import query.diagram.edit.parts.FunctionName3EditPart;
import query.diagram.edit.parts.FunctionNameEditPart;
import query.diagram.edit.parts.GreaterEqualThanLinkDescEditPart;
import query.diagram.edit.parts.GreaterEqualThanLinkEditPart;
import query.diagram.edit.parts.GreaterThanLinkDescEditPart;
import query.diagram.edit.parts.GreaterThanLinkEditPart;
import query.diagram.edit.parts.GroupInstalmentEditPart;
import query.diagram.edit.parts.GroupInstalmentNameEditPart;
import query.diagram.edit.parts.HavingInstalmentEditPart;
import query.diagram.edit.parts.HavingInstalmentNameEditPart;
import query.diagram.edit.parts.InLinkDescEditPart;
import query.diagram.edit.parts.InLinkEditPart;
import query.diagram.edit.parts.InnerjoinRelsEditPart;
import query.diagram.edit.parts.InnerjoinRelsTypeEditPart;
import query.diagram.edit.parts.Input2EditPart;
import query.diagram.edit.parts.Input3EditPart;
import query.diagram.edit.parts.InputBitsDefEditPart;
import query.diagram.edit.parts.InputBitsDefNameEditPart;
import query.diagram.edit.parts.InputDateDefEditPart;
import query.diagram.edit.parts.InputDateDefNameEditPart;
import query.diagram.edit.parts.InputEditPart;
import query.diagram.edit.parts.InputInstalmentEditPart;
import query.diagram.edit.parts.InputInstalmentNameEditPart;
import query.diagram.edit.parts.InputIntDefEditPart;
import query.diagram.edit.parts.InputIntDefNameEditPart;
import query.diagram.edit.parts.InputName2EditPart;
import query.diagram.edit.parts.InputName3EditPart;
import query.diagram.edit.parts.InputNameEditPart;
import query.diagram.edit.parts.InputStringDefEditPart;
import query.diagram.edit.parts.InputStringDefNameEditPart;
import query.diagram.edit.parts.JuncRelationshipEditPart;
import query.diagram.edit.parts.JuncRelationshipIndexEditPart;
import query.diagram.edit.parts.JunctionEditPart;
import query.diagram.edit.parts.JunctionTypeEditPart;
import query.diagram.edit.parts.LeftOuterJoinRelsEditPart;
import query.diagram.edit.parts.LeftOuterJoinRelsTypeEditPart;
import query.diagram.edit.parts.LikeLinkDescEditPart;
import query.diagram.edit.parts.LikeLinkEditPart;
import query.diagram.edit.parts.Literal2EditPart;
import query.diagram.edit.parts.Literal3EditPart;
import query.diagram.edit.parts.LiteralEditPart;
import query.diagram.edit.parts.LiteralValue2EditPart;
import query.diagram.edit.parts.LiteralValue3EditPart;
import query.diagram.edit.parts.LiteralValueEditPart;
import query.diagram.edit.parts.LowerEqualThanLinkDescEditPart;
import query.diagram.edit.parts.LowerEqualThanLinkEditPart;
import query.diagram.edit.parts.LowerThanLinkDescEditPart;
import query.diagram.edit.parts.LowerThanLinkEditPart;
import query.diagram.edit.parts.MyTableEditPart;
import query.diagram.edit.parts.MyTableNameAliasEditPart;
import query.diagram.edit.parts.NullLiteral2EditPart;
import query.diagram.edit.parts.NullLiteral3EditPart;
import query.diagram.edit.parts.NullLiteralEditPart;
import query.diagram.edit.parts.NullLiteralValue2EditPart;
import query.diagram.edit.parts.NullLiteralValue3EditPart;
import query.diagram.edit.parts.NullLiteralValueEditPart;
import query.diagram.edit.parts.OutputInstalmentEditPart;
import query.diagram.edit.parts.OutputInstalmentNameEditPart;
import query.diagram.edit.parts.QuerySurfaceEditPart;
import query.diagram.edit.parts.RightOuterJoinRelsEditPart;
import query.diagram.edit.parts.RightOuterJoinRelsTypeEditPart;
import query.diagram.edit.parts.RootJunctionEditPart;
import query.diagram.edit.parts.RootJunctionTypeEditPart;
import query.diagram.edit.parts.SortInstalmentEditPart;
import query.diagram.edit.parts.SortInstalmentNameEditPart;
import query.diagram.edit.parts.TermEditPart;
import query.diagram.edit.parts.TermTitleEditPart;
import query.diagram.edit.parts.WhereInstalmentEditPart;
import query.diagram.edit.parts.WhereInstalmentNameEditPart;
import query.diagram.part.QueryDiagramEditorPlugin;
import query.diagram.part.QueryVisualIDRegistry;
import query.diagram.providers.QueryElementTypes;
import query.diagram.providers.QueryParserProvider;

/**
 * @generated
 */
public class QueryNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		QueryDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		QueryDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof QueryNavigatorItem && !isOwnView(((QueryNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof QueryNavigatorGroup) {
			QueryNavigatorGroup group = (QueryNavigatorGroup) element;
			return QueryDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof QueryNavigatorItem) {
			QueryNavigatorItem navigatorItem = (QueryNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (QueryVisualIDRegistry.getVisualID(view)) {
		case QuerySurfaceEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.query.this.is/v1.0/beta?QuerySurface", //$NON-NLS-1$
					QueryElementTypes.QuerySurface_1000);
		case WhereInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.query.this.is/v1.0/beta?WhereInstalment", //$NON-NLS-1$
					QueryElementTypes.WhereInstalment_2001);
		case HavingInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.query.this.is/v1.0/beta?HavingInstalment", //$NON-NLS-1$
					QueryElementTypes.HavingInstalment_2002);
		case OutputInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.query.this.is/v1.0/beta?OutputInstalment", //$NON-NLS-1$
					QueryElementTypes.OutputInstalment_2003);
		case InputInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.query.this.is/v1.0/beta?InputInstalment", //$NON-NLS-1$
					QueryElementTypes.InputInstalment_2004);
		case GroupInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.query.this.is/v1.0/beta?GroupInstalment", //$NON-NLS-1$
					QueryElementTypes.GroupInstalment_2005);
		case SortInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.query.this.is/v1.0/beta?SortInstalment", //$NON-NLS-1$
					QueryElementTypes.SortInstalment_2006);
		case RootJunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?RootJunction", //$NON-NLS-1$
					QueryElementTypes.RootJunction_3001);
		case JunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Junction", //$NON-NLS-1$
					QueryElementTypes.Junction_3002);
		case TermEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Term", QueryElementTypes.Term_3003); //$NON-NLS-1$
		case CallQuerySurfaceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?CallQuerySurface", //$NON-NLS-1$
					QueryElementTypes.CallQuerySurface_3004);
		case CallQuerySurface2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?CallQuerySurface", //$NON-NLS-1$
					QueryElementTypes.CallQuerySurface_3005);
		case FieldEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Field", QueryElementTypes.Field_3006); //$NON-NLS-1$
		case LiteralEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Literal", //$NON-NLS-1$
					QueryElementTypes.Literal_3007);
		case NullLiteralEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?NullLiteral", //$NON-NLS-1$
					QueryElementTypes.NullLiteral_3008);
		case FunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Function", //$NON-NLS-1$
					QueryElementTypes.Function_3009);
		case InputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Input", QueryElementTypes.Input_3010); //$NON-NLS-1$
		case Field2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Field", QueryElementTypes.Field_3011); //$NON-NLS-1$
		case Literal2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Literal", //$NON-NLS-1$
					QueryElementTypes.Literal_3012);
		case NullLiteral2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?NullLiteral", //$NON-NLS-1$
					QueryElementTypes.NullLiteral_3013);
		case Function2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Function", //$NON-NLS-1$
					QueryElementTypes.Function_3014);
		case Input2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Input", QueryElementTypes.Input_3015); //$NON-NLS-1$
		case CallQuerySurface3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?CallQuerySurface", //$NON-NLS-1$
					QueryElementTypes.CallQuerySurface_3016);
		case Field3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Field", QueryElementTypes.Field_3017); //$NON-NLS-1$
		case Literal3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Literal", //$NON-NLS-1$
					QueryElementTypes.Literal_3018);
		case NullLiteral3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?NullLiteral", //$NON-NLS-1$
					QueryElementTypes.NullLiteral_3019);
		case Function3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Function", //$NON-NLS-1$
					QueryElementTypes.Function_3020);
		case Input3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Input", QueryElementTypes.Input_3021); //$NON-NLS-1$
		case MyTableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?MyTable", //$NON-NLS-1$
					QueryElementTypes.MyTable_3022);
		case Field4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?Field", QueryElementTypes.Field_3023); //$NON-NLS-1$
		case InputStringDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?InputStringDef", //$NON-NLS-1$
					QueryElementTypes.InputStringDef_3024);
		case InputIntDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?InputIntDef", //$NON-NLS-1$
					QueryElementTypes.InputIntDef_3025);
		case InputDateDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?InputDateDef", //$NON-NLS-1$
					QueryElementTypes.InputDateDef_3026);
		case InputBitsDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?InputBitsDef", //$NON-NLS-1$
					QueryElementTypes.InputBitsDef_3027);
		case FieldGPointerEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?FieldGPointer", //$NON-NLS-1$
					QueryElementTypes.FieldGPointer_3030);
		case FieldSPointerEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?FieldSPointer", //$NON-NLS-1$
					QueryElementTypes.FieldSPointer_3031);
		case InputFloatDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.query.this.is/v1.0/beta?InputFloatDef", //$NON-NLS-1$
					QueryElementTypes.InputFloatDef_3032);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.query.this.is/v1.0/beta?InnerjoinRels", //$NON-NLS-1$
					QueryElementTypes.InnerjoinRels_4001);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.query.this.is/v1.0/beta?LeftOuterJoinRels", //$NON-NLS-1$
					QueryElementTypes.LeftOuterJoinRels_4002);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.query.this.is/v1.0/beta?RightOuterJoinRels", //$NON-NLS-1$
					QueryElementTypes.RightOuterJoinRels_4003);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.query.this.is/v1.0/beta?FullOuterJoinRels", //$NON-NLS-1$
					QueryElementTypes.FullOuterJoinRels_4004);
		case EqualLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.query.this.is/v1.0/beta?EqualLink", //$NON-NLS-1$
					QueryElementTypes.EqualLink_4005);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.query.this.is/v1.0/beta?GreaterThanLink", //$NON-NLS-1$
					QueryElementTypes.GreaterThanLink_4006);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.query.this.is/v1.0/beta?GreaterEqualThanLink", //$NON-NLS-1$
					QueryElementTypes.GreaterEqualThanLink_4007);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.query.this.is/v1.0/beta?LowerThanLink", //$NON-NLS-1$
					QueryElementTypes.LowerThanLink_4008);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.query.this.is/v1.0/beta?LowerEqualThanLink", //$NON-NLS-1$
					QueryElementTypes.LowerEqualThanLink_4009);
		case InLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.query.this.is/v1.0/beta?InLink", QueryElementTypes.InLink_4010); //$NON-NLS-1$
		case LikeLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.query.this.is/v1.0/beta?LikeLink", //$NON-NLS-1$
					QueryElementTypes.LikeLink_4011);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.query.this.is/v1.0/beta?JuncRelationship", //$NON-NLS-1$
					QueryElementTypes.JuncRelationship_4012);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = QueryDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && QueryElementTypes.isKnownElementType(elementType)) {
			image = QueryElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof QueryNavigatorGroup) {
			QueryNavigatorGroup group = (QueryNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof QueryNavigatorItem) {
			QueryNavigatorItem navigatorItem = (QueryNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (QueryVisualIDRegistry.getVisualID(view)) {
		case QuerySurfaceEditPart.VISUAL_ID:
			return getQuerySurface_1000Text(view);
		case WhereInstalmentEditPart.VISUAL_ID:
			return getWhereInstalment_2001Text(view);
		case HavingInstalmentEditPart.VISUAL_ID:
			return getHavingInstalment_2002Text(view);
		case OutputInstalmentEditPart.VISUAL_ID:
			return getOutputInstalment_2003Text(view);
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2004Text(view);
		case GroupInstalmentEditPart.VISUAL_ID:
			return getGroupInstalment_2005Text(view);
		case SortInstalmentEditPart.VISUAL_ID:
			return getSortInstalment_2006Text(view);
		case RootJunctionEditPart.VISUAL_ID:
			return getRootJunction_3001Text(view);
		case JunctionEditPart.VISUAL_ID:
			return getJunction_3002Text(view);
		case TermEditPart.VISUAL_ID:
			return getTerm_3003Text(view);
		case CallQuerySurfaceEditPart.VISUAL_ID:
			return getCallQuerySurface_3004Text(view);
		case CallQuerySurface2EditPart.VISUAL_ID:
			return getCallQuerySurface_3005Text(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3006Text(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3007Text(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3008Text(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3009Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3010Text(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3011Text(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3012Text(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3013Text(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3014Text(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3015Text(view);
		case CallQuerySurface3EditPart.VISUAL_ID:
			return getCallQuerySurface_3016Text(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3017Text(view);
		case Literal3EditPart.VISUAL_ID:
			return getLiteral_3018Text(view);
		case NullLiteral3EditPart.VISUAL_ID:
			return getNullLiteral_3019Text(view);
		case Function3EditPart.VISUAL_ID:
			return getFunction_3020Text(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3021Text(view);
		case MyTableEditPart.VISUAL_ID:
			return getMyTable_3022Text(view);
		case Field4EditPart.VISUAL_ID:
			return getField_3023Text(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3024Text(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3025Text(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3026Text(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3027Text(view);
		case FieldGPointerEditPart.VISUAL_ID:
			return getFieldGPointer_3030Text(view);
		case FieldSPointerEditPart.VISUAL_ID:
			return getFieldSPointer_3031Text(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3032Text(view);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getInnerjoinRels_4001Text(view);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getLeftOuterJoinRels_4002Text(view);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getRightOuterJoinRels_4003Text(view);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getFullOuterJoinRels_4004Text(view);
		case EqualLinkEditPart.VISUAL_ID:
			return getEqualLink_4005Text(view);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getGreaterThanLink_4006Text(view);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getGreaterEqualThanLink_4007Text(view);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getLowerThanLink_4008Text(view);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getLowerEqualThanLink_4009Text(view);
		case InLinkEditPart.VISUAL_ID:
			return getInLink_4010Text(view);
		case LikeLinkEditPart.VISUAL_ID:
			return getLikeLink_4011Text(view);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getJuncRelationship_4012Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getQuerySurface_1000Text(View view) {
		QuerySurface domainModelElement = (QuerySurface) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhereInstalment_2001Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.WhereInstalment_2001,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(WhereInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHavingInstalment_2002Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.HavingInstalment_2002,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(HavingInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOutputInstalment_2003Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.OutputInstalment_2003,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(OutputInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputInstalment_2004Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.InputInstalment_2004,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(InputInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroupInstalment_2005Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.GroupInstalment_2005,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(GroupInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSortInstalment_2006Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.SortInstalment_2006,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(SortInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRootJunction_3001Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.RootJunction_3001,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(RootJunctionTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJunction_3002Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Junction_3002,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(JunctionTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTerm_3003Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Term_3003,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(TermTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallQuerySurface_3004Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.CallQuerySurface_3004,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(CallQuerySurfaceColumn_nameNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallQuerySurface_3005Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.CallQuerySurface_3005,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(CallQuerySurfaceColumn_nameName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3006Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Field_3006,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(FieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLiteral_3007Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Literal_3007,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(LiteralColumn_nameValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNullLiteral_3008Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.NullLiteral_3008,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(NullLiteralColumn_nameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_3009Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Function_3009,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(FunctionColumn_nameNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3010Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Input_3010,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(InputColumn_nameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3011Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Field_3011,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(FieldName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLiteral_3012Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Literal_3012,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(LiteralColumn_nameValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNullLiteral_3013Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.NullLiteral_3013,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(NullLiteralColumn_name2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_3014Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Function_3014,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(FunctionColumn_nameName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3015Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Input_3015,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(InputColumn_name2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallQuerySurface_3016Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.CallQuerySurface_3016,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(CallQuerySurfaceColumn_nameName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3017Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Field_3017,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(FieldName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLiteral_3018Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Literal_3018,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(LiteralColumn_nameValue3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNullLiteral_3019Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.NullLiteral_3019,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(NullLiteralColumn_name3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_3020Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Function_3020,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(FunctionColumn_nameName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3021Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Input_3021,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(InputColumn_name3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMyTable_3022Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.MyTable_3022,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(MyTableNameAliasEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3023Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.Field_3023,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(FieldName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputStringDef_3024Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.InputStringDef_3024,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(InputStringDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputIntDef_3025Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.InputIntDef_3025,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(InputIntDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputDateDef_3026Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.InputDateDef_3026,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(InputDateDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputBitsDef_3027Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.InputBitsDef_3027,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(InputBitsDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFieldGPointer_3030Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.FieldGPointer_3030,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(FieldGPointerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFieldSPointer_3031Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.FieldSPointer_3031,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(FieldSPointerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputFloatDef_3032Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.InputFloatDef_3032,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(InputFloatDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInnerjoinRels_4001Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.InnerjoinRels_4001,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(InnerjoinRelsTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLeftOuterJoinRels_4002Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.LeftOuterJoinRels_4002,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(LeftOuterJoinRelsTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRightOuterJoinRels_4003Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.RightOuterJoinRels_4003,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(RightOuterJoinRelsTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFullOuterJoinRels_4004Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.FullOuterJoinRels_4004,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(FullOuterJoinRelsTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEqualLink_4005Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.EqualLink_4005,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(EqualLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGreaterThanLink_4006Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.GreaterThanLink_4006,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(GreaterThanLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGreaterEqualThanLink_4007Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.GreaterEqualThanLink_4007,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(GreaterEqualThanLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLowerThanLink_4008Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.LowerThanLink_4008,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(LowerThanLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLowerEqualThanLink_4009Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.LowerEqualThanLink_4009,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(LowerEqualThanLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInLink_4010Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.InLink_4010,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(InLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLikeLink_4011Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.LikeLink_4011,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(LikeLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJuncRelationship_4012Text(View view) {
		IParser parser = QueryParserProvider.getParser(QueryElementTypes.JuncRelationship_4012,
				view.getElement() != null ? view.getElement() : view,
				QueryVisualIDRegistry.getType(JuncRelationshipIndexEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QueryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return QuerySurfaceEditPart.MODEL_ID.equals(QueryVisualIDRegistry.getModelID(view));
	}

}
