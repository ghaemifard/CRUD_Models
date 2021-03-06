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

import update.diagram.edit.parts.JunctionEditPart;
import update.diagram.edit.parts.RootJunctionEditPart;
import update.diagram.edit.parts.TermEditPart;
import update.diagram.providers.UpdateElementTypes;
import update.diagram.providers.UpdateModelingAssistantProvider;

/**
 * @generated
 */
public class UpdateModelingAssistantProviderOfJunctionEditPart extends UpdateModelingAssistantProvider {

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
		types.add(UpdateElementTypes.JuncRelationship_4014);
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
			types.add(UpdateElementTypes.JuncRelationship_4014);
		}
		if (targetEditPart instanceof JunctionEditPart) {
			types.add(UpdateElementTypes.JuncRelationship_4014);
		}
		if (targetEditPart instanceof TermEditPart) {
			types.add(UpdateElementTypes.JuncRelationship_4014);
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
		if (relationshipType == UpdateElementTypes.JuncRelationship_4014) {
			types.add(UpdateElementTypes.RootJunction_3031);
			types.add(UpdateElementTypes.Junction_3032);
			types.add(UpdateElementTypes.Term_3019);
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
		types.add(UpdateElementTypes.JuncRelationship_4014);
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
		if (relationshipType == UpdateElementTypes.JuncRelationship_4014) {
			types.add(UpdateElementTypes.RootJunction_3031);
			types.add(UpdateElementTypes.Junction_3032);
		}
		return types;
	}

}
