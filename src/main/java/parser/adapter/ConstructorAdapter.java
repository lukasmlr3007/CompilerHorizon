package parser.adapter;

import parser.JavaGrammerParser;
import syntax.structure.ConstructorDecl;

public class ConstructorAdapter {

    public static ConstructorDecl adapt(JavaGrammerParser.ConstructorContext constructorContext) {
        ConstructorDecl cd = new ConstructorDecl();

        return new ConstructorDecl(null, null);
    }

}
