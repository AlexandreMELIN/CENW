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
		T__0=1, T__1=2, T__2=3, NUMBER=4, SPACE=5, QUESTION_START=6, QUESTION_END=7, 
		IMG_START=8, IMG_END=9, IMG_EXTENSION=10, PUNCTUATION=11, WORD=12, INT=13, 
		ACCENT=14, END_OF_PARAGRAPH=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "NUMBER", "SPACE", "QUESTION_START", "QUESTION_END", 
			"IMG_START", "IMG_END", "IMG_EXTENSION", "PUNCTUATION", "WORD", "INT", 
			"ACCENT", "END_OF_PARAGRAPH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Title:'", "'Summary:'", "'\n'", null, null, "'<<'", "'>>'", "'[['", 
			"']]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NUMBER", "SPACE", "QUESTION_START", "QUESTION_END", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\5\5\65\n"+
		"\5\3\5\7\58\n\5\f\5\16\5;\13\5\3\5\5\5>\n\5\3\5\6\5A\n\5\r\5\16\5B\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13k\n\13\3\f\3\f\3\r\3\r\6\rq\n\r"+
		"\r\r\16\rr\3\16\3\16\3\16\7\16x\n\16\f\16\16\16{\13\16\5\16}\n\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u0086\n\20\2\2\21\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\7\5\2"+
		"\13\13\17\17\"\"\b\2#$)).\61<<AAaa\4\2C\\c|\3\2\63;\3\2\62;\2\u0096\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5(\3\2\2"+
		"\2\7\61\3\2\2\2\t\64\3\2\2\2\13D\3\2\2\2\rF\3\2\2\2\17I\3\2\2\2\21L\3"+
		"\2\2\2\23O\3\2\2\2\25R\3\2\2\2\27l\3\2\2\2\31p\3\2\2\2\33|\3\2\2\2\35"+
		"~\3\2\2\2\37\u0085\3\2\2\2!\"\7V\2\2\"#\7k\2\2#$\7v\2\2$%\7n\2\2%&\7g"+
		"\2\2&\'\7<\2\2\'\4\3\2\2\2()\7U\2\2)*\7w\2\2*+\7o\2\2+,\7o\2\2,-\7c\2"+
		"\2-.\7t\2\2./\7{\2\2/\60\7<\2\2\60\6\3\2\2\2\61\62\7\f\2\2\62\b\3\2\2"+
		"\2\63\65\7/\2\2\64\63\3\2\2\2\64\65\3\2\2\2\659\3\2\2\2\668\5\33\16\2"+
		"\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2<>\7"+
		"\60\2\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\5\33\16\2@?\3\2\2\2AB\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2C\n\3\2\2\2DE\t\2\2\2E\f\3\2\2\2FG\7>\2\2GH\7>\2\2"+
		"H\16\3\2\2\2IJ\7@\2\2JK\7@\2\2K\20\3\2\2\2LM\7]\2\2MN\7]\2\2N\22\3\2\2"+
		"\2OP\7_\2\2PQ\7_\2\2Q\24\3\2\2\2Rj\7\60\2\2ST\7l\2\2TU\7r\2\2Uk\7i\2\2"+
		"VW\7r\2\2WX\7p\2\2Xk\7i\2\2YZ\7c\2\2Z[\7r\2\2[\\\7p\2\2\\k\7i\2\2]^\7"+
		"d\2\2^_\7o\2\2_k\7r\2\2`a\7i\2\2ab\7k\2\2bk\7h\2\2cd\7u\2\2de\7x\2\2e"+
		"k\7i\2\2fg\7y\2\2gh\7g\2\2hi\7d\2\2ik\7r\2\2jS\3\2\2\2jV\3\2\2\2jY\3\2"+
		"\2\2j]\3\2\2\2j`\3\2\2\2jc\3\2\2\2jf\3\2\2\2k\26\3\2\2\2lm\t\3\2\2m\30"+
		"\3\2\2\2nq\t\4\2\2oq\5\35\17\2pn\3\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2"+
		"rs\3\2\2\2s\32\3\2\2\2t}\7\62\2\2uy\t\5\2\2vx\t\6\2\2wv\3\2\2\2x{\3\2"+
		"\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|t\3\2\2\2|u\3\2\2\2}\34\3"+
		"\2\2\2~\177\4\u00c2\u0251\2\177\36\3\2\2\2\u0080\u0086\7\u202b\2\2\u0081"+
		"\u0082\7\f\2\2\u0082\u0086\7\17\2\2\u0083\u0084\7\17\2\2\u0084\u0086\7"+
		"\f\2\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		" \3\2\2\2\r\2\649=Bjpry|\u0085\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}