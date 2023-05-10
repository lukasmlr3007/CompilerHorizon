package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.BinaryExpression;

public class BinaryExpressionAdapter {
    public static BinaryExpression adapt(JavaGrammerParser.BinaryExpressionContext binaryExpressionContext) {
        return new BinaryExpression(null, null, null);
    }
}
