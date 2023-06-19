package parser.adapter;

import parser.JavaGrammerParser;
import syntax.common.Sysout;
import syntax.expression.Expression;

public class SysoutAdapter {

    public static Sysout adapt(JavaGrammerParser.SysoutContext sysoutContext){
        Expression expr = ExpressionAdapter.adapt(sysoutContext.expression());
        return new Sysout(expr);
    }
}
