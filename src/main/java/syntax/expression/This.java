package syntax.expression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.objectweb.asm.Opcodes;
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
public class This extends PartExpression implements CodeVisitor {

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
