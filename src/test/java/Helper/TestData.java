package Helper;

import syntax.common.AccessModifier;
import syntax.common.BaseType;
import syntax.common.Operator;
import syntax.expression.*;
import syntax.statement.Block;
import syntax.statement.IfElseStatement;
import syntax.statement.ReturnStatement;
import syntax.statement.WhileStatement;
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

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), identifier, null, null);
        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);
    }

    public static Program getEmptyClassWithConstructor(String identifier) {

        ArrayList<ConstructorDecl> constructors = new ArrayList<>();
        ConstructorDecl constructorDecl = new ConstructorDecl(new ArrayList<>(), getEmptyBlock(), null);
        constructors.add(constructorDecl);

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), constructors, identifier, null, null);
        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);
    }

    public static Program getEmptyClassWithConstructorAndParameter(String identifier) {

        Vector<ConstructorDecl> constructors = new Vector<>();

        List<ParameterDecl> parameters = Arrays.asList(new ParameterDecl("wert", BaseType.INT), new ParameterDecl("werte", BaseType.INT));
        ConstructorDecl constructorDecl = new ConstructorDecl(parameters, getEmptyBlock(), null);

        constructors.add(constructorDecl);

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), constructors, identifier, null, null);
        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);
    }

    public static Program getClassWithFields(String identifier) {

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), identifier, null, null);

        FieldDecl privateField = new FieldDecl("privateAccess", AccessModifier.PRIVATE, BaseType.INT, false);
        FieldDecl publicField = new FieldDecl("publicAccess", AccessModifier.PUBLIC, BaseType.INT, false);
        FieldDecl protectedField = new FieldDecl("protectedAccess", AccessModifier.PROTECTED, BaseType.INT, false);

        classDecl.getFieldDeclList().addAll(Arrays.asList(privateField, publicField, protectedField));

        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);
    }

    public static Program getClassWithVoidMethod(String identifier) {

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), identifier, null, null);

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

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), identifier, null, null);

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

        ConstructorDecl constructorDecl = new ConstructorDecl(new ArrayList<>(), block1, null);
        classDecl.getConstructorDeclList().add(constructorDecl);


        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);

    }

    public static Program getConstructorWithThisAssign(String identifier) {

        Vector<ConstructorDecl> constructors = new Vector<>();

        Block block = new Block();
        StatementStmtExpr stm1 = new StatementStmtExpr();
        Assign assign = new Assign();
        InstVar instVar = new InstVar();
        instVar.setExpression(new This());
        instVar.setIdentifier("aa");
        instVar.setMyStatic(false);
        assign.setAssignLeft(instVar);
        LocalOrFieldVar localOrFieldVar = new LocalOrFieldVar();
        localOrFieldVar.setIdentifier("aan");
        assign.setAssignRight(localOrFieldVar);
        stm1.setStatementExpression(assign);
        Assign assign2 = new Assign();
        InstVar instVar2 = new InstVar();
        instVar2.setExpression(new This());
        instVar2.setIdentifier("bb");
        instVar2.setMyStatic(false);
        assign2.setAssignLeft(instVar2);
        LocalOrFieldVar localOrFieldVar2 = new LocalOrFieldVar();
        localOrFieldVar2.setIdentifier("bbn");
        assign2.setAssignRight(localOrFieldVar2);
        StatementStmtExpr stm2 = new StatementStmtExpr();
        stm2.setStatementExpression(assign2);
        block.setStatementList(List.of(stm1, stm2));

        List<ParameterDecl> parameters = Arrays.asList(new ParameterDecl("aan", BaseType.INT), new ParameterDecl("bbn", BaseType.INT));
        ConstructorDecl constructorDecl = new ConstructorDecl(parameters, block, null);

        constructors.add(constructorDecl);

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), constructors, identifier, null, null);
        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        FieldDecl fieldDecl = new FieldDecl();
        fieldDecl.setIdentifier("aa");
        fieldDecl.setAccessModifier(AccessModifier.PRIVATE);
        fieldDecl.setType(BaseType.INT);
        classDecl.getFieldDeclList().add(fieldDecl);

        FieldDecl fieldDecl2 = new FieldDecl();
        fieldDecl2.setIdentifier("bb");
        fieldDecl2.setAccessModifier(AccessModifier.PRIVATE);
        fieldDecl2.setType(BaseType.INT);
        classDecl.getFieldDeclList().add(fieldDecl2);

        return new Program(cl);

    }

    public static Program getConstructorWithAssign(String identifier) {

        This mythis = new This();

        Vector<ConstructorDecl> constructors = new Vector<>();

        Block block = new Block();
        StatementStmtExpr stm1 = new StatementStmtExpr();
        Assign assign = new Assign();
        InstVar instVar = new InstVar();
        instVar.setExpression(mythis);
        instVar.setIdentifier("aa");
        instVar.setMyStatic(false);
        assign.setAssignLeft(instVar);
        IntegerLiteral integerLiteral = new IntegerLiteral();
        integerLiteral.setValue(2);
        assign.setAssignRight(integerLiteral);
        stm1.setStatementExpression(assign);
        Assign assign2 = new Assign();
        InstVar instVar2 = new InstVar();
        instVar2.setExpression(mythis);
        instVar2.setIdentifier("bb");
        instVar2.setMyStatic(false);
        assign2.setAssignLeft(instVar2);
        IntegerLiteral localOrFieldVar2 = new IntegerLiteral();
        localOrFieldVar2.setValue(3);
        assign2.setAssignRight(localOrFieldVar2);
        StatementStmtExpr stm2 = new StatementStmtExpr();
        stm2.setStatementExpression(assign2);
        block.setStatementList(List.of(stm1, stm2));

        List<ParameterDecl> parameters = Arrays.asList(new ParameterDecl("aan", BaseType.INT), new ParameterDecl("bbn", BaseType.INT));
        ConstructorDecl constructorDecl = new ConstructorDecl(parameters, block, null);

        constructors.add(constructorDecl);

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), constructors, identifier, null, null);
        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        FieldDecl fieldDecl = new FieldDecl();
        fieldDecl.setIdentifier("aa");
        fieldDecl.setAccessModifier(AccessModifier.PRIVATE);
        fieldDecl.setType(BaseType.INT);
        classDecl.getFieldDeclList().add(fieldDecl);

        FieldDecl fieldDecl2 = new FieldDecl();
        fieldDecl2.setIdentifier("bb");
        fieldDecl2.setAccessModifier(AccessModifier.PRIVATE);
        fieldDecl2.setType(BaseType.INT);
        classDecl.getFieldDeclList().add(fieldDecl2);

        return new Program(cl);

    }

    public static Program getIfElseInConstructor(String identifier) {

        Block block = new Block();

        StatementStmtExpr statementStmtExpr = new StatementStmtExpr();
        Assign assign = new Assign();
        InstVar instVar = new InstVar();
        instVar.setExpression(new This());
        instVar.setIdentifier("ast");
        instVar.setMyStatic(false);
        assign.setAssignLeft(instVar);
        IntegerLiteral integerLiteral = new IntegerLiteral();
        integerLiteral.setValue(4);
        assign.setAssignRight(integerLiteral);
        statementStmtExpr.setStatementExpression(assign);

        IfElseStatement ifElseStatement = new IfElseStatement();
        RelationalExpression relationalExpression = new RelationalExpression();
        relationalExpression.setOperator("==");
        LocalOrFieldVar localOrFieldVar = new LocalOrFieldVar();
        localOrFieldVar.setIdentifier("ast");
        relationalExpression.setExpressionLeft(localOrFieldVar);
        IntegerLiteral integerLiteral1 = new IntegerLiteral();
        integerLiteral1.setValue(5);
        relationalExpression.setExpressionRight(integerLiteral1);
        ifElseStatement.setCondition(relationalExpression);
        Block block1 = new Block();
        block1.setStatementList(new ArrayList<>());
        ifElseStatement.setIfBlock(block1);
        Block block2 = new Block();
        block2.setStatementList(new ArrayList<>());
        ifElseStatement.setElseBlock(block2);

        block.setStatementList(List.of(statementStmtExpr, ifElseStatement));

        ArrayList<ConstructorDecl> constructors = new ArrayList<>();
        ConstructorDecl constructorDecl = new ConstructorDecl(new ArrayList<>(), block, null);
        constructors.add(constructorDecl);

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), constructors, identifier, null, null);
        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        FieldDecl fieldDecl = new FieldDecl();
        fieldDecl.setIdentifier("ast");
        fieldDecl.setAccessModifier(AccessModifier.PUBLIC);
        fieldDecl.setType(BaseType.INT);
        classDecl.getFieldDeclList().add(fieldDecl);

        return new Program(cl);

    }

    public static Program getEmptyClassWithStaticField(String identifier) {

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), identifier, null, null);

        FieldDecl privateField = new FieldDecl("staticField", AccessModifier.PUBLIC, BaseType.INT, true);

        classDecl.getFieldDeclList().add(privateField);

        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);

    }

    public static Program getEmptyClassWithStaticMethod(String identifier) {

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), identifier, null, null);

        MethodDecl methodDecl = new MethodDecl();
        methodDecl.setIdentifier("test");
        methodDecl.setStaticModifier(true);
        methodDecl.setReturnType(BaseType.VOID);
        methodDecl.setParameters(Collections.emptyList());
        methodDecl.setBlock(getEmptyBlock());
        methodDecl.setAccessModifier(AccessModifier.PUBLIC);

        classDecl.getMethodDeclList().add(methodDecl);

        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);

    }

    public static Program getWhileInConstructor(String identifier) {

        ClassDecl classDecl = new ClassDecl(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), identifier, null, null);

        FieldDecl fieldDecl = new FieldDecl();
        fieldDecl.setIdentifier("counter");
        fieldDecl.setAccessModifier(AccessModifier.PUBLIC);
        fieldDecl.setType(BaseType.INT);
        classDecl.getFieldDeclList().add(fieldDecl);

        Block block = new Block();

        StatementStmtExpr statementStmtExpr = new StatementStmtExpr();
        Assign assign = new Assign();
        InstVar instVar = new InstVar();
        instVar.setExpression(new This());
        instVar.setIdentifier("counter");
        instVar.setMyStatic(false);
        assign.setAssignLeft(instVar);
        IntegerLiteral integerLiteral = new IntegerLiteral();
        integerLiteral.setValue(10);
        assign.setAssignRight(integerLiteral);
        statementStmtExpr.setStatementExpression(assign);

        WhileStatement whileStatement = new WhileStatement();
        RelationalExpression relationalExpression = new RelationalExpression();
        relationalExpression.setOperator(">");
        LocalOrFieldVar localOrFieldVar = new LocalOrFieldVar();
        localOrFieldVar.setIdentifier("counter");
        relationalExpression.setExpressionLeft(localOrFieldVar);
        IntegerLiteral integerLiteral1 = new IntegerLiteral();
        integerLiteral1.setValue(0);
        LocalOrFieldVar localOrFieldVar1 = new LocalOrFieldVar();
        localOrFieldVar1.setIdentifier("counter");
        relationalExpression.setExpressionRight(integerLiteral1);
        relationalExpression.setExpressionLeft(localOrFieldVar1);
        Block block1 = new Block();
        StatementStmtExpr statementStmtExpr1 = new StatementStmtExpr();
        Assign assign1 = new Assign();
        InstVar instVar1 = new InstVar();
        instVar1.setExpression(new This());
        instVar1.setIdentifier("counter");
        instVar1.setMyStatic(false);
        assign1.setAssignLeft(instVar1);
        AdditiveExpression additiveExpression = new AdditiveExpression();
        additiveExpression.setOperator("-");
        InstVar instVar2 = new InstVar();
        instVar2.setExpression(new This());
        instVar2.setIdentifier("counter");
        additiveExpression.setExpressionLeft(instVar2);
        IntegerLiteral integerLiteral2 = new IntegerLiteral();
        integerLiteral2.setValue(1);
        additiveExpression.setExpressionRight(integerLiteral2);
        assign1.setAssignRight(additiveExpression);
        statementStmtExpr1.setStatementExpression(assign1);
        block1.setStatementList(List.of(statementStmtExpr1));
        whileStatement.setCondition(relationalExpression);
        whileStatement.setBlock(block1);


        block.setStatementList(List.of(statementStmtExpr, whileStatement));

        ConstructorDecl constructorDecl = new ConstructorDecl(new ArrayList<>(), block, null);
        classDecl.getConstructorDeclList().add(constructorDecl);

        List<ClassDecl> cl = new ArrayList<>();
        cl.add(classDecl);

        return new Program(cl);

    }
}
