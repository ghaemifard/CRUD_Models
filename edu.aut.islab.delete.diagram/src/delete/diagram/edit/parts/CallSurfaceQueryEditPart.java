/*
 * 
 */
package delete.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import delete.diagram.edit.policies.CallSurfaceQueryItemSemanticEditPolicy;
import delete.diagram.edit.policies.OpenDiagramEditPolicy;
import delete.diagram.part.DeleteVisualIDRegistry;
import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class CallSurfaceQueryEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3025;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public CallSurfaceQueryEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(DeleteVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CallSurfaceQueryItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new CallSurfaceQueryFigure();
	}

	/**
	* @generated
	*/
	public CallSurfaceQueryFigure getPrimaryShape() {
		return (CallSurfaceQueryFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CallSurfaceQueryNameEditPart) {
			((CallSurfaceQueryNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureCallSurfaceQueryLabelFigure());
			return true;
		}
		if (childEditPart instanceof CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getCallSurfaceQueryParamsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CallSurfaceQueryNameEditPart) {
			return true;
		}
		if (childEditPart instanceof CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getCallSurfaceQueryParamsCompartmentFigure();
			pane.remove(((CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart) {
			return getPrimaryShape().getCallSurfaceQueryParamsCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(DeleteVisualIDRegistry.getType(CallSurfaceQueryNameEditPart.VISUAL_ID));
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
				return getChildBySemanticHint(DeleteVisualIDRegistry
						.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID));
			}
			if (type == DeleteElementTypes.Field_3015) {
				return getChildBySemanticHint(DeleteVisualIDRegistry
						.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID));
			}
			if (type == DeleteElementTypes.Literal_3016) {
				return getChildBySemanticHint(DeleteVisualIDRegistry
						.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID));
			}
			if (type == DeleteElementTypes.NullLiteral_3017) {
				return getChildBySemanticHint(DeleteVisualIDRegistry
						.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID));
			}
			if (type == DeleteElementTypes.Function_3018) {
				return getChildBySemanticHint(DeleteVisualIDRegistry
						.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID));
			}
			if (type == DeleteElementTypes.Input_3019) {
				return getChildBySemanticHint(DeleteVisualIDRegistry
						.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class CallSurfaceQueryFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCallSurfaceQueryLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fCallSurfaceQueryParamsCompartmentFigure;

		/**
		 * @generated
		 */
		public CallSurfaceQueryFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCallSurfaceQueryLabelFigure = new WrappingLabel();

			fFigureCallSurfaceQueryLabelFigure.setText("CallSurfaceQuery");
			fFigureCallSurfaceQueryLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureCallSurfaceQueryLabelFigure);

			fCallSurfaceQueryParamsCompartmentFigure = new RectangleFigure();

			fCallSurfaceQueryParamsCompartmentFigure.setOutline(false);

			this.add(fCallSurfaceQueryParamsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCallSurfaceQueryLabelFigure() {
			return fFigureCallSurfaceQueryLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getCallSurfaceQueryParamsCompartmentFigure() {
			return fCallSurfaceQueryParamsCompartmentFigure;
		}

	}

}
