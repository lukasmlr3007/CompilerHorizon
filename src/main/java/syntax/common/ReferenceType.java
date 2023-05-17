package syntax.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Referenzierter Typ <br>
 * Typ-Klasse für referenzierte Objekt-Typen, die Instanzen einer anderen Klasse sind.
 * <pre>
 *     Auto auto;
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ReferenceType implements Type {
    String identifier;
}
