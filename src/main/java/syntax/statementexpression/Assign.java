package syntax.statementexpression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.expression.Expression;
import syntax.expression.InstVar;

import static org.objectweb.asm.Opcodes.*;

/**
 * Assign / Wertzuweisung <br>
 * Überschreibt die assignLeft-Expression mit dem Wert der assignRight
 * <pre>
 *     assignLeft = assignRight
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Assign extends StatementExpression {
    InstVar assignLeft;
    Expression assignRight;

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {
        //number = i;

        methodVisitor.visitVarInsn(ALOAD, 0);
        methodVisitor.visitVarInsn(ILOAD, 1);
        methodVisitor.visitFieldInsn(PUTFIELD, "TestClass", "number", "I"); //TODO Classname statt Testclass übergeben
    }

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
