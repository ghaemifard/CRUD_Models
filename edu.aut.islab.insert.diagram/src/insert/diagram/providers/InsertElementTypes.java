/*
 * 
 */
package insert.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import insert.InsertPackage;
import insert.diagram.edit.parts.CallSurfaceQuery2EditPart;
import insert.diagram.edit.parts.CallSurfaceQueryEditPart;
import insert.diagram.edit.parts.Field2EditPart;
import insert.diagram.edit.parts.Field3EditPart;
import insert.diagram.edit.parts.FieldEditPart;
import insert.diagram.edit.parts.Function2EditPart;
import insert.diagram.edit.parts.FunctionEditPart;
import insert.diagram.edit.parts.Input2EditPart;
import insert.diagram.edit.parts.InputBitsDefEditPart;
import insert.diagram.edit.parts.InputDateDefEditPart;
import insert.diagram.edit.parts.InputEditPart;
import insert.diagram.edit.parts.InputFloatDefEditPart;
import insert.diagram.edit.parts.InputInstalmentEditPart;
import insert.diagram.edit.parts.InputIntDefEditPart;
import insert.diagram.edit.parts.InputStringDefEditPart;
import insert.diagram.edit.parts.InsertSurfaceEditPart;
import insert.diagram.edit.parts.Literal2EditPart;
import insert.diagram.edit.parts.LiteralEditPart;
import insert.diagram.edit.parts.NullLiteral2EditPart;
import insert.diagram.edit.parts.NullLiteralEditPart;
import insert.diagram.edit.parts.PrepareListEditPart;
import insert.diagram.edit.parts.TableEditPart;
import insert.diagram.part.InsertDiagramEditorPlugin;

/**
 * @generated
 */
public class InsertElementTypes {

