/*
* 
*/
package query.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import query.diagram.edit.commands.GroupInstalmentCreateCommand;
import query.diagram.edit.commands.HavingInstalmentCreateCommand;
import query.diagram.edit.commands.InputInstalmentCreateCommand;
import query.diagram.edit.commands.OutputInstalmentCreateCommand;
import query.diagram.edit.commands.SortInstalmentCreateCommand;
import query.diagram.edit.commands.WhereInstalmentCreateCommand;
import query.diagram.providers.QueryElementTypes;

/**
 * @generated
 */
public class QuerySurfaceItemSemanticEditPolicy extends QueryBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public QuerySurfaceItemSemanticEditPolicy() {
		super(QueryElementTypes.QuerySurface_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (QueryElementTypes.WhereInstalment_2001 == req.getElementType()) {
			return getGEFWrapper(new WhereInstalmentCreateCommand(req));
		}
		if (QueryElementTypes.HavingInstalment_2002 == req.getElementType()) {
			return getGEFWrapper(new HavingInstalmentCreateCommand(req));
		}
		if (QueryElementTypes.OutputInstalment_2003 == req.getElementType()) {
			return getGEFWrapper(new OutputInstalmentCreateCommand(req));
		}
		if (QueryElementTypes.InputInstalment_2004 == req.getElementType()) {
			return getGEFWrapper(new InputInstalmentCreateCommand(req));
		}
		if (QueryElementTypes.GroupInstalment_2005 == req.getElementType()) {
			return getGEFWrapper(new GroupInstalmentCreateCommand(req));
		}
		if (QueryElementTypes.SortInstalment_2006 == req.getElementType()) {
			return getGEFWrapper(new SortInstalmentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
