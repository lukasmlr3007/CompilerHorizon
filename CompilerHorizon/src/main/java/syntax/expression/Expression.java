package syntax.expression;

import lombok.Data;
import syntax.common.Type;

@Data
public abstract class Expression {

    private Type type;
}
