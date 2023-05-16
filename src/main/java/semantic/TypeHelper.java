package semantic;

import semantic.context.ProgramContext;
import syntax.common.BaseType;
import syntax.common.Type;

public class TypeHelper {

    public static boolean doesTypeExist(Type type, ProgramContext context) {

        if (type instanceof BaseType) return true;
        else return false; // TODO implement advanced type check
    }
}
