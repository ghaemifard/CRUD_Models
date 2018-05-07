/*
* 
*/
package update.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import update.diagram.edit.commands.RealFieldCreateCommand;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class MyTableMyTableFakesCompartmentItemSemanticEditPolicy extends UpdateBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MyTableMyTableFakesCompartmentItemSemanticEditPolicy() {
		super(UpdateElementTypes.MyTable_3026);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UpdateElementTypes.RealField_3029 == req.getElementType()) {
			return getGEFWrapper(new RealFieldCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
