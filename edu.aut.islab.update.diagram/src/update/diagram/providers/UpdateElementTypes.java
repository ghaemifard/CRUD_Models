/*
 * 
 */
package update.diagram.providers;

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

import update.UpdatePackage;
import update.diagram.edit.parts.CallSurfaceQuery2EditPart;
import update.diagram.edit.parts.CallSurfaceQuery3EditPart;
import update.diagram.edit.parts.CallSurfaceQueryEditPart;
import update.diagram.edit.parts.ConditionInstalmentEditPart;
import update.diagram.edit.parts.EqualLinkEditPart;
import update.diagram.edit.parts.Field2EditPart;
import update.diagram.edit.parts.Field3EditPart;
import update.diagram.edit.parts.FieldEditPart;
import update.diagram.edit.parts.FieldSPointerEditPart;
import update.diagram.edit.parts.FullOuterJoinRelsEditPart;
import update.diagram.edit.parts.Function2EditPart;
import update.diagram.edit.parts.Function3EditPart;
import update.diagram.edit.parts.FunctionEditPart;
import update.diagram.edit.parts.GreaterEqualThanLinkEditPart;
import update.diagram.edit.parts.GreaterThanLinkEditPart;
import update.diagram.edit.parts.InLinkEditPart;
import update.diagram.edit.parts.InnerjoinRelsEditPart;
import update.diagram.edit.parts.Input2EditPart;
import update.diagram.edit.parts.Input3EditPart;
import update.diagram.edit.parts.InputBitsDefEditPart;
import update.diagram.edit.parts.InputDateDefEditPart;
import update.diagram.edit.parts.InputEditPart;
import update.diagram.edit.parts.InputFloatDefEditPart;
import update.diagram.edit.parts.InputInstalmentEditPart;
import update.diagram.edit.parts.InputIntDefEditPart;
import update.diagram.edit.parts.InputStringDefEditPart;
import update.diagram.edit.parts.JuncRelationshipEditPart;
import update.diagram.edit.parts.JunctionEditPart;
import update.diagram.edit.parts.LeftOuterJoinRelsEditPart;
import update.diagram.edit.parts.LikeLinkEditPart;
import update.diagram.edit.parts.LinkFieldEditPart;
import update.diagram.edit.parts.Literal2EditPart;
import update.diagram.edit.parts.Literal3EditPart;
import update.diagram.edit.parts.LiteralEditPart;
import update.diagram.edit.parts.LowerEqualThanLinkEditPart;
import update.diagram.edit.parts.LowerThanLinkEditPart;
import update.diagram.edit.parts.MyTableEditPart;
import update.diagram.edit.parts.NullLiteral2EditPart;
import update.diagram.edit.parts.NullLiteral3EditPart;
import update.diagram.edit.parts.NullLiteralEditPart;
import update.diagram.edit.parts.PrepareListEditPart;
import update.diagram.edit.parts.RealFieldEditPart;
import update.diagram.edit.parts.RightOuterJoinRelsEditPart;
import update.diagram.edit.parts.RootJunctionEditPart;
import update.diagram.edit.parts.SortInstalmentEditPart;
import update.diagram.edit.parts.TableSelectionEditPart;
import update.diagram.edit.parts.TermEditPart;
import update.diagram.edit.parts.UpdateSurfaceEditPart;
import update.diagram.part.UpdateDiagramEditorPlugin;

/**
 * @generated
 */
public class UpdateElementTypes {

