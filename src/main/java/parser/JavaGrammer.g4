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
whileStatement: While OpenRoundBracket expression ClosedRoundBracket block;
ifElseStatement: ifStatement elseStatement;
ifStatement: If OpenRoundBracket expression ClosedRoundBracket block;
elseStatement: Else block;
statementExpression: assign | methodCall | myNew;
assign: expression Assign expression Semicolon;
methodCall: reciever extraMethod+ Semicolon;
reciever: (This | Identifier | myNew);
extraMethod: Point Identifier OpenRoundBracket parameters ClosedRoundBracket;
myNew: New Identifier OpenRoundBracket parameters ClosedRoundBracket;
returnStatement: Return (expression)? Semicolon;
expression: 'todo'; //todo
type: Int | Bool | Char | Void | Identifier;

//Tokens:
Class: 'class';
Static: 'static';
Assign: '=';
Int: 'Int';
Bool: 'Bool';
Char: 'Char';
Void: 'Void';
While: 'While';
If: 'If';
Else: 'Else';
New: 'new';
AccessModifier: 'public' | 'private' | 'protected';
OpenCurlyBracket: '{';
ClosedCurlyBracket: '}';
OpenRoundBracket: '(';
ClosedRoundBracket: ')';
Semicolon: ';';
Comma: ',';
Point : '.';
Return: 'return';
Identifier: [a-zA-Z]+;
WS: [ \t\n\r]+ -> skip;
