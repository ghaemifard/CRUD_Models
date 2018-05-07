/*
* 
*/
package delete.diagram.part;

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

import delete.AbstractConditionElement;
import delete.AbstractNode;
import delete.CallSurfaceQuery;
import delete.ConditionInstalment;
import delete.ConditionLink;
import delete.DeletePackage;
import delete.DeleteSurface;
import delete.Dummy;
import delete.EqualLink;
import delete.Field;
import delete.FieldSPointer;
import delete.FullOuterJoinRels;
import delete.Function;
import delete.GreaterEqualThanLink;
import delete.GreaterThanLink;
import delete.InLink;
import delete.InnerjoinRels;
import delete.Input;
import delete.InputDef;
import delete.InputInstalment;
import delete.JuncRelationship;
import delete.Junction;
import delete.LeftOuterJoinRels;
import delete.LikeLink;
import delete.Literal;
import delete.LowerEqualThanLink;
import delete.LowerThanLink;
import delete.MyTable;
import delete.Node;
import delete.NullLiteral;
import delete.RightOuterJoinRels;
import delete.RootJunction;
import delete.SortInstalment;
import delete.TableListInstalment;
import delete.Term;
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
import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class DeleteDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getSemanticChildren(View view) {
		switch (DeleteVisualIDRegistry.getVisualID(view)) {
		case DeleteSurfaceEditPart.VISUAL_ID:
			return getDeleteSurface_1000SemanticChildren(view);
		case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
			return getInputInstalmentInputInstalmentInputsCompartment_7001SemanticChildren(view);
		case TableListInstalmentTableListInstalmentTablesCompartmentEditPart.VISUAL_ID:
			return getTableListInstalmentTableListInstalmentTablesCompartment_7002SemanticChildren(view);
		case MyTableMyTableFieldsCompartmentEditPart.VISUAL_ID:
			return getMyTableMyTableFieldsCompartment_7025SemanticChildren(view);
		case ConditionInstalmentConditionInstalmentPartsCompartmentEditPart.VISUAL_ID:
			return getConditionInstalmentConditionInstalmentPartsCompartment_7018SemanticChildren(view);
		case TermTermParamsCompartmentEditPart.VISUAL_ID:
			return getTermTermParamsCompartment_7019SemanticChildren(view);
		case CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID:
			return getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7011SemanticChildren(view);
		case CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID:
			return getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7008SemanticChildren(view);
		case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionParamsCompartment_7009SemanticChildren(view);
		case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
			return getFunctionFunctionParamsCompartment_7012SemanticChildren(view);
		case SortInstalmentSortInstalmentPointersCompartmentEditPart.VISUAL_ID:
			return getSortInstalmentSortInstalmentPointersCompartment_7020SemanticChildren(view);
		case DummyDummyPartsCompartmentEditPart.VISUAL_ID:
			return getDummyDummyPartsCompartment_7021SemanticChildren(view);
		case CallSurfaceQueryCallSurfaceQueryParamsCompartment3EditPart.VISUAL_ID:
			return getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7022SemanticChildren(view);
		case FunctionFunctionParamsCompartment3EditPart.VISUAL_ID:
			return getFunctionFunctionParamsCompartment_7023SemanticChildren(view);
		case MyTableMyTableFieldsCompartment2EditPart.VISUAL_ID:
			return getMyTableMyTableFieldsCompartment_7026SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getDeleteSurface_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DeleteSurface modelElement = (DeleteSurface) view.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		{
			InputInstalment childElement = modelElement.getInputInsta();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputInstalmentEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
			}
		}
		{
			TableListInstalment childElement = modelElement.getTableInsta();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TableListInstalmentEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
			}
		}
		{
			ConditionInstalment childElement = modelElement.getWhereInsta();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConditionInstalmentEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
			}
		}
		{
			SortInstalment childElement = modelElement.getSortInstalment();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SortInstalmentEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
			}
		}
		{
			Dummy childElement = modelElement.getDummy();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DummyEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getInputInstalmentInputInstalmentInputsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InputInstalment modelElement = (InputInstalment) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputDef childElement = (InputDef) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputStringDefEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputIntDefEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputDateDefEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputBitsDefEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputFloatDefEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getTableListInstalmentTableListInstalmentTablesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TableListInstalment modelElement = (TableListInstalment) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTables().iterator(); it.hasNext();) {
			MyTable childElement = (MyTable) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MyTableEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getMyTableMyTableFieldsCompartment_7025SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MyTable modelElement = (MyTable) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFields().iterator(); it.hasNext();) {
			Field childElement = (Field) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getConditionInstalmentConditionInstalmentPartsCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionInstalment modelElement = (ConditionInstalment) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParts().iterator(); it.hasNext();) {
			AbstractConditionElement childElement = (AbstractConditionElement) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RootJunctionEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JunctionEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TermEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getTermTermParamsCompartment_7019SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Term modelElement = (Term) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQueryEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field3EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Literal2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteral2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Function2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CallSurfaceQuery modelElement = (CallSurfaceQuery) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CallSurfaceQuery modelElement = (CallSurfaceQuery) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getFunctionFunctionParamsCompartment_7009SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getFunctionFunctionParamsCompartment_7012SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getSortInstalmentSortInstalmentPointersCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SortInstalment modelElement = (SortInstalment) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPointers().iterator(); it.hasNext();) {
			FieldSPointer childElement = (FieldSPointer) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FieldSPointerEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getDummyDummyPartsCompartment_7021SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Dummy modelElement = (Dummy) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParts().iterator(); it.hasNext();) {
			AbstractNode childElement = (AbstractNode) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery3EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field4EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Literal3EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteral3EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Function3EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input3EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MyTable2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CallSurfaceQuery modelElement = (CallSurfaceQuery) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getFunctionFunctionParamsCompartment_7023SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteNodeDescriptor> getMyTableMyTableFieldsCompartment_7026SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MyTable modelElement = (MyTable) containerView.getElement();
		LinkedList<DeleteNodeDescriptor> result = new LinkedList<DeleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFields().iterator(); it.hasNext();) {
			Field childElement = (Field) it.next();
			int visualID = DeleteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new DeleteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DeleteLinkDescriptor> getContainedLinks(View view) {
		switch (DeleteVisualIDRegistry.getVisualID(view)) {
		case DeleteSurfaceEditPart.VISUAL_ID:
			return getDeleteSurface_1000ContainedLinks(view);
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2001ContainedLinks(view);
		case TableListInstalmentEditPart.VISUAL_ID:
			return getTableListInstalment_2002ContainedLinks(view);
		case ConditionInstalmentEditPart.VISUAL_ID:
			return getConditionInstalment_2005ContainedLinks(view);
		case SortInstalmentEditPart.VISUAL_ID:
			return getSortInstalment_2006ContainedLinks(view);
		case DummyEditPart.VISUAL_ID:
			return getDummy_2007ContainedLinks(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3001ContainedLinks(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3002ContainedLinks(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3003ContainedLinks(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3004ContainedLinks(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3037ContainedLinks(view);
		case MyTableEditPart.VISUAL_ID:
			return getMyTable_3051ContainedLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3052ContainedLinks(view);
		case RootJunctionEditPart.VISUAL_ID:
			return getRootJunction_3040ContainedLinks(view);
		case JunctionEditPart.VISUAL_ID:
			return getJunction_3041ContainedLinks(view);
		case TermEditPart.VISUAL_ID:
			return getTerm_3042ContainedLinks(view);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getCallSurfaceQuery_3025ContainedLinks(view);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3014ContainedLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3015ContainedLinks(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3016ContainedLinks(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3017ContainedLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3018ContainedLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3019ContainedLinks(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3012ContainedLinks(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3026ContainedLinks(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3027ContainedLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3028ContainedLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3029ContainedLinks(view);
		case FieldSPointerEditPart.VISUAL_ID:
			return getFieldSPointer_3043ContainedLinks(view);
		case CallSurfaceQuery3EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3044ContainedLinks(view);
		case Field4EditPart.VISUAL_ID:
			return getField_3045ContainedLinks(view);
		case Literal3EditPart.VISUAL_ID:
			return getLiteral_3046ContainedLinks(view);
		case NullLiteral3EditPart.VISUAL_ID:
			return getNullLiteral_3047ContainedLinks(view);
		case Function3EditPart.VISUAL_ID:
			return getFunction_3048ContainedLinks(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3049ContainedLinks(view);
		case MyTable2EditPart.VISUAL_ID:
			return getMyTable_3053ContainedLinks(view);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getInnerjoinRels_4001ContainedLinks(view);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getLeftOuterJoinRels_4002ContainedLinks(view);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getRightOuterJoinRels_4003ContainedLinks(view);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getFullOuterJoinRels_4004ContainedLinks(view);
		case EqualLinkEditPart.VISUAL_ID:
			return getEqualLink_4006ContainedLinks(view);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getGreaterThanLink_4007ContainedLinks(view);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getGreaterEqualThanLink_4008ContainedLinks(view);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getLowerThanLink_4009ContainedLinks(view);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getLowerEqualThanLink_4010ContainedLinks(view);
		case InLinkEditPart.VISUAL_ID:
			return getInLink_4011ContainedLinks(view);
		case LikeLinkEditPart.VISUAL_ID:
			return getLikeLink_4012ContainedLinks(view);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getJuncRelationship_4013ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DeleteLinkDescriptor> getIncomingLinks(View view) {
		switch (DeleteVisualIDRegistry.getVisualID(view)) {
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2001IncomingLinks(view);
		case TableListInstalmentEditPart.VISUAL_ID:
			return getTableListInstalment_2002IncomingLinks(view);
		case ConditionInstalmentEditPart.VISUAL_ID:
			return getConditionInstalment_2005IncomingLinks(view);
		case SortInstalmentEditPart.VISUAL_ID:
			return getSortInstalment_2006IncomingLinks(view);
		case DummyEditPart.VISUAL_ID:
			return getDummy_2007IncomingLinks(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3001IncomingLinks(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3002IncomingLinks(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3003IncomingLinks(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3004IncomingLinks(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3037IncomingLinks(view);
		case MyTableEditPart.VISUAL_ID:
			return getMyTable_3051IncomingLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3052IncomingLinks(view);
		case RootJunctionEditPart.VISUAL_ID:
			return getRootJunction_3040IncomingLinks(view);
		case JunctionEditPart.VISUAL_ID:
			return getJunction_3041IncomingLinks(view);
		case TermEditPart.VISUAL_ID:
			return getTerm_3042IncomingLinks(view);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getCallSurfaceQuery_3025IncomingLinks(view);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3014IncomingLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3015IncomingLinks(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3016IncomingLinks(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3017IncomingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3018IncomingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3019IncomingLinks(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3012IncomingLinks(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3026IncomingLinks(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3027IncomingLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3028IncomingLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3029IncomingLinks(view);
		case FieldSPointerEditPart.VISUAL_ID:
			return getFieldSPointer_3043IncomingLinks(view);
		case CallSurfaceQuery3EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3044IncomingLinks(view);
		case Field4EditPart.VISUAL_ID:
			return getField_3045IncomingLinks(view);
		case Literal3EditPart.VISUAL_ID:
			return getLiteral_3046IncomingLinks(view);
		case NullLiteral3EditPart.VISUAL_ID:
			return getNullLiteral_3047IncomingLinks(view);
		case Function3EditPart.VISUAL_ID:
			return getFunction_3048IncomingLinks(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3049IncomingLinks(view);
		case MyTable2EditPart.VISUAL_ID:
			return getMyTable_3053IncomingLinks(view);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getInnerjoinRels_4001IncomingLinks(view);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getLeftOuterJoinRels_4002IncomingLinks(view);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getRightOuterJoinRels_4003IncomingLinks(view);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getFullOuterJoinRels_4004IncomingLinks(view);
		case EqualLinkEditPart.VISUAL_ID:
			return getEqualLink_4006IncomingLinks(view);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getGreaterThanLink_4007IncomingLinks(view);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getGreaterEqualThanLink_4008IncomingLinks(view);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getLowerThanLink_4009IncomingLinks(view);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getLowerEqualThanLink_4010IncomingLinks(view);
		case InLinkEditPart.VISUAL_ID:
			return getInLink_4011IncomingLinks(view);
		case LikeLinkEditPart.VISUAL_ID:
			return getLikeLink_4012IncomingLinks(view);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getJuncRelationship_4013IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DeleteLinkDescriptor> getOutgoingLinks(View view) {
		switch (DeleteVisualIDRegistry.getVisualID(view)) {
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2001OutgoingLinks(view);
		case TableListInstalmentEditPart.VISUAL_ID:
			return getTableListInstalment_2002OutgoingLinks(view);
		case ConditionInstalmentEditPart.VISUAL_ID:
			return getConditionInstalment_2005OutgoingLinks(view);
		case SortInstalmentEditPart.VISUAL_ID:
			return getSortInstalment_2006OutgoingLinks(view);
		case DummyEditPart.VISUAL_ID:
			return getDummy_2007OutgoingLinks(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3001OutgoingLinks(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3002OutgoingLinks(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3003OutgoingLinks(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3004OutgoingLinks(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3037OutgoingLinks(view);
		case MyTableEditPart.VISUAL_ID:
			return getMyTable_3051OutgoingLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3052OutgoingLinks(view);
		case RootJunctionEditPart.VISUAL_ID:
			return getRootJunction_3040OutgoingLinks(view);
		case JunctionEditPart.VISUAL_ID:
			return getJunction_3041OutgoingLinks(view);
		case TermEditPart.VISUAL_ID:
			return getTerm_3042OutgoingLinks(view);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getCallSurfaceQuery_3025OutgoingLinks(view);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3014OutgoingLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3015OutgoingLinks(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3016OutgoingLinks(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3017OutgoingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3018OutgoingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3019OutgoingLinks(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3012OutgoingLinks(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3026OutgoingLinks(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3027OutgoingLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3028OutgoingLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3029OutgoingLinks(view);
		case FieldSPointerEditPart.VISUAL_ID:
			return getFieldSPointer_3043OutgoingLinks(view);
		case CallSurfaceQuery3EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3044OutgoingLinks(view);
		case Field4EditPart.VISUAL_ID:
			return getField_3045OutgoingLinks(view);
		case Literal3EditPart.VISUAL_ID:
			return getLiteral_3046OutgoingLinks(view);
		case NullLiteral3EditPart.VISUAL_ID:
			return getNullLiteral_3047OutgoingLinks(view);
		case Function3EditPart.VISUAL_ID:
			return getFunction_3048OutgoingLinks(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3049OutgoingLinks(view);
		case MyTable2EditPart.VISUAL_ID:
			return getMyTable_3053OutgoingLinks(view);
		case InnerjoinRelsEditPart.VISUAL_ID:
			return getInnerjoinRels_4001OutgoingLinks(view);
		case LeftOuterJoinRelsEditPart.VISUAL_ID:
			return getLeftOuterJoinRels_4002OutgoingLinks(view);
		case RightOuterJoinRelsEditPart.VISUAL_ID:
			return getRightOuterJoinRels_4003OutgoingLinks(view);
		case FullOuterJoinRelsEditPart.VISUAL_ID:
			return getFullOuterJoinRels_4004OutgoingLinks(view);
		case EqualLinkEditPart.VISUAL_ID:
			return getEqualLink_4006OutgoingLinks(view);
		case GreaterThanLinkEditPart.VISUAL_ID:
			return getGreaterThanLink_4007OutgoingLinks(view);
		case GreaterEqualThanLinkEditPart.VISUAL_ID:
			return getGreaterEqualThanLink_4008OutgoingLinks(view);
		case LowerThanLinkEditPart.VISUAL_ID:
			return getLowerThanLink_4009OutgoingLinks(view);
		case LowerEqualThanLinkEditPart.VISUAL_ID:
			return getLowerEqualThanLink_4010OutgoingLinks(view);
		case InLinkEditPart.VISUAL_ID:
			return getInLink_4011OutgoingLinks(view);
		case LikeLinkEditPart.VISUAL_ID:
			return getLikeLink_4012OutgoingLinks(view);
		case JuncRelationshipEditPart.VISUAL_ID:
			return getJuncRelationship_4013OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getDeleteSurface_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputInstalment_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getTableListInstalment_2002ContainedLinks(View view) {
		TableListInstalment modelElement = (TableListInstalment) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InnerjoinRels_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getConditionInstalment_2005ContainedLinks(View view) {
		ConditionInstalment modelElement = (ConditionInstalment) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_JuncRelationship_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getSortInstalment_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getDummy_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputStringDef_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputIntDef_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputDateDef_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputBitsDef_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputFloatDef_3037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getMyTable_3051ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getField_3052ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getRootJunction_3040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getJunction_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getTerm_3042ContainedLinks(View view) {
		Term modelElement = (Term) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getCallSurfaceQuery_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getCallSurfaceQuery_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getField_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLiteral_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getNullLiteral_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFunction_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInput_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getField_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLiteral_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getNullLiteral_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFunction_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInput_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFieldSPointer_3043ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getCallSurfaceQuery_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getField_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLiteral_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getNullLiteral_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFunction_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInput_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getMyTable_3053ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInnerjoinRels_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLeftOuterJoinRels_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getRightOuterJoinRels_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFullOuterJoinRels_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getEqualLink_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getGreaterThanLink_4007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getGreaterEqualThanLink_4008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLowerThanLink_4009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLowerEqualThanLink_4010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInLink_4011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLikeLink_4012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getJuncRelationship_4013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputInstalment_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getTableListInstalment_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getConditionInstalment_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getSortInstalment_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getDummy_2007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputStringDef_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputIntDef_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputDateDef_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputBitsDef_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputFloatDef_3037IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getMyTable_3051IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getField_3052IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InnerjoinRels_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getRootJunction_3040IncomingLinks(View view) {
		RootJunction modelElement = (RootJunction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JuncRelationship_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getJunction_3041IncomingLinks(View view) {
		Junction modelElement = (Junction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JuncRelationship_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getTerm_3042IncomingLinks(View view) {
		Term modelElement = (Term) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JuncRelationship_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getCallSurfaceQuery_3025IncomingLinks(View view) {
		CallSurfaceQuery modelElement = (CallSurfaceQuery) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getCallSurfaceQuery_3014IncomingLinks(View view) {
		CallSurfaceQuery modelElement = (CallSurfaceQuery) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getField_3015IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InnerjoinRels_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLiteral_3016IncomingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getNullLiteral_3017IncomingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFunction_3018IncomingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInput_3019IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getField_3012IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InnerjoinRels_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLiteral_3026IncomingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getNullLiteral_3027IncomingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFunction_3028IncomingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInput_3029IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFieldSPointer_3043IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getCallSurfaceQuery_3044IncomingLinks(View view) {
		CallSurfaceQuery modelElement = (CallSurfaceQuery) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getField_3045IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InnerjoinRels_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLiteral_3046IncomingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getNullLiteral_3047IncomingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFunction_3048IncomingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInput_3049IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EqualLink_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterThanLink_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerThanLink_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InLink_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LikeLink_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getMyTable_3053IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInnerjoinRels_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLeftOuterJoinRels_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getRightOuterJoinRels_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFullOuterJoinRels_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getEqualLink_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getGreaterThanLink_4007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getGreaterEqualThanLink_4008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLowerThanLink_4009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLowerEqualThanLink_4010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInLink_4011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLikeLink_4012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getJuncRelationship_4013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputInstalment_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getTableListInstalment_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getConditionInstalment_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getSortInstalment_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getDummy_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputStringDef_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputIntDef_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputDateDef_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputBitsDef_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInputFloatDef_3037OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getMyTable_3051OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getField_3052OutgoingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InnerjoinRels_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getRootJunction_3040OutgoingLinks(View view) {
		RootJunction modelElement = (RootJunction) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_JuncRelationship_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getJunction_3041OutgoingLinks(View view) {
		Junction modelElement = (Junction) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_JuncRelationship_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getTerm_3042OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getCallSurfaceQuery_3025OutgoingLinks(View view) {
		CallSurfaceQuery modelElement = (CallSurfaceQuery) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getCallSurfaceQuery_3014OutgoingLinks(View view) {
		CallSurfaceQuery modelElement = (CallSurfaceQuery) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getField_3015OutgoingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InnerjoinRels_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLiteral_3016OutgoingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getNullLiteral_3017OutgoingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFunction_3018OutgoingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInput_3019OutgoingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getField_3012OutgoingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InnerjoinRels_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLiteral_3026OutgoingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getNullLiteral_3027OutgoingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFunction_3028OutgoingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInput_3029OutgoingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFieldSPointer_3043OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getCallSurfaceQuery_3044OutgoingLinks(View view) {
		CallSurfaceQuery modelElement = (CallSurfaceQuery) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getField_3045OutgoingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InnerjoinRels_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LeftOuterJoinRels_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RightOuterJoinRels_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_FullOuterJoinRels_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLiteral_3046OutgoingLinks(View view) {
		Literal modelElement = (Literal) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getNullLiteral_3047OutgoingLinks(View view) {
		NullLiteral modelElement = (NullLiteral) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFunction_3048OutgoingLinks(View view) {
		Function modelElement = (Function) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInput_3049OutgoingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EqualLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerThanLink_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InLink_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LikeLink_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getMyTable_3053OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInnerjoinRels_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLeftOuterJoinRels_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getRightOuterJoinRels_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getFullOuterJoinRels_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getEqualLink_4006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getGreaterThanLink_4007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getGreaterEqualThanLink_4008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLowerThanLink_4009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLowerEqualThanLink_4010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getInLink_4011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getLikeLink_4012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeleteLinkDescriptor> getJuncRelationship_4013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getContainedTypeModelFacetLinks_InnerjoinRels_4001(
			TableListInstalment container) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InnerjoinRels) {
				continue;
			}
			InnerjoinRels link = (InnerjoinRels) linkObject;
			if (InnerjoinRelsEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.InnerjoinRels_4001,
					InnerjoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getContainedTypeModelFacetLinks_LeftOuterJoinRels_4002(
			TableListInstalment container) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LeftOuterJoinRels) {
				continue;
			}
			LeftOuterJoinRels link = (LeftOuterJoinRels) linkObject;
			if (LeftOuterJoinRelsEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.LeftOuterJoinRels_4002,
					LeftOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getContainedTypeModelFacetLinks_RightOuterJoinRels_4003(
			TableListInstalment container) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RightOuterJoinRels) {
				continue;
			}
			RightOuterJoinRels link = (RightOuterJoinRels) linkObject;
			if (RightOuterJoinRelsEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.RightOuterJoinRels_4003,
					RightOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getContainedTypeModelFacetLinks_FullOuterJoinRels_4004(
			TableListInstalment container) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof FullOuterJoinRels) {
				continue;
			}
			FullOuterJoinRels link = (FullOuterJoinRels) linkObject;
			if (FullOuterJoinRelsEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.FullOuterJoinRels_4004,
					FullOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getContainedTypeModelFacetLinks_EqualLink_4006(Term container) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof EqualLink) {
			return result;
		}
		EqualLink link = (EqualLink) linkObject;
		if (EqualLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.EqualLink_4006,
				EqualLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getContainedTypeModelFacetLinks_GreaterThanLink_4007(
			Term container) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof GreaterThanLink) {
			return result;
		}
		GreaterThanLink link = (GreaterThanLink) linkObject;
		if (GreaterThanLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.GreaterThanLink_4007,
				GreaterThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getContainedTypeModelFacetLinks_GreaterEqualThanLink_4008(
			Term container) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof GreaterEqualThanLink) {
			return result;
		}
		GreaterEqualThanLink link = (GreaterEqualThanLink) linkObject;
		if (GreaterEqualThanLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.GreaterEqualThanLink_4008,
				GreaterEqualThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getContainedTypeModelFacetLinks_LowerThanLink_4009(Term container) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LowerThanLink) {
			return result;
		}
		LowerThanLink link = (LowerThanLink) linkObject;
		if (LowerThanLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.LowerThanLink_4009,
				LowerThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getContainedTypeModelFacetLinks_LowerEqualThanLink_4010(
			Term container) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LowerEqualThanLink) {
			return result;
		}
		LowerEqualThanLink link = (LowerEqualThanLink) linkObject;
		if (LowerEqualThanLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.LowerEqualThanLink_4010,
				LowerEqualThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getContainedTypeModelFacetLinks_InLink_4011(Term container) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof InLink) {
			return result;
		}
		InLink link = (InLink) linkObject;
		if (InLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.InLink_4011, InLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getContainedTypeModelFacetLinks_LikeLink_4012(Term container) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LikeLink) {
			return result;
		}
		LikeLink link = (LikeLink) linkObject;
		if (LikeLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		result.add(
				new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.LikeLink_4012, LikeLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getContainedTypeModelFacetLinks_JuncRelationship_4013(
			ConditionInstalment container) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof JuncRelationship) {
				continue;
			}
			JuncRelationship link = (JuncRelationship) linkObject;
			if (JuncRelationshipEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConditionElement dst = link.getTarget();
			Junction src = link.getSource();
			result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.JuncRelationship_4013,
					JuncRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeleteLinkDescriptor> getIncomingTypeModelFacetLinks_InnerjoinRels_4001(Field target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeletePackage.eINSTANCE.getRelationSelect_Target()
					|| false == setting.getEObject() instanceof InnerjoinRels) {
				continue;
			}
			InnerjoinRels link = (InnerjoinRels) setting.getEObject();
			if (InnerjoinRelsEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field src = link.getSource();
			result.add(new DeleteLinkDescriptor(src, target, link, DeleteElementTypes.InnerjoinRels_4001,
					InnerjoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeleteLinkDescriptor> getIncomingTypeModelFacetLinks_LeftOuterJoinRels_4002(Field target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeletePackage.eINSTANCE.getRelationSelect_Target()
					|| false == setting.getEObject() instanceof LeftOuterJoinRels) {
				continue;
			}
			LeftOuterJoinRels link = (LeftOuterJoinRels) setting.getEObject();
			if (LeftOuterJoinRelsEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field src = link.getSource();
			result.add(new DeleteLinkDescriptor(src, target, link, DeleteElementTypes.LeftOuterJoinRels_4002,
					LeftOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeleteLinkDescriptor> getIncomingTypeModelFacetLinks_RightOuterJoinRels_4003(Field target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeletePackage.eINSTANCE.getRelationSelect_Target()
					|| false == setting.getEObject() instanceof RightOuterJoinRels) {
				continue;
			}
			RightOuterJoinRels link = (RightOuterJoinRels) setting.getEObject();
			if (RightOuterJoinRelsEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field src = link.getSource();
			result.add(new DeleteLinkDescriptor(src, target, link, DeleteElementTypes.RightOuterJoinRels_4003,
					RightOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeleteLinkDescriptor> getIncomingTypeModelFacetLinks_FullOuterJoinRels_4004(Field target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeletePackage.eINSTANCE.getRelationSelect_Target()
					|| false == setting.getEObject() instanceof FullOuterJoinRels) {
				continue;
			}
			FullOuterJoinRels link = (FullOuterJoinRels) setting.getEObject();
			if (FullOuterJoinRelsEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field src = link.getSource();
			result.add(new DeleteLinkDescriptor(src, target, link, DeleteElementTypes.FullOuterJoinRels_4004,
					FullOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeleteLinkDescriptor> getIncomingTypeModelFacetLinks_EqualLink_4006(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeletePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof EqualLink) {
				continue;
			}
			EqualLink link = (EqualLink) setting.getEObject();
			if (EqualLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new DeleteLinkDescriptor(src, target, link, DeleteElementTypes.EqualLink_4006,
					EqualLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeleteLinkDescriptor> getIncomingTypeModelFacetLinks_GreaterThanLink_4007(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeletePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof GreaterThanLink) {
				continue;
			}
			GreaterThanLink link = (GreaterThanLink) setting.getEObject();
			if (GreaterThanLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new DeleteLinkDescriptor(src, target, link, DeleteElementTypes.GreaterThanLink_4007,
					GreaterThanLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeleteLinkDescriptor> getIncomingTypeModelFacetLinks_GreaterEqualThanLink_4008(
			Node target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeletePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof GreaterEqualThanLink) {
				continue;
			}
			GreaterEqualThanLink link = (GreaterEqualThanLink) setting.getEObject();
			if (GreaterEqualThanLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new DeleteLinkDescriptor(src, target, link, DeleteElementTypes.GreaterEqualThanLink_4008,
					GreaterEqualThanLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeleteLinkDescriptor> getIncomingTypeModelFacetLinks_LowerThanLink_4009(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeletePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof LowerThanLink) {
				continue;
			}
			LowerThanLink link = (LowerThanLink) setting.getEObject();
			if (LowerThanLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new DeleteLinkDescriptor(src, target, link, DeleteElementTypes.LowerThanLink_4009,
					LowerThanLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeleteLinkDescriptor> getIncomingTypeModelFacetLinks_LowerEqualThanLink_4010(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeletePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof LowerEqualThanLink) {
				continue;
			}
			LowerEqualThanLink link = (LowerEqualThanLink) setting.getEObject();
			if (LowerEqualThanLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new DeleteLinkDescriptor(src, target, link, DeleteElementTypes.LowerEqualThanLink_4010,
					LowerEqualThanLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeleteLinkDescriptor> getIncomingTypeModelFacetLinks_InLink_4011(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeletePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof InLink) {
				continue;
			}
			InLink link = (InLink) setting.getEObject();
			if (InLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new DeleteLinkDescriptor(src, target, link, DeleteElementTypes.InLink_4011,
					InLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeleteLinkDescriptor> getIncomingTypeModelFacetLinks_LikeLink_4012(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeletePackage.eINSTANCE.getConditionLink_Dst()
					|| false == setting.getEObject() instanceof LikeLink) {
				continue;
			}
			LikeLink link = (LikeLink) setting.getEObject();
			if (LikeLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSrc();
			result.add(new DeleteLinkDescriptor(src, target, link, DeleteElementTypes.LikeLink_4012,
					LikeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeleteLinkDescriptor> getIncomingTypeModelFacetLinks_JuncRelationship_4013(
			AbstractConditionElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeletePackage.eINSTANCE.getJuncRelationship_Target()
					|| false == setting.getEObject() instanceof JuncRelationship) {
				continue;
			}
			JuncRelationship link = (JuncRelationship) setting.getEObject();
			if (JuncRelationshipEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Junction src = link.getSource();
			result.add(new DeleteLinkDescriptor(src, target, link, DeleteElementTypes.JuncRelationship_4013,
					JuncRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getOutgoingTypeModelFacetLinks_InnerjoinRels_4001(Field source) {
		TableListInstalment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof TableListInstalment) {
				container = (TableListInstalment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InnerjoinRels) {
				continue;
			}
			InnerjoinRels link = (InnerjoinRels) linkObject;
			if (InnerjoinRelsEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.InnerjoinRels_4001,
					InnerjoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getOutgoingTypeModelFacetLinks_LeftOuterJoinRels_4002(
			Field source) {
		TableListInstalment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof TableListInstalment) {
				container = (TableListInstalment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LeftOuterJoinRels) {
				continue;
			}
			LeftOuterJoinRels link = (LeftOuterJoinRels) linkObject;
			if (LeftOuterJoinRelsEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.LeftOuterJoinRels_4002,
					LeftOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getOutgoingTypeModelFacetLinks_RightOuterJoinRels_4003(
			Field source) {
		TableListInstalment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof TableListInstalment) {
				container = (TableListInstalment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RightOuterJoinRels) {
				continue;
			}
			RightOuterJoinRels link = (RightOuterJoinRels) linkObject;
			if (RightOuterJoinRelsEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.RightOuterJoinRels_4003,
					RightOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getOutgoingTypeModelFacetLinks_FullOuterJoinRels_4004(
			Field source) {
		TableListInstalment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof TableListInstalment) {
				container = (TableListInstalment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		for (Iterator<?> links = container.getRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof FullOuterJoinRels) {
				continue;
			}
			FullOuterJoinRels link = (FullOuterJoinRels) linkObject;
			if (FullOuterJoinRelsEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Field dst = link.getTarget();
			Field src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.FullOuterJoinRels_4004,
					FullOuterJoinRelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getOutgoingTypeModelFacetLinks_EqualLink_4006(Node source) {
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
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof EqualLink) {
			return result;
		}
		EqualLink link = (EqualLink) linkObject;
		if (EqualLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.EqualLink_4006,
				EqualLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getOutgoingTypeModelFacetLinks_GreaterThanLink_4007(Node source) {
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
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof GreaterThanLink) {
			return result;
		}
		GreaterThanLink link = (GreaterThanLink) linkObject;
		if (GreaterThanLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.GreaterThanLink_4007,
				GreaterThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getOutgoingTypeModelFacetLinks_GreaterEqualThanLink_4008(
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
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof GreaterEqualThanLink) {
			return result;
		}
		GreaterEqualThanLink link = (GreaterEqualThanLink) linkObject;
		if (GreaterEqualThanLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.GreaterEqualThanLink_4008,
				GreaterEqualThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getOutgoingTypeModelFacetLinks_LowerThanLink_4009(Node source) {
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
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LowerThanLink) {
			return result;
		}
		LowerThanLink link = (LowerThanLink) linkObject;
		if (LowerThanLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.LowerThanLink_4009,
				LowerThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getOutgoingTypeModelFacetLinks_LowerEqualThanLink_4010(
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
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LowerEqualThanLink) {
			return result;
		}
		LowerEqualThanLink link = (LowerEqualThanLink) linkObject;
		if (LowerEqualThanLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.LowerEqualThanLink_4010,
				LowerEqualThanLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getOutgoingTypeModelFacetLinks_InLink_4011(Node source) {
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
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof InLink) {
			return result;
		}
		InLink link = (InLink) linkObject;
		if (InLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.InLink_4011, InLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getOutgoingTypeModelFacetLinks_LikeLink_4012(Node source) {
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
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		ConditionLink linkObject = container.getLink();
		if (false == linkObject instanceof LikeLink) {
			return result;
		}
		LikeLink link = (LikeLink) linkObject;
		if (LikeLinkEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getDst();
		Node src = link.getSrc();
		if (src != source) {
			return result;
		}
		result.add(
				new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.LikeLink_4012, LikeLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DeleteLinkDescriptor> getOutgoingTypeModelFacetLinks_JuncRelationship_4013(
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
		LinkedList<DeleteLinkDescriptor> result = new LinkedList<DeleteLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof JuncRelationship) {
				continue;
			}
			JuncRelationship link = (JuncRelationship) linkObject;
			if (JuncRelationshipEditPart.VISUAL_ID != DeleteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConditionElement dst = link.getTarget();
			Junction src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DeleteLinkDescriptor(src, dst, link, DeleteElementTypes.JuncRelationship_4013,
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

		public List<DeleteNodeDescriptor> getSemanticChildren(View view) {
			return DeleteDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DeleteLinkDescriptor> getContainedLinks(View view) {
			return DeleteDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DeleteLinkDescriptor> getIncomingLinks(View view) {
			return DeleteDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DeleteLinkDescriptor> getOutgoingLinks(View view) {
			return DeleteDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