	/**
	* @generated
	*/
	private InsertElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			InsertDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType InsertSurface_1000 = getElementType(
			"edu.aut.islab.insert.diagram.InsertSurface_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_2004 = getElementType("edu.aut.islab.insert.diagram.Table_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputInstalment_2002 = getElementType(
			"edu.aut.islab.insert.diagram.InputInstalment_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PrepareList_2003 = getElementType("edu.aut.islab.insert.diagram.PrepareList_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3018 = getElementType("edu.aut.islab.insert.diagram.Field_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputStringDef_3002 = getElementType(
			"edu.aut.islab.insert.diagram.InputStringDef_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputIntDef_3003 = getElementType("edu.aut.islab.insert.diagram.InputIntDef_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputDateDef_3004 = getElementType(
			"edu.aut.islab.insert.diagram.InputDateDef_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputBitsDef_3005 = getElementType(
			"edu.aut.islab.insert.diagram.InputBitsDef_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputFloatDef_3019 = getElementType(
			"edu.aut.islab.insert.diagram.InputFloatDef_3019"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallSurfaceQuery_3006 = getElementType(
			"edu.aut.islab.insert.diagram.CallSurfaceQuery_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallSurfaceQuery_3007 = getElementType(
			"edu.aut.islab.insert.diagram.CallSurfaceQuery_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3008 = getElementType("edu.aut.islab.insert.diagram.Field_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Literal_3009 = getElementType("edu.aut.islab.insert.diagram.Literal_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NullLiteral_3010 = getElementType("edu.aut.islab.insert.diagram.NullLiteral_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_3011 = getElementType("edu.aut.islab.insert.diagram.Function_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3012 = getElementType("edu.aut.islab.insert.diagram.Input_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3013 = getElementType("edu.aut.islab.insert.diagram.Field_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Literal_3014 = getElementType("edu.aut.islab.insert.diagram.Literal_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NullLiteral_3015 = getElementType("edu.aut.islab.insert.diagram.NullLiteral_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_3016 = getElementType("edu.aut.islab.insert.diagram.Function_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3017 = getElementType("edu.aut.islab.insert.diagram.Input_3017"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(InsertSurface_1000, InsertPackage.eINSTANCE.getInsertSurface());

			elements.put(Table_2004, InsertPackage.eINSTANCE.getTable());

			elements.put(InputInstalment_2002, InsertPackage.eINSTANCE.getInputInstalment());

			elements.put(PrepareList_2003, InsertPackage.eINSTANCE.getPrepareList());

			elements.put(Field_3018, InsertPackage.eINSTANCE.getField());

			elements.put(InputStringDef_3002, InsertPackage.eINSTANCE.getInputStringDef());

			elements.put(InputIntDef_3003, InsertPackage.eINSTANCE.getInputIntDef());

			elements.put(InputDateDef_3004, InsertPackage.eINSTANCE.getInputDateDef());

			elements.put(InputBitsDef_3005, InsertPackage.eINSTANCE.getInputBitsDef());

			elements.put(InputFloatDef_3019, InsertPackage.eINSTANCE.getInputFloatDef());

			elements.put(CallSurfaceQuery_3006, InsertPackage.eINSTANCE.getCallSurfaceQuery());

			elements.put(CallSurfaceQuery_3007, InsertPackage.eINSTANCE.getCallSurfaceQuery());

			elements.put(Field_3008, InsertPackage.eINSTANCE.getField());

			elements.put(Literal_3009, InsertPackage.eINSTANCE.getLiteral());

			elements.put(NullLiteral_3010, InsertPackage.eINSTANCE.getNullLiteral());

			elements.put(Function_3011, InsertPackage.eINSTANCE.getFunction());

			elements.put(Input_3012, InsertPackage.eINSTANCE.getInput());

			elements.put(Field_3013, InsertPackage.eINSTANCE.getField());

			elements.put(Literal_3014, InsertPackage.eINSTANCE.getLiteral());

			elements.put(NullLiteral_3015, InsertPackage.eINSTANCE.getNullLiteral());

			elements.put(Function_3016, InsertPackage.eINSTANCE.getFunction());

			elements.put(Input_3017, InsertPackage.eINSTANCE.getInput());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(InsertSurface_1000);
			KNOWN_ELEMENT_TYPES.add(Table_2004);
			KNOWN_ELEMENT_TYPES.add(InputInstalment_2002);
			KNOWN_ELEMENT_TYPES.add(PrepareList_2003);
			KNOWN_ELEMENT_TYPES.add(Field_3018);
			KNOWN_ELEMENT_TYPES.add(InputStringDef_3002);
			KNOWN_ELEMENT_TYPES.add(InputIntDef_3003);
			KNOWN_ELEMENT_TYPES.add(InputDateDef_3004);
			KNOWN_ELEMENT_TYPES.add(InputBitsDef_3005);
			KNOWN_ELEMENT_TYPES.add(InputFloatDef_3019);
			KNOWN_ELEMENT_TYPES.add(CallSurfaceQuery_3006);
			KNOWN_ELEMENT_TYPES.add(CallSurfaceQuery_3007);
			KNOWN_ELEMENT_TYPES.add(Field_3008);
			KNOWN_ELEMENT_TYPES.add(Literal_3009);
			KNOWN_ELEMENT_TYPES.add(NullLiteral_3010);
			KNOWN_ELEMENT_TYPES.add(Function_3011);
			KNOWN_ELEMENT_TYPES.add(Input_3012);
			KNOWN_ELEMENT_TYPES.add(Field_3013);
			KNOWN_ELEMENT_TYPES.add(Literal_3014);
			KNOWN_ELEMENT_TYPES.add(NullLiteral_3015);
			KNOWN_ELEMENT_TYPES.add(Function_3016);
			KNOWN_ELEMENT_TYPES.add(Input_3017);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case InsertSurfaceEditPart.VISUAL_ID:
			return InsertSurface_1000;
		case TableEditPart.VISUAL_ID:
			return Table_2004;
		case InputInstalmentEditPart.VISUAL_ID:
			return InputInstalment_2002;
		case PrepareListEditPart.VISUAL_ID:
			return PrepareList_2003;
		case FieldEditPart.VISUAL_ID:
			return Field_3018;
		case InputStringDefEditPart.VISUAL_ID:
			return InputStringDef_3002;
		case InputIntDefEditPart.VISUAL_ID:
			return InputIntDef_3003;
		case InputDateDefEditPart.VISUAL_ID:
			return InputDateDef_3004;
		case InputBitsDefEditPart.VISUAL_ID:
			return InputBitsDef_3005;
		case InputFloatDefEditPart.VISUAL_ID:
			return InputFloatDef_3019;
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return CallSurfaceQuery_3006;
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return CallSurfaceQuery_3007;
		case Field2EditPart.VISUAL_ID:
			return Field_3008;
		case LiteralEditPart.VISUAL_ID:
			return Literal_3009;
		case NullLiteralEditPart.VISUAL_ID:
			return NullLiteral_3010;
		case FunctionEditPart.VISUAL_ID:
			return Function_3011;
		case InputEditPart.VISUAL_ID:
			return Input_3012;
		case Field3EditPart.VISUAL_ID:
			return Field_3013;
		case Literal2EditPart.VISUAL_ID:
			return Literal_3014;
		case NullLiteral2EditPart.VISUAL_ID:
			return NullLiteral_3015;
		case Function2EditPart.VISUAL_ID:
			return Function_3016;
		case Input2EditPart.VISUAL_ID:
			return Input_3017;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return insert.diagram.providers.InsertElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return insert.diagram.providers.InsertElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return insert.diagram.providers.InsertElementTypes.getElement(elementTypeAdapter);
		}
	};

}
