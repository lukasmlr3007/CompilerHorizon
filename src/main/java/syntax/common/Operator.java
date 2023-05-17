package syntax.common;

import lombok.AllArgsConstructor;

/**
 * Operatoren <br>
 * Verschiedene Operatoren für arithmetische Operationen.
 */
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
