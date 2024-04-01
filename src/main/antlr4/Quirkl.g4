grammar Quirkl;

//COMPLETE
program
: statement+ EOF
;

//COMPLETE
statement
: declaration SEMICOLON                                                                                                                         # DeclarationStatement
| assignment SEMICOLON                                                                                                                          # AssignmentStatement
| functionCall SEMICOLON                                                                                                                        # FunctionCallStatement
| PRINT LPAREN expression RPAREN SEMICOLON                                                                                                      # PrintStatement
| functionWithBody                                                                                                                              # FunctionWithBodyStatement
| functionWithLambda SEMICOLON                                                                                                                  # FunctionWithLambdaStatement
| ifCondition (ELSE ifCondition)* (ELSE LBRACE statement* RBRACE)?                                                                              # IfStatement
| RUN LPAREN (declaration | expression)? SEMICOLON toBool SEMICOLON (assignment | expression)? RPAREN LBRACE statement* RBRACE catchBody?       # ForLoop
| RUN CHECK toBool LBRACE statement* RBRACE catchBody?                                                                                          # WhileLoop
| RUN LBRACE statement* RBRACE CHECK toBool (SEMICOLON | catchBody)                                                                             # DoWhileLoop
| MATCH LPAREN expression RPAREN LBRACE (IS LPAREN expression RPAREN switchCase)+ (ELSE switchCase)? RBRACE                                     # Switch
| RUN LBRACE statement* RBRACE catchBody                                                                                                        # RunCatch
;


//COMPLETE
declaration
: id COLON variableDataType (ASSIGN expression)?                                                                                                # VariableDeclaration
| id COLON FUNCTION_TYPE (ASSIGN function)?                                                                                                     # FunctionDeclaration
;

//COMPLETE
assignment
: id ASSIGN expression
;

//COMPLETE
functionCall
: id LPAREN (expression (COMMA expression)*)? RPAREN
;

//COMPLETE
ifCondition
: IF toBool LBRACE statement* RBRACE
;

//COMPLETE
switchCase
: LBRACE statement* RBRACE                                                                                                                      # SwitchCaseWithBody
| ARROW statement SEMICOLON                                                                                                                    # SwitchCaseWithLambda
;

//COMPLETE
expression
: MINUS? LPAREN expression RPAREN                                                                                                               # BracketExpression
| INC expression                                                                                                                                # IncrementExpression
| DEC expression                                                                                                                                # DecrementExpression
| expression EXP expression                                                                                                                     # ExponentExpression
| expression ROOT expression                                                                                                                    # RootExpression
| expression MULT expression                                                                                                                    # MultiplicationExpression
| expression DIV expression                                                                                                                     # DivisionExpression
| expression MOD expression                                                                                                                     # ModulusExpression
| expression PLUS expression                                                                                                                    # AdditionExpression
| expression MINUS expression                                                                                                                   # SubtractionExpression
| (number | id) SUMM (number | id) LPAREN (function | id) RPAREN                                                                                # SummationExpression
| (number | id) PRODSUMM (number | id) LPAREN (function | id) RPAREN                                                                            # ProdSummationExpression
| NOT expression                                                                                                                                # NotBooleanExpression
| expression EQ expression                                                                                                                      # EqualsBooleanExpression
| expression NEQ expression                                                                                                                     # NotEqualsBooleanExpression
| expression GT expression                                                                                                                      # GreaterThanBooleanExpression
| expression LT expression                                                                                                                      # LessThanBooleanExpression
| expression GTE expression                                                                                                                     # GreaterThanOrEqualsBooleanExpression
| expression LTE expression                                                                                                                     # LessThanOrEqualsBooleanExpression
| expression AND expression                                                                                                                     # AndBooleanExpression
| expression OR expression                                                                                                                      # OrBooleanExpression
| expression XOR expression                                                                                                                     # XorBooleanExpression
| expression NAND expression                                                                                                                    # NandBooleanExpression
| expression NOR expression                                                                                                                     # NorBooleanExpression
| expression XNOR expression                                                                                                                    # XnorBooleanExpression
| toBool                                                                                                                                        # ToBoolExpression
| toBool ARROW expression COLON expression                                                                                                      # TernaryOperatorExpression
| functionWithBody                                                                                                                              # FunctionWithBodyExpression
| functionWithLambda                                                                                                                            # FunctionWithLambdaExpression
| functionCall                                                                                                                                  # FunctionCallExpression
| MINUS? id                                                                                                                                     # VariableExpression
| number                                                                                                                                        # NumberLiteralExpression
| MINUS?DIGIT+'.'DIGIT+                                                                                                                        # DecimalLiteralExpression
| boolean                                                                                                                                       # BooleanLiteralExpression
| QUOTE anychar*? QUOTE                                                                                                                         # StringLiteralExpression
| id INC                                                                                                                                        # LateIncrementExpression
| id DEC                                                                                                                                        # LateDecrementExpression
;

//COMPLETE
toBool
: QUESTMARK LPAREN expression RPAREN
;

//COMPLETE
catchBody
: CATCH LPAREN id RPAREN LBRACE statement* RBRACE
;

