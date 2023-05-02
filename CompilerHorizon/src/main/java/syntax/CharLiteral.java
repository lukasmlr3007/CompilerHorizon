package syntax;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CharLiteral extends Expression{
    private char value;

    private Type type;

    public CharLiteral(char value) {
        this.value = value;
        this.type = BaseType.CHAR;
    }
}
