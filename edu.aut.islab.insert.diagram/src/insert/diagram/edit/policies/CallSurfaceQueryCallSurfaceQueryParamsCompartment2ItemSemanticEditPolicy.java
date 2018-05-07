/*
* 
*/
package insert.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import insert.diagram.edit.commands.CallSurfaceQuery2CreateCommand;
import insert.diagram.edit.commands.Field2CreateCommand;
import insert.diagram.edit.commands.FunctionCreateCommand;
import insert.diagram.edit.commands.InputCreateCommand;
import insert.diagram.edit.commands.LiteralCreateCommand;
import insert.diagram.edit.commands.NullLiteralCreateCommand;
import insert.diagram.providers.InsertElementTypes;

/**
 * @generated
 */
public class CallSurfaceQueryCallSurfaceQueryParamsCompartment2ItemSemanticEditPolicy
		extends InsertBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CallSurfaceQueryCallSurfaceQueryParamsCompartment2ItemSemanticEditPolicy() {
		super(InsertElementTypes.CallSurfaceQuery_3007);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (InsertElementTypes.CallSurfaceQuery_3007 == req.getElementType()) {
			return getGEFWrapper(new CallSurfaceQuery2CreateCommand(req));
		}
		if (InsertElementTypes.Field_3008 == req.getElementType()) {
			return getGEFWrapper(new Field2CreateCommand(req));
		}
		if (InsertElementTypes.Literal_3009 == req.getElementType()) {
			return getGEFWrapper(new LiteralCreateCommand(req));
		}
		if (InsertElementTypes.NullLiteral_3010 == req.getElementType()) {
			return getGEFWrapper(new NullLiteralCreateCommand(req));
		}
		if (InsertElementTypes.Function_3011 == req.getElementType()) {
			return getGEFWrapper(new FunctionCreateCommand(req));
		}
		if (InsertElementTypes.Input_3012 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
