package language;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class MyVisitor extends CENWBaseVisitor<String>{
    public MyVisitor(List<String> questions, List<String> content) {
        this.questions = questions;
        this.content = content;
    }

    public MyVisitor() {
        this.questions = new ArrayList<>();
        content = new ArrayList<>();
    }

    @Override
    public String visitFiche(CENWParser.FicheContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append("<div class=\"container\"");
        for (ParseTree t : ctx.children){
            visit(t);
        }
        builder.append(buildDiv("question", questions));
        builder.append(buildDiv("content", content));
        builder.append("</div>");
        return builder.toString();
    }



    @Override
    public String visitQuestion(CENWParser.QuestionContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < ctx.getChildCount()-1; i++){
            builder.append(ctx.getChild(i).getText());
        }
        questions.add(builder.toString());
        return ctx.getText();
    }

/*    @Override
    public String visitParagraphWithoutQuestion(CENWParser.ParagraphWithoutQuestionContext ctx) {

        return super.visitParagraphWithoutQuestion(ctx);
    }*/

    private String buildDiv(String HTMLClass, List<String> values){
        StringBuilder builder = new StringBuilder();
        builder.append("<div class = \"" + HTMLClass + "\">");
        for (String s : values){
            builder.append(String.format("<p> %s </p>", s));
        }
        builder.append("</div>");
        return builder.toString();
    }
    List<String> questions;
    List<String> content;
}
