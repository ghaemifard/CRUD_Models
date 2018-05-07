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
import update.diagram.edit.parts.RealFieldEditPart;
import update.diagram.providers.UpdateElementTypes;
import update.diagram.providers.UpdateModelingAssistantProvider;

/**
 * @generated
 */
public class UpdateModelingAssistantProviderOfRealFieldEditPart extends UpdateModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RealFieldEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(RealFieldEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UpdateElementTypes.InnerjoinRels_4010);
		types.add(UpdateElementTypes.LeftOuterJoinRels_4011);
		types.add(UpdateElementTypes.RightOuterJoinRels_4012);
		types.add(UpdateElementTypes.FullOuterJoinRels_4013);
		types.add(UpdateElementTypes.LinkField_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RealFieldEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(RealFieldEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RealFieldEditPart) {
			types.add(UpdateElementTypes.InnerjoinRels_4010);
		}
		if (targetEditPart instanceof RealFieldEditPart) {
			types.add(UpdateElementTypes.LeftOuterJoinRels_4011);
		}
		if (targetEditPart instanceof RealFieldEditPart) {
			types.add(UpdateElementTypes.RightOuterJoinRels_4012);
		}
		if (targetEditPart instanceof RealFieldEditPart) {
			types.add(UpdateElementTypes.FullOuterJoinRels_4013);
		}
		if (targetEditPart instanceof CallSurfaceQueryEditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof CallSurfaceQuery2EditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof FieldEditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof LiteralEditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof NullLiteralEditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof FunctionEditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof Field2EditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof Literal2EditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof NullLiteral2EditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof Function2EditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof CallSurfaceQuery3EditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof Field3EditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof Literal3EditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof NullLiteral3EditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof Function3EditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		if (targetEditPart instanceof Input3EditPart) {
			types.add(UpdateElementTypes.LinkField_4008);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RealFieldEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(RealFieldEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == UpdateElementTypes.InnerjoinRels_4010) {
			types.add(UpdateElementTypes.RealField_3029);
		} else if (relationshipType == UpdateElementTypes.LeftOuterJoinRels_4011) {
			types.add(UpdateElementTypes.RealField_3029);
		} else if (relationshipType == UpdateElementTypes.RightOuterJoinRels_4012) {
			types.add(UpdateElementTypes.RealField_3029);
		} else if (relationshipType == UpdateElementTypes.FullOuterJoinRels_4013) {
			types.add(UpdateElementTypes.RealField_3029);
		} else if (relationshipType == UpdateElementTypes.LinkField_4008) {
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
		return doGetRelTypesOnTarget((RealFieldEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(RealFieldEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(UpdateElementTypes.InnerjoinRels_4010);
		types.add(UpdateElementTypes.LeftOuterJoinRels_4011);
		types.add(UpdateElementTypes.RightOuterJoinRels_4012);
		types.add(UpdateElementTypes.FullOuterJoinRels_4013);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((RealFieldEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(RealFieldEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == UpdateElementTypes.InnerjoinRels_4010) {
			types.add(UpdateElementTypes.RealField_3029);
		} else if (relationshipType == UpdateElementTypes.LeftOuterJoinRels_4011) {
			types.add(UpdateElementTypes.RealField_3029);
		} else if (relationshipType == UpdateElementTypes.RightOuterJoinRels_4012) {
			types.add(UpdateElementTypes.RealField_3029);
		} else if (relationshipType == UpdateElementTypes.FullOuterJoinRels_4013) {
			types.add(UpdateElementTypes.RealField_3029);
		}
		return types;
	}

}
