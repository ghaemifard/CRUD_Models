/*
* 
*/
package query.diagram.part;

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

import query.AbstractConditionElement;
import query.AbstractNode;
import query.CallQuerySurface;
import query.ConditionInstalment;
import query.ConditionLink;
import query.EqualLink;
import query.Field;
import query.FieldGPointer;
import query.FieldSPointer;
import query.FullOuterJoinRels;
import query.Function;
import query.GreaterEqualThanLink;
import query.GreaterThanLink;
import query.GroupInstalment;
import query.HavingInstalment;
import query.InLink;
import query.InnerjoinRels;
import query.Input;
import query.InputDef;
import query.InputInstalment;
import query.JuncRelationship;
import query.Junction;
import query.LeftOuterJoinRels;
import query.LikeLink;
import query.Literal;
import query.LowerEqualThanLink;
import query.LowerThanLink;
import query.MyTable;
import query.Node;
import query.NullLiteral;
import query.OutputInstalment;
import query.QueryPackage;
import query.QuerySurface;
import query.RightOuterJoinRels;
import query.RootJunction;
import query.SortInstalment;
import query.Term;
import query.WhereInstalment;
import query.diagram.edit.parts.CallQuerySurface2EditPart;
import query.diagram.edit.parts.CallQuerySurface3EditPart;
import query.diagram.edit.parts.CallQuerySurfaceCallQuerySurfaceParamsCompartment2EditPart;
import query.diagram.edit.parts.CallQuerySurfaceCallQuerySurfaceParamsCompartment3EditPart;
import query.diagram.edit.parts.CallQuerySurfaceCallQuerySurfaceParamsCompartmentEditPart;
import query.diagram.edit.parts.CallQuerySurfaceEditPart;
import query.diagram.edit.parts.EqualLinkEditPart;
import query.diagram.edit.parts.Field2EditPart;
import query.diagram.edit.parts.Field3EditPart;
import query.diagram.edit.parts.Field4EditPart;
import query.diagram.edit.parts.FieldEditPart;
import query.diagram.edit.parts.FieldGPointerEditPart;
import query.diagram.edit.parts.FieldSPointerEditPart;
import query.diagram.edit.parts.FullOuterJoinRelsEditPart;
import query.diagram.edit.parts.Function2EditPart;
import query.diagram.edit.parts.Function3EditPart;
import query.diagram.edit.parts.FunctionEditPart;
import query.diagram.edit.parts.FunctionFunctionParamsCompartment2EditPart;
import query.diagram.edit.parts.FunctionFunctionParamsCompartment3EditPart;
import query.diagram.edit.parts.FunctionFunctionParamsCompartmentEditPart;
import query.diagram.edit.parts.GreaterEqualThanLinkEditPart;
import query.diagram.edit.parts.GreaterThanLinkEditPart;
import query.diagram.edit.parts.GroupInstalmentEditPart;
import query.diagram.edit.parts.GroupInstalmentGroupInstalmentPointersCompartmentEditPart;
import query.diagram.edit.parts.HavingInstalmentEditPart;
import query.diagram.edit.parts.HavingInstalmentHavingInstalmentPartsCompartmentEditPart;
import query.diagram.edit.parts.InLinkEditPart;
import query.diagram.edit.parts.InnerjoinRelsEditPart;
import query.diagram.edit.parts.Input2EditPart;
import query.diagram.edit.parts.Input3EditPart;
import query.diagram.edit.parts.InputBitsDefEditPart;
import query.diagram.edit.parts.InputDateDefEditPart;
import query.diagram.edit.parts.InputEditPart;
import query.diagram.edit.parts.InputFloatDefEditPart;
import query.diagram.edit.parts.InputInstalmentEditPart;
import query.diagram.edit.parts.InputInstalmentInputInstalmentInputsCompartmentEditPart;
import query.diagram.edit.parts.InputIntDefEditPart;
import query.diagram.edit.parts.InputStringDefEditPart;
import query.diagram.edit.parts.JuncRelationshipEditPart;
import query.diagram.edit.parts.JunctionEditPart;
import query.diagram.edit.parts.LeftOuterJoinRelsEditPart;
import query.diagram.edit.parts.LikeLinkEditPart;
import query.diagram.edit.parts.Literal2EditPart;
import query.diagram.edit.parts.Literal3EditPart;
import query.diagram.edit.parts.LiteralEditPart;
import query.diagram.edit.parts.LowerEqualThanLinkEditPart;
import query.diagram.edit.parts.LowerThanLinkEditPart;
import query.diagram.edit.parts.MyTableEditPart;
import query.diagram.edit.parts.MyTableMyTableFieldsCompartmentEditPart;
import query.diagram.edit.parts.NullLiteral2EditPart;
import query.diagram.edit.parts.NullLiteral3EditPart;
import query.diagram.edit.parts.NullLiteralEditPart;
import query.diagram.edit.parts.OutputInstalmentEditPart;
import query.diagram.edit.parts.OutputInstalmentOutputInstalmentNodesCompartmentEditPart;
import query.diagram.edit.parts.QuerySurfaceEditPart;
import query.diagram.edit.parts.RightOuterJoinRelsEditPart;
import query.diagram.edit.parts.RootJunctionEditPart;
import query.diagram.edit.parts.SortInstalmentEditPart;
import query.diagram.edit.parts.SortInstalmentSortInstalmentPointersCompartmentEditPart;
import query.diagram.edit.parts.TermEditPart;
import query.diagram.edit.parts.TermTermParamsCompartmentEditPart;
import query.diagram.edit.parts.WhereInstalmentEditPart;
import query.diagram.edit.parts.WhereInstalmentWhereInstalmentPartsCompartmentEditPart;
import query.diagram.providers.QueryElementTypes;

