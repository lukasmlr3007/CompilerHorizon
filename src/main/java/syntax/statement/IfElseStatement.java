package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.expression.Expression;

/**
 * If-Else-Block <br>
 * Ist die condition wahr, so wird der ifBlock ausgeführt, ansonsten der elseBlock.
 * <pre>
 *     if (condition) ifBlock else elseBlock
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class IfElseStatement extends Statement {
    Expression condition;
    Block ifBlock;
    Block elseBlock;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }
}
