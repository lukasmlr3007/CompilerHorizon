package parser.adapter;

import parser.JavaGrammerParser;
import syntax.ClassDecl;
import syntax.Programm;

import java.util.List;

public class ProgrammAdapter {

    public static Programm adapt(JavaGrammerParser.ProgramContext programContext) {
        ClassDecl cl = new ClassDecl();
        programContext.classdecl(ClassDeclAdapter.adapt(cl));

        return new Programm(List.of(cl));
    }

}
