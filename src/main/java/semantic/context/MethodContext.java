package semantic.context;

import lombok.Data;
import syntax.common.AccessModifier;
import syntax.common.Type;
import syntax.structure.MethodDecl;
import syntax.structure.ParameterDecl;

import java.util.HashMap;
import java.util.List;

@Data
public class MethodContext {

    private String identifier;

    private List<ParameterDecl> parameters;

    private Type returnType;

    private AccessModifier accessModifier;

    public MethodContext(MethodDecl methodDecl) {

        identifier = methodDecl.getIdentifier();
        parameters = methodDecl.getParameters();
        returnType = methodDecl.getReturnType();
        accessModifier = methodDecl.getAccessModifier();
    }
}
