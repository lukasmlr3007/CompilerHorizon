package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.AdditiveExpression;

public class AdditiveExpressionAdapter {

    public static AdditiveExpression adapt(JavaGrammerParser.AdditiveExpressionContext additiveExpressionContext){
        return new AdditiveExpression(null, null,null);
    }
}
