package syntax.expression;

import jdk.internal.org.objectweb.asm.Opcodes;
import lombok.AllArgsConstructor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

/**
 * This <br>
 * Schlüsselwort um die aktuelle Klassen-Instanz zu referenzieren.
 */
@Data
@AllArgsConstructor
public class This extends PartExpression {

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
    }
}
