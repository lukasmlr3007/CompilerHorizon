package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;

/**
 * keine Ahnung
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class AdditiveExpression extends BinaryExpression {
    String operator;
    PartExpression expressionLeft;
    Expression expressionRight;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
