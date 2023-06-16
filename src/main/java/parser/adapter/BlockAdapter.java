package parser.adapter;

import parser.JavaGrammerParser;
import syntax.statement.Block;
import syntax.statement.Statement;


import java.util.ArrayList;
import java.util.List;

public class BlockAdapter {

    public static Block adapt(JavaGrammerParser.BlockContext blockContext){
        List<Statement> statements = new ArrayList<>();
        if(blockContext.statement() != null){
            blockContext.statement().forEach(statementContext -> statements.add(StatementAdapter.adapt(statementContext)));
        }
        return new Block(statements, null); //TODO: Wozu ist das localVarsInBlock gedacht?
    }
}
