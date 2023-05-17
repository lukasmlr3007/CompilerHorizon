package semantic;

import semantic.context.ProgramContext;
import syntax.common.BaseType;
import syntax.common.Type;

public class TypeHelper {

    public static boolean doesTypeExist(Type type, ProgramContext context) {

        if (type instanceof BaseType) return true;
        else return false; // TODO implement referenced type check
    }

    public int abc(int a, char b) { return 0; }

    public static int abc(char b, int a) { return 0; }
}
