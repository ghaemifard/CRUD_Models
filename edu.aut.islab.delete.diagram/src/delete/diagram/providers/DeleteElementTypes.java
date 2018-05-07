/*
 * 
 */
package delete.diagram.providers;

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

import delete.DeletePackage;
import delete.diagram.edit.parts.CallSurfaceQuery2EditPart;
import delete.diagram.edit.parts.CallSurfaceQuery3EditPart;
import delete.diagram.edit.parts.CallSurfaceQueryEditPart;
import delete.diagram.edit.parts.ConditionInstalmentEditPart;
import delete.diagram.edit.parts.DeleteSurfaceEditPart;
import delete.diagram.edit.parts.DummyEditPart;
import delete.diagram.edit.parts.EqualLinkEditPart;
import delete.diagram.edit.parts.Field2EditPart;
import delete.diagram.edit.parts.Field3EditPart;
import delete.diagram.edit.parts.Field4EditPart;
import delete.diagram.edit.parts.FieldEditPart;
import delete.diagram.edit.parts.FieldSPointerEditPart;
import delete.diagram.edit.parts.FullOuterJoinRelsEditPart;
import delete.diagram.edit.parts.Function2EditPart;
import delete.diagram.edit.parts.Function3EditPart;
import delete.diagram.edit.parts.FunctionEditPart;
import delete.diagram.edit.parts.GreaterEqualThanLinkEditPart;
import delete.diagram.edit.parts.GreaterThanLinkEditPart;
import delete.diagram.edit.parts.InLinkEditPart;
import delete.diagram.edit.parts.InnerjoinRelsEditPart;
import delete.diagram.edit.parts.Input2EditPart;
import delete.diagram.edit.parts.Input3EditPart;
import delete.diagram.edit.parts.InputBitsDefEditPart;
import delete.diagram.edit.parts.InputDateDefEditPart;
import delete.diagram.edit.parts.InputEditPart;
import delete.diagram.edit.parts.InputFloatDefEditPart;
import delete.diagram.edit.parts.InputInstalmentEditPart;
import delete.diagram.edit.parts.InputIntDefEditPart;
import delete.diagram.edit.parts.InputStringDefEditPart;
import delete.diagram.edit.parts.JuncRelationshipEditPart;
import delete.diagram.edit.parts.JunctionEditPart;
import delete.diagram.edit.parts.LeftOuterJoinRelsEditPart;
import delete.diagram.edit.parts.LikeLinkEditPart;
import delete.diagram.edit.parts.Literal2EditPart;
import delete.diagram.edit.parts.Literal3EditPart;
import delete.diagram.edit.parts.LiteralEditPart;
import delete.diagram.edit.parts.LowerEqualThanLinkEditPart;
import delete.diagram.edit.parts.LowerThanLinkEditPart;
import delete.diagram.edit.parts.MyTable2EditPart;
import delete.diagram.edit.parts.MyTableEditPart;
import delete.diagram.edit.parts.NullLiteral2EditPart;
import delete.diagram.edit.parts.NullLiteral3EditPart;
import delete.diagram.edit.parts.NullLiteralEditPart;
import delete.diagram.edit.parts.RightOuterJoinRelsEditPart;
import delete.diagram.edit.parts.RootJunctionEditPart;
import delete.diagram.edit.parts.SortInstalmentEditPart;
import delete.diagram.edit.parts.TableListInstalmentEditPart;
import delete.diagram.edit.parts.TermEditPart;
import delete.diagram.part.DeleteDiagramEditorPlugin;

/**
 * @generated
 */
public class DeleteElementTypes {

