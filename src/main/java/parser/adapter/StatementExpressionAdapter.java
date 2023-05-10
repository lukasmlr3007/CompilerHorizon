package parser.adapter;

import parser.JavaGrammerParser;
import syntax.statement.StatementExpressionStatement;
import syntax.statement.WhileStatement;

public class StatementExpressionAdapter {
    public static StatementExpressionStatement adapt(JavaGrammerParser.StatementExpressionContext statementExpressionContext) {
        return new StatementExpressionStatement(null);
    }
}
