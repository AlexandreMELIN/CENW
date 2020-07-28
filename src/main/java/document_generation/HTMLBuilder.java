package document_generation;

import j2html.tags.ContainerTag;
import j2html.tags.Tag;
import language.CENWParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static j2html.TagCreator.*;

public final class HTMLBuilder extends DocBuilder<String>{

    public HTMLBuilder(String content) {
        super(content);
        this.questions = new LinkedList<>();
        this.content = new LinkedList<>();

    }

    public HTMLBuilder(String content, ContainerTag root, String path) {
        super(content);
        this.root = root;
        this.path = path;
        this.questions = new LinkedList<>();
        this.content = new LinkedList<>();
    }

    @Override
    public String buildDoc() throws IOException {
        loadCss(path);
        setUp();
        visit(parser.fiche());
        return root.render();
    }

    @Override
    protected void setUp() {
        root = div(attrs("#sheet.container"));
        root.with(style(style));

    }
    private void loadCss() throws IOException {
        File defaultCss = new File(getClass().getClassLoader().getResource("default.css").getFile());
        this.style = FileUtils.readFileToString(defaultCss, "UTF-8");
    }
    private void loadCss(String path) throws IOException {
        if (path == null){
            loadCss();
            return;
        }

    }

    @Override
    public String visitTitle(CENWParser.TitleContext ctx) {
        root.with(h1(ctx.getChild(1).getText()).withClass("title"));
        return ctx.getText();
    }

    @Override
    public String visitFiche(CENWParser.FicheContext ctx) {
        for (ParseTree t  : ctx.children){
            visit(t);
        }
        root.with(div(attrs(".questions")).with(questions));
        root.with(div(attrs(".content")).with(content));
        if (summary != null){
            root.with(summary);
        }
        return ctx.getText();
    }

    @Override
    public String visitQuestion(CENWParser.QuestionContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < ctx.getChildCount()-1; i++){
            builder.append(ctx.getChild(i).getText());
        }
        questions.add(p(builder.toString()));
        return super.visitQuestion(ctx);
    }

    @Override
    public String visitContent(CENWParser.ContentContext ctx) {
        content.add(p(ctx.getText()));
        return super.visitContent(ctx);
    }
    /*    @Override
    public String visitParagraphWithoutQuestion(CENWParser.ParagraphWithoutQuestionContext ctx) {
        content.add(p(ctx.getChild(0).getText()));
        return super.visitParagraphWithoutQuestion(ctx);
    }*/

    @Override
    public String visitSummary(CENWParser.SummaryContext ctx) {
        summary = div().withClass("summary")
                .with(p(ctx.getChild(1).getText()).withClass("summary_content"));
        return ctx.getText();
    }

    @Override
    public String visitImg(CENWParser.ImgContext ctx) {
        String imgUrl = visit(ctx.getChild(1));
        content.getLast().with(img().withSrc(imgUrl));
        return super.visitImg(ctx);
    }

    @Override
    public String visitImg_url(CENWParser.Img_urlContext ctx) {
        String baseDir = System.getProperty("user.dir");
        String fileSeparator = System.getProperty("file.separator");
        String url ="file:///" + baseDir + fileSeparator + "image" + fileSeparator;
        url += ctx.getText();
        return url;
    }

    private ContainerTag root;
    private List<ContainerTag> questions;
    private LinkedList<ContainerTag> content;
    private String path;
    private String style;
    private ContainerTag summary;
}
