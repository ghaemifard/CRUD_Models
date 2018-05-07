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

import delete.diagram.edit.parts.JunctionEditPart;
import delete.diagram.edit.parts.RootJunctionEditPart;
import delete.diagram.edit.parts.TermEditPart;
import delete.diagram.providers.DeleteElementTypes;
import delete.diagram.providers.DeleteModelingAssistantProvider;

/**
 * @generated
 */
public class DeleteModelingAssistantProviderOfJunctionEditPart extends DeleteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((JunctionEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(JunctionEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DeleteElementTypes.JuncRelationship_4013);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((JunctionEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(JunctionEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RootJunctionEditPart) {
			types.add(DeleteElementTypes.JuncRelationship_4013);
		}
		if (targetEditPart instanceof JunctionEditPart) {
			types.add(DeleteElementTypes.JuncRelationship_4013);
		}
		if (targetEditPart instanceof TermEditPart) {
			types.add(DeleteElementTypes.JuncRelationship_4013);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((JunctionEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(JunctionEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DeleteElementTypes.JuncRelationship_4013) {
			types.add(DeleteElementTypes.RootJunction_3040);
			types.add(DeleteElementTypes.Junction_3041);
			types.add(DeleteElementTypes.Term_3042);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((JunctionEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(JunctionEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DeleteElementTypes.JuncRelationship_4013);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((JunctionEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(JunctionEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DeleteElementTypes.JuncRelationship_4013) {
			types.add(DeleteElementTypes.RootJunction_3040);
			types.add(DeleteElementTypes.Junction_3041);
		}
		return types;
	}

}
