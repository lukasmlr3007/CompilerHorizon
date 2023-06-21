package semantic.context;

import lombok.Data;
import syntax.common.Type;
import syntax.expression.Expression;
import syntax.structure.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
public class ClassContext {

    private String identifier;

    private HashMap<String, FieldDecl> classVariables;

    private HashMap<String, List<MethodContext>> classMethods;

    private List<List<ParameterDecl>> classConstructors;

    public ClassContext(ClassDecl clazz) {

        identifier = clazz.getIdentifier();
        classVariables = new HashMap<>();
        classMethods = new HashMap<>();
        classConstructors = new ArrayList<>();

        for (FieldDecl field : clazz.getFieldDeclList()) {
            classVariables.put(field.getIdentifier(), field);
        }

        for (MethodDecl method : clazz.getMethodDeclList()) {
            if (!classMethods.containsKey(method.getIdentifier())) {
                classMethods.put(method.getIdentifier(), new ArrayList<>());
            }
            classMethods.get(method.getIdentifier()).add(new MethodContext(method));
        }

        for (ConstructorDecl constructor : clazz.getConstructorDeclList()) {
            classConstructors.add(constructor.getParameters());
        }
    }

    public boolean hasMethod(String identifier) {
        return classMethods.containsKey(identifier);
    }

    public List<MethodContext> getMethod(String identifier) {
        return classMethods.get(identifier);
    }

    public boolean hasVariable(String identifier) {
        return classVariables.containsKey(identifier);
    }

    public FieldDecl getVariable(String identifier) {
        return classVariables.get(identifier);
    }

    public boolean hasConstructor(List<Expression> parameters) {
        return classConstructors.contains(parameters);
    }

    public List<List<ParameterDecl>> getConstructors() {
        return classConstructors;
    }
}
