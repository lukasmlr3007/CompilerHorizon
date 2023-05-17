package syntax.expression;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.BaseType;

/**
 * Integer-Literal <br>
 * Datentyp für Ganzzahlen
 */
@Data
@RequiredArgsConstructor
public class IntegerLiteral extends PartExpression {
    int value;

    public IntegerLiteral(int value) {
        this.value = value;
        setType(BaseType.INT);
    }

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
