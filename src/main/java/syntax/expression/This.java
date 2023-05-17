package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;

/**
 * This <br>
 * Schlüsselwort um die aktuelle Klassen-Instanz zu referenzieren.
 */
@Data
@AllArgsConstructor
public class This extends Expression {

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