	/**
	* @generated
	*/
	private DeleteElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DeleteDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType DeleteSurface_1000 = getElementType(
			"edu.aut.islab.delete.diagram.DeleteSurface_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputInstalment_2001 = getElementType(
			"edu.aut.islab.delete.diagram.InputInstalment_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TableListInstalment_2002 = getElementType(
			"edu.aut.islab.delete.diagram.TableListInstalment_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConditionInstalment_2005 = getElementType(
			"edu.aut.islab.delete.diagram.ConditionInstalment_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SortInstalment_2006 = getElementType(
			"edu.aut.islab.delete.diagram.SortInstalment_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Dummy_2007 = getElementType("edu.aut.islab.delete.diagram.Dummy_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputStringDef_3001 = getElementType(
			"edu.aut.islab.delete.diagram.InputStringDef_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputIntDef_3002 = getElementType("edu.aut.islab.delete.diagram.InputIntDef_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputDateDef_3003 = getElementType(
			"edu.aut.islab.delete.diagram.InputDateDef_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputBitsDef_3004 = getElementType(
			"edu.aut.islab.delete.diagram.InputBitsDef_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputFloatDef_3037 = getElementType(
			"edu.aut.islab.delete.diagram.InputFloatDef_3037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MyTable_3051 = getElementType("edu.aut.islab.delete.diagram.MyTable_3051"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3052 = getElementType("edu.aut.islab.delete.diagram.Field_3052"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RootJunction_3040 = getElementType(
			"edu.aut.islab.delete.diagram.RootJunction_3040"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Junction_3041 = getElementType("edu.aut.islab.delete.diagram.Junction_3041"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Term_3042 = getElementType("edu.aut.islab.delete.diagram.Term_3042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallSurfaceQuery_3025 = getElementType(
			"edu.aut.islab.delete.diagram.CallSurfaceQuery_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallSurfaceQuery_3014 = getElementType(
			"edu.aut.islab.delete.diagram.CallSurfaceQuery_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3015 = getElementType("edu.aut.islab.delete.diagram.Field_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Literal_3016 = getElementType("edu.aut.islab.delete.diagram.Literal_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NullLiteral_3017 = getElementType("edu.aut.islab.delete.diagram.NullLiteral_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_3018 = getElementType("edu.aut.islab.delete.diagram.Function_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3019 = getElementType("edu.aut.islab.delete.diagram.Input_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3012 = getElementType("edu.aut.islab.delete.diagram.Field_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Literal_3026 = getElementType("edu.aut.islab.delete.diagram.Literal_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NullLiteral_3027 = getElementType("edu.aut.islab.delete.diagram.NullLiteral_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_3028 = getElementType("edu.aut.islab.delete.diagram.Function_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3029 = getElementType("edu.aut.islab.delete.diagram.Input_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FieldSPointer_3043 = getElementType(
			"edu.aut.islab.delete.diagram.FieldSPointer_3043"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallSurfaceQuery_3044 = getElementType(
			"edu.aut.islab.delete.diagram.CallSurfaceQuery_3044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3045 = getElementType("edu.aut.islab.delete.diagram.Field_3045"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Literal_3046 = getElementType("edu.aut.islab.delete.diagram.Literal_3046"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NullLiteral_3047 = getElementType("edu.aut.islab.delete.diagram.NullLiteral_3047"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_3048 = getElementType("edu.aut.islab.delete.diagram.Function_3048"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3049 = getElementType("edu.aut.islab.delete.diagram.Input_3049"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MyTable_3053 = getElementType("edu.aut.islab.delete.diagram.MyTable_3053"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InnerjoinRels_4001 = getElementType(
			"edu.aut.islab.delete.diagram.InnerjoinRels_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LeftOuterJoinRels_4002 = getElementType(
			"edu.aut.islab.delete.diagram.LeftOuterJoinRels_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RightOuterJoinRels_4003 = getElementType(
			"edu.aut.islab.delete.diagram.RightOuterJoinRels_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FullOuterJoinRels_4004 = getElementType(
			"edu.aut.islab.delete.diagram.FullOuterJoinRels_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EqualLink_4006 = getElementType("edu.aut.islab.delete.diagram.EqualLink_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GreaterThanLink_4007 = getElementType(
			"edu.aut.islab.delete.diagram.GreaterThanLink_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GreaterEqualThanLink_4008 = getElementType(
			"edu.aut.islab.delete.diagram.GreaterEqualThanLink_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LowerThanLink_4009 = getElementType(
			"edu.aut.islab.delete.diagram.LowerThanLink_4009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LowerEqualThanLink_4010 = getElementType(
			"edu.aut.islab.delete.diagram.LowerEqualThanLink_4010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InLink_4011 = getElementType("edu.aut.islab.delete.diagram.InLink_4011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LikeLink_4012 = getElementType("edu.aut.islab.delete.diagram.LikeLink_4012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JuncRelationship_4013 = getElementType(
			"edu.aut.islab.delete.diagram.JuncRelationship_4013"); //$NON-NLS-1$

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

			elements.put(DeleteSurface_1000, DeletePackage.eINSTANCE.getDeleteSurface());

			elements.put(InputInstalment_2001, DeletePackage.eINSTANCE.getInputInstalment());

			elements.put(TableListInstalment_2002, DeletePackage.eINSTANCE.getTableListInstalment());

			elements.put(ConditionInstalment_2005, DeletePackage.eINSTANCE.getConditionInstalment());

			elements.put(SortInstalment_2006, DeletePackage.eINSTANCE.getSortInstalment());

			elements.put(Dummy_2007, DeletePackage.eINSTANCE.getDummy());

			elements.put(InputStringDef_3001, DeletePackage.eINSTANCE.getInputStringDef());

			elements.put(InputIntDef_3002, DeletePackage.eINSTANCE.getInputIntDef());

			elements.put(InputDateDef_3003, DeletePackage.eINSTANCE.getInputDateDef());

			elements.put(InputBitsDef_3004, DeletePackage.eINSTANCE.getInputBitsDef());

			elements.put(InputFloatDef_3037, DeletePackage.eINSTANCE.getInputFloatDef());

			elements.put(MyTable_3051, DeletePackage.eINSTANCE.getMyTable());

			elements.put(Field_3052, DeletePackage.eINSTANCE.getField());

			elements.put(RootJunction_3040, DeletePackage.eINSTANCE.getRootJunction());

			elements.put(Junction_3041, DeletePackage.eINSTANCE.getJunction());

			elements.put(Term_3042, DeletePackage.eINSTANCE.getTerm());

			elements.put(CallSurfaceQuery_3025, DeletePackage.eINSTANCE.getCallSurfaceQuery());

			elements.put(CallSurfaceQuery_3014, DeletePackage.eINSTANCE.getCallSurfaceQuery());

			elements.put(Field_3015, DeletePackage.eINSTANCE.getField());

			elements.put(Literal_3016, DeletePackage.eINSTANCE.getLiteral());

			elements.put(NullLiteral_3017, DeletePackage.eINSTANCE.getNullLiteral());

			elements.put(Function_3018, DeletePackage.eINSTANCE.getFunction());

			elements.put(Input_3019, DeletePackage.eINSTANCE.getInput());

			elements.put(Field_3012, DeletePackage.eINSTANCE.getField());

			elements.put(Literal_3026, DeletePackage.eINSTANCE.getLiteral());

			elements.put(NullLiteral_3027, DeletePackage.eINSTANCE.getNullLiteral());

			elements.put(Function_3028, DeletePackage.eINSTANCE.getFunction());

			elements.put(Input_3029, DeletePackage.eINSTANCE.getInput());

			elements.put(FieldSPointer_3043, DeletePackage.eINSTANCE.getFieldSPointer());

			elements.put(CallSurfaceQuery_3044, DeletePackage.eINSTANCE.getCallSurfaceQuery());

			elements.put(Field_3045, DeletePackage.eINSTANCE.getField());

			elements.put(Literal_3046, DeletePackage.eINSTANCE.getLiteral());

			elements.put(NullLiteral_3047, DeletePackage.eINSTANCE.getNullLiteral());

			elements.put(Function_3048, DeletePackage.eINSTANCE.getFunction());

			elements.put(Input_3049, DeletePackage.eINSTANCE.getInput());

			elements.put(MyTable_3053, DeletePackage.eINSTANCE.getMyTable());

			elements.put(InnerjoinRels_4001, DeletePackage.eINSTANCE.getInnerjoinRels());

			elements.put(LeftOuterJoinRels_4002, DeletePackage.eINSTANCE.getLeftOuterJoinRels());

			elements.put(RightOuterJoinRels_4003, DeletePackage.eINSTANCE.getRightOuterJoinRels());

			elements.put(FullOuterJoinRels_4004, DeletePackage.eINSTANCE.getFullOuterJoinRels());

			elements.put(EqualLink_4006, DeletePackage.eINSTANCE.getEqualLink());

			elements.put(GreaterThanLink_4007, DeletePackage.eINSTANCE.getGreaterThanLink());

			elements.put(GreaterEqualThanLink_4008, DeletePackage.eINSTANCE.getGreaterEqualThanLink());

			elements.put(LowerThanLink_4009, DeletePackage.eINSTANCE.getLowerThanLink());

			elements.put(LowerEqualThanLink_4010, DeletePackage.eINSTANCE.getLowerEqualThanLink());

			elements.put(InLink_4011, DeletePackage.eINSTANCE.getInLink());

			elements.put(LikeLink_4012, DeletePackage.eINSTANCE.getLikeLink());

			elements.put(JuncRelationship_4013, DeletePackage.eINSTANCE.getJuncRelationship());
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
			KNOWN_ELEMENT_TYPES.add(DeleteSurface_1000);
			KNOWN_ELEMENT_TYPES.add(InputInstalment_2001);
			KNOWN_ELEMENT_TYPES.add(TableListInstalment_2002);
			KNOWN_ELEMENT_TYPES.add(ConditionInstalment_2005);
			KNOWN_ELEMENT_TYPES.add(SortInstalment_2006);
			KNOWN_ELEMENT_TYPES.add(Dummy_2007);
			KNOWN_ELEMENT_TYPES.add(InputStringDef_3001);
			KNOWN_ELEMENT_TYPES.add(InputIntDef_3002);
			KNOWN_ELEMENT_TYPES.add(InputDateDef_3003);
			KNOWN_ELEMENT_TYPES.add(InputBitsDef_3004);
			KNOWN_ELEMENT_TYPES.add(InputFloatDef_3037);
			KNOWN_ELEMENT_TYPES.add(MyTable_3051);
			KNOWN_ELEMENT_TYPES.add(Field_3052);
			KNOWN_ELEMENT_TYPES.add(RootJunction_3040);
			KNOWN_ELEMENT_TYPES.add(Junction_3041);
			KNOWN_ELEMENT_TYPES.add(Term_3042);
			KNOWN_ELEMENT_TYPES.add(CallSurfaceQuery_3025);
			KNOWN_ELEMENT_TYPES.add(CallSurfaceQuery_3014);
			KNOWN_ELEMENT_TYPES.add(Field_3015);
			KNOWN_ELEMENT_TYPES.add(Literal_3016);
			KNOWN_ELEMENT_TYPES.add(NullLiteral_3017);
			KNOWN_ELEMENT_TYPES.add(Function_3018);
			KNOWN_ELEMENT_TYPES.add(Input_3019);
			KNOWN_ELEMENT_TYPES.add(Field_3012);
			KNOWN_ELEMENT_TYPES.add(Literal_3026);
			KNOWN_ELEMENT_TYPES.add(NullLiteral_3027);
			KNOWN_ELEMENT_TYPES.add(Function_3028);
			KNOWN_ELEMENT_TYPES.add(Input_3029);
			KNOWN_ELEMENT_TYPES.add(FieldSPointer_3043);
			KNOWN_ELEMENT_TYPES.add(CallSurfaceQuery_3044);
			KNOWN_ELEMENT_TYPES.add(Field_3045);
			KNOWN_ELEMENT_TYPES.add(Literal_3046);
			KNOWN_ELEMENT_TYPES.add(NullLiteral_3047);
			KNOWN_ELEMENT_TYPES.add(Function_3048);
			KNOWN_ELEMENT_TYPES.add(Input_3049);
			KNOWN_ELEMENT_TYPES.add(MyTable_3053);
			KNOWN_ELEMENT_TYPES.add(InnerjoinRels_4001);
			KNOWN_ELEMENT_TYPES.add(LeftOuterJoinRels_4002);
			KNOWN_ELEMENT_TYPES.add(RightOuterJoinRels_4003);
			KNOWN_ELEMENT_TYPES.add(FullOuterJoinRels_4004);
			KNOWN_ELEMENT_TYPES.add(EqualLink_4006);
			KNOWN_ELEMENT_TYPES.add(GreaterThanLink_4007);
			KNOWN_ELEMENT_TYPES.add(GreaterEqualThanLink_4008);
			KNOWN_ELEMENT_TYPES.add(LowerThanLink_4009);
			KNOWN_ELEMENT_TYPES.add(LowerEqualThanLink_4010);
			KNOWN_ELEMENT_TYPES.add(InLink_4011);
			KNOWN_ELEMENT_TYPES.add(LikeLink_4012);
			KNOWN_ELEMENT_TYPES.add(JuncRelationship_4013);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DeleteSurfaceEditPart.VISUAL_ID:
			return DeleteSurface_1000;
		case InputInstalmentEditPart.VISUAL_ID:
			return InputInstalment_2001;
		case TableListInstalmentEditPart.VISUAL_ID:
			return TableListInstalment_2002;
		case ConditionInstalmentEditPart.VISUAL_ID:
			return ConditionInstalment_2005;
		case SortInstalmentEditPart.VISUAL_ID:
			return SortInstalment_2006;
		case DummyEditPart.VISUAL_ID:
			return Dummy_2007;
		case InputStringDefEditPart.VISUAL_ID:
			return InputStringDef_3001;
		case InputIntDefEditPart.VISUAL_ID:
			return InputIntDef_3002;
		case InputDateDefEditPart.VISUAL_ID:
			return InputDateDef_3003;
		case InputBitsDefEditPart.VISUAL_ID:
			return InputBitsDef_3004;
		case InputFloatDefEditPart.VISUAL_ID:
			return InputFloatDef_3037;
		case MyTableEditPart.VISUAL_ID:
			return MyTable_3051;
		case FieldEditPart.VISUAL_ID:
			return Field_3052;
		case RootJunctionEditPart.VISUAL_ID:
			return RootJunction_3040;
		case JunctionEditPart.VISUAL_ID:
			return Junction_3041;
		case TermEditPart.VISUAL_ID:
			return Term_3042;
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return CallSurfaceQuery_3025;
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return CallSurfaceQuery_3014;
		case Field2EditPart.VISUAL_ID:
			return Field_3015;
		case LiteralEditPart.VISUAL_ID:
			return Literal_3016;
		case NullLiteralEditPart.VISUAL_ID:
			return NullLiteral_3017;
		case FunctionEditPart.VISUAL_ID:
			return Function_3018;
		case InputEditPart.VISUAL_ID:
			return Input_3019;
		case Field3EditPart.VISUAL_ID:
			return Field_3012;
		case Literal2EditPart.VISUAL_ID:
			return Literal_3026;
		case NullLiteral2EditPart.VISUAL_ID:
			return NullLiteral_3027;
		case Function2EditPart.VISUAL_ID:
			return Function_3028;
		case Input2EditPart.VISUAL_ID:
			return Input_3029;
		case FieldSPointerEditPart.VISUAL_ID:
			return FieldSPointer_3043;
		case CallSurfaceQuery3EditPart.VISUAL_ID:
			return CallSurfaceQuery_3044;
		case Field4EditPart.VISUAL_ID:
			return Field_3045;
		case Literal3EditPart.VISUAL_ID:
			return Literal_3046;
		case NullLiteral3EditPart.VISUAL_ID:
			return NullLiteral_3047;
		case Function3EditPart.VISUAL_ID:
			return Function_3048;
		case Input3EditPart.VISUAL_ID:
			return Input_3049;
		case MyTable2EditPart.VISUAL_ID:
			return MyTable_3053;
		case InnerjoinRelsEditPart.VISUAL_ID:
			return InnerjoinRels_4001;
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return LeftOuterJoinRels_4002;
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return RightOuterJoinRels_4003;
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return FullOuterJoinRels_4004;
		case EqualLinkEditPart.VISUAL_ID:
			return EqualLink_4006;
		case GreaterThanLinkEditPart.VISUAL_ID:
			return GreaterThanLink_4007;
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return GreaterEqualThanLink_4008;
		case LowerThanLinkEditPart.VISUAL_ID:
			return LowerThanLink_4009;
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return LowerEqualThanLink_4010;
		case InLinkEditPart.VISUAL_ID:
			return InLink_4011;
		case LikeLinkEditPart.VISUAL_ID:
			return LikeLink_4012;
		case JuncRelationshipEditPart.VISUAL_ID:
			return JuncRelationship_4013;
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
			return delete.diagram.providers.DeleteElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return delete.diagram.providers.DeleteElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return delete.diagram.providers.DeleteElementTypes.getElement(elementTypeAdapter);
		}
	};

}
