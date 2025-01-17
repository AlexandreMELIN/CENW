// Generated from F:/CENW/src/main/antlr/language\CENW.g4 by ANTLR 4.8
package language;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CENWParser}.
 */
public interface CENWListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CENWParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(CENWParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CENWParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(CENWParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CENWParser#fiche}.
	 * @param ctx the parse tree
	 */
	void enterFiche(CENWParser.FicheContext ctx);
	/**
	 * Exit a parse tree produced by {@link CENWParser#fiche}.
	 * @param ctx the parse tree
	 */
	void exitFiche(CENWParser.FicheContext ctx);
	/**
	 * Enter a parse tree produced by {@link CENWParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(CENWParser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link CENWParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(CENWParser.ParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link CENWParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(CENWParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CENWParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(CENWParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CENWParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(CENWParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CENWParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(CENWParser.ContentContext ctx);
}