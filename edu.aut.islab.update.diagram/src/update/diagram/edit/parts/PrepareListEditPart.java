/*
 * 
 */
package update.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
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

import update.diagram.edit.policies.OpenDiagramEditPolicy;
import update.diagram.edit.policies.PrepareListItemSemanticEditPolicy;
import update.diagram.part.UpdateVisualIDRegistry;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class PrepareListEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2002;

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
	public PrepareListEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(UpdateVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PrepareListItemSemanticEditPolicy());
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
		return primaryShape = new PrepareListFigure();
	}

	/**
	* @generated
	*/
	public PrepareListFigure getPrimaryShape() {
		return (PrepareListFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PrepareListNameEditPart) {
			((PrepareListNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigurePrepareListLabelFigure());
			return true;
		}
		if (childEditPart instanceof PrepareListPrepareListNodesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getPrepareListNodesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PrepareListPrepareListNodesCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PrepareListNameEditPart) {
			return true;
		}
		if (childEditPart instanceof PrepareListPrepareListNodesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getPrepareListNodesCompartmentFigure();
			pane.remove(((PrepareListPrepareListNodesCompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof PrepareListPrepareListNodesCompartmentEditPart) {
			return getPrimaryShape().getPrepareListNodesCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 500);
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
		return getChildBySemanticHint(UpdateVisualIDRegistry.getType(PrepareListNameEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == UpdateElementTypes.CallSurfaceQuery_3005) {
				return getChildBySemanticHint(
						UpdateVisualIDRegistry.getType(PrepareListPrepareListNodesCompartmentEditPart.VISUAL_ID));
			}
			if (type == UpdateElementTypes.Field_3012) {
				return getChildBySemanticHint(
						UpdateVisualIDRegistry.getType(PrepareListPrepareListNodesCompartmentEditPart.VISUAL_ID));
			}
			if (type == UpdateElementTypes.Literal_3013) {
				return getChildBySemanticHint(
						UpdateVisualIDRegistry.getType(PrepareListPrepareListNodesCompartmentEditPart.VISUAL_ID));
			}
			if (type == UpdateElementTypes.NullLiteral_3014) {
				return getChildBySemanticHint(
						UpdateVisualIDRegistry.getType(PrepareListPrepareListNodesCompartmentEditPart.VISUAL_ID));
			}
			if (type == UpdateElementTypes.Function_3015) {
				return getChildBySemanticHint(
						UpdateVisualIDRegistry.getType(PrepareListPrepareListNodesCompartmentEditPart.VISUAL_ID));
			}
			if (type == UpdateElementTypes.Input_3016) {
				return getChildBySemanticHint(
						UpdateVisualIDRegistry.getType(PrepareListPrepareListNodesCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class PrepareListFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePrepareListLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fPrepareListNodesCompartmentFigure;

		/**
		 * @generated
		 */
		public PrepareListFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(100), getMapMode().DPtoLP(500)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePrepareListLabelFigure = new WrappingLabel();

			fFigurePrepareListLabelFigure.setText("PrepareList");
			fFigurePrepareListLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigurePrepareListLabelFigure);

			fPrepareListNodesCompartmentFigure = new RectangleFigure();

			fPrepareListNodesCompartmentFigure.setOutline(false);

			this.add(fPrepareListNodesCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePrepareListLabelFigure() {
			return fFigurePrepareListLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getPrepareListNodesCompartmentFigure() {
			return fPrepareListNodesCompartmentFigure;
		}

	}

}
