package syntax.expression;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.common.BaseType;

/**
 * Char-Literal <br>
 * Datentyp für Character
 */
@Data
@RequiredArgsConstructor
public class CharLiteral extends PartExpression {
    private char value;

    public CharLiteral(char value) {
        this.value = value;
        setType(BaseType.CHAR);
    }
}
