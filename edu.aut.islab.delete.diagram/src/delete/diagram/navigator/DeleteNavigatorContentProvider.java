/*
* 
*/
package delete.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import delete.diagram.edit.parts.CallSurfaceQuery2EditPart;
import delete.diagram.edit.parts.CallSurfaceQuery3EditPart;
import delete.diagram.edit.parts.CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart;
import delete.diagram.edit.parts.CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart;
import delete.diagram.edit.parts.CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart;
import delete.diagram.edit.parts.CallSurfaceQueryEditPart;
import delete.diagram.edit.parts.ConditionInstalmentConditionInstalmentPartsCompartmentEditPart;
import delete.diagram.edit.parts.ConditionInstalmentEditPart;
import delete.diagram.edit.parts.DeleteSurfaceEditPart;
import delete.diagram.edit.parts.DummyDummyPartsCompartmentEditPart;
import delete.diagram.edit.parts.DummyEditPart;
import delete.diagram.edit.parts.EqualLinkEditPart;
import delete.diagram.edit.parts.Field2EditPart;
import delete.diagram.edit.parts.Field3EditPart;
import delete.diagram.edit.parts.Field4EditPart;
import delete.diagram.edit.parts.FieldEditPart;
import delete.diagram.edit.parts.FieldSPointerEditPart;
import delete.diagram.edit.parts.FullOuterJoinRelsEditPart;
import delete.diagram.edit.parts.Function2EditPart;
import delete.diagram.edit.parts.Function3EditPart;
import delete.diagram.edit.parts.FunctionEditPart;
import delete.diagram.edit.parts.FunctionFunctionParamsCompartment2EditPart;
import delete.diagram.edit.parts.FunctionFunctionParamsCompartment3EditPart;
import delete.diagram.edit.parts.FunctionFunctionParamsCompartmentEditPart;
import delete.diagram.edit.parts.GreaterEqualThanLinkEditPart;
import delete.diagram.edit.parts.GreaterThanLinkEditPart;
import delete.diagram.edit.parts.InLinkEditPart;
import delete.diagram.edit.parts.InnerjoinRelsEditPart;
import delete.diagram.edit.parts.Input2EditPart;
import delete.diagram.edit.parts.Input3EditPart;
import delete.diagram.edit.parts.InputBitsDefEditPart;
import delete.diagram.edit.parts.InputDateDefEditPart;
import delete.diagram.edit.parts.InputEditPart;
import delete.diagram.edit.parts.InputFloatDefEditPart;
import delete.diagram.edit.parts.InputInstalmentEditPart;
import delete.diagram.edit.parts.InputInstalmentInputInstalmentInputsCompartmentEditPart;
import delete.diagram.edit.parts.InputIntDefEditPart;
import delete.diagram.edit.parts.InputStringDefEditPart;
import delete.diagram.edit.parts.JuncRelationshipEditPart;
import delete.diagram.edit.parts.JunctionEditPart;
import delete.diagram.edit.parts.LeftOuterJoinRelsEditPart;
import delete.diagram.edit.parts.LikeLinkEditPart;
import delete.diagram.edit.parts.Literal2EditPart;
import delete.diagram.edit.parts.Literal3EditPart;
import delete.diagram.edit.parts.LiteralEditPart;
import delete.diagram.edit.parts.LowerEqualThanLinkEditPart;
import delete.diagram.edit.parts.LowerThanLinkEditPart;
import delete.diagram.edit.parts.MyTable2EditPart;
import delete.diagram.edit.parts.MyTableEditPart;
import delete.diagram.edit.parts.MyTableMyTableFieldsCompartment2EditPart;
import delete.diagram.edit.parts.MyTableMyTableFieldsCompartmentEditPart;
import delete.diagram.edit.parts.NullLiteral2EditPart;
import delete.diagram.edit.parts.NullLiteral3EditPart;
import delete.diagram.edit.parts.NullLiteralEditPart;
import delete.diagram.edit.parts.RightOuterJoinRelsEditPart;
import delete.diagram.edit.parts.RootJunctionEditPart;
import delete.diagram.edit.parts.SortInstalmentEditPart;
import delete.diagram.edit.parts.SortInstalmentSortInstalmentPointersCompartmentEditPart;
import delete.diagram.edit.parts.TableListInstalmentEditPart;
import delete.diagram.edit.parts.TableListInstalmentTableListInstalmentTablesCompartmentEditPart;
import delete.diagram.edit.parts.TermEditPart;
import delete.diagram.edit.parts.TermTermParamsCompartmentEditPart;
import delete.diagram.part.DeleteVisualIDRegistry;
import delete.diagram.part.Messages;

