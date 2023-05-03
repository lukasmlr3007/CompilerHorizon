package semantic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.common.Type;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class TypeCheckResult {

    private boolean valid;

    private Type type;
}
