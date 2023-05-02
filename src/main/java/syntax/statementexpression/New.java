package syntax.statementexpression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.common.Type;
import syntax.expression.Expression;
import syntax.statementexpression.StatementExpression;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class New extends StatementExpression {
    private List<Expression> expressionList;
    private Type type;
}
