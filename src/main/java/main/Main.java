package main;

import parser.ParserAPI;

public class Main {

    public static void main(String[] args) {
        System.out.println("### CompilerHorizon - MiniJava Compiler ###");
        System.out.println("### Generating Parser-Output:");
        ParserAPI parserAPI = new ParserAPI("class FirstTest { } class SecondTest { }");
        System.out.println(parserAPI.getResult());

    }
}
