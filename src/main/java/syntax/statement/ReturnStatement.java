package syntax.statement;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.Type;
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
public class ReturnStatement extends Statement implements CodeVisitor {
    Expression expression;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {
        methodVisitor.visitInsn(RETURN);
        expression.generateBytecode(classWriter, methodVisitor);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
