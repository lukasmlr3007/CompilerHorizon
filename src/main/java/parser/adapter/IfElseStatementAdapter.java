package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.Expression;
import syntax.statement.Block;
import syntax.statement.IfElseStatement;
import syntax.structure.ConstructorDecl;
import syntax.structure.ParameterDecl;

import java.util.ArrayList;
import java.util.List;

public class IfElseStatementAdapter extends StatementAdapter {

    public static IfElseStatement adapt(JavaGrammerParser.IfElseStatementContext ifElseStatementContext) {
        Expression condition = ExpressionAdapter.adapt(ifElseStatementContext.expression());
        List<Block> blocks = new ArrayList<>();
        ifElseStatementContext.block().forEach(blockContext -> blocks.add(BlockAdapter.adapt(blockContext)));


        return new IfElseStatement(condition, blocks.get(0), blocks.get(1));
    }

}
