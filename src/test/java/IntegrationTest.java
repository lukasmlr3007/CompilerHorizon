import bytecode.ProgramBytecode;
import Helper.TestHelper;
import org.junit.jupiter.api.Test;
import parser.ParserAPI;
import semantic.SemanticChecker;
import semantic.TypeCheckResult;
import syntax.structure.Program;

import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest {

    @Test
    void multipleClassesTest() {

        String input = TestHelper.getFileInput("MultipleClasses.java");
        ParserAPI parser = new ParserAPI(input);
        SemanticChecker semantic = new SemanticChecker();

        Program program = parser.getResult();
        TypeCheckResult typeCheckResult = semantic.check(program);

        ProgramBytecode programBytecode = new ProgramBytecode();
        programBytecode.visit(program);

        assertEquals(3, program.getClassDeclarations().size());
        assertTrue(typeCheckResult.isValid());
        assertEquals(0, semantic.getErrors().size());
    }

    @Test
    void constructorClassTest() {

        String input = TestHelper.getFileInput("Constructors.java");
        ParserAPI parser = new ParserAPI(input);
        SemanticChecker semantic = new SemanticChecker();

        Program program = parser.getResult();
        TypeCheckResult typeCheckResult = semantic.check(program);

        ProgramBytecode programBytecode = new ProgramBytecode();
        programBytecode.visit(program);

        assertEquals(2, program.getClassDeclarations().get(0).getConstructorDeclList().size());
        assertTrue(typeCheckResult.isValid());
        assertEquals(0, semantic.getErrors().size());
    }

    @Test
    void baseTypesTest() {

        String input = TestHelper.getFileInput("BaseTypes.java");
        ParserAPI parser = new ParserAPI(input);
        SemanticChecker semantic = new SemanticChecker();

        Program program = parser.getResult();
        TypeCheckResult typeCheckResult = semantic.check(program);

        ProgramBytecode programBytecode = new ProgramBytecode();
        programBytecode.visit(program);

        assertEquals(3, program.getClassDeclarations().get(0).getFieldDeclList().size());
        assertTrue(typeCheckResult.isValid());
        assertEquals(0, semantic.getErrors().size());
    }

    @Test
    void referenceTypesTest() {

        String input = TestHelper.getFileInput("ReferenceTypes.java");
        ParserAPI parser = new ParserAPI(input);
        SemanticChecker semantic = new SemanticChecker();

        Program program = parser.getResult();
        TypeCheckResult typeCheckResult = semantic.check(program);

        ProgramBytecode programBytecode = new ProgramBytecode();
        programBytecode.visit(program);

        assertTrue(typeCheckResult.isValid());
        assertEquals(0, semantic.getErrors().size());
    }

    @Test
    void methodsTest() {

        String input = TestHelper.getFileInput("Methods.java");
        ParserAPI parser = new ParserAPI(input);
        SemanticChecker semantic = new SemanticChecker();

        Program program = parser.getResult();
        TypeCheckResult typeCheckResult = semantic.check(program);

        ProgramBytecode programBytecode = new ProgramBytecode();
        programBytecode.visit(program);

        assertEquals(5, program.getClassDeclarations().get(0).getMethodDeclList().size());
        assertTrue(typeCheckResult.isValid());
        assertEquals(0, semantic.getErrors().size());
    }

    @Test
    void expressionTest() {

        String input = TestHelper.getFileInput("Expressions.java");
        ParserAPI parser = new ParserAPI(input);
        SemanticChecker semantic = new SemanticChecker();

        Program program = parser.getResult();
        TypeCheckResult typeCheckResult = semantic.check(program);

        ProgramBytecode programBytecode = new ProgramBytecode();
        programBytecode.visit(program);

        assertTrue(typeCheckResult.isValid());
        assertEquals(0, semantic.getErrors().size());
    }

    @Test
    void complexTest() {

        String input = TestHelper.getFileInput("Complex.java");
        ParserAPI parser = new ParserAPI(input);
        SemanticChecker semantic = new SemanticChecker();

        Program program = parser.getResult();
        TypeCheckResult typeCheckResult = semantic.check(program);

        ProgramBytecode programBytecode = new ProgramBytecode();
        programBytecode.visit(program);

        assertTrue(typeCheckResult.isValid());
        assertEquals(0, semantic.getErrors().size());
    }
}
