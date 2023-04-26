package syntax;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class BaseType extends Type{
    enum types {
        INT,
        CHAR,
        BOOL,
        VOID
    }
}
