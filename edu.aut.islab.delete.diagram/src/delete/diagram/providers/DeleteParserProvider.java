/*
 * 
 */
package delete.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

import delete.DeletePackage;
import delete.diagram.edit.parts.CallSurfaceQueryColumn_nameName2EditPart;
import delete.diagram.edit.parts.CallSurfaceQueryColumn_nameName3EditPart;
import delete.diagram.edit.parts.CallSurfaceQueryColumn_nameNameEditPart;
import delete.diagram.edit.parts.CallSurfaceQueryName2EditPart;
import delete.diagram.edit.parts.CallSurfaceQueryName3EditPart;
import delete.diagram.edit.parts.CallSurfaceQueryNameEditPart;
import delete.diagram.edit.parts.ConditionInstalmentNameEditPart;
import delete.diagram.edit.parts.DummyNameEditPart;
import delete.diagram.edit.parts.EqualLinkDescEditPart;
import delete.diagram.edit.parts.FieldColumn_name2EditPart;
import delete.diagram.edit.parts.FieldColumn_name3EditPart;
import delete.diagram.edit.parts.FieldColumn_name4EditPart;
import delete.diagram.edit.parts.FieldColumn_nameEditPart;
import delete.diagram.edit.parts.FieldColumn_nameName2EditPart;
import delete.diagram.edit.parts.FieldColumn_nameName3EditPart;
import delete.diagram.edit.parts.FieldColumn_nameName4EditPart;
import delete.diagram.edit.parts.FieldColumn_nameNameEditPart;
import delete.diagram.edit.parts.FieldSPointerNameEditPart;
import delete.diagram.edit.parts.FullOuterJoinRelsTypeEditPart;
import delete.diagram.edit.parts.FunctionColumn_nameName2EditPart;
import delete.diagram.edit.parts.FunctionColumn_nameName3EditPart;
import delete.diagram.edit.parts.FunctionColumn_nameNameEditPart;
import delete.diagram.edit.parts.FunctionName2EditPart;
import delete.diagram.edit.parts.FunctionName3EditPart;
import delete.diagram.edit.parts.FunctionNameEditPart;
import delete.diagram.edit.parts.GreaterEqualThanLinkDescEditPart;
import delete.diagram.edit.parts.GreaterThanLinkDescEditPart;
import delete.diagram.edit.parts.InLinkDescEditPart;
import delete.diagram.edit.parts.InnerjoinRelsTypeEditPart;
import delete.diagram.edit.parts.InputBitsDefNameEditPart;
import delete.diagram.edit.parts.InputColumn_name2EditPart;
import delete.diagram.edit.parts.InputColumn_name3EditPart;
import delete.diagram.edit.parts.InputColumn_nameEditPart;
import delete.diagram.edit.parts.InputDateDefNameEditPart;
import delete.diagram.edit.parts.InputFloatDefNameEditPart;
import delete.diagram.edit.parts.InputInstalmentNameEditPart;
import delete.diagram.edit.parts.InputIntDefNameEditPart;
import delete.diagram.edit.parts.InputStringDefNameEditPart;
import delete.diagram.edit.parts.JuncRelationshipIndexEditPart;
import delete.diagram.edit.parts.JunctionTypeEditPart;
import delete.diagram.edit.parts.LeftOuterJoinRelsTypeEditPart;
import delete.diagram.edit.parts.LikeLinkDescEditPart;
import delete.diagram.edit.parts.LiteralColumn_nameValue2EditPart;
import delete.diagram.edit.parts.LiteralColumn_nameValue3EditPart;
import delete.diagram.edit.parts.LiteralColumn_nameValueEditPart;
import delete.diagram.edit.parts.LiteralValue2EditPart;
import delete.diagram.edit.parts.LiteralValue3EditPart;
import delete.diagram.edit.parts.LiteralValueEditPart;
import delete.diagram.edit.parts.LowerEqualThanLinkDescEditPart;
import delete.diagram.edit.parts.LowerThanLinkDescEditPart;
import delete.diagram.edit.parts.MyTableNameAlias2EditPart;
import delete.diagram.edit.parts.MyTableNameAliasEditPart;
import delete.diagram.edit.parts.NullLiteralColumn_name2EditPart;
import delete.diagram.edit.parts.NullLiteralColumn_name3EditPart;
import delete.diagram.edit.parts.NullLiteralColumn_nameEditPart;
import delete.diagram.edit.parts.NullLiteralValue2EditPart;
import delete.diagram.edit.parts.NullLiteralValue3EditPart;
import delete.diagram.edit.parts.NullLiteralValueEditPart;
import delete.diagram.edit.parts.RightOuterJoinRelsTypeEditPart;
import delete.diagram.edit.parts.RootJunctionTypeEditPart;
import delete.diagram.edit.parts.SortInstalmentNameEditPart;
import delete.diagram.edit.parts.TableListInstalmentNameEditPart;
import delete.diagram.edit.parts.TermTitleEditPart;
import delete.diagram.parsers.MessageFormatParser;
import delete.diagram.part.DeleteVisualIDRegistry;

