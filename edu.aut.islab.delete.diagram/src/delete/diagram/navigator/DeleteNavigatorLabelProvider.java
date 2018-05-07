/*
* 
*/
package delete.diagram.navigator;

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

import delete.DeleteSurface;
import delete.diagram.edit.parts.*;
import delete.diagram.edit.parts.CallSurfaceQuery2EditPart;
import delete.diagram.edit.parts.CallSurfaceQuery3EditPart;
import delete.diagram.edit.parts.CallSurfaceQueryColumn_nameName2EditPart;
import delete.diagram.edit.parts.CallSurfaceQueryColumn_nameName3EditPart;
import delete.diagram.edit.parts.CallSurfaceQueryColumn_nameNameEditPart;
import delete.diagram.edit.parts.CallSurfaceQueryEditPart;
import delete.diagram.edit.parts.ConditionInstalmentEditPart;
import delete.diagram.edit.parts.ConditionInstalmentNameEditPart;
import delete.diagram.edit.parts.DeleteSurfaceEditPart;
import delete.diagram.edit.parts.DummyEditPart;
import delete.diagram.edit.parts.DummyNameEditPart;
import delete.diagram.edit.parts.EqualLinkDescEditPart;
import delete.diagram.edit.parts.EqualLinkEditPart;
import delete.diagram.edit.parts.Field2EditPart;
import delete.diagram.edit.parts.Field3EditPart;
import delete.diagram.edit.parts.Field4EditPart;
import delete.diagram.edit.parts.FieldColumn_nameName2EditPart;
import delete.diagram.edit.parts.FieldColumn_nameName3EditPart;
import delete.diagram.edit.parts.FieldColumn_nameName4EditPart;
import delete.diagram.edit.parts.FieldColumn_nameNameEditPart;
import delete.diagram.edit.parts.FieldEditPart;
import delete.diagram.edit.parts.FieldSPointerEditPart;
import delete.diagram.edit.parts.FieldSPointerNameEditPart;
import delete.diagram.edit.parts.FullOuterJoinRelsEditPart;
import delete.diagram.edit.parts.FullOuterJoinRelsTypeEditPart;
import delete.diagram.edit.parts.Function2EditPart;
import delete.diagram.edit.parts.Function3EditPart;
import delete.diagram.edit.parts.FunctionColumn_nameName2EditPart;
import delete.diagram.edit.parts.FunctionColumn_nameName3EditPart;
import delete.diagram.edit.parts.FunctionColumn_nameNameEditPart;
import delete.diagram.edit.parts.FunctionEditPart;
import delete.diagram.edit.parts.GreaterEqualThanLinkDescEditPart;
import delete.diagram.edit.parts.GreaterEqualThanLinkEditPart;
import delete.diagram.edit.parts.GreaterThanLinkDescEditPart;
import delete.diagram.edit.parts.GreaterThanLinkEditPart;
import delete.diagram.edit.parts.InLinkDescEditPart;
import delete.diagram.edit.parts.InLinkEditPart;
import delete.diagram.edit.parts.InnerjoinRelsEditPart;
import delete.diagram.edit.parts.InnerjoinRelsTypeEditPart;
import delete.diagram.edit.parts.Input2EditPart;
import delete.diagram.edit.parts.Input3EditPart;
import delete.diagram.edit.parts.InputBitsDefEditPart;
import delete.diagram.edit.parts.InputBitsDefNameEditPart;
import delete.diagram.edit.parts.InputColumn_name2EditPart;
import delete.diagram.edit.parts.InputColumn_name3EditPart;
import delete.diagram.edit.parts.InputColumn_nameEditPart;
import delete.diagram.edit.parts.InputDateDefEditPart;
import delete.diagram.edit.parts.InputDateDefNameEditPart;
import delete.diagram.edit.parts.InputEditPart;
import delete.diagram.edit.parts.InputFloatDefEditPart;
import delete.diagram.edit.parts.InputFloatDefNameEditPart;
import delete.diagram.edit.parts.InputInstalmentEditPart;
import delete.diagram.edit.parts.InputInstalmentNameEditPart;
import delete.diagram.edit.parts.InputIntDefEditPart;
import delete.diagram.edit.parts.InputIntDefNameEditPart;
import delete.diagram.edit.parts.InputStringDefEditPart;
import delete.diagram.edit.parts.InputStringDefNameEditPart;
import delete.diagram.edit.parts.JuncRelationshipEditPart;
import delete.diagram.edit.parts.JuncRelationshipIndexEditPart;
import delete.diagram.edit.parts.JunctionEditPart;
import delete.diagram.edit.parts.JunctionTypeEditPart;
import delete.diagram.edit.parts.LeftOuterJoinRelsEditPart;
import delete.diagram.edit.parts.LeftOuterJoinRelsTypeEditPart;
import delete.diagram.edit.parts.LikeLinkDescEditPart;
import delete.diagram.edit.parts.LikeLinkEditPart;
import delete.diagram.edit.parts.Literal2EditPart;
import delete.diagram.edit.parts.Literal3EditPart;
import delete.diagram.edit.parts.LiteralColumn_nameValue2EditPart;
import delete.diagram.edit.parts.LiteralColumn_nameValue3EditPart;
import delete.diagram.edit.parts.LiteralColumn_nameValueEditPart;
import delete.diagram.edit.parts.LiteralEditPart;
import delete.diagram.edit.parts.LowerEqualThanLinkDescEditPart;
import delete.diagram.edit.parts.LowerEqualThanLinkEditPart;
import delete.diagram.edit.parts.LowerThanLinkDescEditPart;
import delete.diagram.edit.parts.LowerThanLinkEditPart;
import delete.diagram.edit.parts.MyTable2EditPart;
import delete.diagram.edit.parts.MyTableEditPart;
import delete.diagram.edit.parts.MyTableNameAlias2EditPart;
import delete.diagram.edit.parts.MyTableNameAliasEditPart;
import delete.diagram.edit.parts.NullLiteral2EditPart;
import delete.diagram.edit.parts.NullLiteral3EditPart;
import delete.diagram.edit.parts.NullLiteralColumn_name2EditPart;
import delete.diagram.edit.parts.NullLiteralColumn_name3EditPart;
import delete.diagram.edit.parts.NullLiteralColumn_nameEditPart;
import delete.diagram.edit.parts.NullLiteralEditPart;
import delete.diagram.edit.parts.RightOuterJoinRelsEditPart;
import delete.diagram.edit.parts.RightOuterJoinRelsTypeEditPart;
import delete.diagram.edit.parts.RootJunctionEditPart;
import delete.diagram.edit.parts.RootJunctionTypeEditPart;
import delete.diagram.edit.parts.SortInstalmentEditPart;
import delete.diagram.edit.parts.SortInstalmentNameEditPart;
import delete.diagram.edit.parts.TableListInstalmentEditPart;
import delete.diagram.edit.parts.TableListInstalmentNameEditPart;
import delete.diagram.edit.parts.TermEditPart;
import delete.diagram.edit.parts.TermTitleEditPart;
import delete.diagram.part.DeleteDiagramEditorPlugin;
import delete.diagram.part.DeleteVisualIDRegistry;
import delete.diagram.providers.DeleteElementTypes;
import delete.diagram.providers.DeleteParserProvider;