/**
 * @generated
 */
public class DeleteNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public DeleteNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<DeleteNavigatorItem> result = new ArrayList<DeleteNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(
					createNavigatorItems(selectViewsByType(topViews, DeleteSurfaceEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof DeleteNavigatorGroup) {
			DeleteNavigatorGroup group = (DeleteNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof DeleteNavigatorItem) {
			DeleteNavigatorItem navigatorItem = (DeleteNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (DeleteVisualIDRegistry.getVisualID(view)) {

		case DeleteSurfaceEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			DeleteNavigatorGroup links = new DeleteNavigatorGroup(Messages.NavigatorGroupName_DeleteSurface_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputInstalmentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(TableListInstalmentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(ConditionInstalmentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(SortInstalmentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(DummyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InnerjoinRelsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LeftOuterJoinRelsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(RightOuterJoinRelsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FullOuterJoinRelsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(JuncRelationshipEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case InputInstalmentEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(InputStringDefEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(InputIntDefEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(InputDateDefEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(InputBitsDefEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(InputFloatDefEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case TableListInstalmentEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(TableListInstalmentTableListInstalmentTablesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(MyTableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ConditionInstalmentEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(ConditionInstalmentConditionInstalmentPartsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(RootJunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(ConditionInstalmentConditionInstalmentPartsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(JunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(ConditionInstalmentConditionInstalmentPartsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DeleteVisualIDRegistry.getType(TermEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case SortInstalmentEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(SortInstalmentSortInstalmentPointersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(FieldSPointerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case DummyEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(DummyDummyPartsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(DummyDummyPartsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(DummyDummyPartsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(DummyDummyPartsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(DummyDummyPartsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(DummyDummyPartsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(DummyDummyPartsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(MyTable2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Field3EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Field_3012_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Field_3012_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InnerjoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InnerjoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LeftOuterJoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LeftOuterJoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(RightOuterJoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(RightOuterJoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FullOuterJoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FullOuterJoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CallSurfaceQuery2EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_CallSurfaceQuery_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_CallSurfaceQuery_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Field2EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Field_3015_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Field_3015_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InnerjoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InnerjoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LeftOuterJoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LeftOuterJoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(RightOuterJoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(RightOuterJoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FullOuterJoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FullOuterJoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LiteralEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Literal_3016_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Literal_3016_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NullLiteralEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_NullLiteral_3017_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_NullLiteral_3017_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FunctionEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Function_3018_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Function_3018_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InputEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Input_3019_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Input_3019_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CallSurfaceQueryEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_CallSurfaceQuery_3025_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_CallSurfaceQuery_3025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Literal2EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Literal_3026_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Literal_3026_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NullLiteral2EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_NullLiteral_3027_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_NullLiteral_3027_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Function2EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Function_3028_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Function_3028_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Input2EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Input_3029_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Input_3029_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RootJunctionEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_RootJunction_3040_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_RootJunction_3040_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(JuncRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(JuncRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case JunctionEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Junction_3041_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Junction_3041_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(JuncRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(JuncRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TermEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Term_3042_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(TermTermParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(TermTermParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(TermTermParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(TermTermParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(TermTermParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(TermTermParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(JuncRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CallSurfaceQuery3EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_CallSurfaceQuery_3044_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_CallSurfaceQuery_3044_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DeleteVisualIDRegistry
					.getType(CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Field4EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Field_3045_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Field_3045_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InnerjoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InnerjoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LeftOuterJoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LeftOuterJoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(RightOuterJoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(RightOuterJoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FullOuterJoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FullOuterJoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Literal3EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Literal_3046_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Literal_3046_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NullLiteral3EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_NullLiteral_3047_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_NullLiteral_3047_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Function3EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Function_3048_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Function_3048_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionFunctionParamsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Input3EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Input_3049_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Input_3049_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MyTableEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(MyTableMyTableFieldsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case FieldEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeleteNavigatorGroup incominglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Field_3052_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup outgoinglinks = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_Field_3052_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InnerjoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InnerjoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LeftOuterJoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LeftOuterJoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(RightOuterJoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(RightOuterJoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FullOuterJoinRelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FullOuterJoinRelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(EqualLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(GreaterEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LowerEqualThanLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LikeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MyTable2EditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(MyTableMyTableFieldsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case InnerjoinRelsEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeleteNavigatorGroup target = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_InnerjoinRels_4001_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup source = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_InnerjoinRels_4001_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case LeftOuterJoinRelsEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeleteNavigatorGroup target = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_LeftOuterJoinRels_4002_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup source = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_LeftOuterJoinRels_4002_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RightOuterJoinRelsEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeleteNavigatorGroup target = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_RightOuterJoinRels_4003_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup source = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_RightOuterJoinRels_4003_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case FullOuterJoinRelsEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeleteNavigatorGroup target = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_FullOuterJoinRels_4004_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup source = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_FullOuterJoinRels_4004_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EqualLinkEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeleteNavigatorGroup target = new DeleteNavigatorGroup(Messages.NavigatorGroupName_EqualLink_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeleteNavigatorGroup source = new DeleteNavigatorGroup(Messages.NavigatorGroupName_EqualLink_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GreaterThanLinkEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeleteNavigatorGroup target = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_GreaterThanLink_4007_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup source = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_GreaterThanLink_4007_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GreaterEqualThanLinkEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeleteNavigatorGroup target = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_GreaterEqualThanLink_4008_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup source = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_GreaterEqualThanLink_4008_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case LowerThanLinkEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeleteNavigatorGroup target = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_LowerThanLink_4009_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup source = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_LowerThanLink_4009_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case LowerEqualThanLinkEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeleteNavigatorGroup target = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_LowerEqualThanLink_4010_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup source = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_LowerEqualThanLink_4010_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InLinkEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeleteNavigatorGroup target = new DeleteNavigatorGroup(Messages.NavigatorGroupName_InLink_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeleteNavigatorGroup source = new DeleteNavigatorGroup(Messages.NavigatorGroupName_InLink_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case LikeLinkEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeleteNavigatorGroup target = new DeleteNavigatorGroup(Messages.NavigatorGroupName_LikeLink_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeleteNavigatorGroup source = new DeleteNavigatorGroup(Messages.NavigatorGroupName_LikeLink_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FieldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQueryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(LiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteralEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(CallSurfaceQuery3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Field4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Literal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(NullLiteral3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Function3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case JuncRelationshipEditPart.VISUAL_ID: {
			LinkedList<DeleteAbstractNavigatorItem> result = new LinkedList<DeleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeleteNavigatorGroup target = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_JuncRelationship_4013_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DeleteNavigatorGroup source = new DeleteNavigatorGroup(
					Messages.NavigatorGroupName_JuncRelationship_4013_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(RootJunctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(JunctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(TermEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(RootJunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeleteVisualIDRegistry.getType(JunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DeleteSurfaceEditPart.MODEL_ID.equals(DeleteVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<DeleteNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<DeleteNavigatorItem> result = new ArrayList<DeleteNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new DeleteNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<DeleteNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof DeleteAbstractNavigatorItem) {
			DeleteAbstractNavigatorItem abstractNavigatorItem = (DeleteAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
