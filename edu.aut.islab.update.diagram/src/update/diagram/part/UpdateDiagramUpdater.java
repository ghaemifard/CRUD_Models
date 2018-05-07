/*
* 
*/
package update.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import update.AbstractConditionElement;
import update.CallSurfaceQuery;
import update.ConditionInstalment;
import update.ConditionLink;
import update.EqualLink;
import update.Field;
import update.FieldSPointer;
import update.FullOuterJoinRels;
import update.Function;
import update.GreaterEqualThanLink;
import update.GreaterThanLink;
import update.InLink;
import update.InnerjoinRels;
import update.Input;
import update.InputDef;
import update.InputInstalment;
import update.JuncRelationship;
import update.Junction;
import update.LeftOuterJoinRels;
import update.LikeLink;
import update.LinkField;
import update.Literal;
import update.LowerEqualThanLink;
import update.LowerThanLink;
import update.MyTable;
import update.Node;
import update.NullLiteral;
import update.PrepareList;
import update.RealField;
import update.RightOuterJoinRels;
import update.RootJunction;
import update.SortInstalment;
import update.TableSelection;
import update.Term;
import update.UpdatePackage;
import update.UpdateSurface;
import update.diagram.edit.parts.CallSurfaceQuery2EditPart;
import update.diagram.edit.parts.CallSurfaceQuery3EditPart;
import update.diagram.edit.parts.CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart;
import update.diagram.edit.parts.CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart;
import update.diagram.edit.parts.CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart;
import update.diagram.edit.parts.CallSurfaceQueryEditPart;
import update.diagram.edit.parts.ConditionInstalmentConditionInstalmentPartsCompartmentEditPart;
import update.diagram.edit.parts.ConditionInstalmentEditPart;
import update.diagram.edit.parts.EqualLinkEditPart;
import update.diagram.edit.parts.Field2EditPart;
import update.diagram.edit.parts.Field3EditPart;
import update.diagram.edit.parts.FieldEditPart;
import update.diagram.edit.parts.FieldSPointerEditPart;
import update.diagram.edit.parts.FullOuterJoinRelsEditPart;
import update.diagram.edit.parts.Function2EditPart;
import update.diagram.edit.parts.Function3EditPart;
import update.diagram.edit.parts.FunctionEditPart;
import update.diagram.edit.parts.FunctionFunctionParamsCompartment2EditPart;
import update.diagram.edit.parts.FunctionFunctionParamsCompartment3EditPart;
import update.diagram.edit.parts.FunctionFunctionParamsCompartmentEditPart;
import update.diagram.edit.parts.GreaterEqualThanLinkEditPart;
import update.diagram.edit.parts.GreaterThanLinkEditPart;
import update.diagram.edit.parts.InLinkEditPart;
import update.diagram.edit.parts.InnerjoinRelsEditPart;
import update.diagram.edit.parts.Input2EditPart;
import update.diagram.edit.parts.Input3EditPart;
import update.diagram.edit.parts.InputBitsDefEditPart;
import update.diagram.edit.parts.InputDateDefEditPart;
import update.diagram.edit.parts.InputEditPart;
import update.diagram.edit.parts.InputFloatDefEditPart;
import update.diagram.edit.parts.InputInstalmentEditPart;
import update.diagram.edit.parts.InputInstalmentInputInstalmentInputsCompartmentEditPart;
import update.diagram.edit.parts.InputIntDefEditPart;
import update.diagram.edit.parts.InputStringDefEditPart;
import update.diagram.edit.parts.JuncRelationshipEditPart;
import update.diagram.edit.parts.JunctionEditPart;
import update.diagram.edit.parts.LeftOuterJoinRelsEditPart;
import update.diagram.edit.parts.LikeLinkEditPart;
import update.diagram.edit.parts.LinkFieldEditPart;
import update.diagram.edit.parts.Literal2EditPart;
import update.diagram.edit.parts.Literal3EditPart;
import update.diagram.edit.parts.LiteralEditPart;
import update.diagram.edit.parts.LowerEqualThanLinkEditPart;
import update.diagram.edit.parts.LowerThanLinkEditPart;
import update.diagram.edit.parts.MyTableEditPart;
import update.diagram.edit.parts.MyTableMyTableFakesCompartmentEditPart;
import update.diagram.edit.parts.NullLiteral2EditPart;
import update.diagram.edit.parts.NullLiteral3EditPart;
import update.diagram.edit.parts.NullLiteralEditPart;
import update.diagram.edit.parts.PrepareListEditPart;
import update.diagram.edit.parts.PrepareListPrepareListNodesCompartmentEditPart;
import update.diagram.edit.parts.RealFieldEditPart;
import update.diagram.edit.parts.RightOuterJoinRelsEditPart;
import update.diagram.edit.parts.RootJunctionEditPart;
import update.diagram.edit.parts.SortInstalmentEditPart;
import update.diagram.edit.parts.SortInstalmentSortInstalmentPointersCompartmentEditPart;
import update.diagram.edit.parts.TableSelectionEditPart;
import update.diagram.edit.parts.TableSelectionTableSelectionTablesCompartmentEditPart;
import update.diagram.edit.parts.TermEditPart;
import update.diagram.edit.parts.TermTermParamsCompartmentEditPart;
import update.diagram.edit.parts.UpdateSurfaceEditPart;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class UpdateDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getSemanticChildren(View view) {
		switch (UpdateVisualIDRegistry.getVisualID(view)) {
		case UpdateSurfaceEditPart.VISUAL_ID:
			return getUpdateSurface_1000SemanticChildren(view);
		case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
			return getInputInstalmentInputInstalmentInputsCompartment_7001SemanticChildren(view);
		case PrepareListPrepareListNodesCompartmentEditPart.VISUAL_ID:
			return getPrepareListPrepareListNodesCompartment_7002SemanticChildren(view);
		case CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID:
			return getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7003SemanticChildren(view);
		case CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID:
			return getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7004SemanticChildren(view);
		case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionParamsCompartment_7005SemanticChildren(view);
		case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
			return getFunctionFunctionParamsCompartment_7006SemanticChildren(view);
		case TableSelectionTableSelectionTablesCompartmentEditPart.VISUAL_ID:
			return getTableSelectionTableSelectionTablesCompartment_7011SemanticChildren(view);
		case MyTableMyTableFakesCompartmentEditPart.VISUAL_ID:
			return getMyTableMyTableFakesCompartment_7012SemanticChildren(view);
		case SortInstalmentSortInstalmentPointersCompartmentEditPart.VISUAL_ID:
			return getSortInstalmentSortInstalmentPointersCompartment_7013SemanticChildren(view);
		case ConditionInstalmentConditionInstalmentPartsCompartmentEditPart.VISUAL_ID:
			return getConditionInstalmentConditionInstalmentPartsCompartment_7007SemanticChildren(view);
		case TermTermParamsCompartmentEditPart.VISUAL_ID:
			return getTermTermParamsCompartment_7008SemanticChildren(view);
		case CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart.VISUAL_ID:
			return getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7009SemanticChildren(view);
		case FunctionFunctionParamsCompartment3EditPart.VISUAL_ID:
			return getFunctionFunctionParamsCompartment_7010SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getUpdateSurface_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		UpdateSurface modelElement = (UpdateSurface) view.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		{
			InputInstalment childElement = modelElement.getInputInstalment();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputInstalmentEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
			}
		}
		{
			PrepareList childElement = modelElement.getPrepareList();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PrepareListEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
			}
		}
		{
			TableSelection childElement = modelElement.getTableInstalment();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TableSelectionEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
			}
		}
		{
			SortInstalment childElement = modelElement.getSortInstalment();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SortInstalmentEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
			}
		}
		{
			ConditionInstalment childElement = modelElement.getWhereInstalment();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConditionInstalmentEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getInputInstalmentInputInstalmentInputsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InputInstalment modelElement = (InputInstalment) containerView.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputDef childElement = (InputDef) it.next();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputStringDefEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputIntDefEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputDateDefEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputBitsDefEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputFloatDefEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getPrepareListPrepareListNodesCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PrepareList modelElement = (PrepareList) containerView.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQueryEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Literal2EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteral2EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Function2EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input2EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CallSurfaceQuery modelElement = (CallSurfaceQuery) containerView.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CallSurfaceQuery modelElement = (CallSurfaceQuery) containerView.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getFunctionFunctionParamsCompartment_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getFunctionFunctionParamsCompartment_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getTableSelectionTableSelectionTablesCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TableSelection modelElement = (TableSelection) containerView.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTables().iterator(); it.hasNext();) {
			MyTable childElement = (MyTable) it.next();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MyTableEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getMyTableMyTableFakesCompartment_7012SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MyTable modelElement = (MyTable) containerView.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFakes().iterator(); it.hasNext();) {
			RealField childElement = (RealField) it.next();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RealFieldEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getSortInstalmentSortInstalmentPointersCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SortInstalment modelElement = (SortInstalment) containerView.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPointers().iterator(); it.hasNext();) {
			FieldSPointer childElement = (FieldSPointer) it.next();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FieldSPointerEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getConditionInstalmentConditionInstalmentPartsCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionInstalment modelElement = (ConditionInstalment) containerView.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParts().iterator(); it.hasNext();) {
			AbstractConditionElement childElement = (AbstractConditionElement) it.next();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RootJunctionEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JunctionEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TermEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getTermTermParamsCompartment_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Term modelElement = (Term) containerView.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery3EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field3EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Literal3EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteral3EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Function3EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input3EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CallSurfaceQuery modelElement = (CallSurfaceQuery) containerView.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateNodeDescriptor> getFunctionFunctionParamsCompartment_7010SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<UpdateNodeDescriptor> result = new LinkedList<UpdateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = UpdateVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new UpdateNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UpdateLinkDescriptor> getContainedLinks(View view) {
		switch (UpdateVisualIDRegistry.getVisualID(view)) {
		case UpdateSurfaceEditPart.VISUAL_ID:
			return getUpdateSurface_1000ContainedLinks(view);
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2001ContainedLinks(view);
		case PrepareListEditPart.VISUAL_ID:
			return getPrepareList_2002ContainedLinks(view);
		case TableSelectionEditPart.VISUAL_ID:
			return getTableSelection_2003ContainedLinks(view);
		case SortInstalmentEditPart.VISUAL_ID:
			return getSortInstalment_2005ContainedLinks(view);
		case ConditionInstalmentEditPart.VISUAL_ID:
			return getConditionInstalment_2004ContainedLinks(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3001ContainedLinks(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3002ContainedLinks(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3003ContainedLinks(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3004ContainedLinks(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3028ContainedLinks(view);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getCallSurfaceQuery_3005ContainedLinks(view);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3006ContainedLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3007ContainedLinks(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3008ContainedLinks(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3009ContainedLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3010ContainedLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3011ContainedLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3012ContainedLinks(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3013ContainedLinks(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3014ContainedLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3015ContainedLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3016ContainedLinks(view);
		case MyTableEditPart.VISUAL_ID:
			return getMyTable_3026ContainedLinks(view);
		case RealFieldEditPart.VISUAL_ID:
			return getRealField_3029ContainedLinks(view);
		case FieldSPointerEditPart.VISUAL_ID:
			return getFieldSPointer_3030ContainedLinks(view);
		case RootJunctionEditPart.VISUAL_ID:
			return getRootJunction_3031ContainedLinks(view);
		case JunctionEditPart.VISUAL_ID:
			return getJunction_3032ContainedLinks(view);
		case TermEditPart.VISUAL_ID:
			return getTerm_3019ContainedLinks(view);
		case CallSurfaceQuery3EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3020ContainedLinks(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3021ContainedLinks(view);
		case Literal3EditPart.VISUAL_ID:
			return getLiteral_3022ContainedLinks(view);
		case NullLiteral3EditPart.VISUAL_ID:
			return getNullLiteral_3023ContainedLinks(view);
		case Function3EditPart.VISUAL_ID:
			return getFunction_3024ContainedLinks(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3025ContainedLinks(view);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getInnerjoinRels_4010ContainedLinks(view);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getLeftOuterJoinRels_4011ContainedLinks(view);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getRightOuterJoinRels_4012ContainedLinks(view);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getFullOuterJoinRels_4013ContainedLinks(view);
		case EqualLinkEditPart.VISUAL_ID:
			return getEqualLink_4001ContainedLinks(view);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getGreaterThanLink_4002ContainedLinks(view);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getGreaterEqualThanLink_4003ContainedLinks(view);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getLowerThanLink_4004ContainedLinks(view);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getLowerEqualThanLink_4005ContainedLinks(view);
		case InLinkEditPart.VISUAL_ID:
			return getInLink_4006ContainedLinks(view);
		case LikeLinkEditPart.VISUAL_ID:
			return getLikeLink_4007ContainedLinks(view);
		case LinkFieldEditPart.VISUAL_ID:
			return getLinkField_4008ContainedLinks(view);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getJuncRelationship_4014ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UpdateLinkDescriptor> getIncomingLinks(View view) {
		switch (UpdateVisualIDRegistry.getVisualID(view)) {
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2001IncomingLinks(view);
		case PrepareListEditPart.VISUAL_ID:
			return getPrepareList_2002IncomingLinks(view);
		case TableSelectionEditPart.VISUAL_ID:
			return getTableSelection_2003IncomingLinks(view);
		case SortInstalmentEditPart.VISUAL_ID:
			return getSortInstalment_2005IncomingLinks(view);
		case ConditionInstalmentEditPart.VISUAL_ID:
			return getConditionInstalment_2004IncomingLinks(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3001IncomingLinks(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3002IncomingLinks(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3003IncomingLinks(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3004IncomingLinks(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3028IncomingLinks(view);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getCallSurfaceQuery_3005IncomingLinks(view);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3006IncomingLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3007IncomingLinks(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3008IncomingLinks(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3009IncomingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3010IncomingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3011IncomingLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3012IncomingLinks(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3013IncomingLinks(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3014IncomingLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3015IncomingLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3016IncomingLinks(view);
		case MyTableEditPart.VISUAL_ID:
			return getMyTable_3026IncomingLinks(view);
		case RealFieldEditPart.VISUAL_ID:
			return getRealField_3029IncomingLinks(view);
		case FieldSPointerEditPart.VISUAL_ID:
			return getFieldSPointer_3030IncomingLinks(view);
		case RootJunctionEditPart.VISUAL_ID:
			return getRootJunction_3031IncomingLinks(view);
		case JunctionEditPart.VISUAL_ID:
			return getJunction_3032IncomingLinks(view);
		case TermEditPart.VISUAL_ID:
			return getTerm_3019IncomingLinks(view);
		case CallSurfaceQuery3EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3020IncomingLinks(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3021IncomingLinks(view);
		case Literal3EditPart.VISUAL_ID:
			return getLiteral_3022IncomingLinks(view);
		case NullLiteral3EditPart.VISUAL_ID:
			return getNullLiteral_3023IncomingLinks(view);
		case Function3EditPart.VISUAL_ID:
			return getFunction_3024IncomingLinks(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3025IncomingLinks(view);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getInnerjoinRels_4010IncomingLinks(view);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getLeftOuterJoinRels_4011IncomingLinks(view);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getRightOuterJoinRels_4012IncomingLinks(view);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getFullOuterJoinRels_4013IncomingLinks(view);
		case EqualLinkEditPart.VISUAL_ID:
			return getEqualLink_4001IncomingLinks(view);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getGreaterThanLink_4002IncomingLinks(view);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getGreaterEqualThanLink_4003IncomingLinks(view);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getLowerThanLink_4004IncomingLinks(view);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getLowerEqualThanLink_4005IncomingLinks(view);
		case InLinkEditPart.VISUAL_ID:
			return getInLink_4006IncomingLinks(view);
		case LikeLinkEditPart.VISUAL_ID:
			return getLikeLink_4007IncomingLinks(view);
		case LinkFieldEditPart.VISUAL_ID:
			return getLinkField_4008IncomingLinks(view);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getJuncRelationship_4014IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UpdateLinkDescriptor> getOutgoingLinks(View view) {
		switch (UpdateVisualIDRegistry.getVisualID(view)) {
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2001OutgoingLinks(view);
		case PrepareListEditPart.VISUAL_ID:
			return getPrepareList_2002OutgoingLinks(view);
		case TableSelectionEditPart.VISUAL_ID:
			return getTableSelection_2003OutgoingLinks(view);
		case SortInstalmentEditPart.VISUAL_ID:
			return getSortInstalment_2005OutgoingLinks(view);
		case ConditionInstalmentEditPart.VISUAL_ID:
			return getConditionInstalment_2004OutgoingLinks(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3001OutgoingLinks(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3002OutgoingLinks(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3003OutgoingLinks(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3004OutgoingLinks(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3028OutgoingLinks(view);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getCallSurfaceQuery_3005OutgoingLinks(view);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3006OutgoingLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3007OutgoingLinks(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3008OutgoingLinks(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3009OutgoingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3010OutgoingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3011OutgoingLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3012OutgoingLinks(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3013OutgoingLinks(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3014OutgoingLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3015OutgoingLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3016OutgoingLinks(view);
		case MyTableEditPart.VISUAL_ID:
			return getMyTable_3026OutgoingLinks(view);
		case RealFieldEditPart.VISUAL_ID:
			return getRealField_3029OutgoingLinks(view);
		case FieldSPointerEditPart.VISUAL_ID:
			return getFieldSPointer_3030OutgoingLinks(view);
		case RootJunctionEditPart.VISUAL_ID:
			return getRootJunction_3031OutgoingLinks(view);
		case JunctionEditPart.VISUAL_ID:
			return getJunction_3032OutgoingLinks(view);
		case TermEditPart.VISUAL_ID:
			return getTerm_3019OutgoingLinks(view);
		case CallSurfaceQuery3EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3020OutgoingLinks(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3021OutgoingLinks(view);
		case Literal3EditPart.VISUAL_ID:
			return getLiteral_3022OutgoingLinks(view);
		case NullLiteral3EditPart.VISUAL_ID:
			return getNullLiteral_3023OutgoingLinks(view);
		case Function3EditPart.VISUAL_ID:
			return getFunction_3024OutgoingLinks(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3025OutgoingLinks(view);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getInnerjoinRels_4010OutgoingLinks(view);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getLeftOuterJoinRels_4011OutgoingLinks(view);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getRightOuterJoinRels_4012OutgoingLinks(view);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getFullOuterJoinRels_4013OutgoingLinks(view);
		case EqualLinkEditPart.VISUAL_ID:
			return getEqualLink_4001OutgoingLinks(view);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getGreaterThanLink_4002OutgoingLinks(view);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getGreaterEqualThanLink_4003OutgoingLinks(view);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getLowerThanLink_4004OutgoingLinks(view);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getLowerEqualThanLink_4005OutgoingLinks(view);
		case InLinkEditPart.VISUAL_ID:
			return getInLink_4006OutgoingLinks(view);
		case LikeLinkEditPart.VISUAL_ID:
			return getLikeLink_4007OutgoingLinks(view);
		case LinkFieldEditPart.VISUAL_ID:
			return getLinkField_4008OutgoingLinks(view);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getJuncRelationship_4014OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getUpdateSurface_1000ContainedLinks(View view) {
		UpdateSurface modelElement = (UpdateSurface) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_LinkField_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputInstalment_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getPrepareList_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getTableSelection_2003ContainedLinks(View view) {
		TableSelection modelElement = (TableSelection) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InnerjoinRels_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LeftOuterJoinRels_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RightOuterJoinRels_4012(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_FullOuterJoinRels_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getSortInstalment_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getConditionInstalment_2004ContainedLinks(View view) {
		ConditionInstalment modelElement = (ConditionInstalment) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_JuncRelationship_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputStringDef_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputIntDef_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputDateDef_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputBitsDef_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputFloatDef_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getCallSurfaceQuery_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getCallSurfaceQuery_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getField_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLiteral_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getNullLiteral_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFunction_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInput_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getField_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLiteral_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getNullLiteral_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFunction_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInput_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getMyTable_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getRealField_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFieldSPointer_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getRootJunction_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getJunction_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getTerm_3019ContainedLinks(View view) {
		Term modelElement = (Term) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getCallSurfaceQuery_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getField_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLiteral_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getNullLiteral_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFunction_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInput_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInnerjoinRels_4010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLeftOuterJoinRels_4011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getRightOuterJoinRels_4012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFullOuterJoinRels_4013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getEqualLink_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getGreaterThanLink_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getGreaterEqualThanLink_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLowerThanLink_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLowerEqualThanLink_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInLink_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLikeLink_4007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLinkField_4008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getJuncRelationship_4014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputInstalment_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getPrepareList_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getTableSelection_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getSortInstalment_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getConditionInstalment_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputStringDef_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputIntDef_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputDateDef_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputBitsDef_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputFloatDef_3028IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getCallSurfaceQuery_3005IncomingLinks(View view) {
		CallSurfaceQuery modelElement = (CallSurfaceQuery) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getCallSurfaceQuery_3006IncomingLinks(View view) {
		CallSurfaceQuery modelElement = (CallSurfaceQuery) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getField_3007IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLiteral_3008IncomingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getNullLiteral_3009IncomingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFunction_3010IncomingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInput_3011IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getField_3012IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLiteral_3013IncomingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getNullLiteral_3014IncomingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFunction_3015IncomingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInput_3016IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getMyTable_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getRealField_3029IncomingLinks(View view) {
		RealField modelElement = (RealField) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InnerjoinRels_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LeftOuterJoinRels_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RightOuterJoinRels_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FullOuterJoinRels_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFieldSPointer_3030IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getRootJunction_3031IncomingLinks(View view) {
		RootJunction modelElement = (RootJunction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JuncRelationship_4014(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getJunction_3032IncomingLinks(View view) {
		Junction modelElement = (Junction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JuncRelationship_4014(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getTerm_3019IncomingLinks(View view) {
		Term modelElement = (Term) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JuncRelationship_4014(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getCallSurfaceQuery_3020IncomingLinks(View view) {
		CallSurfaceQuery modelElement = (CallSurfaceQuery) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getField_3021IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLiteral_3022IncomingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getNullLiteral_3023IncomingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFunction_3024IncomingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInput_3025IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkField_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInnerjoinRels_4010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLeftOuterJoinRels_4011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getRightOuterJoinRels_4012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFullOuterJoinRels_4013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getEqualLink_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getGreaterThanLink_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getGreaterEqualThanLink_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLowerThanLink_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLowerEqualThanLink_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInLink_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLikeLink_4007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLinkField_4008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getJuncRelationship_4014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputInstalment_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getPrepareList_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getTableSelection_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getSortInstalment_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getConditionInstalment_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputStringDef_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputIntDef_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputDateDef_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputBitsDef_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInputFloatDef_3028OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getCallSurfaceQuery_3005OutgoingLinks(View view) {
		CallSurfaceQuery modelElement = (CallSurfaceQuery) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getCallSurfaceQuery_3006OutgoingLinks(View view) {
		CallSurfaceQuery modelElement = (CallSurfaceQuery) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getField_3007OutgoingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLiteral_3008OutgoingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getNullLiteral_3009OutgoingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFunction_3010OutgoingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInput_3011OutgoingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getField_3012OutgoingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLiteral_3013OutgoingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getNullLiteral_3014OutgoingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFunction_3015OutgoingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInput_3016OutgoingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getMyTable_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getRealField_3029OutgoingLinks(View view) {
		RealField modelElement = (RealField) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InnerjoinRels_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LeftOuterJoinRels_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RightOuterJoinRels_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_FullOuterJoinRels_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkField_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFieldSPointer_3030OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getRootJunction_3031OutgoingLinks(View view) {
		RootJunction modelElement = (RootJunction) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_JuncRelationship_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getJunction_3032OutgoingLinks(View view) {
		Junction modelElement = (Junction) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_JuncRelationship_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getTerm_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getCallSurfaceQuery_3020OutgoingLinks(View view) {
		CallSurfaceQuery modelElement = (CallSurfaceQuery) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getField_3021OutgoingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLiteral_3022OutgoingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getNullLiteral_3023OutgoingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFunction_3024OutgoingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInput_3025OutgoingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInnerjoinRels_4010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLeftOuterJoinRels_4011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getRightOuterJoinRels_4012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getFullOuterJoinRels_4013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getEqualLink_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getGreaterThanLink_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getGreaterEqualThanLink_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLowerThanLink_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLowerEqualThanLink_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getInLink_4006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLikeLink_4007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getLinkField_4008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UpdateLinkDescriptor> getJuncRelationship_4014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getContainedTypeModelFacetLinks_InnerjoinRels_4010(
			TableSelection container) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InnerjoinRels) {
				continue;
			}
			InnerjoinRels link = (InnerjoinRels) linkObject;
			if (InnerjoinRelsEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RealField dst = link.getTarget();
			RealField src = link.getSource();
			result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.InnerjoinRels_4010,
					InnerjoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getContainedTypeModelFacetLinks_LeftOuterJoinRels_4011(
			TableSelection container) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LeftOuterJoinRels) {
				continue;
			}
			LeftOuterJoinRels link = (LeftOuterJoinRels) linkObject;
			if (LeftOuterJoinRelsEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RealField dst = link.getTarget();
			RealField src = link.getSource();
			result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.LeftOuterJoinRels_4011,
					LeftOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getContainedTypeModelFacetLinks_RightOuterJoinRels_4012(
			TableSelection container) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RightOuterJoinRels) {
				continue;
			}
			RightOuterJoinRels link = (RightOuterJoinRels) linkObject;
			if (RightOuterJoinRelsEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RealField dst = link.getTarget();
			RealField src = link.getSource();
			result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.RightOuterJoinRels_4012,
					RightOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getContainedTypeModelFacetLinks_FullOuterJoinRels_4013(
			TableSelection container) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof FullOuterJoinRels) {
				continue;
			}
			FullOuterJoinRels link = (FullOuterJoinRels) linkObject;
			if (FullOuterJoinRelsEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RealField dst = link.getTarget();
			RealField src = link.getSource();
			result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.FullOuterJoinRels_4013,
					FullOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getContainedTypeModelFacetLinks_EqualLink_4001(Term container) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof EqualLink) {
			return result;
		}
		EqualLink link = (EqualLink) linkObject;
		if (EqualLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.EqualLink_4001,
				EqualLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getContainedTypeModelFacetLinks_GreaterThanLink_4002(
			Term container) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof GreaterThanLink) {
			return result;
		}
		GreaterThanLink link = (GreaterThanLink) linkObject;
		if (GreaterThanLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.GreaterThanLink_4002,
				GreaterThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getContainedTypeModelFacetLinks_GreaterEqualThanLink_4003(
			Term container) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof GreaterEqualThanLink) {
			return result;
		}
		GreaterEqualThanLink link = (GreaterEqualThanLink) linkObject;
		if (GreaterEqualThanLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.GreaterEqualThanLink_4003,
				GreaterEqualThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getContainedTypeModelFacetLinks_LowerThanLink_4004(Term container) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LowerThanLink) {
			return result;
		}
		LowerThanLink link = (LowerThanLink) linkObject;
		if (LowerThanLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.LowerThanLink_4004,
				LowerThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getContainedTypeModelFacetLinks_LowerEqualThanLink_4005(
			Term container) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LowerEqualThanLink) {
			return result;
		}
		LowerEqualThanLink link = (LowerEqualThanLink) linkObject;
		if (LowerEqualThanLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.LowerEqualThanLink_4005,
				LowerEqualThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getContainedTypeModelFacetLinks_InLink_4006(Term container) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof InLink) {
			return result;
		}
		InLink link = (InLink) linkObject;
		if (InLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.InLink_4006, InLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getContainedTypeModelFacetLinks_LikeLink_4007(Term container) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LikeLink) {
			return result;
		}
		LikeLink link = (LikeLink) linkObject;
		if (LikeLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(
				new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.LikeLink_4007, LikeLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getContainedTypeModelFacetLinks_LinkField_4008(
			UpdateSurface container) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		for (Iterator<?> links = container.getLfs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkField) {
				continue;
			}
			LinkField link = (LinkField) linkObject;
			if (LinkFieldEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getDst();
			RealField src = link.getSrc();
			result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.LinkField_4008,
					LinkFieldEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getContainedTypeModelFacetLinks_JuncRelationship_4014(
			ConditionInstalment container) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof JuncRelationship) {
				continue;
			}
			JuncRelationship link = (JuncRelationship) linkObject;
			if (JuncRelationshipEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConditionElement dst = link.getTarget();
			Junction src = link.getSource();
			result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.JuncRelationship_4014,
					JuncRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UpdateLinkDescriptor> getIncomingTypeModelFacetLinks_InnerjoinRels_4010(RealField target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UpdatePackage.eINSTANCE.getRelationSelect_Target()
					|| false == setting.getEObject() instanceof InnerjoinRels) {
				continue;
			}
			InnerjoinRels link = (InnerjoinRels) setting.getEObject();
			if (InnerjoinRelsEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RealField src = link.getSource();
			result.add(new UpdateLinkDescriptor(src, target, link, UpdateElementTypes.InnerjoinRels_4010,
					InnerjoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UpdateLinkDescriptor> getIncomingTypeModelFacetLinks_LeftOuterJoinRels_4011(
			RealField target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UpdatePackage.eINSTANCE.getRelationSelect_Target()
					|| false == setting.getEObject() instanceof LeftOuterJoinRels) {
				continue;
			}
			LeftOuterJoinRels link = (LeftOuterJoinRels) setting.getEObject();
			if (LeftOuterJoinRelsEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RealField src = link.getSource();
			result.add(new UpdateLinkDescriptor(src, target, link, UpdateElementTypes.LeftOuterJoinRels_4011,
					LeftOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UpdateLinkDescriptor> getIncomingTypeModelFacetLinks_RightOuterJoinRels_4012(
			RealField target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UpdatePackage.eINSTANCE.getRelationSelect_Target()
					|| false == setting.getEObject() instanceof RightOuterJoinRels) {
				continue;
			}
			RightOuterJoinRels link = (RightOuterJoinRels) setting.getEObject();
			if (RightOuterJoinRelsEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RealField src = link.getSource();
			result.add(new UpdateLinkDescriptor(src, target, link, UpdateElementTypes.RightOuterJoinRels_4012,
					RightOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UpdateLinkDescriptor> getIncomingTypeModelFacetLinks_FullOuterJoinRels_4013(
			RealField target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UpdatePackage.eINSTANCE.getRelationSelect_Target()
					|| false == setting.getEObject() instanceof FullOuterJoinRels) {
				continue;
			}
			FullOuterJoinRels link = (FullOuterJoinRels) setting.getEObject();
			if (FullOuterJoinRelsEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RealField src = link.getSource();
			result.add(new UpdateLinkDescriptor(src, target, link, UpdateElementTypes.FullOuterJoinRels_4013,
					FullOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UpdateLinkDescriptor> getIncomingTypeModelFacetLinks_EqualLink_4001(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UpdatePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof EqualLink) {
				continue;
			}
			EqualLink link = (EqualLink) setting.getEObject();
			if (EqualLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new UpdateLinkDescriptor(src, target, link, UpdateElementTypes.EqualLink_4001,
					EqualLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UpdateLinkDescriptor> getIncomingTypeModelFacetLinks_GreaterThanLink_4002(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UpdatePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof GreaterThanLink) {
				continue;
			}
			GreaterThanLink link = (GreaterThanLink) setting.getEObject();
			if (GreaterThanLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new UpdateLinkDescriptor(src, target, link, UpdateElementTypes.GreaterThanLink_4002,
					GreaterThanLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UpdateLinkDescriptor> getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4003(
			Node target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UpdatePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof GreaterEqualThanLink) {
				continue;
			}
			GreaterEqualThanLink link = (GreaterEqualThanLink) setting.getEObject();
			if (GreaterEqualThanLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new UpdateLinkDescriptor(src, target, link, UpdateElementTypes.GreaterEqualThanLink_4003,
					GreaterEqualThanLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UpdateLinkDescriptor> getIncomingTypeModelFacetLinks_LowerThanLink_4004(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UpdatePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof LowerThanLink) {
				continue;
			}
			LowerThanLink link = (LowerThanLink) setting.getEObject();
			if (LowerThanLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new UpdateLinkDescriptor(src, target, link, UpdateElementTypes.LowerThanLink_4004,
					LowerThanLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UpdateLinkDescriptor> getIncomingTypeModelFacetLinks_LowerEqualThanLink_4005(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UpdatePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof LowerEqualThanLink) {
				continue;
			}
			LowerEqualThanLink link = (LowerEqualThanLink) setting.getEObject();
			if (LowerEqualThanLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new UpdateLinkDescriptor(src, target, link, UpdateElementTypes.LowerEqualThanLink_4005,
					LowerEqualThanLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UpdateLinkDescriptor> getIncomingTypeModelFacetLinks_InLink_4006(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UpdatePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof InLink) {
				continue;
			}
			InLink link = (InLink) setting.getEObject();
			if (InLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new UpdateLinkDescriptor(src, target, link, UpdateElementTypes.InLink_4006,
					InLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UpdateLinkDescriptor> getIncomingTypeModelFacetLinks_LikeLink_4007(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UpdatePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof LikeLink) {
				continue;
			}
			LikeLink link = (LikeLink) setting.getEObject();
			if (LikeLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new UpdateLinkDescriptor(src, target, link, UpdateElementTypes.LikeLink_4007,
					LikeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UpdateLinkDescriptor> getIncomingTypeModelFacetLinks_LinkField_4008(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UpdatePackage.eINSTANCE.getLinkField_Dst()
					|| false == setting.getEObject() instanceof LinkField) {
				continue;
			}
			LinkField link = (LinkField) setting.getEObject();
			if (LinkFieldEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RealField src = link.getSrc();
			result.add(new UpdateLinkDescriptor(src, target, link, UpdateElementTypes.LinkField_4008,
					LinkFieldEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UpdateLinkDescriptor> getIncomingTypeModelFacetLinks_JuncRelationship_4014(
			AbstractConditionElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UpdatePackage.eINSTANCE.getJuncRelationship_Target()
					|| false == setting.getEObject() instanceof JuncRelationship) {
				continue;
			}
			JuncRelationship link = (JuncRelationship) setting.getEObject();
			if (JuncRelationshipEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Junction src = link.getSource();
			result.add(new UpdateLinkDescriptor(src, target, link, UpdateElementTypes.JuncRelationship_4014,
					JuncRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getOutgoingTypeModelFacetLinks_InnerjoinRels_4010(
			RealField source) {
		TableSelection container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof TableSelection) {
				container = (TableSelection) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InnerjoinRels) {
				continue;
			}
			InnerjoinRels link = (InnerjoinRels) linkObject;
			if (InnerjoinRelsEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RealField dst = link.getTarget();
			RealField src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.InnerjoinRels_4010,
					InnerjoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getOutgoingTypeModelFacetLinks_LeftOuterJoinRels_4011(
			RealField source) {
		TableSelection container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof TableSelection) {
				container = (TableSelection) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LeftOuterJoinRels) {
				continue;
			}
			LeftOuterJoinRels link = (LeftOuterJoinRels) linkObject;
			if (LeftOuterJoinRelsEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RealField dst = link.getTarget();
			RealField src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.LeftOuterJoinRels_4011,
					LeftOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getOutgoingTypeModelFacetLinks_RightOuterJoinRels_4012(
			RealField source) {
		TableSelection container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof TableSelection) {
				container = (TableSelection) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RightOuterJoinRels) {
				continue;
			}
			RightOuterJoinRels link = (RightOuterJoinRels) linkObject;
			if (RightOuterJoinRelsEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RealField dst = link.getTarget();
			RealField src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.RightOuterJoinRels_4012,
					RightOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getOutgoingTypeModelFacetLinks_FullOuterJoinRels_4013(
			RealField source) {
		TableSelection container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof TableSelection) {
				container = (TableSelection) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof FullOuterJoinRels) {
				continue;
			}
			FullOuterJoinRels link = (FullOuterJoinRels) linkObject;
			if (FullOuterJoinRelsEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RealField dst = link.getTarget();
			RealField src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.FullOuterJoinRels_4013,
					FullOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getOutgoingTypeModelFacetLinks_EqualLink_4001(Node source) {
		Term container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Term) {
				container = (Term) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof EqualLink) {
			return result;
		}
		EqualLink link = (EqualLink) linkObject;
		if (EqualLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.EqualLink_4001,
				EqualLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getOutgoingTypeModelFacetLinks_GreaterThanLink_4002(Node source) {
		Term container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Term) {
				container = (Term) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof GreaterThanLink) {
			return result;
		}
		GreaterThanLink link = (GreaterThanLink) linkObject;
		if (GreaterThanLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.GreaterThanLink_4002,
				GreaterThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4003(
			Node source) {
		Term container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Term) {
				container = (Term) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof GreaterEqualThanLink) {
			return result;
		}
		GreaterEqualThanLink link = (GreaterEqualThanLink) linkObject;
		if (GreaterEqualThanLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.GreaterEqualThanLink_4003,
				GreaterEqualThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getOutgoingTypeModelFacetLinks_LowerThanLink_4004(Node source) {
		Term container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Term) {
				container = (Term) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LowerThanLink) {
			return result;
		}
		LowerThanLink link = (LowerThanLink) linkObject;
		if (LowerThanLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.LowerThanLink_4004,
				LowerThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4005(
			Node source) {
		Term container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Term) {
				container = (Term) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LowerEqualThanLink) {
			return result;
		}
		LowerEqualThanLink link = (LowerEqualThanLink) linkObject;
		if (LowerEqualThanLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.LowerEqualThanLink_4005,
				LowerEqualThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getOutgoingTypeModelFacetLinks_InLink_4006(Node source) {
		Term container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Term) {
				container = (Term) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof InLink) {
			return result;
		}
		InLink link = (InLink) linkObject;
		if (InLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.InLink_4006, InLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getOutgoingTypeModelFacetLinks_LikeLink_4007(Node source) {
		Term container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Term) {
				container = (Term) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LikeLink) {
			return result;
		}
		LikeLink link = (LikeLink) linkObject;
		if (LikeLinkEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(
				new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.LikeLink_4007, LikeLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkField_4008(RealField source) {
		UpdateSurface container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof UpdateSurface) {
				container = (UpdateSurface) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		for (Iterator<?> links = container.getLfs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkField) {
				continue;
			}
			LinkField link = (LinkField) linkObject;
			if (LinkFieldEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getDst();
			RealField src = link.getSrc();
			if (src != source) {
				continue;
			}
			result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.LinkField_4008,
					LinkFieldEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UpdateLinkDescriptor> getOutgoingTypeModelFacetLinks_JuncRelationship_4014(
			Junction source) {
		ConditionInstalment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ConditionInstalment) {
				container = (ConditionInstalment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UpdateLinkDescriptor> result = new LinkedList<UpdateLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof JuncRelationship) {
				continue;
			}
			JuncRelationship link = (JuncRelationship) linkObject;
			if (JuncRelationshipEditPart.VISUAL_ID != UpdateVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConditionElement dst = link.getTarget();
			Junction src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UpdateLinkDescriptor(src, dst, link, UpdateElementTypes.JuncRelationship_4014,
					JuncRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<UpdateNodeDescriptor> getSemanticChildren(View view) {
			return UpdateDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UpdateLinkDescriptor> getContainedLinks(View view) {
			return UpdateDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UpdateLinkDescriptor> getIncomingLinks(View view) {
			return UpdateDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UpdateLinkDescriptor> getOutgoingLinks(View view) {
			return UpdateDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
