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
		T__0=1, T__1=2, NUMBER=3, SPACE=4, QUESTION_START=5, QUESTION_END=6, IMG_START=7, 
		IMG_END=8, IMG_EXTENSION=9, PUNCTUATION=10, WORD=11, INT=12, ACCENT=13, 
		END_OF_PARAGRAPH=14;
	public static final int
		RULE_title = 0, RULE_fiche = 1, RULE_paragraph = 2, RULE_question = 3, 
		RULE_img = 4, RULE_img_url = 5, RULE_content = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"title", "fiche", "paragraph", "question", "img", "img_url", "content"
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
			setState(14);
			match(T__0);
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				content();
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0) );
			setState(20);
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
			setState(22);
			title();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT) | (1L << END_OF_PARAGRAPH))) != 0)) {
				{
				{
				setState(23);
				paragraph();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(EOF);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_PARAGRAPH) {
				{
				setState(30);
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
		public List<ImgContext> img() {
			return getRuleContexts(ImgContext.class);
		}
		public ImgContext img(int i) {
			return getRuleContext(ImgContext.class,i);
		}
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
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(33);
					content();
					}
					}
					setState(36); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0) );
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMG_START) {
					{
					{
					setState(38);
					img();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
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
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(46);
					content();
					}
					}
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0) );
				}
				setState(51);
				question();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMG_START) {
					{
					{
					setState(52);
					img();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
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
			setState(61);
			match(QUESTION_START);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(62);
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
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(68);
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

	public static class ImgContext extends ParserRuleContext {
		public TerminalNode IMG_START() { return getToken(CENWParser.IMG_START, 0); }
		public Img_urlContext img_url() {
			return getRuleContext(Img_urlContext.class,0);
		}
		public TerminalNode IMG_END() { return getToken(CENWParser.IMG_END, 0); }
		public ImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).enterImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).exitImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CENWVisitor ) return ((CENWVisitor<? extends T>)visitor).visitImg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgContext img() throws RecognitionException {
		ImgContext _localctx = new ImgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_img);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IMG_START);
			setState(71);
			img_url();
			setState(72);
			match(IMG_END);
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

	public static class Img_urlContext extends ParserRuleContext {
		public TerminalNode IMG_EXTENSION() { return getToken(CENWParser.IMG_EXTENSION, 0); }
		public List<TerminalNode> WORD() { return getTokens(CENWParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(CENWParser.WORD, i);
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
		public Img_urlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).enterImg_url(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).exitImg_url(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CENWVisitor ) return ((CENWVisitor<? extends T>)visitor).visitImg_url(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Img_urlContext img_url() throws RecognitionException {
		Img_urlContext _localctx = new Img_urlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_img_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0) );
			setState(79);
			match(IMG_EXTENSION);
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
		enterRule(_localctx, 12, RULE_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(81);
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
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20Y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\2\3\2\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\5\3\"\n\3\3\4"+
		"\6\4%\n\4\r\4\16\4&\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\4\6\4\62\n\4"+
		"\r\4\16\4\63\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\5\4>\n\4\3\5\3\5\7\5"+
		"B\n\5\f\5\16\5E\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7N\n\7\r\7\16\7O\3"+
		"\7\3\7\3\b\6\bU\n\b\r\b\16\bV\3\b\3C\2\t\2\4\6\b\n\f\16\2\6\3\3\20\20"+
		"\5\2\5\6\f\r\17\17\5\2\5\5\f\r\17\17\5\2\4\6\f\r\17\17\2]\2\20\3\2\2\2"+
		"\4\30\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\nH\3\2\2\2\fM\3\2\2\2\16T\3\2\2\2"+
		"\20\22\7\3\2\2\21\23\5\16\b\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2"+
		"\2\24\25\3\2\2\2\25\26\3\2\2\2\26\27\t\2\2\2\27\3\3\2\2\2\30\34\5\2\2"+
		"\2\31\33\5\6\4\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2"+
		"\2\35\37\3\2\2\2\36\34\3\2\2\2\37!\7\2\2\3 \"\7\20\2\2! \3\2\2\2!\"\3"+
		"\2\2\2\"\5\3\2\2\2#%\5\16\b\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2"+
		"\'+\3\2\2\2(*\5\n\6\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2"+
		"\2-+\3\2\2\2./\t\2\2\2/>\3\2\2\2\60\62\5\16\b\2\61\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\659\5\b\5\2\668\5\n\6"+
		"\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:>\3\2\2\2;9\3\2\2\2<"+
		">\7\20\2\2=$\3\2\2\2=\61\3\2\2\2=<\3\2\2\2>\7\3\2\2\2?C\7\7\2\2@B\t\3"+
		"\2\2A@\3\2\2\2BE\3\2\2\2CD\3\2\2\2CA\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\b"+
		"\2\2G\t\3\2\2\2HI\7\t\2\2IJ\5\f\7\2JK\7\n\2\2K\13\3\2\2\2LN\t\4\2\2ML"+
		"\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\13\2\2R\r\3\2\2\2"+
		"SU\t\5\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\17\3\2\2\2\r\24\34"+
		"!&+\639=COV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}