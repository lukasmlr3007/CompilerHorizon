package syntax.expression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
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

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
