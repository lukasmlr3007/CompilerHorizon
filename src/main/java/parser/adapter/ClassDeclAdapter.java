package parser.adapter;

import parser.JavaGrammerParser;
import syntax.structure.ClassDecl;
import syntax.structure.FieldDecl;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclAdapter {

    private static JavaGrammerParser.ClassdeclContext classdeclContext;

    public static ClassDecl adapt(JavaGrammerParser.ClassdeclContext classdeclContext) {
        List<FieldDecl> fields = new ArrayList<>();
        classdeclContext.fielddecl.forEach(fielddeclcontext -> fields.add(FieldDeclAdapter.adapt(fielddeclcontext)));
        ClassDecl cl = new ClassDecl();

        return new ClassDecl(null, null,null, classdeclContext.Identifier().getText());
    }

}
