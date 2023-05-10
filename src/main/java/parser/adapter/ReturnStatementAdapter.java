package parser.adapter;

import parser.JavaGrammerParser;
import syntax.statement.ReturnStatement;

public class ReturnStatementAdapter {
    public static ReturnStatement adapt(JavaGrammerParser.ReturnStatementContext returnStatementContext) {
        return new ReturnStatement(null);
    }
}
