package parser.adapter;

import parser.JavaGrammerParser;
import syntax.common.AccessModifier;
import syntax.common.BaseType;
import syntax.common.ReferenceType;
import syntax.common.Type;
import syntax.statement.Block;
import syntax.structure.MethodDecl;
import syntax.structure.ParameterDecl;

import java.util.ArrayList;
import java.util.List;

public class MethodDeclAdapter {

    public static MethodDecl adapt(JavaGrammerParser.MethoddeclContext methoddeclContext) {
        Type type;
        try {
            type = BaseType.valueOf(methoddeclContext.type().getText().toUpperCase());
        } catch (Exception e) {
            type = new ReferenceType(methoddeclContext.type().getText());
        }

        String identifier = methoddeclContext.Identifier().getSymbol().getText();

        List<ParameterDecl> params = new ArrayList<>();
        if (methoddeclContext.parameters() != null) {
            methoddeclContext.parameters().parameterdecl().forEach(parameterdeclContext -> params.add(ParameterDeclAdapter.adapt(parameterdeclContext)));
        }

        Block block = BlockAdapter.adapt(methoddeclContext.block());
        AccessModifier am = AccessModifier.valueOf(methoddeclContext.AccessModifier().getText().toUpperCase());
        boolean isStatic = methoddeclContext.Static() != null;

        return new MethodDecl(type, identifier, params, block, am, isStatic);
    }
}
