// Generated from F:/CENW/src/main/antlr/language\CENW.g4 by ANTLR 4.8
package language;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CENWLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NUMBER=3, SPACE=4, QUESTION_START=5, QUESTION_END=6, IMG_START=7, 
		IMG_END=8, IMG_EXTENSION=9, PUNCTUATION=10, WORD=11, INT=12, ACCENT=13, 
		END_OF_PARAGRAPH=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NUMBER", "SPACE", "QUESTION_START", "QUESTION_END", 
			"IMG_START", "IMG_END", "IMG_EXTENSION", "PUNCTUATION", "WORD", "INT", 
			"ACCENT", "END_OF_PARAGRAPH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Title:'", "'\n'", null, null, "'<<'", "'>>'", "'[['", "']]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUMBER", "SPACE", "QUESTION_START", "QUESTION_END", 
			"IMG_START", "IMG_END", "IMG_EXTENSION", "PUNCTUATION", "WORD", "INT", 
			"ACCENT", "END_OF_PARAGRAPH"
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


	public CENWLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CENW.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\5\4*\n\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\4\5\4\63\n\4\3\4\6"+
		"\4\66\n\4\r\4\16\4\67\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n`\n\n\3\13\3\13\3\f\3\f\6\ff\n\f"+
		"\r\f\16\fg\3\r\3\r\3\r\7\rm\n\r\f\r\16\rp\13\r\5\rr\n\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\5\17{\n\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\7\5\2\13\13\17\17\"\"\b\2#$)"+
		").\61<<AAaa\4\2C\\c|\3\2\63;\3\2\62;\2\u008b\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\3\37\3\2\2\2\5&\3\2\2\2\7)\3\2\2\2\t9\3\2\2\2\13;\3\2\2"+
		"\2\r>\3\2\2\2\17A\3\2\2\2\21D\3\2\2\2\23G\3\2\2\2\25a\3\2\2\2\27e\3\2"+
		"\2\2\31q\3\2\2\2\33s\3\2\2\2\35z\3\2\2\2\37 \7V\2\2 !\7k\2\2!\"\7v\2\2"+
		"\"#\7n\2\2#$\7g\2\2$%\7<\2\2%\4\3\2\2\2&\'\7\f\2\2\'\6\3\2\2\2(*\7/\2"+
		"\2)(\3\2\2\2)*\3\2\2\2*.\3\2\2\2+-\5\31\r\2,+\3\2\2\2-\60\3\2\2\2.,\3"+
		"\2\2\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61\63\7\60\2\2\62\61\3\2\2\2"+
		"\62\63\3\2\2\2\63\65\3\2\2\2\64\66\5\31\r\2\65\64\3\2\2\2\66\67\3\2\2"+
		"\2\67\65\3\2\2\2\678\3\2\2\28\b\3\2\2\29:\t\2\2\2:\n\3\2\2\2;<\7>\2\2"+
		"<=\7>\2\2=\f\3\2\2\2>?\7@\2\2?@\7@\2\2@\16\3\2\2\2AB\7]\2\2BC\7]\2\2C"+
		"\20\3\2\2\2DE\7_\2\2EF\7_\2\2F\22\3\2\2\2G_\7\60\2\2HI\7l\2\2IJ\7r\2\2"+
		"J`\7i\2\2KL\7r\2\2LM\7p\2\2M`\7i\2\2NO\7c\2\2OP\7r\2\2PQ\7p\2\2Q`\7i\2"+
		"\2RS\7d\2\2ST\7o\2\2T`\7r\2\2UV\7i\2\2VW\7k\2\2W`\7h\2\2XY\7u\2\2YZ\7"+
		"x\2\2Z`\7i\2\2[\\\7y\2\2\\]\7g\2\2]^\7d\2\2^`\7r\2\2_H\3\2\2\2_K\3\2\2"+
		"\2_N\3\2\2\2_R\3\2\2\2_U\3\2\2\2_X\3\2\2\2_[\3\2\2\2`\24\3\2\2\2ab\t\3"+
		"\2\2b\26\3\2\2\2cf\t\4\2\2df\5\33\16\2ec\3\2\2\2ed\3\2\2\2fg\3\2\2\2g"+
		"e\3\2\2\2gh\3\2\2\2h\30\3\2\2\2ir\7\62\2\2jn\t\5\2\2km\t\6\2\2lk\3\2\2"+
		"\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qi\3\2\2\2qj\3\2\2"+
		"\2r\32\3\2\2\2st\4\u00c2\u0251\2t\34\3\2\2\2u{\7\u202b\2\2vw\7\f\2\2w"+
		"{\7\17\2\2xy\7\17\2\2y{\7\f\2\2zu\3\2\2\2zv\3\2\2\2zx\3\2\2\2{\36\3\2"+
		"\2\2\r\2).\62\67_egnqz\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}