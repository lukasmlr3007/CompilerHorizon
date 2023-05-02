package syntax.expression;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.common.ReferenceType;

@Data
@RequiredArgsConstructor
public class StringLiteral extends Expression {
    String value;

    public StringLiteral(String value) {
        this.value = value;
        setType(new ReferenceType("java/lang/String"));
    }
}
