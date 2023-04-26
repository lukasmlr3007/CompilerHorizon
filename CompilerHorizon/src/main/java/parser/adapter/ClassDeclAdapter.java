package parser.adapter;

import parser.JavaGrammerParser;
import syntax.ClassDecl;
import syntax.Programm;

import java.util.List;

public class ClassDeclAdapter {

    public static ClassDecl adapt(JavaGrammerParser.ClassdeclContext classdeclContext) {
        ClassDecl cl = new ClassDecl();

        return new ClassDecl(null, null,null, classdeclContext.Identifier().getText());
    }

}
