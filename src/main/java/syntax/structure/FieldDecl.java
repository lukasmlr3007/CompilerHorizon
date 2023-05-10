package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.AccessModifier;
import syntax.common.Type;

/**
 * Feld-Deklaration <br>
 * Deklariert ein neues Feld mit dem Namen identifier vom Typ type.
 * <pre>
 *     z.B.: accessModifier type identifier;
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class FieldDecl {
    private String identifier;
    private AccessModifier accessModifier;
    private Type type;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    public void generateBytecode(ClassWriter classWriter) {
        FieldVisitor fieldVisitor = classWriter.visitField(0, this.getType().getIdentifier(), this.getIdentifier(), null, null);
        fieldVisitor.visitEnd();
    }
}
