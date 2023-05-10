package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.AdditiveExpression;
import syntax.expression.LogicalExpression;

public class LogicalExpressionAdapter {

    public static LogicalExpression adapt(JavaGrammerParser.LogicalExpressionContext logicalExpressionContext){
        return new LogicalExpression(null, null,null);
    }
}
