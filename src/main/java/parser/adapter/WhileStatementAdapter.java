package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.Expression;
import syntax.statement.Block;
import syntax.statement.WhileStatement;

public class WhileStatementAdapter {
    public static WhileStatement adapt(JavaGrammerParser.WhileStatementContext whileStatementContext) {


        Expression expression = ExpressionAdapter.adapt(whileStatementContext.expression());
        Block block = BlockAdapter.adapt(whileStatementContext.block());
        return new WhileStatement(expression, block);
    }
}
