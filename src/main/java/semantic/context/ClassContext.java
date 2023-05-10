package semantic.context;

import lombok.Data;
import syntax.structure.*;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class ClassContext {

    private HashMap<String, FieldContext> fields;
    private HashMap<String, MethodContext> methods;
    private ArrayList<ConstructorContext> constructors;

    public ClassContext(ClassDecl clazz) {

        fields = new HashMap<>();
        methods = new HashMap<>(); // TODO implement methods with same name but different parameters
        constructors = new ArrayList<>();

        for (FieldDecl field : clazz.getFieldDeclList()) {
            fields.put(field.getIdentifier(), new FieldContext(field));
        }
        for (MethodDecl method : clazz.getMethodDeclList()) {
            methods.put(method.getIdentifier(), new MethodContext(method));
        }
        for (ConstructorDecl constructor : clazz.getConstructorDeclList()) {
            constructors.add(new ConstructorContext(constructor));
        }
    }
}
