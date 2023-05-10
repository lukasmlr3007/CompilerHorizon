package semantic.context;

import syntax.common.AccessModifier;
import syntax.common.Type;
import syntax.structure.ConstructorDecl;
import syntax.structure.ParameterDecl;

import java.util.List;

public class ConstructorContext {

    private List<ParameterDecl> parameters;

    public ConstructorContext(ConstructorDecl constructor) {
        parameters = constructor.getParameters();
    }
}
