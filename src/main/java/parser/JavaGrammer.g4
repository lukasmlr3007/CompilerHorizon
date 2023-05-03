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
statementExpression: assign | methodCall | myNew ;
assign: instanceVariable Assign expression Semicolon;
methodCall: reciever extraMethod+ Semicolon;
reciever: (This | Identifier | myNew);
extraMethod: Point Identifier OpenRoundBracket parameters ClosedRoundBracket;
myNew: New Identifier OpenRoundBracket parameters ClosedRoundBracket;
returnStatement: Return (expression)? Semicolon;
// expressions später
expression: partExpression | binaryExpression;
partExpression: literals | Identifier | This | statementExpression | instanceVariable | '!' expression | OpenRoundBracket expression ClosedRoundBracket;
binaryExpression: additiveExpression | logicalExpression | relationalExpression;

additiveExpression: partExpression AdditiveOperator expression;
relationalExpression: partExpression RelationalOperator expression;
logicalExpression: partExpression LogicOperator expression;
literals: IntValue | BoolValue | CharValue;
instanceVariable: This Point Identifier | (This Point)? (Identifier Point)+ Identifier;


type: Int | Bool | Char | Void | Identifier;
sysout: 'System.out.println' OpenRoundBracket expression ClosedRoundBracket Semicolon;
main: 'public static void main(String[] args)' block;

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
LogicOperator: '&&' | '||';
RelationalOperator: '<' | '>' | '<=' | '>=' | '==' | '!=';
AdditiveOperator: '+' | '-' | '*' | '/';
Identifier: [a-zA-Z]+;
IntValue: [0-9]+;
BoolValue: 'true' | 'false';
CharValue: [a-zA-Z];
WS: [ \t\n\r]+ -> skip;
