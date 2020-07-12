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
		WORD=8, INT=9, ACCENT=10, END_OF_PARAGRAPH=11;
	public static final int
		RULE_title = 0, RULE_fiche = 1, RULE_paragraph = 2, RULE_question = 3, 
		RULE_content = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"title", "fiche", "paragraph", "question", "content"
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode END_OF_PARAGRAPH() { return getToken(CENWParser.END_OF_PARAGRAPH, 0); }
		public TerminalNode EOF() { return getToken(CENWParser.EOF, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CENWVisitor ) return ((CENWVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(11);
				content();
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0) );
			setState(16);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==END_OF_PARAGRAPH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FicheContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CENWParser.EOF, 0); }
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public TerminalNode END_OF_PARAGRAPH() { return getToken(CENWParser.END_OF_PARAGRAPH, 0); }
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
		enterRule(_localctx, 2, RULE_fiche);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			title();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT) | (1L << END_OF_PARAGRAPH))) != 0)) {
				{
				{
				setState(19);
				paragraph();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			match(EOF);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_PARAGRAPH) {
				{
				setState(26);
				match(END_OF_PARAGRAPH);
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

	public static class ParagraphContext extends ParserRuleContext {
		public TerminalNode END_OF_PARAGRAPH() { return getToken(CENWParser.END_OF_PARAGRAPH, 0); }
		public TerminalNode EOF() { return getToken(CENWParser.EOF, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
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
		enterRule(_localctx, 4, RULE_paragraph);
		int _la;
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(29);
					content();
					}
					}
					setState(32); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0) );
				}
				setState(34);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==END_OF_PARAGRAPH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(36);
					content();
					}
					}
					setState(39); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0) );
				}
				setState(41);
				question();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(END_OF_PARAGRAPH);
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
		public List<TerminalNode> ACCENT() { return getTokens(CENWParser.ACCENT); }
		public TerminalNode ACCENT(int i) {
			return getToken(CENWParser.ACCENT, i);
		}
		public List<TerminalNode> WORD() { return getTokens(CENWParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(CENWParser.WORD, i);
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
		enterRule(_localctx, 6, RULE_question);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(QUESTION_START);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(47);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(53);
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

	public static class ContentContext extends ParserRuleContext {
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
		public List<TerminalNode> ACCENT() { return getTokens(CENWParser.ACCENT); }
		public TerminalNode ACCENT(int i) {
			return getToken(CENWParser.ACCENT, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CENWVisitor ) return ((CENWVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(55);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0)) ) {
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
				setState(58); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2\3\3"+
		"\3\3\7\3\27\n\3\f\3\16\3\32\13\3\3\3\3\3\5\3\36\n\3\3\4\6\4!\n\4\r\4\16"+
		"\4\"\3\4\3\4\3\4\6\4(\n\4\r\4\16\4)\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\7\5\63"+
		"\n\5\f\5\16\5\66\13\5\3\5\3\5\3\6\6\6;\n\6\r\6\16\6<\3\6\3\64\2\7\2\4"+
		"\6\b\n\2\5\3\3\r\r\5\2\5\6\t\n\f\f\5\2\4\6\t\n\f\f\2B\2\f\3\2\2\2\4\24"+
		"\3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2\n:\3\2\2\2\f\16\7\3\2\2\r\17\5\n\6\2"+
		"\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\22\3\2\2\2"+
		"\22\23\t\2\2\2\23\3\3\2\2\2\24\30\5\2\2\2\25\27\5\6\4\2\26\25\3\2\2\2"+
		"\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2"+
		"\33\35\7\2\2\3\34\36\7\r\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36\5\3\2\2\2"+
		"\37!\5\n\6\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%"+
		"\t\2\2\2%/\3\2\2\2&(\5\n\6\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2"+
		"*+\3\2\2\2+,\5\b\5\2,/\3\2\2\2-/\7\r\2\2. \3\2\2\2.\'\3\2\2\2.-\3\2\2"+
		"\2/\7\3\2\2\2\60\64\7\7\2\2\61\63\t\3\2\2\62\61\3\2\2\2\63\66\3\2\2\2"+
		"\64\65\3\2\2\2\64\62\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\b\2\28"+
		"\t\3\2\2\29;\t\4\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\13\3\2\2"+
		"\2\n\20\30\35\").\64<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}