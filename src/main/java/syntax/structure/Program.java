package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.context.Context;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Program {

    private Context context;

    private List<ClassDecl> classDeclarations;
}