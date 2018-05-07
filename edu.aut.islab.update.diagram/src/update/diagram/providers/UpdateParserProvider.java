/*
 * 
 */
package update.diagram.providers;

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

import update.UpdatePackage;
import update.diagram.edit.parts.CallSurfaceQueryColumn_nameName2EditPart;
import update.diagram.edit.parts.CallSurfaceQueryColumn_nameName3EditPart;
import update.diagram.edit.parts.CallSurfaceQueryColumn_nameNameEditPart;
import update.diagram.edit.parts.ConditionInstalmentNameEditPart;
import update.diagram.edit.parts.EqualLinkDescEditPart;
import update.diagram.edit.parts.FieldColumn_name2EditPart;
import update.diagram.edit.parts.FieldColumn_name3EditPart;
import update.diagram.edit.parts.FieldColumn_nameEditPart;
import update.diagram.edit.parts.FieldSPointerNameEditPart;
import update.diagram.edit.parts.FullOuterJoinRelsTypeEditPart;
import update.diagram.edit.parts.FunctionColumn_nameName2EditPart;
import update.diagram.edit.parts.FunctionColumn_nameName3EditPart;
import update.diagram.edit.parts.FunctionColumn_nameNameEditPart;
import update.diagram.edit.parts.GreaterEqualThanLinkDescEditPart;
import update.diagram.edit.parts.GreaterThanLinkDescEditPart;
import update.diagram.edit.parts.InLinkDescEditPart;
import update.diagram.edit.parts.InnerjoinRelsTypeEditPart;
import update.diagram.edit.parts.InputBitsDefNameEditPart;
import update.diagram.edit.parts.InputColumn_name2EditPart;
import update.diagram.edit.parts.InputColumn_name3EditPart;
import update.diagram.edit.parts.InputColumn_nameEditPart;
import update.diagram.edit.parts.InputDateDefNameEditPart;
import update.diagram.edit.parts.InputFloatDefNameEditPart;
import update.diagram.edit.parts.InputInstalmentNameEditPart;
import update.diagram.edit.parts.InputIntDefNameEditPart;
import update.diagram.edit.parts.InputStringDefNameEditPart;
import update.diagram.edit.parts.JuncRelationshipIndexEditPart;
import update.diagram.edit.parts.JunctionTypeEditPart;
import update.diagram.edit.parts.LeftOuterJoinRelsTypeEditPart;
import update.diagram.edit.parts.LikeLinkDescEditPart;
import update.diagram.edit.parts.LinkFieldNameEditPart;
import update.diagram.edit.parts.LiteralValue2EditPart;
import update.diagram.edit.parts.LiteralValue3EditPart;
import update.diagram.edit.parts.LiteralValueEditPart;
import update.diagram.edit.parts.LowerEqualThanLinkDescEditPart;
import update.diagram.edit.parts.LowerThanLinkDescEditPart;
import update.diagram.edit.parts.MyTableNameAliasEditPart;
import update.diagram.edit.parts.NullLiteralValue2EditPart;
import update.diagram.edit.parts.NullLiteralValue3EditPart;
import update.diagram.edit.parts.NullLiteralValueEditPart;
import update.diagram.edit.parts.PrepareListNameEditPart;
import update.diagram.edit.parts.RealFieldNameEditPart;
import update.diagram.edit.parts.RightOuterJoinRelsTypeEditPart;
import update.diagram.edit.parts.RootJunctionTypeEditPart;
import update.diagram.edit.parts.SortInstalmentNameEditPart;
import update.diagram.edit.parts.TableSelectionNameEditPart;
import update.diagram.edit.parts.TermTitleEditPart;
import update.diagram.parsers.MessageFormatParser;
import update.diagram.part.UpdateVisualIDRegistry;

/**
 * @generated
 */
