package syntax.statementexpression;

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
import syntax.expression.PartExpression;
import syntax.structure.ParameterDecl;

import java.util.List;

/**
 * Methodenaufruf <br>
 * Ruft eine Methode mit dem Namen identifier und den Parametern der parameterList auf und gibt das
 * Ergebnis der Methode an den receiver zurück.
 * <pre>
 *     identifier(parameterList)
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MethodCall extends StatementExpression implements CodeVisitor {
    String identifier;
    Expression receiver;
    List<PartExpression> parameterList;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }

    public String allParametersToString(){
        String params = "";
        for (PartExpression parameter : parameterList){
            params = params + parameterTypeToDescriptor(parameter.getType());
        }
        return params;
    }

    public String parameterTypeToDescriptor(Type parameterType){
        if (parameterType == BaseType.VOID){
            return "V";
        } else if (parameterType == BaseType.INT){
            return "I";
        } else if (parameterType == BaseType.CHAR){
            return "C";
        } else if (parameterType == BaseType.BOOLEAN){
            return "B";
        } else {
            return parameterType.getIdentifier();
        }
    }
}
