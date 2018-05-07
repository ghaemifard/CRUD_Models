/*
 * 
 */
package query.diagram.providers;

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

import query.QueryPackage;
import query.diagram.edit.parts.CallQuerySurfaceColumn_nameName2EditPart;
import query.diagram.edit.parts.CallQuerySurfaceColumn_nameName3EditPart;
import query.diagram.edit.parts.CallQuerySurfaceColumn_nameNameEditPart;
import query.diagram.edit.parts.CallQuerySurfaceName2EditPart;
import query.diagram.edit.parts.CallQuerySurfaceName3EditPart;
import query.diagram.edit.parts.CallQuerySurfaceNameColumn_name2EditPart;
import query.diagram.edit.parts.CallQuerySurfaceNameColumn_name3EditPart;
import query.diagram.edit.parts.CallQuerySurfaceNameColumn_nameEditPart;
import query.diagram.edit.parts.CallQuerySurfaceNameEditPart;
import query.diagram.edit.parts.EqualLinkDescEditPart;
import query.diagram.edit.parts.FieldGPointerNameEditPart;
import query.diagram.edit.parts.FieldName2EditPart;
import query.diagram.edit.parts.FieldName3EditPart;
import query.diagram.edit.parts.FieldName4EditPart;
import query.diagram.edit.parts.FieldNameEditPart;
import query.diagram.edit.parts.FieldSPointerNameEditPart;
import query.diagram.edit.parts.FullOuterJoinRelsTypeEditPart;
import query.diagram.edit.parts.FunctionColumn_nameName2EditPart;
import query.diagram.edit.parts.FunctionColumn_nameName3EditPart;
import query.diagram.edit.parts.FunctionColumn_nameNameEditPart;
import query.diagram.edit.parts.FunctionName2EditPart;
import query.diagram.edit.parts.FunctionName3EditPart;
import query.diagram.edit.parts.FunctionNameColumn_name2EditPart;
import query.diagram.edit.parts.FunctionNameColumn_name3EditPart;
import query.diagram.edit.parts.FunctionNameColumn_nameEditPart;
import query.diagram.edit.parts.FunctionNameEditPart;
import query.diagram.edit.parts.GreaterEqualThanLinkDescEditPart;
import query.diagram.edit.parts.GreaterThanLinkDescEditPart;
import query.diagram.edit.parts.GroupInstalmentNameEditPart;
import query.diagram.edit.parts.HavingInstalmentNameEditPart;
import query.diagram.edit.parts.InLinkDescEditPart;
import query.diagram.edit.parts.InnerjoinRelsTypeEditPart;
import query.diagram.edit.parts.InputBitsDefNameEditPart;
import query.diagram.edit.parts.InputColumn_name2EditPart;
import query.diagram.edit.parts.InputColumn_name3EditPart;
import query.diagram.edit.parts.InputColumn_nameEditPart;
import query.diagram.edit.parts.InputDateDefNameEditPart;
import query.diagram.edit.parts.InputFloatDefNameEditPart;
import query.diagram.edit.parts.InputInstalmentNameEditPart;
import query.diagram.edit.parts.InputIntDefNameEditPart;
import query.diagram.edit.parts.InputName2EditPart;
import query.diagram.edit.parts.InputName3EditPart;
import query.diagram.edit.parts.InputNameEditPart;
import query.diagram.edit.parts.InputStringDefNameEditPart;
import query.diagram.edit.parts.JuncRelationshipIndexEditPart;
import query.diagram.edit.parts.JunctionTypeEditPart;
import query.diagram.edit.parts.LeftOuterJoinRelsTypeEditPart;
import query.diagram.edit.parts.LikeLinkDescEditPart;
import query.diagram.edit.parts.LiteralColumn_nameValue2EditPart;
import query.diagram.edit.parts.LiteralColumn_nameValue3EditPart;
import query.diagram.edit.parts.LiteralColumn_nameValueEditPart;
import query.diagram.edit.parts.LiteralValue2EditPart;
import query.diagram.edit.parts.LiteralValue3EditPart;
import query.diagram.edit.parts.LiteralValueColumn_name2EditPart;
import query.diagram.edit.parts.LiteralValueColumn_name3EditPart;
import query.diagram.edit.parts.LiteralValueColumn_nameEditPart;
import query.diagram.edit.parts.LiteralValueEditPart;
import query.diagram.edit.parts.LowerEqualThanLinkDescEditPart;
import query.diagram.edit.parts.LowerThanLinkDescEditPart;
import query.diagram.edit.parts.MyTableNameAliasEditPart;
import query.diagram.edit.parts.NullLiteralColumn_name2EditPart;
import query.diagram.edit.parts.NullLiteralColumn_name3EditPart;
import query.diagram.edit.parts.NullLiteralColumn_nameEditPart;
import query.diagram.edit.parts.NullLiteralColumn_nameValue2EditPart;
import query.diagram.edit.parts.NullLiteralColumn_nameValue3EditPart;
import query.diagram.edit.parts.NullLiteralColumn_nameValueEditPart;
import query.diagram.edit.parts.NullLiteralValue2EditPart;
import query.diagram.edit.parts.NullLiteralValue3EditPart;
import query.diagram.edit.parts.NullLiteralValueEditPart;
import query.diagram.edit.parts.OutputInstalmentNameEditPart;
import query.diagram.edit.parts.RightOuterJoinRelsTypeEditPart;
import query.diagram.edit.parts.RootJunctionTypeEditPart;
import query.diagram.edit.parts.SortInstalmentNameEditPart;
import query.diagram.edit.parts.TermTitleEditPart;
import query.diagram.edit.parts.WhereInstalmentNameEditPart;
import query.diagram.parsers.MessageFormatParser;
import query.diagram.part.QueryVisualIDRegistry;

