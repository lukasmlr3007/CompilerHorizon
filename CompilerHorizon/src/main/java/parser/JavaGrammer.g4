grammar JavaGrammer;

program: classdecl+;

//class identifier{}
classdecl: 'class' Identifier OpenCurlyBracket ClosedCurlyBracket;

Class: 'class';
OpenCurlyBracket: '{';
ClosedCurlyBracket: '}';
Identifier: [a-zA-Z]+;