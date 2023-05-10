package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.Expression;

public class ExpressionAdapter {

    public static Expression adapt(JavaGrammerParser.ExpressionContext expressionContext) {

        if(expressionContext.binaryExpression() != null) {
            return BinaryExpressionAdapter.adapt(expressionContext.binaryExpression());
        }else if (expressionContext.partExpression() != null) {
            return PartExpressionAdapter.adapt(expressionContext.partExpression());
        }
        return null;
    }
}
