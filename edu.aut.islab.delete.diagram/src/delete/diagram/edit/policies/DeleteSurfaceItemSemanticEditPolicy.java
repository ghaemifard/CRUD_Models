/*
* 
*/
package delete.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import delete.diagram.edit.commands.ConditionInstalmentCreateCommand;
import delete.diagram.edit.commands.DummyCreateCommand;
import delete.diagram.edit.commands.InputInstalmentCreateCommand;
import delete.diagram.edit.commands.SortInstalmentCreateCommand;
import delete.diagram.edit.commands.TableListInstalmentCreateCommand;
import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class DeleteSurfaceItemSemanticEditPolicy extends DeleteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DeleteSurfaceItemSemanticEditPolicy() {
		super(DeleteElementTypes.DeleteSurface_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeleteElementTypes.InputInstalment_2001 == req.getElementType()) {
			return getGEFWrapper(new InputInstalmentCreateCommand(req));
		}
		if (DeleteElementTypes.TableListInstalment_2002 == req.getElementType()) {
			return getGEFWrapper(new TableListInstalmentCreateCommand(req));
		}
		if (DeleteElementTypes.ConditionInstalment_2005 == req.getElementType()) {
			return getGEFWrapper(new ConditionInstalmentCreateCommand(req));
		}
		if (DeleteElementTypes.SortInstalment_2006 == req.getElementType()) {
			return getGEFWrapper(new SortInstalmentCreateCommand(req));
		}
		if (DeleteElementTypes.Dummy_2007 == req.getElementType()) {
			return getGEFWrapper(new DummyCreateCommand(req));
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
