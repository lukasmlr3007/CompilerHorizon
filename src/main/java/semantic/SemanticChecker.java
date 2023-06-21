package semantic;

import lombok.Getter;
import semantic.context.ClassContext;
import semantic.context.MethodContext;
import semantic.context.ProgramContext;
import semantic.exception.*;
import syntax.common.AccessModifier;
import syntax.common.BaseType;
import syntax.common.ReferenceType;
import syntax.common.Type;
import syntax.expression.*;
import syntax.statement.*;
import syntax.statementexpression.Assign;
import syntax.statementexpression.MethodCall;
import syntax.statementexpression.New;
import syntax.statementexpression.StatementStmtExpr;
import syntax.structure.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

@Getter
public class SemanticChecker implements ISemanticVisitor {

    private ProgramContext context;

    private Stack<HashMap<String, Type>> currentLocalScope;

    private ClassDecl currentClass;

    private MethodDecl currentMethod;

    private final List<Exception> errors = new ArrayList<>();

    // expressions

    @Override
    public TypeCheckResult check(AdditiveExpression additiveExpr) {

        boolean isValid = true;

        TypeCheckResult leftResult = additiveExpr.getExpressionLeft().accept(this);
        TypeCheckResult rightResult = additiveExpr.getExpressionRight().accept(this);

        // TODO add additive expression check

        isValid = isValid && leftResult.isValid() && rightResult.isValid();

        return new TypeCheckResult(isValid, leftResult.getType());    }

    @Override
    public TypeCheckResult check(BoolLiteral boolLiteral) {
        return new TypeCheckResult(true, boolLiteral.getType());
    }

    @Override
    public TypeCheckResult check(CharLiteral charLiteral) {
        return new TypeCheckResult(true, charLiteral.getType());
    }

    @Override
    public TypeCheckResult check(InstVar instVar) {

        boolean isValid = true;
        TypeCheckResult result = instVar.getExpression().accept(this);
        Type type = result.getType();

        if (type instanceof BaseType) {
            errors.add(new TypeMismatchException("Type " + type.getIdentifier() + " is a BaseType and has no instance variables!"));
            isValid = false;
        }

        if (type instanceof ReferenceType) {
            ClassContext classContext = context.getClassContext(type.getIdentifier());
            if (!classContext.hasVariable(instVar.getIdentifier())) {
                errors.add(new TypeMismatchException("Type " + type.getIdentifier() + " has no instance variable " + instVar.getIdentifier() + "!"));
                isValid = false;
            }
            /*else if (classContext.getVariable(instVar.getIdentifier()).get == AccessModifier.PRIVATE) { TODO implement private field check
                errors.add(new NotVisibleException("Method " + methodCall.getIdentifier() + " has a PRIVATE access modifier!"));
                isValid = false;
            }*/
            else {
                instVar.setType(classContext.getVariable(instVar.getIdentifier()));
            }
        }

        return new TypeCheckResult(isValid, instVar.getType());
    }

    @Override
    public TypeCheckResult check(IntegerLiteral integerLiteral) {
        return new TypeCheckResult(true, integerLiteral.getType());
    }

    @Override
    public TypeCheckResult check(LocalOrFieldVar localOrFieldVar) {

        boolean isValid = true;

        ClassContext classContext = context.getClassContext(currentClass.getIdentifier());

        if (classContext.hasVariable(localOrFieldVar.getIdentifier())) {
            localOrFieldVar.setType(classContext.getVariable(localOrFieldVar.getIdentifier()));
        }
        else if (TypeHelper.hasTypeOfVariable(localOrFieldVar.getIdentifier(), currentLocalScope)) {
            localOrFieldVar.setType(TypeHelper.getTypeOfVariable(localOrFieldVar.getIdentifier(), currentLocalScope));
        }
        else {
            errors.add(new FieldNotFoundException("Variable " + localOrFieldVar.getIdentifier() + " not found!"));
            isValid = false;
        }

        return new TypeCheckResult(isValid, localOrFieldVar.getType());
    }

    @Override
    public TypeCheckResult check(LogicalExpression logicalExpr) {

        boolean isValid = true;

        TypeCheckResult leftResult = logicalExpr.getExpressionLeft().accept(this);
        TypeCheckResult rightResult = logicalExpr.getExpressionRight().accept(this);

        // TODO add logical expression check

        isValid = isValid && leftResult.isValid() && rightResult.isValid();

        return new TypeCheckResult(isValid, leftResult.getType());
    }

    @Override
    public TypeCheckResult check(NullLiteral nullExpr) {
        return new TypeCheckResult(true, null);
    }

