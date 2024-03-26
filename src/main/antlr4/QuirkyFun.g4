grammar QuirkyFun;

program
: statement+ EOF
;

statement
: declaration SEMICOLON?                                                            # DeclarationStatement
| assignment SEMICOLON                                                              # AssignmentStatement
| function_call SEMICOLON                                                           # FunctionCallStatement
| PRINT LPAREN expression RPAREN SEMICOLON                                          # PrintStatement
| function                                                                          # FunctionStatement
| if_statement                                                                      # IfStatement
| for_loop                                                                          # ForLoop
| while_loop                                                                        # WhileLoop
| switch_case                                                                       # SwitchCase
| run_catch                                                                         # RunCatch
;

declaration
: id COLON variable_data_type (ASSIGN expression)?                                  # VariableDeclaration
| id COLON FUNCTION_TYPE (ASSIGN function)?                                         # FunctionDeclaration
;

assignment
: id ASSIGN expression                                                              # VariableAssignment
;

function_call
: id LPAREN arguments? RPAREN                                                       # FunctionCall
;

if_statement
: IF to_bool LBRACE statement* RBRACE (ELSE if_statement)* (ELSE LBRACE statement* RBRACE)?
;

for_loop
: RUN LPAREN (declaration | expression)? SEMICOLON to_bool SEMICOLON (assignment | expression)? RPAREN LBRACE statement* RBRACE catch_statement?
;

while_loop
: RUN CHECK to_bool LBRACE statement* RBRACE catch_statement?                       # WhileLoopCase
| RUN LBRACE statement* RBRACE CHECK to_bool (SEMICOLON | catch_statement)          # DoWhileLoopCase
;

switch_case
: MATCH LPAREN expression RPAREN LBRACE (IS LPAREN expression RPAREN ((LBRACE statement* RBRACE) | (return_lambda SEMICOLON)))+ (ELSE ((LBRACE statement* RBRACE) | (return_lambda SEMICOLON)))? RBRACE
;

run_catch
: RUN LBRACE statement* RBRACE catch_statement
;

variable_data_type
: BOOL_TYPE                                                                         # BooleanDataType
| NUMBER_TYPE                                                                       # NumberDataType
| DECIMAL_TYPE                                                                      # DecimalDataType
| STRING_TYPE                                                                       # StringDataType
;

expression
: INC expression                                                                    # IncrementExpression
| DEC expression                                                                    # DecrementExpression
| expression PLUS expression                                                        # AdditionExpression
| expression MINUS expression                                                       # SubtractionExpression
| expression MULT expression                                                        # MultiplicationExpression
| expression DIV expression                                                         # DivisionExpression
| expression MOD expression                                                         # ModulusExpression
| expression EXP expression                                                         # ExponentExpression
| expression ROOT expression                                                        # RootExpression
| expression EQ expression                                                          # EqualsExpression
| expression NEQ expression                                                         # NotEqualsExpression
| expression GT expression                                                          # GreaterThanExpression
| expression LT expression                                                          # LessThanExpression
| expression GTE expression                                                         # GreaterThanOrEqualsExpression
| expression LTE expression                                                         # LessThanOrEqualsExpression
| expression AND expression                                                         # AndExpression
| expression OR expression                                                          # OrExpression
| expression XOR expression                                                         # XorExpression
| expression NAND expression                                                        # NandExpression
| expression NOR expression                                                         # NorExpression
| expression XNOR expression                                                        # XnorExpression
| NOT expression                                                                   # NotExpression
| LPAREN expression RPAREN                                                          # BracketExpression
| to_bool                                                                           # ToBoolExpression
| ternary_operator                                                                  # TernaryOperatorExpression
| function                                                                          # FunctionExpression
| function_call                                                                     # FunctionCallExpression
| (number | id) SUMM (number | id) LPAREN (function | id) RPAREN                    # SummationExpression
| (number | id) PRODSUMM (number | id) LPAREN (function | id) RPAREN                # ProdSummationExpression
| id                                                                                # Variable
| number                                                                            # NumberLiteral
| decimal                                                                           # DecimalLiteral
| boolean                                                                           # BooleanLiteral
| string                                                                            # StringLiteral
;

arguments
: expression (COMMA expression)*
;

to_bool
: QUESTMARK LPAREN expression RPAREN
;

catch_statement
: CATCH LPAREN id RPAREN LBRACE statement* RBRACE
;

return_lambda
: ARROW expression
;

ternary_operator
: to_bool ARROW expression COLON expression
;

function
: PASS LPAREN (parameter (COMMA parameter)*)? RPAREN (TO id)? COLON function_data_type ((LBRACE statement* (GIVE expression SEMICOLON)? RBRACE) | (return_lambda SEMICOLON))
;

function_data_type
: variable_data_type                                                                # VariableFunctionDataType
| FUNCTION_TYPE                                                                     # FunctionDataType
| VOID_TYPE                                                                         # VoidFunctionDataType
;

parameter
: id COLON variable_data_type                                                       # FunctionParameter
;

//Identifiers
id                  : LETTER (LETTER | DIGIT)* ;        //IDENTIFIER

//Literals
boolean             : 'true' | 'false' ;                //BOOLEAN
number              : DIGIT+ ;                          //LONG
decimal             : DIGIT+'.'DIGIT+ ;                 //DECIMAL
string              : QUOTE anychar*? QUOTE ;                     //STRING

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


OTHER_SYMBOL              : [@#$`'.] ; //SYMBOL
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