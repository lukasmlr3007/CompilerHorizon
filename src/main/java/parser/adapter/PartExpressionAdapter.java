package parser.adapter;

import parser.JavaGrammerParser;
import syntax.common.BaseType;
import syntax.expression.Expression;
import syntax.expression.PartExpression;
import syntax.structure.ParameterDecl;

public class PartExpressionAdapter {
    public static Expression adapt(JavaGrammerParser.PartExpressionContext partExpressionContext) {
        if(partExpressionContext.literals() != null) {
            return LiteralAdapter.adapt(partExpressionContext.literals());
        } else if (partExpressionContext.Identifier() != null) {
            return null; //TODO wie????
        } else if (partExpressionContext.This() != null) {
            return null; //TODO wie????
        } else if (partExpressionContext.statementExpression() != null) {
            return StatementExpressionAdapter.adapt(partExpressionContext.statementExpression());
        } else if (partExpressionContext.expression() != null) {
            return ExpressionAdapter.adapt(partExpressionContext.expression());
        }
        return null;
    }

}