    @Override
    public TypeCheckResult check(RelationalExpression relationalExpr) {

        boolean isValid = true;

        TypeCheckResult leftResult = relationalExpr.getExpressionLeft().accept(this);
        TypeCheckResult rightResult = relationalExpr.getExpressionRight().accept(this);

        // TODO add relational expression check

        isValid = isValid && leftResult.isValid() && rightResult.isValid();

        return new TypeCheckResult(isValid, leftResult.getType());
    }

    @Override
    public TypeCheckResult check(StatementExpressionExpression stmtExprExpr) {
        return null; // ignore
    }

    @Override
    public TypeCheckResult check(This thisExpr) {
        thisExpr.setType(currentClass.getType());
        return new TypeCheckResult(true, thisExpr.getType());
    }

    @Override
    public TypeCheckResult check(Unary unaryExpr) {
        return null; // ignore
    }

    // statements

    /**
     *
     * @param block
     * @return
     */
    @Override
    public TypeCheckResult check(Block block) {

        boolean isValid = true;
        Type returnType = null;

        if (block.getStatementList() == null) return new TypeCheckResult(true, BaseType.VOID);

        currentLocalScope.push(new HashMap<>());

        for (Statement statement : block.getStatementList()) {
            TypeCheckResult result = statement.accept(this);
            isValid = isValid && result.isValid();

            if (statement instanceof ReturnStatement) {
                if (returnType == null) returnType = result.getType();
                else if (!returnType.equals(result.getType())) {
                    errors.add(new TypeMismatchException("Return types mismatch! " + returnType + " != " + result.getType()));
                    isValid = false;
                }
            }
        }

        if (returnType == null) returnType = BaseType.VOID;
        currentLocalScope.pop();

        return new TypeCheckResult(isValid, returnType);
    }

    @Override
    public TypeCheckResult check(IfElseStatement ifElseStmt) {

        boolean isValid = true;
        TypeCheckResult result = ifElseStmt.getCondition().accept(this);
        isValid = ifElseStmt.getCondition().accept(this).isValid();

        if (!TypeHelper.isBoolean(result.getType())) {
            errors.add(new TypeMismatchException("If-Statement expected condition of type " + BaseType.BOOLEAN + " but got " + result.getType()));
            isValid = false;
        }

        isValid = isValid && ifElseStmt.getIfBlock().accept(this).isValid()
                && ifElseStmt.getElseBlock().accept(this).isValid();

        return new TypeCheckResult(isValid, ifElseStmt.getType());
    }

    @Override
    public TypeCheckResult check(LocalVarDecl localVarDecl) {

        boolean isValid = true;

        if (TypeHelper.doesTypeExist(localVarDecl.getType(), context)) {
            errors.add(new TypeUnknownException("Type " + localVarDecl.getType() + " not found"));
            isValid = false;
        }

        return new TypeCheckResult(isValid, localVarDecl.getType());
    }

    @Override
    public TypeCheckResult check(ReturnStatement returnStmt) {

        boolean isValid = true;

        TypeCheckResult result = returnStmt.getExpression().accept(this);
        returnStmt.setType(result.getType());
        isValid = isValid && result.isValid();

        if (!currentMethod.getReturnType().equals(result.getType())) {
            errors.add(new TypeMismatchException("Return types mismatch! Expected " + currentMethod.getReturnType() + " but got " + result.getType() + "!"));
            isValid = false;
        }

        return new TypeCheckResult(isValid, returnStmt.getType());
    }

    @Override
    public TypeCheckResult check(StatementExpressionStatement stmtExprStmt) {
        return null; // ignore
    }

    @Override
    public TypeCheckResult check(Sysout sysout) {

        boolean isValid = true;
        if (sysout.getExpression() != null) {
            TypeCheckResult result = sysout.getExpression().accept(this);
            isValid = isValid && result.isValid();
        }

        return new TypeCheckResult(isValid, BaseType.VOID);
    }

    @Override
    public TypeCheckResult check(WhileStatement whileStmt) {

        boolean isValid = true;

        TypeCheckResult resultExpr = whileStmt.getCondition().accept(this);

        if (!resultExpr.getType().equals(BaseType.BOOLEAN)) {
            errors.add(new TypeMismatchException("While-Statement expected condition of type " + BaseType.BOOLEAN + " but got " + resultExpr.getType()));
            isValid = false;
        }
        else {
            TypeCheckResult resultBlock = whileStmt.getBlock().accept(this);
            whileStmt.setType(resultBlock.getType());
            isValid = isValid && resultExpr.isValid() && resultBlock.isValid();
        }

        return new TypeCheckResult(isValid, whileStmt.getType());
    }

    // statement expressions

