package bytecode;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import syntax.common.BaseType;
import syntax.common.Operator;
import syntax.common.ReferenceType;
import syntax.common.Sysout;
import syntax.expression.*;
import syntax.statement.*;
import syntax.statementexpression.*;
import syntax.structure.ConstructorDecl;
import syntax.structure.MethodDecl;
import syntax.structure.MyMain;

import java.util.Objects;

import static org.objectweb.asm.Opcodes.INVOKESPECIAL;
import static org.objectweb.asm.Opcodes.INVOKEVIRTUAL;

public class MethodBytecode implements MethodBytecodeVisitor {

    private final String className;
    private final ClassWriter classWriter;
    private MethodVisitor methodVisitor;
    private String lastClass;
    private LocalVariableStack localVariables;

    public MethodBytecode(String className, ClassWriter classWriter) {
        this.className = className;
        this.classWriter = classWriter;

        localVariables = new LocalVariableStack();
    }

    @Override
    public void visit(AdditiveExpression additiveExpression) {
        if (additiveExpression.getOperator().equals("+")) {
            methodVisitor.visitInsn(Opcodes.IADD);
        } else if (additiveExpression.getOperator().equals("-")) {
            methodVisitor.visitInsn(Opcodes.ISUB);
        } else if (additiveExpression.getOperator().equals("*")) {
            methodVisitor.visitInsn(Opcodes.IMUL);
        } else if (additiveExpression.getOperator().equals("/")) {
            methodVisitor.visitInsn(Opcodes.IDIV);
        } else {
            throw new IllegalArgumentException("mathematical operator not valid");
        }
    }

    @Override
    public void visit(BoolLiteral boolLiteral) {
        if (boolLiteral.getValue()) {
            methodVisitor.visitInsn(Opcodes.ICONST_1);
        } else {
            methodVisitor.visitInsn(Opcodes.ICONST_0);
        }
    }

    @Override
    public void visit(CharLiteral charLiteral) {
        char value = charLiteral.getValue();
        if (value <= Byte.MAX_VALUE) {
            methodVisitor.visitIntInsn(Opcodes.BIPUSH, value);
        } else if (value <= Short.MAX_VALUE) {
            methodVisitor.visitIntInsn(Opcodes.SIPUSH, value);
        } else {
            methodVisitor.visitLdcInsn(value);
        }
    }

    @Override
    public void visit(InstVar instVar) {
        this.visitInstVar(instVar, true);
    }

