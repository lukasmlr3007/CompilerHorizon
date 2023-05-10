package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.Type;

/**
 * Parameter-Deklaration <br>
 * Deklariert einen neuen Parameter mit dem Namen identifier vom Typ type.
 * <pre>
 *     z.B.: (type identifier)
 * </pre>
 */
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
