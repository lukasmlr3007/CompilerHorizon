package syntax.expression;

import lombok.Data;
import lombok.RequiredArgsConstructor;
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
}
