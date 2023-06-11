package parser.adapter;

import lombok.var;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.JavaGrammerParser;
import syntax.expression.Expression;
import syntax.expression.InstVar;
import syntax.expression.LocalOrFieldVar;
import syntax.expression.This;

import java.util.List;

public class InstVarAdapter {
    public static InstVar adapt(JavaGrammerParser.InstanceVariableContext instVarContext) {
        Expression generated = generateInstVar(instVarContext.Identifier(), null, 0);
        if (generated instanceof LocalOrFieldVar) { // this
            return new InstVar(new This(), ((LocalOrFieldVar) generated).getIdentifier(), false); //TODO: static keyword tatsächlich behandeln
        }
        return (InstVar) generated;
    }

    private static Expression generateInstVar(List<TerminalNode> identifiers, Expression previous, int position) {
        var identifier = identifiers.get(position);

        if (previous == null) {
            previous = new LocalOrFieldVar(identifier.getText());
        } else {
            previous = new InstVar(previous, identifier.getText(), false); //TODO: static keyword tatsächlich behandeln
        }

        if (position < identifiers.size() - 1) {
            return generateInstVar(identifiers, previous, position + 1);
        }
        return previous;
    }
}
