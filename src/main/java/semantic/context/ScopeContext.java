package semantic.context;

import semantic.exception.AlreadyDefinedException;
import syntax.common.Type;
import syntax.structure.ParameterDecl;

import java.util.HashMap;
import java.util.Stack;

public class ScopeContext {

    private Stack<HashMap<String, Type>> localVariables;

    public ScopeContext() { localVariables = new Stack<>(); }

    private void addLocalVariable(String identifier, Type type) {
        if (contains(identifier)) {
            throw new AlreadyDefinedException("Variable " + identifier + " is already defined!");
        }
    }

    public void addVariable(ParameterDecl parameter) {
        addLocalVariable(parameter.getIdentifier(), parameter.getType());
    }

    public void push() {
        localVariables.push(new HashMap<>());
    }

    public void pop() {
        localVariables.pop();
    }

    public boolean contains(String identifier) {
        for (HashMap<String, Type> locals : localVariables) {
            if (locals.containsKey(identifier)) {
                return true;
            }
        }
        return false;
    }
}
