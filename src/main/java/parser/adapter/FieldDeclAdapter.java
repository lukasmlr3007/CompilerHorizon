package parser.adapter;

import parser.JavaGrammerParser;
import syntax.common.AccessModifier;
import syntax.structure.FieldDecl;

public class FieldDeclAdapter {

    public static FieldDecl adapt(JavaGrammerParser.FielddeclContext fielddeclContext) {
        FieldDecl fd = new FieldDecl();
        // AccessModifier am = fielddeclContext;

        return new FieldDecl(fielddeclContext.Identifier().getText(), null, null);
    }
}
