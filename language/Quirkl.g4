grammar Quirkl;

//COMPLETE
program
: statement+ EOF
;

//COMPLETE
statement
: runCatch
| errorStatement
| variableIncrement SEMICOLON
| variableDecrement SEMICOLON
| printStatement
| ifStatement
| forLoop
| whileLoop
| doWhileLoop
| switch
| declaration SEMICOLON
| assignment SEMICOLON
| functionCall SEMICOLON
| functionWithBody
| functionWithLambda SEMICOLON
;

runCatch
: RUN LBRACE statement* RBRACE catchBody
;

catchBody
: CATCH LPAREN id RPAREN LBRACE statement* RBRACE
;

errorStatement
: ERROR_TYPE COLON expression SEMICOLON
;

variableIncrement
: INC id
;

variableDecrement
: DEC id
;

lateVariableIncrement
: id INC
;

lateVariableDecrement
: id DEC
;

printStatement
: PRINT LPAREN expression (COMMA expression)* RPAREN SEMICOLON
;

ifStatement
: ifCondition (ELSE ifCondition)* (ELSE LBRACE statement* RBRACE)?
;

ifCondition
: IF toBool LBRACE statement* RBRACE
;

toBool
: QUESTMARK LPAREN expression RPAREN
;

forLoop
: RUN LPAREN (declaration | expression)? SEMICOLON toBool SEMICOLON (assignment | expression)? RPAREN LBRACE statement* RBRACE catchBody?
;

whileLoop
: RUN CHECK toBool LBRACE statement* RBRACE catchBody?
;

doWhileLoop
: RUN LBRACE statement* RBRACE CHECK toBool (SEMICOLON | catchBody)
;

switch
: MATCH LPAREN expression RPAREN LBRACE switchCase defaultCase? RBRACE
;

switchCase
: IS LPAREN expression RPAREN switchCaseBody
;

switchCaseBody
: LBRACE statement* RBRACE
| ARROW statement
;

defaultCase
: ELSE switchCaseBody
;

declaration
: variableDefinition assignValue?
;

assignValue
: ASSIGN expression
;

variableDefinition
: id COLON variableDataType
;

assignment
: id assignValue
;

functionCall
: id LPAREN arguments? RPAREN
;

arguments
: expression (COMMA expression)*
;

functionDefinition
: PASS LPAREN parameters? RPAREN (TO id)? COLON allDataTypes
;

parameters
: variableDefinition (COMMA variableDefinition)*
;

function
: functionWithBody
| functionWithLambda
;

functionWithBody
: functionDefinition LBRACE statement* (bodyReturn SEMICOLON)? RBRACE
;

functionWithLambda
: functionDefinition ARROW expression
;

bodyReturn
: GIVE expression
;

expression
: inputExpression
| typeCastExpression
| bracketExpression
| expressionIncrement
| expressionDecrement
| expression EXP expression
| expression ROOT expression
| expression MULT expression
| expression DIV expression
| expression MOD expression
| expression PLUS expression
| expression MINUS expression
| sumOperation
| notBooleanOperation
| expression comparisonBooleanOperator expression
| expression compositeBooleanOperator expression
| toBool
| ternaryOperator
| function
| functionCall
| variableExpression
| dataLiteral
| lateVariableIncrement
| lateVariableDecrement
;

inputExpression
: INPUT LPAREN STRING? RPAREN
;

typeCastExpression
: variableDataType LPAREN expression RPAREN
;

bracketExpression
: MINUS? LPAREN expression RPAREN
;

expressionIncrement
: INC expression
;

expressionDecrement
: DEC expression
;

sumOperation
: summationOperation
| prodSummationOperation
;

summationOperation
: (number | id) SUMM (number | id) LPAREN (function | id) RPAREN
;

prodSummationOperation
: (number | id) PRODSUMM (number | id) LPAREN (function | id) RPAREN
;

notBooleanOperation
: NOT expression
;

ternaryOperator
: toBool ARROW expression COLON expression
;

variableExpression
: MINUS?id
;

dataLiteral
: number
| decimal
| BOOLEAN
| STRING
;

allDataTypes
: variableDataType
| VOID_TYPE
;

variableDataType
: BOOL_TYPE
| NUMBER_TYPE
| DECIMAL_TYPE
| STRING_TYPE
| FUNCTION_TYPE
;

comparisonBooleanOperator
: EQ
| NEQ
| GT
| LT
| GTE
| LTE
;

compositeBooleanOperator
: AND
| OR
| XOR
| NAND
| NOR
| XNOR
;

id
: (LETTER | (keyword (LETTER | DIGIT))) (LETTER | DIGIT | keyword | UNDERSCORE)*
;

number
: MINUS?DIGIT+
;

decimal
: number DOT DIGIT+
;

keyword
: allDataTypes
| PASS
| GIVE
| RUN
| CATCH
| CHECK
| MATCH
| TO
| IF
| ELSE
| IS
| PRINT
| ERROR_TYPE
| INPUT
;

VOID_TYPE           : 'void' ;
BOOL_TYPE           : 'bool' ;
NUMBER_TYPE         : 'num' ;
DECIMAL_TYPE        : 'dec' ;
STRING_TYPE         : 'str' ;
FUNCTION_TYPE       : 'func' ;
ERROR_TYPE          : 'err' ;

PASS                : 'pass' ;
GIVE                : 'give' ;
TO                  : 'to' ;
RUN                 : 'run' ;
CATCH               : 'catch' ;
CHECK               : 'check' ;
MATCH               : 'match' ;
IS                  : 'is' ;
IF                  : 'if' ;
ELSE                : 'else' ;
PRINT               : 'print' ;
INPUT               : 'input' ;

ASSIGN              : '=' ;
LPAREN              : '(' ;
RPAREN              : ')' ;
LBRACE              : '{' ;
RBRACE              : '}' ;
COLON               : ':' ;
COMMA               : ',' ;
UNDERSCORE          : '_' ;
DOT                 : '.' ;
SEMICOLON           : ';' ;
QUESTMARK           : '?' ;
ARROW               : '->' ;

INC                 : '++' ;
DEC                 : '--' ;
PLUS                : '+' ;
MINUS               : '-' ;
MULT                : '*' ;
DIV                 : '/' ;
MOD                 : '%' ;
EXP                 : '/\\' ;
ROOT                : '\\/' ;
SUMM                : '~' ;
PRODSUMM            : '~*' ;

EQ                  : '==' ;
NEQ                 : '!=' ;
GT                  : '>' ;
LT                  : '<' ;
GTE                 : '>=' ;
LTE                 : '<=' ;

NOT                 : '!' ;
AND                 : '&' ;
OR                  : '|' ;
NAND                : '!&' ;
NOR                 : '!|' ;
XOR                 : '^' ;
XNOR                : '!^' ;

STRING              : '"'STRING_STATEMENT*'"' | '\''STRING_STATEMENT*'\'' ;
fragment STRING_STATEMENT : (~[\\"] | '\\n' | '\\t') ;

LETTER              : [a-zA-Z] ;                        //LETTER
DIGIT               : [0-9] ;                           //DIGIT
BOOLEAN             : 'true' | 'false' ;                //BOOLEAN

//Whitespace
WS                  : [ \t\r\n]+ -> skip ;              //SKIP WHITESPACE

//Comments
COMMENT             : '*--' ~[\r\n]* -> skip ;          //SKIP COMMENTS
BLOCK_COMMENT       : '**--' .* '--**' -> skip ;       //SKIP BLOCK COMMENTS