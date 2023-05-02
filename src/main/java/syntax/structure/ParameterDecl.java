package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.common.Type;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ParameterDecl {
    private String identifier;
    private Type type;
}