    @Override
    public TypeCheckResult check(Assign assign) {

        boolean isValid = true;
        TypeCheckResult resultLeft = assign.getAssignLeft().accept(this);
        TypeCheckResult resultRight = assign.getAssignRight().accept(this);
        isValid = isValid && resultLeft.isValid() && resultRight.isValid();

        if (!resultLeft.getType().equals(resultRight.getType())) {
            errors.add(new TypeMismatchException("Assign expected type " + resultLeft.getType() + " but got " + resultRight.getType()));
            isValid = false;
        }

        return new TypeCheckResult(isValid, BaseType.VOID);
    }

    /**
     *
     * @param methodCall
     * @return
     */
    @Override
    public TypeCheckResult check(MethodCall methodCall) {

        Type returnType = null;
        Expression receiver = methodCall.getReceiver();
        boolean isValid = receiver.accept(this).isValid();

        for (PartExpression methodParameter : methodCall.getParameterList()) {
            isValid = isValid && methodParameter.accept(this).isValid();
        }

        // check if method exists in class context
        MethodContext methodContext = TypeHelper.getMethodInType(methodCall, receiver.getType(), context);
        if (methodContext == null) {
            errors.add(new TypeUnknownException("Method " + methodCall.getIdentifier() + " not found in type " + receiver.getType().toString()));
            isValid = false;
        }
        else if (methodContext.getAccessModifier() == AccessModifier.PRIVATE) {
            errors.add(new NotVisibleException("Method " + methodCall.getIdentifier() + " has a PRIVATE access modifier!"));
            isValid = false;
        }
        else {
            returnType = methodContext.getReturnType();
        }
        methodCall.setType(returnType);
        return new TypeCheckResult(isValid, returnType);
    }

    @Override
    public TypeCheckResult check(New newStmtExpr) {

        boolean isValid = true;
        Type type = new ReferenceType(newStmtExpr.getIdentifier());

        // check if class exists in program context
        if (!TypeHelper.doesTypeExist(type, context)) {
            errors.add(new TypeUnknownException("Class " + newStmtExpr.getIdentifier() + " not found in program context"));
            isValid = false;
        }
        newStmtExpr.setType(type);

        for (Expression parameter : newStmtExpr.getParameterList()) {
            isValid = isValid && parameter.accept(this).isValid();
        }

        ClassContext classContext = context.getClassContext(type.getIdentifier());

        if (classContext != null) {
            if (!classContext.hasConstructor(newStmtExpr.getParameterList())) {
                errors.add(new TypeUnknownException("Constructor for class " + type.toString() + " with parameters " + newStmtExpr.getParameterList() + " not found"));
                isValid = false;
            }
        }
        else {
            errors.add(new TypeUnknownException("Type " + type.toString() + " is unknown!"));
            isValid = false;
        }

        return new TypeCheckResult(isValid, type);
    }

    public TypeCheckResult check(StatementStmtExpr statementStmtExpr) {
        return statementStmtExpr.getStatementExpression().accept(this);
    }

    // structures

    /**
     *
     * @param classDecl
     * @return
     */
    @Override
    public TypeCheckResult check(ClassDecl classDecl) {

        boolean isValid = true;

        classDecl.setType(new ReferenceType(classDecl.getIdentifier()));
        currentClass = classDecl;

        // check field declarations
        if (classDecl.getFieldDeclList() != null) {
            HashMap<String, Type> fieldMap = new HashMap<>();
            for (FieldDecl fieldDecl : classDecl.getFieldDeclList()) {
                TypeCheckResult result = fieldDecl.accept(this);
                if (fieldMap.containsKey(fieldDecl.getIdentifier())) {
                    errors.add(new AlreadyDefinedException("Field " + fieldDecl.getIdentifier() + " already defined in class " + classDecl.getIdentifier()));
                    isValid = false;
                }
                fieldMap.put(fieldDecl.getIdentifier(), result.getType());
                isValid = isValid && result.isValid();
            }
        }

        // check method declarations
        if (classDecl.getMethodDeclList() != null) {
            List<MethodDecl> methodDeclList = new ArrayList<>();
            for (MethodDecl methodDecl : classDecl.getMethodDeclList()) {
                TypeCheckResult result = methodDecl.accept(this);

                for (MethodDecl methodDecl2 : methodDeclList) {
                    if (methodDecl2.getIdentifier().equals(methodDecl.getIdentifier())) {
                        if (TypeHelper.isSameParameters(methodDecl.getParameters(), methodDecl2.getParameters())) {
                            errors.add(new AlreadyDefinedException("Method " + methodDecl.getIdentifier() + " already defined in class " + classDecl.getIdentifier()));
                            isValid = false;
                        }
                    }
                }
                methodDeclList.add(methodDecl);
                isValid = isValid && result.isValid();
            }
        }

        // check constructor declarations
        if (classDecl.getConstructorDeclList() != null) {
            if (classDecl.getConstructorDeclList().isEmpty()) {
                // add new constructor if not set
                ConstructorDecl newConstructorDecl = new ConstructorDecl();
                isValid = isValid && newConstructorDecl.accept(this).isValid();
                classDecl.getConstructorDeclList().add(newConstructorDecl); // TODO setze ich constructors?!
            }
            else for (ConstructorDecl constructorDecl : classDecl.getConstructorDeclList()) {
                boolean isConstructorValid = constructorDecl.accept(this).isValid();
                isValid = isValid && isConstructorValid;
            }
        }
        classDecl.setType(new ReferenceType(classDecl.getIdentifier()));
        return new TypeCheckResult(isValid, new ReferenceType(classDecl.getIdentifier()));
    }

