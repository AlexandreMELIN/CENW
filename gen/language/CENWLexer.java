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
		T__0=1, T__1=2, NUMBER=3, SPACE=4, QUESTION_START=5, QUESTION_END=6, PUNCTUATION=7, 
		WORD=8, INT=9, ACCENT=10, END_OF_PARAGRAPH=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NUMBER", "SPACE", "QUESTION_START", "QUESTION_END", 
			"PUNCTUATION", "WORD", "INT", "ACCENT", "END_OF_PARAGRAPH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Title:'", "'\n'", null, null, "'<<'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUMBER", "SPACE", "QUESTION_START", "QUESTION_END", 
			"PUNCTUATION", "WORD", "INT", "ACCENT", "END_OF_PARAGRAPH"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rV\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\5\4$\n\4\3\4\7\4\'"+
		"\n\4\f\4\16\4*\13\4\3\4\5\4-\n\4\3\4\6\4\60\n\4\r\4\16\4\61\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\6\t@\n\t\r\t\16\tA\3\n\3\n\3\n"+
		"\7\nG\n\n\f\n\16\nJ\13\n\5\nL\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\fU\n"+
		"\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\7\5\2"+
		"\13\13\17\17\"\"\b\2#$)).\60<<AAaa\4\2C\\c|\3\2\63;\3\2\62;\2_\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2"+
		"\2\2\5 \3\2\2\2\7#\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r8\3\2\2\2\17;\3"+
		"\2\2\2\21?\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27T\3\2\2\2\31\32\7V\2\2\32"+
		"\33\7k\2\2\33\34\7v\2\2\34\35\7n\2\2\35\36\7g\2\2\36\37\7<\2\2\37\4\3"+
		"\2\2\2 !\7\f\2\2!\6\3\2\2\2\"$\7/\2\2#\"\3\2\2\2#$\3\2\2\2$(\3\2\2\2%"+
		"\'\5\23\n\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2),\3\2\2\2*(\3\2\2"+
		"\2+-\7\60\2\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\60\5\23\n\2/.\3\2\2\2\60"+
		"\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\b\3\2\2\2\63\64\t\2\2\2\64\n"+
		"\3\2\2\2\65\66\7>\2\2\66\67\7>\2\2\67\f\3\2\2\289\7@\2\29:\7@\2\2:\16"+
		"\3\2\2\2;<\t\3\2\2<\20\3\2\2\2=@\t\4\2\2>@\5\25\13\2?=\3\2\2\2?>\3\2\2"+
		"\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\22\3\2\2\2CL\7\62\2\2DH\t\5\2\2EG\t"+
		"\6\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2KC\3"+
		"\2\2\2KD\3\2\2\2L\24\3\2\2\2MN\4\u00c2\u0251\2N\26\3\2\2\2OU\7\u202b\2"+
		"\2PQ\7\f\2\2QU\7\17\2\2RS\7\17\2\2SU\7\f\2\2TO\3\2\2\2TP\3\2\2\2TR\3\2"+
		"\2\2U\30\3\2\2\2\f\2#(,\61?AHKT\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}