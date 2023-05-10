package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.AdditiveExpression;

public class AdditiveExpressionAdapter extends BinaryExpressionAdapter {

    public static AdditiveExpression adapt(JavaGrammerParser.AdditiveExpressionContext additiveExpressionContext){
        return new AdditiveExpression(null, null,null);
    }
}
