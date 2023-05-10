package parser.adapter;

import parser.JavaGrammerParser;
import syntax.statement.LocalVarDecl;

public class LocalVarDeclAdapter {
    public static LocalVarDecl adapt(JavaGrammerParser.LocalVarDeclContext localVarDeclContext){
            return new LocalVarDecl(localVarDeclContext.Identifier().getText());
    }
}
