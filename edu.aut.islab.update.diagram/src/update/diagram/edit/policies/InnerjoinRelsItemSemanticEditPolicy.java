/*
* 
*/
package update.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class InnerjoinRelsItemSemanticEditPolicy extends UpdateBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InnerjoinRelsItemSemanticEditPolicy() {
		super(UpdateElementTypes.InnerjoinRels_4010);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
