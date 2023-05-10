package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.Expression;
import syntax.statement.ReturnStatement;

public class ReturnStatementAdapter {
    public static ReturnStatement adapt(JavaGrammerParser.ReturnStatementContext returnStatementContext) {
        Expression expression = ExpressionAdapter.adapt(returnStatementContext.expression());
        return new ReturnStatement(expression);
    }
}
