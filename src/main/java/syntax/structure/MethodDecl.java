package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.statement.Block;
import syntax.common.AccessModifier;
import syntax.common.Type;

import java.util.List;

/**
 * Methoden-Deklaration <br>
 * Deklariert eine neue Methode vom Namen identifier mit dem Rückgabetyp returnType.
 * <pre>
 *     z.B.: accessModifier staticModifier returnType identifier(paramters) {
 *         block
 *     }
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MethodDecl {
    private Type returnType;
    private String identifier;
    private List<ParameterDecl> parameters;
    private Block block;
    private AccessModifier accessModifier;
    private boolean staticModifier;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