/**
 * @generated
 */
public class DeleteNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		DeleteDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		DeleteDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DeleteNavigatorItem && !isOwnView(((DeleteNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof DeleteNavigatorGroup) {
			DeleteNavigatorGroup group = (DeleteNavigatorGroup) element;
			return DeleteDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof DeleteNavigatorItem) {
			DeleteNavigatorItem navigatorItem = (DeleteNavigatorItem) element;
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
		switch (DeleteVisualIDRegistry.getVisualID(view)) {
		case DeleteSurfaceEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.delete.it.is/v1.0/beta?DeleteSurface", //$NON-NLS-1$
					DeleteElementTypes.DeleteSurface_1000);
		case InputInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.delete.it.is/v1.0/beta?InputInstalment", //$NON-NLS-1$
					DeleteElementTypes.InputInstalment_2001);
		case TableListInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.delete.it.is/v1.0/beta?TableListInstalment", //$NON-NLS-1$
					DeleteElementTypes.TableListInstalment_2002);
		case ConditionInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.delete.it.is/v1.0/beta?ConditionInstalment", //$NON-NLS-1$
					DeleteElementTypes.ConditionInstalment_2005);
		case SortInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.delete.it.is/v1.0/beta?SortInstalment", //$NON-NLS-1$
					DeleteElementTypes.SortInstalment_2006);
		case DummyEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.delete.it.is/v1.0/beta?Dummy", //$NON-NLS-1$
					DeleteElementTypes.Dummy_2007);
		case InputStringDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?InputStringDef", //$NON-NLS-1$
					DeleteElementTypes.InputStringDef_3001);
		case InputIntDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?InputIntDef", //$NON-NLS-1$
					DeleteElementTypes.InputIntDef_3002);
		case InputDateDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?InputDateDef", //$NON-NLS-1$
					DeleteElementTypes.InputDateDef_3003);
		case InputBitsDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?InputBitsDef", //$NON-NLS-1$
					DeleteElementTypes.InputBitsDef_3004);
		case Field3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Field", DeleteElementTypes.Field_3012); //$NON-NLS-1$
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?CallSurfaceQuery", //$NON-NLS-1$
					DeleteElementTypes.CallSurfaceQuery_3014);
		case Field2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Field", DeleteElementTypes.Field_3015); //$NON-NLS-1$
		case LiteralEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Literal", //$NON-NLS-1$
					DeleteElementTypes.Literal_3016);
		case NullLiteralEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?NullLiteral", //$NON-NLS-1$
					DeleteElementTypes.NullLiteral_3017);
		case FunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Function", //$NON-NLS-1$
					DeleteElementTypes.Function_3018);
		case InputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Input", DeleteElementTypes.Input_3019); //$NON-NLS-1$
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?CallSurfaceQuery", //$NON-NLS-1$
					DeleteElementTypes.CallSurfaceQuery_3025);
		case Literal2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Literal", //$NON-NLS-1$
					DeleteElementTypes.Literal_3026);
		case NullLiteral2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?NullLiteral", //$NON-NLS-1$
					DeleteElementTypes.NullLiteral_3027);
		case Function2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Function", //$NON-NLS-1$
					DeleteElementTypes.Function_3028);
		case Input2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Input", DeleteElementTypes.Input_3029); //$NON-NLS-1$
		case InputFloatDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?InputFloatDef", //$NON-NLS-1$
					DeleteElementTypes.InputFloatDef_3037);
		case RootJunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?RootJunction", //$NON-NLS-1$
					DeleteElementTypes.RootJunction_3040);
		case JunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Junction", //$NON-NLS-1$
					DeleteElementTypes.Junction_3041);
		case TermEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Term", DeleteElementTypes.Term_3042); //$NON-NLS-1$
		case FieldSPointerEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?FieldSPointer", //$NON-NLS-1$
					DeleteElementTypes.FieldSPointer_3043);
		case CallSurfaceQuery3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?CallSurfaceQuery", //$NON-NLS-1$
					DeleteElementTypes.CallSurfaceQuery_3044);
		case Field4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Field", DeleteElementTypes.Field_3045); //$NON-NLS-1$
		case Literal3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Literal", //$NON-NLS-1$
					DeleteElementTypes.Literal_3046);
		case NullLiteral3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?NullLiteral", //$NON-NLS-1$
					DeleteElementTypes.NullLiteral_3047);
		case Function3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Function", //$NON-NLS-1$
					DeleteElementTypes.Function_3048);
		case Input3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Input", DeleteElementTypes.Input_3049); //$NON-NLS-1$
		case MyTableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?MyTable", //$NON-NLS-1$
					DeleteElementTypes.MyTable_3051);
		case FieldEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?Field", DeleteElementTypes.Field_3052); //$NON-NLS-1$
		case MyTable2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.delete.it.is/v1.0/beta?MyTable", //$NON-NLS-1$
					DeleteElementTypes.MyTable_3053);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.delete.it.is/v1.0/beta?InnerjoinRels", //$NON-NLS-1$
					DeleteElementTypes.InnerjoinRels_4001);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.delete.it.is/v1.0/beta?LeftOuterJoinRels", //$NON-NLS-1$
					DeleteElementTypes.LeftOuterJoinRels_4002);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.delete.it.is/v1.0/beta?RightOuterJoinRels", //$NON-NLS-1$
					DeleteElementTypes.RightOuterJoinRels_4003);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.delete.it.is/v1.0/beta?FullOuterJoinRels", //$NON-NLS-1$
					DeleteElementTypes.FullOuterJoinRels_4004);
		case EqualLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.delete.it.is/v1.0/beta?EqualLink", //$NON-NLS-1$
					DeleteElementTypes.EqualLink_4006);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.delete.it.is/v1.0/beta?GreaterThanLink", //$NON-NLS-1$
					DeleteElementTypes.GreaterThanLink_4007);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.delete.it.is/v1.0/beta?GreaterEqualThanLink", //$NON-NLS-1$
					DeleteElementTypes.GreaterEqualThanLink_4008);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.delete.it.is/v1.0/beta?LowerThanLink", //$NON-NLS-1$
					DeleteElementTypes.LowerThanLink_4009);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.delete.it.is/v1.0/beta?LowerEqualThanLink", //$NON-NLS-1$
					DeleteElementTypes.LowerEqualThanLink_4010);
		case InLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.delete.it.is/v1.0/beta?InLink", DeleteElementTypes.InLink_4011); //$NON-NLS-1$
		case LikeLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.delete.it.is/v1.0/beta?LikeLink", //$NON-NLS-1$
					DeleteElementTypes.LikeLink_4012);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.delete.it.is/v1.0/beta?JuncRelationship", //$NON-NLS-1$
					DeleteElementTypes.JuncRelationship_4013);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DeleteDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && DeleteElementTypes.isKnownElementType(elementType)) {
			image = DeleteElementTypes.getImage(elementType);
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
		if (element instanceof DeleteNavigatorGroup) {
			DeleteNavigatorGroup group = (DeleteNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DeleteNavigatorItem) {
			DeleteNavigatorItem navigatorItem = (DeleteNavigatorItem) element;
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
		switch (DeleteVisualIDRegistry.getVisualID(view)) {
		case DeleteSurfaceEditPart.VISUAL_ID:
			return getDeleteSurface_1000Text(view);
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2001Text(view);
		case TableListInstalmentEditPart.VISUAL_ID:
			return getTableListInstalment_2002Text(view);
		case ConditionInstalmentEditPart.VISUAL_ID:
			return getConditionInstalment_2005Text(view);
		case SortInstalmentEditPart.VISUAL_ID:
			return getSortInstalment_2006Text(view);
		case DummyEditPart.VISUAL_ID:
			return getDummy_2007Text(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3001Text(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3002Text(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3003Text(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3004Text(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3012Text(view);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3014Text(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3015Text(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3016Text(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3017Text(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3018Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3019Text(view);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getCallSurfaceQuery_3025Text(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3026Text(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3027Text(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3028Text(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3029Text(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3037Text(view);
		case RootJunctionEditPart.VISUAL_ID:
			return getRootJunction_3040Text(view);
		case JunctionEditPart.VISUAL_ID:
			return getJunction_3041Text(view);
		case TermEditPart.VISUAL_ID:
			return getTerm_3042Text(view);
		case FieldSPointerEditPart.VISUAL_ID:
			return getFieldSPointer_3043Text(view);
		case CallSurfaceQuery3EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3044Text(view);
		case Field4EditPart.VISUAL_ID:
			return getField_3045Text(view);
		case Literal3EditPart.VISUAL_ID:
			return getLiteral_3046Text(view);
		case NullLiteral3EditPart.VISUAL_ID:
			return getNullLiteral_3047Text(view);
		case Function3EditPart.VISUAL_ID:
			return getFunction_3048Text(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3049Text(view);
		case MyTableEditPart.VISUAL_ID:
			return getMyTable_3051Text(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3052Text(view);
		case MyTable2EditPart.VISUAL_ID:
			return getMyTable_3053Text(view);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getInnerjoinRels_4001Text(view);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getLeftOuterJoinRels_4002Text(view);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getRightOuterJoinRels_4003Text(view);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getFullOuterJoinRels_4004Text(view);
		case EqualLinkEditPart.VISUAL_ID:
			return getEqualLink_4006Text(view);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getGreaterThanLink_4007Text(view);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getGreaterEqualThanLink_4008Text(view);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getLowerThanLink_4009Text(view);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getLowerEqualThanLink_4010Text(view);
		case InLinkEditPart.VISUAL_ID:
			return getInLink_4011Text(view);
		case LikeLinkEditPart.VISUAL_ID:
			return getLikeLink_4012Text(view);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getJuncRelationship_4013Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getDeleteSurface_1000Text(View view) {
		DeleteSurface domainModelElement = (DeleteSurface) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputInstalment_2001Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.InputInstalment_2001,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(InputInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTableListInstalment_2002Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.TableListInstalment_2002,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(TableListInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConditionInstalment_2005Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.ConditionInstalment_2005,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(ConditionInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSortInstalment_2006Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.SortInstalment_2006,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(SortInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDummy_2007Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Dummy_2007,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(DummyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputStringDef_3001Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.InputStringDef_3001,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(InputStringDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputIntDef_3002Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.InputIntDef_3002,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(InputIntDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputDateDef_3003Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.InputDateDef_3003,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(InputDateDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputBitsDef_3004Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.InputBitsDef_3004,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(InputBitsDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3012Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Field_3012,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(FieldColumn_name3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallSurfaceQuery_3014Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.CallSurfaceQuery_3014,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(CallSurfaceQueryName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3015Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Field_3015,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(FieldColumn_name2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLiteral_3016Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Literal_3016,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(LiteralValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNullLiteral_3017Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.NullLiteral_3017,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(NullLiteralValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_3018Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Function_3018,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(FunctionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3019Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Input_3019,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(InputColumn_nameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallSurfaceQuery_3025Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.CallSurfaceQuery_3025,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(CallSurfaceQueryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLiteral_3026Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Literal_3026,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(LiteralValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNullLiteral_3027Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.NullLiteral_3027,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(NullLiteralValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_3028Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Function_3028,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(FunctionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3029Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Input_3029,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(InputColumn_name2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputFloatDef_3037Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.InputFloatDef_3037,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(InputFloatDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRootJunction_3040Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.RootJunction_3040,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(RootJunctionTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJunction_3041Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Junction_3041,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(JunctionTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTerm_3042Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Term_3042,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(TermTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFieldSPointer_3043Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.FieldSPointer_3043,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(FieldSPointerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallSurfaceQuery_3044Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.CallSurfaceQuery_3044,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(CallSurfaceQueryName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3045Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Field_3045,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(FieldColumn_name4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLiteral_3046Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Literal_3046,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(LiteralValue3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNullLiteral_3047Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.NullLiteral_3047,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(NullLiteralValue3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_3048Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Function_3048,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(FunctionName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3049Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Input_3049,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(InputColumn_name3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMyTable_3051Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.MyTable_3051,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(MyTableNameAliasEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3052Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.Field_3052,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(FieldColumn_nameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMyTable_3053Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.MyTable_3053,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(MyTableNameAlias2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInnerjoinRels_4001Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.InnerjoinRels_4001,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(InnerjoinRelsTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLeftOuterJoinRels_4002Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.LeftOuterJoinRels_4002,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(LeftOuterJoinRelsTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRightOuterJoinRels_4003Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.RightOuterJoinRels_4003,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(RightOuterJoinRelsTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFullOuterJoinRels_4004Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.FullOuterJoinRels_4004,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(FullOuterJoinRelsTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEqualLink_4006Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.EqualLink_4006,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(EqualLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGreaterThanLink_4007Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.GreaterThanLink_4007,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(GreaterThanLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGreaterEqualThanLink_4008Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.GreaterEqualThanLink_4008,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(GreaterEqualThanLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLowerThanLink_4009Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.LowerThanLink_4009,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(LowerThanLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLowerEqualThanLink_4010Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.LowerEqualThanLink_4010,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(LowerEqualThanLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInLink_4011Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.InLink_4011,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(InLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLikeLink_4012Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.LikeLink_4012,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(LikeLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJuncRelationship_4013Text(View view) {
		IParser parser = DeleteParserProvider.getParser(DeleteElementTypes.JuncRelationship_4013,
				view.getElement() != null ? view.getElement() : view,
				DeleteVisualIDRegistry.getType(JuncRelationshipIndexEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeleteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6013); //$NON-NLS-1$
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
		return DeleteSurfaceEditPart.MODEL_ID.equals(DeleteVisualIDRegistry.getModelID(view));
	}

}
