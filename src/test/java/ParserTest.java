import org.junit.jupiter.api.Test;
import parser.ParserAPI;
import syntax.structure.ClassDecl;
import syntax.structure.Program;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {

    @Test
    void emptyClassTest() {

        String input = TestHelper.getFileInput("EmptyClass.java");
        ParserAPI parser = new ParserAPI(input);

        ClassDecl classDecl = new ClassDecl();
        classDecl.setFieldDeclList(null);
        classDecl.setMethodDeclList(null);
        classDecl.setConstructorDeclList(null);
        classDecl.setIdentifier("EmptyClass");
        Program expected = new Program();
        expected.setClassDeclarations(Arrays.asList());

        assertEquals(expected, parser.getResult());
    }
}
