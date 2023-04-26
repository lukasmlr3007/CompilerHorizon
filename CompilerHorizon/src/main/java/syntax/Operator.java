package syntax;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Operator {
    PLUS("+"),
    MINUS("-"),
    MUL("*"),
    DIV("/"),
    OR("||"),
    AND("&&"),
    EQUALS("=="),
    NOTEQUALS("!="),
    GREATER(">"),
    LESS("<"),
    GREATEREQUALS(">="),
    LESSEQUALS("<="),
    NOT("!"),
    ASSIGN("="),
    INCPRE("++"),
    INCPOST("++"),
    DECPRE("--"),
    DECPOST("--");
    private String symbol;
    private Operator(String symbol) {this.symbol = symbol;}
}
