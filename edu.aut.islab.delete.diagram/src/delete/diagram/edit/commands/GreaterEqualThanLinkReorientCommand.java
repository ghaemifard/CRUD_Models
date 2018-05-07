/*
 * 
 */
package delete.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import delete.GreaterEqualThanLink;
import delete.Node;
import delete.Term;
import delete.diagram.edit.policies.DeleteBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class GreaterEqualThanLinkReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public GreaterEqualThanLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof GreaterEqualThanLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Node && newEnd instanceof Node)) {
			return false;
		}
		Node target = getLink().getDst();
		if (!(getLink().eContainer() instanceof Term)) {
			return false;
		}
		Term container = (Term) getLink().eContainer();
		return DeleteBaseItemSemanticEditPolicy.getLinkConstraints().canExistGreaterEqualThanLink_4008(container,
				getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Node && newEnd instanceof Node)) {
			return false;
		}
		Node source = getLink().getSrc();
		if (!(getLink().eContainer() instanceof Term)) {
			return false;
		}
		Term container = (Term) getLink().eContainer();
		return DeleteBaseItemSemanticEditPolicy.getLinkConstraints().canExistGreaterEqualThanLink_4008(container,
				getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSrc(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setDst(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected GreaterEqualThanLink getLink() {
		return (GreaterEqualThanLink) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Node getOldSource() {
		return (Node) oldEnd;
	}

	/**
	* @generated
	*/
	protected Node getNewSource() {
		return (Node) newEnd;
	}

	/**
	* @generated
	*/
	protected Node getOldTarget() {
		return (Node) oldEnd;
	}

	/**
	* @generated
	*/
	protected Node getNewTarget() {
		return (Node) newEnd;
	}
}
