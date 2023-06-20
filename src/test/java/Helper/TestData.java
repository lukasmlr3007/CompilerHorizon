package Helper;

import syntax.common.AccessModifier;
import syntax.common.BaseType;
import syntax.expression.Expression;
import syntax.expression.InstVar;
import syntax.expression.IntegerLiteral;
import syntax.expression.This;
import syntax.statement.Block;
import syntax.statement.ReturnStatement;
import syntax.statementexpression.Assign;
import syntax.statementexpression.MethodCall;
import syntax.statementexpression.StatementExpression;
import syntax.statementexpression.StatementStmtExpr;
import syntax.structure.*;

import java.util.*;

public class TestData {

    private static Block getEmptyBlock() {
        Block block = new Block();
        block.setStatementList(new ArrayList<>());
        return block;
    }

    public static Program getProgrammWithEmptyClass(String identifier) {

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), identifier, null);
        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);
    }

    public static Program getEmptyClassWithConstructor(String identifier) {

        ArrayList<ConstructorDecl> constructors = new ArrayList<>();
        ConstructorDecl constructorDecl = new ConstructorDecl(new ArrayList<>(), getEmptyBlock());
        constructors.add(constructorDecl);

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), constructors, identifier, null);
        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);
    }

    public static Program getEmptyClassWithConstructorAndParameter(String identifier) {

        Vector<ConstructorDecl> constructors = new Vector<>();

        List<ParameterDecl> parameters = Arrays.asList(new ParameterDecl("wert", BaseType.INT), new ParameterDecl("werte", BaseType.INT));
        ConstructorDecl constructorDecl = new ConstructorDecl(parameters, getEmptyBlock());

        constructors.add(constructorDecl);

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), constructors, identifier, null);
        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);
    }

    public static Program getClassWithFields(String identifier) {

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), identifier, null);

        FieldDecl privateField = new FieldDecl("privateAccess", AccessModifier.PRIVATE, BaseType.INT);
        FieldDecl publicField = new FieldDecl("publicAccess", AccessModifier.PUBLIC, BaseType.INT);
        FieldDecl protectedField = new FieldDecl("protectedAccess", AccessModifier.PROTECTED, BaseType.INT);

        classDecl.getFieldDeclList().addAll(Arrays.asList(privateField, publicField, protectedField));

        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);
    }

    public static Program getClassWithVoidMethod(String identifier) {

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), identifier, null);

        MethodDecl methodDecl = new MethodDecl();
        methodDecl.setIdentifier("test");
        methodDecl.setReturnType(BaseType.VOID);
        methodDecl.setParameters(Collections.emptyList());
        methodDecl.setBlock(getEmptyBlock());
        methodDecl.setAccessModifier(AccessModifier.PUBLIC);

        classDecl.getMethodDeclList().add(methodDecl);

        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);
    }

    public static Program getSimpleIntMethod(String identifier) {

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), identifier, null);

        Block block = new Block();
        ReturnStatement returnStatement = new ReturnStatement();
        Expression expression = new IntegerLiteral(42);
        returnStatement.setExpression(expression);
        block.setStatementList(Collections.singletonList(returnStatement));

        MethodDecl methodDecl = new MethodDecl();
        methodDecl.setIdentifier("calledMethod");
        methodDecl.setReturnType(BaseType.INT);
        methodDecl.setParameters(Collections.emptyList());
        methodDecl.setBlock(block);
        methodDecl.setAccessModifier(AccessModifier.PUBLIC);
        classDecl.getMethodDeclList().add(methodDecl);

        FieldDecl fieldDecl = new FieldDecl();
        fieldDecl.setIdentifier("myValue");
        fieldDecl.setAccessModifier(AccessModifier.PUBLIC);
        fieldDecl.setType(BaseType.INT);
        classDecl.getFieldDeclList().add(fieldDecl);

        Block block1 = new Block();
        StatementStmtExpr statementStmtExpr = new StatementStmtExpr();
        Assign assign = new Assign();
        InstVar instVar = new InstVar();
        instVar.setIdentifier("myValue");
        instVar.setExpression(new This());
        assign.setAssignLeft(instVar);
        MethodCall methodCall = new MethodCall();
        methodCall.setIdentifier("calledMethod");
        methodCall.setParameterList(new ArrayList<>());
        methodCall.setReceiver(new This());
        assign.setAssignRight(methodCall);
        statementStmtExpr.setStatementExpression(assign);
        block1.setStatementList(Collections.singletonList(statementStmtExpr));

        ConstructorDecl constructorDecl = new ConstructorDecl(new ArrayList<>(), block1);
        classDecl.getConstructorDeclList().add(constructorDecl);


        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);

    }
}