/**
 * @generated
 */
public class QueryDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getSemanticChildren(View view) {
		switch (QueryVisualIDRegistry.getVisualID(view)) {
		case QuerySurfaceEditPart.VISUAL_ID:
			return getQuerySurface_1000SemanticChildren(view);
		case WhereInstalmentWhereInstalmentPartsCompartmentEditPart.VISUAL_ID:
			return getWhereInstalmentWhereInstalmentPartsCompartment_7001SemanticChildren(view);
		case TermTermParamsCompartmentEditPart.VISUAL_ID:
			return getTermTermParamsCompartment_7002SemanticChildren(view);
		case CallQuerySurfaceCallQuerySurfaceParamsCompartmentEditPart.VISUAL_ID:
			return getCallQuerySurfaceCallQuerySurfaceParamsCompartment_7003SemanticChildren(view);
		case CallQuerySurfaceCallQuerySurfaceParamsCompartment2EditPart.VISUAL_ID:
			return getCallQuerySurfaceCallQuerySurfaceParamsCompartment_7004SemanticChildren(view);
		case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionParamsCompartment_7005SemanticChildren(view);
		case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
			return getFunctionFunctionParamsCompartment_7006SemanticChildren(view);
		case HavingInstalmentHavingInstalmentPartsCompartmentEditPart.VISUAL_ID:
			return getHavingInstalmentHavingInstalmentPartsCompartment_7007SemanticChildren(view);
		case OutputInstalmentOutputInstalmentNodesCompartmentEditPart.VISUAL_ID:
			return getOutputInstalmentOutputInstalmentNodesCompartment_7008SemanticChildren(view);
		case CallQuerySurfaceCallQuerySurfaceParamsCompartment3EditPart.VISUAL_ID:
			return getCallQuerySurfaceCallQuerySurfaceParamsCompartment_7009SemanticChildren(view);
		case FunctionFunctionParamsCompartment3EditPart.VISUAL_ID:
			return getFunctionFunctionParamsCompartment_7010SemanticChildren(view);
		case MyTableMyTableFieldsCompartmentEditPart.VISUAL_ID:
			return getMyTableMyTableFieldsCompartment_7011SemanticChildren(view);
		case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
			return getInputInstalmentInputInstalmentInputsCompartment_7012SemanticChildren(view);
		case GroupInstalmentGroupInstalmentPointersCompartmentEditPart.VISUAL_ID:
			return getGroupInstalmentGroupInstalmentPointersCompartment_7013SemanticChildren(view);
		case SortInstalmentSortInstalmentPointersCompartmentEditPart.VISUAL_ID:
			return getSortInstalmentSortInstalmentPointersCompartment_7014SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getQuerySurface_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		QuerySurface modelElement = (QuerySurface) view.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		{
			WhereInstalment childElement = modelElement.getWhereInstalment();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == WhereInstalmentEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
			}
		}
		{
			HavingInstalment childElement = modelElement.getHavingInstalment();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HavingInstalmentEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
			}
		}
		{
			OutputInstalment childElement = modelElement.getOutputInstalment();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputInstalmentEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
			}
		}
		{
			InputInstalment childElement = modelElement.getInputInstalment();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputInstalmentEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
			}
		}
		{
			GroupInstalment childElement = modelElement.getGroupInstalment();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GroupInstalmentEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
			}
		}
		{
			SortInstalment childElement = modelElement.getSortInstalment();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SortInstalmentEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getWhereInstalmentWhereInstalmentPartsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WhereInstalment modelElement = (WhereInstalment) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParts().iterator(); it.hasNext();) {
			AbstractConditionElement childElement = (AbstractConditionElement) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RootJunctionEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JunctionEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TermEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getTermTermParamsCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Term modelElement = (Term) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallQuerySurfaceEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Literal2EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteral2EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Function2EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input2EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getCallQuerySurfaceCallQuerySurfaceParamsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CallQuerySurface modelElement = (CallQuerySurface) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallQuerySurface2EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getCallQuerySurfaceCallQuerySurfaceParamsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CallQuerySurface modelElement = (CallQuerySurface) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallQuerySurface2EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getFunctionFunctionParamsCompartment_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallQuerySurface2EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getFunctionFunctionParamsCompartment_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallQuerySurface2EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getHavingInstalmentHavingInstalmentPartsCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		HavingInstalment modelElement = (HavingInstalment) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParts().iterator(); it.hasNext();) {
			AbstractConditionElement childElement = (AbstractConditionElement) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RootJunctionEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JunctionEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TermEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getOutputInstalmentOutputInstalmentNodesCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OutputInstalment modelElement = (OutputInstalment) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			AbstractNode childElement = (AbstractNode) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallQuerySurface3EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field3EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Literal3EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteral3EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Function3EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input3EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MyTableEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getCallQuerySurfaceCallQuerySurfaceParamsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CallQuerySurface modelElement = (CallQuerySurface) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallQuerySurface2EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getFunctionFunctionParamsCompartment_7010SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallQuerySurface2EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getMyTableMyTableFieldsCompartment_7011SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MyTable modelElement = (MyTable) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFields().iterator(); it.hasNext();) {
			Field childElement = (Field) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Field4EditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getInputInstalmentInputInstalmentInputsCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InputInstalment modelElement = (InputInstalment) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputDef childElement = (InputDef) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputStringDefEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputIntDefEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputDateDefEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputBitsDefEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputFloatDefEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getGroupInstalmentGroupInstalmentPointersCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupInstalment modelElement = (GroupInstalment) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPointers().iterator(); it.hasNext();) {
			FieldGPointer childElement = (FieldGPointer) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FieldGPointerEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryNodeDescriptor> getSortInstalmentSortInstalmentPointersCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SortInstalment modelElement = (SortInstalment) containerView.getElement();
		LinkedList<QueryNodeDescriptor> result = new LinkedList<QueryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPointers().iterator(); it.hasNext();) {
			FieldSPointer childElement = (FieldSPointer) it.next();
			int visualID = QueryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FieldSPointerEditPart.VISUAL_ID) {
				result.add(new QueryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<QueryLinkDescriptor> getContainedLinks(View view) {
		switch (QueryVisualIDRegistry.getVisualID(view)) {
		case QuerySurfaceEditPart.VISUAL_ID:
			return getQuerySurface_1000ContainedLinks(view);
		case WhereInstalmentEditPart.VISUAL_ID:
			return getWhereInstalment_2001ContainedLinks(view);
		case HavingInstalmentEditPart.VISUAL_ID:
			return getHavingInstalment_2002ContainedLinks(view);
		case OutputInstalmentEditPart.VISUAL_ID:
			return getOutputInstalment_2003ContainedLinks(view);
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2004ContainedLinks(view);
		case GroupInstalmentEditPart.VISUAL_ID:
			return getGroupInstalment_2005ContainedLinks(view);
		case SortInstalmentEditPart.VISUAL_ID:
			return getSortInstalment_2006ContainedLinks(view);
		case RootJunctionEditPart.VISUAL_ID:
			return getRootJunction_3001ContainedLinks(view);
		case JunctionEditPart.VISUAL_ID:
			return getJunction_3002ContainedLinks(view);
		case TermEditPart.VISUAL_ID:
			return getTerm_3003ContainedLinks(view);
		case CallQuerySurfaceEditPart.VISUAL_ID:
			return getCallQuerySurface_3004ContainedLinks(view);
		case CallQuerySurface2EditPart.VISUAL_ID:
			return getCallQuerySurface_3005ContainedLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3006ContainedLinks(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3007ContainedLinks(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3008ContainedLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3009ContainedLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3010ContainedLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3011ContainedLinks(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3012ContainedLinks(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3013ContainedLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3014ContainedLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3015ContainedLinks(view);
		case CallQuerySurface3EditPart.VISUAL_ID:
			return getCallQuerySurface_3016ContainedLinks(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3017ContainedLinks(view);
		case Literal3EditPart.VISUAL_ID:
			return getLiteral_3018ContainedLinks(view);
		case NullLiteral3EditPart.VISUAL_ID:
			return getNullLiteral_3019ContainedLinks(view);
		case Function3EditPart.VISUAL_ID:
			return getFunction_3020ContainedLinks(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3021ContainedLinks(view);
		case MyTableEditPart.VISUAL_ID:
			return getMyTable_3022ContainedLinks(view);
		case Field4EditPart.VISUAL_ID:
			return getField_3023ContainedLinks(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3024ContainedLinks(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3025ContainedLinks(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3026ContainedLinks(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3027ContainedLinks(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3032ContainedLinks(view);
		case FieldGPointerEditPart.VISUAL_ID:
			return getFieldGPointer_3030ContainedLinks(view);
		case FieldSPointerEditPart.VISUAL_ID:
			return getFieldSPointer_3031ContainedLinks(view);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getInnerjoinRels_4001ContainedLinks(view);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getLeftOuterJoinRels_4002ContainedLinks(view);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getRightOuterJoinRels_4003ContainedLinks(view);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getFullOuterJoinRels_4004ContainedLinks(view);
		case EqualLinkEditPart.VISUAL_ID:
			return getEqualLink_4005ContainedLinks(view);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getGreaterThanLink_4006ContainedLinks(view);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getGreaterEqualThanLink_4007ContainedLinks(view);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getLowerThanLink_4008ContainedLinks(view);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getLowerEqualThanLink_4009ContainedLinks(view);
		case InLinkEditPart.VISUAL_ID:
			return getInLink_4010ContainedLinks(view);
		case LikeLinkEditPart.VISUAL_ID:
			return getLikeLink_4011ContainedLinks(view);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getJuncRelationship_4012ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<QueryLinkDescriptor> getIncomingLinks(View view) {
		switch (QueryVisualIDRegistry.getVisualID(view)) {
		case WhereInstalmentEditPart.VISUAL_ID:
			return getWhereInstalment_2001IncomingLinks(view);
		case HavingInstalmentEditPart.VISUAL_ID:
			return getHavingInstalment_2002IncomingLinks(view);
		case OutputInstalmentEditPart.VISUAL_ID:
			return getOutputInstalment_2003IncomingLinks(view);
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2004IncomingLinks(view);
		case GroupInstalmentEditPart.VISUAL_ID:
			return getGroupInstalment_2005IncomingLinks(view);
		case SortInstalmentEditPart.VISUAL_ID:
			return getSortInstalment_2006IncomingLinks(view);
		case RootJunctionEditPart.VISUAL_ID:
			return getRootJunction_3001IncomingLinks(view);
		case JunctionEditPart.VISUAL_ID:
			return getJunction_3002IncomingLinks(view);
		case TermEditPart.VISUAL_ID:
			return getTerm_3003IncomingLinks(view);
		case CallQuerySurfaceEditPart.VISUAL_ID:
			return getCallQuerySurface_3004IncomingLinks(view);
		case CallQuerySurface2EditPart.VISUAL_ID:
			return getCallQuerySurface_3005IncomingLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3006IncomingLinks(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3007IncomingLinks(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3008IncomingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3009IncomingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3010IncomingLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3011IncomingLinks(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3012IncomingLinks(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3013IncomingLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3014IncomingLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3015IncomingLinks(view);
		case CallQuerySurface3EditPart.VISUAL_ID:
			return getCallQuerySurface_3016IncomingLinks(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3017IncomingLinks(view);
		case Literal3EditPart.VISUAL_ID:
			return getLiteral_3018IncomingLinks(view);
		case NullLiteral3EditPart.VISUAL_ID:
			return getNullLiteral_3019IncomingLinks(view);
		case Function3EditPart.VISUAL_ID:
			return getFunction_3020IncomingLinks(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3021IncomingLinks(view);
		case MyTableEditPart.VISUAL_ID:
			return getMyTable_3022IncomingLinks(view);
		case Field4EditPart.VISUAL_ID:
			return getField_3023IncomingLinks(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3024IncomingLinks(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3025IncomingLinks(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3026IncomingLinks(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3027IncomingLinks(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3032IncomingLinks(view);
		case FieldGPointerEditPart.VISUAL_ID:
			return getFieldGPointer_3030IncomingLinks(view);
		case FieldSPointerEditPart.VISUAL_ID:
			return getFieldSPointer_3031IncomingLinks(view);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getInnerjoinRels_4001IncomingLinks(view);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getLeftOuterJoinRels_4002IncomingLinks(view);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getRightOuterJoinRels_4003IncomingLinks(view);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getFullOuterJoinRels_4004IncomingLinks(view);
		case EqualLinkEditPart.VISUAL_ID:
			return getEqualLink_4005IncomingLinks(view);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getGreaterThanLink_4006IncomingLinks(view);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getGreaterEqualThanLink_4007IncomingLinks(view);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getLowerThanLink_4008IncomingLinks(view);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getLowerEqualThanLink_4009IncomingLinks(view);
		case InLinkEditPart.VISUAL_ID:
			return getInLink_4010IncomingLinks(view);
		case LikeLinkEditPart.VISUAL_ID:
			return getLikeLink_4011IncomingLinks(view);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getJuncRelationship_4012IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<QueryLinkDescriptor> getOutgoingLinks(View view) {
		switch (QueryVisualIDRegistry.getVisualID(view)) {
		case WhereInstalmentEditPart.VISUAL_ID:
			return getWhereInstalment_2001OutgoingLinks(view);
		case HavingInstalmentEditPart.VISUAL_ID:
			return getHavingInstalment_2002OutgoingLinks(view);
		case OutputInstalmentEditPart.VISUAL_ID:
			return getOutputInstalment_2003OutgoingLinks(view);
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2004OutgoingLinks(view);
		case GroupInstalmentEditPart.VISUAL_ID:
			return getGroupInstalment_2005OutgoingLinks(view);
		case SortInstalmentEditPart.VISUAL_ID:
			return getSortInstalment_2006OutgoingLinks(view);
		case RootJunctionEditPart.VISUAL_ID:
			return getRootJunction_3001OutgoingLinks(view);
		case JunctionEditPart.VISUAL_ID:
			return getJunction_3002OutgoingLinks(view);
		case TermEditPart.VISUAL_ID:
			return getTerm_3003OutgoingLinks(view);
		case CallQuerySurfaceEditPart.VISUAL_ID:
			return getCallQuerySurface_3004OutgoingLinks(view);
		case CallQuerySurface2EditPart.VISUAL_ID:
			return getCallQuerySurface_3005OutgoingLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3006OutgoingLinks(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3007OutgoingLinks(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3008OutgoingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3009OutgoingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3010OutgoingLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3011OutgoingLinks(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3012OutgoingLinks(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3013OutgoingLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3014OutgoingLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3015OutgoingLinks(view);
		case CallQuerySurface3EditPart.VISUAL_ID:
			return getCallQuerySurface_3016OutgoingLinks(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3017OutgoingLinks(view);
		case Literal3EditPart.VISUAL_ID:
			return getLiteral_3018OutgoingLinks(view);
		case NullLiteral3EditPart.VISUAL_ID:
			return getNullLiteral_3019OutgoingLinks(view);
		case Function3EditPart.VISUAL_ID:
			return getFunction_3020OutgoingLinks(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3021OutgoingLinks(view);
		case MyTableEditPart.VISUAL_ID:
			return getMyTable_3022OutgoingLinks(view);
		case Field4EditPart.VISUAL_ID:
			return getField_3023OutgoingLinks(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3024OutgoingLinks(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3025OutgoingLinks(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3026OutgoingLinks(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3027OutgoingLinks(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3032OutgoingLinks(view);
		case FieldGPointerEditPart.VISUAL_ID:
			return getFieldGPointer_3030OutgoingLinks(view);
		case FieldSPointerEditPart.VISUAL_ID:
			return getFieldSPointer_3031OutgoingLinks(view);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getInnerjoinRels_4001OutgoingLinks(view);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getLeftOuterJoinRels_4002OutgoingLinks(view);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getRightOuterJoinRels_4003OutgoingLinks(view);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getFullOuterJoinRels_4004OutgoingLinks(view);
		case EqualLinkEditPart.VISUAL_ID:
			return getEqualLink_4005OutgoingLinks(view);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getGreaterThanLink_4006OutgoingLinks(view);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getGreaterEqualThanLink_4007OutgoingLinks(view);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getLowerThanLink_4008OutgoingLinks(view);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getLowerEqualThanLink_4009OutgoingLinks(view);
		case InLinkEditPart.VISUAL_ID:
			return getInLink_4010OutgoingLinks(view);
		case LikeLinkEditPart.VISUAL_ID:
			return getLikeLink_4011OutgoingLinks(view);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getJuncRelationship_4012OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getQuerySurface_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getWhereInstalment_2001ContainedLinks(View view) {
		WhereInstalment modelElement = (WhereInstalment) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_JuncRelationship_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getHavingInstalment_2002ContainedLinks(View view) {
		HavingInstalment modelElement = (HavingInstalment) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_JuncRelationship_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getOutputInstalment_2003ContainedLinks(View view) {
		OutputInstalment modelElement = (OutputInstalment) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InnerjoinRels_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputInstalment_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getGroupInstalment_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getSortInstalment_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getRootJunction_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getJunction_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getTerm_3003ContainedLinks(View view) {
		Term modelElement = (Term) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getCallQuerySurface_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getCallQuerySurface_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getField_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLiteral_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getNullLiteral_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFunction_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInput_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getField_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLiteral_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getNullLiteral_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFunction_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInput_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getCallQuerySurface_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getField_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLiteral_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getNullLiteral_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFunction_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInput_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getMyTable_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getField_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputStringDef_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputIntDef_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputDateDef_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputBitsDef_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<QueryLinkDescriptor> getInputFloatDef_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFieldGPointer_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFieldSPointer_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInnerjoinRels_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLeftOuterJoinRels_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getRightOuterJoinRels_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFullOuterJoinRels_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getEqualLink_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getGreaterThanLink_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getGreaterEqualThanLink_4007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLowerThanLink_4008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLowerEqualThanLink_4009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInLink_4010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLikeLink_4011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getJuncRelationship_4012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getWhereInstalment_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getHavingInstalment_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getOutputInstalment_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputInstalment_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getGroupInstalment_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getSortInstalment_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getRootJunction_3001IncomingLinks(View view) {
		RootJunction modelElement = (RootJunction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JuncRelationship_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getJunction_3002IncomingLinks(View view) {
		Junction modelElement = (Junction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JuncRelationship_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getTerm_3003IncomingLinks(View view) {
		Term modelElement = (Term) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JuncRelationship_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getCallQuerySurface_3004IncomingLinks(View view) {
		CallQuerySurface modelElement = (CallQuerySurface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getCallQuerySurface_3005IncomingLinks(View view) {
		CallQuerySurface modelElement = (CallQuerySurface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getField_3006IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InnerjoinRels_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLiteral_3007IncomingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getNullLiteral_3008IncomingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFunction_3009IncomingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInput_3010IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getField_3011IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InnerjoinRels_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLiteral_3012IncomingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getNullLiteral_3013IncomingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFunction_3014IncomingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInput_3015IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getCallQuerySurface_3016IncomingLinks(View view) {
		CallQuerySurface modelElement = (CallQuerySurface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getField_3017IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InnerjoinRels_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLiteral_3018IncomingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getNullLiteral_3019IncomingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFunction_3020IncomingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInput_3021IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getMyTable_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getField_3023IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InnerjoinRels_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputStringDef_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputIntDef_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputDateDef_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputBitsDef_3027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<QueryLinkDescriptor> getInputFloatDef_3032IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFieldGPointer_3030IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFieldSPointer_3031IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInnerjoinRels_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLeftOuterJoinRels_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getRightOuterJoinRels_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFullOuterJoinRels_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getEqualLink_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getGreaterThanLink_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getGreaterEqualThanLink_4007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLowerThanLink_4008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLowerEqualThanLink_4009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInLink_4010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLikeLink_4011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getJuncRelationship_4012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getWhereInstalment_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getHavingInstalment_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getOutputInstalment_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputInstalment_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getGroupInstalment_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getSortInstalment_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getRootJunction_3001OutgoingLinks(View view) {
		RootJunction modelElement = (RootJunction) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_JuncRelationship_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getJunction_3002OutgoingLinks(View view) {
		Junction modelElement = (Junction) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_JuncRelationship_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getTerm_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getCallQuerySurface_3004OutgoingLinks(View view) {
		CallQuerySurface modelElement = (CallQuerySurface) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getCallQuerySurface_3005OutgoingLinks(View view) {
		CallQuerySurface modelElement = (CallQuerySurface) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getField_3006OutgoingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InnerjoinRels_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLiteral_3007OutgoingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getNullLiteral_3008OutgoingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFunction_3009OutgoingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInput_3010OutgoingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getField_3011OutgoingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InnerjoinRels_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLiteral_3012OutgoingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getNullLiteral_3013OutgoingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFunction_3014OutgoingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInput_3015OutgoingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getCallQuerySurface_3016OutgoingLinks(View view) {
		CallQuerySurface modelElement = (CallQuerySurface) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getField_3017OutgoingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InnerjoinRels_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLiteral_3018OutgoingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getNullLiteral_3019OutgoingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFunction_3020OutgoingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInput_3021OutgoingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getMyTable_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getField_3023OutgoingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InnerjoinRels_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputStringDef_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputIntDef_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputDateDef_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInputBitsDef_3027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<QueryLinkDescriptor> getInputFloatDef_3032OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFieldGPointer_3030OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFieldSPointer_3031OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInnerjoinRels_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLeftOuterJoinRels_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getRightOuterJoinRels_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getFullOuterJoinRels_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getEqualLink_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getGreaterThanLink_4006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getGreaterEqualThanLink_4007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLowerThanLink_4008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLowerEqualThanLink_4009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getInLink_4010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getLikeLink_4011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QueryLinkDescriptor> getJuncRelationship_4012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getContainedTypeModelFacetLinks_InnerjoinRels_4001(
			OutputInstalment container) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InnerjoinRels) {
				continue;
			}
			InnerjoinRels link = (InnerjoinRels) linkObject;
			if (InnerjoinRelsEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.InnerjoinRels_4001,
					InnerjoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getContainedTypeModelFacetLinks_LeftOuterJoinRels_4002(
			OutputInstalment container) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LeftOuterJoinRels) {
				continue;
			}
			LeftOuterJoinRels link = (LeftOuterJoinRels) linkObject;
			if (LeftOuterJoinRelsEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.LeftOuterJoinRels_4002,
					LeftOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getContainedTypeModelFacetLinks_RightOuterJoinRels_4003(
			OutputInstalment container) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RightOuterJoinRels) {
				continue;
			}
			RightOuterJoinRels link = (RightOuterJoinRels) linkObject;
			if (RightOuterJoinRelsEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.RightOuterJoinRels_4003,
					RightOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getContainedTypeModelFacetLinks_FullOuterJoinRels_4004(
			OutputInstalment container) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof FullOuterJoinRels) {
				continue;
			}
			FullOuterJoinRels link = (FullOuterJoinRels) linkObject;
			if (FullOuterJoinRelsEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.FullOuterJoinRels_4004,
					FullOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getContainedTypeModelFacetLinks_EqualLink_4005(Term container) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof EqualLink) {
			return result;
		}
		EqualLink link = (EqualLink) linkObject;
		if (EqualLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(
				new QueryLinkDescriptor(src, dst, link, QueryElementTypes.EqualLink_4005, EqualLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getContainedTypeModelFacetLinks_GreaterThanLink_4006(
			Term container) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof GreaterThanLink) {
			return result;
		}
		GreaterThanLink link = (GreaterThanLink) linkObject;
		if (GreaterThanLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.GreaterThanLink_4006,
				GreaterThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getContainedTypeModelFacetLinks_GreaterEqualThanLink_4007(
			Term container) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof GreaterEqualThanLink) {
			return result;
		}
		GreaterEqualThanLink link = (GreaterEqualThanLink) linkObject;
		if (GreaterEqualThanLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.GreaterEqualThanLink_4007,
				GreaterEqualThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getContainedTypeModelFacetLinks_LowerThanLink_4008(Term container) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LowerThanLink) {
			return result;
		}
		LowerThanLink link = (LowerThanLink) linkObject;
		if (LowerThanLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.LowerThanLink_4008,
				LowerThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getContainedTypeModelFacetLinks_LowerEqualThanLink_4009(
			Term container) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LowerEqualThanLink) {
			return result;
		}
		LowerEqualThanLink link = (LowerEqualThanLink) linkObject;
		if (LowerEqualThanLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.LowerEqualThanLink_4009,
				LowerEqualThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getContainedTypeModelFacetLinks_InLink_4010(Term container) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof InLink) {
			return result;
		}
		InLink link = (InLink) linkObject;
		if (InLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.InLink_4010, InLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getContainedTypeModelFacetLinks_LikeLink_4011(Term container) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LikeLink) {
			return result;
		}
		LikeLink link = (LikeLink) linkObject;
		if (LikeLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(
				new QueryLinkDescriptor(src, dst, link, QueryElementTypes.LikeLink_4011, LikeLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getContainedTypeModelFacetLinks_JuncRelationship_4012(
			ConditionInstalment container) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof JuncRelationship) {
				continue;
			}
			JuncRelationship link = (JuncRelationship) linkObject;
			if (JuncRelationshipEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConditionElement dst = link.getTarget();
			Junction src = link.getSource();
			result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.JuncRelationship_4012,
					JuncRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QueryLinkDescriptor> getIncomingTypeModelFacetLinks_InnerjoinRels_4001(Field target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != QueryPackage.eINSTANCE.getRelationSelect_Target()
					|| false == setting.getEObject() instanceof InnerjoinRels) {
				continue;
			}
			InnerjoinRels link = (InnerjoinRels) setting.getEObject();
			if (InnerjoinRelsEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field src = link.getSource();
			result.add(new QueryLinkDescriptor(src, target, link, QueryElementTypes.InnerjoinRels_4001,
					InnerjoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QueryLinkDescriptor> getIncomingTypeModelFacetLinks_LeftOuterJoinRels_4002(Field target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != QueryPackage.eINSTANCE.getRelationSelect_Target()
					|| false == setting.getEObject() instanceof LeftOuterJoinRels) {
				continue;
			}
			LeftOuterJoinRels link = (LeftOuterJoinRels) setting.getEObject();
			if (LeftOuterJoinRelsEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field src = link.getSource();
			result.add(new QueryLinkDescriptor(src, target, link, QueryElementTypes.LeftOuterJoinRels_4002,
					LeftOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QueryLinkDescriptor> getIncomingTypeModelFacetLinks_RightOuterJoinRels_4003(Field target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != QueryPackage.eINSTANCE.getRelationSelect_Target()
					|| false == setting.getEObject() instanceof RightOuterJoinRels) {
				continue;
			}
			RightOuterJoinRels link = (RightOuterJoinRels) setting.getEObject();
			if (RightOuterJoinRelsEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field src = link.getSource();
			result.add(new QueryLinkDescriptor(src, target, link, QueryElementTypes.RightOuterJoinRels_4003,
					RightOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QueryLinkDescriptor> getIncomingTypeModelFacetLinks_FullOuterJoinRels_4004(Field target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != QueryPackage.eINSTANCE.getRelationSelect_Target()
					|| false == setting.getEObject() instanceof FullOuterJoinRels) {
				continue;
			}
			FullOuterJoinRels link = (FullOuterJoinRels) setting.getEObject();
			if (FullOuterJoinRelsEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field src = link.getSource();
			result.add(new QueryLinkDescriptor(src, target, link, QueryElementTypes.FullOuterJoinRels_4004,
					FullOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QueryLinkDescriptor> getIncomingTypeModelFacetLinks_EqualLink_4005(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != QueryPackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof EqualLink) {
				continue;
			}
			EqualLink link = (EqualLink) setting.getEObject();
			if (EqualLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new QueryLinkDescriptor(src, target, link, QueryElementTypes.EqualLink_4005,
					EqualLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QueryLinkDescriptor> getIncomingTypeModelFacetLinks_GreaterThanLink_4006(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != QueryPackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof GreaterThanLink) {
				continue;
			}
			GreaterThanLink link = (GreaterThanLink) setting.getEObject();
			if (GreaterThanLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new QueryLinkDescriptor(src, target, link, QueryElementTypes.GreaterThanLink_4006,
					GreaterThanLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QueryLinkDescriptor> getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4007(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != QueryPackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof GreaterEqualThanLink) {
				continue;
			}
			GreaterEqualThanLink link = (GreaterEqualThanLink) setting.getEObject();
			if (GreaterEqualThanLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new QueryLinkDescriptor(src, target, link, QueryElementTypes.GreaterEqualThanLink_4007,
					GreaterEqualThanLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QueryLinkDescriptor> getIncomingTypeModelFacetLinks_LowerThanLink_4008(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != QueryPackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof LowerThanLink) {
				continue;
			}
			LowerThanLink link = (LowerThanLink) setting.getEObject();
			if (LowerThanLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new QueryLinkDescriptor(src, target, link, QueryElementTypes.LowerThanLink_4008,
					LowerThanLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QueryLinkDescriptor> getIncomingTypeModelFacetLinks_LowerEqualThanLink_4009(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != QueryPackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof LowerEqualThanLink) {
				continue;
			}
			LowerEqualThanLink link = (LowerEqualThanLink) setting.getEObject();
			if (LowerEqualThanLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new QueryLinkDescriptor(src, target, link, QueryElementTypes.LowerEqualThanLink_4009,
					LowerEqualThanLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QueryLinkDescriptor> getIncomingTypeModelFacetLinks_InLink_4010(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != QueryPackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof InLink) {
				continue;
			}
			InLink link = (InLink) setting.getEObject();
			if (InLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new QueryLinkDescriptor(src, target, link, QueryElementTypes.InLink_4010,
					InLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QueryLinkDescriptor> getIncomingTypeModelFacetLinks_LikeLink_4011(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != QueryPackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof LikeLink) {
				continue;
			}
			LikeLink link = (LikeLink) setting.getEObject();
			if (LikeLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new QueryLinkDescriptor(src, target, link, QueryElementTypes.LikeLink_4011,
					LikeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QueryLinkDescriptor> getIncomingTypeModelFacetLinks_JuncRelationship_4012(
			AbstractConditionElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != QueryPackage.eINSTANCE.getJuncRelationship_Target()
					|| false == setting.getEObject() instanceof JuncRelationship) {
				continue;
			}
			JuncRelationship link = (JuncRelationship) setting.getEObject();
			if (JuncRelationshipEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Junction src = link.getSource();
			result.add(new QueryLinkDescriptor(src, target, link, QueryElementTypes.JuncRelationship_4012,
					JuncRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getOutgoingTypeModelFacetLinks_InnerjoinRels_4001(Field source) {
		OutputInstalment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof OutputInstalment) {
				container = (OutputInstalment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InnerjoinRels) {
				continue;
			}
			InnerjoinRels link = (InnerjoinRels) linkObject;
			if (InnerjoinRelsEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.InnerjoinRels_4001,
					InnerjoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getOutgoingTypeModelFacetLinks_LeftOuterJoinRels_4002(Field source) {
		OutputInstalment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof OutputInstalment) {
				container = (OutputInstalment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LeftOuterJoinRels) {
				continue;
			}
			LeftOuterJoinRels link = (LeftOuterJoinRels) linkObject;
			if (LeftOuterJoinRelsEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.LeftOuterJoinRels_4002,
					LeftOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getOutgoingTypeModelFacetLinks_RightOuterJoinRels_4003(
			Field source) {
		OutputInstalment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof OutputInstalment) {
				container = (OutputInstalment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RightOuterJoinRels) {
				continue;
			}
			RightOuterJoinRels link = (RightOuterJoinRels) linkObject;
			if (RightOuterJoinRelsEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.RightOuterJoinRels_4003,
					RightOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getOutgoingTypeModelFacetLinks_FullOuterJoinRels_4004(Field source) {
		OutputInstalment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof OutputInstalment) {
				container = (OutputInstalment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof FullOuterJoinRels) {
				continue;
			}
			FullOuterJoinRels link = (FullOuterJoinRels) linkObject;
			if (FullOuterJoinRelsEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.FullOuterJoinRels_4004,
					FullOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getOutgoingTypeModelFacetLinks_EqualLink_4005(Node source) {
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
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof EqualLink) {
			return result;
		}
		EqualLink link = (EqualLink) linkObject;
		if (EqualLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(
				new QueryLinkDescriptor(src, dst, link, QueryElementTypes.EqualLink_4005, EqualLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getOutgoingTypeModelFacetLinks_GreaterThanLink_4006(Node source) {
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
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof GreaterThanLink) {
			return result;
		}
		GreaterThanLink link = (GreaterThanLink) linkObject;
		if (GreaterThanLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.GreaterThanLink_4006,
				GreaterThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4007(
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
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof GreaterEqualThanLink) {
			return result;
		}
		GreaterEqualThanLink link = (GreaterEqualThanLink) linkObject;
		if (GreaterEqualThanLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.GreaterEqualThanLink_4007,
				GreaterEqualThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getOutgoingTypeModelFacetLinks_LowerThanLink_4008(Node source) {
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
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LowerThanLink) {
			return result;
		}
		LowerThanLink link = (LowerThanLink) linkObject;
		if (LowerThanLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.LowerThanLink_4008,
				LowerThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4009(Node source) {
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
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LowerEqualThanLink) {
			return result;
		}
		LowerEqualThanLink link = (LowerEqualThanLink) linkObject;
		if (LowerEqualThanLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.LowerEqualThanLink_4009,
				LowerEqualThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getOutgoingTypeModelFacetLinks_InLink_4010(Node source) {
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
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof InLink) {
			return result;
		}
		InLink link = (InLink) linkObject;
		if (InLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.InLink_4010, InLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getOutgoingTypeModelFacetLinks_LikeLink_4011(Node source) {
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
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LikeLink) {
			return result;
		}
		LikeLink link = (LikeLink) linkObject;
		if (LikeLinkEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(
				new QueryLinkDescriptor(src, dst, link, QueryElementTypes.LikeLink_4011, LikeLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<QueryLinkDescriptor> getOutgoingTypeModelFacetLinks_JuncRelationship_4012(
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
		LinkedList<QueryLinkDescriptor> result = new LinkedList<QueryLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof JuncRelationship) {
				continue;
			}
			JuncRelationship link = (JuncRelationship) linkObject;
			if (JuncRelationshipEditPart.VISUAL_ID != QueryVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConditionElement dst = link.getTarget();
			Junction src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new QueryLinkDescriptor(src, dst, link, QueryElementTypes.JuncRelationship_4012,
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

		public List<QueryNodeDescriptor> getSemanticChildren(View view) {
			return QueryDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<QueryLinkDescriptor> getContainedLinks(View view) {
			return QueryDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<QueryLinkDescriptor> getIncomingLinks(View view) {
			return QueryDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<QueryLinkDescriptor> getOutgoingLinks(View view) {
			return QueryDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
