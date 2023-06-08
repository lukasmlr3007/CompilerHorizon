package bytecode;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import syntax.expression.*;
import syntax.statement.*;
import syntax.statementexpression.Assign;
import syntax.statementexpression.MethodCall;
import syntax.statementexpression.New;
import syntax.statementexpression.StatementStmtExpr;
import syntax.structure.ConstructorDecl;
import syntax.structure.MethodDecl;
import syntax.structure.ParameterDecl;

public class MethodBytecode implements MethodBytecodeVisitor {

    private final String className;
    private final ClassWriter classWriter;
    private MethodVisitor methodVisitor;

    public MethodBytecode(String className, ClassWriter classWriter) {
        this.className = className;
        this.classWriter = classWriter;

        //localVars = new LocalVarStack();
    }

    @Override
    public void visit(AdditiveExpression additiveExpression) {
        if (additiveExpression.getOperator().equals("+")){
            methodVisitor.visitInsn(Opcodes.IADD);
        } else if (additiveExpression.getOperator().equals("-")){
            methodVisitor.visitInsn(Opcodes.ISUB);
        } else if (additiveExpression.getOperator().equals("*")){
            methodVisitor.visitInsn(Opcodes.IMUL);
        } else if (additiveExpression.getOperator().equals("/")){
            methodVisitor.visitInsn(Opcodes.IDIV);
        } else {
            throw new IllegalArgumentException("Operator not valid");
        }
    }

    @Override
    public void visit(BoolLiteral boolLiteral) {
        if (boolLiteral.getValue()){
            methodVisitor.visitInsn(Opcodes.ICONST_1);
        } else {
            methodVisitor.visitInsn(Opcodes.ICONST_0);
        }
    }

    @Override
    public void visit(CharLiteral charLiteral) {
        char value = charLiteral.getValue();
        if (value <= Byte.MAX_VALUE){
            methodVisitor.visitIntInsn(Opcodes.BIPUSH, value);
        } else if (value <= Short.MAX_VALUE) {
            methodVisitor.visitIntInsn(Opcodes.SIPUSH, value);
        } else {
            methodVisitor.visitLdcInsn(value);
        }
    }

    @Override
    public void visit(InstVar instVar) {

    }

    @Override
    public void visit(IntegerLiteral integerLiteral) {
        int value = integerLiteral.getValue();
        if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE){
            methodVisitor.visitIntInsn(Opcodes.BIPUSH, value);
        } else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE){
            methodVisitor.visitIntInsn(Opcodes.SIPUSH, value);
        } else {
            methodVisitor.visitLdcInsn(value);
        }
    }

    @Override
    public void visit(LocalOrFieldVar localOrFieldVar) {

    }

    @Override
    public void visit(LogicalExpression logicalExpression) {

    }

    @Override
    public void visit(NullLiteral nullLiteral) {

    }

    @Override
    public void visit(RelationalExpression relationalExpression) {

    }

    @Override
    public void visit(StatementExpressionExpression statementExpressionExpression) {

    }

    @Override
    public void visit(This aThis) {

    }

    @Override
    public void visit(Unary unary) {

    }

    @Override
    public void visit(Block block) {

    }

    @Override
    public void visit(IfElseStatement ifElseStatement) {

    }

    @Override
    public void visit(LocalVarDecl localVarDecl) {

    }

    @Override
    public void visit(ReturnStatement returnStatement) {

    }

    @Override
    public void visit(StatementExpressionStatement statementExpressionStatement) {

    }

    @Override
    public void visit(WhileStatement whileStatement) {

    }

    @Override
    public void visit(Assign assign) {

    }

    @Override
    public void visit(MethodCall methodCall) {

    }

    @Override
    public void visit(New aNew) {

    }

    @Override
    public void visit(StatementStmtExpr statementStmtExpr) {

    }

    @Override
    public void visit(ConstructorDecl constructorDecl) {

    }

    @Override
    public void visit(MethodDecl methodDecl) {

    }

    @Override
    public void visit(ParameterDecl parameterDecl) {

    }
}
