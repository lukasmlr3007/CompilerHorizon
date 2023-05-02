package syntax;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BoolLiteral extends Expression {
    boolean value;

    public BoolLiteral(boolean value) {
        this.value = value;
        setType(BaseType.BOOL);
    }
}
