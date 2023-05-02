package syntax;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public enum BaseType implements Type {

    VOID("void"),
    INT("int"),
    CHAR("char"),
    BOOL("boolean");

    private String type;
}
