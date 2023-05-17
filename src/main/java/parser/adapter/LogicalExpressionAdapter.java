package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.AdditiveExpression;
import syntax.expression.Expression;
import syntax.expression.LogicalExpression;
import syntax.expression.PartExpression;

public class LogicalExpressionAdapter {

    public static LogicalExpression adapt(JavaGrammerParser.LogicalExpressionContext logicalExpressionContext){
        PartExpression exLeft = PartExpressionAdapter.adapt(logicalExpressionContext.partExpression());
        Expression exRight = ExpressionAdapter.adapt(logicalExpressionContext.expression());
        String operator = logicalExpressionContext.LogicOperator().getSymbol().getText();
        return new LogicalExpression(operator, exLeft,exRight);
    }
}
