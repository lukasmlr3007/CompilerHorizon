import parser.ParserAPI;
import semantic.SemanticChecker;
import semantic.TypeCheckResult;
import syntax.structure.Program;

public class Main {

    public static void main(String[] args) {

        String input = "class FirstTest { FirstTest(){} }";

        ParserAPI parserAPI = new ParserAPI(input);
        Program syntaxTree = parserAPI.getResult();
        System.out.println("Syntax Tree: " + syntaxTree);

        SemanticChecker semantikCheck = new SemanticChecker();
        TypeCheckResult typeCheckResult = semantikCheck.check(syntaxTree);
        System.out.println((typeCheckResult.isValid() ? "Semantik ist korrekt" : "Semantik ist inkorrekt"));

        syntaxTree.generateBytecode();
    }
}
