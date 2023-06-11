package syntax.structure;

import bytecode.ClassBytecodeVisitor;
import bytecode.CodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.*;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;

import java.util.List;

import static org.objectweb.asm.Opcodes.*;

/**
 * Klassen-Deklaration <br>
 * Deklariert eine neues Klasse mit dem Namen identifier und den vorgegebenen Listen von Feldern, Methoden und Konstruktoren.
 * <pre>
 *     z.B.: class identifier { <br>
 *         ...                  <br>
 *     }
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ClassDecl implements CodeVisitor {
    private List<FieldDecl> fieldDeclList;
    private List<MethodDecl> methodDeclList;
    private List<ConstructorDecl> constructorDeclList;
    private String identifier;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(ClassBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}