package syntax.expression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;

/**
 * keine Ahnung
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class AdditiveExpression extends BinaryExpression implements CodeVisitor {
    String operator;
    PartExpression expressionLeft;
    Expression expressionRight;

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
