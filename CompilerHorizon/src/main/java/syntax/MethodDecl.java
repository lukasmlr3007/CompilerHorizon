package syntax;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MethodDecl {
    Type returnType;
    String identifier;
    List<ParameterDecl> parameterDeclList;
    Block block;
    AccessModifier accessModifier;
    boolean staticModifier;
}
