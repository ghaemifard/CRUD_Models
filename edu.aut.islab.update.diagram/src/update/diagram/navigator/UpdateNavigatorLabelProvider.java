/*
* 
*/
package update.diagram.navigator;

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

import update.UpdateSurface;
import update.diagram.edit.parts.CallSurfaceQuery2EditPart;
import update.diagram.edit.parts.CallSurfaceQuery3EditPart;
import update.diagram.edit.parts.CallSurfaceQueryColumn_nameName2EditPart;
import update.diagram.edit.parts.CallSurfaceQueryColumn_nameName3EditPart;
import update.diagram.edit.parts.CallSurfaceQueryColumn_nameNameEditPart;
import update.diagram.edit.parts.CallSurfaceQueryEditPart;
import update.diagram.edit.parts.ConditionInstalmentEditPart;
import update.diagram.edit.parts.ConditionInstalmentNameEditPart;
import update.diagram.edit.parts.EqualLinkDescEditPart;
import update.diagram.edit.parts.EqualLinkEditPart;
import update.diagram.edit.parts.Field2EditPart;
import update.diagram.edit.parts.Field3EditPart;
import update.diagram.edit.parts.FieldColumn_name2EditPart;
import update.diagram.edit.parts.FieldColumn_name3EditPart;
import update.diagram.edit.parts.FieldColumn_nameEditPart;
import update.diagram.edit.parts.FieldEditPart;
import update.diagram.edit.parts.FieldSPointerEditPart;
import update.diagram.edit.parts.FieldSPointerNameEditPart;
import update.diagram.edit.parts.FullOuterJoinRelsEditPart;
import update.diagram.edit.parts.FullOuterJoinRelsTypeEditPart;
import update.diagram.edit.parts.Function2EditPart;
import update.diagram.edit.parts.Function3EditPart;
import update.diagram.edit.parts.FunctionColumn_nameName2EditPart;
import update.diagram.edit.parts.FunctionColumn_nameName3EditPart;
import update.diagram.edit.parts.FunctionColumn_nameNameEditPart;
import update.diagram.edit.parts.FunctionEditPart;
import update.diagram.edit.parts.GreaterEqualThanLinkDescEditPart;
import update.diagram.edit.parts.GreaterEqualThanLinkEditPart;
import update.diagram.edit.parts.GreaterThanLinkDescEditPart;
import update.diagram.edit.parts.GreaterThanLinkEditPart;
import update.diagram.edit.parts.InLinkDescEditPart;
import update.diagram.edit.parts.InLinkEditPart;
import update.diagram.edit.parts.InnerjoinRelsEditPart;
import update.diagram.edit.parts.InnerjoinRelsTypeEditPart;
import update.diagram.edit.parts.Input2EditPart;
import update.diagram.edit.parts.Input3EditPart;
import update.diagram.edit.parts.InputBitsDefEditPart;
import update.diagram.edit.parts.InputBitsDefNameEditPart;
import update.diagram.edit.parts.InputColumn_name2EditPart;
import update.diagram.edit.parts.InputColumn_name3EditPart;
import update.diagram.edit.parts.InputColumn_nameEditPart;
import update.diagram.edit.parts.InputDateDefEditPart;
import update.diagram.edit.parts.InputDateDefNameEditPart;
import update.diagram.edit.parts.InputEditPart;
import update.diagram.edit.parts.InputFloatDefEditPart;
import update.diagram.edit.parts.InputFloatDefNameEditPart;
import update.diagram.edit.parts.InputInstalmentEditPart;
import update.diagram.edit.parts.InputInstalmentNameEditPart;
import update.diagram.edit.parts.InputIntDefEditPart;
import update.diagram.edit.parts.InputIntDefNameEditPart;
import update.diagram.edit.parts.InputStringDefEditPart;
import update.diagram.edit.parts.InputStringDefNameEditPart;
import update.diagram.edit.parts.JuncRelationshipEditPart;
import update.diagram.edit.parts.JuncRelationshipIndexEditPart;
import update.diagram.edit.parts.JunctionEditPart;
import update.diagram.edit.parts.JunctionTypeEditPart;
import update.diagram.edit.parts.LeftOuterJoinRelsEditPart;
import update.diagram.edit.parts.LeftOuterJoinRelsTypeEditPart;
import update.diagram.edit.parts.LikeLinkDescEditPart;
import update.diagram.edit.parts.LikeLinkEditPart;
import update.diagram.edit.parts.LinkFieldEditPart;
import update.diagram.edit.parts.LinkFieldNameEditPart;
import update.diagram.edit.parts.Literal2EditPart;
import update.diagram.edit.parts.Literal3EditPart;
import update.diagram.edit.parts.LiteralEditPart;
import update.diagram.edit.parts.LiteralValue2EditPart;
import update.diagram.edit.parts.LiteralValue3EditPart;
import update.diagram.edit.parts.LiteralValueEditPart;
import update.diagram.edit.parts.LowerEqualThanLinkDescEditPart;
import update.diagram.edit.parts.LowerEqualThanLinkEditPart;
import update.diagram.edit.parts.LowerThanLinkDescEditPart;
import update.diagram.edit.parts.LowerThanLinkEditPart;
import update.diagram.edit.parts.MyTableEditPart;
import update.diagram.edit.parts.MyTableNameAliasEditPart;
import update.diagram.edit.parts.NullLiteral2EditPart;
import update.diagram.edit.parts.NullLiteral3EditPart;
import update.diagram.edit.parts.NullLiteralEditPart;
import update.diagram.edit.parts.NullLiteralValue2EditPart;
import update.diagram.edit.parts.NullLiteralValue3EditPart;
import update.diagram.edit.parts.NullLiteralValueEditPart;
import update.diagram.edit.parts.PrepareListEditPart;
import update.diagram.edit.parts.PrepareListNameEditPart;
import update.diagram.edit.parts.RealFieldEditPart;
import update.diagram.edit.parts.RealFieldNameEditPart;
import update.diagram.edit.parts.RightOuterJoinRelsEditPart;
import update.diagram.edit.parts.RightOuterJoinRelsTypeEditPart;
import update.diagram.edit.parts.RootJunctionEditPart;
import update.diagram.edit.parts.RootJunctionTypeEditPart;
import update.diagram.edit.parts.SortInstalmentEditPart;
import update.diagram.edit.parts.SortInstalmentNameEditPart;
import update.diagram.edit.parts.TableSelectionEditPart;
import update.diagram.edit.parts.TableSelectionNameEditPart;
import update.diagram.edit.parts.TermEditPart;
import update.diagram.edit.parts.TermTitleEditPart;
import update.diagram.edit.parts.UpdateSurfaceEditPart;
import update.diagram.part.UpdateDiagramEditorPlugin;
import update.diagram.part.UpdateVisualIDRegistry;
import update.diagram.providers.UpdateElementTypes;
import update.diagram.providers.UpdateParserProvider;

