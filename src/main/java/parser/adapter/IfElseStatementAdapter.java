package parser.adapter;

import parser.JavaGrammerParser;
import syntax.statement.Block;
import syntax.statement.IfElseStatement;
import syntax.structure.ConstructorDecl;
import syntax.structure.ParameterDecl;

import java.util.ArrayList;
import java.util.List;

public class IfElseStatementAdapter extends StatementAdapter {

    public static IfElseStatement adapt(JavaGrammerParser.IfElseStatementContext ifElseStatementContext) {



        return new IfElseStatement(null, null, null);
    }

}
