/*
* 
*/
package update.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import update.diagram.edit.commands.JuncRelationshipCreateCommand;
import update.diagram.edit.commands.JuncRelationshipReorientCommand;
import update.diagram.edit.parts.CallSurfaceQuery3EditPart;
import update.diagram.edit.parts.EqualLinkEditPart;
import update.diagram.edit.parts.Field3EditPart;
import update.diagram.edit.parts.Function3EditPart;
import update.diagram.edit.parts.GreaterEqualThanLinkEditPart;
import update.diagram.edit.parts.GreaterThanLinkEditPart;
import update.diagram.edit.parts.InLinkEditPart;
import update.diagram.edit.parts.Input3EditPart;
import update.diagram.edit.parts.JuncRelationshipEditPart;
import update.diagram.edit.parts.LikeLinkEditPart;
import update.diagram.edit.parts.LinkFieldEditPart;
import update.diagram.edit.parts.Literal3EditPart;
import update.diagram.edit.parts.LowerEqualThanLinkEditPart;
import update.diagram.edit.parts.LowerThanLinkEditPart;
import update.diagram.edit.parts.NullLiteral3EditPart;
import update.diagram.edit.parts.TermTermParamsCompartmentEditPart;
import update.diagram.part.UpdateVisualIDRegistry;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class TermItemSemanticEditPolicy extends UpdateBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TermItemSemanticEditPolicy() {
		super(UpdateElementTypes.Term_3019);
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
			if (UpdateVisualIDRegistry.getVisualID(incomingLink) == JuncRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (UpdateVisualIDRegistry.getVisualID(node)) {
			case TermTermParamsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (UpdateVisualIDRegistry.getVisualID(cnode)) {
					case CallSurfaceQuery3EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(incomingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(incomingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
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
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(outgoingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(outgoingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
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
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case Field3EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(incomingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(incomingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
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
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(outgoingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(outgoingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
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
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case Literal3EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(incomingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(incomingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
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
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(outgoingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(outgoingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
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
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case NullLiteral3EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(incomingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(incomingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
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
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(outgoingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(outgoingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
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
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case Function3EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(incomingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(incomingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
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
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(outgoingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(outgoingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
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
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case Input3EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(incomingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(incomingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
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
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(outgoingLink) == GreaterEqualThanLinkEditPart.VISUAL_ID) {
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
							if (UpdateVisualIDRegistry
									.getVisualID(outgoingLink) == LowerEqualThanLinkEditPart.VISUAL_ID) {
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
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (UpdateElementTypes.JuncRelationship_4014 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UpdateElementTypes.JuncRelationship_4014 == req.getElementType()) {
			return getGEFWrapper(new JuncRelationshipCreateCommand(req, req.getSource(), req.getTarget()));
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
		case JuncRelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new JuncRelationshipReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
