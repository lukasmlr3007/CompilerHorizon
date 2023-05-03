package syntax.expression;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.common.BaseType;

@Data
@RequiredArgsConstructor
public class IntegerLiteral extends Expression {
    int value;

    public IntegerLiteral(int value) {
        this.value = value;
        setType(BaseType.INT);
    }
}