package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.expression.Expression;
import syntax.statementexpression.StatementExpression;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class StatementExpressionExpression extends Expression {
    private StatementExpression statementExpression;
}
