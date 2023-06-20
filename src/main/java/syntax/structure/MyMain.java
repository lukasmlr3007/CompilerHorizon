package syntax.structure;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.statement.Block;

@Data
public class MyMain implements CodeVisitor {

    Block block;

    public MyMain(Block block) {
        this.block = block;
    }

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
