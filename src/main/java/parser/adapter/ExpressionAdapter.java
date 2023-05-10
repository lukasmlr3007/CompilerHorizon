package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.Expression;

public class ExpressionAdapter {

    public static Expression adapt(JavaGrammerParser.ExpressionContext expressionContext) {
        return new Expression();
}
