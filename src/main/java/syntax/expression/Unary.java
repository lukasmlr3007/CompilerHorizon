package syntax.expression;

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
public class Unary extends Expression {
    Operator operator;
    Expression expression;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
