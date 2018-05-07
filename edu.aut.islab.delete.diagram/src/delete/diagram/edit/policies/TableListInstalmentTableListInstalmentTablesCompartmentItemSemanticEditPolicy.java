/*
* 
*/
package delete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import delete.diagram.edit.commands.MyTableCreateCommand;
import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class TableListInstalmentTableListInstalmentTablesCompartmentItemSemanticEditPolicy
		extends DeleteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TableListInstalmentTableListInstalmentTablesCompartmentItemSemanticEditPolicy() {
		super(DeleteElementTypes.TableListInstalment_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeleteElementTypes.MyTable_3051 == req.getElementType()) {
			return getGEFWrapper(new MyTableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
