/*
* 
*/
package insert.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import insert.diagram.edit.commands.InputInstalmentCreateCommand;
import insert.diagram.edit.commands.PrepareListCreateCommand;
import insert.diagram.edit.commands.TableCreateCommand;
import insert.diagram.providers.InsertElementTypes;

/**
 * @generated
 */
public class InsertSurfaceItemSemanticEditPolicy extends InsertBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InsertSurfaceItemSemanticEditPolicy() {
		super(InsertElementTypes.InsertSurface_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (InsertElementTypes.Table_2004 == req.getElementType()) {
			return getGEFWrapper(new TableCreateCommand(req));
		}
		if (InsertElementTypes.InputInstalment_2002 == req.getElementType()) {
			return getGEFWrapper(new InputInstalmentCreateCommand(req));
		}
		if (InsertElementTypes.PrepareList_2003 == req.getElementType()) {
			return getGEFWrapper(new PrepareListCreateCommand(req));
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
