package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.Type;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ParameterDecl {
    private String identifier;
    private Type type;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
