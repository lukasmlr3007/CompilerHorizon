package parser.adapter;

import parser.JavaGrammerParser;
import syntax.ClassDecl;

public class ClassDeclAdapter {

    public static ClassDecl adapt(JavaGrammerParser.ClassdeclContext classdeclContext) {
        ClassDecl cl = new ClassDecl();

        return new ClassDecl(null, null,null, classdeclContext.Identifier().getText());
    }

}
