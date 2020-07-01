// Generated from F:/CENW/src/main/antlr/language\CENW.g4 by ANTLR 4.8
package language;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CENWParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NUMBER=3, SPACE=4, QUESTION_START=5, QUESTION_END=6, PUNCTUATION=7, 
		WORD=8, INT=9;
	public static final int
		RULE_fiche = 0, RULE_paragraph = 1, RULE_question = 2, RULE_paragraph_content = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"fiche", "paragraph", "question", "paragraph_content"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\r'", "'\n'", null, null, "'<<'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUMBER", "SPACE", "QUESTION_START", "QUESTION_END", 
			"PUNCTUATION", "WORD", "INT"
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
	public String getGrammarFileName() { return "CENW.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CENWParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FicheContext extends ParserRuleContext {
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public FicheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fiche; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).enterFiche(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).exitFiche(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CENWVisitor ) return ((CENWVisitor<? extends T>)visitor).visitFiche(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FicheContext fiche() throws RecognitionException {
		FicheContext _localctx = new FicheContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fiche);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				paragraph();
				setState(10);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION_START) {
					{
					setState(9);
					question();
					}
				}

				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD))) != 0) );
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

	public static class ParagraphContext extends ParserRuleContext {
		public List<Paragraph_contentContext> paragraph_content() {
			return getRuleContexts(Paragraph_contentContext.class);
		}
		public Paragraph_contentContext paragraph_content(int i) {
			return getRuleContext(Paragraph_contentContext.class,i);
		}
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).enterParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).exitParagraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CENWVisitor ) return ((CENWVisitor<? extends T>)visitor).visitParagraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_paragraph);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(16);
					paragraph_content();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(19); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(21);
				match(T__0);
				}
			}

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

	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode QUESTION_START() { return getToken(CENWParser.QUESTION_START, 0); }
		public TerminalNode QUESTION_END() { return getToken(CENWParser.QUESTION_END, 0); }
		public List<TerminalNode> SPACE() { return getTokens(CENWParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CENWParser.SPACE, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(CENWParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(CENWParser.PUNCTUATION, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(CENWParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CENWParser.NUMBER, i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CENWVisitor ) return ((CENWVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_question);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(QUESTION_START);
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(29);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(25);
						match(SPACE);
						}
						break;
					case 2:
						{
						setState(26);
						match(PUNCTUATION);
						}
						break;
					case 3:
						{
						setState(27);
						match(NUMBER);
						}
						break;
					case 4:
						{
						setState(28);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(34);
			match(QUESTION_END);
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

	public static class Paragraph_contentContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(CENWParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(CENWParser.WORD, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(CENWParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CENWParser.SPACE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(CENWParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CENWParser.NUMBER, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(CENWParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(CENWParser.PUNCTUATION, i);
		}
		public Paragraph_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).enterParagraph_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).exitParagraph_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CENWVisitor ) return ((CENWVisitor<? extends T>)visitor).visitParagraph_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paragraph_contentContext paragraph_content() throws RecognitionException {
		Paragraph_contentContext _localctx = new Paragraph_contentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paragraph_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(36);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(39); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\5\2\r\n\2\6\2\17\n\2\r\2\16\2\20\3\3\6\3\24"+
		"\n\3\r\3\16\3\25\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\4\7\4 \n\4\f\4\16\4"+
		"#\13\4\3\4\3\4\3\5\6\5(\n\5\r\5\16\5)\3\5\3!\2\6\2\4\6\b\2\3\4\2\4\6\t"+
		"\n\2\60\2\16\3\2\2\2\4\23\3\2\2\2\6\32\3\2\2\2\b\'\3\2\2\2\n\f\5\4\3\2"+
		"\13\r\5\6\4\2\f\13\3\2\2\2\f\r\3\2\2\2\r\17\3\2\2\2\16\n\3\2\2\2\17\20"+
		"\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\3\3\2\2\2\22\24\5\b\5\2\23\22"+
		"\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\31"+
		"\7\3\2\2\30\27\3\2\2\2\30\31\3\2\2\2\31\5\3\2\2\2\32!\7\7\2\2\33 \7\6"+
		"\2\2\34 \7\t\2\2\35 \7\5\2\2\36 \13\2\2\2\37\33\3\2\2\2\37\34\3\2\2\2"+
		"\37\35\3\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\"\3\2\2\2!\37\3\2\2\2\"$\3\2\2"+
		"\2#!\3\2\2\2$%\7\b\2\2%\7\3\2\2\2&(\t\2\2\2\'&\3\2\2\2()\3\2\2\2)\'\3"+
		"\2\2\2)*\3\2\2\2*\t\3\2\2\2\t\f\20\25\30\37!)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}