    @Override
    public void visit(IntegerLiteral integerLiteral) {
        int value = integerLiteral.getValue();
        if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
            methodVisitor.visitIntInsn(Opcodes.BIPUSH, value);
        } else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
            methodVisitor.visitIntInsn(Opcodes.SIPUSH, value);
        } else {
            methodVisitor.visitLdcInsn(value);
        }
    }

    @Override
    public void visit(LocalOrFieldVar localOrFieldVar) {
        int index = localVariables.get(localOrFieldVar.getIdentifier());
        if (index >= 0) {
            if (localOrFieldVar.getType() instanceof BaseType) {
                methodVisitor.visitVarInsn(Opcodes.ILOAD, index);
            } else {
                methodVisitor.visitVarInsn(Opcodes.ALOAD, index);
            }
        } else {
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
            methodVisitor.visitFieldInsn(Opcodes.GETFIELD, className, localOrFieldVar.getIdentifier(), localOrFieldVar.fieldTypeToDescriptor(localOrFieldVar.getType()));
        }
        if (localOrFieldVar.getType() instanceof ReferenceType) {
            this.lastClass = localOrFieldVar.getIdentifier();
            System.out.println("console log : localOrFieldVar.getIdentifier()");
        }
    }

    @Override
    public void visit(LogicalExpression logicalExpression) {
        Label labelFalse = new Label();
        Label labelTrue = new Label();

        String operator = logicalExpression.getOperator();
        if (operator.equals("||")) {
            logicalExpression.getExpressionLeft().accept(this);
            methodVisitor.visitJumpInsn(Opcodes.IFNE, labelTrue);
            logicalExpression.getExpressionRight().accept(this);
            methodVisitor.visitJumpInsn(Opcodes.IFEQ, labelFalse);
        } else if (operator.equals("&&")) {
            logicalExpression.getExpressionLeft().accept(this);
            methodVisitor.visitJumpInsn(Opcodes.IFEQ, labelFalse);
            logicalExpression.getExpressionRight().accept(this);
            methodVisitor.visitJumpInsn(Opcodes.IFEQ, labelFalse);
        } else {
            throw new IllegalArgumentException("logical operator not valid");
        }
        Label labelEnd = new Label();

        methodVisitor.visitLabel(labelTrue);
        methodVisitor.visitInsn(Opcodes.ICONST_1);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, labelEnd);
        methodVisitor.visitLabel(labelFalse);
        methodVisitor.visitInsn(Opcodes.ICONST_0);
        methodVisitor.visitLabel(labelEnd);
    }

    @Override
    public void visit(NullLiteral nullLiteral) {
        methodVisitor.visitInsn(Opcodes.ACONST_NULL);
    }

    @Override
    public void visit(RelationalExpression relationalExpression) {
        Label labelFalse = new Label();
        Label labelTrue = new Label();

        String operator = relationalExpression.getOperator();
        if (operator.equals("==")) {
            relationalExpression.getExpressionLeft().accept(this);
            relationalExpression.getExpressionRight().accept(this);
            if (relationalExpression.getExpressionLeft().getType() instanceof BaseType && relationalExpression.getExpressionRight().getType() instanceof BaseType) {
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPNE, labelFalse);
            } else {
                methodVisitor.visitJumpInsn(Opcodes.IF_ACMPNE, labelFalse);
            }
        } else if (operator.equals("<")) {
            relationalExpression.getExpressionLeft().accept(this);
            relationalExpression.getExpressionRight().accept(this);
            methodVisitor.visitJumpInsn(Opcodes.IF_ICMPGE, labelFalse);
        } else if (operator.equals(">")) {
            relationalExpression.getExpressionLeft().accept(this);
            relationalExpression.getExpressionRight().accept(this);
            methodVisitor.visitJumpInsn(Opcodes.IF_ICMPLE, labelFalse);
        } else if (operator.equals("<=")) {
            relationalExpression.getExpressionLeft().accept(this);
            relationalExpression.getExpressionRight().accept(this);
            methodVisitor.visitJumpInsn(Opcodes.IF_ICMPLT, labelFalse);
        } else if (operator.equals(">=")) {
            relationalExpression.getExpressionLeft().accept(this);
            relationalExpression.getExpressionRight().accept(this);
            methodVisitor.visitJumpInsn(Opcodes.IF_ICMPLT, labelFalse);
        } else if (operator.equals("!=")) {
            relationalExpression.getExpressionLeft().accept(this);
            relationalExpression.getExpressionRight().accept(this);
            if (relationalExpression.getExpressionLeft().getType() instanceof BaseType && relationalExpression.getExpressionRight().getType() instanceof BaseType) {
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPEQ, labelFalse);
            } else {
                methodVisitor.visitJumpInsn(Opcodes.IF_ACMPEQ, labelFalse);
            }
        } else {
            throw new IllegalArgumentException("relational operator not valid");
        }
        Label labelEnd = new Label();

        methodVisitor.visitLabel(labelTrue);
        methodVisitor.visitInsn(Opcodes.ICONST_1);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, labelEnd);
        methodVisitor.visitLabel(labelFalse);
        methodVisitor.visitInsn(Opcodes.ICONST_0);
        methodVisitor.visitLabel(labelEnd);
    }

    @Override
    public void visit(StatementExpressionExpression statementExpressionExpression) {
        if (statementExpressionExpression.getStatementExpression() instanceof Assign) {
            this.visit((Assign) statementExpressionExpression.getStatementExpression());
        } else if (statementExpressionExpression.getStatementExpression() instanceof New) {
            this.visit((New) statementExpressionExpression.getStatementExpression());
        } else if (statementExpressionExpression.getStatementExpression() instanceof MethodCall) {
            this.visit((MethodCall) statementExpressionExpression.getStatementExpression());
        } else {
            System.out.println("invalid StatementExpressionExpression");
        }
    }

    @Override
    public void visit(This aThis) {
        this.lastClass = className;
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
    }

    @Override
    public void visit(Unary unary) {
        if (unary.getOperator() == Operator.NOT) {
            Label labelTrue = new Label();
            Label labelFalse = new Label();

            unary.getExpression().accept(this);
            methodVisitor.visitJumpInsn(Opcodes.IFNE, labelFalse);

            Label labelEnd = new Label();
            methodVisitor.visitLabel(labelTrue);
            methodVisitor.visitInsn(Opcodes.ICONST_1);
            methodVisitor.visitJumpInsn(Opcodes.GOTO, labelEnd);
            methodVisitor.visitLabel(labelFalse);
            methodVisitor.visitInsn(Opcodes.ICONST_0);

            methodVisitor.visitLabel(labelEnd);

        } else {
            throw new IllegalArgumentException("invalid unary operator");
        }
    }

    @Override
    public void visit(Block block) {
        localVariables.startBlock();
        if (block.getStatementList() != null) {
            block.getStatementList().forEach(statement -> {
                statement.accept(this);
                if (statement instanceof StatementExpressionStatement) {
                    if (!(((StatementExpressionStatement) statement).getStatementExpression().getType() instanceof BaseType) || !Objects.equals(((StatementExpressionStatement) statement).getStatementExpression().getType().getIdentifier(), "void")) {
                        methodVisitor.visitInsn(Opcodes.POP);
                    }
                }
            });
        }

        localVariables.endBlock();
    }

    @Override
    public void visit(IfElseStatement ifElseStatement) {
        Label labelFalse = new Label();
        ifElseStatement.getCondition().accept(this);
        methodVisitor.visitJumpInsn(Opcodes.IFEQ, labelFalse);

        Label labelEnd = new Label();
        ifElseStatement.getIfBlock().accept(this);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, labelEnd);

        methodVisitor.visitLabel(labelFalse);
        if (ifElseStatement.getElseBlock() != null) {
            ifElseStatement.getElseBlock().accept(this);
        }
        methodVisitor.visitLabel(labelEnd);
    }

    @Override
    public void visit(LocalVarDecl localVarDecl) {
        if (localVarDecl.getType() instanceof BaseType) {
            methodVisitor.visitVarInsn(Opcodes.ISTORE, localVariables.push(localVarDecl.getIdentifier()));
        } else {
            methodVisitor.visitVarInsn(Opcodes.ASTORE, localVariables.push(localVarDecl.getIdentifier()));
        }
    }

    @Override
    public void visit(ReturnStatement returnStatement) {
        Expression expression = returnStatement.getExpression();
        if (expression == null) {
            methodVisitor.visitInsn(Opcodes.RETURN);
        } else {
            expression.accept(this);
            if (expression.getType() instanceof BaseType) {
                methodVisitor.visitInsn(Opcodes.IRETURN);
            } else {
                methodVisitor.visitInsn(Opcodes.ARETURN);
            }
        }
    }

    @Override
    public void visit(StatementExpressionStatement statementExpressionStatement) {
        if (statementExpressionStatement.getStatementExpression() instanceof Assign) {
            this.visit((Assign) statementExpressionStatement.getStatementExpression());
        } else if (statementExpressionStatement.getStatementExpression() instanceof New) {
            this.visit((New) statementExpressionStatement.getStatementExpression());
        } else if (statementExpressionStatement.getStatementExpression() instanceof MethodCall) {
            this.visit((MethodCall) statementExpressionStatement.getStatementExpression());
        } else {
            System.out.println("invalid StatementExpressionStatement");
        }
    }

    @Override
    public void visit(WhileStatement whileStatement) {
        Label labelLoop = new Label();
        Label labelEnd = new Label();

        methodVisitor.visitLabel(labelLoop);
        whileStatement.getExpression().accept(this);
        methodVisitor.visitJumpInsn(Opcodes.IFEQ, labelEnd);

        whileStatement.getBlock().accept(this);

        if (!(whileStatement.getExpression().getType() instanceof BaseType) || !Objects.equals(whileStatement.getExpression().getType().getIdentifier(), "void")) {
            methodVisitor.visitInsn(Opcodes.POP);
        }

        methodVisitor.visitJumpInsn(Opcodes.GOTO, labelLoop);
        methodVisitor.visitLabel(labelEnd);
    }

    @Override
    public void visit(Assign assign) {
        InstVar expressionLeft = assign.getAssignLeft();
        Expression expressionRight = assign.getAssignRight();

        if (expressionLeft != null) {
            this.visitInstVar(expressionLeft, false);
            String owner = this.lastClass;
            expressionRight.accept(this);
            methodVisitor.visitInsn(Opcodes.DUP_X1);
            methodVisitor.visitFieldInsn(Opcodes.PUTFIELD, owner, expressionLeft.getIdentifier(), expressionLeft.fieldTypeToDescriptor(expressionLeft.getType()));
        } else {
            throw new NullPointerException("expressionLeft is null");
        }
    }

    @Override
    public void visit(MethodCall methodCall) {
        methodCall.getReceiver().accept(this);
        if (methodCall.getParameterList() != null) {
            methodCall.getParameterList().forEach(parameter -> parameter.accept(this));
        }
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, methodCall.getReceiver().getType().getIdentifier(), methodCall.getIdentifier(), methodCall.returnAndParameterTypeToDescriptor(), false);
        if (methodCall.getType() instanceof ReferenceType) {
            this.lastClass = methodCall.getType().getIdentifier();
        }
    }

    @Override
    public void visit(New aNew) {
        this.lastClass = aNew.getIdentifier();
        methodVisitor.visitTypeInsn(Opcodes.NEW, aNew.getIdentifier());
        methodVisitor.visitInsn(Opcodes.DUP);
        if (aNew.getParameterList() != null) {
            aNew.getParameterList().forEach(expression -> expression.accept(this));
        }
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, aNew.getIdentifier(), "<init>", "()V", false);
    }

    @Override
    public void visit(StatementStmtExpr statementStmtExpr) {
        if (statementStmtExpr.getStatementExpression() instanceof Assign) {
            this.visit((Assign) statementStmtExpr.getStatementExpression());
        } else if (statementStmtExpr.getStatementExpression() instanceof New) {
            this.visit((New) statementStmtExpr.getStatementExpression());
        } else if (statementStmtExpr.getStatementExpression() instanceof MethodCall) {
            this.visit((MethodCall) statementStmtExpr.getStatementExpression());
        } else {
            System.out.println("invalid StatementStatementExpression");
        }
    }

    @Override
    public void visit(ConstructorDecl constructorDecl) {
        methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "<init>", constructorDecl.returnAndParameterTypeToDescriptor(constructorDecl.getParameters()), null, null); // Konstruktor immer public
        methodVisitor.visitCode();

        localVariables.push("this");
        if (constructorDecl.getParameters() != null) {
            constructorDecl.getParameters().forEach(parameter -> localVariables.push(parameter.getIdentifier()));
        }
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        if (constructorDecl.getBlock() != null) {
            constructorDecl.getBlock().accept(this);
        }
        methodVisitor.visitInsn(Opcodes.RETURN);
        methodVisitor.visitMaxs(0, 0);
        methodVisitor.visitEnd();
    }

    @Override
    public void visit(MethodDecl methodDecl) {
        methodVisitor = classWriter.visitMethod(methodDecl.accessModifierToOpcode(methodDecl.getAccessModifier()), methodDecl.getIdentifier(), methodDecl.returnAndParameterTypeToDescriptor(methodDecl.getParameters(), methodDecl.getReturnType()), null, null);
        methodVisitor.visitCode();

        localVariables.push("this");
        if (methodDecl.getParameters() != null) {
            methodDecl.getParameters().forEach(parameter -> localVariables.push(parameter.getIdentifier()));
        }

        methodDecl.getBlock().accept(this);
        if (methodDecl.getReturnType() instanceof BaseType) {
            if (methodDecl.getReturnType().getIdentifier().equals("void")) {
                methodVisitor.visitInsn(Opcodes.RETURN);
            }
        }
        methodVisitor.visitMaxs(0, 0);
        methodVisitor.visitEnd();
    }

    @Override
    public void visit(MyMain myMain) {
        methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
        methodVisitor.visitCode();

        localVariables.push("this");
        localVariables.push("+args");

        myMain.getBlock().accept(this);
        methodVisitor.visitInsn(Opcodes.RETURN);
        methodVisitor.visitMaxs(0, 0);
        methodVisitor.visitEnd();
    }

    @Override
    public void visit(Sysout sysout) {
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        sysout.getExpr().accept(this);
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
    }

    public void visitInstVar(InstVar instVar, boolean getField) {
        Expression expression = instVar.getExpression();
        expression.accept(this);
        if (expression.getType() != null) {
            this.lastClass = expression.getType().getIdentifier();
        }
        if (getField) {
            if (instVar.getStatic()) {
                methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, this.lastClass, instVar.getIdentifier(), instVar.fieldTypeToDescriptor(instVar.getType()));
            } else {
                methodVisitor.visitFieldInsn(Opcodes.GETFIELD, this.lastClass, instVar.getIdentifier(), instVar.fieldTypeToDescriptor(instVar.getType()));
            }
        }
    }
}
