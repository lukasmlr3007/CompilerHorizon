package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.expression.Expression;
import syntax.statementexpression.StatementExpression;

/**
 * TODO ???
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class StatementExpressionExpression extends Expression {
    private StatementExpression statementExpression;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
