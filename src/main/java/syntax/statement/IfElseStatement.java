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
 * If-Else-Block <br>
 * Ist die condition wahr, so wird der ifBlock ausgeführt, ansonsten der elseBlock.
 * <pre>
 *     if (condition) ifBlock else elseBlock
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class IfElseStatement extends Statement implements CodeVisitor {

    Expression condition;
    Block ifBlock;
    Block elseBlock;

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
