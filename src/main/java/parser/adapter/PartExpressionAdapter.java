package parser.adapter;

import parser.JavaGrammerParser;
import syntax.common.BaseType;
import syntax.expression.Expression;
import syntax.expression.LocalOrFieldVar;
import syntax.expression.PartExpression;
import syntax.expression.This;
import syntax.structure.ParameterDecl;

public class PartExpressionAdapter {
    public static PartExpression adapt(JavaGrammerParser.PartExpressionContext partExpressionContext) {
        if(partExpressionContext.literals() != null) {
            return LiteralAdapter.adapt(partExpressionContext.literals());
        } else if (partExpressionContext.Identifier() != null) {
            return new LocalOrFieldVar(partExpressionContext.Identifier().getText());
        } else if (partExpressionContext.This() != null) {
            return new This();
        } else if (partExpressionContext.statementExpression() != null) {
            return StatementExpressionAdapter.adapt(partExpressionContext.statementExpression());
        }
        return null;
    }

}
