package parser.adapter;

import parser.JavaGrammerParser;
import syntax.statement.Block;
import syntax.statement.ReturnStatement;
import syntax.statement.Statement;

public class StatementAdapter {

    public static Statement adapt(JavaGrammerParser.StatementContext statementContext) {


        if (statementContext.returnStatement() != null) {
            if (statementContext.returnStatement().expression() != null)
                return new ReturnStatement(ExpressionAdapter.adapt(statementContext.returnStatement().expression()));
        } else if (statementContext.localVarDecl() != null) {
            return LocalVarDeclAdapter.adapt(statementContext.localVarDecl());
        } else if (statementContext.block() != null) {
            return BlockAdapter.adapt(statementContext.block());
        } else if (statementContext.whileStatement() != null) {
            return WhileStatementAdapter.adapt(statementContext.whileStatement());
        } else if (statementContext.ifElseStatement() != null) {
            return IfElseStatementAdapter.adapt(statementContext.ifElseStatement());
        } else{ //TODO StatementExpression
            return null;//StatementExpressionAdapter.adapt(statementContext.statementExpression());
        }
        return null;
    }
}
