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

import query.diagram.edit.parts.JunctionEditPart;
import query.diagram.edit.parts.RootJunctionEditPart;
import query.diagram.edit.parts.TermEditPart;
import query.diagram.providers.QueryElementTypes;
import query.diagram.providers.QueryModelingAssistantProvider;

/**
 * @generated
 */
public class QueryModelingAssistantProviderOfRootJunctionEditPart extends QueryModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RootJunctionEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(RootJunctionEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(QueryElementTypes.JuncRelationship_4012);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RootJunctionEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(RootJunctionEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RootJunctionEditPart) {
			types.add(QueryElementTypes.JuncRelationship_4012);
		}
		if (targetEditPart instanceof JunctionEditPart) {
			types.add(QueryElementTypes.JuncRelationship_4012);
		}
		if (targetEditPart instanceof TermEditPart) {
			types.add(QueryElementTypes.JuncRelationship_4012);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RootJunctionEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(RootJunctionEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == QueryElementTypes.JuncRelationship_4012) {
			types.add(QueryElementTypes.RootJunction_3001);
			types.add(QueryElementTypes.Junction_3002);
			types.add(QueryElementTypes.Term_3003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((RootJunctionEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(RootJunctionEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(QueryElementTypes.JuncRelationship_4012);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((RootJunctionEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(RootJunctionEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == QueryElementTypes.JuncRelationship_4012) {
			types.add(QueryElementTypes.RootJunction_3001);
			types.add(QueryElementTypes.Junction_3002);
		}
		return types;
	}

}