/**
 * @generated
 */
public class DeleteParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser inputInstalmentName_5005Parser;

	/**
	* @generated
	*/
	private IParser getInputInstalmentName_5005Parser() {
		if (inputInstalmentName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getInputInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputInstalmentName_5005Parser = parser;
		}
		return inputInstalmentName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser tableListInstalmentName_5008Parser;

	/**
	* @generated
	*/
	private IParser getTableListInstalmentName_5008Parser() {
		if (tableListInstalmentName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getTableListInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableListInstalmentName_5008Parser = parser;
		}
		return tableListInstalmentName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser conditionInstalmentName_5047Parser;

	/**
	* @generated
	*/
	private IParser getConditionInstalmentName_5047Parser() {
		if (conditionInstalmentName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getConditionInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionInstalmentName_5047Parser = parser;
		}
		return conditionInstalmentName_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser sortInstalmentName_5049Parser;

	/**
	* @generated
	*/
	private IParser getSortInstalmentName_5049Parser() {
		if (sortInstalmentName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getSortInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sortInstalmentName_5049Parser = parser;
		}
		return sortInstalmentName_5049Parser;
	}

	/**
	* @generated
	*/
	private IParser dummyName_5057Parser;

	/**
	* @generated
	*/
	private IParser getDummyName_5057Parser() {
		if (dummyName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getDummy_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dummyName_5057Parser = parser;
		}
		return dummyName_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser inputStringDefName_5001Parser;

	/**
	* @generated
	*/
	private IParser getInputStringDefName_5001Parser() {
		if (inputStringDefName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputStringDefName_5001Parser = parser;
		}
		return inputStringDefName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser inputIntDefName_5002Parser;

	/**
	* @generated
	*/
	private IParser getInputIntDefName_5002Parser() {
		if (inputIntDefName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputIntDefName_5002Parser = parser;
		}
		return inputIntDefName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser inputDateDefName_5003Parser;

	/**
	* @generated
	*/
	private IParser getInputDateDefName_5003Parser() {
		if (inputDateDefName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputDateDefName_5003Parser = parser;
		}
		return inputDateDefName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser inputBitsDefName_5004Parser;

	/**
	* @generated
	*/
	private IParser getInputBitsDefName_5004Parser() {
		if (inputBitsDefName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputBitsDefName_5004Parser = parser;
		}
		return inputBitsDefName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser inputFloatDefName_5041Parser;

	/**
	* @generated
	*/
	private IParser getInputFloatDefName_5041Parser() {
		if (inputFloatDefName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputFloatDefName_5041Parser = parser;
		}
		return inputFloatDefName_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser myTableNameAlias_5059Parser;

	/**
	* @generated
	*/
	private IParser getMyTableNameAlias_5059Parser() {
		if (myTableNameAlias_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getMyTable_Name(),
					DeletePackage.eINSTANCE.getMyTable_Alias() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			myTableNameAlias_5059Parser = parser;
		}
		return myTableNameAlias_5059Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldColumn_name_5058Parser;

	/**
	* @generated
	*/
	private IParser getFieldColumn_name_5058Parser() {
		if (fieldColumn_name_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			fieldColumn_name_5058Parser = parser;
		}
		return fieldColumn_name_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser rootJunctionType_5044Parser;

	/**
	* @generated
	*/
	private IParser getRootJunctionType_5044Parser() {
		if (rootJunctionType_5044Parser == null) {
			EAttribute editableFeature = DeletePackage.eINSTANCE.getJunction_Type();
			EnumParser parser = new EnumParser(editableFeature);
			rootJunctionType_5044Parser = parser;
		}
		return rootJunctionType_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser junctionType_5045Parser;

	/**
	* @generated
	*/
	private IParser getJunctionType_5045Parser() {
		if (junctionType_5045Parser == null) {
			EAttribute editableFeature = DeletePackage.eINSTANCE.getJunction_Type();
			EnumParser parser = new EnumParser(editableFeature);
			junctionType_5045Parser = parser;
		}
		return junctionType_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser termTitle_5046Parser;

	/**
	* @generated
	*/
	private IParser getTermTitle_5046Parser() {
		if (termTitle_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getTerm_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			termTitle_5046Parser = parser;
		}
		return termTitle_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser callSurfaceQueryName_5028Parser;

	/**
	* @generated
	*/
	private IParser getCallSurfaceQueryName_5028Parser() {
		if (callSurfaceQueryName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			callSurfaceQueryName_5028Parser = parser;
		}
		return callSurfaceQueryName_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser callSurfaceQueryName_5021Parser;

	/**
	* @generated
	*/
	private IParser getCallSurfaceQueryName_5021Parser() {
		if (callSurfaceQueryName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			callSurfaceQueryName_5021Parser = parser;
		}
		return callSurfaceQueryName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldColumn_name_5016Parser;

	/**
	* @generated
	*/
	private IParser getFieldColumn_name_5016Parser() {
		if (fieldColumn_name_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			fieldColumn_name_5016Parser = parser;
		}
		return fieldColumn_name_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser literalValue_5017Parser;

	/**
	* @generated
	*/
	private IParser getLiteralValue_5017Parser() {
		if (literalValue_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			literalValue_5017Parser = parser;
		}
		return literalValue_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser nullLiteralValue_5018Parser;

	/**
	* @generated
	*/
	private IParser getNullLiteralValue_5018Parser() {
		if (nullLiteralValue_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getNullLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			nullLiteralValue_5018Parser = parser;
		}
		return nullLiteralValue_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser functionName_5020Parser;

	/**
	* @generated
	*/
	private IParser getFunctionName_5020Parser() {
		if (functionName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			functionName_5020Parser = parser;
		}
		return functionName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser inputColumn_name_5019Parser;

	/**
	* @generated
	*/
	private IParser getInputColumn_name_5019Parser() {
		if (inputColumn_name_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputColumn_name_5019Parser = parser;
		}
		return inputColumn_name_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldColumn_name_5014Parser;

	/**
	* @generated
	*/
	private IParser getFieldColumn_name_5014Parser() {
		if (fieldColumn_name_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			fieldColumn_name_5014Parser = parser;
		}
		return fieldColumn_name_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser literalValue_5029Parser;

	/**
	* @generated
	*/
	private IParser getLiteralValue_5029Parser() {
		if (literalValue_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			literalValue_5029Parser = parser;
		}
		return literalValue_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser nullLiteralValue_5030Parser;

	/**
	* @generated
	*/
	private IParser getNullLiteralValue_5030Parser() {
		if (nullLiteralValue_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getNullLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			nullLiteralValue_5030Parser = parser;
		}
		return nullLiteralValue_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser functionName_5031Parser;

	/**
	* @generated
	*/
	private IParser getFunctionName_5031Parser() {
		if (functionName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			functionName_5031Parser = parser;
		}
		return functionName_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser inputColumn_name_5032Parser;

	/**
	* @generated
	*/
	private IParser getInputColumn_name_5032Parser() {
		if (inputColumn_name_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputColumn_name_5032Parser = parser;
		}
		return inputColumn_name_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldSPointerName_5048Parser;

	/**
	* @generated
	*/
	private IParser getFieldSPointerName_5048Parser() {
		if (fieldSPointerName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getFieldSPointer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fieldSPointerName_5048Parser = parser;
		}
		return fieldSPointerName_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser callSurfaceQueryName_5050Parser;

	/**
	* @generated
	*/
	private IParser getCallSurfaceQueryName_5050Parser() {
		if (callSurfaceQueryName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			callSurfaceQueryName_5050Parser = parser;
		}
		return callSurfaceQueryName_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldColumn_name_5051Parser;

	/**
	* @generated
	*/
	private IParser getFieldColumn_name_5051Parser() {
		if (fieldColumn_name_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			fieldColumn_name_5051Parser = parser;
		}
		return fieldColumn_name_5051Parser;
	}

	/**
	* @generated
	*/
	private IParser literalValue_5052Parser;

	/**
	* @generated
	*/
	private IParser getLiteralValue_5052Parser() {
		if (literalValue_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			literalValue_5052Parser = parser;
		}
		return literalValue_5052Parser;
	}

	/**
	* @generated
	*/
	private IParser nullLiteralValue_5053Parser;

	/**
	* @generated
	*/
	private IParser getNullLiteralValue_5053Parser() {
		if (nullLiteralValue_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getNullLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			nullLiteralValue_5053Parser = parser;
		}
		return nullLiteralValue_5053Parser;
	}

	/**
	* @generated
	*/
	private IParser functionName_5054Parser;

	/**
	* @generated
	*/
	private IParser getFunctionName_5054Parser() {
		if (functionName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			functionName_5054Parser = parser;
		}
		return functionName_5054Parser;
	}

	/**
	* @generated
	*/
	private IParser inputColumn_name_5055Parser;

	/**
	* @generated
	*/
	private IParser getInputColumn_name_5055Parser() {
		if (inputColumn_name_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputColumn_name_5055Parser = parser;
		}
		return inputColumn_name_5055Parser;
	}

	/**
	* @generated
	*/
	private IParser myTableNameAlias_5060Parser;

	/**
	* @generated
	*/
	private IParser getMyTableNameAlias_5060Parser() {
		if (myTableNameAlias_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getMyTable_Name(),
					DeletePackage.eINSTANCE.getMyTable_Alias() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			myTableNameAlias_5060Parser = parser;
		}
		return myTableNameAlias_5060Parser;
	}

	/**
	* @generated
	*/
	private IParser innerjoinRelsType_6001Parser;

	/**
	* @generated
	*/
	private IParser getInnerjoinRelsType_6001Parser() {
		if (innerjoinRelsType_6001Parser == null) {
			EAttribute editableFeature = DeletePackage.eINSTANCE.getInnerjoinRels_Type();
			EnumParser parser = new EnumParser(editableFeature);
			innerjoinRelsType_6001Parser = parser;
		}
		return innerjoinRelsType_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser leftOuterJoinRelsType_6002Parser;

	/**
	* @generated
	*/
	private IParser getLeftOuterJoinRelsType_6002Parser() {
		if (leftOuterJoinRelsType_6002Parser == null) {
			EAttribute editableFeature = DeletePackage.eINSTANCE.getLeftOuterJoinRels_Type();
			EnumParser parser = new EnumParser(editableFeature);
			leftOuterJoinRelsType_6002Parser = parser;
		}
		return leftOuterJoinRelsType_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser rightOuterJoinRelsType_6003Parser;

	/**
	* @generated
	*/
	private IParser getRightOuterJoinRelsType_6003Parser() {
		if (rightOuterJoinRelsType_6003Parser == null) {
			EAttribute editableFeature = DeletePackage.eINSTANCE.getRightOuterJoinRels_Type();
			EnumParser parser = new EnumParser(editableFeature);
			rightOuterJoinRelsType_6003Parser = parser;
		}
		return rightOuterJoinRelsType_6003Parser;
	}

	/**
	* @generated
	*/
	private IParser fullOuterJoinRelsType_6004Parser;

	/**
	* @generated
	*/
	private IParser getFullOuterJoinRelsType_6004Parser() {
		if (fullOuterJoinRelsType_6004Parser == null) {
			EAttribute editableFeature = DeletePackage.eINSTANCE.getFullOuterJoinRels_Type();
			EnumParser parser = new EnumParser(editableFeature);
			fullOuterJoinRelsType_6004Parser = parser;
		}
		return fullOuterJoinRelsType_6004Parser;
	}

	/**
	* @generated
	*/
	private IParser equalLinkDesc_6006Parser;

	/**
	* @generated
	*/
	private IParser getEqualLinkDesc_6006Parser() {
		if (equalLinkDesc_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getEqualLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			equalLinkDesc_6006Parser = parser;
		}
		return equalLinkDesc_6006Parser;
	}

	/**
	* @generated
	*/
	private IParser greaterThanLinkDesc_6007Parser;

	/**
	* @generated
	*/
	private IParser getGreaterThanLinkDesc_6007Parser() {
		if (greaterThanLinkDesc_6007Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getGreaterThanLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			greaterThanLinkDesc_6007Parser = parser;
		}
		return greaterThanLinkDesc_6007Parser;
	}

	/**
	* @generated
	*/
	private IParser greaterEqualThanLinkDesc_6008Parser;

	/**
	* @generated
	*/
	private IParser getGreaterEqualThanLinkDesc_6008Parser() {
		if (greaterEqualThanLinkDesc_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getGreaterEqualThanLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			greaterEqualThanLinkDesc_6008Parser = parser;
		}
		return greaterEqualThanLinkDesc_6008Parser;
	}

	/**
	* @generated
	*/
	private IParser lowerThanLinkDesc_6009Parser;

	/**
	* @generated
	*/
	private IParser getLowerThanLinkDesc_6009Parser() {
		if (lowerThanLinkDesc_6009Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getLowerThanLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			lowerThanLinkDesc_6009Parser = parser;
		}
		return lowerThanLinkDesc_6009Parser;
	}

	/**
	* @generated
	*/
	private IParser lowerEqualThanLinkDesc_6010Parser;

	/**
	* @generated
	*/
	private IParser getLowerEqualThanLinkDesc_6010Parser() {
		if (lowerEqualThanLinkDesc_6010Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getLowerEqualThanLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			lowerEqualThanLinkDesc_6010Parser = parser;
		}
		return lowerEqualThanLinkDesc_6010Parser;
	}

	/**
	* @generated
	*/
	private IParser inLinkDesc_6011Parser;

	/**
	* @generated
	*/
	private IParser getInLinkDesc_6011Parser() {
		if (inLinkDesc_6011Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getInLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inLinkDesc_6011Parser = parser;
		}
		return inLinkDesc_6011Parser;
	}

	/**
	* @generated
	*/
	private IParser likeLinkDesc_6012Parser;

	/**
	* @generated
	*/
	private IParser getLikeLinkDesc_6012Parser() {
		if (likeLinkDesc_6012Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getLikeLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			likeLinkDesc_6012Parser = parser;
		}
		return likeLinkDesc_6012Parser;
	}

	/**
	* @generated
	*/
	private IParser juncRelationshipIndex_6013Parser;

	/**
	* @generated
	*/
	private IParser getJuncRelationshipIndex_6013Parser() {
		if (juncRelationshipIndex_6013Parser == null) {
			EAttribute[] features = new EAttribute[] { DeletePackage.eINSTANCE.getJuncRelationship_Index() };
			MessageFormatParser parser = new MessageFormatParser(features);
			juncRelationshipIndex_6013Parser = parser;
		}
		return juncRelationshipIndex_6013Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case InputInstalmentNameEditPart.VISUAL_ID:
			return getInputInstalmentName_5005Parser();
		case TableListInstalmentNameEditPart.VISUAL_ID:
			return getTableListInstalmentName_5008Parser();
		case ConditionInstalmentNameEditPart.VISUAL_ID:
			return getConditionInstalmentName_5047Parser();
		case SortInstalmentNameEditPart.VISUAL_ID:
			return getSortInstalmentName_5049Parser();
		case DummyNameEditPart.VISUAL_ID:
			return getDummyName_5057Parser();
		case InputStringDefNameEditPart.VISUAL_ID:
			return getInputStringDefName_5001Parser();
		case InputIntDefNameEditPart.VISUAL_ID:
			return getInputIntDefName_5002Parser();
		case InputDateDefNameEditPart.VISUAL_ID:
			return getInputDateDefName_5003Parser();
		case InputBitsDefNameEditPart.VISUAL_ID:
			return getInputBitsDefName_5004Parser();
		case InputFloatDefNameEditPart.VISUAL_ID:
			return getInputFloatDefName_5041Parser();
		case MyTableNameAliasEditPart.VISUAL_ID:
			return getMyTableNameAlias_5059Parser();
		case FieldColumn_nameEditPart.VISUAL_ID:
			return getFieldColumn_name_5058Parser();

		case RootJunctionTypeEditPart.VISUAL_ID:
			return getRootJunctionType_5044Parser();

		case JunctionTypeEditPart.VISUAL_ID:
			return getJunctionType_5045Parser();
		case TermTitleEditPart.VISUAL_ID:
			return getTermTitle_5046Parser();
		case CallSurfaceQueryNameEditPart.VISUAL_ID:
			return getCallSurfaceQueryName_5028Parser();
		case CallSurfaceQueryName2EditPart.VISUAL_ID:
			return getCallSurfaceQueryName_5021Parser();
		case FieldColumn_name2EditPart.VISUAL_ID:
			return getFieldColumn_name_5016Parser();
		case LiteralValueEditPart.VISUAL_ID:
			return getLiteralValue_5017Parser();
		case NullLiteralValueEditPart.VISUAL_ID:
			return getNullLiteralValue_5018Parser();
		case FunctionNameEditPart.VISUAL_ID:
			return getFunctionName_5020Parser();
		case InputColumn_nameEditPart.VISUAL_ID:
			return getInputColumn_name_5019Parser();
		case FieldColumn_name3EditPart.VISUAL_ID:
			return getFieldColumn_name_5014Parser();
		case LiteralValue2EditPart.VISUAL_ID:
			return getLiteralValue_5029Parser();
		case NullLiteralValue2EditPart.VISUAL_ID:
			return getNullLiteralValue_5030Parser();
		case FunctionName2EditPart.VISUAL_ID:
			return getFunctionName_5031Parser();
		case InputColumn_name2EditPart.VISUAL_ID:
			return getInputColumn_name_5032Parser();
		case FieldSPointerNameEditPart.VISUAL_ID:
			return getFieldSPointerName_5048Parser();
		case CallSurfaceQueryName3EditPart.VISUAL_ID:
			return getCallSurfaceQueryName_5050Parser();
		case FieldColumn_name4EditPart.VISUAL_ID:
			return getFieldColumn_name_5051Parser();
		case LiteralValue3EditPart.VISUAL_ID:
			return getLiteralValue_5052Parser();
		case NullLiteralValue3EditPart.VISUAL_ID:
			return getNullLiteralValue_5053Parser();
		case FunctionName3EditPart.VISUAL_ID:
			return getFunctionName_5054Parser();
		case InputColumn_name3EditPart.VISUAL_ID:
			return getInputColumn_name_5055Parser();
		case MyTableNameAlias2EditPart.VISUAL_ID:
			return getMyTableNameAlias_5060Parser();

		case InnerjoinRelsTypeEditPart.VISUAL_ID:
			return getInnerjoinRelsType_6001Parser();

		case LeftOuterJoinRelsTypeEditPart.VISUAL_ID:
			return getLeftOuterJoinRelsType_6002Parser();

		case RightOuterJoinRelsTypeEditPart.VISUAL_ID:
			return getRightOuterJoinRelsType_6003Parser();

		case FullOuterJoinRelsTypeEditPart.VISUAL_ID:
			return getFullOuterJoinRelsType_6004Parser();
		case EqualLinkDescEditPart.VISUAL_ID:
			return getEqualLinkDesc_6006Parser();
		case GreaterThanLinkDescEditPart.VISUAL_ID:
			return getGreaterThanLinkDesc_6007Parser();
		case GreaterEqualThanLinkDescEditPart.VISUAL_ID:
			return getGreaterEqualThanLinkDesc_6008Parser();
		case LowerThanLinkDescEditPart.VISUAL_ID:
			return getLowerThanLinkDesc_6009Parser();
		case LowerEqualThanLinkDescEditPart.VISUAL_ID:
			return getLowerEqualThanLinkDesc_6010Parser();
		case InLinkDescEditPart.VISUAL_ID:
			return getInLinkDesc_6011Parser();
		case LikeLinkDescEditPart.VISUAL_ID:
			return getLikeLinkDesc_6012Parser();
		case JuncRelationshipIndexEditPart.VISUAL_ID:
			return getJuncRelationshipIndex_6013Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(DeleteVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DeleteVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DeleteElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
