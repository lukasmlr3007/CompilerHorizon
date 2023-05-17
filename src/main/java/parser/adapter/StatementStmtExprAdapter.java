package parser.adapter;

import parser.JavaGrammerParser;
import syntax.statement.Statement;
import syntax.statementexpression.StatementExpression;

/**
 * Diese Klasse ist vermutlich irrelevant
 */
public class StatementStmtExprAdapter {
    /*
    public static Statement adapt(JavaGrammerParser.StatementExpressionContext statementExpressionContext) {
        if (statementExpressionContext.assign() != null) {
            return AssignAdapter.adapt(statementExpressionContext.assign());
        } else if (statementExpressionContext.methodCall() != null) {
            //return MethodCallAdapter.adapt(statementExpressionContext.methodCall());
        } else if (statementExpressionContext.myNew() != null) {
            //return WhileStatementAdapter.adapt(statementContext.whileStatement());
        }
        return null;
    } */
}
