package document_generation;

import language.CENWBaseVisitor;
import language.CENWLexer;
import language.CENWParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public abstract class DocBuilder<T> extends CENWBaseVisitor<T> {
    public DocBuilder(String content) {
        this.content = content;
        setUpAntlr();
    }

    public abstract T buildDoc() throws IOException;
    protected abstract void setUp();
    private void setUpAntlr(){
        CENWLexer lex = new CENWLexer(CharStreams.fromString(content));
        parser = new CENWParser(new CommonTokenStream(lex));
    }
    protected String content;
    protected CENWParser parser;
}
