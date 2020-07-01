// Generated from F:/CENW/src/main/antlr/language\CENW.g4 by ANTLR 4.8
package language;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CENWParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CENWVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CENWParser#fiche}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFiche(CENWParser.FicheContext ctx);
	/**
	 * Visit a parse tree produced by {@link CENWParser#paragraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraph(CENWParser.ParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link CENWParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(CENWParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CENWParser#paragraph_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraph_content(CENWParser.Paragraph_contentContext ctx);
}