package semantic.context;

import syntax.common.AccessModifier;
import syntax.common.Type;
import syntax.structure.FieldDecl;

public class FieldContext {

    private AccessModifier accessModifier;

    private Type type;

    public FieldContext(FieldDecl field) {
        accessModifier = field.getAccessModifier();
        type = field.getType();
    }
}
