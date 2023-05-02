package parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.adapter.ProgramAdapter;
import syntax.structure.Program;

public class ParserAPI {

    public ParserAPI(String fileinput) {
        CharStream input = CharStreams.fromString(fileinput);
        JavaGrammerLexer lexer = new parser.JavaGrammerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaGrammerParser parser = new parser.JavaGrammerParser(tokens);

        //Beginn des Parsens:
        parser.JavaGrammerParser.ProgramContext tree = parser.program();
        ProgramAdapter programAdapter = new ProgramAdapter();
        Program ergebnis = programAdapter.adapt(tree);
        System.out.println(ergebnis);
    }

}
