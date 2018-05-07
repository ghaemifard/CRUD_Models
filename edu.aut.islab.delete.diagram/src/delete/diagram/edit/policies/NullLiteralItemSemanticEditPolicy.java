/*
* 
*/
package delete.diagram.edit.policies;

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

import delete.diagram.edit.commands.EqualLinkCreateCommand;
import delete.diagram.edit.commands.EqualLinkReorientCommand;
import delete.diagram.edit.commands.GreaterEqualThanLinkCreateCommand;
import delete.diagram.edit.commands.GreaterEqualThanLinkReorientCommand;
import delete.diagram.edit.commands.GreaterThanLinkCreateCommand;
import delete.diagram.edit.commands.GreaterThanLinkReorientCommand;
import delete.diagram.edit.commands.InLinkCreateCommand;
import delete.diagram.edit.commands.InLinkReorientCommand;
import delete.diagram.edit.commands.LikeLinkCreateCommand;
import delete.diagram.edit.commands.LikeLinkReorientCommand;
import delete.diagram.edit.commands.LowerEqualThanLinkCreateCommand;
import delete.diagram.edit.commands.LowerEqualThanLinkReorientCommand;
import delete.diagram.edit.commands.LowerThanLinkCreateCommand;
import delete.diagram.edit.commands.LowerThanLinkReorientCommand;
import delete.diagram.edit.parts.EqualLinkEditPart;
import delete.diagram.edit.parts.GreaterEqualThanLinkEditPart;
import delete.diagram.edit.parts.GreaterThanLinkEditPart;
import delete.diagram.edit.parts.InLinkEditPart;
import delete.diagram.edit.parts.LikeLinkEditPart;
import delete.diagram.edit.parts.LowerEqualThanLinkEditPart;
import delete.diagram.edit.parts.LowerThanLinkEditPart;
import delete.diagram.part.DeleteVisualIDRegistry;
import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class NullLiteralItemSemanticEditPolicy extends DeleteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public NullLiteralItemSemanticEditPolicy() {
		super(DeleteElementTypes.NullLiteral_3017);
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
			if (DeleteVisualIDRegistry.getVisualID(incomingLink) == EqualLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeleteVisualIDRegistry.getVisualID(incomingLink) == GreaterThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeleteVisualIDRegistry.getVisualID(incomingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeleteVisualIDRegistry.getVisualID(incomingLink) == LowerThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeleteVisualIDRegistry.getVisualID(incomingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeleteVisualIDRegistry.getVisualID(incomingLink) == InLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeleteVisualIDRegistry.getVisualID(incomingLink) == LikeLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DeleteVisualIDRegistry.getVisualID(outgoingLink) == EqualLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeleteVisualIDRegistry.getVisualID(outgoingLink) == GreaterThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeleteVisualIDRegistry.getVisualID(outgoingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeleteVisualIDRegistry.getVisualID(outgoingLink) == LowerThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeleteVisualIDRegistry.getVisualID(outgoingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeleteVisualIDRegistry.getVisualID(outgoingLink) == InLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeleteVisualIDRegistry.getVisualID(outgoingLink) == LikeLinkEditPart.VISUAL_ID) {
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
		if (DeleteElementTypes.EqualLink_4006 == req.getElementType()) {
			return getGEFWrapper(new EqualLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DeleteElementTypes.GreaterThanLink_4007 == req.getElementType()) {
			return getGEFWrapper(new GreaterThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DeleteElementTypes.GreaterEqualThanLink_4008 == req.getElementType()) {
			return getGEFWrapper(new GreaterEqualThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DeleteElementTypes.LowerThanLink_4009 == req.getElementType()) {
			return getGEFWrapper(new LowerThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DeleteElementTypes.LowerEqualThanLink_4010 == req.getElementType()) {
			return getGEFWrapper(new LowerEqualThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DeleteElementTypes.InLink_4011 == req.getElementType()) {
			return getGEFWrapper(new InLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DeleteElementTypes.LikeLink_4012 == req.getElementType()) {
			return getGEFWrapper(new LikeLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DeleteElementTypes.EqualLink_4006 == req.getElementType()) {
			return getGEFWrapper(new EqualLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DeleteElementTypes.GreaterThanLink_4007 == req.getElementType()) {
			return getGEFWrapper(new GreaterThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DeleteElementTypes.GreaterEqualThanLink_4008 == req.getElementType()) {
			return getGEFWrapper(new GreaterEqualThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DeleteElementTypes.LowerThanLink_4009 == req.getElementType()) {
			return getGEFWrapper(new LowerThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DeleteElementTypes.LowerEqualThanLink_4010 == req.getElementType()) {
			return getGEFWrapper(new LowerEqualThanLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DeleteElementTypes.InLink_4011 == req.getElementType()) {
			return getGEFWrapper(new InLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DeleteElementTypes.LikeLink_4012 == req.getElementType()) {
			return getGEFWrapper(new LikeLinkCreateCommand(req, req.getSource(), req.getTarget()));
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
		}
		return super.getReorientRelationshipCommand(req);
	}

}
