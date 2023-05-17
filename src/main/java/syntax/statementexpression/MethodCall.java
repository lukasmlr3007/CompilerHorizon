package syntax.statementexpression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.expression.Expression;

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
public class MethodCall extends StatementExpression {
    String identifier;
    Expression receiver;
    List<Expression> parameterList;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }
}
