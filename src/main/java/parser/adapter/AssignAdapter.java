package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.Expression;
import syntax.expression.InstVar;
import syntax.statementexpression.Assign;

public class AssignAdapter {

    public static Assign adapt(JavaGrammerParser.AssignContext assignContext) {
        InstVar leftExp = InstVarAdapter.adapt(assignContext.instanceVariable());
        Expression rightExp = ExpressionAdapter.adapt(assignContext.expression());

        return new Assign(leftExp, rightExp);
    }
}
