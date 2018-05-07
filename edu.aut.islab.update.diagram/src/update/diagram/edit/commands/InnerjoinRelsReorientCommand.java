/*
 * 
 */
package update.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import update.InnerjoinRels;
import update.RealField;
import update.TableSelection;
import update.diagram.edit.policies.UpdateBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class InnerjoinRelsReorientCommand extends EditElementCommand {

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
	public InnerjoinRelsReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof InnerjoinRels) {
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
		if (!(oldEnd instanceof RealField && newEnd instanceof RealField)) {
			return false;
		}
		RealField target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof TableSelection)) {
			return false;
		}
		TableSelection container = (TableSelection) getLink().eContainer();
		return UpdateBaseItemSemanticEditPolicy.getLinkConstraints().canExistInnerjoinRels_4010(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof RealField && newEnd instanceof RealField)) {
			return false;
		}
		RealField source = getLink().getSource();
		if (!(getLink().eContainer() instanceof TableSelection)) {
			return false;
		}
		TableSelection container = (TableSelection) getLink().eContainer();
		return UpdateBaseItemSemanticEditPolicy.getLinkConstraints().canExistInnerjoinRels_4010(container, getLink(),
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
	protected InnerjoinRels getLink() {
		return (InnerjoinRels) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected RealField getOldSource() {
		return (RealField) oldEnd;
	}

	/**
	* @generated
	*/
	protected RealField getNewSource() {
		return (RealField) newEnd;
	}

	/**
	* @generated
	*/
	protected RealField getOldTarget() {
		return (RealField) oldEnd;
	}

	/**
	* @generated
	*/
	protected RealField getNewTarget() {
		return (RealField) newEnd;
	}
}
