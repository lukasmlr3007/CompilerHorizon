package syntax.structure;

import bytecode.ClassBytecodeVisitor;
import bytecode.CodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.Type;

import java.util.List;

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
    private MyMain mymain;
    private Type type;

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(ClassBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}