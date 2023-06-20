grammar JavaGrammer;

//Grammatik:
program: classdecl+;
classdecl: Class main? Identifier OpenCurlyBracket (myconstructor | fielddecl | methoddecl)* ClosedCurlyBracket;
myconstructor: AccessModifier Identifier OpenRoundBracket parameters? ClosedRoundBracket block;
fielddecl: Static? AccessModifier type Identifier Semicolon;
parameters: parameterdecl(Comma parameterdecl)*;
parameterdecl: type Identifier;
parameterValues: partExpression(Comma partExpression)*;
//parameterValdecl: partExpression;
methoddecl: AccessModifier Static? type Identifier OpenRoundBracket parameters? ClosedRoundBracket block;
block: OpenCurlyBracket statement* ClosedCurlyBracket;
//TODO: Prüfen, ob jede einzelne Statement-Variante klappt:
statement: block | localVarDecl | whileStatement | ifElseStatement | statementExpression | returnStatement | sysout;
localVarDecl: type Identifier Semicolon;
whileStatement: While OpenRoundBracket expression ClosedRoundBracket block;
ifElseStatement: If OpenRoundBracket expression ClosedRoundBracket block Else block;
statementExpression: assign | methodCall | myNew ;
assign: instanceVariable Assign expression;
methodCall: reciever extraMethod+ Semicolon;
reciever: This | Identifier | instanceVariable; //myNew
extraMethod: Point Identifier OpenRoundBracket parameterValues? ClosedRoundBracket;
myNew: New Identifier OpenRoundBracket parameterValues? ClosedRoundBracket Semicolon;
returnStatement: Return (expression)? Semicolon;

//TODO: Überprüfen
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
IntValue: [0-9]+;
BoolValue: 'true' | 'false';
CharValue: [a-zA-Z];
Identifier: [a-zA-Z]+;
WS: [ \t\n\r]+ -> skip;
