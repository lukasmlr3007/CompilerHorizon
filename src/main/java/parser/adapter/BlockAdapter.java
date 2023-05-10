package parser.adapter;

import parser.JavaGrammerParser;
import syntax.statement.Block;
import syntax.statement.Statement;
import syntax.structure.ClassDecl;
import syntax.structure.FieldDecl;

import java.util.ArrayList;
import java.util.List;

public class BlockAdapter {

    public static Block adapt(JavaGrammerParser.BlockContext blockContext){
        List<Statement> statements = new ArrayList<>();
        blockContext.statement().forEach(statementContext -> statements.add(StatementAdapter.adapt(statementContext)));

        return new Block(statements);
    }
}
