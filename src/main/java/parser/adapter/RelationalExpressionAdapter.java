package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.Expression;
import syntax.expression.PartExpression;
import syntax.expression.RelationalExpression;

public class RelationalExpressionAdapter {

    public static RelationalExpression adapt(JavaGrammerParser.RelationalExpressionContext relationalExpressionContext){
        PartExpression exLeft = PartExpressionAdapter.adapt(relationalExpressionContext.partExpression());
        Expression exRight = ExpressionAdapter.adapt(relationalExpressionContext.expression());
        String operator = relationalExpressionContext.RelationalOperator().getSymbol().getText();
        return new RelationalExpression(operator, exLeft,exRight);
    }
}
