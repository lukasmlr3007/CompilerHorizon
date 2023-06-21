package Helper;

import syntax.structure.Program;

import java.io.InputStream;
import java.util.Scanner;

public class TestHelper {

    public static String getFileInput(String fileName) {

        ClassLoader cl = TestHelper.class.getClassLoader();
        InputStream is = cl.getResourceAsStream(fileName);
        Scanner sc = new Scanner(is).useDelimiter("\\A");
        String out = sc.hasNext() ? sc.next() : "";

        return out;
    }

    public static Program getFileAsProgram(String fileName) {
        return null; // TODO
    }
}
