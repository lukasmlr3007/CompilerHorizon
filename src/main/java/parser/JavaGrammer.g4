grammar JavaGrammer;

//Grammatik:
program: classdecl+;
classdecl: Class Identifier OpenCurlyBracket constructor* fielddecl* ClosedCurlyBracket;
fielddecl: Static? AccessModifier type Identifier Semicolon;
constructor: Identifier OpenRoundBracket parameters? ClosedRoundBracket block;
parameters: parameterdecl(Comma parameterdecl)*;
parameterdecl: type Identifier;
parameterValues: partExpression(Comma partExpression)*;
//parameterValdecl: partExpression;
block: OpenCurlyBracket statement* ClosedCurlyBracket;
statement: block | localVarDecl | whileStatement | ifElseStatement | statementExpression | returnStatement;
localVarDecl: type Identifier Semicolon;
whileStatement: While OpenRoundBracket expression ClosedRoundBracket block;
ifElseStatement: If OpenRoundBracket expression ClosedRoundBracket block Else block;
statementExpression: assign | methodCall | myNew ;
assign: instanceVariable Assign expression Semicolon;
methodCall: reciever extraMethod+ Semicolon;
reciever: (This | Identifier | instanceVariable); //myNew
extraMethod: Point Identifier OpenRoundBracket parameterValues ClosedRoundBracket;
myNew: New Identifier OpenRoundBracket parameters ClosedRoundBracket;
returnStatement: Return (expression)? Semicolon;
// expressions später
expression: partExpression | binaryExpression;
partExpression: literals | Identifier | This | statementExpression | instanceVariable | OpenRoundBracket expression ClosedRoundBracket;
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
Int: 'int';
Bool: 'boolean';
Char: 'char';
Void: 'void';
While: 'while';
If: 'if';
Else: 'else';
New: 'new';
This: 'this';
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
