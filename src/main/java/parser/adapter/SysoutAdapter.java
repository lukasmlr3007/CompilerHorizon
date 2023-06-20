package parser.adapter;

import parser.JavaGrammerParser;
import syntax.statement.Sysout;
import syntax.expression.Expression;
import syntax.statement.Statement;

public class SysoutAdapter {

    public static Statement adapt(JavaGrammerParser.SysoutContext sysoutContext){
        Expression expr = ExpressionAdapter.adapt(sysoutContext.expression());
        return new Sysout(expr);
    }
}
