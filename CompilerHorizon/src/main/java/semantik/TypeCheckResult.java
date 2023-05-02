package semantik;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.Type;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class TypeCheckResult {

    private boolean valid;

    private Type type;
}
