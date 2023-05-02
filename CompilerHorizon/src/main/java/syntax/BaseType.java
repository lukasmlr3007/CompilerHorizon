package syntax;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public enum BaseType implements Type {

    VOID,
    INT,
    CHAR,
    BOOL;
}
