package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;

/**
 * Null-Literal <br>
 * Datentyp für Null-Werte & -Objekte
 */
@Data
@AllArgsConstructor
public class NullLiteral extends PartExpression {

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