	/**
	* @generated
	*/
	private UpdateElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			UpdateDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType UpdateSurface_1000 = getElementType(
			"edu.aut.islab.update.diagram.UpdateSurface_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputInstalment_2001 = getElementType(
			"edu.aut.islab.update.diagram.InputInstalment_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PrepareList_2002 = getElementType("edu.aut.islab.update.diagram.PrepareList_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TableSelection_2003 = getElementType(
			"edu.aut.islab.update.diagram.TableSelection_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SortInstalment_2005 = getElementType(
			"edu.aut.islab.update.diagram.SortInstalment_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConditionInstalment_2004 = getElementType(
			"edu.aut.islab.update.diagram.ConditionInstalment_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputStringDef_3001 = getElementType(
			"edu.aut.islab.update.diagram.InputStringDef_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputIntDef_3002 = getElementType("edu.aut.islab.update.diagram.InputIntDef_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputDateDef_3003 = getElementType(
			"edu.aut.islab.update.diagram.InputDateDef_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputBitsDef_3004 = getElementType(
			"edu.aut.islab.update.diagram.InputBitsDef_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputFloatDef_3028 = getElementType(
			"edu.aut.islab.update.diagram.InputFloatDef_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallSurfaceQuery_3005 = getElementType(
			"edu.aut.islab.update.diagram.CallSurfaceQuery_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallSurfaceQuery_3006 = getElementType(
			"edu.aut.islab.update.diagram.CallSurfaceQuery_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3007 = getElementType("edu.aut.islab.update.diagram.Field_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Literal_3008 = getElementType("edu.aut.islab.update.diagram.Literal_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NullLiteral_3009 = getElementType("edu.aut.islab.update.diagram.NullLiteral_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_3010 = getElementType("edu.aut.islab.update.diagram.Function_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3011 = getElementType("edu.aut.islab.update.diagram.Input_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3012 = getElementType("edu.aut.islab.update.diagram.Field_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Literal_3013 = getElementType("edu.aut.islab.update.diagram.Literal_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NullLiteral_3014 = getElementType("edu.aut.islab.update.diagram.NullLiteral_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_3015 = getElementType("edu.aut.islab.update.diagram.Function_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3016 = getElementType("edu.aut.islab.update.diagram.Input_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MyTable_3026 = getElementType("edu.aut.islab.update.diagram.MyTable_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RealField_3029 = getElementType("edu.aut.islab.update.diagram.RealField_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FieldSPointer_3030 = getElementType(
			"edu.aut.islab.update.diagram.FieldSPointer_3030"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RootJunction_3031 = getElementType(
			"edu.aut.islab.update.diagram.RootJunction_3031"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Junction_3032 = getElementType("edu.aut.islab.update.diagram.Junction_3032"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Term_3019 = getElementType("edu.aut.islab.update.diagram.Term_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallSurfaceQuery_3020 = getElementType(
			"edu.aut.islab.update.diagram.CallSurfaceQuery_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3021 = getElementType("edu.aut.islab.update.diagram.Field_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Literal_3022 = getElementType("edu.aut.islab.update.diagram.Literal_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NullLiteral_3023 = getElementType("edu.aut.islab.update.diagram.NullLiteral_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_3024 = getElementType("edu.aut.islab.update.diagram.Function_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3025 = getElementType("edu.aut.islab.update.diagram.Input_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InnerjoinRels_4010 = getElementType(
			"edu.aut.islab.update.diagram.InnerjoinRels_4010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LeftOuterJoinRels_4011 = getElementType(
			"edu.aut.islab.update.diagram.LeftOuterJoinRels_4011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RightOuterJoinRels_4012 = getElementType(
			"edu.aut.islab.update.diagram.RightOuterJoinRels_4012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FullOuterJoinRels_4013 = getElementType(
			"edu.aut.islab.update.diagram.FullOuterJoinRels_4013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EqualLink_4001 = getElementType("edu.aut.islab.update.diagram.EqualLink_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GreaterThanLink_4002 = getElementType(
			"edu.aut.islab.update.diagram.GreaterThanLink_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GreaterEqualThanLink_4003 = getElementType(
			"edu.aut.islab.update.diagram.GreaterEqualThanLink_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LowerThanLink_4004 = getElementType(
			"edu.aut.islab.update.diagram.LowerThanLink_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LowerEqualThanLink_4005 = getElementType(
			"edu.aut.islab.update.diagram.LowerEqualThanLink_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InLink_4006 = getElementType("edu.aut.islab.update.diagram.InLink_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LikeLink_4007 = getElementType("edu.aut.islab.update.diagram.LikeLink_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LinkField_4008 = getElementType("edu.aut.islab.update.diagram.LinkField_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JuncRelationship_4014 = getElementType(
			"edu.aut.islab.update.diagram.JuncRelationship_4014"); //$NON-NLS-1$

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

			elements.put(UpdateSurface_1000, UpdatePackage.eINSTANCE.getUpdateSurface());

			elements.put(InputInstalment_2001, UpdatePackage.eINSTANCE.getInputInstalment());

			elements.put(PrepareList_2002, UpdatePackage.eINSTANCE.getPrepareList());

			elements.put(TableSelection_2003, UpdatePackage.eINSTANCE.getTableSelection());

			elements.put(SortInstalment_2005, UpdatePackage.eINSTANCE.getSortInstalment());

			elements.put(ConditionInstalment_2004, UpdatePackage.eINSTANCE.getConditionInstalment());

			elements.put(InputStringDef_3001, UpdatePackage.eINSTANCE.getInputStringDef());

			elements.put(InputIntDef_3002, UpdatePackage.eINSTANCE.getInputIntDef());

			elements.put(InputDateDef_3003, UpdatePackage.eINSTANCE.getInputDateDef());

			elements.put(InputBitsDef_3004, UpdatePackage.eINSTANCE.getInputBitsDef());

			elements.put(InputFloatDef_3028, UpdatePackage.eINSTANCE.getInputFloatDef());

			elements.put(CallSurfaceQuery_3005, UpdatePackage.eINSTANCE.getCallSurfaceQuery());

			elements.put(CallSurfaceQuery_3006, UpdatePackage.eINSTANCE.getCallSurfaceQuery());

			elements.put(Field_3007, UpdatePackage.eINSTANCE.getField());

			elements.put(Literal_3008, UpdatePackage.eINSTANCE.getLiteral());

			elements.put(NullLiteral_3009, UpdatePackage.eINSTANCE.getNullLiteral());

			elements.put(Function_3010, UpdatePackage.eINSTANCE.getFunction());

			elements.put(Input_3011, UpdatePackage.eINSTANCE.getInput());

			elements.put(Field_3012, UpdatePackage.eINSTANCE.getField());

			elements.put(Literal_3013, UpdatePackage.eINSTANCE.getLiteral());

			elements.put(NullLiteral_3014, UpdatePackage.eINSTANCE.getNullLiteral());

			elements.put(Function_3015, UpdatePackage.eINSTANCE.getFunction());

			elements.put(Input_3016, UpdatePackage.eINSTANCE.getInput());

			elements.put(MyTable_3026, UpdatePackage.eINSTANCE.getMyTable());

			elements.put(RealField_3029, UpdatePackage.eINSTANCE.getRealField());

			elements.put(FieldSPointer_3030, UpdatePackage.eINSTANCE.getFieldSPointer());

			elements.put(RootJunction_3031, UpdatePackage.eINSTANCE.getRootJunction());

			elements.put(Junction_3032, UpdatePackage.eINSTANCE.getJunction());

			elements.put(Term_3019, UpdatePackage.eINSTANCE.getTerm());

			elements.put(CallSurfaceQuery_3020, UpdatePackage.eINSTANCE.getCallSurfaceQuery());

			elements.put(Field_3021, UpdatePackage.eINSTANCE.getField());

			elements.put(Literal_3022, UpdatePackage.eINSTANCE.getLiteral());

			elements.put(NullLiteral_3023, UpdatePackage.eINSTANCE.getNullLiteral());

			elements.put(Function_3024, UpdatePackage.eINSTANCE.getFunction());

			elements.put(Input_3025, UpdatePackage.eINSTANCE.getInput());

			elements.put(InnerjoinRels_4010, UpdatePackage.eINSTANCE.getInnerjoinRels());

			elements.put(LeftOuterJoinRels_4011, UpdatePackage.eINSTANCE.getLeftOuterJoinRels());

			elements.put(RightOuterJoinRels_4012, UpdatePackage.eINSTANCE.getRightOuterJoinRels());

			elements.put(FullOuterJoinRels_4013, UpdatePackage.eINSTANCE.getFullOuterJoinRels());

			elements.put(EqualLink_4001, UpdatePackage.eINSTANCE.getEqualLink());

			elements.put(GreaterThanLink_4002, UpdatePackage.eINSTANCE.getGreaterThanLink());

			elements.put(GreaterEqualThanLink_4003, UpdatePackage.eINSTANCE.getGreaterEqualThanLink());

			elements.put(LowerThanLink_4004, UpdatePackage.eINSTANCE.getLowerThanLink());

			elements.put(LowerEqualThanLink_4005, UpdatePackage.eINSTANCE.getLowerEqualThanLink());

			elements.put(InLink_4006, UpdatePackage.eINSTANCE.getInLink());

			elements.put(LikeLink_4007, UpdatePackage.eINSTANCE.getLikeLink());

			elements.put(LinkField_4008, UpdatePackage.eINSTANCE.getLinkField());

			elements.put(JuncRelationship_4014, UpdatePackage.eINSTANCE.getJuncRelationship());
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
			KNOWN_ELEMENT_TYPES.add(UpdateSurface_1000);
			KNOWN_ELEMENT_TYPES.add(InputInstalment_2001);
			KNOWN_ELEMENT_TYPES.add(PrepareList_2002);
			KNOWN_ELEMENT_TYPES.add(TableSelection_2003);
			KNOWN_ELEMENT_TYPES.add(SortInstalment_2005);
			KNOWN_ELEMENT_TYPES.add(ConditionInstalment_2004);
			KNOWN_ELEMENT_TYPES.add(InputStringDef_3001);
			KNOWN_ELEMENT_TYPES.add(InputIntDef_3002);
			KNOWN_ELEMENT_TYPES.add(InputDateDef_3003);
			KNOWN_ELEMENT_TYPES.add(InputBitsDef_3004);
			KNOWN_ELEMENT_TYPES.add(InputFloatDef_3028);
			KNOWN_ELEMENT_TYPES.add(CallSurfaceQuery_3005);
			KNOWN_ELEMENT_TYPES.add(CallSurfaceQuery_3006);
			KNOWN_ELEMENT_TYPES.add(Field_3007);
			KNOWN_ELEMENT_TYPES.add(Literal_3008);
			KNOWN_ELEMENT_TYPES.add(NullLiteral_3009);
			KNOWN_ELEMENT_TYPES.add(Function_3010);
			KNOWN_ELEMENT_TYPES.add(Input_3011);
			KNOWN_ELEMENT_TYPES.add(Field_3012);
			KNOWN_ELEMENT_TYPES.add(Literal_3013);
			KNOWN_ELEMENT_TYPES.add(NullLiteral_3014);
			KNOWN_ELEMENT_TYPES.add(Function_3015);
			KNOWN_ELEMENT_TYPES.add(Input_3016);
			KNOWN_ELEMENT_TYPES.add(MyTable_3026);
			KNOWN_ELEMENT_TYPES.add(RealField_3029);
			KNOWN_ELEMENT_TYPES.add(FieldSPointer_3030);
			KNOWN_ELEMENT_TYPES.add(RootJunction_3031);
			KNOWN_ELEMENT_TYPES.add(Junction_3032);
			KNOWN_ELEMENT_TYPES.add(Term_3019);
			KNOWN_ELEMENT_TYPES.add(CallSurfaceQuery_3020);
			KNOWN_ELEMENT_TYPES.add(Field_3021);
			KNOWN_ELEMENT_TYPES.add(Literal_3022);
			KNOWN_ELEMENT_TYPES.add(NullLiteral_3023);
			KNOWN_ELEMENT_TYPES.add(Function_3024);
			KNOWN_ELEMENT_TYPES.add(Input_3025);
			KNOWN_ELEMENT_TYPES.add(InnerjoinRels_4010);
			KNOWN_ELEMENT_TYPES.add(LeftOuterJoinRels_4011);
			KNOWN_ELEMENT_TYPES.add(RightOuterJoinRels_4012);
			KNOWN_ELEMENT_TYPES.add(FullOuterJoinRels_4013);
			KNOWN_ELEMENT_TYPES.add(EqualLink_4001);
			KNOWN_ELEMENT_TYPES.add(GreaterThanLink_4002);
			KNOWN_ELEMENT_TYPES.add(GreaterEqualThanLink_4003);
			KNOWN_ELEMENT_TYPES.add(LowerThanLink_4004);
			KNOWN_ELEMENT_TYPES.add(LowerEqualThanLink_4005);
			KNOWN_ELEMENT_TYPES.add(InLink_4006);
			KNOWN_ELEMENT_TYPES.add(LikeLink_4007);
			KNOWN_ELEMENT_TYPES.add(LinkField_4008);
			KNOWN_ELEMENT_TYPES.add(JuncRelationship_4014);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case UpdateSurfaceEditPart.VISUAL_ID:
			return UpdateSurface_1000;
		case InputInstalmentEditPart.VISUAL_ID:
			return InputInstalment_2001;
		case PrepareListEditPart.VISUAL_ID:
			return PrepareList_2002;
		case TableSelectionEditPart.VISUAL_ID:
			return TableSelection_2003;
		case SortInstalmentEditPart.VISUAL_ID:
			return SortInstalment_2005;
		case ConditionInstalmentEditPart.VISUAL_ID:
			return ConditionInstalment_2004;
		case InputStringDefEditPart.VISUAL_ID:
			return InputStringDef_3001;
		case InputIntDefEditPart.VISUAL_ID:
			return InputIntDef_3002;
		case InputDateDefEditPart.VISUAL_ID:
			return InputDateDef_3003;
		case InputBitsDefEditPart.VISUAL_ID:
			return InputBitsDef_3004;
		case InputFloatDefEditPart.VISUAL_ID:
			return InputFloatDef_3028;
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return CallSurfaceQuery_3005;
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return CallSurfaceQuery_3006;
		case FieldEditPart.VISUAL_ID:
			return Field_3007;
		case LiteralEditPart.VISUAL_ID:
			return Literal_3008;
		case NullLiteralEditPart.VISUAL_ID:
			return NullLiteral_3009;
		case FunctionEditPart.VISUAL_ID:
			return Function_3010;
		case InputEditPart.VISUAL_ID:
			return Input_3011;
		case Field2EditPart.VISUAL_ID:
			return Field_3012;
		case Literal2EditPart.VISUAL_ID:
			return Literal_3013;
		case NullLiteral2EditPart.VISUAL_ID:
			return NullLiteral_3014;
		case Function2EditPart.VISUAL_ID:
			return Function_3015;
		case Input2EditPart.VISUAL_ID:
			return Input_3016;
		case MyTableEditPart.VISUAL_ID:
			return MyTable_3026;
		case RealFieldEditPart.VISUAL_ID:
			return RealField_3029;
		case FieldSPointerEditPart.VISUAL_ID:
			return FieldSPointer_3030;
		case RootJunctionEditPart.VISUAL_ID:
			return RootJunction_3031;
		case JunctionEditPart.VISUAL_ID:
			return Junction_3032;
		case TermEditPart.VISUAL_ID:
			return Term_3019;
		case CallSurfaceQuery3EditPart.VISUAL_ID:
			return CallSurfaceQuery_3020;
		case Field3EditPart.VISUAL_ID:
			return Field_3021;
		case Literal3EditPart.VISUAL_ID:
			return Literal_3022;
		case NullLiteral3EditPart.VISUAL_ID:
			return NullLiteral_3023;
		case Function3EditPart.VISUAL_ID:
			return Function_3024;
		case Input3EditPart.VISUAL_ID:
			return Input_3025;
		case InnerjoinRelsEditPart.VISUAL_ID:
			return InnerjoinRels_4010;
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return LeftOuterJoinRels_4011;
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return RightOuterJoinRels_4012;
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return FullOuterJoinRels_4013;
		case EqualLinkEditPart.VISUAL_ID:
			return EqualLink_4001;
		case GreaterThanLinkEditPart.VISUAL_ID:
			return GreaterThanLink_4002;
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return GreaterEqualThanLink_4003;
		case LowerThanLinkEditPart.VISUAL_ID:
			return LowerThanLink_4004;
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return LowerEqualThanLink_4005;
		case InLinkEditPart.VISUAL_ID:
			return InLink_4006;
		case LikeLinkEditPart.VISUAL_ID:
			return LikeLink_4007;
		case LinkFieldEditPart.VISUAL_ID:
			return LinkField_4008;
		case JuncRelationshipEditPart.VISUAL_ID:
			return JuncRelationship_4014;
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
			return update.diagram.providers.UpdateElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return update.diagram.providers.UpdateElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return update.diagram.providers.UpdateElementTypes.getElement(elementTypeAdapter);
		}
	};

}
