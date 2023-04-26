package syntax;

public class MethodDecl {
    Type returnType;
    String identifier;
    List<ParameterDecl> parameterDeclList;
    Block block;
    AccessModifier accessModifier;
    boolean staticModifier;
}
