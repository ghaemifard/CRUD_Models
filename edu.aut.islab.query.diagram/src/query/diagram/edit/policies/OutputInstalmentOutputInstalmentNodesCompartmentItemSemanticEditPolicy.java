/*
* 
*/
package query.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import query.diagram.edit.commands.CallQuerySurface3CreateCommand;
import query.diagram.edit.commands.Field3CreateCommand;
import query.diagram.edit.commands.Function3CreateCommand;
import query.diagram.edit.commands.Input3CreateCommand;
import query.diagram.edit.commands.Literal3CreateCommand;
import query.diagram.edit.commands.MyTableCreateCommand;
import query.diagram.edit.commands.NullLiteral3CreateCommand;
import query.diagram.providers.QueryElementTypes;

/**
 * @generated
 */
public class OutputInstalmentOutputInstalmentNodesCompartmentItemSemanticEditPolicy
		extends QueryBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public OutputInstalmentOutputInstalmentNodesCompartmentItemSemanticEditPolicy() {
		super(QueryElementTypes.OutputInstalment_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (QueryElementTypes.CallQuerySurface_3016 == req.getElementType()) {
			return getGEFWrapper(new CallQuerySurface3CreateCommand(req));
		}
		if (QueryElementTypes.Field_3017 == req.getElementType()) {
			return getGEFWrapper(new Field3CreateCommand(req));
		}
		if (QueryElementTypes.Literal_3018 == req.getElementType()) {
			return getGEFWrapper(new Literal3CreateCommand(req));
		}
		if (QueryElementTypes.NullLiteral_3019 == req.getElementType()) {
			return getGEFWrapper(new NullLiteral3CreateCommand(req));
		}
		if (QueryElementTypes.Function_3020 == req.getElementType()) {
			return getGEFWrapper(new Function3CreateCommand(req));
		}
		if (QueryElementTypes.Input_3021 == req.getElementType()) {
			return getGEFWrapper(new Input3CreateCommand(req));
		}
		if (QueryElementTypes.MyTable_3022 == req.getElementType()) {
			return getGEFWrapper(new MyTableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
