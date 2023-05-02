package syntax.statementexpression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.expression.Expression;
import syntax.statementexpression.StatementExpression;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MethodCall extends StatementExpression {
    Expression expression;
    String name;
    List<Expression> expressionList;
}
