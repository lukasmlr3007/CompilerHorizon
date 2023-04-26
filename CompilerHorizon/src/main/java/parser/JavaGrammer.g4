grammar JavaGrammer;

//Grammatik:
programm: classdecl+;
classdecl: Class Identifier OpenCurlyBracket fielddecl* ClosedCurlyBracket;
fielddecl: Static? AccessModifier type Identifier Semicolon;
constructor: AccessModifier Identifier OpenRoundBracket parameters? block;
parameters: parameterdecl(Comma parameterdecl)*;
parameterdecl: type Identifier;
block: OpenCurlyBracket statement* ClosedCurlyBracket;
statement: block | localVarDecl | whileStatement | ifElseStatement | statementExpression | returnStatement;
localVarDecl: type Identifier Semicolon;
whileStatement: 'todo'; //todo
ifElseStatement: 'todo'; //todo
statementExpression: 'todo'; //todo
returnStatement: Return (expression)? Semicolon;
expression: 'todo'; //todo
type: Int | Bool | Char | Void | Identifier;

//Tokens:
Class: 'class';
Static: 'static';
Int: 'Int';
Bool: 'Bool';
Char: 'Char';
Void: 'Void';
AccessModifier: 'public' | 'private' | 'protected';
OpenCurlyBracket: '{';
ClosedCurlyBracket: '}';
OpenRoundBracket: '(';
ClosedRoundBracket: ')';
Semicolon: ';';
Comma: ',';
Return: 'return';
Identifier: [a-zA-Z]+;
WS: [ \t\n\r]+ -> skip;