//COMPLETE
function
: functionWithBody
| functionWithLambda
;

//COMPLETE
functionWithBody
: PASS LPAREN parameters? RPAREN (TO id)? COLON functionDataType LBRACE statement* (GIVE expression SEMICOLON)? RBRACE
;

//COMPLETE
functionWithLambda
: PASS LPAREN parameters? RPAREN (TO id)? COLON functionDataType ARROW expression
;

//COMPLETE
parameters
: parameter (COMMA parameter)*
;

//COMPLETE
parameter
: id COLON variableDataType
;

//COMPLETE
functionDataType
: variableDataType
| FUNCTION_TYPE
| VOID_TYPE
;

//COMPLETE
variableDataType
: BOOL_TYPE
| NUMBER_TYPE
| DECIMAL_TYPE
| STRING_TYPE
;

//EVERYTHING BELOW IS COMPLETE
//Identifiers
id                  : LETTER (LETTER | DIGIT)* ;        //IDENTIFIER

//Literals
boolean             : 'true' | 'false' ;                //BOOLEAN
number              : MINUS? DIGIT+ ;                          //LONG

anychar
: LETTER | DIGIT
| LPAREN | RPAREN | LBRACE | RBRACE | COMMA | COLON | SEMICOLON | QUESTMARK
| NOT | OR | AND | XOR
| PLUS | MINUS | MULT | DIV | MOD | SUMM
| OTHER_SYMBOL
| '\\"'
;

LETTER              : [a-zA-Z] ;                        //LETTER
DIGIT               : [0-9] ;                           //DIGIT

OTHER_SYMBOL        : [@#$`'.] ; //SYMBOL
QUOTE               : '"' ;                             //QUOTE

//Data Types
BOOL_TYPE           : 'bool' ;                          //BOOLEAN TYPE
NUMBER_TYPE         : 'num' ;                           //NUMBER TYPE
DECIMAL_TYPE        : 'dec' ;                           //DECIMAL TYPE
STRING_TYPE         : 'str' ;                           //STRING TYPE
VOID_TYPE           : 'void' ;                          //VOID TYPE
FUNCTION_TYPE       : 'func' ;                          //FUNCTION TYPE

//Operators
PLUS                : '+' ;                             //ADDITION
MINUS               : '-' ;                             //SUBTRACTION
MULT                : '*' ;                             //MULTIPLICATION
DIV                 : '/' ;                             //DIVISION
MOD                 : '%' ;                             //MODULUS
INC                 : '++' ;                            //INCREMENT
DEC                 : '--' ;                            //DECREMENT
EXP                 : '/\\' ;                           //EXPONENT
SUMM                : '~' ;                             //SUMMATION
PRODSUMM            : '~*' ;                            //PRODUCTSUMMATION
ROOT                : '\\/' ;                           //ROOT

//Assignment
ASSIGN              : '=' ;                             //ASSIGNMENT

//Comparison
EQ                  : '==' ;                            //EQUALS
NEQ                 : '!=' ;                            //NOT EQUALS
GT                  : '>' ;                             //GREATER THAN
LT                  : '<' ;                             //LESS THAN
GTE                 : '>=' ;                            //GREATER THAN OR EQUALS
LTE                 : '<=' ;                            //LESS THAN OR EQUALS

//Logical
AND                 : '&' ;                             //AND
OR                  : '|' ;                             //OR
NOT                 : '!' ;                             //NOT
NAND                : '!&' ;                            //NAND
NOR                 : '!|' ;                            //NOR
XOR                 : '^' ;                             //XOR
XNOR                : '!^' ;                            //XNOR

//Punctuation
LPAREN              : '(' ;                             //LEFT PARENTHESIS
RPAREN              : ')' ;                             //RIGHT PARENTHESIS
LBRACE              : '{' ;                             //LEFT BRACE
RBRACE              : '}' ;                             //RIGHT BRACE
COMMA               : ',' ;                             //COMMA
COLON               : ':' ;                             //COLON
SEMICOLON           : ';' ;                             //SEMICOLON
QUESTMARK           : '?' ;                             //QUESTION MARK
ARROW               : '->' ;                            //ARROW


//Keywords
PASS                : 'pass' ;                          //PASS
GIVE                : 'give' ;                          //GIVE
RUN                 : 'run' ;                           //RUN
CATCH               : 'catch' ;                         //CATCH
CHECK               : 'check' ;                         //CHECK
MATCH               : 'match' ;                         //MATCH
IS                  : 'is' ;                            //IS
TO                  : 'to' ;                            //TO
IF                  : 'if' ;                            //IF
ELSE                : 'else' ;                          //ELSE
PRINT               : 'print' ;                         //PRINT

//Whitespace
WS                  : [ \t\r\n]+ -> skip ;              //SKIP WHITESPACE

//Comments
COMMENT             : '*--' ~[\r\n]* -> skip ;          //SKIP COMMENTS
BLOCK_COMMENT       : '**--' .*? '--**' -> skip ;       //SKIP BLOCK COMMENTS