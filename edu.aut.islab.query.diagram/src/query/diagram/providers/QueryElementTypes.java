/*
 * 
 */
package query.diagram.providers;

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

import query.QueryPackage;
import query.diagram.edit.parts.CallQuerySurface2EditPart;
import query.diagram.edit.parts.CallQuerySurface3EditPart;
import query.diagram.edit.parts.CallQuerySurfaceEditPart;
import query.diagram.edit.parts.EqualLinkEditPart;
import query.diagram.edit.parts.Field2EditPart;
import query.diagram.edit.parts.Field3EditPart;
import query.diagram.edit.parts.Field4EditPart;
import query.diagram.edit.parts.FieldEditPart;
import query.diagram.edit.parts.FieldGPointerEditPart;
import query.diagram.edit.parts.FieldSPointerEditPart;
import query.diagram.edit.parts.FullOuterJoinRelsEditPart;
import query.diagram.edit.parts.Function2EditPart;
import query.diagram.edit.parts.Function3EditPart;
import query.diagram.edit.parts.FunctionEditPart;
import query.diagram.edit.parts.GreaterEqualThanLinkEditPart;
import query.diagram.edit.parts.GreaterThanLinkEditPart;
import query.diagram.edit.parts.GroupInstalmentEditPart;
import query.diagram.edit.parts.HavingInstalmentEditPart;
import query.diagram.edit.parts.InLinkEditPart;
import query.diagram.edit.parts.InnerjoinRelsEditPart;
import query.diagram.edit.parts.Input2EditPart;
import query.diagram.edit.parts.Input3EditPart;
import query.diagram.edit.parts.InputBitsDefEditPart;
import query.diagram.edit.parts.InputDateDefEditPart;
import query.diagram.edit.parts.InputEditPart;
import query.diagram.edit.parts.InputFloatDefEditPart;
import query.diagram.edit.parts.InputInstalmentEditPart;
import query.diagram.edit.parts.InputIntDefEditPart;
import query.diagram.edit.parts.InputStringDefEditPart;
import query.diagram.edit.parts.JuncRelationshipEditPart;
import query.diagram.edit.parts.JunctionEditPart;
import query.diagram.edit.parts.LeftOuterJoinRelsEditPart;
import query.diagram.edit.parts.LikeLinkEditPart;
import query.diagram.edit.parts.Literal2EditPart;
import query.diagram.edit.parts.Literal3EditPart;
import query.diagram.edit.parts.LiteralEditPart;
import query.diagram.edit.parts.LowerEqualThanLinkEditPart;
import query.diagram.edit.parts.LowerThanLinkEditPart;
import query.diagram.edit.parts.MyTableEditPart;
import query.diagram.edit.parts.NullLiteral2EditPart;
import query.diagram.edit.parts.NullLiteral3EditPart;
import query.diagram.edit.parts.NullLiteralEditPart;
import query.diagram.edit.parts.OutputInstalmentEditPart;
import query.diagram.edit.parts.QuerySurfaceEditPart;
import query.diagram.edit.parts.RightOuterJoinRelsEditPart;
import query.diagram.edit.parts.RootJunctionEditPart;
import query.diagram.edit.parts.SortInstalmentEditPart;
import query.diagram.edit.parts.TermEditPart;
import query.diagram.edit.parts.WhereInstalmentEditPart;
import query.diagram.part.QueryDiagramEditorPlugin;

/**
 * @generated
 */
public class QueryElementTypes {

