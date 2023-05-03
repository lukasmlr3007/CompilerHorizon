package parser.adapter;

import parser.JavaGrammerParser;
import syntax.structure.FieldDecl;

public class FieldDeclAdapter {

    public static FieldDecl adapt(JavaGrammerParser.FielddeclContext fielddeclContext) {
        FieldDecl fd = new FieldDecl();

        return new FieldDecl(null, null,null, fielddeclContext.Identifier().getText());
    }
}
