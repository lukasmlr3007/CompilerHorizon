package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.Expression;
import syntax.statementexpression.New;

import java.util.ArrayList;
import java.util.List;

public class MyNewAdapter {
    public static New adapt(JavaGrammerParser.MyNewContext myNewContext) {
        String identifier = myNewContext.Identifier().getSymbol().getText();
        List<Expression> parameters = new ArrayList<>();
        if (myNewContext.parameterValues() != null){
            myNewContext.parameterValues().partExpression().forEach(pe -> parameters.add(PartExpressionAdapter.adapt(pe)));
        }

        return new New(parameters, identifier);
    }
}
