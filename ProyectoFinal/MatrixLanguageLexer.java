// Generated from MatrixLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatrixLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, IDENTIFIER=19, NUMBER=20, WHITESPACE=21, COMMENT=22, TEXT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "IDENTIFIER", "NUMBER", "WHITESPACE", "COMMENT", "TEXT"
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


	public MatrixLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MatrixLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u008a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\6\24k\n\24\r\24\16\24l\3\25\6\25p\n\25"+
		"\r\25\16\25q\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\7\30\u0081\n\30\f\30\16\30\u0084\13\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\u0082\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\6\4\2C\\c|"+
		"\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u008c\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\66\3"+
		"\2\2\2\7:\3\2\2\2\tA\3\2\2\2\13H\3\2\2\2\rN\3\2\2\2\17P\3\2\2\2\21R\3"+
		"\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2\35"+
		"^\3\2\2\2\37`\3\2\2\2!b\3\2\2\2#d\3\2\2\2%f\3\2\2\2\'h\3\2\2\2)o\3\2\2"+
		"\2+s\3\2\2\2-w\3\2\2\2/|\3\2\2\2\61\62\7o\2\2\62\63\7c\2\2\63\64\7k\2"+
		"\2\64\65\7p\2\2\65\4\3\2\2\2\66\67\7k\2\2\678\7p\2\289\7v\2\29\6\3\2\2"+
		"\2:;\7o\2\2;<\7c\2\2<=\7v\2\2=>\7t\2\2>?\7k\2\2?@\7z\2\2@\b\3\2\2\2AB"+
		"\7r\2\2BC\7t\2\2CD\7k\2\2DE\7p\2\2EF\7v\2\2FG\7O\2\2G\n\3\2\2\2HI\7y\2"+
		"\2IJ\7t\2\2JK\7k\2\2KL\7v\2\2LM\7g\2\2M\f\3\2\2\2NO\7=\2\2O\16\3\2\2\2"+
		"PQ\7.\2\2Q\20\3\2\2\2RS\7}\2\2S\22\3\2\2\2TU\7\177\2\2U\24\3\2\2\2VW\7"+
		"*\2\2W\26\3\2\2\2XY\7+\2\2Y\30\3\2\2\2Z[\7]\2\2[\32\3\2\2\2\\]\7_\2\2"+
		"]\34\3\2\2\2^_\7?\2\2_\36\3\2\2\2`a\7-\2\2a \3\2\2\2bc\7/\2\2c\"\3\2\2"+
		"\2de\7,\2\2e$\3\2\2\2fg\7`\2\2g&\3\2\2\2hj\t\2\2\2ik\t\3\2\2ji\3\2\2\2"+
		"kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m(\3\2\2\2np\t\4\2\2on\3\2\2\2pq\3\2\2\2"+
		"qo\3\2\2\2qr\3\2\2\2r*\3\2\2\2st\t\5\2\2tu\3\2\2\2uv\b\26\2\2v,\3\2\2"+
		"\2wx\7\61\2\2xy\7\61\2\2yz\3\2\2\2z{\b\27\2\2{.\3\2\2\2|}\7\61\2\2}~\7"+
		",\2\2~\u0082\3\2\2\2\177\u0081\13\2\2\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7,\2\2\u0086\u0087\7\61\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\b\30\2\2\u0089\60\3\2\2\2\6\2lq\u0082\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}