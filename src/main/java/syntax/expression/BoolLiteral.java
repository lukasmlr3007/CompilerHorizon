package syntax.expression;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.common.BaseType;

/**
 * Boolean-Literal <br>
 * Datentyp für true, false
 */
@Data
@RequiredArgsConstructor
public class BoolLiteral extends PartExpression {
    boolean value;

    public BoolLiteral(boolean value) {
        this.value = value;
        setType(BaseType.BOOLEAN);
    }
}
