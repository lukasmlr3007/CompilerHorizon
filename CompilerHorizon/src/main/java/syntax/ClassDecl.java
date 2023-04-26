package syntax;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class ClassDecl {
    List<FieldDecl> fieldDeclList;
    List<MethodDecl> methodDeclList;
    List<ConstructorDecl> constructorDeclList;
    String identifier;
}