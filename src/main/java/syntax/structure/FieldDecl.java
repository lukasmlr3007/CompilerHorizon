package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantik.ISemantikCheck;
import semantik.TypeCheckResult;
import syntax.common.AccessModifier;
import syntax.common.Type;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class FieldDecl {
    private String identifier;
    private AccessModifier accessModifier;
    private Type type;

    public TypeCheckResult accept(ISemantikCheck visitor) {
        return visitor.check(this);
    }
}
