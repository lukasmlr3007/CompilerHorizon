package semantic;

import semantic.context.ClassContext;
import semantic.context.MethodContext;
import semantic.context.ProgramContext;
import syntax.common.BaseType;
import syntax.common.ReferenceType;
import syntax.common.Type;
import syntax.expression.PartExpression;
import syntax.statementexpression.MethodCall;
import syntax.statementexpression.New;
import syntax.structure.MethodDecl;
import syntax.structure.ParameterDecl;

import java.util.Collections;
import java.util.List;

public class TypeHelper {

    public static boolean doesTypeExist(Type type, ProgramContext context) {

        if (type instanceof BaseType) return true;
        else return context.hasClassContext(type.getIdentifier());
    }

    public static boolean doesConstructorExist(New newStmtExpr, ProgramContext context) {

        if (newStmtExpr.getType() instanceof BaseType || !doesTypeExist(newStmtExpr.getType(), context)) {
            return false;
        }

        ClassContext classContext = context.getClassContext(newStmtExpr.getType().getIdentifier());
        if (classContext != null) {
            return classContext.hasConstructor(newStmtExpr.getParameterList());
        }
        return false;
    }

    public static List<MethodContext> getMethodsInType(String identifier, Type type, ProgramContext context) {

        if (type instanceof ReferenceType && doesTypeExist(type, context)) {
            ClassContext classContext = context.getClassContext(type.getIdentifier());
            if (classContext != null && classContext.hasMethod(identifier)) {
                return classContext.getMethod(identifier);
            }
        }
        return Collections.emptyList();
    }

    public static MethodContext getMethodInType(MethodCall methodCall, Type type, ProgramContext context) {

        if (type instanceof ReferenceType && doesTypeExist(type, context)) {
            ClassContext classContext = context.getClassContext(type.getIdentifier());

            if (classContext != null && classContext.hasMethod(methodCall.getIdentifier())) {

                List<PartExpression> parameterDecls = methodCall.getParameterList();
                List<MethodContext> methodContexts = classContext.getMethod(methodCall.getIdentifier());

                for (MethodContext methodContext : methodContexts) {
                    if (methodContext.getParameters().size() == parameterDecls.size()) {
                        boolean found = true;

                        for (int i = 0; i < parameterDecls.size(); i++) {
                            if (!methodContext.getParameters().get(i).getType().equals(parameterDecls.get(i).getType())) {
                                found = false;
                                break;
                            }
                        }
                        if (found) return methodContext;
                    }
                }
            }
        }
        return null;
    }
}
