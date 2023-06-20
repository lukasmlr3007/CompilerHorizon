package parser.adapter;

import parser.JavaGrammerParser;
import syntax.common.AccessModifier;
import syntax.statement.Block;
import syntax.structure.ConstructorDecl;
import syntax.structure.ParameterDecl;

import java.util.ArrayList;
import java.util.List;

public class ConstructorAdapter {

    public static ConstructorDecl adapt(JavaGrammerParser.MyconstructorContext constructorContext) {
        List<ParameterDecl> parameters = new ArrayList<>();
        if (constructorContext.parameters() != null){
            constructorContext.parameters().parameterdecl().forEach(parameterdeclContext -> parameters.add(ParameterDeclAdapter.adapt(parameterdeclContext)));
        }

        Block block = BlockAdapter.adapt(constructorContext.block());
        return new ConstructorDecl(parameters, block, null);
    }

}
