package semantic.context;

import syntax.common.AccessModifier;
import syntax.common.Type;
import syntax.structure.MethodDecl;
import syntax.structure.ParameterDecl;

import java.util.List;

public class MethodContext {

    private AccessModifier accessModifier;

    private Type type;

    private List<ParameterDecl> parameters;

    public MethodContext(MethodDecl method) {
        accessModifier = method.getAccessModifier();
        type = method.getReturnType();
        parameters = method.getParameterDeclList();
    }
}
