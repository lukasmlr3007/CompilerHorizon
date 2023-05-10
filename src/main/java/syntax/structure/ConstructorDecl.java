package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.AccessModifier;
import syntax.common.Type;
import syntax.statement.Block;

import java.util.List;

/**
 * Konstruktor-Deklaration <br>
 * Deklariert einen neuen Konstruktor mit den vorgegebenen Parametern.
 * <pre>
 *     z.B.: accessModifier identifier(paramters) {
 *         block
 *     }
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ConstructorDecl {

    // private AccessModifier accessModifier; TODO private constructor
    private List<ParameterDecl> parameters;
    private Block block;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
