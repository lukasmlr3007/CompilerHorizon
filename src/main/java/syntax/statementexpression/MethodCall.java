package syntax.statementexpression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.BaseType;
import syntax.common.Type;
import syntax.expression.Expression;
import syntax.expression.PartExpression;

import java.util.List;

/**
 * Methodenaufruf <br>
 * Ruft eine Methode mit dem Namen identifier und den Parametern der parameterList auf und gibt das
 * Ergebnis der Methode an den receiver zurück.
 * <pre>
 *     receiver.identifier(parameterList)
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MethodCall extends StatementExpression implements CodeVisitor {

    String identifier;
    Expression receiver;
    List<PartExpression> parameterList;

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }

    public String returnAndParameterTypeToDescriptor() {
        String descriptor = "(";
        if (parameterList.size() > 0){
            for (PartExpression parameter : parameterList){
                descriptor = descriptor + typeToString(parameter.getType());
            }
        }

        descriptor = descriptor + ")";

        descriptor = descriptor + typeToString(this.receiver.getType());

        return descriptor;
    }

    public String typeToString(Type type){
        if (type == BaseType.VOID) {
            return "V";
        } else if (type == BaseType.INT) {
            return "I";
        } else if (type == BaseType.CHAR) {
            return "C";
        } else if (type == BaseType.BOOLEAN) {
            return "Z";
        } else {
            return "L" + type.getIdentifier();
        }
    }
}
