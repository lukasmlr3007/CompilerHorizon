package syntax.expression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.common.BaseType;

/**
 * Integer-Literal <br>
 * Datentyp für Ganzzahlen
 */
import static org.objectweb.asm.Opcodes.*;

@Data
@RequiredArgsConstructor
public class IntegerLiteral extends PartExpression implements CodeVisitor {
    int value;

    public IntegerLiteral(int value) {
        this.value = value;
        setType(BaseType.INT);
    }

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {
        if (this.value == 0){
            methodVisitor.visitInsn(ICONST_0);
        } else if (this.value == 1){
            methodVisitor.visitInsn(ICONST_1);
        } else if (this.value == 2){
            methodVisitor.visitInsn(ICONST_2);
        } else if (this.value == 3){
            methodVisitor.visitInsn(ICONST_3);
        } else if (this.value == 4){
            methodVisitor.visitInsn(ICONST_4);
        } else if (this.value == 5){
            methodVisitor.visitInsn(ICONST_5);
        } else {
            methodVisitor.visitIntInsn(BIPUSH, this.value);
        }
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
