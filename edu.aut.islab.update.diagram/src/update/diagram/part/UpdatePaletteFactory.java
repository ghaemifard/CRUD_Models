
/*
 * 
 */
package update.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class UpdatePaletteFactory {

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
		paletteContainer.add(createField3CreationTool());
		paletteContainer.add(createFieldSPointer4CreationTool());
		paletteContainer.add(createFunction5CreationTool());
		paletteContainer.add(createInput6CreationTool());
		paletteContainer.add(createInputBitsDef7CreationTool());
		paletteContainer.add(createInputDateDef8CreationTool());
		paletteContainer.add(createInputFloatDef9CreationTool());
		paletteContainer.add(createInputInstalment10CreationTool());
		paletteContainer.add(createInputIntDef11CreationTool());
		paletteContainer.add(createInputStringDef12CreationTool());
		paletteContainer.add(createJunction13CreationTool());
		paletteContainer.add(createLiteral14CreationTool());
		paletteContainer.add(createMyTable15CreationTool());
		paletteContainer.add(createNullLiteral16CreationTool());
		paletteContainer.add(createPrepareList17CreationTool());
		paletteContainer.add(createRealField18CreationTool());
		paletteContainer.add(createRootJunction19CreationTool());
		paletteContainer.add(createSortInstalment20CreationTool());
		paletteContainer.add(createTableSelection21CreationTool());
		paletteContainer.add(createTerm22CreationTool());
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
		paletteContainer.add(createLinkField10CreationTool());
		paletteContainer.add(createLowerEqualThanLink11CreationTool());
		paletteContainer.add(createLowerThanLink12CreationTool());
		paletteContainer.add(createRightOuterJoinRels13CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createCallSurfaceQuery1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UpdateElementTypes.CallSurfaceQuery_3005);
		types.add(UpdateElementTypes.CallSurfaceQuery_3006);
		types.add(UpdateElementTypes.CallSurfaceQuery_3020);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CallSurfaceQuery1CreationTool_title,
				Messages.CallSurfaceQuery1CreationTool_desc, types);
		entry.setId("createCallSurfaceQuery1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.CallSurfaceQuery_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConditionInstalment2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ConditionInstalment2CreationTool_title,
				Messages.ConditionInstalment2CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.ConditionInstalment_2004));
		entry.setId("createConditionInstalment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.ConditionInstalment_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createField3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UpdateElementTypes.Field_3007);
		types.add(UpdateElementTypes.Field_3012);
		types.add(UpdateElementTypes.Field_3021);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Field3CreationTool_title,
				Messages.Field3CreationTool_desc, types);
		entry.setId("createField3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.Field_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFieldSPointer4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FieldSPointer4CreationTool_title,
				Messages.FieldSPointer4CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.FieldSPointer_3030));
		entry.setId("createFieldSPointer4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.FieldSPointer_3030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFunction5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UpdateElementTypes.Function_3010);
		types.add(UpdateElementTypes.Function_3015);
		types.add(UpdateElementTypes.Function_3024);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Function5CreationTool_title,
				Messages.Function5CreationTool_desc, types);
		entry.setId("createFunction5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.Function_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInput6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UpdateElementTypes.Input_3011);
		types.add(UpdateElementTypes.Input_3016);
		types.add(UpdateElementTypes.Input_3025);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Input6CreationTool_title,
				Messages.Input6CreationTool_desc, types);
		entry.setId("createInput6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.Input_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputBitsDef7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputBitsDef7CreationTool_title,
				Messages.InputBitsDef7CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.InputBitsDef_3004));
		entry.setId("createInputBitsDef7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.InputBitsDef_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputDateDef8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputDateDef8CreationTool_title,
				Messages.InputDateDef8CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.InputDateDef_3003));
		entry.setId("createInputDateDef8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.InputDateDef_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputFloatDef9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputFloatDef9CreationTool_title,
				Messages.InputFloatDef9CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.InputFloatDef_3028));
		entry.setId("createInputFloatDef9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.InputFloatDef_3028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputInstalment10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputInstalment10CreationTool_title,
				Messages.InputInstalment10CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.InputInstalment_2001));
		entry.setId("createInputInstalment10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.InputInstalment_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputIntDef11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputIntDef11CreationTool_title,
				Messages.InputIntDef11CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.InputIntDef_3002));
		entry.setId("createInputIntDef11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.InputIntDef_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputStringDef12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputStringDef12CreationTool_title,
				Messages.InputStringDef12CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.InputStringDef_3001));
		entry.setId("createInputStringDef12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.InputStringDef_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJunction13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Junction13CreationTool_title,
				Messages.Junction13CreationTool_desc, Collections.singletonList(UpdateElementTypes.Junction_3032));
		entry.setId("createJunction13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.Junction_3032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLiteral14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UpdateElementTypes.Literal_3008);
		types.add(UpdateElementTypes.Literal_3013);
		types.add(UpdateElementTypes.Literal_3022);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Literal14CreationTool_title,
				Messages.Literal14CreationTool_desc, types);
		entry.setId("createLiteral14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.Literal_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMyTable15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MyTable15CreationTool_title,
				Messages.MyTable15CreationTool_desc, Collections.singletonList(UpdateElementTypes.MyTable_3026));
		entry.setId("createMyTable15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.MyTable_3026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNullLiteral16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UpdateElementTypes.NullLiteral_3009);
		types.add(UpdateElementTypes.NullLiteral_3014);
		types.add(UpdateElementTypes.NullLiteral_3023);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NullLiteral16CreationTool_title,
				Messages.NullLiteral16CreationTool_desc, types);
		entry.setId("createNullLiteral16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.NullLiteral_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPrepareList17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PrepareList17CreationTool_title,
				Messages.PrepareList17CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.PrepareList_2002));
		entry.setId("createPrepareList17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.PrepareList_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRealField18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RealField18CreationTool_title,
				Messages.RealField18CreationTool_desc, Collections.singletonList(UpdateElementTypes.RealField_3029));
		entry.setId("createRealField18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.RealField_3029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRootJunction19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RootJunction19CreationTool_title,
				Messages.RootJunction19CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.RootJunction_3031));
		entry.setId("createRootJunction19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.RootJunction_3031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSortInstalment20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SortInstalment20CreationTool_title,
				Messages.SortInstalment20CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.SortInstalment_2005));
		entry.setId("createSortInstalment20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.SortInstalment_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTableSelection21CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TableSelection21CreationTool_title,
				Messages.TableSelection21CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.TableSelection_2003));
		entry.setId("createTableSelection21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.TableSelection_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTerm22CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Term22CreationTool_title,
				Messages.Term22CreationTool_desc, Collections.singletonList(UpdateElementTypes.Term_3019));
		entry.setId("createTerm22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.Term_3019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEqualLink1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.EqualLink1CreationTool_title,
				Messages.EqualLink1CreationTool_desc, Collections.singletonList(UpdateElementTypes.EqualLink_4001));
		entry.setId("createEqualLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.EqualLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFullOuterJoinRels2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.FullOuterJoinRels2CreationTool_title,
				Messages.FullOuterJoinRels2CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.FullOuterJoinRels_4013));
		entry.setId("createFullOuterJoinRels2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.FullOuterJoinRels_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGreaterEqualThanLink3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.GreaterEqualThanLink3CreationTool_title,
				Messages.GreaterEqualThanLink3CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.GreaterEqualThanLink_4003));
		entry.setId("createGreaterEqualThanLink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.GreaterEqualThanLink_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGreaterThanLink4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.GreaterThanLink4CreationTool_title,
				Messages.GreaterThanLink4CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.GreaterThanLink_4002));
		entry.setId("createGreaterThanLink4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.GreaterThanLink_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInLink5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InLink5CreationTool_title,
				Messages.InLink5CreationTool_desc, Collections.singletonList(UpdateElementTypes.InLink_4006));
		entry.setId("createInLink5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.InLink_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInnerjoinRels6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InnerjoinRels6CreationTool_title,
				Messages.InnerjoinRels6CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.InnerjoinRels_4010));
		entry.setId("createInnerjoinRels6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.InnerjoinRels_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJuncRelationship7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.JuncRelationship7CreationTool_title,
				Messages.JuncRelationship7CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.JuncRelationship_4014));
		entry.setId("createJuncRelationship7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.JuncRelationship_4014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLeftOuterJoinRels8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LeftOuterJoinRels8CreationTool_title,
				Messages.LeftOuterJoinRels8CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.LeftOuterJoinRels_4011));
		entry.setId("createLeftOuterJoinRels8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.LeftOuterJoinRels_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLikeLink9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LikeLink9CreationTool_title,
				Messages.LikeLink9CreationTool_desc, Collections.singletonList(UpdateElementTypes.LikeLink_4007));
		entry.setId("createLikeLink9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.LikeLink_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLinkField10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LinkField10CreationTool_title,
				Messages.LinkField10CreationTool_desc, Collections.singletonList(UpdateElementTypes.LinkField_4008));
		entry.setId("createLinkField10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.LinkField_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLowerEqualThanLink11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LowerEqualThanLink11CreationTool_title,
				Messages.LowerEqualThanLink11CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.LowerEqualThanLink_4005));
		entry.setId("createLowerEqualThanLink11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.LowerEqualThanLink_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLowerThanLink12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LowerThanLink12CreationTool_title,
				Messages.LowerThanLink12CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.LowerThanLink_4004));
		entry.setId("createLowerThanLink12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.LowerThanLink_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRightOuterJoinRels13CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.RightOuterJoinRels13CreationTool_title,
				Messages.RightOuterJoinRels13CreationTool_desc,
				Collections.singletonList(UpdateElementTypes.RightOuterJoinRels_4012));
		entry.setId("createRightOuterJoinRels13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UpdateElementTypes.getImageDescriptor(UpdateElementTypes.RightOuterJoinRels_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
