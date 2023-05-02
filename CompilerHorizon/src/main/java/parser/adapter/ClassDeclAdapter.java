package parser.adapter;

import parser.JavaGrammerParser;
import syntax.ClassDecl;

public class ClassDeclAdapter {

    public static ClassDecl adapt(JavaGrammerParser.ProgramContext programContext) {
        ClassDecl cl = new ClassDecl();
        programContext.classdecl(ClassAdapter.adapt(cl));

        return new ClassDecl();
    }

}
