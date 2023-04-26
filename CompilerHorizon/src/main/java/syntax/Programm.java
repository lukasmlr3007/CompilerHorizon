package syntax;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.ClassDecl;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Programm {
    List<ClassDecl> classDeclarations;
}