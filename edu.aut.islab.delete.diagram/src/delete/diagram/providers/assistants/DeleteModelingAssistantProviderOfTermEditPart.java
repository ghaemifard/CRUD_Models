/*
 * 
 */
package delete.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import delete.diagram.edit.parts.TermEditPart;
import delete.diagram.providers.DeleteElementTypes;
import delete.diagram.providers.DeleteModelingAssistantProvider;

/**
 * @generated
 */
public class DeleteModelingAssistantProviderOfTermEditPart extends DeleteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TermEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(TermEditPart target) {
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
		return doGetTypesForSource((TermEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(TermEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DeleteElementTypes.JuncRelationship_4013) {
			types.add(DeleteElementTypes.RootJunction_3040);
			types.add(DeleteElementTypes.Junction_3041);
		}
		return types;
	}

}
