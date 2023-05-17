package syntax.statement;

import lombok.Data;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

@Data
public abstract class Statement {

    public abstract void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor);
}
