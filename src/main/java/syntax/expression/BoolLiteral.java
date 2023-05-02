package syntax.expression;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.common.BaseType;

@Data
@RequiredArgsConstructor
public class BoolLiteral extends Expression {
    boolean value;

    public BoolLiteral(boolean value) {
        this.value = value;
        setType(BaseType.BOOL);
    }
}
