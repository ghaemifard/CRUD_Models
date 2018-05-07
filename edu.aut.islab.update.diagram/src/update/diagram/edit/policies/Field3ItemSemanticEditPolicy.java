/*
* 
*/
package update.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import update.diagram.edit.commands.EqualLinkCreateCommand;
import update.diagram.edit.commands.EqualLinkReorientCommand;
import update.diagram.edit.commands.GreaterEqualThanLinkCreateCommand;
import update.diagram.edit.commands.GreaterEqualThanLinkReorientCommand;
import update.diagram.edit.commands.GreaterThanLinkCreateCommand;
import update.diagram.edit.commands.GreaterThanLinkReorientCommand;
import update.diagram.edit.commands.InLinkCreateCommand;
import update.diagram.edit.commands.InLinkReorientCommand;
import update.diagram.edit.commands.LikeLinkCreateCommand;
import update.diagram.edit.commands.LikeLinkReorientCommand;
import update.diagram.edit.commands.LinkFieldCreateCommand;
import update.diagram.edit.commands.LinkFieldReorientCommand;
import update.diagram.edit.commands.LowerEqualThanLinkCreateCommand;
import update.diagram.edit.commands.LowerEqualThanLinkReorientCommand;
import update.diagram.edit.commands.LowerThanLinkCreateCommand;
import update.diagram.edit.commands.LowerThanLinkReorientCommand;
import update.diagram.edit.parts.EqualLinkEditPart;
import update.diagram.edit.parts.GreaterEqualThanLinkEditPart;
import update.diagram.edit.parts.GreaterThanLinkEditPart;
import update.diagram.edit.parts.InLinkEditPart;
import update.diagram.edit.parts.LikeLinkEditPart;
import update.diagram.edit.parts.LinkFieldEditPart;
import update.diagram.edit.parts.LowerEqualThanLinkEditPart;
import update.diagram.edit.parts.LowerThanLinkEditPart;
import update.diagram.part.UpdateVisualIDRegistry;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class Field3ItemSemanticEditPolicy extends UpdateBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public Field3ItemSemanticEditPolicy() {
		super(UpdateElementTypes.Field_3021);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (UpdateVisualIDRegistry.getVisualID(incomingLink) == EqualLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(incomingLink) == GreaterThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(incomingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(incomingLink) == LowerThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(incomingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(incomingLink) == InLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(incomingLink) == LikeLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(incomingLink) == LinkFieldEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (UpdateVisualIDRegistry.getVisualID(outgoingLink) == EqualLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(outgoingLink) == GreaterThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(outgoingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(outgoingLink) == LowerThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(outgoingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(outgoingLink) == InLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(outgoingLink) == LikeLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UpdateElementTypes.EqualLink_4001 == req.getElementType()) {
			return getGEFWrapper(new EqualLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.GreaterThanLink_4002 == req.getElementType()) {
			return getGEFWrapper(new GreaterThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.GreaterEqualThanLink_4003 == req.getElementType()) {
			return getGEFWrapper(new GreaterEqualThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.LowerThanLink_4004 == req.getElementType()) {
			return getGEFWrapper(new LowerThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.LowerEqualThanLink_4005 == req.getElementType()) {
			return getGEFWrapper(new LowerEqualThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.InLink_4006 == req.getElementType()) {
			return getGEFWrapper(new InLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.LikeLink_4007 == req.getElementType()) {
			return getGEFWrapper(new LikeLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.LinkField_4008 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UpdateElementTypes.EqualLink_4001 == req.getElementType()) {
			return getGEFWrapper(new EqualLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.GreaterThanLink_4002 == req.getElementType()) {
			return getGEFWrapper(new GreaterThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.GreaterEqualThanLink_4003 == req.getElementType()) {
			return getGEFWrapper(new GreaterEqualThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.LowerThanLink_4004 == req.getElementType()) {
			return getGEFWrapper(new LowerThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.LowerEqualThanLink_4005 == req.getElementType()) {
			return getGEFWrapper(new LowerEqualThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.InLink_4006 == req.getElementType()) {
			return getGEFWrapper(new InLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.LikeLink_4007 == req.getElementType()) {
			return getGEFWrapper(new LikeLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.LinkField_4008 == req.getElementType()) {
			return getGEFWrapper(new LinkFieldCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case EqualLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new EqualLinkReorientCommand(req));
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new GreaterThanLinkReorientCommand(req));
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new GreaterEqualThanLinkReorientCommand(req));
		case LowerThanLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new LowerThanLinkReorientCommand(req));
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new LowerEqualThanLinkReorientCommand(req));
		case InLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new InLinkReorientCommand(req));
		case LikeLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new LikeLinkReorientCommand(req));
		case LinkFieldEditPart.VISUAL_ID:
			return getGEFWrapper(new LinkFieldReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
