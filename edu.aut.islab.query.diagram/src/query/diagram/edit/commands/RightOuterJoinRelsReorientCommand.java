/*
 * 
 */
package query.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import query.Field;
import query.OutputInstalment;
import query.RightOuterJoinRels;
import query.diagram.edit.policies.QueryBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class RightOuterJoinRelsReorientCommand extends EditElementCommand {

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
	public RightOuterJoinRelsReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof RightOuterJoinRels) {
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
		if (!(oldEnd instanceof Field && newEnd instanceof Field)) {
			return false;
		}
		Field target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof OutputInstalment)) {
			return false;
		}
		OutputInstalment container = (OutputInstalment) getLink().eContainer();
		return QueryBaseItemSemanticEditPolicy.getLinkConstraints().canExistRightOuterJoinRels_4003(container,
				getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Field && newEnd instanceof Field)) {
			return false;
		}
		Field source = getLink().getSource();
		if (!(getLink().eContainer() instanceof OutputInstalment)) {
			return false;
		}
		OutputInstalment container = (OutputInstalment) getLink().eContainer();
		return QueryBaseItemSemanticEditPolicy.getLinkConstraints().canExistRightOuterJoinRels_4003(container,
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected RightOuterJoinRels getLink() {
		return (RightOuterJoinRels) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Field getOldSource() {
		return (Field) oldEnd;
	}

	/**
	* @generated
	*/
	protected Field getNewSource() {
		return (Field) newEnd;
	}

	/**
	* @generated
	*/
	protected Field getOldTarget() {
		return (Field) oldEnd;
	}

	/**
	* @generated
	*/
	protected Field getNewTarget() {
		return (Field) newEnd;
	}
}
