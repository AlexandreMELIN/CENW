package language;

import org.antlr.v4.runtime.tree.ParseTree;

public class MyVisitor extends CENWBaseVisitor<String>{
    @Override
    public String visitFiche(CENWParser.FicheContext ctx) {

        for (ParseTree t : ctx.children){
            visit(t);
        }
        return null;
    }



    @Override
    public String visitQuestion(CENWParser.QuestionContext ctx) {
        System.out.println(ctx.getText());
        return null;
    }

    @Override
    public String visitParagraph_content(CENWParser.Paragraph_contentContext ctx) {
        System.out.println(ctx.getText());
        return null;
    }
}