/**
 * @generated
 */
public class UpdateNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		UpdateDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		UpdateDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof UpdateNavigatorItem && !isOwnView(((UpdateNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof UpdateNavigatorGroup) {
			UpdateNavigatorGroup group = (UpdateNavigatorGroup) element;
			return UpdateDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof UpdateNavigatorItem) {
			UpdateNavigatorItem navigatorItem = (UpdateNavigatorItem) element;
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
		switch (UpdateVisualIDRegistry.getVisualID(view)) {
		case UpdateSurfaceEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.update.it.is/v1.0/beta?UpdateSurface", //$NON-NLS-1$
					UpdateElementTypes.UpdateSurface_1000);
		case InputInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.update.it.is/v1.0/beta?InputInstalment", //$NON-NLS-1$
					UpdateElementTypes.InputInstalment_2001);
		case PrepareListEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.update.it.is/v1.0/beta?PrepareList", //$NON-NLS-1$
					UpdateElementTypes.PrepareList_2002);
		case TableSelectionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.update.it.is/v1.0/beta?TableSelection", //$NON-NLS-1$
					UpdateElementTypes.TableSelection_2003);
		case ConditionInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.update.it.is/v1.0/beta?ConditionInstalment", //$NON-NLS-1$
					UpdateElementTypes.ConditionInstalment_2004);
		case SortInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.update.it.is/v1.0/beta?SortInstalment", //$NON-NLS-1$
					UpdateElementTypes.SortInstalment_2005);
		case InputStringDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?InputStringDef", //$NON-NLS-1$
					UpdateElementTypes.InputStringDef_3001);
		case InputIntDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?InputIntDef", //$NON-NLS-1$
					UpdateElementTypes.InputIntDef_3002);
		case InputDateDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?InputDateDef", //$NON-NLS-1$
					UpdateElementTypes.InputDateDef_3003);
		case InputBitsDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?InputBitsDef", //$NON-NLS-1$
					UpdateElementTypes.InputBitsDef_3004);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?CallSurfaceQuery", //$NON-NLS-1$
					UpdateElementTypes.CallSurfaceQuery_3005);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?CallSurfaceQuery", //$NON-NLS-1$
					UpdateElementTypes.CallSurfaceQuery_3006);
		case FieldEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Field", UpdateElementTypes.Field_3007); //$NON-NLS-1$
		case LiteralEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Literal", //$NON-NLS-1$
					UpdateElementTypes.Literal_3008);
		case NullLiteralEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?NullLiteral", //$NON-NLS-1$
					UpdateElementTypes.NullLiteral_3009);
		case FunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Function", //$NON-NLS-1$
					UpdateElementTypes.Function_3010);
		case InputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Input", UpdateElementTypes.Input_3011); //$NON-NLS-1$
		case Field2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Field", UpdateElementTypes.Field_3012); //$NON-NLS-1$
		case Literal2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Literal", //$NON-NLS-1$
					UpdateElementTypes.Literal_3013);
		case NullLiteral2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?NullLiteral", //$NON-NLS-1$
					UpdateElementTypes.NullLiteral_3014);
		case Function2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Function", //$NON-NLS-1$
					UpdateElementTypes.Function_3015);
		case Input2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Input", UpdateElementTypes.Input_3016); //$NON-NLS-1$
		case TermEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Term", UpdateElementTypes.Term_3019); //$NON-NLS-1$
		case CallSurfaceQuery3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?CallSurfaceQuery", //$NON-NLS-1$
					UpdateElementTypes.CallSurfaceQuery_3020);
		case Field3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Field", UpdateElementTypes.Field_3021); //$NON-NLS-1$
		case Literal3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Literal", //$NON-NLS-1$
					UpdateElementTypes.Literal_3022);
		case NullLiteral3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?NullLiteral", //$NON-NLS-1$
					UpdateElementTypes.NullLiteral_3023);
		case Function3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Function", //$NON-NLS-1$
					UpdateElementTypes.Function_3024);
		case Input3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Input", UpdateElementTypes.Input_3025); //$NON-NLS-1$
		case MyTableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?MyTable", //$NON-NLS-1$
					UpdateElementTypes.MyTable_3026);
		case InputFloatDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?InputFloatDef", //$NON-NLS-1$
					UpdateElementTypes.InputFloatDef_3028);
		case RealFieldEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?RealField", //$NON-NLS-1$
					UpdateElementTypes.RealField_3029);
		case FieldSPointerEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?FieldSPointer", //$NON-NLS-1$
					UpdateElementTypes.FieldSPointer_3030);
		case RootJunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?RootJunction", //$NON-NLS-1$
					UpdateElementTypes.RootJunction_3031);
		case JunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.update.it.is/v1.0/beta?Junction", //$NON-NLS-1$
					UpdateElementTypes.Junction_3032);
		case EqualLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.update.it.is/v1.0/beta?EqualLink", //$NON-NLS-1$
					UpdateElementTypes.EqualLink_4001);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.update.it.is/v1.0/beta?GreaterThanLink", //$NON-NLS-1$
					UpdateElementTypes.GreaterThanLink_4002);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.update.it.is/v1.0/beta?GreaterEqualThanLink", //$NON-NLS-1$
					UpdateElementTypes.GreaterEqualThanLink_4003);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.update.it.is/v1.0/beta?LowerThanLink", //$NON-NLS-1$
					UpdateElementTypes.LowerThanLink_4004);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.update.it.is/v1.0/beta?LowerEqualThanLink", //$NON-NLS-1$
					UpdateElementTypes.LowerEqualThanLink_4005);
		case InLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.update.it.is/v1.0/beta?InLink", UpdateElementTypes.InLink_4006); //$NON-NLS-1$
		case LikeLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.update.it.is/v1.0/beta?LikeLink", //$NON-NLS-1$
					UpdateElementTypes.LikeLink_4007);
		case LinkFieldEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.update.it.is/v1.0/beta?LinkField", //$NON-NLS-1$
					UpdateElementTypes.LinkField_4008);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.update.it.is/v1.0/beta?InnerjoinRels", //$NON-NLS-1$
					UpdateElementTypes.InnerjoinRels_4010);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.update.it.is/v1.0/beta?LeftOuterJoinRels", //$NON-NLS-1$
					UpdateElementTypes.LeftOuterJoinRels_4011);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.update.it.is/v1.0/beta?RightOuterJoinRels", //$NON-NLS-1$
					UpdateElementTypes.RightOuterJoinRels_4012);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.update.it.is/v1.0/beta?FullOuterJoinRels", //$NON-NLS-1$
					UpdateElementTypes.FullOuterJoinRels_4013);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.update.it.is/v1.0/beta?JuncRelationship", //$NON-NLS-1$
					UpdateElementTypes.JuncRelationship_4014);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = UpdateDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && UpdateElementTypes.isKnownElementType(elementType)) {
			image = UpdateElementTypes.getImage(elementType);
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
		if (element instanceof UpdateNavigatorGroup) {
			UpdateNavigatorGroup group = (UpdateNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof UpdateNavigatorItem) {
			UpdateNavigatorItem navigatorItem = (UpdateNavigatorItem) element;
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
		switch (UpdateVisualIDRegistry.getVisualID(view)) {
		case UpdateSurfaceEditPart.VISUAL_ID:
			return getUpdateSurface_1000Text(view);
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2001Text(view);
		case PrepareListEditPart.VISUAL_ID:
			return getPrepareList_2002Text(view);
		case TableSelectionEditPart.VISUAL_ID:
			return getTableSelection_2003Text(view);
		case ConditionInstalmentEditPart.VISUAL_ID:
			return getConditionInstalment_2004Text(view);
		case SortInstalmentEditPart.VISUAL_ID:
			return getSortInstalment_2005Text(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3001Text(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3002Text(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3003Text(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3004Text(view);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getCallSurfaceQuery_3005Text(view);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3006Text(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3007Text(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3008Text(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3009Text(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3010Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3011Text(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3012Text(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3013Text(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3014Text(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3015Text(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3016Text(view);
		case TermEditPart.VISUAL_ID:
			return getTerm_3019Text(view);
		case CallSurfaceQuery3EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3020Text(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3021Text(view);
		case Literal3EditPart.VISUAL_ID:
			return getLiteral_3022Text(view);
		case NullLiteral3EditPart.VISUAL_ID:
			return getNullLiteral_3023Text(view);
		case Function3EditPart.VISUAL_ID:
			return getFunction_3024Text(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3025Text(view);
		case MyTableEditPart.VISUAL_ID:
			return getMyTable_3026Text(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3028Text(view);
		case RealFieldEditPart.VISUAL_ID:
			return getRealField_3029Text(view);
		case FieldSPointerEditPart.VISUAL_ID:
			return getFieldSPointer_3030Text(view);
		case RootJunctionEditPart.VISUAL_ID:
			return getRootJunction_3031Text(view);
		case JunctionEditPart.VISUAL_ID:
			return getJunction_3032Text(view);
		case EqualLinkEditPart.VISUAL_ID:
			return getEqualLink_4001Text(view);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getGreaterThanLink_4002Text(view);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getGreaterEqualThanLink_4003Text(view);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getLowerThanLink_4004Text(view);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getLowerEqualThanLink_4005Text(view);
		case InLinkEditPart.VISUAL_ID:
			return getInLink_4006Text(view);
		case LikeLinkEditPart.VISUAL_ID:
			return getLikeLink_4007Text(view);
		case LinkFieldEditPart.VISUAL_ID:
			return getLinkField_4008Text(view);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getInnerjoinRels_4010Text(view);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getLeftOuterJoinRels_4011Text(view);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getRightOuterJoinRels_4012Text(view);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getFullOuterJoinRels_4013Text(view);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getJuncRelationship_4014Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getUpdateSurface_1000Text(View view) {
		UpdateSurface domainModelElement = (UpdateSurface) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputInstalment_2001Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.InputInstalment_2001,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(InputInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPrepareList_2002Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.PrepareList_2002,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(PrepareListNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTableSelection_2003Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.TableSelection_2003,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(TableSelectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConditionInstalment_2004Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.ConditionInstalment_2004,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(ConditionInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSortInstalment_2005Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.SortInstalment_2005,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(SortInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputStringDef_3001Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.InputStringDef_3001,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(InputStringDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputIntDef_3002Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.InputIntDef_3002,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(InputIntDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputDateDef_3003Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.InputDateDef_3003,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(InputDateDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputBitsDef_3004Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.InputBitsDef_3004,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(InputBitsDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallSurfaceQuery_3005Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.CallSurfaceQuery_3005,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(CallSurfaceQueryColumn_nameNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallSurfaceQuery_3006Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.CallSurfaceQuery_3006,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(CallSurfaceQueryColumn_nameName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3007Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Field_3007,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(FieldColumn_nameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLiteral_3008Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Literal_3008,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(LiteralValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNullLiteral_3009Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.NullLiteral_3009,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(NullLiteralValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_3010Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Function_3010,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(FunctionColumn_nameNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3011Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Input_3011,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(InputColumn_nameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3012Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Field_3012,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(FieldColumn_name2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLiteral_3013Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Literal_3013,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(LiteralValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNullLiteral_3014Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.NullLiteral_3014,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(NullLiteralValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_3015Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Function_3015,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(FunctionColumn_nameName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3016Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Input_3016,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(InputColumn_name2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTerm_3019Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Term_3019,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(TermTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallSurfaceQuery_3020Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.CallSurfaceQuery_3020,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(CallSurfaceQueryColumn_nameName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3021Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Field_3021,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(FieldColumn_name3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLiteral_3022Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Literal_3022,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(LiteralValue3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNullLiteral_3023Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.NullLiteral_3023,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(NullLiteralValue3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_3024Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Function_3024,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(FunctionColumn_nameName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3025Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Input_3025,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(InputColumn_name3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMyTable_3026Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.MyTable_3026,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(MyTableNameAliasEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputFloatDef_3028Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.InputFloatDef_3028,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(InputFloatDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRealField_3029Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.RealField_3029,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(RealFieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFieldSPointer_3030Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.FieldSPointer_3030,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(FieldSPointerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRootJunction_3031Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.RootJunction_3031,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(RootJunctionTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJunction_3032Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.Junction_3032,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(JunctionTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEqualLink_4001Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.EqualLink_4001,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(EqualLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGreaterThanLink_4002Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.GreaterThanLink_4002,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(GreaterThanLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGreaterEqualThanLink_4003Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.GreaterEqualThanLink_4003,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(GreaterEqualThanLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLowerThanLink_4004Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.LowerThanLink_4004,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(LowerThanLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLowerEqualThanLink_4005Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.LowerEqualThanLink_4005,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(LowerEqualThanLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInLink_4006Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.InLink_4006,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(InLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLikeLink_4007Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.LikeLink_4007,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(LikeLinkDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLinkField_4008Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.LinkField_4008,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(LinkFieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInnerjoinRels_4010Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.InnerjoinRels_4010,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(InnerjoinRelsTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLeftOuterJoinRels_4011Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.LeftOuterJoinRels_4011,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(LeftOuterJoinRelsTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRightOuterJoinRels_4012Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.RightOuterJoinRels_4012,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(RightOuterJoinRelsTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFullOuterJoinRels_4013Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.FullOuterJoinRels_4013,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(FullOuterJoinRelsTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJuncRelationship_4014Text(View view) {
		IParser parser = UpdateParserProvider.getParser(UpdateElementTypes.JuncRelationship_4014,
				view.getElement() != null ? view.getElement() : view,
				UpdateVisualIDRegistry.getType(JuncRelationshipIndexEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UpdateDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6014); //$NON-NLS-1$
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
		return UpdateSurfaceEditPart.MODEL_ID.equals(UpdateVisualIDRegistry.getModelID(view));
	}

}
