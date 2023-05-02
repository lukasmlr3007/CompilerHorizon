package syntax;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class IntegerLiteral extends Expression {
    int value;

    public IntegerLiteral(int value) {
        this.value = value;
        setType(BaseType.INT);
    }
}
