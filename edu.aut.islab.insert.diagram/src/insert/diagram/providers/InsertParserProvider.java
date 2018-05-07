/*
 * 
 */
package insert.diagram.providers;

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

import insert.InsertPackage;
import insert.diagram.edit.parts.CallSurfaceQueryName2EditPart;
import insert.diagram.edit.parts.CallSurfaceQueryNameEditPart;
import insert.diagram.edit.parts.FieldColumn_nameName2EditPart;
import insert.diagram.edit.parts.FieldColumn_nameName3EditPart;
import insert.diagram.edit.parts.FieldColumn_nameNameEditPart;
import insert.diagram.edit.parts.FunctionName2EditPart;
import insert.diagram.edit.parts.FunctionNameEditPart;
import insert.diagram.edit.parts.InputBitsDefNameEditPart;
import insert.diagram.edit.parts.InputDateDefNameEditPart;
import insert.diagram.edit.parts.InputFloatDefNameEditPart;
import insert.diagram.edit.parts.InputInstalmentNameEditPart;
import insert.diagram.edit.parts.InputIntDefNameEditPart;
import insert.diagram.edit.parts.InputName2EditPart;
import insert.diagram.edit.parts.InputNameEditPart;
import insert.diagram.edit.parts.InputStringDefNameEditPart;
import insert.diagram.edit.parts.LiteralColumn_nameValue2EditPart;
import insert.diagram.edit.parts.LiteralColumn_nameValueEditPart;
import insert.diagram.edit.parts.NullLiteralColumn_name2EditPart;
import insert.diagram.edit.parts.NullLiteralColumn_nameEditPart;
import insert.diagram.edit.parts.PrepareListNameEditPart;
import insert.diagram.edit.parts.TableNameEditPart;
import insert.diagram.parsers.MessageFormatParser;
import insert.diagram.part.InsertVisualIDRegistry;

/**
 * @generated
 */
