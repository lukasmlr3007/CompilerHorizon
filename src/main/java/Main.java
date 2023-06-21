import bytecode.ProgramBytecode;
import parser.ParserAPI;
import semantic.SemanticChecker;
import semantic.TypeCheckResult;
import syntax.structure.Program;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Bitte geben Sie den Pfad zur Datei als absoluten Pfad an.");
            return;
        }

        String filePath = args[0];

        try {
            String fileContent = readFileAsString(filePath);
            System.out.println("Datei erfolgreich eingelesen");

            ParserAPI parserAPI = new ParserAPI(fileContent);
            Program syntaxTree = parserAPI.getResult();
            System.out.println("Syntax Tree: " + syntaxTree);

            SemanticChecker semantikCheck = new SemanticChecker();
            TypeCheckResult typeCheckResult = semantikCheck.check(syntaxTree);
            System.out.println((typeCheckResult.isValid() ? "Semantik ist korrekt" : "Semantik ist inkorrekt"));

            ProgramBytecode programBytecode = new ProgramBytecode();
            programBytecode.visit(syntaxTree);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFileAsString(String filePath) throws IOException {
        byte[] encodedBytes = Files.readAllBytes(Paths.get(filePath));
        return new String(encodedBytes);
    }
}
