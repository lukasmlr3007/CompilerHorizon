package syntax;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ClassDecl {
    List<FieldDecl> fieldDeclList;
    List<MethodDecl> methodDeclList;
    List<ConstructorDecl> constructorDeclList;
    String identifier;
}