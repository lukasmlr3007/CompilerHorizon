package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.RelationalExpression;

public class RelationalExpressionAdapter {

    public static RelationalExpression adapt(JavaGrammerParser.RelationalExpressionContext relationalExpressionContext){
        return new RelationalExpression(null, null,null);
    }
}
