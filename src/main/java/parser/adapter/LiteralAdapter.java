package parser.adapter;

import parser.JavaGrammerParser;
import syntax.expression.*;

public class LiteralAdapter {
    public static PartExpression adapt(JavaGrammerParser.LiteralsContext literalsContext) {
        if(literalsContext.IntValue() != null) {
            return new IntegerLiteral(Integer.parseInt(literalsContext.IntValue().getSymbol().getText()));
        } else if (literalsContext.CharValue() != null) {
            return new CharLiteral(literalsContext.CharValue().getSymbol().getText().charAt(0));
        } else if (literalsContext.BoolValue() != null) {
            return new BoolLiteral((literalsContext.BoolValue().getSymbol().getText().equalsIgnoreCase("true")));
        }
        //TODO eventuell VoidLiteral?
        return null;
    }
}
