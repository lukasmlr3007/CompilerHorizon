package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.BinaryExpression;

public class BinaryExpressionAdapter {
    public static BinaryExpression adapt(JavaGrammerParser.BinaryExpressionContext binaryExpressionContext) {
        if(binaryExpressionContext.additiveExpression() != null) {
            return AdditiveExpressionAdapter.adapt(binaryExpressionContext.additiveExpression());
        } else if(binaryExpressionContext.logicalExpression() != null){
            return LogicalExpressionAdapter.adapt(binaryExpressionContext.logicalExpression());
        } else if(binaryExpressionContext.relationalExpression() != null){
            return RelationalExpressionAdapter.adapt(binaryExpressionContext.relationalExpression());
        } else {
            return null;
        }
    }
}
