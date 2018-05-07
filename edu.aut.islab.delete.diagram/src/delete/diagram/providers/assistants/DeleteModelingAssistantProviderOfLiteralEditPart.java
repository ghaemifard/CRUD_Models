/*
 * 
 */
package delete.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import delete.diagram.edit.parts.CallSurfaceQuery2EditPart;
import delete.diagram.edit.parts.CallSurfaceQuery3EditPart;
import delete.diagram.edit.parts.CallSurfaceQueryEditPart;
import delete.diagram.edit.parts.Field2EditPart;
import delete.diagram.edit.parts.Field3EditPart;
import delete.diagram.edit.parts.Field4EditPart;
import delete.diagram.edit.parts.FieldEditPart;
import delete.diagram.edit.parts.Function2EditPart;
import delete.diagram.edit.parts.Function3EditPart;
import delete.diagram.edit.parts.FunctionEditPart;
import delete.diagram.edit.parts.Input2EditPart;
import delete.diagram.edit.parts.Input3EditPart;
import delete.diagram.edit.parts.InputEditPart;
import delete.diagram.edit.parts.Literal2EditPart;
import delete.diagram.edit.parts.Literal3EditPart;
import delete.diagram.edit.parts.LiteralEditPart;
import delete.diagram.edit.parts.NullLiteral2EditPart;
import delete.diagram.edit.parts.NullLiteral3EditPart;
import delete.diagram.edit.parts.NullLiteralEditPart;
import delete.diagram.providers.DeleteElementTypes;
import delete.diagram.providers.DeleteModelingAssistantProvider;

/**
 * @generated
 */
public class DeleteModelingAssistantProviderOfLiteralEditPart extends DeleteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((LiteralEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(LiteralEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(DeleteElementTypes.EqualLink_4006);
		types.add(DeleteElementTypes.GreaterThanLink_4007);
		types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		types.add(DeleteElementTypes.LowerThanLink_4009);
		types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		types.add(DeleteElementTypes.InLink_4011);
		types.add(DeleteElementTypes.LikeLink_4012);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((LiteralEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(LiteralEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof FieldEditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(DeleteElementTypes.EqualLink_4006);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(DeleteElementTypes.GreaterThanLink_4007);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(DeleteElementTypes.LowerThanLink_4009);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(DeleteElementTypes.InLink_4011);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(DeleteElementTypes.LikeLink_4012);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((LiteralEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(LiteralEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DeleteElementTypes.EqualLink_4006) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		} else if (relationshipType == DeleteElementTypes.GreaterThanLink_4007) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		} else if (relationshipType == DeleteElementTypes.GreaterEqualThanLink_4008) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		} else if (relationshipType == DeleteElementTypes.LowerThanLink_4009) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		} else if (relationshipType == DeleteElementTypes.LowerEqualThanLink_4010) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		} else if (relationshipType == DeleteElementTypes.InLink_4011) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		} else if (relationshipType == DeleteElementTypes.LikeLink_4012) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((LiteralEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(LiteralEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(DeleteElementTypes.EqualLink_4006);
		types.add(DeleteElementTypes.GreaterThanLink_4007);
		types.add(DeleteElementTypes.GreaterEqualThanLink_4008);
		types.add(DeleteElementTypes.LowerThanLink_4009);
		types.add(DeleteElementTypes.LowerEqualThanLink_4010);
		types.add(DeleteElementTypes.InLink_4011);
		types.add(DeleteElementTypes.LikeLink_4012);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((LiteralEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(LiteralEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DeleteElementTypes.EqualLink_4006) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		} else if (relationshipType == DeleteElementTypes.GreaterThanLink_4007) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		} else if (relationshipType == DeleteElementTypes.GreaterEqualThanLink_4008) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		} else if (relationshipType == DeleteElementTypes.LowerThanLink_4009) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		} else if (relationshipType == DeleteElementTypes.LowerEqualThanLink_4010) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		} else if (relationshipType == DeleteElementTypes.InLink_4011) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		} else if (relationshipType == DeleteElementTypes.LikeLink_4012) {
			types.add(DeleteElementTypes.Field_3052);
			types.add(DeleteElementTypes.CallSurfaceQuery_3025);
			types.add(DeleteElementTypes.CallSurfaceQuery_3014);
			types.add(DeleteElementTypes.Field_3015);
			types.add(DeleteElementTypes.Literal_3016);
			types.add(DeleteElementTypes.NullLiteral_3017);
			types.add(DeleteElementTypes.Function_3018);
			types.add(DeleteElementTypes.Input_3019);
			types.add(DeleteElementTypes.Field_3012);
			types.add(DeleteElementTypes.Literal_3026);
			types.add(DeleteElementTypes.NullLiteral_3027);
			types.add(DeleteElementTypes.Function_3028);
			types.add(DeleteElementTypes.Input_3029);
			types.add(DeleteElementTypes.CallSurfaceQuery_3044);
			types.add(DeleteElementTypes.Field_3045);
			types.add(DeleteElementTypes.Literal_3046);
			types.add(DeleteElementTypes.NullLiteral_3047);
			types.add(DeleteElementTypes.Function_3048);
			types.add(DeleteElementTypes.Input_3049);
		}
		return types;
	}

}
