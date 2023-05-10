import parser.ParserAPI;
import semantik.SemantikCheck;
import semantik.TypeCheckResult;
import syntax.structure.Program;

public class Main {

    public static void main(String[] args) {

        String input = "class FirstTest { } class SecondTest { }";

        ParserAPI parserAPI = new ParserAPI(input);
        Program syntaxTree = parserAPI.getResult();
        System.out.println("Syntax Tree: " + syntaxTree);

        SemantikCheck semantikCheck = new SemantikCheck();
        TypeCheckResult typeCheckResult = semantikCheck.check(syntaxTree);
        System.out.println((typeCheckResult.isValid() ? "Semantik ist korrekt" : "Semantik ist inkorrekt"));

        //ProgramGen programGen = new ProgramGen();
        //programGen.visit(syntaxTree);
        syntaxTree.generateBytecode();
    }
}
