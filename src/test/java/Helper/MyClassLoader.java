package Helper;

import bytecode.ProgramBytecode;
import parser.ParserAPI;
import semantic.SemanticChecker;
import semantic.TypeCheckResult;
import syntax.structure.Program;

public class MyClassLoader extends ClassLoader {

    private byte[] byteCode;
    private SemanticChecker semanticChecker;


    public MyClassLoader(Program program) {

        semanticChecker = new SemanticChecker();

        semanticChecker.check(program);

        ProgramBytecode programBytecode = new ProgramBytecode();
        programBytecode.visit(program);

        System.out.println(semanticChecker.getErrors().toString());

        this.byteCode = programBytecode.getBytecode();
    }

    public MyClassLoader(String fileName) {
        String input = TestHelper.getFileInput(fileName);

        ParserAPI parser = new ParserAPI(input);
        semanticChecker = new SemanticChecker();

        Program actualAst = parser.getResult();

        semanticChecker.check(actualAst);

        ProgramBytecode programBytecode = new ProgramBytecode();
        programBytecode.visit(actualAst);

        this.byteCode = programBytecode.getBytecode();
    }

    public Class<?> findClassByName(String name) {
        return defineClass(name, byteCode, 0, byteCode.length);
    }

}
