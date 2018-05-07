/*
 * 
 */
package query.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import query.diagram.edit.parts.CallQuerySurface2EditPart;
import query.diagram.edit.parts.CallQuerySurface3EditPart;
import query.diagram.edit.parts.CallQuerySurfaceEditPart;
import query.diagram.edit.parts.Field2EditPart;
import query.diagram.edit.parts.Field3EditPart;
import query.diagram.edit.parts.Field4EditPart;
import query.diagram.edit.parts.FieldEditPart;
import query.diagram.edit.parts.Function2EditPart;
import query.diagram.edit.parts.Function3EditPart;
import query.diagram.edit.parts.FunctionEditPart;
import query.diagram.edit.parts.Input2EditPart;
import query.diagram.edit.parts.Input3EditPart;
import query.diagram.edit.parts.InputEditPart;
import query.diagram.edit.parts.Literal2EditPart;
import query.diagram.edit.parts.Literal3EditPart;
import query.diagram.edit.parts.LiteralEditPart;
import query.diagram.edit.parts.NullLiteral2EditPart;
import query.diagram.edit.parts.NullLiteral3EditPart;
import query.diagram.edit.parts.NullLiteralEditPart;
import query.diagram.providers.QueryElementTypes;
import query.diagram.providers.QueryModelingAssistantProvider;

/**
 * @generated
 */
public class QueryModelingAssistantProviderOfFieldEditPart extends QueryModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((FieldEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(FieldEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(QueryElementTypes.InnerjoinRels_4001);
		types.add(QueryElementTypes.LeftOuterJoinRels_4002);
		types.add(QueryElementTypes.RightOuterJoinRels_4003);
		types.add(QueryElementTypes.FullOuterJoinRels_4004);
		types.add(QueryElementTypes.EqualLink_4005);
		types.add(QueryElementTypes.GreaterThanLink_4006);
		types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		types.add(QueryElementTypes.LowerThanLink_4008);
		types.add(QueryElementTypes.LowerEqualThanLink_4009);
		types.add(QueryElementTypes.InLink_4010);
		types.add(QueryElementTypes.LikeLink_4011);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((FieldEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(FieldEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof FieldEditPart) {
			types.add(QueryElementTypes.InnerjoinRels_4001);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(QueryElementTypes.InnerjoinRels_4001);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(QueryElementTypes.InnerjoinRels_4001);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(QueryElementTypes.InnerjoinRels_4001);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(QueryElementTypes.LeftOuterJoinRels_4002);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(QueryElementTypes.LeftOuterJoinRels_4002);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(QueryElementTypes.LeftOuterJoinRels_4002);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(QueryElementTypes.LeftOuterJoinRels_4002);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(QueryElementTypes.RightOuterJoinRels_4003);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(QueryElementTypes.RightOuterJoinRels_4003);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(QueryElementTypes.RightOuterJoinRels_4003);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(QueryElementTypes.RightOuterJoinRels_4003);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(QueryElementTypes.FullOuterJoinRels_4004);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(QueryElementTypes.FullOuterJoinRels_4004);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(QueryElementTypes.FullOuterJoinRels_4004);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(QueryElementTypes.FullOuterJoinRels_4004);
		}
		if (targetEditPart instanceof CallQuerySurfaceEditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof CallQuerySurface2EditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof CallQuerySurface3EditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(QueryElementTypes.EqualLink_4005);
		}
		if (targetEditPart instanceof CallQuerySurfaceEditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof CallQuerySurface2EditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof CallQuerySurface3EditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(QueryElementTypes.GreaterThanLink_4006);
		}
		if (targetEditPart instanceof CallQuerySurfaceEditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof CallQuerySurface2EditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof CallQuerySurface3EditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		}
		if (targetEditPart instanceof CallQuerySurfaceEditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof CallQuerySurface2EditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof CallQuerySurface3EditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(QueryElementTypes.LowerThanLink_4008);
		}
		if (targetEditPart instanceof CallQuerySurfaceEditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof CallQuerySurface2EditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof CallQuerySurface3EditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(QueryElementTypes.LowerEqualThanLink_4009);
		}
		if (targetEditPart instanceof CallQuerySurfaceEditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof CallQuerySurface2EditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof CallQuerySurface3EditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(QueryElementTypes.InLink_4010);
		}
		if (targetEditPart instanceof CallQuerySurfaceEditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof CallQuerySurface2EditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof CallQuerySurface3EditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		if (targetEditPart instanceof Field4EditPart) {
			types.add(QueryElementTypes.LikeLink_4011);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((FieldEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(FieldEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == QueryElementTypes.InnerjoinRels_4001) {
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.LeftOuterJoinRels_4002) {
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.RightOuterJoinRels_4003) {
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.FullOuterJoinRels_4004) {
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.EqualLink_4005) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.GreaterThanLink_4006) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.GreaterEqualThanLink_4007) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.LowerThanLink_4008) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.LowerEqualThanLink_4009) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.InLink_4010) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.LikeLink_4011) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((FieldEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(FieldEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(QueryElementTypes.InnerjoinRels_4001);
		types.add(QueryElementTypes.LeftOuterJoinRels_4002);
		types.add(QueryElementTypes.RightOuterJoinRels_4003);
		types.add(QueryElementTypes.FullOuterJoinRels_4004);
		types.add(QueryElementTypes.EqualLink_4005);
		types.add(QueryElementTypes.GreaterThanLink_4006);
		types.add(QueryElementTypes.GreaterEqualThanLink_4007);
		types.add(QueryElementTypes.LowerThanLink_4008);
		types.add(QueryElementTypes.LowerEqualThanLink_4009);
		types.add(QueryElementTypes.InLink_4010);
		types.add(QueryElementTypes.LikeLink_4011);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((FieldEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(FieldEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == QueryElementTypes.InnerjoinRels_4001) {
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.LeftOuterJoinRels_4002) {
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.RightOuterJoinRels_4003) {
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.FullOuterJoinRels_4004) {
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.EqualLink_4005) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.GreaterThanLink_4006) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.GreaterEqualThanLink_4007) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.LowerThanLink_4008) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.LowerEqualThanLink_4009) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.InLink_4010) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		} else if (relationshipType == QueryElementTypes.LikeLink_4011) {
			types.add(QueryElementTypes.CallQuerySurface_3004);
			types.add(QueryElementTypes.CallQuerySurface_3005);
			types.add(QueryElementTypes.Field_3006);
			types.add(QueryElementTypes.Literal_3007);
			types.add(QueryElementTypes.NullLiteral_3008);
			types.add(QueryElementTypes.Function_3009);
			types.add(QueryElementTypes.Input_3010);
			types.add(QueryElementTypes.Field_3011);
			types.add(QueryElementTypes.Literal_3012);
			types.add(QueryElementTypes.NullLiteral_3013);
			types.add(QueryElementTypes.Function_3014);
			types.add(QueryElementTypes.Input_3015);
			types.add(QueryElementTypes.CallQuerySurface_3016);
			types.add(QueryElementTypes.Field_3017);
			types.add(QueryElementTypes.Literal_3018);
			types.add(QueryElementTypes.NullLiteral_3019);
			types.add(QueryElementTypes.Function_3020);
			types.add(QueryElementTypes.Input_3021);
			types.add(QueryElementTypes.Field_3023);
		}
		return types;
	}

}
