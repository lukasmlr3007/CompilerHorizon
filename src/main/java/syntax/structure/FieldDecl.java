package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.AccessModifier;
import syntax.common.Type;

/**
 * Feld-Deklaration <br>
 * Deklariert ein neues Feld mit dem Namen identifier vom Typ type.
 * <pre>
 *     z.B.: accessModifier type identifier;
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class FieldDecl {
    private String identifier;
    private AccessModifier accessModifier;
    private Type type;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
