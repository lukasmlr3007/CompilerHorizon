package syntax.structure;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import syntax.statement.Block;

@Data
public class MyMain implements CodeVisitor {
    Block block;

    public MyMain(Block block) {
        this.block = block;
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
