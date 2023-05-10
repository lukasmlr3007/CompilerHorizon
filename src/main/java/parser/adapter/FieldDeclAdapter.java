package parser.adapter;

import parser.JavaGrammerParser;
import syntax.common.AccessModifier;
import syntax.common.BaseType;
import syntax.structure.FieldDecl;

public class FieldDeclAdapter {

    public static FieldDecl adapt(JavaGrammerParser.FielddeclContext fielddeclContext) {
        FieldDecl fd = new FieldDecl();
        AccessModifier am = AccessModifier.valueOf(fielddeclContext.AccessModifier().getText().toUpperCase());
        BaseType bt = BaseType.valueOf(fielddeclContext.type().getText().toUpperCase());

        return new FieldDecl(fielddeclContext.Identifier().getText(), am, bt);
    }
}
