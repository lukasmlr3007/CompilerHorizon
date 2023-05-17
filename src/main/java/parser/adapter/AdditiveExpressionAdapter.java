package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.AdditiveExpression;
import syntax.expression.Expression;
import syntax.expression.PartExpression;

public class AdditiveExpressionAdapter extends BinaryExpressionAdapter {

    public static Expression adapt(JavaGrammerParser.AdditiveExpressionContext additiveExpressionContext){
        PartExpression exLeft = PartExpressionAdapter.adapt(additiveExpressionContext.partExpression());
        return new AdditiveExpression(null, null,null);
    }
}