	/**
	* @generated
	*/
	private QueryElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			QueryDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType QuerySurface_1000 = getElementType(
			"edu.aut.islab.query.diagram.QuerySurface_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType WhereInstalment_2001 = getElementType(
			"edu.aut.islab.query.diagram.WhereInstalment_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HavingInstalment_2002 = getElementType(
			"edu.aut.islab.query.diagram.HavingInstalment_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OutputInstalment_2003 = getElementType(
			"edu.aut.islab.query.diagram.OutputInstalment_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputInstalment_2004 = getElementType(
			"edu.aut.islab.query.diagram.InputInstalment_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupInstalment_2005 = getElementType(
			"edu.aut.islab.query.diagram.GroupInstalment_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SortInstalment_2006 = getElementType(
			"edu.aut.islab.query.diagram.SortInstalment_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RootJunction_3001 = getElementType(
			"edu.aut.islab.query.diagram.RootJunction_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Junction_3002 = getElementType("edu.aut.islab.query.diagram.Junction_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Term_3003 = getElementType("edu.aut.islab.query.diagram.Term_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallQuerySurface_3004 = getElementType(
			"edu.aut.islab.query.diagram.CallQuerySurface_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallQuerySurface_3005 = getElementType(
			"edu.aut.islab.query.diagram.CallQuerySurface_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3006 = getElementType("edu.aut.islab.query.diagram.Field_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Literal_3007 = getElementType("edu.aut.islab.query.diagram.Literal_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NullLiteral_3008 = getElementType("edu.aut.islab.query.diagram.NullLiteral_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_3009 = getElementType("edu.aut.islab.query.diagram.Function_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3010 = getElementType("edu.aut.islab.query.diagram.Input_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3011 = getElementType("edu.aut.islab.query.diagram.Field_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Literal_3012 = getElementType("edu.aut.islab.query.diagram.Literal_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NullLiteral_3013 = getElementType("edu.aut.islab.query.diagram.NullLiteral_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_3014 = getElementType("edu.aut.islab.query.diagram.Function_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3015 = getElementType("edu.aut.islab.query.diagram.Input_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallQuerySurface_3016 = getElementType(
			"edu.aut.islab.query.diagram.CallQuerySurface_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3017 = getElementType("edu.aut.islab.query.diagram.Field_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Literal_3018 = getElementType("edu.aut.islab.query.diagram.Literal_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NullLiteral_3019 = getElementType("edu.aut.islab.query.diagram.NullLiteral_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_3020 = getElementType("edu.aut.islab.query.diagram.Function_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3021 = getElementType("edu.aut.islab.query.diagram.Input_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MyTable_3022 = getElementType("edu.aut.islab.query.diagram.MyTable_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Field_3023 = getElementType("edu.aut.islab.query.diagram.Field_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputStringDef_3024 = getElementType(
			"edu.aut.islab.query.diagram.InputStringDef_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputIntDef_3025 = getElementType("edu.aut.islab.query.diagram.InputIntDef_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputDateDef_3026 = getElementType(
			"edu.aut.islab.query.diagram.InputDateDef_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputBitsDef_3027 = getElementType(
			"edu.aut.islab.query.diagram.InputBitsDef_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputFloatDef_3032 = getElementType(
			"edu.aut.islab.query.diagram.InputFloatDef_3032"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType FieldGPointer_3030 = getElementType(
			"edu.aut.islab.query.diagram.FieldGPointer_3030"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FieldSPointer_3031 = getElementType(
			"edu.aut.islab.query.diagram.FieldSPointer_3031"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InnerjoinRels_4001 = getElementType(
			"edu.aut.islab.query.diagram.InnerjoinRels_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LeftOuterJoinRels_4002 = getElementType(
			"edu.aut.islab.query.diagram.LeftOuterJoinRels_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RightOuterJoinRels_4003 = getElementType(
			"edu.aut.islab.query.diagram.RightOuterJoinRels_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FullOuterJoinRels_4004 = getElementType(
			"edu.aut.islab.query.diagram.FullOuterJoinRels_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EqualLink_4005 = getElementType("edu.aut.islab.query.diagram.EqualLink_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GreaterThanLink_4006 = getElementType(
			"edu.aut.islab.query.diagram.GreaterThanLink_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GreaterEqualThanLink_4007 = getElementType(
			"edu.aut.islab.query.diagram.GreaterEqualThanLink_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LowerThanLink_4008 = getElementType(
			"edu.aut.islab.query.diagram.LowerThanLink_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LowerEqualThanLink_4009 = getElementType(
			"edu.aut.islab.query.diagram.LowerEqualThanLink_4009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InLink_4010 = getElementType("edu.aut.islab.query.diagram.InLink_4010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LikeLink_4011 = getElementType("edu.aut.islab.query.diagram.LikeLink_4011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JuncRelationship_4012 = getElementType(
			"edu.aut.islab.query.diagram.JuncRelationship_4012"); //$NON-NLS-1$

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

			elements.put(QuerySurface_1000, QueryPackage.eINSTANCE.getQuerySurface());

			elements.put(WhereInstalment_2001, QueryPackage.eINSTANCE.getWhereInstalment());

			elements.put(HavingInstalment_2002, QueryPackage.eINSTANCE.getHavingInstalment());

			elements.put(OutputInstalment_2003, QueryPackage.eINSTANCE.getOutputInstalment());

			elements.put(InputInstalment_2004, QueryPackage.eINSTANCE.getInputInstalment());

			elements.put(GroupInstalment_2005, QueryPackage.eINSTANCE.getGroupInstalment());

			elements.put(SortInstalment_2006, QueryPackage.eINSTANCE.getSortInstalment());

			elements.put(RootJunction_3001, QueryPackage.eINSTANCE.getRootJunction());

			elements.put(Junction_3002, QueryPackage.eINSTANCE.getJunction());

			elements.put(Term_3003, QueryPackage.eINSTANCE.getTerm());

			elements.put(CallQuerySurface_3004, QueryPackage.eINSTANCE.getCallQuerySurface());

			elements.put(CallQuerySurface_3005, QueryPackage.eINSTANCE.getCallQuerySurface());

			elements.put(Field_3006, QueryPackage.eINSTANCE.getField());

			elements.put(Literal_3007, QueryPackage.eINSTANCE.getLiteral());

			elements.put(NullLiteral_3008, QueryPackage.eINSTANCE.getNullLiteral());

			elements.put(Function_3009, QueryPackage.eINSTANCE.getFunction());

			elements.put(Input_3010, QueryPackage.eINSTANCE.getInput());

			elements.put(Field_3011, QueryPackage.eINSTANCE.getField());

			elements.put(Literal_3012, QueryPackage.eINSTANCE.getLiteral());

			elements.put(NullLiteral_3013, QueryPackage.eINSTANCE.getNullLiteral());

			elements.put(Function_3014, QueryPackage.eINSTANCE.getFunction());

			elements.put(Input_3015, QueryPackage.eINSTANCE.getInput());

			elements.put(CallQuerySurface_3016, QueryPackage.eINSTANCE.getCallQuerySurface());

			elements.put(Field_3017, QueryPackage.eINSTANCE.getField());

			elements.put(Literal_3018, QueryPackage.eINSTANCE.getLiteral());

			elements.put(NullLiteral_3019, QueryPackage.eINSTANCE.getNullLiteral());

			elements.put(Function_3020, QueryPackage.eINSTANCE.getFunction());

			elements.put(Input_3021, QueryPackage.eINSTANCE.getInput());

			elements.put(MyTable_3022, QueryPackage.eINSTANCE.getMyTable());

			elements.put(Field_3023, QueryPackage.eINSTANCE.getField());

			elements.put(InputStringDef_3024, QueryPackage.eINSTANCE.getInputStringDef());

			elements.put(InputIntDef_3025, QueryPackage.eINSTANCE.getInputIntDef());

			elements.put(InputDateDef_3026, QueryPackage.eINSTANCE.getInputDateDef());

			elements.put(InputBitsDef_3027, QueryPackage.eINSTANCE.getInputBitsDef());

			elements.put(InputFloatDef_3032, QueryPackage.eINSTANCE.getInputFloatDef());

			elements.put(FieldGPointer_3030, QueryPackage.eINSTANCE.getFieldGPointer());

			elements.put(FieldSPointer_3031, QueryPackage.eINSTANCE.getFieldSPointer());

			elements.put(InnerjoinRels_4001, QueryPackage.eINSTANCE.getInnerjoinRels());

			elements.put(LeftOuterJoinRels_4002, QueryPackage.eINSTANCE.getLeftOuterJoinRels());

			elements.put(RightOuterJoinRels_4003, QueryPackage.eINSTANCE.getRightOuterJoinRels());

			elements.put(FullOuterJoinRels_4004, QueryPackage.eINSTANCE.getFullOuterJoinRels());

			elements.put(EqualLink_4005, QueryPackage.eINSTANCE.getEqualLink());

			elements.put(GreaterThanLink_4006, QueryPackage.eINSTANCE.getGreaterThanLink());

			elements.put(GreaterEqualThanLink_4007, QueryPackage.eINSTANCE.getGreaterEqualThanLink());

			elements.put(LowerThanLink_4008, QueryPackage.eINSTANCE.getLowerThanLink());

			elements.put(LowerEqualThanLink_4009, QueryPackage.eINSTANCE.getLowerEqualThanLink());

			elements.put(InLink_4010, QueryPackage.eINSTANCE.getInLink());

			elements.put(LikeLink_4011, QueryPackage.eINSTANCE.getLikeLink());

			elements.put(JuncRelationship_4012, QueryPackage.eINSTANCE.getJuncRelationship());
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
			KNOWN_ELEMENT_TYPES.add(QuerySurface_1000);
			KNOWN_ELEMENT_TYPES.add(WhereInstalment_2001);
			KNOWN_ELEMENT_TYPES.add(HavingInstalment_2002);
			KNOWN_ELEMENT_TYPES.add(OutputInstalment_2003);
			KNOWN_ELEMENT_TYPES.add(InputInstalment_2004);
			KNOWN_ELEMENT_TYPES.add(GroupInstalment_2005);
			KNOWN_ELEMENT_TYPES.add(SortInstalment_2006);
			KNOWN_ELEMENT_TYPES.add(RootJunction_3001);
			KNOWN_ELEMENT_TYPES.add(Junction_3002);
			KNOWN_ELEMENT_TYPES.add(Term_3003);
			KNOWN_ELEMENT_TYPES.add(CallQuerySurface_3004);
			KNOWN_ELEMENT_TYPES.add(CallQuerySurface_3005);
			KNOWN_ELEMENT_TYPES.add(Field_3006);
			KNOWN_ELEMENT_TYPES.add(Literal_3007);
			KNOWN_ELEMENT_TYPES.add(NullLiteral_3008);
			KNOWN_ELEMENT_TYPES.add(Function_3009);
			KNOWN_ELEMENT_TYPES.add(Input_3010);
			KNOWN_ELEMENT_TYPES.add(Field_3011);
			KNOWN_ELEMENT_TYPES.add(Literal_3012);
			KNOWN_ELEMENT_TYPES.add(NullLiteral_3013);
			KNOWN_ELEMENT_TYPES.add(Function_3014);
			KNOWN_ELEMENT_TYPES.add(Input_3015);
			KNOWN_ELEMENT_TYPES.add(CallQuerySurface_3016);
			KNOWN_ELEMENT_TYPES.add(Field_3017);
			KNOWN_ELEMENT_TYPES.add(Literal_3018);
			KNOWN_ELEMENT_TYPES.add(NullLiteral_3019);
			KNOWN_ELEMENT_TYPES.add(Function_3020);
			KNOWN_ELEMENT_TYPES.add(Input_3021);
			KNOWN_ELEMENT_TYPES.add(MyTable_3022);
			KNOWN_ELEMENT_TYPES.add(Field_3023);
			KNOWN_ELEMENT_TYPES.add(InputStringDef_3024);
			KNOWN_ELEMENT_TYPES.add(InputIntDef_3025);
			KNOWN_ELEMENT_TYPES.add(InputDateDef_3026);
			KNOWN_ELEMENT_TYPES.add(InputBitsDef_3027);
			KNOWN_ELEMENT_TYPES.add(InputFloatDef_3032);
			KNOWN_ELEMENT_TYPES.add(FieldGPointer_3030);
			KNOWN_ELEMENT_TYPES.add(FieldSPointer_3031);
			KNOWN_ELEMENT_TYPES.add(InnerjoinRels_4001);
			KNOWN_ELEMENT_TYPES.add(LeftOuterJoinRels_4002);
			KNOWN_ELEMENT_TYPES.add(RightOuterJoinRels_4003);
			KNOWN_ELEMENT_TYPES.add(FullOuterJoinRels_4004);
			KNOWN_ELEMENT_TYPES.add(EqualLink_4005);
			KNOWN_ELEMENT_TYPES.add(GreaterThanLink_4006);
			KNOWN_ELEMENT_TYPES.add(GreaterEqualThanLink_4007);
			KNOWN_ELEMENT_TYPES.add(LowerThanLink_4008);
			KNOWN_ELEMENT_TYPES.add(LowerEqualThanLink_4009);
			KNOWN_ELEMENT_TYPES.add(InLink_4010);
			KNOWN_ELEMENT_TYPES.add(LikeLink_4011);
			KNOWN_ELEMENT_TYPES.add(JuncRelationship_4012);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case QuerySurfaceEditPart.VISUAL_ID:
			return QuerySurface_1000;
		case WhereInstalmentEditPart.VISUAL_ID:
			return WhereInstalment_2001;
		case HavingInstalmentEditPart.VISUAL_ID:
			return HavingInstalment_2002;
		case OutputInstalmentEditPart.VISUAL_ID:
			return OutputInstalment_2003;
		case InputInstalmentEditPart.VISUAL_ID:
			return InputInstalment_2004;
		case GroupInstalmentEditPart.VISUAL_ID:
			return GroupInstalment_2005;
		case SortInstalmentEditPart.VISUAL_ID:
			return SortInstalment_2006;
		case RootJunctionEditPart.VISUAL_ID:
			return RootJunction_3001;
		case JunctionEditPart.VISUAL_ID:
			return Junction_3002;
		case TermEditPart.VISUAL_ID:
			return Term_3003;
		case CallQuerySurfaceEditPart.VISUAL_ID:
			return CallQuerySurface_3004;
		case CallQuerySurface2EditPart.VISUAL_ID:
			return CallQuerySurface_3005;
		case FieldEditPart.VISUAL_ID:
			return Field_3006;
		case LiteralEditPart.VISUAL_ID:
			return Literal_3007;
		case NullLiteralEditPart.VISUAL_ID:
			return NullLiteral_3008;
		case FunctionEditPart.VISUAL_ID:
			return Function_3009;
		case InputEditPart.VISUAL_ID:
			return Input_3010;
		case Field2EditPart.VISUAL_ID:
			return Field_3011;
		case Literal2EditPart.VISUAL_ID:
			return Literal_3012;
		case NullLiteral2EditPart.VISUAL_ID:
			return NullLiteral_3013;
		case Function2EditPart.VISUAL_ID:
			return Function_3014;
		case Input2EditPart.VISUAL_ID:
			return Input_3015;
		case CallQuerySurface3EditPart.VISUAL_ID:
			return CallQuerySurface_3016;
		case Field3EditPart.VISUAL_ID:
			return Field_3017;
		case Literal3EditPart.VISUAL_ID:
			return Literal_3018;
		case NullLiteral3EditPart.VISUAL_ID:
			return NullLiteral_3019;
		case Function3EditPart.VISUAL_ID:
			return Function_3020;
		case Input3EditPart.VISUAL_ID:
			return Input_3021;
		case MyTableEditPart.VISUAL_ID:
			return MyTable_3022;
		case Field4EditPart.VISUAL_ID:
			return Field_3023;
		case InputStringDefEditPart.VISUAL_ID:
			return InputStringDef_3024;
		case InputIntDefEditPart.VISUAL_ID:
			return InputIntDef_3025;
		case InputDateDefEditPart.VISUAL_ID:
			return InputDateDef_3026;
		case InputBitsDefEditPart.VISUAL_ID:
			return InputBitsDef_3027;
		case InputFloatDefEditPart.VISUAL_ID:
			return InputFloatDef_3032;
		case FieldGPointerEditPart.VISUAL_ID:
			return FieldGPointer_3030;
		case FieldSPointerEditPart.VISUAL_ID:
			return FieldSPointer_3031;
		case InnerjoinRelsEditPart.VISUAL_ID:
			return InnerjoinRels_4001;
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return LeftOuterJoinRels_4002;
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return RightOuterJoinRels_4003;
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return FullOuterJoinRels_4004;
		case EqualLinkEditPart.VISUAL_ID:
			return EqualLink_4005;
		case GreaterThanLinkEditPart.VISUAL_ID:
			return GreaterThanLink_4006;
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return GreaterEqualThanLink_4007;
		case LowerThanLinkEditPart.VISUAL_ID:
			return LowerThanLink_4008;
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return LowerEqualThanLink_4009;
		case InLinkEditPart.VISUAL_ID:
			return InLink_4010;
		case LikeLinkEditPart.VISUAL_ID:
			return LikeLink_4011;
		case JuncRelationshipEditPart.VISUAL_ID:
			return JuncRelationship_4012;
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
			return query.diagram.providers.QueryElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return query.diagram.providers.QueryElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return query.diagram.providers.QueryElementTypes.getElement(elementTypeAdapter);
		}
	};

}
