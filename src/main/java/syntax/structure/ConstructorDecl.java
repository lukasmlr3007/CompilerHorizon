package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.AccessModifier;
import syntax.common.Type;
import syntax.statement.Block;

import java.util.List;

/**
 * Konstruktor-Deklaration <br>
 * Deklariert einen neuen Konstruktor mit den vorgegebenen Parametern.
 * <pre>
 *     z.B.: accessModifier identifier(paramters) {
 *         block
 *     }
 * </pre>
 */
import static org.objectweb.asm.Opcodes.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ConstructorDecl {

    // private AccessModifier accessModifier; TODO private constructor
    private List<ParameterDecl> parameters;
    private Block block;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    public void generateBytecode(ClassWriter classWriter, String ownerClassName) {
        MethodVisitor methodVisitor = classWriter.visitMethod(0, "<init>", "(I)V", null, null);
        methodVisitor.visitCode();
        methodVisitor.visitVarInsn(ALOAD, 0);
        methodVisitor.visitVarInsn(ILOAD, 1);
        for (ParameterDecl parameterDecl : parameters) {
            methodVisitor.visitFieldInsn(PUTFIELD, ownerClassName, parameterDecl.getIdentifier(), "I");


            methodVisitor.visitFieldInsn(PUTFIELD, "EmptyClass", "number", "I");
            methodVisitor.visitInsn(RETURN);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
    }
}
