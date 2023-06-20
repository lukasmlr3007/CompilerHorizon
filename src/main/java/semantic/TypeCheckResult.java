package semantic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.common.Type;

@Data
//@AllArgsConstructor
@RequiredArgsConstructor
public class TypeCheckResult {

    public TypeCheckResult(boolean valid, Type type) {
        this.valid = valid;
        this.type = type;
    }

    private boolean valid;

    private Type type;
}
