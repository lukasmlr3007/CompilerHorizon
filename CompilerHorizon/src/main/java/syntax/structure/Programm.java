package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.structure.ClassDecl;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Programm {

    private List<ClassDecl> classDeclarations;
}