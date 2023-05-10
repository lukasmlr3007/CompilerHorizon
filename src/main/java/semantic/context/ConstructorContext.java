package semantic.context;

import syntax.common.AccessModifier;
import syntax.common.Type;
import syntax.structure.ConstructorDecl;
import syntax.structure.ParameterDecl;

import java.util.List;

public class ConstructorContext {

    private AccessModifier accessModifier;

    private Type type;

    private List<ParameterDecl> parameters;

    public ConstructorContext(ConstructorDecl constructor) {
        accessModifier = constructor.getAccessModifier();
        type = constructor.getType();
        parameters = constructor.getParameters();
    }
}
