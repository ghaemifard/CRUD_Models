/*
 * 
 */
package query.diagram.edit.parts;

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

import query.diagram.edit.policies.FunctionFunctionParamsCompartmentCanonicalEditPolicy;
import query.diagram.edit.policies.FunctionFunctionParamsCompartmentItemSemanticEditPolicy;
import query.diagram.part.Messages;
import query.diagram.part.QueryVisualIDRegistry;
import query.diagram.providers.QueryElementTypes;

/**
 * @generated
 */
public class FunctionFunctionParamsCompartmentEditPart extends ListCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7005;

	/**
	* @generated
	*/
	public FunctionFunctionParamsCompartmentEditPart(View view) {
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
		return Messages.FunctionFunctionParamsCompartmentEditPart_title;
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
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new FunctionFunctionParamsCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(QueryVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new FunctionFunctionParamsCompartmentCanonicalEditPolicy());
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
			if (type == QueryElementTypes.CallQuerySurface_3005) {
				return this;
			}
			if (type == QueryElementTypes.Field_3006) {
				return this;
			}
			if (type == QueryElementTypes.Literal_3007) {
				return this;
			}
			if (type == QueryElementTypes.NullLiteral_3008) {
				return this;
			}
			if (type == QueryElementTypes.Function_3009) {
				return this;
			}
			if (type == QueryElementTypes.Input_3010) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request).getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType.equals(QueryElementTypes.InnerjoinRels_4001)
								|| elementType.equals(QueryElementTypes.LeftOuterJoinRels_4002)
								|| elementType.equals(QueryElementTypes.RightOuterJoinRels_4003)
								|| elementType.equals(QueryElementTypes.FullOuterJoinRels_4004)
								|| elementType.equals(QueryElementTypes.EqualLink_4005)
								|| elementType.equals(QueryElementTypes.GreaterThanLink_4006)
								|| elementType.equals(QueryElementTypes.GreaterEqualThanLink_4007)
								|| elementType.equals(QueryElementTypes.LowerThanLink_4008)
								|| elementType.equals(QueryElementTypes.LowerEqualThanLink_4009)
								|| elementType.equals(QueryElementTypes.InLink_4010)
								|| elementType.equals(QueryElementTypes.LikeLink_4011))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
