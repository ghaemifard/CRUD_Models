/*
* 
*/
package query.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import query.diagram.providers.QueryElementTypes;

/**
 * @generated
 */
public class FullOuterJoinRelsItemSemanticEditPolicy extends QueryBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FullOuterJoinRelsItemSemanticEditPolicy() {
		super(QueryElementTypes.FullOuterJoinRels_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