public class UpdateParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser inputInstalmentName_5005Parser;

	/**
	* @generated
	*/
	private IParser getInputInstalmentName_5005Parser() {
		if (inputInstalmentName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getInputInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputInstalmentName_5005Parser = parser;
		}
		return inputInstalmentName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser prepareListName_5018Parser;

	/**
	* @generated
	*/
	private IParser getPrepareListName_5018Parser() {
		if (prepareListName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getPrepareList_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			prepareListName_5018Parser = parser;
		}
		return prepareListName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser tableSelectionName_5019Parser;

	/**
	* @generated
	*/
	private IParser getTableSelectionName_5019Parser() {
		if (tableSelectionName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getTableSelection_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableSelectionName_5019Parser = parser;
		}
		return tableSelectionName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser sortInstalmentName_5035Parser;

	/**
	* @generated
	*/
	private IParser getSortInstalmentName_5035Parser() {
		if (sortInstalmentName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getSortInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sortInstalmentName_5035Parser = parser;
		}
		return sortInstalmentName_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser conditionInstalmentName_5029Parser;

	/**
	* @generated
	*/
	private IParser getConditionInstalmentName_5029Parser() {
		if (conditionInstalmentName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getConditionInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionInstalmentName_5029Parser = parser;
		}
		return conditionInstalmentName_5029Parser;
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
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getInputDef_Name() };
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
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getInputDef_Name() };
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
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getInputDef_Name() };
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
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputBitsDefName_5004Parser = parser;
		}
		return inputBitsDefName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser inputFloatDefName_5032Parser;

	/**
	* @generated
	*/
	private IParser getInputFloatDefName_5032Parser() {
		if (inputFloatDefName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputFloatDefName_5032Parser = parser;
		}
		return inputFloatDefName_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser callSurfaceQueryColumn_nameName_5012Parser;

	/**
	* @generated
	*/
	private IParser getCallSurfaceQueryColumn_nameName_5012Parser() {
		if (callSurfaceQueryColumn_nameName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNode_Column_name(),
					UpdatePackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			callSurfaceQueryColumn_nameName_5012Parser = parser;
		}
		return callSurfaceQueryColumn_nameName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser callSurfaceQueryColumn_nameName_5011Parser;

	/**
	* @generated
	*/
	private IParser getCallSurfaceQueryColumn_nameName_5011Parser() {
		if (callSurfaceQueryColumn_nameName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNode_Column_name(),
					UpdatePackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			callSurfaceQueryColumn_nameName_5011Parser = parser;
		}
		return callSurfaceQueryColumn_nameName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldColumn_name_5006Parser;

	/**
	* @generated
	*/
	private IParser getFieldColumn_name_5006Parser() {
		if (fieldColumn_name_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			fieldColumn_name_5006Parser = parser;
		}
		return fieldColumn_name_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser literalValue_5007Parser;

	/**
	* @generated
	*/
	private IParser getLiteralValue_5007Parser() {
		if (literalValue_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			literalValue_5007Parser = parser;
		}
		return literalValue_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser nullLiteralValue_5008Parser;

	/**
	* @generated
	*/
	private IParser getNullLiteralValue_5008Parser() {
		if (nullLiteralValue_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNullLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			nullLiteralValue_5008Parser = parser;
		}
		return nullLiteralValue_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser functionColumn_nameName_5010Parser;

	/**
	* @generated
	*/
	private IParser getFunctionColumn_nameName_5010Parser() {
		if (functionColumn_nameName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNode_Column_name(),
					UpdatePackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			functionColumn_nameName_5010Parser = parser;
		}
		return functionColumn_nameName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser inputColumn_name_5009Parser;

	/**
	* @generated
	*/
	private IParser getInputColumn_name_5009Parser() {
		if (inputColumn_name_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputColumn_name_5009Parser = parser;
		}
		return inputColumn_name_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldColumn_name_5013Parser;

	/**
	* @generated
	*/
	private IParser getFieldColumn_name_5013Parser() {
		if (fieldColumn_name_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			fieldColumn_name_5013Parser = parser;
		}
		return fieldColumn_name_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser literalValue_5014Parser;

	/**
	* @generated
	*/
	private IParser getLiteralValue_5014Parser() {
		if (literalValue_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			literalValue_5014Parser = parser;
		}
		return literalValue_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser nullLiteralValue_5015Parser;

	/**
	* @generated
	*/
	private IParser getNullLiteralValue_5015Parser() {
		if (nullLiteralValue_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNullLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			nullLiteralValue_5015Parser = parser;
		}
		return nullLiteralValue_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser functionColumn_nameName_5016Parser;

	/**
	* @generated
	*/
	private IParser getFunctionColumn_nameName_5016Parser() {
		if (functionColumn_nameName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNode_Column_name(),
					UpdatePackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			functionColumn_nameName_5016Parser = parser;
		}
		return functionColumn_nameName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser inputColumn_name_5017Parser;

	/**
	* @generated
	*/
	private IParser getInputColumn_name_5017Parser() {
		if (inputColumn_name_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputColumn_name_5017Parser = parser;
		}
		return inputColumn_name_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser myTableNameAlias_5031Parser;

	/**
	* @generated
	*/
	private IParser getMyTableNameAlias_5031Parser() {
		if (myTableNameAlias_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getMyTable_Name(),
					UpdatePackage.eINSTANCE.getMyTable_Alias() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			myTableNameAlias_5031Parser = parser;
		}
		return myTableNameAlias_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser realFieldName_5033Parser;

	/**
	* @generated
	*/
	private IParser getRealFieldName_5033Parser() {
		if (realFieldName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getRealField_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			realFieldName_5033Parser = parser;
		}
		return realFieldName_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldSPointerName_5034Parser;

	/**
	* @generated
	*/
	private IParser getFieldSPointerName_5034Parser() {
		if (fieldSPointerName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getFieldSPointer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fieldSPointerName_5034Parser = parser;
		}
		return fieldSPointerName_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser rootJunctionType_5036Parser;

	/**
	* @generated
	*/
	private IParser getRootJunctionType_5036Parser() {
		if (rootJunctionType_5036Parser == null) {
			EAttribute editableFeature = UpdatePackage.eINSTANCE.getJunction_Type();
			EnumParser parser = new EnumParser(editableFeature);
			rootJunctionType_5036Parser = parser;
		}
		return rootJunctionType_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser junctionType_5037Parser;

	/**
	* @generated
	*/
	private IParser getJunctionType_5037Parser() {
		if (junctionType_5037Parser == null) {
			EAttribute editableFeature = UpdatePackage.eINSTANCE.getJunction_Type();
			EnumParser parser = new EnumParser(editableFeature);
			junctionType_5037Parser = parser;
		}
		return junctionType_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser termTitle_5028Parser;

	/**
	* @generated
	*/
	private IParser getTermTitle_5028Parser() {
		if (termTitle_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getTerm_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			termTitle_5028Parser = parser;
		}
		return termTitle_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser callSurfaceQueryColumn_nameName_5022Parser;

	/**
	* @generated
	*/
	private IParser getCallSurfaceQueryColumn_nameName_5022Parser() {
		if (callSurfaceQueryColumn_nameName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNode_Column_name(),
					UpdatePackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			callSurfaceQueryColumn_nameName_5022Parser = parser;
		}
		return callSurfaceQueryColumn_nameName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldColumn_name_5023Parser;

	/**
	* @generated
	*/
	private IParser getFieldColumn_name_5023Parser() {
		if (fieldColumn_name_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			fieldColumn_name_5023Parser = parser;
		}
		return fieldColumn_name_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser literalValue_5024Parser;

	/**
	* @generated
	*/
	private IParser getLiteralValue_5024Parser() {
		if (literalValue_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			literalValue_5024Parser = parser;
		}
		return literalValue_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser nullLiteralValue_5025Parser;

	/**
	* @generated
	*/
	private IParser getNullLiteralValue_5025Parser() {
		if (nullLiteralValue_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNullLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			nullLiteralValue_5025Parser = parser;
		}
		return nullLiteralValue_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser functionColumn_nameName_5026Parser;

	/**
	* @generated
	*/
	private IParser getFunctionColumn_nameName_5026Parser() {
		if (functionColumn_nameName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNode_Column_name(),
					UpdatePackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			functionColumn_nameName_5026Parser = parser;
		}
		return functionColumn_nameName_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser inputColumn_name_5027Parser;

	/**
	* @generated
	*/
	private IParser getInputColumn_name_5027Parser() {
		if (inputColumn_name_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputColumn_name_5027Parser = parser;
		}
		return inputColumn_name_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser innerjoinRelsType_6010Parser;

	/**
	* @generated
	*/
	private IParser getInnerjoinRelsType_6010Parser() {
		if (innerjoinRelsType_6010Parser == null) {
			EAttribute editableFeature = UpdatePackage.eINSTANCE.getInnerjoinRels_Type();
			EnumParser parser = new EnumParser(editableFeature);
			innerjoinRelsType_6010Parser = parser;
		}
		return innerjoinRelsType_6010Parser;
	}

	/**
	* @generated
	*/
	private IParser leftOuterJoinRelsType_6011Parser;

	/**
	* @generated
	*/
	private IParser getLeftOuterJoinRelsType_6011Parser() {
		if (leftOuterJoinRelsType_6011Parser == null) {
			EAttribute editableFeature = UpdatePackage.eINSTANCE.getLeftOuterJoinRels_Type();
			EnumParser parser = new EnumParser(editableFeature);
			leftOuterJoinRelsType_6011Parser = parser;
		}
		return leftOuterJoinRelsType_6011Parser;
	}

	/**
	* @generated
	*/
	private IParser rightOuterJoinRelsType_6012Parser;

	/**
	* @generated
	*/
	private IParser getRightOuterJoinRelsType_6012Parser() {
		if (rightOuterJoinRelsType_6012Parser == null) {
			EAttribute editableFeature = UpdatePackage.eINSTANCE.getRightOuterJoinRels_Type();
			EnumParser parser = new EnumParser(editableFeature);
			rightOuterJoinRelsType_6012Parser = parser;
		}
		return rightOuterJoinRelsType_6012Parser;
	}

	/**
	* @generated
	*/
	private IParser fullOuterJoinRelsType_6013Parser;

	/**
	* @generated
	*/
	private IParser getFullOuterJoinRelsType_6013Parser() {
		if (fullOuterJoinRelsType_6013Parser == null) {
			EAttribute editableFeature = UpdatePackage.eINSTANCE.getFullOuterJoinRels_Type();
			EnumParser parser = new EnumParser(editableFeature);
			fullOuterJoinRelsType_6013Parser = parser;
		}
		return fullOuterJoinRelsType_6013Parser;
	}

	/**
	* @generated
	*/
	private IParser equalLinkDesc_6001Parser;

	/**
	* @generated
	*/
	private IParser getEqualLinkDesc_6001Parser() {
		if (equalLinkDesc_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getEqualLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			equalLinkDesc_6001Parser = parser;
		}
		return equalLinkDesc_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser greaterThanLinkDesc_6002Parser;

	/**
	* @generated
	*/
	private IParser getGreaterThanLinkDesc_6002Parser() {
		if (greaterThanLinkDesc_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getGreaterThanLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			greaterThanLinkDesc_6002Parser = parser;
		}
		return greaterThanLinkDesc_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser greaterEqualThanLinkDesc_6003Parser;

	/**
	* @generated
	*/
	private IParser getGreaterEqualThanLinkDesc_6003Parser() {
		if (greaterEqualThanLinkDesc_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getGreaterEqualThanLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			greaterEqualThanLinkDesc_6003Parser = parser;
		}
		return greaterEqualThanLinkDesc_6003Parser;
	}

	/**
	* @generated
	*/
	private IParser lowerThanLinkDesc_6004Parser;

	/**
	* @generated
	*/
	private IParser getLowerThanLinkDesc_6004Parser() {
		if (lowerThanLinkDesc_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getLowerThanLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			lowerThanLinkDesc_6004Parser = parser;
		}
		return lowerThanLinkDesc_6004Parser;
	}

	/**
	* @generated
	*/
	private IParser lowerEqualThanLinkDesc_6005Parser;

	/**
	* @generated
	*/
	private IParser getLowerEqualThanLinkDesc_6005Parser() {
		if (lowerEqualThanLinkDesc_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getLowerEqualThanLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			lowerEqualThanLinkDesc_6005Parser = parser;
		}
		return lowerEqualThanLinkDesc_6005Parser;
	}

	/**
	* @generated
	*/
	private IParser inLinkDesc_6006Parser;

	/**
	* @generated
	*/
	private IParser getInLinkDesc_6006Parser() {
		if (inLinkDesc_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getInLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inLinkDesc_6006Parser = parser;
		}
		return inLinkDesc_6006Parser;
	}

	/**
	* @generated
	*/
	private IParser likeLinkDesc_6007Parser;

	/**
	* @generated
	*/
	private IParser getLikeLinkDesc_6007Parser() {
		if (likeLinkDesc_6007Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getLikeLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			likeLinkDesc_6007Parser = parser;
		}
		return likeLinkDesc_6007Parser;
	}

	/**
	* @generated
	*/
	private IParser linkFieldName_6008Parser;

	/**
	* @generated
	*/
	private IParser getLinkFieldName_6008Parser() {
		if (linkFieldName_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getLinkField_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			linkFieldName_6008Parser = parser;
		}
		return linkFieldName_6008Parser;
	}

	/**
	* @generated
	*/
	private IParser juncRelationshipIndex_6014Parser;

	/**
	* @generated
	*/
	private IParser getJuncRelationshipIndex_6014Parser() {
		if (juncRelationshipIndex_6014Parser == null) {
			EAttribute[] features = new EAttribute[] { UpdatePackage.eINSTANCE.getJuncRelationship_Index() };
			MessageFormatParser parser = new MessageFormatParser(features);
			juncRelationshipIndex_6014Parser = parser;
		}
		return juncRelationshipIndex_6014Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case InputInstalmentNameEditPart.VISUAL_ID:
			return getInputInstalmentName_5005Parser();
		case PrepareListNameEditPart.VISUAL_ID:
			return getPrepareListName_5018Parser();
		case TableSelectionNameEditPart.VISUAL_ID:
			return getTableSelectionName_5019Parser();
		case SortInstalmentNameEditPart.VISUAL_ID:
			return getSortInstalmentName_5035Parser();
		case ConditionInstalmentNameEditPart.VISUAL_ID:
			return getConditionInstalmentName_5029Parser();
		case InputStringDefNameEditPart.VISUAL_ID:
			return getInputStringDefName_5001Parser();
		case InputIntDefNameEditPart.VISUAL_ID:
			return getInputIntDefName_5002Parser();
		case InputDateDefNameEditPart.VISUAL_ID:
			return getInputDateDefName_5003Parser();
		case InputBitsDefNameEditPart.VISUAL_ID:
			return getInputBitsDefName_5004Parser();
		case InputFloatDefNameEditPart.VISUAL_ID:
			return getInputFloatDefName_5032Parser();
		case CallSurfaceQueryColumn_nameNameEditPart.VISUAL_ID:
			return getCallSurfaceQueryColumn_nameName_5012Parser();
		case CallSurfaceQueryColumn_nameName2EditPart.VISUAL_ID:
			return getCallSurfaceQueryColumn_nameName_5011Parser();
		case FieldColumn_nameEditPart.VISUAL_ID:
			return getFieldColumn_name_5006Parser();
		case LiteralValueEditPart.VISUAL_ID:
			return getLiteralValue_5007Parser();
		case NullLiteralValueEditPart.VISUAL_ID:
			return getNullLiteralValue_5008Parser();
		case FunctionColumn_nameNameEditPart.VISUAL_ID:
			return getFunctionColumn_nameName_5010Parser();
		case InputColumn_nameEditPart.VISUAL_ID:
			return getInputColumn_name_5009Parser();
		case FieldColumn_name2EditPart.VISUAL_ID:
			return getFieldColumn_name_5013Parser();
		case LiteralValue2EditPart.VISUAL_ID:
			return getLiteralValue_5014Parser();
		case NullLiteralValue2EditPart.VISUAL_ID:
			return getNullLiteralValue_5015Parser();
		case FunctionColumn_nameName2EditPart.VISUAL_ID:
			return getFunctionColumn_nameName_5016Parser();
		case InputColumn_name2EditPart.VISUAL_ID:
			return getInputColumn_name_5017Parser();
		case MyTableNameAliasEditPart.VISUAL_ID:
			return getMyTableNameAlias_5031Parser();
		case RealFieldNameEditPart.VISUAL_ID:
			return getRealFieldName_5033Parser();
		case FieldSPointerNameEditPart.VISUAL_ID:
			return getFieldSPointerName_5034Parser();

		case RootJunctionTypeEditPart.VISUAL_ID:
			return getRootJunctionType_5036Parser();

		case JunctionTypeEditPart.VISUAL_ID:
			return getJunctionType_5037Parser();
		case TermTitleEditPart.VISUAL_ID:
			return getTermTitle_5028Parser();
		case CallSurfaceQueryColumn_nameName3EditPart.VISUAL_ID:
			return getCallSurfaceQueryColumn_nameName_5022Parser();
		case FieldColumn_name3EditPart.VISUAL_ID:
			return getFieldColumn_name_5023Parser();
		case LiteralValue3EditPart.VISUAL_ID:
			return getLiteralValue_5024Parser();
		case NullLiteralValue3EditPart.VISUAL_ID:
			return getNullLiteralValue_5025Parser();
		case FunctionColumn_nameName3EditPart.VISUAL_ID:
			return getFunctionColumn_nameName_5026Parser();
		case InputColumn_name3EditPart.VISUAL_ID:
			return getInputColumn_name_5027Parser();

		case InnerjoinRelsTypeEditPart.VISUAL_ID:
			return getInnerjoinRelsType_6010Parser();

		case LeftOuterJoinRelsTypeEditPart.VISUAL_ID:
			return getLeftOuterJoinRelsType_6011Parser();

		case RightOuterJoinRelsTypeEditPart.VISUAL_ID:
			return getRightOuterJoinRelsType_6012Parser();

		case FullOuterJoinRelsTypeEditPart.VISUAL_ID:
			return getFullOuterJoinRelsType_6013Parser();
		case EqualLinkDescEditPart.VISUAL_ID:
			return getEqualLinkDesc_6001Parser();
		case GreaterThanLinkDescEditPart.VISUAL_ID:
			return getGreaterThanLinkDesc_6002Parser();
		case GreaterEqualThanLinkDescEditPart.VISUAL_ID:
			return getGreaterEqualThanLinkDesc_6003Parser();
		case LowerThanLinkDescEditPart.VISUAL_ID:
			return getLowerThanLinkDesc_6004Parser();
		case LowerEqualThanLinkDescEditPart.VISUAL_ID:
			return getLowerEqualThanLinkDesc_6005Parser();
		case InLinkDescEditPart.VISUAL_ID:
			return getInLinkDesc_6006Parser();
		case LikeLinkDescEditPart.VISUAL_ID:
			return getLikeLinkDesc_6007Parser();
		case LinkFieldNameEditPart.VISUAL_ID:
			return getLinkFieldName_6008Parser();
		case JuncRelationshipIndexEditPart.VISUAL_ID:
			return getJuncRelationshipIndex_6014Parser();
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
			return getParser(UpdateVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UpdateVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UpdateElementTypes.getElement(hint) == null) {
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
