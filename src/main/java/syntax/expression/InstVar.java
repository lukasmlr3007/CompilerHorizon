package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
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
public class InstVar extends PartExpression {
    Expression expression;
    String identifier;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }
}
