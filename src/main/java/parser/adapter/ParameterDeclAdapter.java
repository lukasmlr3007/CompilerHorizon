package parser.adapter;

import parser.JavaGrammerParser;
import syntax.common.BaseType;
import syntax.structure.ParameterDecl;

public class ParameterDeclAdapter {

    public static ParameterDecl adapt(JavaGrammerParser.ParameterdeclContext parameterdeclContext) {
        BaseType bt = BaseType.valueOf(parameterdeclContext.type().getText().toUpperCase());

        return new ParameterDecl(parameterdeclContext.Identifier().getText(), bt);
    }
}
