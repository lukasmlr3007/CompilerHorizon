package bytecode;

import org.objectweb.asm.ClassWriter;

import java.io.FileOutputStream;
import java.io.IOException;

import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.V1_8;

public class ASMclass {
    static final String className = "Test";
    static ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);

    public static void main(String[] args) {

        //public class Test
        cw.visit(V1_8, ACC_PUBLIC, className, null, "java/lang/object", null);

        cw.visitEnd();

        byte[] bytecode = cw.toByteArray();
        try (FileOutputStream fos = new FileOutputStream("./bytecode")) {
            fos.write(bytecode);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

