/*
 * 
 */
package update.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import update.AbstractConditionElement;
import update.ConditionInstalment;
import update.EqualLink;
import update.FullOuterJoinRels;
import update.GreaterEqualThanLink;
import update.GreaterThanLink;
import update.InLink;
import update.InnerjoinRels;
import update.JuncRelationship;
import update.Junction;
import update.LeftOuterJoinRels;
import update.LikeLink;
import update.LinkField;
import update.LowerEqualThanLink;
import update.LowerThanLink;
import update.Node;
import update.RealField;
import update.RightOuterJoinRels;
import update.TableSelection;
import update.Term;
import update.UpdateSurface;
import update.diagram.part.UpdateDiagramEditorPlugin;
import update.diagram.part.UpdateVisualIDRegistry;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class UpdateBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	* Extended request data key to hold editpart visual id.
	* @generated
	*/
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	* @generated
	*/
	private final IElementType myElementType;

	/**
	* @generated
	*/
	protected UpdateBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	* Extended request data key to hold editpart visual id.
	* Add visual id of edited editpart to extended data of the request
	* so command switch can decide what kind of diagram element is being edited.
	* It is done in those cases when it's not possible to deduce diagram
	* element kind from domain element.
	* 
	* @generated
	*/
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof View) {
				Integer id = new Integer(UpdateVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	* Returns visual id from request parameters.
	* @generated
	*/
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	* @generated
	*/
	protected Command addDeleteViewCommand(Command mainCommand, DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
	}

	/**
	* @generated
	*/
	private Command getEditHelperCommand(IEditCommandRequest request, Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy
					? ((ICommandProxy) editPolicyCommand).getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	* @generated
	*/
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = UpdateElementTypes.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	* @generated
	*/
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	* Returns editing domain from the host edit part.
	* @generated
	*/
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	* Clean all shortcuts to the host element from the same diagram
	* @generated
	*/
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() //$NON-NLS-1$
					|| nextView.getElement() != view.getElement()) {
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	* @generated
	*/
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = UpdateDiagramEditorPlugin.getInstance().getLinkConstraints();
		if (cached == null) {
			UpdateDiagramEditorPlugin.getInstance().setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		* @generated
		*/
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateInnerjoinRels_4010(TableSelection container, RealField source, RealField target) {
			return canExistInnerjoinRels_4010(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLeftOuterJoinRels_4011(TableSelection container, RealField source, RealField target) {
			return canExistLeftOuterJoinRels_4011(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRightOuterJoinRels_4012(TableSelection container, RealField source, RealField target) {
			return canExistRightOuterJoinRels_4012(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateFullOuterJoinRels_4013(TableSelection container, RealField source, RealField target) {
			return canExistFullOuterJoinRels_4013(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEqualLink_4001(Term container, Node source, Node target) {
			if (container != null) {
				if (container.getLink() != null) {
					return false;
				}
			}
			return canExistEqualLink_4001(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGreaterThanLink_4002(Term container, Node source, Node target) {
			if (container != null) {
				if (container.getLink() != null) {
					return false;
				}
			}
			return canExistGreaterThanLink_4002(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGreaterEqualThanLink_4003(Term container, Node source, Node target) {
			if (container != null) {
				if (container.getLink() != null) {
					return false;
				}
			}
			return canExistGreaterEqualThanLink_4003(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLowerThanLink_4004(Term container, Node source, Node target) {
			if (container != null) {
				if (container.getLink() != null) {
					return false;
				}
			}
			return canExistLowerThanLink_4004(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLowerEqualThanLink_4005(Term container, Node source, Node target) {
			if (container != null) {
				if (container.getLink() != null) {
					return false;
				}
			}
			return canExistLowerEqualThanLink_4005(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateInLink_4006(Term container, Node source, Node target) {
			if (container != null) {
				if (container.getLink() != null) {
					return false;
				}
			}
			return canExistInLink_4006(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLikeLink_4007(Term container, Node source, Node target) {
			if (container != null) {
				if (container.getLink() != null) {
					return false;
				}
			}
			return canExistLikeLink_4007(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLinkField_4008(UpdateSurface container, RealField source, Node target) {
			return canExistLinkField_4008(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateJuncRelationship_4014(ConditionInstalment container, Junction source,
				AbstractConditionElement target) {
			return canExistJuncRelationship_4014(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canExistInnerjoinRels_4010(TableSelection container, InnerjoinRels linkInstance,
				RealField source, RealField target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistLeftOuterJoinRels_4011(TableSelection container, LeftOuterJoinRels linkInstance,
				RealField source, RealField target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistRightOuterJoinRels_4012(TableSelection container, RightOuterJoinRels linkInstance,
				RealField source, RealField target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistFullOuterJoinRels_4013(TableSelection container, FullOuterJoinRels linkInstance,
				RealField source, RealField target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistEqualLink_4001(Term container, EqualLink linkInstance, Node source, Node target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistGreaterThanLink_4002(Term container, GreaterThanLink linkInstance, Node source,
				Node target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistGreaterEqualThanLink_4003(Term container, GreaterEqualThanLink linkInstance, Node source,
				Node target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistLowerThanLink_4004(Term container, LowerThanLink linkInstance, Node source,
				Node target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistLowerEqualThanLink_4005(Term container, LowerEqualThanLink linkInstance, Node source,
				Node target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistInLink_4006(Term container, InLink linkInstance, Node source, Node target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistLikeLink_4007(Term container, LikeLink linkInstance, Node source, Node target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistLinkField_4008(UpdateSurface container, LinkField linkInstance, RealField source,
				Node target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistJuncRelationship_4014(ConditionInstalment container, JuncRelationship linkInstance,
				Junction source, AbstractConditionElement target) {
			return true;
		}
	}

}
