/*
 * 
 */
package delete.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import delete.diagram.edit.policies.CallSurfaceQueryCallSurfaceQueryParamsCompartment3CanonicalEditPolicy;
import delete.diagram.edit.policies.CallSurfaceQueryCallSurfaceQueryParamsCompartment3ItemSemanticEditPolicy;
import delete.diagram.part.DeleteVisualIDRegistry;
import delete.diagram.part.Messages;
import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart extends ListCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7022;

	/**
	* @generated
	*/
	public CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart_title;
	}

	/**
	* @generated
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CallSurfaceQueryCallSurfaceQueryParamsCompartment3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(DeleteVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CallSurfaceQueryCallSurfaceQueryParamsCompartment3CanonicalEditPolicy());
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == DeleteElementTypes.CallSurfaceQuery_3014) {
				return this;
			}
			if (type == DeleteElementTypes.Field_3015) {
				return this;
			}
			if (type == DeleteElementTypes.Literal_3016) {
				return this;
			}
			if (type == DeleteElementTypes.NullLiteral_3017) {
				return this;
			}
			if (type == DeleteElementTypes.Function_3018) {
				return this;
			}
			if (type == DeleteElementTypes.Input_3019) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request).getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType.equals(DeleteElementTypes.InnerjoinRels_4001)
								|| elementType.equals(DeleteElementTypes.LeftOuterJoinRels_4002)
								|| elementType.equals(DeleteElementTypes.RightOuterJoinRels_4003)
								|| elementType.equals(DeleteElementTypes.FullOuterJoinRels_4004)
								|| elementType.equals(DeleteElementTypes.EqualLink_4006)
								|| elementType.equals(DeleteElementTypes.GreaterThanLink_4007)
								|| elementType.equals(DeleteElementTypes.GreaterEqualThanLink_4008)
								|| elementType.equals(DeleteElementTypes.LowerThanLink_4009)
								|| elementType.equals(DeleteElementTypes.LowerEqualThanLink_4010)
								|| elementType.equals(DeleteElementTypes.InLink_4011)
								|| elementType.equals(DeleteElementTypes.LikeLink_4012))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
