package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.expression.Expression;

import static org.objectweb.asm.Opcodes.RETURN;

/**
 * Return <br>
 * Return-Funktion, die die expression zurückgibt.
 * <pre>
 *     return expression
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ReturnStatement extends Statement {
    Expression expression;

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {
        methodVisitor.visitInsn(RETURN);
    }
}
