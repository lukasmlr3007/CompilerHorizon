grammar JavaGrammer;

//Grammatik:
program: classdecl+;
classdecl: Class Identifier OpenCurlyBracket ClosedCurlyBracket;

//Tokens:
Class: 'class';
OpenCurlyBracket: '{';
ClosedCurlyBracket: '}';
Identifier: [a-zA-Z]+;
WS: [ \t\n\r]+ -> skip;