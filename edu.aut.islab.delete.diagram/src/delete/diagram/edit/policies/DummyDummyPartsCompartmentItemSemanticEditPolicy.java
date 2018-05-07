/*
* 
*/
package delete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import delete.diagram.edit.commands.CallSurfaceQuery3CreateCommand;
import delete.diagram.edit.commands.Field4CreateCommand;
import delete.diagram.edit.commands.Function3CreateCommand;
import delete.diagram.edit.commands.Input3CreateCommand;
import delete.diagram.edit.commands.Literal3CreateCommand;
import delete.diagram.edit.commands.MyTable2CreateCommand;
import delete.diagram.edit.commands.NullLiteral3CreateCommand;
import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class DummyDummyPartsCompartmentItemSemanticEditPolicy extends DeleteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DummyDummyPartsCompartmentItemSemanticEditPolicy() {
		super(DeleteElementTypes.Dummy_2007);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeleteElementTypes.CallSurfaceQuery_3044 == req.getElementType()) {
			return getGEFWrapper(new CallSurfaceQuery3CreateCommand(req));
		}
		if (DeleteElementTypes.Field_3045 == req.getElementType()) {
			return getGEFWrapper(new Field4CreateCommand(req));
		}
		if (DeleteElementTypes.Literal_3046 == req.getElementType()) {
			return getGEFWrapper(new Literal3CreateCommand(req));
		}
		if (DeleteElementTypes.NullLiteral_3047 == req.getElementType()) {
			return getGEFWrapper(new NullLiteral3CreateCommand(req));
		}
		if (DeleteElementTypes.Function_3048 == req.getElementType()) {
			return getGEFWrapper(new Function3CreateCommand(req));
		}
		if (DeleteElementTypes.Input_3049 == req.getElementType()) {
			return getGEFWrapper(new Input3CreateCommand(req));
		}
		if (DeleteElementTypes.MyTable_3053 == req.getElementType()) {
			return getGEFWrapper(new MyTable2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
