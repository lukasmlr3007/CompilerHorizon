package syntax.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public enum BaseType implements Type {

    VOID("void"),
    INT("int"),
    CHAR("char"),
    BOOLEAN("boolean");

    private String identifier;
    @Override
    public String getIdentifier() {
        return identifier;
    }
}