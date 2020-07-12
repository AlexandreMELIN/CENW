import document_generation.HTMLBuilder;
import language.CENWLexer;
import language.CENWParser;
import language.MyVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static j2html.TagCreator.*;

public class Main {

    public static void main(String[] argv) throws IOException {
        String data = "Title: Theoreme de pythagore ! \r Equation du theoreme de Pythagore : la somme des deux cotes au carre est egale au carre de l'hypothenuse << donner la definition formelle du theoreme de pythagore>> .";
        if (argv.length != 0){
            String path = argv[0];
            File file = new File(path);
            try {
                data = FileUtils.readFileToString(file, "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        //System.out.println("Data : " + data);
        HTMLBuilder htmlBuilder = new HTMLBuilder(data);
        BufferedWriter out = null;

            out = new BufferedWriter(Files.newBufferedWriter(Paths.get("C:\\Users\\alexa\\Desktop\\UTC\\out.html")));
            out.write(htmlBuilder.buildDoc());
            out.close();



    }
}
