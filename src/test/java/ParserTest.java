import org.junit.jupiter.api.Test;
import parser.ParserAPI;
import syntax.structure.ClassDecl;
import syntax.structure.Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        classDecl.setIdentifier("Empty");
        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);
        Program expected = new Program(cl);
        expected.setClassDeclarations(Arrays.asList());

        assertEquals(expected, parser.getResult());
    }
}
