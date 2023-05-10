package semantic.context;

import lombok.Data;
import syntax.structure.ClassDecl;
import syntax.structure.Program;

import java.util.HashMap;

@Data
public class Context {

    private HashMap<String, ClassContext> classes;

    public Context(Program program) {

        classes = new HashMap<>();

        for (ClassDecl clazz : program.getClassDeclarations()) {
            classes.put(clazz.getIdentifier(), new ClassContext(clazz));
        }
    }
}
