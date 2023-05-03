package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantik.ISemantikCheck;
import semantik.TypeCheckResult;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ClassDecl {
    private List<FieldDecl> fieldDeclList;
    private List<MethodDecl> methodDeclList;
    private List<ConstructorDecl> constructorDeclList;
    private String identifier;

    public TypeCheckResult accept(ISemantikCheck visitor) {
        return visitor.check(this);
    }
}