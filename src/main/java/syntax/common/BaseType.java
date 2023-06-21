package syntax.common;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * Basis-Typ <br>
 * Typ-Klasse für grundlegende Objekt-Typen, die in Java gegeben sind.
 * <pre>
 *     int n;
 * </pre>
 */
@AllArgsConstructor
@RequiredArgsConstructor
public enum BaseType implements Type {

    VOID("void"),
    INT("int"),
    CHAR("char"),
    BOOLEAN("boolean"),
    BOOL("boolean");

    private String identifier;
    @Override
    public String getIdentifier() {
        return identifier;
    }
}