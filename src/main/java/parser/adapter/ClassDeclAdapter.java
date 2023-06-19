package parser.adapter;

import parser.JavaGrammerParser;
import syntax.structure.*;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclAdapter {

    private static JavaGrammerParser.ClassdeclContext classdeclContext;

    public static ClassDecl adapt(JavaGrammerParser.ClassdeclContext classdeclContext) {
        List<FieldDecl> fields = new ArrayList<>();
        if (classdeclContext.fielddecl() != null){
            classdeclContext.fielddecl().forEach(fielddeclcontext -> fields.add(FieldDeclAdapter.adapt(fielddeclcontext)));
        }
        List<MethodDecl> methods = new ArrayList<>();
        if (classdeclContext.methoddecl() != null){
            classdeclContext.methoddecl().forEach(methoddeclContext -> methods.add(MethodDeclAdapter.adapt(methoddeclContext)));
        }
        List<ConstructorDecl> constructos = new ArrayList<>();
        if(classdeclContext.myconstructor() != null) {
            classdeclContext.myconstructor().forEach(constructorContext -> constructos.add(ConstructorAdapter.adapt(constructorContext)));
        }
        MyMain mymain = null;
        if (classdeclContext.main() != null) {
            mymain = MainAdapter.adapt(classdeclContext.main());
        }

        return new ClassDecl(fields, methods, constructos, classdeclContext.Identifier().getText(), mymain);
    }

}
