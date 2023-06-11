package syntax.expression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.common.BaseType;
import syntax.common.Type;
import syntax.expression.Expression;

/**
 * Instanz-Variable <br>
 * Aufruf einer Variable oder Methode aus einer Variable heraus.
 * <pre>
 *     this.x;
 *     this.x.print();
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class InstVar extends PartExpression implements CodeVisitor {
    Expression expression;
    String identifier;
    boolean myStatic = false;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }


    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }

    public boolean getStatic(){
        return myStatic;
    }

    public String returnTypeToDescriptor(Type returnType) {
        if (returnType == BaseType.VOID) {
            return "V()";
        } else if (returnType == BaseType.INT) {
            return "I()";
        } else if (returnType == BaseType.CHAR) {
            return "C()";
        } else if (returnType == BaseType.BOOLEAN) {
            return "B()";
        } else {
            return returnType.getIdentifier();
        }
    }
}
