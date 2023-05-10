package semantic.context;

import lombok.Data;
import syntax.structure.ClassDecl;
import syntax.structure.Program;

import java.util.HashMap;

@Data
public class ProgramContext {

    private HashMap<String, ClassContext> classes;

    public ProgramContext() {
        classes = new HashMap<>();
    }

    public void setProgram(Program program) {

        for (ClassDecl clazz : program.getClassDeclarations()) {
            classes.put(clazz.getIdentifier(), new ClassContext(clazz));
        }
    }
}
