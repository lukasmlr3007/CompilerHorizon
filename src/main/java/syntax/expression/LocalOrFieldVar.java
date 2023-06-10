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
 * TODO
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LocalOrFieldVar extends PartExpression implements CodeVisitor {
    String identifier;

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
