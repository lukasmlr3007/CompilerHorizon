package syntax.statement;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
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

    Expression condition;
    Block block;

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
