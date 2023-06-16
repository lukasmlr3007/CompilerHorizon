package syntax.statement;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
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
public class WhileStatement extends Statement implements CodeVisitor {
    Expression expression;
    Block block;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
