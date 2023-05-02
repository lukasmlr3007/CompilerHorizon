package syntax.common;

import lombok.AllArgsConstructor;

@AllArgsConstructor
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
}
