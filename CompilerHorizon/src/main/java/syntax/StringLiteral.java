package syntax;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class StringLiteral extends Expression {
    String value;

    public StringLiteral(String value) {
        this.value = value;
        setType(new ReferenceType("java/lang/String"));
    }
}
