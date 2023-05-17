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
 * While-Schleife <br>
 * While-Funktion, die je nach der expression den Code des block's ausführt.
 * <pre>
 *     while (expression) block
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class WhileStatement extends Statement {
    Expression expression;
    Block block;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }
}
