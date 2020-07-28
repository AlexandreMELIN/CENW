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
		T__0=1, T__1=2, T__2=3, NUMBER=4, SPACE=5, QUESTION_START=6, QUESTION_END=7, 
		IMG_START=8, IMG_END=9, IMG_EXTENSION=10, PUNCTUATION=11, WORD=12, INT=13, 
		ACCENT=14, END_OF_PARAGRAPH=15;
	public static final int
		RULE_title = 0, RULE_summary = 1, RULE_fiche = 2, RULE_paragraph = 3, 
		RULE_question = 4, RULE_img = 5, RULE_img_url = 6, RULE_content = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"title", "summary", "fiche", "paragraph", "question", "img", "img_url", 
			"content"
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
			setState(16);
			match(T__0);
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				content();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0) );
			setState(22);
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

	public static class SummaryContext extends ParserRuleContext {
		public TerminalNode END_OF_PARAGRAPH() { return getToken(CENWParser.END_OF_PARAGRAPH, 0); }
		public TerminalNode EOF() { return getToken(CENWParser.EOF, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public SummaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).enterSummary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CENWListener ) ((CENWListener)listener).exitSummary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CENWVisitor ) return ((CENWVisitor<? extends T>)visitor).visitSummary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummaryContext summary() throws RecognitionException {
		SummaryContext _localctx = new SummaryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_summary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__1);
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				content();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0) );
			setState(30);
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
		public SummaryContext summary() {
			return getRuleContext(SummaryContext.class,0);
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
		enterRule(_localctx, 4, RULE_fiche);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			title();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT) | (1L << END_OF_PARAGRAPH))) != 0)) {
				{
				{
				setState(33);
				paragraph();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(39);
				summary();
				}
			}

			setState(42);
			match(EOF);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_PARAGRAPH) {
				{
				setState(43);
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
		enterRule(_localctx, 6, RULE_paragraph);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0) );
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMG_START) {
					{
					{
					setState(51);
					img();
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
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
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59);
					content();
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0) );
				}
				setState(64);
				question();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMG_START) {
					{
					{
					setState(65);
					img();
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
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
		enterRule(_localctx, 8, RULE_question);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(QUESTION_START);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(75);
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
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(81);
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
		enterRule(_localctx, 10, RULE_img);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IMG_START);
			setState(84);
			img_url();
			setState(85);
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
		enterRule(_localctx, 12, RULE_img_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
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
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0) );
			setState(92);
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
		enterRule(_localctx, 14, RULE_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(94);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NUMBER) | (1L << SPACE) | (1L << PUNCTUATION) | (1L << WORD) | (1L << ACCENT))) != 0)) ) {
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
				setState(97); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21f\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\6\2\25\n\2"+
		"\r\2\16\2\26\3\2\3\2\3\3\3\3\6\3\35\n\3\r\3\16\3\36\3\3\3\3\3\4\3\4\7"+
		"\4%\n\4\f\4\16\4(\13\4\3\4\5\4+\n\4\3\4\3\4\5\4/\n\4\3\5\6\5\62\n\5\r"+
		"\5\16\5\63\3\5\7\5\67\n\5\f\5\16\5:\13\5\3\5\3\5\3\5\6\5?\n\5\r\5\16\5"+
		"@\3\5\3\5\7\5E\n\5\f\5\16\5H\13\5\3\5\5\5K\n\5\3\6\3\6\7\6O\n\6\f\6\16"+
		"\6R\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\6\b[\n\b\r\b\16\b\\\3\b\3\b\3\t\6"+
		"\tb\n\t\r\t\16\tc\3\t\3P\2\n\2\4\6\b\n\f\16\20\2\6\3\3\21\21\5\2\6\7\r"+
		"\16\20\20\5\2\6\6\r\16\20\20\5\2\5\7\r\16\20\20\2k\2\22\3\2\2\2\4\32\3"+
		"\2\2\2\6\"\3\2\2\2\bJ\3\2\2\2\nL\3\2\2\2\fU\3\2\2\2\16Z\3\2\2\2\20a\3"+
		"\2\2\2\22\24\7\3\2\2\23\25\5\20\t\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24"+
		"\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\t\2\2\2\31\3\3\2\2\2\32\34"+
		"\7\4\2\2\33\35\5\20\t\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37"+
		"\3\2\2\2\37 \3\2\2\2 !\t\2\2\2!\5\3\2\2\2\"&\5\2\2\2#%\5\b\5\2$#\3\2\2"+
		"\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(&\3\2\2\2)+\5\4\3\2*)\3\2"+
		"\2\2*+\3\2\2\2+,\3\2\2\2,.\7\2\2\3-/\7\21\2\2.-\3\2\2\2./\3\2\2\2/\7\3"+
		"\2\2\2\60\62\5\20\t\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64"+
		"\3\2\2\2\648\3\2\2\2\65\67\5\f\7\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2"+
		"\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\t\2\2\2<K\3\2\2\2=?\5\20\t\2>=\3\2"+
		"\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BF\5\n\6\2CE\5\f\7\2DC\3\2"+
		"\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GK\3\2\2\2HF\3\2\2\2IK\7\21\2\2J\61"+
		"\3\2\2\2J>\3\2\2\2JI\3\2\2\2K\t\3\2\2\2LP\7\b\2\2MO\t\3\2\2NM\3\2\2\2"+
		"OR\3\2\2\2PQ\3\2\2\2PN\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\t\2\2T\13\3\2\2"+
		"\2UV\7\n\2\2VW\5\16\b\2WX\7\13\2\2X\r\3\2\2\2Y[\t\4\2\2ZY\3\2\2\2[\\\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\f\2\2_\17\3\2\2\2`b\t\5\2\2"+
		"a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\21\3\2\2\2\17\26\36&*.\638@"+
		"FJP\\c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}