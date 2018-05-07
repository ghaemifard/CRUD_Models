/*
 * 
 */
package update.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import update.diagram.edit.parts.CallSurfaceQuery2EditPart;
import update.diagram.edit.parts.CallSurfaceQuery3EditPart;
import update.diagram.edit.parts.CallSurfaceQueryEditPart;
import update.diagram.edit.parts.Field2EditPart;
import update.diagram.edit.parts.Field3EditPart;
import update.diagram.edit.parts.FieldEditPart;
import update.diagram.edit.parts.Function2EditPart;
import update.diagram.edit.parts.Function3EditPart;
import update.diagram.edit.parts.FunctionEditPart;
import update.diagram.edit.parts.Input2EditPart;
import update.diagram.edit.parts.Input3EditPart;
import update.diagram.edit.parts.InputEditPart;
import update.diagram.edit.parts.Literal2EditPart;
import update.diagram.edit.parts.Literal3EditPart;
import update.diagram.edit.parts.LiteralEditPart;
import update.diagram.edit.parts.NullLiteral2EditPart;
import update.diagram.edit.parts.NullLiteral3EditPart;
import update.diagram.edit.parts.NullLiteralEditPart;
import update.diagram.providers.UpdateElementTypes;
import update.diagram.providers.UpdateModelingAssistantProvider;

/**
 * @generated
 */
public class UpdateModelingAssistantProviderOfInputEditPart extends UpdateModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((InputEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(InputEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(UpdateElementTypes.EqualLink_4001);
		types.add(UpdateElementTypes.GreaterThanLink_4002);
		types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		types.add(UpdateElementTypes.LowerThanLink_4004);
		types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		types.add(UpdateElementTypes.InLink_4006);
		types.add(UpdateElementTypes.LikeLink_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((InputEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(InputEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(UpdateElementTypes.EqualLink_4001);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(UpdateElementTypes.GreaterThanLink_4002);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(UpdateElementTypes.LowerThanLink_4004);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(UpdateElementTypes.InLink_4006);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(UpdateElementTypes.LikeLink_4007);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((InputEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(InputEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == UpdateElementTypes.EqualLink_4001) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		} else if (relationshipType == UpdateElementTypes.GreaterThanLink_4002) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		} else if (relationshipType == UpdateElementTypes.GreaterEqualThanLink_4003) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		} else if (relationshipType == UpdateElementTypes.LowerThanLink_4004) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		} else if (relationshipType == UpdateElementTypes.LowerEqualThanLink_4005) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		} else if (relationshipType == UpdateElementTypes.InLink_4006) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		} else if (relationshipType == UpdateElementTypes.LikeLink_4007) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((InputEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(InputEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(UpdateElementTypes.EqualLink_4001);
		types.add(UpdateElementTypes.GreaterThanLink_4002);
		types.add(UpdateElementTypes.GreaterEqualThanLink_4003);
		types.add(UpdateElementTypes.LowerThanLink_4004);
		types.add(UpdateElementTypes.LowerEqualThanLink_4005);
		types.add(UpdateElementTypes.InLink_4006);
		types.add(UpdateElementTypes.LikeLink_4007);
		types.add(UpdateElementTypes.LinkField_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((InputEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(InputEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == UpdateElementTypes.EqualLink_4001) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		} else if (relationshipType == UpdateElementTypes.GreaterThanLink_4002) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		} else if (relationshipType == UpdateElementTypes.GreaterEqualThanLink_4003) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		} else if (relationshipType == UpdateElementTypes.LowerThanLink_4004) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		} else if (relationshipType == UpdateElementTypes.LowerEqualThanLink_4005) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		} else if (relationshipType == UpdateElementTypes.InLink_4006) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		} else if (relationshipType == UpdateElementTypes.LikeLink_4007) {
			types.add(UpdateElementTypes.CallSurfaceQuery_3005);
			types.add(UpdateElementTypes.CallSurfaceQuery_3006);
			types.add(UpdateElementTypes.Field_3007);
			types.add(UpdateElementTypes.Literal_3008);
			types.add(UpdateElementTypes.NullLiteral_3009);
			types.add(UpdateElementTypes.Function_3010);
			types.add(UpdateElementTypes.Input_3011);
			types.add(UpdateElementTypes.Field_3012);
			types.add(UpdateElementTypes.Literal_3013);
			types.add(UpdateElementTypes.NullLiteral_3014);
			types.add(UpdateElementTypes.Function_3015);
			types.add(UpdateElementTypes.Input_3016);
			types.add(UpdateElementTypes.CallSurfaceQuery_3020);
			types.add(UpdateElementTypes.Field_3021);
			types.add(UpdateElementTypes.Literal_3022);
			types.add(UpdateElementTypes.NullLiteral_3023);
			types.add(UpdateElementTypes.Function_3024);
			types.add(UpdateElementTypes.Input_3025);
		} else if (relationshipType == UpdateElementTypes.LinkField_4008) {
			types.add(UpdateElementTypes.RealField_3029);
		}
		return types;
	}

}
