package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.AdditiveExpression;
import syntax.expression.Expression;

public class AdditiveExpressionAdapter extends BinaryExpressionAdapter {

    public static Expression adapt(JavaGrammerParser.AdditiveExpressionContext additiveExpressionContext){
        return new AdditiveExpression(null, null,null);
    }
}
