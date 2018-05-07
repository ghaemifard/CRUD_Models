/*
* 
*/
package insert.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import insert.CallSurfaceQuery;
import insert.Field;
import insert.Function;
import insert.InputDef;
import insert.InputInstalment;
import insert.InsertSurface;
import insert.Node;
import insert.PrepareList;
import insert.Table;
import insert.diagram.edit.parts.CallSurfaceQuery2EditPart;
import insert.diagram.edit.parts.CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart;
import insert.diagram.edit.parts.CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart;
import insert.diagram.edit.parts.CallSurfaceQueryEditPart;
import insert.diagram.edit.parts.Field2EditPart;
import insert.diagram.edit.parts.Field3EditPart;
import insert.diagram.edit.parts.FieldEditPart;
import insert.diagram.edit.parts.Function2EditPart;
import insert.diagram.edit.parts.FunctionEditPart;
import insert.diagram.edit.parts.FunctionFunctionParamsCompartment2EditPart;
import insert.diagram.edit.parts.FunctionFunctionParamsCompartmentEditPart;
import insert.diagram.edit.parts.Input2EditPart;
import insert.diagram.edit.parts.InputBitsDefEditPart;
import insert.diagram.edit.parts.InputDateDefEditPart;
import insert.diagram.edit.parts.InputEditPart;
import insert.diagram.edit.parts.InputFloatDefEditPart;
import insert.diagram.edit.parts.InputInstalmentEditPart;
import insert.diagram.edit.parts.InputInstalmentInputInstalmentInputsCompartmentEditPart;
import insert.diagram.edit.parts.InputIntDefEditPart;
import insert.diagram.edit.parts.InputStringDefEditPart;
import insert.diagram.edit.parts.InsertSurfaceEditPart;
import insert.diagram.edit.parts.Literal2EditPart;
import insert.diagram.edit.parts.LiteralEditPart;
import insert.diagram.edit.parts.NullLiteral2EditPart;
import insert.diagram.edit.parts.NullLiteralEditPart;
import insert.diagram.edit.parts.PrepareListEditPart;
import insert.diagram.edit.parts.PrepareListPrepareListNodesCompartmentEditPart;
import insert.diagram.edit.parts.TableEditPart;
import insert.diagram.edit.parts.TableTableFieldsCompartmentEditPart;

/**
 * @generated
 */
