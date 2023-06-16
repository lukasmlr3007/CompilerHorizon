package parser.adapter;

import parser.JavaGrammerParser;
import syntax.common.AccessModifier;
import syntax.common.BaseType;
import syntax.common.ReferenceType;
import syntax.common.Type;
import syntax.structure.FieldDecl;

public class FieldDeclAdapter {

    public static FieldDecl adapt(JavaGrammerParser.FielddeclContext fielddeclContext) {
        AccessModifier am = AccessModifier.valueOf(fielddeclContext.AccessModifier().getText().toUpperCase());
        Type type;
        try {
            type = BaseType.valueOf(fielddeclContext.type().getText().toUpperCase());
        } catch (Exception e) {
            type = new ReferenceType(fielddeclContext.type().getText());
        }
        return new FieldDecl(fielddeclContext.Identifier().getText(), am, type);
    }
}
