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
 * Char-Literal <br>
 * Datentyp für Character
 */
@Data
@RequiredArgsConstructor
public class CharLiteral extends PartExpression implements CodeVisitor {
    private char value;

    public CharLiteral(char value) {
        this.value = value;
        setType(BaseType.CHAR);
    }

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }


    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
