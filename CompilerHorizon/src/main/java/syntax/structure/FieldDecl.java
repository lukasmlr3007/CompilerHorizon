package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.common.AccessModifier;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class FieldDecl {
    private String identifier;
    private AccessModifier accessModifier;
}
