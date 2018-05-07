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

import delete.AbstractConditionElement;
import delete.ConditionInstalment;
import delete.JuncRelationship;
import delete.Junction;
import delete.diagram.edit.policies.DeleteBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class JuncRelationshipReorientCommand extends EditElementCommand {

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
	public JuncRelationshipReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof JuncRelationship) {
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
		if (!(oldEnd instanceof Junction && newEnd instanceof Junction)) {
			return false;
		}
		AbstractConditionElement target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof ConditionInstalment)) {
			return false;
		}
		ConditionInstalment container = (ConditionInstalment) getLink().eContainer();
		return DeleteBaseItemSemanticEditPolicy.getLinkConstraints().canExistJuncRelationship_4013(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof AbstractConditionElement && newEnd instanceof AbstractConditionElement)) {
			return false;
		}
		Junction source = getLink().getSource();
		if (!(getLink().eContainer() instanceof ConditionInstalment)) {
			return false;
		}
		ConditionInstalment container = (ConditionInstalment) getLink().eContainer();
		return DeleteBaseItemSemanticEditPolicy.getLinkConstraints().canExistJuncRelationship_4013(container, getLink(),
				source, getNewTarget());
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
	protected JuncRelationship getLink() {
		return (JuncRelationship) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Junction getOldSource() {
		return (Junction) oldEnd;
	}

	/**
	* @generated
	*/
	protected Junction getNewSource() {
		return (Junction) newEnd;
	}

	/**
	* @generated
	*/
	protected AbstractConditionElement getOldTarget() {
		return (AbstractConditionElement) oldEnd;
	}

	/**
	* @generated
	*/
	protected AbstractConditionElement getNewTarget() {
		return (AbstractConditionElement) newEnd;
	}
}
