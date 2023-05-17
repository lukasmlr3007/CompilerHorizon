package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.Type;
import syntax.statement.Statement;

/**
 * TODO
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LocalVarDecl extends Statement {
    private Type type;
    private String identifier;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
