// Generated from MatrixLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatrixLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, IDENTIFIER=19, NUMBER=20, WHITESPACE=21, COMMENT=22, TEXT=23;
	public static final int
		RULE_program = 0, RULE_instructions = 1, RULE_instruction = 2, RULE_var_declaration = 3, 
		RULE_list = 4, RULE_type = 5, RULE_assignation = 6, RULE_expression = 7, 
		RULE_addition = 8, RULE_subtraction = 9, RULE_product = 10, RULE_matrix_declare = 11, 
		RULE_matrix_assignation = 12, RULE_write = 13, RULE_printM = 14, RULE_matrix = 15, 
		RULE_lines = 16, RULE_line = 17, RULE_tk_main = 18, RULE_tk_int = 19, 
		RULE_tk_matrix = 20, RULE_tk_id = 21, RULE_tk_number = 22, RULE_tk_print_matrix = 23, 
		RULE_tk_write = 24, RULE_tk_semicolon = 25, RULE_tk_comma = 26, RULE_tk_open_brace = 27, 
		RULE_tk_close_brace = 28, RULE_tk_open_par = 29, RULE_tk_close_par = 30, 
		RULE_tk_open_bracket = 31, RULE_tk_close_bracket = 32, RULE_tk_assign = 33, 
		RULE_tk_add = 34, RULE_tk_subtract = 35, RULE_tk_product = 36, RULE_tk_inverse = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instructions", "instruction", "var_declaration", "list", 
			"type", "assignation", "expression", "addition", "subtraction", "product", 
			"matrix_declare", "matrix_assignation", "write", "printM", "matrix", 
			"lines", "line", "tk_main", "tk_int", "tk_matrix", "tk_id", "tk_number", 
			"tk_print_matrix", "tk_write", "tk_semicolon", "tk_comma", "tk_open_brace", 
			"tk_close_brace", "tk_open_par", "tk_close_par", "tk_open_bracket", "tk_close_bracket", 
			"tk_assign", "tk_add", "tk_subtract", "tk_product", "tk_inverse"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'int'", "'matrix'", "'printM'", "'write'", "';'", "','", 
			"'{'", "'}'", "'('", "')'", "'['", "']'", "'='", "'+'", "'-'", "'*'", 
			"'^'", null, null, null, "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "IDENTIFIER", "NUMBER", "WHITESPACE", 
			"COMMENT", "TEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MatrixLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MatrixLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Tk_mainContext tk_main() {
			return getRuleContext(Tk_mainContext.class,0);
		}
		public Tk_open_braceContext tk_open_brace() {
			return getRuleContext(Tk_open_braceContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public Tk_close_braceContext tk_close_brace() {
			return getRuleContext(Tk_close_braceContext.class,0);
		}
		public Tk_semicolonContext tk_semicolon() {
			return getRuleContext(Tk_semicolonContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			tk_main();
			setState(77);
			tk_open_brace();
			setState(78);
			instructions();
			setState(79);
			tk_close_brace();
			setState(80);
			tk_semicolon();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionsContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instructions);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				instruction();
				setState(84);
				instructions();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Tk_semicolonContext tk_semicolon() {
			return getRuleContext(Tk_semicolonContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public Matrix_declareContext matrix_declare() {
			return getRuleContext(Matrix_declareContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				var_declaration();
				setState(89);
				tk_semicolon();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				assignation();
				setState(92);
				tk_semicolon();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				write();
				setState(95);
				tk_semicolon();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				matrix_declare();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitVar_declaration(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			type();
			setState(101);
			list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public Tk_idContext tk_id() {
			return getRuleContext(Tk_idContext.class,0);
		}
		public Tk_commaContext tk_comma() {
			return getRuleContext(Tk_commaContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				tk_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				tk_id();
				setState(105);
				tk_comma();
				setState(106);
				list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Tk_numberContext tk_number() {
			return getRuleContext(Tk_numberContext.class,0);
		}
		public Tk_matrixContext tk_matrix() {
			return getRuleContext(Tk_matrixContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				tk_number();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				tk_matrix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignationContext extends ParserRuleContext {
		public Tk_idContext tk_id() {
			return getRuleContext(Tk_idContext.class,0);
		}
		public Tk_assignContext tk_assign() {
			return getRuleContext(Tk_assignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			tk_id();
			setState(115);
			tk_assign();
			setState(116);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Tk_numberContext tk_number() {
			return getRuleContext(Tk_numberContext.class,0);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public Tk_idContext tk_id() {
			return getRuleContext(Tk_idContext.class,0);
		}
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public SubtractionContext subtraction() {
			return getRuleContext(SubtractionContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public Tk_inverseContext tk_inverse() {
			return getRuleContext(Tk_inverseContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				tk_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				matrix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				tk_id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				addition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				subtraction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				product();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				tk_inverse();
				setState(125);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionContext extends ParserRuleContext {
		public List<Tk_numberContext> tk_number() {
			return getRuleContexts(Tk_numberContext.class);
		}
		public Tk_numberContext tk_number(int i) {
			return getRuleContext(Tk_numberContext.class,i);
		}
		public Tk_addContext tk_add() {
			return getRuleContext(Tk_addContext.class,0);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitAddition(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			tk_number();
			setState(130);
			tk_add();
			setState(131);
			tk_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubtractionContext extends ParserRuleContext {
		public List<Tk_numberContext> tk_number() {
			return getRuleContexts(Tk_numberContext.class);
		}
		public Tk_numberContext tk_number(int i) {
			return getRuleContext(Tk_numberContext.class,i);
		}
		public Tk_subtractContext tk_subtract() {
			return getRuleContext(Tk_subtractContext.class,0);
		}
		public SubtractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitSubtraction(this);
		}
	}

	public final SubtractionContext subtraction() throws RecognitionException {
		SubtractionContext _localctx = new SubtractionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subtraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			tk_number();
			setState(134);
			tk_subtract();
			setState(135);
			tk_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductContext extends ParserRuleContext {
		public List<Tk_numberContext> tk_number() {
			return getRuleContexts(Tk_numberContext.class);
		}
		public Tk_numberContext tk_number(int i) {
			return getRuleContext(Tk_numberContext.class,i);
		}
		public Tk_productContext tk_product() {
			return getRuleContext(Tk_productContext.class,0);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitProduct(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			tk_number();
			setState(138);
			tk_product();
			setState(139);
			tk_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matrix_declareContext extends ParserRuleContext {
		public List<Tk_open_bracketContext> tk_open_bracket() {
			return getRuleContexts(Tk_open_bracketContext.class);
		}
		public Tk_open_bracketContext tk_open_bracket(int i) {
			return getRuleContext(Tk_open_bracketContext.class,i);
		}
		public List<Tk_numberContext> tk_number() {
			return getRuleContexts(Tk_numberContext.class);
		}
		public Tk_numberContext tk_number(int i) {
			return getRuleContext(Tk_numberContext.class,i);
		}
		public List<Tk_close_bracketContext> tk_close_bracket() {
			return getRuleContexts(Tk_close_bracketContext.class);
		}
		public Tk_close_bracketContext tk_close_bracket(int i) {
			return getRuleContext(Tk_close_bracketContext.class,i);
		}
		public Matrix_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterMatrix_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitMatrix_declare(this);
		}
	}

	public final Matrix_declareContext matrix_declare() throws RecognitionException {
		Matrix_declareContext _localctx = new Matrix_declareContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matrix_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			tk_open_bracket();
			setState(142);
			tk_number();
			setState(143);
			tk_close_bracket();
			setState(144);
			tk_open_bracket();
			setState(145);
			tk_number();
			setState(146);
			tk_close_bracket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matrix_assignationContext extends ParserRuleContext {
		public Tk_idContext tk_id() {
			return getRuleContext(Tk_idContext.class,0);
		}
		public Tk_assignContext tk_assign() {
			return getRuleContext(Tk_assignContext.class,0);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public Matrix_assignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterMatrix_assignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitMatrix_assignation(this);
		}
	}

	public final Matrix_assignationContext matrix_assignation() throws RecognitionException {
		Matrix_assignationContext _localctx = new Matrix_assignationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_matrix_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			tk_id();
			setState(149);
			tk_assign();
			setState(150);
			matrix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public Tk_writeContext tk_write() {
			return getRuleContext(Tk_writeContext.class,0);
		}
		public Tk_idContext tk_id() {
			return getRuleContext(Tk_idContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			tk_write();
			setState(153);
			tk_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintMContext extends ParserRuleContext {
		public Tk_print_matrixContext tk_print_matrix() {
			return getRuleContext(Tk_print_matrixContext.class,0);
		}
		public Tk_matrixContext tk_matrix() {
			return getRuleContext(Tk_matrixContext.class,0);
		}
		public PrintMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterPrintM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitPrintM(this);
		}
	}

	public final PrintMContext printM() throws RecognitionException {
		PrintMContext _localctx = new PrintMContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			tk_print_matrix();
			setState(156);
			tk_matrix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixContext extends ParserRuleContext {
		public Tk_open_bracketContext tk_open_bracket() {
			return getRuleContext(Tk_open_bracketContext.class,0);
		}
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public Tk_close_bracketContext tk_close_bracket() {
			return getRuleContext(Tk_close_bracketContext.class,0);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitMatrix(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_matrix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			tk_open_bracket();
			setState(159);
			lines();
			setState(160);
			tk_close_bracket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinesContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public Tk_semicolonContext tk_semicolon() {
			return getRuleContext(Tk_semicolonContext.class,0);
		}
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitLines(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lines);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				line();
				setState(164);
				tk_semicolon();
				setState(165);
				lines();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public List<Tk_numberContext> tk_number() {
			return getRuleContexts(Tk_numberContext.class);
		}
		public Tk_numberContext tk_number(int i) {
			return getRuleContext(Tk_numberContext.class,i);
		}
		public Tk_commaContext tk_comma() {
			return getRuleContext(Tk_commaContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_line);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				tk_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				tk_number();
				setState(171);
				tk_comma();
				setState(172);
				tk_number();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_mainContext extends ParserRuleContext {
		public Tk_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_main(this);
		}
	}

	public final Tk_mainContext tk_main() throws RecognitionException {
		Tk_mainContext _localctx = new Tk_mainContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tk_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_intContext extends ParserRuleContext {
		public Tk_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_int(this);
		}
	}

	public final Tk_intContext tk_int() throws RecognitionException {
		Tk_intContext _localctx = new Tk_intContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tk_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_matrixContext extends ParserRuleContext {
		public Tk_matrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_matrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_matrix(this);
		}
	}

	public final Tk_matrixContext tk_matrix() throws RecognitionException {
		Tk_matrixContext _localctx = new Tk_matrixContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tk_matrix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_idContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MatrixLanguageParser.IDENTIFIER, 0); }
		public Tk_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_id(this);
		}
	}

	public final Tk_idContext tk_id() throws RecognitionException {
		Tk_idContext _localctx = new Tk_idContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tk_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MatrixLanguageParser.NUMBER, 0); }
		public Tk_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_number(this);
		}
	}

	public final Tk_numberContext tk_number() throws RecognitionException {
		Tk_numberContext _localctx = new Tk_numberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tk_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_print_matrixContext extends ParserRuleContext {
		public Tk_print_matrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_print_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_print_matrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_print_matrix(this);
		}
	}

	public final Tk_print_matrixContext tk_print_matrix() throws RecognitionException {
		Tk_print_matrixContext _localctx = new Tk_print_matrixContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tk_print_matrix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_writeContext extends ParserRuleContext {
		public Tk_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_write(this);
		}
	}

	public final Tk_writeContext tk_write() throws RecognitionException {
		Tk_writeContext _localctx = new Tk_writeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tk_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_semicolonContext extends ParserRuleContext {
		public Tk_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_semicolon(this);
		}
	}

	public final Tk_semicolonContext tk_semicolon() throws RecognitionException {
		Tk_semicolonContext _localctx = new Tk_semicolonContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tk_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_commaContext extends ParserRuleContext {
		public Tk_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_comma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_comma(this);
		}
	}

	public final Tk_commaContext tk_comma() throws RecognitionException {
		Tk_commaContext _localctx = new Tk_commaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tk_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_open_braceContext extends ParserRuleContext {
		public Tk_open_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_open_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_open_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_open_brace(this);
		}
	}

	public final Tk_open_braceContext tk_open_brace() throws RecognitionException {
		Tk_open_braceContext _localctx = new Tk_open_braceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tk_open_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_close_braceContext extends ParserRuleContext {
		public Tk_close_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_close_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_close_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_close_brace(this);
		}
	}

	public final Tk_close_braceContext tk_close_brace() throws RecognitionException {
		Tk_close_braceContext _localctx = new Tk_close_braceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tk_close_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_open_parContext extends ParserRuleContext {
		public Tk_open_parContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_open_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_open_par(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_open_par(this);
		}
	}

	public final Tk_open_parContext tk_open_par() throws RecognitionException {
		Tk_open_parContext _localctx = new Tk_open_parContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tk_open_par);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_close_parContext extends ParserRuleContext {
		public Tk_close_parContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_close_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_close_par(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_close_par(this);
		}
	}

	public final Tk_close_parContext tk_close_par() throws RecognitionException {
		Tk_close_parContext _localctx = new Tk_close_parContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tk_close_par);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_open_bracketContext extends ParserRuleContext {
		public Tk_open_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_open_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_open_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_open_bracket(this);
		}
	}

	public final Tk_open_bracketContext tk_open_bracket() throws RecognitionException {
		Tk_open_bracketContext _localctx = new Tk_open_bracketContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tk_open_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_close_bracketContext extends ParserRuleContext {
		public Tk_close_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_close_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_close_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_close_bracket(this);
		}
	}

	public final Tk_close_bracketContext tk_close_bracket() throws RecognitionException {
		Tk_close_bracketContext _localctx = new Tk_close_bracketContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tk_close_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_assignContext extends ParserRuleContext {
		public Tk_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_assign(this);
		}
	}

	public final Tk_assignContext tk_assign() throws RecognitionException {
		Tk_assignContext _localctx = new Tk_assignContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tk_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_addContext extends ParserRuleContext {
		public Tk_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_add(this);
		}
	}

	public final Tk_addContext tk_add() throws RecognitionException {
		Tk_addContext _localctx = new Tk_addContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tk_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_subtractContext extends ParserRuleContext {
		public Tk_subtractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_subtract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_subtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_subtract(this);
		}
	}

	public final Tk_subtractContext tk_subtract() throws RecognitionException {
		Tk_subtractContext _localctx = new Tk_subtractContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tk_subtract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_productContext extends ParserRuleContext {
		public Tk_productContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_product(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_product(this);
		}
	}

	public final Tk_productContext tk_product() throws RecognitionException {
		Tk_productContext _localctx = new Tk_productContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tk_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_inverseContext extends ParserRuleContext {
		public Tk_inverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_inverse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterTk_inverse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitTk_inverse(this);
		}
	}

	public final Tk_inverseContext tk_inverse() throws RecognitionException {
		Tk_inverseContext _localctx = new Tk_inverseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tk_inverse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4e\n"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\7\3\7\5\7s\n\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00aa\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00b1"+
		"\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\2\2\u00c2\2N\3\2\2\2"+
		"\4X\3\2\2\2\6d\3\2\2\2\bf\3\2\2\2\nn\3\2\2\2\fr\3\2\2\2\16t\3\2\2\2\20"+
		"\u0081\3\2\2\2\22\u0083\3\2\2\2\24\u0087\3\2\2\2\26\u008b\3\2\2\2\30\u008f"+
		"\3\2\2\2\32\u0096\3\2\2\2\34\u009a\3\2\2\2\36\u009d\3\2\2\2 \u00a0\3\2"+
		"\2\2\"\u00a9\3\2\2\2$\u00b0\3\2\2\2&\u00b2\3\2\2\2(\u00b4\3\2\2\2*\u00b6"+
		"\3\2\2\2,\u00b8\3\2\2\2.\u00ba\3\2\2\2\60\u00bc\3\2\2\2\62\u00be\3\2\2"+
		"\2\64\u00c0\3\2\2\2\66\u00c2\3\2\2\28\u00c4\3\2\2\2:\u00c6\3\2\2\2<\u00c8"+
		"\3\2\2\2>\u00ca\3\2\2\2@\u00cc\3\2\2\2B\u00ce\3\2\2\2D\u00d0\3\2\2\2F"+
		"\u00d2\3\2\2\2H\u00d4\3\2\2\2J\u00d6\3\2\2\2L\u00d8\3\2\2\2NO\5&\24\2"+
		"OP\58\35\2PQ\5\4\3\2QR\5:\36\2RS\5\64\33\2S\3\3\2\2\2TY\5\6\4\2UV\5\6"+
		"\4\2VW\5\4\3\2WY\3\2\2\2XT\3\2\2\2XU\3\2\2\2Y\5\3\2\2\2Z[\5\b\5\2[\\\5"+
		"\64\33\2\\e\3\2\2\2]^\5\16\b\2^_\5\64\33\2_e\3\2\2\2`a\5\34\17\2ab\5\64"+
		"\33\2be\3\2\2\2ce\5\30\r\2dZ\3\2\2\2d]\3\2\2\2d`\3\2\2\2dc\3\2\2\2e\7"+
		"\3\2\2\2fg\5\f\7\2gh\5\n\6\2h\t\3\2\2\2io\5,\27\2jk\5,\27\2kl\5\66\34"+
		"\2lm\5\n\6\2mo\3\2\2\2ni\3\2\2\2nj\3\2\2\2o\13\3\2\2\2ps\5.\30\2qs\5*"+
		"\26\2rp\3\2\2\2rq\3\2\2\2s\r\3\2\2\2tu\5,\27\2uv\5D#\2vw\5\20\t\2w\17"+
		"\3\2\2\2x\u0082\5.\30\2y\u0082\5 \21\2z\u0082\5,\27\2{\u0082\5\22\n\2"+
		"|\u0082\5\24\13\2}\u0082\5\26\f\2~\177\5L\'\2\177\u0080\5\20\t\2\u0080"+
		"\u0082\3\2\2\2\u0081x\3\2\2\2\u0081y\3\2\2\2\u0081z\3\2\2\2\u0081{\3\2"+
		"\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0082\21\3\2\2\2\u0083"+
		"\u0084\5.\30\2\u0084\u0085\5F$\2\u0085\u0086\5.\30\2\u0086\23\3\2\2\2"+
		"\u0087\u0088\5.\30\2\u0088\u0089\5H%\2\u0089\u008a\5.\30\2\u008a\25\3"+
		"\2\2\2\u008b\u008c\5.\30\2\u008c\u008d\5J&\2\u008d\u008e\5.\30\2\u008e"+
		"\27\3\2\2\2\u008f\u0090\5@!\2\u0090\u0091\5.\30\2\u0091\u0092\5B\"\2\u0092"+
		"\u0093\5@!\2\u0093\u0094\5.\30\2\u0094\u0095\5B\"\2\u0095\31\3\2\2\2\u0096"+
		"\u0097\5,\27\2\u0097\u0098\5D#\2\u0098\u0099\5 \21\2\u0099\33\3\2\2\2"+
		"\u009a\u009b\5\62\32\2\u009b\u009c\5,\27\2\u009c\35\3\2\2\2\u009d\u009e"+
		"\5\60\31\2\u009e\u009f\5*\26\2\u009f\37\3\2\2\2\u00a0\u00a1\5@!\2\u00a1"+
		"\u00a2\5\"\22\2\u00a2\u00a3\5B\"\2\u00a3!\3\2\2\2\u00a4\u00aa\5$\23\2"+
		"\u00a5\u00a6\5$\23\2\u00a6\u00a7\5\64\33\2\u00a7\u00a8\5\"\22\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa#\3\2\2\2"+
		"\u00ab\u00b1\5.\30\2\u00ac\u00ad\5.\30\2\u00ad\u00ae\5\66\34\2\u00ae\u00af"+
		"\5.\30\2\u00af\u00b1\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1"+
		"%\3\2\2\2\u00b2\u00b3\7\3\2\2\u00b3\'\3\2\2\2\u00b4\u00b5\7\4\2\2\u00b5"+
		")\3\2\2\2\u00b6\u00b7\7\5\2\2\u00b7+\3\2\2\2\u00b8\u00b9\7\25\2\2\u00b9"+
		"-\3\2\2\2\u00ba\u00bb\7\26\2\2\u00bb/\3\2\2\2\u00bc\u00bd\7\6\2\2\u00bd"+
		"\61\3\2\2\2\u00be\u00bf\7\7\2\2\u00bf\63\3\2\2\2\u00c0\u00c1\7\b\2\2\u00c1"+
		"\65\3\2\2\2\u00c2\u00c3\7\t\2\2\u00c3\67\3\2\2\2\u00c4\u00c5\7\n\2\2\u00c5"+
		"9\3\2\2\2\u00c6\u00c7\7\13\2\2\u00c7;\3\2\2\2\u00c8\u00c9\7\f\2\2\u00c9"+
		"=\3\2\2\2\u00ca\u00cb\7\r\2\2\u00cb?\3\2\2\2\u00cc\u00cd\7\16\2\2\u00cd"+
		"A\3\2\2\2\u00ce\u00cf\7\17\2\2\u00cfC\3\2\2\2\u00d0\u00d1\7\20\2\2\u00d1"+
		"E\3\2\2\2\u00d2\u00d3\7\21\2\2\u00d3G\3\2\2\2\u00d4\u00d5\7\22\2\2\u00d5"+
		"I\3\2\2\2\u00d6\u00d7\7\23\2\2\u00d7K\3\2\2\2\u00d8\u00d9\7\24\2\2\u00d9"+
		"M\3\2\2\2\tXdnr\u0081\u00a9\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}