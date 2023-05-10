package parser.adapter;

import parser.JavaGrammerParser;
import syntax.common.BaseType;
import syntax.statement.LocalVarDecl;

public class LocalVarDeclAdapter {
    public static LocalVarDecl adapt(JavaGrammerParser.LocalVarDeclContext localVarDeclContext) {
        BaseType bt = BaseType.valueOf(localVarDeclContext.type().getText().toUpperCase());
        return new LocalVarDecl(bt, localVarDeclContext.Identifier().getText());
    }
}
