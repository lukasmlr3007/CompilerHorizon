package syntax.structure;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.AccessModifier;
import syntax.common.BaseType;
import syntax.common.Type;
import syntax.statement.Block;

import java.util.List;

import static org.objectweb.asm.Opcodes.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ConstructorDecl implements CodeVisitor {

    // private AccessModifier accessModifier; TODO add public/private constructor
    private List<ParameterDecl> parameters;
    //private Type type;
    private Block block;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }

    public String allParametersToString(){
        String params = "()";
        if (parameters != null){
            System.out.println("Terst");
            for (ParameterDecl parameter : parameters){
                params = params + parameterTypeToDescriptor(parameter.getType());
            }
        } else {
            params = params + "V";
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
