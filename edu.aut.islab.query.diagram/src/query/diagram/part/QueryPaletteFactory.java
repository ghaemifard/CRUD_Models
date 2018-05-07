
/*
 * 
 */
package query.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import query.diagram.providers.QueryElementTypes;

/**
 * @generated
 */
public class QueryPaletteFactory {

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
		paletteContainer.add(createCallQuerySurface1CreationTool());
		paletteContainer.add(createField2CreationTool());
		paletteContainer.add(createFieldGPointer3CreationTool());
		paletteContainer.add(createFieldSPointer4CreationTool());
		paletteContainer.add(createFunction5CreationTool());
		paletteContainer.add(createGroupInstalment6CreationTool());
		paletteContainer.add(createHavingInstalment7CreationTool());
		paletteContainer.add(createInput8CreationTool());
		paletteContainer.add(createInputBitsDef9CreationTool());
		paletteContainer.add(createInputDateDef10CreationTool());
		paletteContainer.add(createInputFloatDef11CreationTool());
		paletteContainer.add(createInputInstalment12CreationTool());
		paletteContainer.add(createInputIntDef13CreationTool());
		paletteContainer.add(createInputStringDef14CreationTool());
		paletteContainer.add(createJunction15CreationTool());
		paletteContainer.add(createLiteral16CreationTool());
		paletteContainer.add(createMyTable17CreationTool());
		paletteContainer.add(createNullLiteral18CreationTool());
		paletteContainer.add(createOutputInstalment19CreationTool());
		paletteContainer.add(createRootJunction20CreationTool());
		paletteContainer.add(createSortInstalment21CreationTool());
		paletteContainer.add(createTerm22CreationTool());
		paletteContainer.add(createWhereInstalment23CreationTool());
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
	private ToolEntry createCallQuerySurface1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(QueryElementTypes.CallQuerySurface_3004);
		types.add(QueryElementTypes.CallQuerySurface_3005);
		types.add(QueryElementTypes.CallQuerySurface_3016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CallQuerySurface1CreationTool_title,
				Messages.CallQuerySurface1CreationTool_desc, types);
		entry.setId("createCallQuerySurface1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.CallQuerySurface_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createField2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(QueryElementTypes.Field_3006);
		types.add(QueryElementTypes.Field_3011);
		types.add(QueryElementTypes.Field_3017);
		types.add(QueryElementTypes.Field_3023);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Field2CreationTool_title,
				Messages.Field2CreationTool_desc, types);
		entry.setId("createField2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.Field_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFieldGPointer3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FieldGPointer3CreationTool_title,
				Messages.FieldGPointer3CreationTool_desc,
				Collections.singletonList(QueryElementTypes.FieldGPointer_3030));
		entry.setId("createFieldGPointer3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.FieldGPointer_3030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFieldSPointer4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FieldSPointer4CreationTool_title,
				Messages.FieldSPointer4CreationTool_desc,
				Collections.singletonList(QueryElementTypes.FieldSPointer_3031));
		entry.setId("createFieldSPointer4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.FieldSPointer_3031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFunction5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(QueryElementTypes.Function_3009);
		types.add(QueryElementTypes.Function_3014);
		types.add(QueryElementTypes.Function_3020);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Function5CreationTool_title,
				Messages.Function5CreationTool_desc, types);
		entry.setId("createFunction5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.Function_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroupInstalment6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GroupInstalment6CreationTool_title,
				Messages.GroupInstalment6CreationTool_desc,
				Collections.singletonList(QueryElementTypes.GroupInstalment_2005));
		entry.setId("createGroupInstalment6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.GroupInstalment_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHavingInstalment7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.HavingInstalment7CreationTool_title,
				Messages.HavingInstalment7CreationTool_desc,
				Collections.singletonList(QueryElementTypes.HavingInstalment_2002));
		entry.setId("createHavingInstalment7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.HavingInstalment_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInput8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(QueryElementTypes.Input_3010);
		types.add(QueryElementTypes.Input_3015);
		types.add(QueryElementTypes.Input_3021);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Input8CreationTool_title,
				Messages.Input8CreationTool_desc, types);
		entry.setId("createInput8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.Input_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputBitsDef9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputBitsDef9CreationTool_title,
				Messages.InputBitsDef9CreationTool_desc,
				Collections.singletonList(QueryElementTypes.InputBitsDef_3027));
		entry.setId("createInputBitsDef9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.InputBitsDef_3027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputDateDef10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputDateDef10CreationTool_title,
				Messages.InputDateDef10CreationTool_desc,
				Collections.singletonList(QueryElementTypes.InputDateDef_3026));
		entry.setId("createInputDateDef10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.InputDateDef_3026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputFloatDef11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputFloatDef11CreationTool_title,
				Messages.InputFloatDef11CreationTool_desc,
				Collections.singletonList(QueryElementTypes.InputFloatDef_3032));
		entry.setId("createInputFloatDef11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.InputFloatDef_3032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputInstalment12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputInstalment12CreationTool_title,
				Messages.InputInstalment12CreationTool_desc,
				Collections.singletonList(QueryElementTypes.InputInstalment_2004));
		entry.setId("createInputInstalment12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.InputInstalment_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputIntDef13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputIntDef13CreationTool_title,
				Messages.InputIntDef13CreationTool_desc, Collections.singletonList(QueryElementTypes.InputIntDef_3025));
		entry.setId("createInputIntDef13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.InputIntDef_3025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputStringDef14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputStringDef14CreationTool_title,
				Messages.InputStringDef14CreationTool_desc,
				Collections.singletonList(QueryElementTypes.InputStringDef_3024));
		entry.setId("createInputStringDef14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.InputStringDef_3024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJunction15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Junction15CreationTool_title,
				Messages.Junction15CreationTool_desc, Collections.singletonList(QueryElementTypes.Junction_3002));
		entry.setId("createJunction15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.Junction_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLiteral16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(QueryElementTypes.Literal_3007);
		types.add(QueryElementTypes.Literal_3012);
		types.add(QueryElementTypes.Literal_3018);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Literal16CreationTool_title,
				Messages.Literal16CreationTool_desc, types);
		entry.setId("createLiteral16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.Literal_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMyTable17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MyTable17CreationTool_title,
				Messages.MyTable17CreationTool_desc, Collections.singletonList(QueryElementTypes.MyTable_3022));
		entry.setId("createMyTable17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.MyTable_3022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNullLiteral18CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(QueryElementTypes.NullLiteral_3008);
		types.add(QueryElementTypes.NullLiteral_3013);
		types.add(QueryElementTypes.NullLiteral_3019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NullLiteral18CreationTool_title,
				Messages.NullLiteral18CreationTool_desc, types);
		entry.setId("createNullLiteral18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.NullLiteral_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutputInstalment19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OutputInstalment19CreationTool_title,
				Messages.OutputInstalment19CreationTool_desc,
				Collections.singletonList(QueryElementTypes.OutputInstalment_2003));
		entry.setId("createOutputInstalment19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.OutputInstalment_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRootJunction20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RootJunction20CreationTool_title,
				Messages.RootJunction20CreationTool_desc,
				Collections.singletonList(QueryElementTypes.RootJunction_3001));
		entry.setId("createRootJunction20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.RootJunction_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSortInstalment21CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SortInstalment21CreationTool_title,
				Messages.SortInstalment21CreationTool_desc,
				Collections.singletonList(QueryElementTypes.SortInstalment_2006));
		entry.setId("createSortInstalment21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.SortInstalment_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTerm22CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Term22CreationTool_title,
				Messages.Term22CreationTool_desc, Collections.singletonList(QueryElementTypes.Term_3003));
		entry.setId("createTerm22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.Term_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWhereInstalment23CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.WhereInstalment23CreationTool_title,
				Messages.WhereInstalment23CreationTool_desc,
				Collections.singletonList(QueryElementTypes.WhereInstalment_2001));
		entry.setId("createWhereInstalment23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.WhereInstalment_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEqualLink1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.EqualLink1CreationTool_title,
				Messages.EqualLink1CreationTool_desc, Collections.singletonList(QueryElementTypes.EqualLink_4005));
		entry.setId("createEqualLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.EqualLink_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFullOuterJoinRels2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.FullOuterJoinRels2CreationTool_title,
				Messages.FullOuterJoinRels2CreationTool_desc,
				Collections.singletonList(QueryElementTypes.FullOuterJoinRels_4004));
		entry.setId("createFullOuterJoinRels2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.FullOuterJoinRels_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGreaterEqualThanLink3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.GreaterEqualThanLink3CreationTool_title,
				Messages.GreaterEqualThanLink3CreationTool_desc,
				Collections.singletonList(QueryElementTypes.GreaterEqualThanLink_4007));
		entry.setId("createGreaterEqualThanLink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.GreaterEqualThanLink_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGreaterThanLink4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.GreaterThanLink4CreationTool_title,
				Messages.GreaterThanLink4CreationTool_desc,
				Collections.singletonList(QueryElementTypes.GreaterThanLink_4006));
		entry.setId("createGreaterThanLink4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.GreaterThanLink_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInLink5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InLink5CreationTool_title,
				Messages.InLink5CreationTool_desc, Collections.singletonList(QueryElementTypes.InLink_4010));
		entry.setId("createInLink5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.InLink_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInnerjoinRels6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InnerjoinRels6CreationTool_title,
				Messages.InnerjoinRels6CreationTool_desc,
				Collections.singletonList(QueryElementTypes.InnerjoinRels_4001));
		entry.setId("createInnerjoinRels6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.InnerjoinRels_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJuncRelationship7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.JuncRelationship7CreationTool_title,
				Messages.JuncRelationship7CreationTool_desc,
				Collections.singletonList(QueryElementTypes.JuncRelationship_4012));
		entry.setId("createJuncRelationship7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.JuncRelationship_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLeftOuterJoinRels8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LeftOuterJoinRels8CreationTool_title,
				Messages.LeftOuterJoinRels8CreationTool_desc,
				Collections.singletonList(QueryElementTypes.LeftOuterJoinRels_4002));
		entry.setId("createLeftOuterJoinRels8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.LeftOuterJoinRels_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLikeLink9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LikeLink9CreationTool_title,
				Messages.LikeLink9CreationTool_desc, Collections.singletonList(QueryElementTypes.LikeLink_4011));
		entry.setId("createLikeLink9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.LikeLink_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLowerEqualThanLink10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LowerEqualThanLink10CreationTool_title,
				Messages.LowerEqualThanLink10CreationTool_desc,
				Collections.singletonList(QueryElementTypes.LowerEqualThanLink_4009));
		entry.setId("createLowerEqualThanLink10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.LowerEqualThanLink_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLowerThanLink11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LowerThanLink11CreationTool_title,
				Messages.LowerThanLink11CreationTool_desc,
				Collections.singletonList(QueryElementTypes.LowerThanLink_4008));
		entry.setId("createLowerThanLink11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.LowerThanLink_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRightOuterJoinRels12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.RightOuterJoinRels12CreationTool_title,
				Messages.RightOuterJoinRels12CreationTool_desc,
				Collections.singletonList(QueryElementTypes.RightOuterJoinRels_4003));
		entry.setId("createRightOuterJoinRels12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QueryElementTypes.getImageDescriptor(QueryElementTypes.RightOuterJoinRels_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
