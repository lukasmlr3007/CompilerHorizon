package semantic.context;

import lombok.Data;
import syntax.common.Type;
import syntax.structure.*;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class ClassContext {

    private HashMap<String, Type> classVariables;

    public ClassContext(ClassDecl clazz) {

        classVariables = new HashMap<>();
        for (FieldDecl field : clazz.getFieldDeclList()) {
            classVariables.put(field.getIdentifier(), field.getType());
        }
    }
}
