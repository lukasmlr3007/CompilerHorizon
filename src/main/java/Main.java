import bytecode.ProgramBytecode;
import parser.ParserAPI;
import semantic.SemanticChecker;
import semantic.TypeCheckResult;
import syntax.structure.Program;

public class Main {

    public static void main(String[] args) {

        //String input = "class FirstTest { }";
        //String input = "class TestClass { int number; public TestClass(int nummer, boolean wert, char zeichen) { System.out.println(nummer)} }";
        //String input = "class FirstTest {FirstTest(int zahl, char zeichen){}  private int meinint; this.meinint = 3} class SecondTest {}";
        String input = "class FirstTest { public static void methodeNeu(){ this.myValue = this.memcll(); } }";

        ParserAPI parserAPI = new ParserAPI(input);
        Program syntaxTree = parserAPI.getResult();
        System.out.println("Syntax Tree: " + syntaxTree);

        SemanticChecker semantikCheck = new SemanticChecker();
        TypeCheckResult typeCheckResult = semantikCheck.check(syntaxTree);
        System.out.println((typeCheckResult.isValid() ? "Semantik ist korrekt" : "Semantik ist inkorrekt"));

        ProgramBytecode programBytecode = new ProgramBytecode();
        programBytecode.visit(syntaxTree);
    }
}
