
/*
 * 
 */
package delete.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class DeletePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createCallSurfaceQuery1CreationTool());
		paletteContainer.add(createConditionInstalment2CreationTool());
		paletteContainer.add(createDummy3CreationTool());
		paletteContainer.add(createField4CreationTool());
		paletteContainer.add(createFieldSPointer5CreationTool());
		paletteContainer.add(createFunction6CreationTool());
		paletteContainer.add(createInput7CreationTool());
		paletteContainer.add(createInputBitsDef8CreationTool());
		paletteContainer.add(createInputDateDef9CreationTool());
		paletteContainer.add(createInputFloatDef10CreationTool());
		paletteContainer.add(createInputInstalment11CreationTool());
		paletteContainer.add(createInputIntDef12CreationTool());
		paletteContainer.add(createInputStringDef13CreationTool());
		paletteContainer.add(createJunction14CreationTool());
		paletteContainer.add(createLiteral15CreationTool());
		paletteContainer.add(createMyTable16CreationTool());
		paletteContainer.add(createNullLiteral17CreationTool());
		paletteContainer.add(createRootJunction18CreationTool());
		paletteContainer.add(createSortInstalment19CreationTool());
		paletteContainer.add(createTableListInstalment20CreationTool());
		paletteContainer.add(createTerm21CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createEqualLink1CreationTool());
		paletteContainer.add(createFullOuterJoinRels2CreationTool());
		paletteContainer.add(createGreaterEqualThanLink3CreationTool());
		paletteContainer.add(createGreaterThanLink4CreationTool());
		paletteContainer.add(createInLink5CreationTool());
		paletteContainer.add(createInnerjoinRels6CreationTool());
		paletteContainer.add(createJuncRelationship7CreationTool());
		paletteContainer.add(createLeftOuterJoinRels8CreationTool());
		paletteContainer.add(createLikeLink9CreationTool());
		paletteContainer.add(createLowerEqualThanLink10CreationTool());
		paletteContainer.add(createLowerThanLink11CreationTool());
		paletteContainer.add(createRightOuterJoinRels12CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createCallSurfaceQuery1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DeleteElementTypes.CallSurfaceQuery_3025);
		types.add(DeleteElementTypes.CallSurfaceQuery_3014);
		types.add(DeleteElementTypes.CallSurfaceQuery_3044);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CallSurfaceQuery1CreationTool_title,
				Messages.CallSurfaceQuery1CreationTool_desc, types);
		entry.setId("createCallSurfaceQuery1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.CallSurfaceQuery_3025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConditionInstalment2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ConditionInstalment2CreationTool_title,
				Messages.ConditionInstalment2CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.ConditionInstalment_2005));
		entry.setId("createConditionInstalment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.ConditionInstalment_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDummy3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Dummy3CreationTool_title,
				Messages.Dummy3CreationTool_desc, Collections.singletonList(DeleteElementTypes.Dummy_2007));
		entry.setId("createDummy3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.Dummy_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createField4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(DeleteElementTypes.Field_3052);
		types.add(DeleteElementTypes.Field_3015);
		types.add(DeleteElementTypes.Field_3012);
		types.add(DeleteElementTypes.Field_3045);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Field4CreationTool_title,
				Messages.Field4CreationTool_desc, types);
		entry.setId("createField4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.Field_3052));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFieldSPointer5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FieldSPointer5CreationTool_title,
				Messages.FieldSPointer5CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.FieldSPointer_3043));
		entry.setId("createFieldSPointer5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.FieldSPointer_3043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFunction6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DeleteElementTypes.Function_3018);
		types.add(DeleteElementTypes.Function_3028);
		types.add(DeleteElementTypes.Function_3048);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Function6CreationTool_title,
				Messages.Function6CreationTool_desc, types);
		entry.setId("createFunction6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.Function_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInput7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DeleteElementTypes.Input_3019);
		types.add(DeleteElementTypes.Input_3029);
		types.add(DeleteElementTypes.Input_3049);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Input7CreationTool_title,
				Messages.Input7CreationTool_desc, types);
		entry.setId("createInput7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.Input_3019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputBitsDef8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputBitsDef8CreationTool_title,
				Messages.InputBitsDef8CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.InputBitsDef_3004));
		entry.setId("createInputBitsDef8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.InputBitsDef_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputDateDef9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputDateDef9CreationTool_title,
				Messages.InputDateDef9CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.InputDateDef_3003));
		entry.setId("createInputDateDef9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.InputDateDef_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputFloatDef10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputFloatDef10CreationTool_title,
				Messages.InputFloatDef10CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.InputFloatDef_3037));
		entry.setId("createInputFloatDef10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.InputFloatDef_3037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputInstalment11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputInstalment11CreationTool_title,
				Messages.InputInstalment11CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.InputInstalment_2001));
		entry.setId("createInputInstalment11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.InputInstalment_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputIntDef12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputIntDef12CreationTool_title,
				Messages.InputIntDef12CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.InputIntDef_3002));
		entry.setId("createInputIntDef12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.InputIntDef_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputStringDef13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputStringDef13CreationTool_title,
				Messages.InputStringDef13CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.InputStringDef_3001));
		entry.setId("createInputStringDef13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.InputStringDef_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJunction14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Junction14CreationTool_title,
				Messages.Junction14CreationTool_desc, Collections.singletonList(DeleteElementTypes.Junction_3041));
		entry.setId("createJunction14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.Junction_3041));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLiteral15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DeleteElementTypes.Literal_3016);
		types.add(DeleteElementTypes.Literal_3026);
		types.add(DeleteElementTypes.Literal_3046);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Literal15CreationTool_title,
				Messages.Literal15CreationTool_desc, types);
		entry.setId("createLiteral15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.Literal_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMyTable16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DeleteElementTypes.MyTable_3051);
		types.add(DeleteElementTypes.MyTable_3053);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MyTable16CreationTool_title,
				Messages.MyTable16CreationTool_desc, types);
		entry.setId("createMyTable16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.MyTable_3051));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNullLiteral17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DeleteElementTypes.NullLiteral_3017);
		types.add(DeleteElementTypes.NullLiteral_3027);
		types.add(DeleteElementTypes.NullLiteral_3047);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NullLiteral17CreationTool_title,
				Messages.NullLiteral17CreationTool_desc, types);
		entry.setId("createNullLiteral17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.NullLiteral_3017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRootJunction18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RootJunction18CreationTool_title,
				Messages.RootJunction18CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.RootJunction_3040));
		entry.setId("createRootJunction18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.RootJunction_3040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSortInstalment19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SortInstalment19CreationTool_title,
				Messages.SortInstalment19CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.SortInstalment_2006));
		entry.setId("createSortInstalment19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.SortInstalment_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTableListInstalment20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TableListInstalment20CreationTool_title,
				Messages.TableListInstalment20CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.TableListInstalment_2002));
		entry.setId("createTableListInstalment20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.TableListInstalment_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTerm21CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Term21CreationTool_title,
				Messages.Term21CreationTool_desc, Collections.singletonList(DeleteElementTypes.Term_3042));
		entry.setId("createTerm21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.Term_3042));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEqualLink1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.EqualLink1CreationTool_title,
				Messages.EqualLink1CreationTool_desc, Collections.singletonList(DeleteElementTypes.EqualLink_4006));
		entry.setId("createEqualLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.EqualLink_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFullOuterJoinRels2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.FullOuterJoinRels2CreationTool_title,
				Messages.FullOuterJoinRels2CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.FullOuterJoinRels_4004));
		entry.setId("createFullOuterJoinRels2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.FullOuterJoinRels_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGreaterEqualThanLink3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.GreaterEqualThanLink3CreationTool_title,
				Messages.GreaterEqualThanLink3CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.GreaterEqualThanLink_4008));
		entry.setId("createGreaterEqualThanLink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.GreaterEqualThanLink_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGreaterThanLink4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.GreaterThanLink4CreationTool_title,
				Messages.GreaterThanLink4CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.GreaterThanLink_4007));
		entry.setId("createGreaterThanLink4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.GreaterThanLink_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInLink5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InLink5CreationTool_title,
				Messages.InLink5CreationTool_desc, Collections.singletonList(DeleteElementTypes.InLink_4011));
		entry.setId("createInLink5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.InLink_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInnerjoinRels6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InnerjoinRels6CreationTool_title,
				Messages.InnerjoinRels6CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.InnerjoinRels_4001));
		entry.setId("createInnerjoinRels6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.InnerjoinRels_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJuncRelationship7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.JuncRelationship7CreationTool_title,
				Messages.JuncRelationship7CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.JuncRelationship_4013));
		entry.setId("createJuncRelationship7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.JuncRelationship_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLeftOuterJoinRels8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LeftOuterJoinRels8CreationTool_title,
				Messages.LeftOuterJoinRels8CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.LeftOuterJoinRels_4002));
		entry.setId("createLeftOuterJoinRels8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.LeftOuterJoinRels_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLikeLink9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LikeLink9CreationTool_title,
				Messages.LikeLink9CreationTool_desc, Collections.singletonList(DeleteElementTypes.LikeLink_4012));
		entry.setId("createLikeLink9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.LikeLink_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLowerEqualThanLink10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LowerEqualThanLink10CreationTool_title,
				Messages.LowerEqualThanLink10CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.LowerEqualThanLink_4010));
		entry.setId("createLowerEqualThanLink10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.LowerEqualThanLink_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLowerThanLink11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LowerThanLink11CreationTool_title,
				Messages.LowerThanLink11CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.LowerThanLink_4009));
		entry.setId("createLowerThanLink11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.LowerThanLink_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRightOuterJoinRels12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.RightOuterJoinRels12CreationTool_title,
				Messages.RightOuterJoinRels12CreationTool_desc,
				Collections.singletonList(DeleteElementTypes.RightOuterJoinRels_4003));
		entry.setId("createRightOuterJoinRels12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeleteElementTypes.getImageDescriptor(DeleteElementTypes.RightOuterJoinRels_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
