package syntax.statementexpression;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.statement.Statement;

@Data
@RequiredArgsConstructor
public abstract class StatementStmtExpr extends Statement {
    private StatementExpression statementExpression;

    StatementStmtExpr(StatementExpression se) {
        this.statementExpression = se;
    }
}
