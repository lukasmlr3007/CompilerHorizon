package parser.adapter;

import parser.JavaGrammerParser;
import syntax.statement.StatementExpressionStatement;
import syntax.statement.WhileStatement;
import syntax.statementexpression.StatementExpression;

public class StatementExpressionAdapter {
    public static StatementExpression adapt(JavaGrammerParser.StatementExpressionContext statementExpressionContext) {
        if (statementExpressionContext.assign() != null) {
            return AssignAdapter.adapt(statementExpressionContext.assign());
        } else if (statementExpressionContext.methodCall() != null) {
            return MethodCallAdapter.adapt(statementExpressionContext.methodCall());
        } else if (statementExpressionContext.myNew() != null) {
            return MyNewAdapter.adapt(statementExpressionContext.myNew());
        }
        return null;
    }
}
