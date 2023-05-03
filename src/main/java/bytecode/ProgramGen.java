package bytecode;

import org.objectweb.asm.ClassWriter;
import parser.ParserAPI;
import syntax.structure.ClassDecl;
import syntax.structure.Program;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.V1_8;

public class ProgramGen {
    static ParserAPI parserAPI = new ParserAPI("class FirstTest { } class SecondTest { }");
    static Program input = parserAPI.getResult();

    private static List<ClassDecl> classes;
    static ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
    //java -classpath "asm-9.5.jar;asm-util-9.5.jar" org.objectweb.asm.util.ASMifier ./bytecode.class
    public static void main(String[] args) {

        visit(input);

    }

    public static void visit(Program program) {

        classes = Collections.emptyList();
        classes = program.getClassDeclarations();

        for (int i = 0; i < program.getClassDeclarations().size(); i++) {
            cw.visit(V1_8, ACC_PUBLIC, program.getClassDeclarations().get(i).getIdentifier(), null, "java/lang/Object", null);
            cw.visitEnd();
            byte[] bytecode = cw.toByteArray();
            try (FileOutputStream fos = new FileOutputStream("./src/main/java/output/" + program.getClassDeclarations().get(i).getIdentifier() + ".class")) {
                fos.write(bytecode);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

