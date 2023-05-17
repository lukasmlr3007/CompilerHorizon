package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

/**
 * Null-Literal <br>
 * Datentyp für Null-Werte & -Objekte
 */
@Data
@AllArgsConstructor
public class NullLiteral extends PartExpression {

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }
}
