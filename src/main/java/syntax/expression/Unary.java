package syntax.expression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.common.Operator;

/**
 * Unary-Operator <br>
 *
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Unary extends Expression implements CodeVisitor {
    Operator operator;
    Expression expression;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
