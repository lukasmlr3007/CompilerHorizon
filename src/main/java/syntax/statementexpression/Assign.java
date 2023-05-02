package syntax.statementexpression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.expression.Expression;
import syntax.statementexpression.StatementExpression;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Assign extends StatementExpression {
    Expression assignLeft;
    Expression assignRight;
}