public class InsertDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<InsertNodeDescriptor> getSemanticChildren(View view) {
		switch (InsertVisualIDRegistry.getVisualID(view)) {
		case InsertSurfaceEditPart.VISUAL_ID:
			return getInsertSurface_1000SemanticChildren(view);
		case TableTableFieldsCompartmentEditPart.VISUAL_ID:
			return getTableTableFieldsCompartment_7008SemanticChildren(view);
		case InputInstalmentInputInstalmentInputsCompartmentEditPart.VISUAL_ID:
			return getInputInstalmentInputInstalmentInputsCompartment_7002SemanticChildren(view);
		case PrepareListPrepareListNodesCompartmentEditPart.VISUAL_ID:
			return getPrepareListPrepareListNodesCompartment_7003SemanticChildren(view);
		case CallSurfaceQueryCallSurfaceQueryParamsCompartmentEditPart.VISUAL_ID:
			return getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7004SemanticChildren(view);
		case CallSurfaceQueryCallSurfaceQueryParamsCompartment2EditPart.VISUAL_ID:
			return getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7005SemanticChildren(view);
		case FunctionFunctionParamsCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionParamsCompartment_7006SemanticChildren(view);
		case FunctionFunctionParamsCompartment2EditPart.VISUAL_ID:
			return getFunctionFunctionParamsCompartment_7007SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<InsertNodeDescriptor> getInsertSurface_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		InsertSurface modelElement = (InsertSurface) view.getElement();
		LinkedList<InsertNodeDescriptor> result = new LinkedList<InsertNodeDescriptor>();
		{
			Table childElement = modelElement.getTableInstalment();
			int visualID = InsertVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
			}
		}
		{
			InputInstalment childElement = modelElement.getInputInstalment();
			int visualID = InsertVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputInstalmentEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
			}
		}
		{
			PrepareList childElement = modelElement.getPrepareList();
			int visualID = InsertVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PrepareListEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<InsertNodeDescriptor> getTableTableFieldsCompartment_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<InsertNodeDescriptor> result = new LinkedList<InsertNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFields().iterator(); it.hasNext();) {
			Field childElement = (Field) it.next();
			int visualID = InsertVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<InsertNodeDescriptor> getInputInstalmentInputInstalmentInputsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InputInstalment modelElement = (InputInstalment) containerView.getElement();
		LinkedList<InsertNodeDescriptor> result = new LinkedList<InsertNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputDef childElement = (InputDef) it.next();
			int visualID = InsertVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputStringDefEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputIntDefEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputDateDefEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputBitsDefEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputFloatDefEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<InsertNodeDescriptor> getPrepareListPrepareListNodesCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PrepareList modelElement = (PrepareList) containerView.getElement();
		LinkedList<InsertNodeDescriptor> result = new LinkedList<InsertNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = InsertVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQueryEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field3EditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Literal2EditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteral2EditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Function2EditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input2EditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<InsertNodeDescriptor> getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CallSurfaceQuery modelElement = (CallSurfaceQuery) containerView.getElement();
		LinkedList<InsertNodeDescriptor> result = new LinkedList<InsertNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = InsertVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<InsertNodeDescriptor> getCallSurfaceQueryCallSurfaceQueryParamsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CallSurfaceQuery modelElement = (CallSurfaceQuery) containerView.getElement();
		LinkedList<InsertNodeDescriptor> result = new LinkedList<InsertNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = InsertVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<InsertNodeDescriptor> getFunctionFunctionParamsCompartment_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<InsertNodeDescriptor> result = new LinkedList<InsertNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = InsertVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<InsertNodeDescriptor> getFunctionFunctionParamsCompartment_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<InsertNodeDescriptor> result = new LinkedList<InsertNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParams().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = InsertVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallSurfaceQuery2EditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LiteralEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullLiteralEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new InsertNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<InsertLinkDescriptor> getContainedLinks(View view) {
		switch (InsertVisualIDRegistry.getVisualID(view)) {
		case InsertSurfaceEditPart.VISUAL_ID:
			return getInsertSurface_1000ContainedLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_2004ContainedLinks(view);
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2002ContainedLinks(view);
		case PrepareListEditPart.VISUAL_ID:
			return getPrepareList_2003ContainedLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3018ContainedLinks(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3002ContainedLinks(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3003ContainedLinks(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3004ContainedLinks(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3005ContainedLinks(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3019ContainedLinks(view);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getCallSurfaceQuery_3006ContainedLinks(view);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3007ContainedLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3008ContainedLinks(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3009ContainedLinks(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3010ContainedLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3011ContainedLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3012ContainedLinks(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3013ContainedLinks(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3014ContainedLinks(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3015ContainedLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3016ContainedLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3017ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<InsertLinkDescriptor> getIncomingLinks(View view) {
		switch (InsertVisualIDRegistry.getVisualID(view)) {
		case TableEditPart.VISUAL_ID:
			return getTable_2004IncomingLinks(view);
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2002IncomingLinks(view);
		case PrepareListEditPart.VISUAL_ID:
			return getPrepareList_2003IncomingLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3018IncomingLinks(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3002IncomingLinks(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3003IncomingLinks(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3004IncomingLinks(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3005IncomingLinks(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3019IncomingLinks(view);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getCallSurfaceQuery_3006IncomingLinks(view);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3007IncomingLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3008IncomingLinks(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3009IncomingLinks(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3010IncomingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3011IncomingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3012IncomingLinks(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3013IncomingLinks(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3014IncomingLinks(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3015IncomingLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3016IncomingLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3017IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<InsertLinkDescriptor> getOutgoingLinks(View view) {
		switch (InsertVisualIDRegistry.getVisualID(view)) {
		case TableEditPart.VISUAL_ID:
			return getTable_2004OutgoingLinks(view);
		case InputInstalmentEditPart.VISUAL_ID:
			return getInputInstalment_2002OutgoingLinks(view);
		case PrepareListEditPart.VISUAL_ID:
			return getPrepareList_2003OutgoingLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_3018OutgoingLinks(view);
		case InputStringDefEditPart.VISUAL_ID:
			return getInputStringDef_3002OutgoingLinks(view);
		case InputIntDefEditPart.VISUAL_ID:
			return getInputIntDef_3003OutgoingLinks(view);
		case InputDateDefEditPart.VISUAL_ID:
			return getInputDateDef_3004OutgoingLinks(view);
		case InputBitsDefEditPart.VISUAL_ID:
			return getInputBitsDef_3005OutgoingLinks(view);
		case InputFloatDefEditPart.VISUAL_ID:
			return getInputFloatDef_3019OutgoingLinks(view);
		case CallSurfaceQueryEditPart.VISUAL_ID:
			return getCallSurfaceQuery_3006OutgoingLinks(view);
		case CallSurfaceQuery2EditPart.VISUAL_ID:
			return getCallSurfaceQuery_3007OutgoingLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_3008OutgoingLinks(view);
		case LiteralEditPart.VISUAL_ID:
			return getLiteral_3009OutgoingLinks(view);
		case NullLiteralEditPart.VISUAL_ID:
			return getNullLiteral_3010OutgoingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3011OutgoingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3012OutgoingLinks(view);
		case Field3EditPart.VISUAL_ID:
			return getField_3013OutgoingLinks(view);
		case Literal2EditPart.VISUAL_ID:
			return getLiteral_3014OutgoingLinks(view);
		case NullLiteral2EditPart.VISUAL_ID:
			return getNullLiteral_3015OutgoingLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3016OutgoingLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3017OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInsertSurface_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getTable_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputInstalment_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getPrepareList_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getField_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputStringDef_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputIntDef_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputDateDef_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputBitsDef_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<InsertLinkDescriptor> getInputFloatDef_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getCallSurfaceQuery_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getCallSurfaceQuery_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getField_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getLiteral_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getNullLiteral_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getFunction_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInput_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getField_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getLiteral_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getNullLiteral_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getFunction_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInput_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getTable_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputInstalment_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getPrepareList_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getField_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputStringDef_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputIntDef_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputDateDef_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputBitsDef_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<InsertLinkDescriptor> getInputFloatDef_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getCallSurfaceQuery_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getCallSurfaceQuery_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getField_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getLiteral_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getNullLiteral_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getFunction_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInput_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getField_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getLiteral_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getNullLiteral_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getFunction_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInput_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getTable_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputInstalment_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getPrepareList_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getField_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputStringDef_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputIntDef_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputDateDef_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInputBitsDef_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<InsertLinkDescriptor> getInputFloatDef_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getCallSurfaceQuery_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getCallSurfaceQuery_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getField_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getLiteral_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getNullLiteral_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getFunction_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInput_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getField_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getLiteral_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getNullLiteral_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getFunction_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InsertLinkDescriptor> getInput_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<InsertNodeDescriptor> getSemanticChildren(View view) {
			return InsertDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<InsertLinkDescriptor> getContainedLinks(View view) {
			return InsertDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<InsertLinkDescriptor> getIncomingLinks(View view) {
			return InsertDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<InsertLinkDescriptor> getOutgoingLinks(View view) {
			return InsertDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
