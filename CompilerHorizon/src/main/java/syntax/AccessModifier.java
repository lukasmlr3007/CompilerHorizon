package syntax;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class AccessModifier {
    enum accessModifier {
        PUBLIC,
        PRIVATE,
        PROTECTED
    }
}