/**
 * @generated
 */
public class QueryParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser whereInstalmentName_5016Parser;

	/**
	* @generated
	*/
	private IParser getWhereInstalmentName_5016Parser() {
		if (whereInstalmentName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getWhereInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whereInstalmentName_5016Parser = parser;
		}
		return whereInstalmentName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser havingInstalmentName_5017Parser;

	/**
	* @generated
	*/
	private IParser getHavingInstalmentName_5017Parser() {
		if (havingInstalmentName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getHavingInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			havingInstalmentName_5017Parser = parser;
		}
		return havingInstalmentName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser outputInstalmentName_5026Parser;

	/**
	* @generated
	*/
	private IParser getOutputInstalmentName_5026Parser() {
		if (outputInstalmentName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getOutputInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputInstalmentName_5026Parser = parser;
		}
		return outputInstalmentName_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser inputInstalmentName_5031Parser;

	/**
	* @generated
	*/
	private IParser getInputInstalmentName_5031Parser() {
		if (inputInstalmentName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getInputInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputInstalmentName_5031Parser = parser;
		}
		return inputInstalmentName_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser groupInstalmentName_5033Parser;

	/**
	* @generated
	*/
	private IParser getGroupInstalmentName_5033Parser() {
		if (groupInstalmentName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getGroupInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupInstalmentName_5033Parser = parser;
		}
		return groupInstalmentName_5033Parser;
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
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getSortInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sortInstalmentName_5035Parser = parser;
		}
		return sortInstalmentName_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser rootJunctionType_5001Parser;

	/**
	* @generated
	*/
	private IParser getRootJunctionType_5001Parser() {
		if (rootJunctionType_5001Parser == null) {
			EAttribute editableFeature = QueryPackage.eINSTANCE.getJunction_Type();
			EnumParser parser = new EnumParser(editableFeature);
			rootJunctionType_5001Parser = parser;
		}
		return rootJunctionType_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser junctionType_5002Parser;

	/**
	* @generated
	*/
	private IParser getJunctionType_5002Parser() {
		if (junctionType_5002Parser == null) {
			EAttribute editableFeature = QueryPackage.eINSTANCE.getJunction_Type();
			EnumParser parser = new EnumParser(editableFeature);
			junctionType_5002Parser = parser;
		}
		return junctionType_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser termTitle_5015Parser;

	/**
	* @generated
	*/
	private IParser getTermTitle_5015Parser() {
		if (termTitle_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getTerm_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			termTitle_5015Parser = parser;
		}
		return termTitle_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser callQuerySurfaceColumn_nameName_5009Parser;

	/**
	* @generated
	*/
	private IParser getCallQuerySurfaceColumn_nameName_5009Parser() {
		if (callQuerySurfaceColumn_nameName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name(),
					QueryPackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} {1}"); //$NON-NLS-1$
			callQuerySurfaceColumn_nameName_5009Parser = parser;
		}
		return callQuerySurfaceColumn_nameName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser callQuerySurfaceColumn_nameName_5008Parser;

	/**
	* @generated
	*/
	private IParser getCallQuerySurfaceColumn_nameName_5008Parser() {
		if (callQuerySurfaceColumn_nameName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name(),
					QueryPackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} {1}"); //$NON-NLS-1$
			callQuerySurfaceColumn_nameName_5008Parser = parser;
		}
		return callQuerySurfaceColumn_nameName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldName_5003Parser;

	/**
	* @generated
	*/
	private IParser getFieldName_5003Parser() {
		if (fieldName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getField_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fieldName_5003Parser = parser;
		}
		return fieldName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser literalColumn_nameValue_5004Parser;

	/**
	* @generated
	*/
	private IParser getLiteralColumn_nameValue_5004Parser() {
		if (literalColumn_nameValue_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name(),
					QueryPackage.eINSTANCE.getLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} {1}"); //$NON-NLS-1$
			literalColumn_nameValue_5004Parser = parser;
		}
		return literalColumn_nameValue_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser nullLiteralColumn_name_5005Parser;

	/**
	* @generated
	*/
	private IParser getNullLiteralColumn_name_5005Parser() {
		if (nullLiteralColumn_name_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			nullLiteralColumn_name_5005Parser = parser;
		}
		return nullLiteralColumn_name_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser functionColumn_nameName_5007Parser;

	/**
	* @generated
	*/
	private IParser getFunctionColumn_nameName_5007Parser() {
		if (functionColumn_nameName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name(),
					QueryPackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} {1}"); //$NON-NLS-1$
			functionColumn_nameName_5007Parser = parser;
		}
		return functionColumn_nameName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser inputColumn_name_5006Parser;

	/**
	* @generated
	*/
	private IParser getInputColumn_name_5006Parser() {
		if (inputColumn_name_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputColumn_name_5006Parser = parser;
		}
		return inputColumn_name_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldName_5010Parser;

	/**
	* @generated
	*/
	private IParser getFieldName_5010Parser() {
		if (fieldName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getField_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fieldName_5010Parser = parser;
		}
		return fieldName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser literalColumn_nameValue_5011Parser;

	/**
	* @generated
	*/
	private IParser getLiteralColumn_nameValue_5011Parser() {
		if (literalColumn_nameValue_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name(),
					QueryPackage.eINSTANCE.getLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} {1}"); //$NON-NLS-1$
			literalColumn_nameValue_5011Parser = parser;
		}
		return literalColumn_nameValue_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser nullLiteralColumn_name_5012Parser;

	/**
	* @generated
	*/
	private IParser getNullLiteralColumn_name_5012Parser() {
		if (nullLiteralColumn_name_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			nullLiteralColumn_name_5012Parser = parser;
		}
		return nullLiteralColumn_name_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser functionColumn_nameName_5013Parser;

	/**
	* @generated
	*/
	private IParser getFunctionColumn_nameName_5013Parser() {
		if (functionColumn_nameName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name(),
					QueryPackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} {1}"); //$NON-NLS-1$
			functionColumn_nameName_5013Parser = parser;
		}
		return functionColumn_nameName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser inputColumn_name_5014Parser;

	/**
	* @generated
	*/
	private IParser getInputColumn_name_5014Parser() {
		if (inputColumn_name_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputColumn_name_5014Parser = parser;
		}
		return inputColumn_name_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser callQuerySurfaceColumn_nameName_5018Parser;

	/**
	* @generated
	*/
	private IParser getCallQuerySurfaceColumn_nameName_5018Parser() {
		if (callQuerySurfaceColumn_nameName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name(),
					QueryPackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} {1}"); //$NON-NLS-1$
			callQuerySurfaceColumn_nameName_5018Parser = parser;
		}
		return callQuerySurfaceColumn_nameName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldName_5019Parser;

	/**
	* @generated
	*/
	private IParser getFieldName_5019Parser() {
		if (fieldName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getField_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fieldName_5019Parser = parser;
		}
		return fieldName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser literalColumn_nameValue_5020Parser;

	/**
	* @generated
	*/
	private IParser getLiteralColumn_nameValue_5020Parser() {
		if (literalColumn_nameValue_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name(),
					QueryPackage.eINSTANCE.getLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} {1}"); //$NON-NLS-1$
			literalColumn_nameValue_5020Parser = parser;
		}
		return literalColumn_nameValue_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser nullLiteralColumn_name_5021Parser;

	/**
	* @generated
	*/
	private IParser getNullLiteralColumn_name_5021Parser() {
		if (nullLiteralColumn_name_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			nullLiteralColumn_name_5021Parser = parser;
		}
		return nullLiteralColumn_name_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser functionColumn_nameName_5022Parser;

	/**
	* @generated
	*/
	private IParser getFunctionColumn_nameName_5022Parser() {
		if (functionColumn_nameName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name(),
					QueryPackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} {1}"); //$NON-NLS-1$
			functionColumn_nameName_5022Parser = parser;
		}
		return functionColumn_nameName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser inputColumn_name_5023Parser;

	/**
	* @generated
	*/
	private IParser getInputColumn_name_5023Parser() {
		if (inputColumn_name_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputColumn_name_5023Parser = parser;
		}
		return inputColumn_name_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser myTableNameAlias_5025Parser;

	/**
	* @generated
	*/
	private IParser getMyTableNameAlias_5025Parser() {
		if (myTableNameAlias_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getMyTable_Name(),
					QueryPackage.eINSTANCE.getMyTable_Alias() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} / {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} / {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} / {1}"); //$NON-NLS-1$
			myTableNameAlias_5025Parser = parser;
		}
		return myTableNameAlias_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldName_5024Parser;

	/**
	* @generated
	*/
	private IParser getFieldName_5024Parser() {
		if (fieldName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getField_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fieldName_5024Parser = parser;
		}
		return fieldName_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser inputStringDefName_5027Parser;

	/**
	* @generated
	*/
	private IParser getInputStringDefName_5027Parser() {
		if (inputStringDefName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputStringDefName_5027Parser = parser;
		}
		return inputStringDefName_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser inputIntDefName_5028Parser;

	/**
	* @generated
	*/
	private IParser getInputIntDefName_5028Parser() {
		if (inputIntDefName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputIntDefName_5028Parser = parser;
		}
		return inputIntDefName_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser inputDateDefName_5029Parser;

	/**
	* @generated
	*/
	private IParser getInputDateDefName_5029Parser() {
		if (inputDateDefName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputDateDefName_5029Parser = parser;
		}
		return inputDateDefName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser inputBitsDefName_5030Parser;

	/**
	* @generated
	*/
	private IParser getInputBitsDefName_5030Parser() {
		if (inputBitsDefName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputBitsDefName_5030Parser = parser;
		}
		return inputBitsDefName_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser inputFloatDefName_5038Parser;

	/**
	* @generated
	*/
	private IParser getInputFloatDefName_5038Parser() {
		if (inputFloatDefName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputFloatDefName_5038Parser = parser;
		}
		return inputFloatDefName_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldGPointerName_5036Parser;

	/**
	* @generated
	*/
	private IParser getFieldGPointerName_5036Parser() {
		if (fieldGPointerName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getFieldGPointer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fieldGPointerName_5036Parser = parser;
		}
		return fieldGPointerName_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldSPointerName_5037Parser;

	/**
	* @generated
	*/
	private IParser getFieldSPointerName_5037Parser() {
		if (fieldSPointerName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getFieldSPointer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fieldSPointerName_5037Parser = parser;
		}
		return fieldSPointerName_5037Parser;
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
			EAttribute editableFeature = QueryPackage.eINSTANCE.getInnerjoinRels_Type();
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
			EAttribute editableFeature = QueryPackage.eINSTANCE.getLeftOuterJoinRels_Type();
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
			EAttribute editableFeature = QueryPackage.eINSTANCE.getRightOuterJoinRels_Type();
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
			EAttribute editableFeature = QueryPackage.eINSTANCE.getFullOuterJoinRels_Type();
			EnumParser parser = new EnumParser(editableFeature);
			fullOuterJoinRelsType_6004Parser = parser;
		}
		return fullOuterJoinRelsType_6004Parser;
	}

	/**
	* @generated
	*/
	private IParser equalLinkDesc_6005Parser;

	/**
	* @generated
	*/
	private IParser getEqualLinkDesc_6005Parser() {
		if (equalLinkDesc_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getEqualLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			equalLinkDesc_6005Parser = parser;
		}
		return equalLinkDesc_6005Parser;
	}

	/**
	* @generated
	*/
	private IParser greaterThanLinkDesc_6006Parser;

	/**
	* @generated
	*/
	private IParser getGreaterThanLinkDesc_6006Parser() {
		if (greaterThanLinkDesc_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getGreaterThanLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			greaterThanLinkDesc_6006Parser = parser;
		}
		return greaterThanLinkDesc_6006Parser;
	}

	/**
	* @generated
	*/
	private IParser greaterEqualThanLinkDesc_6007Parser;

	/**
	* @generated
	*/
	private IParser getGreaterEqualThanLinkDesc_6007Parser() {
		if (greaterEqualThanLinkDesc_6007Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getGreaterEqualThanLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			greaterEqualThanLinkDesc_6007Parser = parser;
		}
		return greaterEqualThanLinkDesc_6007Parser;
	}

	/**
	* @generated
	*/
	private IParser lowerThanLinkDesc_6008Parser;

	/**
	* @generated
	*/
	private IParser getLowerThanLinkDesc_6008Parser() {
		if (lowerThanLinkDesc_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getLowerThanLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			lowerThanLinkDesc_6008Parser = parser;
		}
		return lowerThanLinkDesc_6008Parser;
	}

	/**
	* @generated
	*/
	private IParser lowerEqualThanLinkDesc_6009Parser;

	/**
	* @generated
	*/
	private IParser getLowerEqualThanLinkDesc_6009Parser() {
		if (lowerEqualThanLinkDesc_6009Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getLowerEqualThanLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			lowerEqualThanLinkDesc_6009Parser = parser;
		}
		return lowerEqualThanLinkDesc_6009Parser;
	}

	/**
	* @generated
	*/
	private IParser inLinkDesc_6010Parser;

	/**
	* @generated
	*/
	private IParser getInLinkDesc_6010Parser() {
		if (inLinkDesc_6010Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getInLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inLinkDesc_6010Parser = parser;
		}
		return inLinkDesc_6010Parser;
	}

	/**
	* @generated
	*/
	private IParser likeLinkDesc_6011Parser;

	/**
	* @generated
	*/
	private IParser getLikeLinkDesc_6011Parser() {
		if (likeLinkDesc_6011Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getLikeLink_Desc() };
			MessageFormatParser parser = new MessageFormatParser(features);
			likeLinkDesc_6011Parser = parser;
		}
		return likeLinkDesc_6011Parser;
	}

	/**
	* @generated
	*/
	private IParser juncRelationshipIndex_6012Parser;

	/**
	* @generated
	*/
	private IParser getJuncRelationshipIndex_6012Parser() {
		if (juncRelationshipIndex_6012Parser == null) {
			EAttribute[] features = new EAttribute[] { QueryPackage.eINSTANCE.getJuncRelationship_Index() };
			MessageFormatParser parser = new MessageFormatParser(features);
			juncRelationshipIndex_6012Parser = parser;
		}
		return juncRelationshipIndex_6012Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WhereInstalmentNameEditPart.VISUAL_ID:
			return getWhereInstalmentName_5016Parser();
		case HavingInstalmentNameEditPart.VISUAL_ID:
			return getHavingInstalmentName_5017Parser();
		case OutputInstalmentNameEditPart.VISUAL_ID:
			return getOutputInstalmentName_5026Parser();
		case InputInstalmentNameEditPart.VISUAL_ID:
			return getInputInstalmentName_5031Parser();
		case GroupInstalmentNameEditPart.VISUAL_ID:
			return getGroupInstalmentName_5033Parser();
		case SortInstalmentNameEditPart.VISUAL_ID:
			return getSortInstalmentName_5035Parser();

		case RootJunctionTypeEditPart.VISUAL_ID:
			return getRootJunctionType_5001Parser();

		case JunctionTypeEditPart.VISUAL_ID:
			return getJunctionType_5002Parser();
		case TermTitleEditPart.VISUAL_ID:
			return getTermTitle_5015Parser();
		case CallQuerySurfaceColumn_nameNameEditPart.VISUAL_ID:
			return getCallQuerySurfaceColumn_nameName_5009Parser();
		case CallQuerySurfaceColumn_nameName2EditPart.VISUAL_ID:
			return getCallQuerySurfaceColumn_nameName_5008Parser();
		case FieldNameEditPart.VISUAL_ID:
			return getFieldName_5003Parser();
		case LiteralColumn_nameValueEditPart.VISUAL_ID:
			return getLiteralColumn_nameValue_5004Parser();
		case NullLiteralColumn_nameEditPart.VISUAL_ID:
			return getNullLiteralColumn_name_5005Parser();
		case FunctionColumn_nameNameEditPart.VISUAL_ID:
			return getFunctionColumn_nameName_5007Parser();
		case InputColumn_nameEditPart.VISUAL_ID:
			return getInputColumn_name_5006Parser();
		case FieldName2EditPart.VISUAL_ID:
			return getFieldName_5010Parser();
		case LiteralColumn_nameValue2EditPart.VISUAL_ID:
			return getLiteralColumn_nameValue_5011Parser();
		case NullLiteralColumn_name2EditPart.VISUAL_ID:
			return getNullLiteralColumn_name_5012Parser();
		case FunctionColumn_nameName2EditPart.VISUAL_ID:
			return getFunctionColumn_nameName_5013Parser();
		case InputColumn_name2EditPart.VISUAL_ID:
			return getInputColumn_name_5014Parser();
		case CallQuerySurfaceColumn_nameName3EditPart.VISUAL_ID:
			return getCallQuerySurfaceColumn_nameName_5018Parser();
		case FieldName3EditPart.VISUAL_ID:
			return getFieldName_5019Parser();
		case LiteralColumn_nameValue3EditPart.VISUAL_ID:
			return getLiteralColumn_nameValue_5020Parser();
		case NullLiteralColumn_name3EditPart.VISUAL_ID:
			return getNullLiteralColumn_name_5021Parser();
		case FunctionColumn_nameName3EditPart.VISUAL_ID:
			return getFunctionColumn_nameName_5022Parser();
		case InputColumn_name3EditPart.VISUAL_ID:
			return getInputColumn_name_5023Parser();
		case MyTableNameAliasEditPart.VISUAL_ID:
			return getMyTableNameAlias_5025Parser();
		case FieldName4EditPart.VISUAL_ID:
			return getFieldName_5024Parser();
		case InputStringDefNameEditPart.VISUAL_ID:
			return getInputStringDefName_5027Parser();
		case InputIntDefNameEditPart.VISUAL_ID:
			return getInputIntDefName_5028Parser();
		case InputDateDefNameEditPart.VISUAL_ID:
			return getInputDateDefName_5029Parser();
		case InputBitsDefNameEditPart.VISUAL_ID:
			return getInputBitsDefName_5030Parser();
		case InputFloatDefNameEditPart.VISUAL_ID:
			return getInputFloatDefName_5038Parser();
		case FieldGPointerNameEditPart.VISUAL_ID:
			return getFieldGPointerName_5036Parser();
		case FieldSPointerNameEditPart.VISUAL_ID:
			return getFieldSPointerName_5037Parser();

		case InnerjoinRelsTypeEditPart.VISUAL_ID:
			return getInnerjoinRelsType_6001Parser();

		case LeftOuterJoinRelsTypeEditPart.VISUAL_ID:
			return getLeftOuterJoinRelsType_6002Parser();

		case RightOuterJoinRelsTypeEditPart.VISUAL_ID:
			return getRightOuterJoinRelsType_6003Parser();

		case FullOuterJoinRelsTypeEditPart.VISUAL_ID:
			return getFullOuterJoinRelsType_6004Parser();
		case EqualLinkDescEditPart.VISUAL_ID:
			return getEqualLinkDesc_6005Parser();
		case GreaterThanLinkDescEditPart.VISUAL_ID:
			return getGreaterThanLinkDesc_6006Parser();
		case GreaterEqualThanLinkDescEditPart.VISUAL_ID:
			return getGreaterEqualThanLinkDesc_6007Parser();
		case LowerThanLinkDescEditPart.VISUAL_ID:
			return getLowerThanLinkDesc_6008Parser();
		case LowerEqualThanLinkDescEditPart.VISUAL_ID:
			return getLowerEqualThanLinkDesc_6009Parser();
		case InLinkDescEditPart.VISUAL_ID:
			return getInLinkDesc_6010Parser();
		case LikeLinkDescEditPart.VISUAL_ID:
			return getLikeLinkDesc_6011Parser();
		case JuncRelationshipIndexEditPart.VISUAL_ID:
			return getJuncRelationshipIndex_6012Parser();
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
			return getParser(QueryVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(QueryVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (QueryElementTypes.getElement(hint) == null) {
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
