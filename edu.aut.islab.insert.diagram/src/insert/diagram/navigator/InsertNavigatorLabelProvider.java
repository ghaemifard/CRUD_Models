/*
* 
*/
package insert.diagram.navigator;

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

import insert.InsertSurface;
import insert.diagram.edit.parts.CallSurfaceQuery2EditPart;
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
import insert.diagram.edit.parts.TableEditPart;
import insert.diagram.edit.parts.TableNameEditPart;
import insert.diagram.part.InsertDiagramEditorPlugin;
import insert.diagram.part.InsertVisualIDRegistry;
import insert.diagram.providers.InsertElementTypes;
import insert.diagram.providers.InsertParserProvider;

/**
 * @generated
 */
public class InsertNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		InsertDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		InsertDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof InsertNavigatorItem && !isOwnView(((InsertNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof InsertNavigatorGroup) {
			InsertNavigatorGroup group = (InsertNavigatorGroup) element;
			return InsertDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof InsertNavigatorItem) {
			InsertNavigatorItem navigatorItem = (InsertNavigatorItem) element;
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
		switch (InsertVisualIDRegistry.getVisualID(view)) {
		case InsertSurfaceEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.insert.it.is/v1.0/beta?InsertSurface", //$NON-NLS-1$
					InsertElementTypes.InsertSurface_1000);
		case InputInstalmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.insert.it.is/v1.0/beta?InputInstalment", //$NON-NLS-1$
					InsertElementTypes.InputInstalment_2002);
		case PrepareListEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.insert.it.is/v1.0/beta?PrepareList", //$NON-NLS-1$
					InsertElementTypes.PrepareList_2003);
		case TableEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.insert.it.is/v1.0/beta?Table", //$NON-NLS-1$
					InsertElementTypes.Table_2004);
		case InputStringDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?InputStringDef", //$NON-NLS-1$
					InsertElementTypes.InputStringDef_3002);
		case InputIntDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?InputIntDef", //$NON-NLS-1$
					InsertElementTypes.InputIntDef_3003);
		case InputDateDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?InputDateDef", //$NON-NLS-1$
					InsertElementTypes.InputDateDef_3004);
		case InputBitsDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?InputBitsDef", //$NON-NLS-1$
					InsertElementTypes.InputBitsDef_3005);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?CallSurfaceQuery", //$NON-NLS-1$
					InsertElementTypes.CallSurfaceQuery_3006);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?CallSurfaceQuery", //$NON-NLS-1$
					InsertElementTypes.CallSurfaceQuery_3007);
		case Field2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?Field", InsertElementTypes.Field_3008); //$NON-NLS-1$
		case LiteralEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?Literal", //$NON-NLS-1$
					InsertElementTypes.Literal_3009);
		case NullLiteralEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?NullLiteral", //$NON-NLS-1$
					InsertElementTypes.NullLiteral_3010);
		case FunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?Function", //$NON-NLS-1$
					InsertElementTypes.Function_3011);
		case InputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?Input", InsertElementTypes.Input_3012); //$NON-NLS-1$
		case Field3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?Field", InsertElementTypes.Field_3013); //$NON-NLS-1$
		case Literal2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?Literal", //$NON-NLS-1$
					InsertElementTypes.Literal_3014);
		case NullLiteral2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?NullLiteral", //$NON-NLS-1$
					InsertElementTypes.NullLiteral_3015);
		case Function2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?Function", //$NON-NLS-1$
					InsertElementTypes.Function_3016);
		case Input2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?Input", InsertElementTypes.Input_3017); //$NON-NLS-1$
		case FieldEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?Field", InsertElementTypes.Field_3018); //$NON-NLS-1$
		case InputFloatDefEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.insert.it.is/v1.0/beta?InputFloatDef", //$NON-NLS-1$
					InsertElementTypes.InputFloatDef_3019);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = InsertDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && InsertElementTypes.isKnownElementType(elementType)) {
			image = InsertElementTypes.getImage(elementType);
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
		if (element instanceof InsertNavigatorGroup) {
			InsertNavigatorGroup group = (InsertNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof InsertNavigatorItem) {
			InsertNavigatorItem navigatorItem = (InsertNavigatorItem) element;
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
		switch (InsertVisualIDRegistry.getVisualID(view)) {
		case InsertSurfaceEditPart.VISUAL_ID:
			return getInsertSurface_1000Text(view);
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2002Text(view);
		case PrepareListEditPart.VISUAL_ID:
			return getPrepareList_2003Text(view);
		case TableEditPart.VISUAL_ID:
			return getTable_2004Text(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3002Text(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3003Text(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3004Text(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3005Text(view);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getCallSurfaceQuery_3006Text(view);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3007Text(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3008Text(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3009Text(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3010Text(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3011Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3012Text(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3013Text(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3014Text(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3015Text(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3016Text(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3017Text(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3018Text(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3019Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getInsertSurface_1000Text(View view) {
		InsertSurface domainModelElement = (InsertSurface) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputInstalment_2002Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.InputInstalment_2002,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(InputInstalmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPrepareList_2003Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.PrepareList_2003,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(PrepareListNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_2004Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.Table_2004,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(TableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputStringDef_3002Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.InputStringDef_3002,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(InputStringDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputIntDef_3003Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.InputIntDef_3003,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(InputIntDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputDateDef_3004Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.InputDateDef_3004,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(InputDateDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputBitsDef_3005Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.InputBitsDef_3005,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(InputBitsDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallSurfaceQuery_3006Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.CallSurfaceQuery_3006,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(CallSurfaceQueryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallSurfaceQuery_3007Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.CallSurfaceQuery_3007,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(CallSurfaceQueryName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3008Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.Field_3008,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(FieldColumn_nameName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLiteral_3009Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.Literal_3009,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(LiteralColumn_nameValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNullLiteral_3010Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.NullLiteral_3010,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(NullLiteralColumn_nameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_3011Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.Function_3011,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(FunctionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3012Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.Input_3012,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(InputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3013Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.Field_3013,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(FieldColumn_nameName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLiteral_3014Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.Literal_3014,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(LiteralColumn_nameValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNullLiteral_3015Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.NullLiteral_3015,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(NullLiteralColumn_name2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_3016Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.Function_3016,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(FunctionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3017Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.Input_3017,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(InputName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getField_3018Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.Field_3018,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(FieldColumn_nameNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputFloatDef_3019Text(View view) {
		IParser parser = InsertParserProvider.getParser(InsertElementTypes.InputFloatDef_3019,
				view.getElement() != null ? view.getElement() : view,
				InsertVisualIDRegistry.getType(InputFloatDefNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InsertDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
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
		return InsertSurfaceEditPart.MODEL_ID.equals(InsertVisualIDRegistry.getModelID(view));
	}

}
