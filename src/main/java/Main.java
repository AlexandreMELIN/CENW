import language.CENWLexer;
import language.CENWParser;
import language.MyVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {

    public static void main(String[] argv){
        System.out.println("Hello");
        CENWLexer lex = new CENWLexer(CharStreams.fromString("Equation du theoreme de Pythagore : la somme des deux cotes au carre est egale au carre de l'hypothenuse << donner la definition formelle du theoreme de pythagore>> ."));

        CENWParser par = new CENWParser(new CommonTokenStream(lex));
        MyVisitor visit = new MyVisitor();
        System.out.println(visit.visit(par.fiche()));
    }
}