public class InsertParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser tableName_5022Parser;

	/**
	* @generated
	*/
	private IParser getTableName_5022Parser() {
		if (tableName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getTable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5022Parser = parser;
		}
		return tableName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser inputInstalmentName_5007Parser;

	/**
	* @generated
	*/
	private IParser getInputInstalmentName_5007Parser() {
		if (inputInstalmentName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getInputInstalment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputInstalmentName_5007Parser = parser;
		}
		return inputInstalmentName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser prepareListName_5020Parser;

	/**
	* @generated
	*/
	private IParser getPrepareListName_5020Parser() {
		if (prepareListName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getPrepareList_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			prepareListName_5020Parser = parser;
		}
		return prepareListName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldColumn_nameName_5021Parser;

	/**
	* @generated
	*/
	private IParser getFieldColumn_nameName_5021Parser() {
		if (fieldColumn_nameName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getNode_Column_name(),
					InsertPackage.eINSTANCE.getField_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			fieldColumn_nameName_5021Parser = parser;
		}
		return fieldColumn_nameName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser inputStringDefName_5003Parser;

	/**
	* @generated
	*/
	private IParser getInputStringDefName_5003Parser() {
		if (inputStringDefName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputStringDefName_5003Parser = parser;
		}
		return inputStringDefName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser inputIntDefName_5004Parser;

	/**
	* @generated
	*/
	private IParser getInputIntDefName_5004Parser() {
		if (inputIntDefName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputIntDefName_5004Parser = parser;
		}
		return inputIntDefName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser inputDateDefName_5005Parser;

	/**
	* @generated
	*/
	private IParser getInputDateDefName_5005Parser() {
		if (inputDateDefName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputDateDefName_5005Parser = parser;
		}
		return inputDateDefName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser inputBitsDefName_5006Parser;

	/**
	* @generated
	*/
	private IParser getInputBitsDefName_5006Parser() {
		if (inputBitsDefName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputBitsDefName_5006Parser = parser;
		}
		return inputBitsDefName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser inputFloatDefName_5023Parser;

	/**
	* @generated
	*/
	private IParser getInputFloatDefName_5023Parser() {
		if (inputFloatDefName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getInputDef_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputFloatDefName_5023Parser = parser;
		}
		return inputFloatDefName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser callSurfaceQueryName_5014Parser;

	/**
	* @generated
	*/
	private IParser getCallSurfaceQueryName_5014Parser() {
		if (callSurfaceQueryName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callSurfaceQueryName_5014Parser = parser;
		}
		return callSurfaceQueryName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser callSurfaceQueryName_5013Parser;

	/**
	* @generated
	*/
	private IParser getCallSurfaceQueryName_5013Parser() {
		if (callSurfaceQueryName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callSurfaceQueryName_5013Parser = parser;
		}
		return callSurfaceQueryName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldColumn_nameName_5008Parser;

	/**
	* @generated
	*/
	private IParser getFieldColumn_nameName_5008Parser() {
		if (fieldColumn_nameName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getNode_Column_name(),
					InsertPackage.eINSTANCE.getField_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			fieldColumn_nameName_5008Parser = parser;
		}
		return fieldColumn_nameName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser literalColumn_nameValue_5009Parser;

	/**
	* @generated
	*/
	private IParser getLiteralColumn_nameValue_5009Parser() {
		if (literalColumn_nameValue_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getNode_Column_name(),
					InsertPackage.eINSTANCE.getLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			literalColumn_nameValue_5009Parser = parser;
		}
		return literalColumn_nameValue_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser nullLiteralColumn_name_5010Parser;

	/**
	* @generated
	*/
	private IParser getNullLiteralColumn_name_5010Parser() {
		if (nullLiteralColumn_name_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			nullLiteralColumn_name_5010Parser = parser;
		}
		return nullLiteralColumn_name_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser functionName_5012Parser;

	/**
	* @generated
	*/
	private IParser getFunctionName_5012Parser() {
		if (functionName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			functionName_5012Parser = parser;
		}
		return functionName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser inputName_5011Parser;

	/**
	* @generated
	*/
	private IParser getInputName_5011Parser() {
		if (inputName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getInput_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5011Parser = parser;
		}
		return inputName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser fieldColumn_nameName_5015Parser;

	/**
	* @generated
	*/
	private IParser getFieldColumn_nameName_5015Parser() {
		if (fieldColumn_nameName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getNode_Column_name(),
					InsertPackage.eINSTANCE.getField_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			fieldColumn_nameName_5015Parser = parser;
		}
		return fieldColumn_nameName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser literalColumn_nameValue_5016Parser;

	/**
	* @generated
	*/
	private IParser getLiteralColumn_nameValue_5016Parser() {
		if (literalColumn_nameValue_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getNode_Column_name(),
					InsertPackage.eINSTANCE.getLiteral_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}/{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}/{1}"); //$NON-NLS-1$
			literalColumn_nameValue_5016Parser = parser;
		}
		return literalColumn_nameValue_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser nullLiteralColumn_name_5017Parser;

	/**
	* @generated
	*/
	private IParser getNullLiteralColumn_name_5017Parser() {
		if (nullLiteralColumn_name_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getNode_Column_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			nullLiteralColumn_name_5017Parser = parser;
		}
		return nullLiteralColumn_name_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser functionName_5018Parser;

	/**
	* @generated
	*/
	private IParser getFunctionName_5018Parser() {
		if (functionName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			functionName_5018Parser = parser;
		}
		return functionName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser inputName_5019Parser;

	/**
	* @generated
	*/
	private IParser getInputName_5019Parser() {
		if (inputName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { InsertPackage.eINSTANCE.getInput_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5019Parser = parser;
		}
		return inputName_5019Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TableNameEditPart.VISUAL_ID:
			return getTableName_5022Parser();
		case InputInstalmentNameEditPart.VISUAL_ID:
			return getInputInstalmentName_5007Parser();
		case PrepareListNameEditPart.VISUAL_ID:
			return getPrepareListName_5020Parser();
		case FieldColumn_nameNameEditPart.VISUAL_ID:
			return getFieldColumn_nameName_5021Parser();
		case InputStringDefNameEditPart.VISUAL_ID:
			return getInputStringDefName_5003Parser();
		case InputIntDefNameEditPart.VISUAL_ID:
			return getInputIntDefName_5004Parser();
		case InputDateDefNameEditPart.VISUAL_ID:
			return getInputDateDefName_5005Parser();
		case InputBitsDefNameEditPart.VISUAL_ID:
			return getInputBitsDefName_5006Parser();
		case InputFloatDefNameEditPart.VISUAL_ID:
			return getInputFloatDefName_5023Parser();
		case CallSurfaceQueryNameEditPart.VISUAL_ID:
			return getCallSurfaceQueryName_5014Parser();
		case CallSurfaceQueryName2EditPart.VISUAL_ID:
			return getCallSurfaceQueryName_5013Parser();
		case FieldColumn_nameName2EditPart.VISUAL_ID:
			return getFieldColumn_nameName_5008Parser();
		case LiteralColumn_nameValueEditPart.VISUAL_ID:
			return getLiteralColumn_nameValue_5009Parser();
		case NullLiteralColumn_nameEditPart.VISUAL_ID:
			return getNullLiteralColumn_name_5010Parser();
		case FunctionNameEditPart.VISUAL_ID:
			return getFunctionName_5012Parser();
		case InputNameEditPart.VISUAL_ID:
			return getInputName_5011Parser();
		case FieldColumn_nameName3EditPart.VISUAL_ID:
			return getFieldColumn_nameName_5015Parser();
		case LiteralColumn_nameValue2EditPart.VISUAL_ID:
			return getLiteralColumn_nameValue_5016Parser();
		case NullLiteralColumn_name2EditPart.VISUAL_ID:
			return getNullLiteralColumn_name_5017Parser();
		case FunctionName2EditPart.VISUAL_ID:
			return getFunctionName_5018Parser();
		case InputName2EditPart.VISUAL_ID:
			return getInputName_5019Parser();
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
			return getParser(InsertVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(InsertVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (InsertElementTypes.getElement(hint) == null) {
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
