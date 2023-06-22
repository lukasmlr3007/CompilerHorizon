package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.Expression;
import syntax.expression.PartExpression;
import syntax.statementexpression.MethodCall;

import java.util.ArrayList;
import java.util.List;


public class MethodCallAdapter {
    public static MethodCall adapt(JavaGrammerParser.MethodCallContext methodCallContext){
        String identifier = methodCallContext.extraMethod(0).Identifier().getSymbol().getText().toString();
        Expression receiver = ReceiverAdapter.adapt(methodCallContext.reciever());
        List<PartExpression> parameterList = new ArrayList<>();
        if (methodCallContext.extraMethod(0).parameterValues() != null) {
            methodCallContext.extraMethod(0).parameterValues().partExpression().forEach(expr -> {
                parameterList.add(PartExpressionAdapter.adapt(expr));
            });
        }
        return new MethodCall(identifier, receiver, parameterList);
    }
}
