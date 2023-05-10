package parser.adapter;

import parser.JavaGrammerParser;
import syntax.statement.WhileStatement;

public class WhileStatementAdapter {
    public static WhileStatement adapt(JavaGrammerParser.WhileStatementContext whileStatementContext) {


        return new WhileStatement(null, null);
    }
}
