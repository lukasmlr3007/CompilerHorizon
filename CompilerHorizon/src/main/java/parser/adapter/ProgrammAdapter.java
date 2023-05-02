package parser.adapter;

import parser.JavaGrammerParser;
import syntax.structure.ClassDecl;
import syntax.structure.Programm;

import java.util.ArrayList;
import java.util.List;

public class ProgrammAdapter {

    public static Programm adapt(JavaGrammerParser.ProgramContext programContext) {
        List<ClassDecl> classes = new ArrayList<>();
        programContext.classdecl().forEach(classContext -> classes.add(ClassDeclAdapter.adapt(classContext)));

        return new Programm(classes);
    }

}
