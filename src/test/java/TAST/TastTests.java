package TAST;

import Helper.TestHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import parser.ParserAPI;
import semantic.SemanticChecker;
import semantic.TypeCheckResult;
import syntax.structure.Program;

import static org.junit.jupiter.api.Assertions.*;

public class TastTests {

    private SemanticChecker semantikCheck;

    @BeforeEach
    void prepare() {
        semantikCheck = new SemanticChecker();
    }

    @Test
    @DisplayName("Field already defined in SCOPE")
    void fieldsMissMatchingShouldThrowError_EXCEPTION() {

        Program actualAST = null;
        TypeCheckResult typeCheckResult = null;

        try {
            String input = TestHelper.getFileInput("TAST/ErrorFieldsWithSameNameDifferentTyp.java");
            ParserAPI parser = new ParserAPI(input);

            actualAST = parser.getResult();
            typeCheckResult = semantikCheck.check(actualAST);

        } catch (Exception e){

            e.printStackTrace();

        } finally {

            assertNotNull(typeCheckResult);

            if (typeCheckResult != null) {

                assertFalse(typeCheckResult.isValid());
            }

        }
    }

    @Test
    @DisplayName("Method already defined in SCOPE")
    void methodsMissMatchingShouldThrowError_EXCEPTION() {

        Program actualAST = null;
        TypeCheckResult typeCheckResult = null;

        try {
            String input = TestHelper.getFileInput("TAST/ErrorMethodsWithSameName.java");
            ParserAPI parser = new ParserAPI(input);

            actualAST = parser.getResult();
            typeCheckResult = semantikCheck.check(actualAST);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            assertNotNull(typeCheckResult);

            if (typeCheckResult != null) {
                assertFalse(typeCheckResult.isValid());
            }

        }
    }

    @Test
    @DisplayName("AccessModifierTest Methods")
    void tryAccessingPrivateInAnotherClass_EXCEPTION() {

        Program actualAST = null;
        TypeCheckResult typeCheckResult = null;

        try {
            String input = TestHelper.getFileInput("TAST/MethodAccessModifierTest.java");
            ParserAPI parser = new ParserAPI(input);

            actualAST = parser.getResult();
            typeCheckResult = semantikCheck.check(actualAST);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            assertNotNull(typeCheckResult);

            if (typeCheckResult != null) {
                assertFalse(typeCheckResult.isValid());
            }

        }
    }

    @Test
    @DisplayName("AccessModifierTest Fields")
    void tryAccessingPrivateFieldInAnotherClass_EXCEPTION() {

        Program actualAST = null;
        TypeCheckResult typeCheckResult = null;

        try {
            String input = TestHelper.getFileInput("TAST/FieldAccessModifierTest.java");
            ParserAPI parser = new ParserAPI(input);
            System.out.println(parser.getResult());

            actualAST = parser.getResult();
            typeCheckResult = semantikCheck.check(actualAST);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            assertNotNull(typeCheckResult);

            if (typeCheckResult != null) {
                assertFalse(typeCheckResult.isValid());
            }
        }
    }
}
