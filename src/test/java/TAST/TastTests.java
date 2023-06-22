package TAST;

import Helper.TestData;
import Helper.TestHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import parser.ParserAPI;
import semantic.SemanticChecker;
import semantic.TypeCheckResult;
import semantic.exception.*;
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

            assertFalse(typeCheckResult.isValid());
            assertEquals(AlreadyDefinedException.class, semantikCheck.getErrors().get(0).getClass());

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

            assertFalse(typeCheckResult.isValid());
            assertEquals(AlreadyDefinedException.class,semantikCheck.getErrors().get(0).getClass());

        }
    }

    @Test
    @DisplayName("AccessModifierTest Methods")
    void tryAccessingPrivateInAnotherClass_NotVisibleEXCEPTION() {

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

            assertFalse(typeCheckResult.isValid());
            assertEquals(NotVisibleException.class, semantikCheck.getErrors().get(0).getClass());

        }
    }

    @Test
    @DisplayName("Class Test")
    void emptyClass_OK() {

        Program expectedTast = TestData.getProgrammWithEmptyClassTAST("EmptyClassTest");

        Program actualTast = TestData.getProgrammWithEmptyClass("EmptyClassTest");

        SemanticChecker semanticChecker = new SemanticChecker();
        semanticChecker.check(actualTast);

        assertEquals(expectedTast, actualTast);
    }

    @Test
    @DisplayName("AccessModifierTest Fields")
    void tryAccessingPrivateFieldInAnotherClass_EXCEPTION() {

        Program actualAST = null;
        TypeCheckResult typeCheckResult = null;

        try {
            String input = TestHelper.getFileInput("TAST/FieldAccessModifierTest.java");
            ParserAPI parser = new ParserAPI(input);

            actualAST = parser.getResult();
            typeCheckResult = semantikCheck.check(actualAST);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            assertNotNull(typeCheckResult);

            assertFalse(typeCheckResult.isValid());
            assertEquals(NotVisibleException.class, semantikCheck.getErrors().get(0).getClass());
        }
    }

    @Test
    @DisplayName("Access Variable out of Scope")
    void tryAccessingVariableOutOfLocalScope_EXCEPTION() {

        Program actualAST = null;
        TypeCheckResult typeCheckResult = null;

        try {
            String input = TestHelper.getFileInput("TAST/OutOfScopeVar.java");
            ParserAPI parser = new ParserAPI(input);

            actualAST = parser.getResult();
            typeCheckResult = semantikCheck.check(actualAST);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            assertFalse(typeCheckResult.isValid());
        }
    }

    @Test
    @DisplayName("Incorrect new Assign at Field")
    void tryToAssignNewInt_EXCEPTION() {

        Program actualAST = null;
        TypeCheckResult typeCheckResult = null;

        try {
            String input = TestHelper.getFileInput("TAST/newIntTest.java");
            ParserAPI parser = new ParserAPI(input);

            actualAST = parser.getResult();
            typeCheckResult = semantikCheck.check(actualAST);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            assertNotNull(typeCheckResult);

            assertFalse(typeCheckResult.isValid());
            assertEquals(TypeMismatchException.class, semantikCheck.getErrors().get(1).getClass());
        }
    }


    @Test
    @DisplayName("Unknown new Assign at Field")
    void tryToAssignUnknownTyp_EXCEPTION() {

        Program actualAST = null;
        TypeCheckResult typeCheckResult = null;

        try {
            String input = TestHelper.getFileInput("TAST/UnknownTypeInt.java");
            ParserAPI parser = new ParserAPI(input);

            actualAST = parser.getResult();
            typeCheckResult = semantikCheck.check(actualAST);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            assertNotNull(typeCheckResult);

            assertFalse(typeCheckResult.isValid());
            assertEquals(TypeUnknownException.class, semantikCheck.getErrors().get(1).getClass());
        }
    }

    @Test
    @DisplayName("add Typ for ConstructorWithThisAssignTest")
    void constructorWithThisAssign_OK() {

        Program expectedTast = TestData.getConstructorWithThisAssignTast("CTest");

        Program actualTast = TestData.getConstructorWithThisAssign("CTest");

        SemanticChecker semanticChecker = new SemanticChecker();
        semanticChecker.check(actualTast);

        assertEquals(expectedTast, actualTast);
    }

}
