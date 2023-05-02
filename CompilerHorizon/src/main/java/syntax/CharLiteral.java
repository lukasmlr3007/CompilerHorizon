package syntax;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CharLiteral extends Expression {
    private char value;

    public CharLiteral(char value) {
        this.value = value;
        setType(BaseType.CHAR);
    }
}
