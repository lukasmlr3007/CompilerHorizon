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
    private MyMain mymain;
    private String identifier;
    private Type type;

    public ClassDecl(List<FieldDecl> fieldDeclList, List<MethodDecl> methodDeclList, List<ConstructorDecl> constructorDeclList, String identifier, MyMain myMain) {
        this.identifier = identifier;
        this.mymain = myMain;
        this.fieldDeclList = fieldDeclList;
        this.methodDeclList = methodDeclList;
        this.constructorDeclList = constructorDeclList;
        this.type = null;
    }

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(ClassBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}