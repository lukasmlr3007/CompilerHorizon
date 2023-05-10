package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.AccessModifier;
import syntax.common.Type;
import syntax.statement.Block;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ConstructorDecl {

    private AccessModifier accessModifier;
    private List<ParameterDecl> parameters;
    private Type type;
    private Block block;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
