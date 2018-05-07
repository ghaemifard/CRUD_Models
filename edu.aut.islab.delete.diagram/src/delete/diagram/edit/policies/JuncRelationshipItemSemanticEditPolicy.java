/*
* 
*/
package delete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class JuncRelationshipItemSemanticEditPolicy extends DeleteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public JuncRelationshipItemSemanticEditPolicy() {
		super(DeleteElementTypes.JuncRelationship_4013);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
