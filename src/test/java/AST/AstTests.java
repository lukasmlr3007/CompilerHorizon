package AST;

import Helper.TestData;
import Helper.TestHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import parser.ParserAPI;
import syntax.structure.Program;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("AST - Abstract Syntax Tree")
@Tag("Ast")
public class AstTests {

    @Test
    @DisplayName("Empty Class without Constructor")
    void getAstForEmptyClass_OK() {
        String input = TestHelper.getFileInput("AST/Empty.java");
        ParserAPI parser = new ParserAPI(input);

        Program actual = parser.getResult();
        Program expected = TestData.getProgrammWithEmptyClass("Empty");

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Class Identifier with less than 2  Symbols should fail")
    void getEmptyClassWithSingleChar_FAIL() {
        try {
            String input = TestHelper.getFileInput("AST/A.java");
            ParserAPI parser = new ParserAPI(input);
            Program actual = parser.getResult();
            fail();
        } catch (Exception e) {
            assertSame(e.getClass(), NullPointerException.class);
        }
    }

    @Test
    @DisplayName("Empty Class with Constructor")
    void getAstForClassWithConstructor() {
        String input = TestHelper.getFileInput("AST/EmptyClassWithConstructor.java");
        ParserAPI parser = new ParserAPI(input);

        Program actual = parser.getResult();
        Program expected = TestData.getEmptyClassWithConstructor("EmptyClassWithConstructor");

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Class with fields")
    void getAstForClassWithFields() {
        String input = TestHelper.getFileInput("AST/ClassWithFields.java");
        ParserAPI parser = new ParserAPI(input);

        Program actual = parser.getResult();
        Program expected = TestData.getClassWithFields("ClassWithFields");

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Constructor With Parameter")
    void constructorWithParameters() {
        String input = TestHelper.getFileInput("AST/ConstructorWithParameter.java");
        ParserAPI parser = new ParserAPI(input);

        Program actual = parser.getResult();
        Program expected = TestData.getEmptyClassWithConstructorAndParameter("ConstructorWithParameter");

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Class with void Method")
    void classWithVoidMethod_OK() {
        String input = TestHelper.getFileInput("AST/ClassWithVoidMethod.java");
        ParserAPI parser = new ParserAPI(input);

        Program actual = parser.getResult();
        Program expected = TestData.getClassWithVoidMethod("ClassWithVoidMethod");

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Class with int Method getting Called in Constructor and Assign")
    void getAstForClassWithFields_OK() {
        String input = TestHelper.getFileInput("AST/SimpleMethodCallAndUsage.java");
        ParserAPI parser = new ParserAPI(input);

        Program actual = parser.getResult();
        Program expected = TestData.getSimpleIntMethod("SimpleMethodCallAndUsage");

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Constructor with This Assign in Constructor and Parameter")
    void assignFields_OK() {
        String input = TestHelper.getFileInput("AST/ConstructorWithThisAssign.java");
        ParserAPI parserAPI = new ParserAPI(input);

        Program actual = parserAPI.getResult();
        Program expected = TestData.getConstructorWithThisAssign("ConstructorWithThisAssign");

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Constructor with Assign Field in Constructor")
    void assignFieldsStatic_OK() {
        String input = TestHelper.getFileInput("AST/ConstructorWithAssign.java");
        ParserAPI parserAPI = new ParserAPI(input);

        Program actual = parserAPI.getResult();
        Program expected = TestData.getConstructorWithAssign("ConstructorWithAssign");

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Constructor with Assign Field in Constructor")
    void ifElseTest_OK() {
        String input = TestHelper.getFileInput("AST/ConstructorWithAssign.java");
        ParserAPI parserAPI = new ParserAPI(input);

        Program actual = parserAPI.getResult();
        Program expected = TestData.getConstructorWithAssign("ConstructorWithAssign");

        assertEquals(expected, actual);
    }

}