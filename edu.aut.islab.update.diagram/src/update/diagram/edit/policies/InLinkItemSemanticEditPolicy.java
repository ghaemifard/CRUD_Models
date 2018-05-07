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
public class InLinkItemSemanticEditPolicy extends UpdateBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InLinkItemSemanticEditPolicy() {
		super(UpdateElementTypes.InLink_4006);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