    /**
     *
     * @param constructorDecl
     * @return
     */
    @Override
    public TypeCheckResult check(ConstructorDecl constructorDecl) {

        boolean isValid = true;

        // TODO implement context check

        // check constructor parameters
        if (constructorDecl.getParameters() != null) {
            for (ParameterDecl parameter : constructorDecl.getParameters()) {
                isValid = isValid && parameter.accept(this).isValid();
            }
        }
        // check block
        if (constructorDecl.getBlock() != null) {
            TypeCheckResult result = constructorDecl.getBlock().accept(this);
            isValid = isValid && result.isValid();
        }
        return new TypeCheckResult(isValid, BaseType.VOID);
    }


    /**
     *
     * @param fieldDecl
     * @return
     */
    @Override
    public TypeCheckResult check(FieldDecl fieldDecl) {

        boolean isValid = true;

        // TODO implement check if field is already declared in class

        isValid = isValid && TypeHelper.doesTypeExist(fieldDecl.getType(), context);

        return new TypeCheckResult(isValid, fieldDecl.getType());
    }

    /**
     *
     * @param methodDecl
     * @return
     */
    @Override
    public TypeCheckResult check(MethodDecl methodDecl) {

        boolean isValid = true;
        currentMethod = methodDecl;

        // checks, if two methods with same name & parameter length are identical
        for (MethodDecl classMethod : currentClass.getMethodDeclList()) {
            if (methodDecl.equals(classMethod)) continue;
            else if (methodDecl.getIdentifier().equals(classMethod.getIdentifier()) &&
                    methodDecl.getParameters().size() == classMethod.getParameters().size()) {

                boolean hasSameParameters = true;
                for (int i = 0; i < methodDecl.getParameters().size(); i++) {
                    if (!methodDecl.getParameters().get(i).getType().equals(classMethod.getParameters().get(i).getType())) {
                        hasSameParameters = false;
                        break;
                    }
                }
                if (hasSameParameters) {
                    errors.add(new AlreadyDefinedException("Method " + methodDecl.getIdentifier() + " is already defined!"));
                    isValid = false;
                }
            }
        }

        for (ParameterDecl methodParameter : methodDecl.getParameters()) {
            isValid = isValid && methodParameter.accept(this).isValid();
            // TODO add to method context
        }

        TypeCheckResult blockResult = methodDecl.getBlock().accept(this);
        isValid = isValid && blockResult.isValid();

        // check if return type is correct
        Type returnType = null;
        if (blockResult.getType() == null) returnType = BaseType.VOID;
        else returnType = blockResult.getType();

        if (methodDecl.getReturnType() != returnType) {
            errors.add(new TypeMismatchException("Method " + methodDecl.getIdentifier() + " returns the incorrect type!"));
            isValid = false;
        }
        return new TypeCheckResult(isValid, returnType);
    }

    @Override
    public TypeCheckResult check(MyMain myMain) {

        boolean isValid = true;
        isValid = isValid && myMain.getBlock().accept(this).isValid();

        return new TypeCheckResult(true, BaseType.VOID);
    }

    /**
     *
     * @param parameterDecl
     * @return
     */
    @Override
    public TypeCheckResult check(ParameterDecl parameterDecl) {
        if (TypeHelper.doesTypeExist(parameterDecl.getType(), context)) {
            return new TypeCheckResult(true, parameterDecl.getType());
        }
        else {
            errors.add(new TypeUnknownException("Type " + parameterDecl.getType() + " is unknown!"));
            return new TypeCheckResult(false, parameterDecl.getType());
        }
    }

    /**
     *
     * @param program
     * @return
     */
    @Override
    public TypeCheckResult check(Program program) {

        boolean isValid = true;

        // initialize program variables
        context = new ProgramContext();
        context.setProgram(program);
        currentLocalScope = new Stack<>();

        for (ClassDecl classDecl : program.getClassDeclarations()) {
            isValid = isValid && classDecl.accept(this).isValid();
        }

        // TODO hier fehlt noch was
        return new TypeCheckResult(isValid, BaseType.VOID);
    }
}
