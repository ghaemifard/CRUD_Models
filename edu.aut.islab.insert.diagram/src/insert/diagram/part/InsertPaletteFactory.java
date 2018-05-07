
/*
 * 
 */
package insert.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import insert.diagram.providers.InsertElementTypes;

/**
 * @generated
 */
public class InsertPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createCallSurfaceQuery1CreationTool());
		paletteContainer.add(createField2CreationTool());
		paletteContainer.add(createFunction3CreationTool());
		paletteContainer.add(createInput4CreationTool());
		paletteContainer.add(createInputBitsDef5CreationTool());
		paletteContainer.add(createInputDateDef6CreationTool());
		paletteContainer.add(createInputFloatDef7CreationTool());
		paletteContainer.add(createInputInstalment8CreationTool());
		paletteContainer.add(createInputIntDef9CreationTool());
		paletteContainer.add(createInputStringDef10CreationTool());
		paletteContainer.add(createLiteral11CreationTool());
		paletteContainer.add(createNullLiteral12CreationTool());
		paletteContainer.add(createPrepareList13CreationTool());
		paletteContainer.add(createTable14CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createCallSurfaceQuery1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(InsertElementTypes.CallSurfaceQuery_3006);
		types.add(InsertElementTypes.CallSurfaceQuery_3007);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CallSurfaceQuery1CreationTool_title,
				Messages.CallSurfaceQuery1CreationTool_desc, types);
		entry.setId("createCallSurfaceQuery1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.CallSurfaceQuery_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createField2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(InsertElementTypes.Field_3018);
		types.add(InsertElementTypes.Field_3008);
		types.add(InsertElementTypes.Field_3013);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Field2CreationTool_title,
				Messages.Field2CreationTool_desc, types);
		entry.setId("createField2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.Field_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFunction3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(InsertElementTypes.Function_3011);
		types.add(InsertElementTypes.Function_3016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Function3CreationTool_title,
				Messages.Function3CreationTool_desc, types);
		entry.setId("createFunction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.Function_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInput4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(InsertElementTypes.Input_3012);
		types.add(InsertElementTypes.Input_3017);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Input4CreationTool_title,
				Messages.Input4CreationTool_desc, types);
		entry.setId("createInput4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.Input_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputBitsDef5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputBitsDef5CreationTool_title,
				Messages.InputBitsDef5CreationTool_desc,
				Collections.singletonList(InsertElementTypes.InputBitsDef_3005));
		entry.setId("createInputBitsDef5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.InputBitsDef_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputDateDef6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputDateDef6CreationTool_title,
				Messages.InputDateDef6CreationTool_desc,
				Collections.singletonList(InsertElementTypes.InputDateDef_3004));
		entry.setId("createInputDateDef6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.InputDateDef_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputFloatDef7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputFloatDef7CreationTool_title,
				Messages.InputFloatDef7CreationTool_desc,
				Collections.singletonList(InsertElementTypes.InputFloatDef_3019));
		entry.setId("createInputFloatDef7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.InputFloatDef_3019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputInstalment8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputInstalment8CreationTool_title,
				Messages.InputInstalment8CreationTool_desc,
				Collections.singletonList(InsertElementTypes.InputInstalment_2002));
		entry.setId("createInputInstalment8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.InputInstalment_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputIntDef9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputIntDef9CreationTool_title,
				Messages.InputIntDef9CreationTool_desc, Collections.singletonList(InsertElementTypes.InputIntDef_3003));
		entry.setId("createInputIntDef9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.InputIntDef_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputStringDef10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputStringDef10CreationTool_title,
				Messages.InputStringDef10CreationTool_desc,
				Collections.singletonList(InsertElementTypes.InputStringDef_3002));
		entry.setId("createInputStringDef10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.InputStringDef_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLiteral11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(InsertElementTypes.Literal_3009);
		types.add(InsertElementTypes.Literal_3014);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Literal11CreationTool_title,
				Messages.Literal11CreationTool_desc, types);
		entry.setId("createLiteral11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.Literal_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNullLiteral12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(InsertElementTypes.NullLiteral_3010);
		types.add(InsertElementTypes.NullLiteral_3015);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NullLiteral12CreationTool_title,
				Messages.NullLiteral12CreationTool_desc, types);
		entry.setId("createNullLiteral12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.NullLiteral_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPrepareList13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PrepareList13CreationTool_title,
				Messages.PrepareList13CreationTool_desc,
				Collections.singletonList(InsertElementTypes.PrepareList_2003));
		entry.setId("createPrepareList13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.PrepareList_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTable14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Table14CreationTool_title,
				Messages.Table14CreationTool_desc, Collections.singletonList(InsertElementTypes.Table_2004));
		entry.setId("createTable14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InsertElementTypes.getImageDescriptor(InsertElementTypes.Table_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
