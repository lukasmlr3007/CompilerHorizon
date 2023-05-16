import org.junit.jupiter.api.Test;
import parser.ParserAPI;
import semantic.SemanticChecker;
import semantic.TypeCheckResult;
import syntax.structure.Program;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegrationTest {

    @Test
    void multipleClassesTest() {

        String input = TestHelper.getFileInput("MultipleClasses.java");
        ParserAPI parser = new ParserAPI(input);
        SemanticChecker semantic = new SemanticChecker();

        Program program = parser.getResult();
        TypeCheckResult typeCheckResult = semantic.check(program);

        // program.generateBytecode();

        assertTrue(typeCheckResult.isValid());
    }

    @Test
    void emptyClassTest() {

        String input = TestHelper.getFileInput("EmptyClass.java");
        ParserAPI parser = new ParserAPI(input);
        SemanticChecker semantic = new SemanticChecker();

        Program program = parser.getResult();
        TypeCheckResult typeCheckResult = semantic.check(program);

        // program.generateBytecode();

        assertTrue(typeCheckResult.isValid());
    }

    @Test
    void constructorClassTest() {

        String input = TestHelper.getFileInput("ConstructorClass.java");
        ParserAPI parser = new ParserAPI(input);
        SemanticChecker semantic = new SemanticChecker();

        Program program = parser.getResult();
        TypeCheckResult typeCheckResult = semantic.check(program);

        // program.generateBytecode();

        assertTrue(typeCheckResult.isValid());
    }
}
