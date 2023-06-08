package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.Expression;
import syntax.expression.LocalOrFieldVar;
import syntax.expression.This;

public class ReceiverAdapter {
    public static Expression adapt(JavaGrammerParser.RecieverContext recieverContext){
        if (recieverContext.instanceVariable() != null) {
            return InstVarAdapter.adapt(recieverContext.instanceVariable());
        } else if (recieverContext.Identifier() != null) {
            return new LocalOrFieldVar(recieverContext.Identifier().getText());
        } else if (recieverContext.This() != null) {
            return new This();
        }
        return null;
    }
}
