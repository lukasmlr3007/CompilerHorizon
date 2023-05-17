package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.common.Type;
import syntax.statement.Statement;

import static org.objectweb.asm.Opcodes.RETURN;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LocalVarDecl extends Statement {
    private Type type;
    private String identifier;

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }
}
