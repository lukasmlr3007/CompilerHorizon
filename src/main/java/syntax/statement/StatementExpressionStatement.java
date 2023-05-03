package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.statementexpression.StatementExpression;

// TODO
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class StatementExpressionStatement extends Statement {
    private StatementExpression statementExpression;
}
