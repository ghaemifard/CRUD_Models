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

import update.diagram.edit.commands.FullOuterJoinRelsCreateCommand;
import update.diagram.edit.commands.FullOuterJoinRelsReorientCommand;
import update.diagram.edit.commands.InnerjoinRelsCreateCommand;
import update.diagram.edit.commands.InnerjoinRelsReorientCommand;
import update.diagram.edit.commands.LeftOuterJoinRelsCreateCommand;
import update.diagram.edit.commands.LeftOuterJoinRelsReorientCommand;
import update.diagram.edit.commands.LinkFieldCreateCommand;
import update.diagram.edit.commands.LinkFieldReorientCommand;
import update.diagram.edit.commands.RightOuterJoinRelsCreateCommand;
import update.diagram.edit.commands.RightOuterJoinRelsReorientCommand;
import update.diagram.edit.parts.FullOuterJoinRelsEditPart;
import update.diagram.edit.parts.InnerjoinRelsEditPart;
import update.diagram.edit.parts.LeftOuterJoinRelsEditPart;
import update.diagram.edit.parts.LinkFieldEditPart;
import update.diagram.edit.parts.RightOuterJoinRelsEditPart;
import update.diagram.part.UpdateVisualIDRegistry;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class RealFieldItemSemanticEditPolicy extends UpdateBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RealFieldItemSemanticEditPolicy() {
		super(UpdateElementTypes.RealField_3029);
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
			if (UpdateVisualIDRegistry.getVisualID(incomingLink) == InnerjoinRelsEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(incomingLink) == LeftOuterJoinRelsEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(incomingLink) == RightOuterJoinRelsEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(incomingLink) == FullOuterJoinRelsEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (UpdateVisualIDRegistry.getVisualID(outgoingLink) == InnerjoinRelsEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(outgoingLink) == LeftOuterJoinRelsEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(outgoingLink) == RightOuterJoinRelsEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(outgoingLink) == FullOuterJoinRelsEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (UpdateVisualIDRegistry.getVisualID(outgoingLink) == LinkFieldEditPart.VISUAL_ID) {
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
		if (UpdateElementTypes.InnerjoinRels_4010 == req.getElementType()) {
			return getGEFWrapper(new InnerjoinRelsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.LeftOuterJoinRels_4011 == req.getElementType()) {
			return getGEFWrapper(new LeftOuterJoinRelsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.RightOuterJoinRels_4012 == req.getElementType()) {
			return getGEFWrapper(new RightOuterJoinRelsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.FullOuterJoinRels_4013 == req.getElementType()) {
			return getGEFWrapper(new FullOuterJoinRelsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.LinkField_4008 == req.getElementType()) {
			return getGEFWrapper(new LinkFieldCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UpdateElementTypes.InnerjoinRels_4010 == req.getElementType()) {
			return getGEFWrapper(new InnerjoinRelsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.LeftOuterJoinRels_4011 == req.getElementType()) {
			return getGEFWrapper(new LeftOuterJoinRelsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.RightOuterJoinRels_4012 == req.getElementType()) {
			return getGEFWrapper(new RightOuterJoinRelsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.FullOuterJoinRels_4013 == req.getElementType()) {
			return getGEFWrapper(new FullOuterJoinRelsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UpdateElementTypes.LinkField_4008 == req.getElementType()) {
			return null;
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
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getGEFWrapper(new InnerjoinRelsReorientCommand(req));
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getGEFWrapper(new LeftOuterJoinRelsReorientCommand(req));
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getGEFWrapper(new RightOuterJoinRelsReorientCommand(req));
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getGEFWrapper(new FullOuterJoinRelsReorientCommand(req));
		case LinkFieldEditPart.VISUAL_ID:
			return getGEFWrapper(new LinkFieldReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
