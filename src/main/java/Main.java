import bytecode.ProgramBytecode;
import parser.ParserAPI;
import semantic.SemanticChecker;
import semantic.TypeCheckResult;
import syntax.structure.Program;

public class Main {

    public static void main(String[] args) {

        //String input = "class FirstTest { FirstTest(){} } class SecondTest { }";
        //String input = "class FirstTest {FirstTest(int zahl, char zeichen){}  private int meinint; this.meinint = 3} class SecondTest {}";
        String input = "class FirstTest {}";

        ParserAPI parserAPI = new ParserAPI(input);
        Program syntaxTree = parserAPI.getResult();
        System.out.println("Syntax Tree: " + syntaxTree);

        SemanticChecker semantikCheck = new SemanticChecker();
        TypeCheckResult typeCheckResult = semantikCheck.check(syntaxTree);
        System.out.println((typeCheckResult.isValid() ? "Semantik ist korrekt" : "Semantik ist inkorrekt"));

        //syntaxTree.generateBytecode();
        ProgramBytecode programBytecode = new ProgramBytecode();
        programBytecode.visit(syntaxTree);
    }
}
