grammar QuirkyFun;

//Lexar Rules


//Characters
LETTER              : [a-zA-Z] ;                    //LETTER
DIGIT               : [0-9] ;                       //DIGIT
alphanum            : LETTER | DIGIT ;              //ALPHANUMERIC

//Identifiers
id_valid            : alphanum | '_' ;              //VALID IDENTIFIER
id                  : LETTER id_valid*;             //IDENTIFIER

//Literals
TRUE                : 'true' ;                      //TRUE
FALSE               : 'false' ;                     //FALSE
bool_lit            : TRUE | FALSE ;                //BOOLEAN
byte_lit            : DIGIT+'B' ;                   //BYTE
int_lit             : DIGIT+ ;                      //INTEGER
long_lit            : DIGIT+'L' ;                   //LONG
float_lit           : DIGIT+'.'DIGIT+ ;             //FLOAT
double_lit          : DIGIT+'.'DIGIT+'D' ;          //DOUBLE
string_lit          : '"' .*? '"' ;                 //STRING

//Data Types
BOOL                : 'bool' ;                      //BOOLEAN TYPE
BYTE                : 'byte' ;                      //BYTE TYPE
INT                 : 'int' ;                       //INTEGER TYPE
LONG                : 'long' ;                      //LONG TYPE
FLOAT               : 'float' ;                     //FLOAT TYPE
DOUBLE              : 'double' ;                    //DOUBLE TYPE
STRING              : 'str' ;                       //STRING TYPE
VOID                : 'void' ;                      //VOID TYPE

//Operators
PLUS                : '+' ;                         //ADDITION
MINUS               : '-' ;                         //SUBTRACTION
MULT                : '*' ;                         //MULTIPLICATION
DIV                 : '/' ;                         //DIVISION
MOD                 : '%' ;                         //MODULUS
INC                 : '++' ;                        //INCREMENT
DEC                 : '--' ;                        //DECREMENT
EXPONENT            : '/\\' ;                       //EXPONENT
SUMM                : '~' ;                         //SUMMATION
PRODSUMM            : '~*' ;                        //PRODUCTSUMMATION
ROOT                : '\\/' ;                       //ROOT

//Assignment
ASSIGN              : '=' ;                         //ASSIGNMENT

//Comparison
EQ                  : '==' ;                        //EQUALS
NEQ                 : '!=' ;                        //NOT EQUALS
GT                  : '>' ;                         //GREATER THAN
LT                  : '<' ;                         //LESS THAN
GTE                 : '>=' ;                        //GREATER THAN OR EQUALS
LTE                 : '<=' ;                        //LESS THAN OR EQUALS

//Logical
AND                 : '&' ;                         //AND
OR                  : '|' ;                         //OR
NOT                 : '!' ;                         //NOT
NAND                : '!&' ;                        //NAND
NOR                 : '!|' ;                        //NOR
XOR                 : '^' ;                         //XOR
XNOR                : '!^' ;                        //XNOR

//Punctuation
LPAREN              : '(' ;                         //LEFT PARENTHESIS
RPAREN              : ')' ;                         //RIGHT PARENTHESIS
LBRACE              : '{' ;                         //LEFT BRACE
RBRACE              : '}' ;                         //RIGHT BRACE
COMMA               : ',' ;                         //COMMA
COLON               : ':' ;                         //COLON
SEMICOLON           : ';' ;                         //SEMICOLON
QUESTMARK           : '?' ;                         //QUESTION MARK
ARROW               : '->' ;                        //ARROW


//Keywords
PASS                : 'pass' ;                      //PASS
GIVE                : 'give' ;                      //GIVE
RUN                 : 'run' ;                       //RUN
CATCH               : 'catch' ;                     //CATCH
CHECK               : 'check' ;                     //CHECK
MATCH               : 'match' ;                     //MATCH
IS                  : 'is' ;                        //IS
TO                  : 'to' ;                        //TO
IF                  : 'if' ;                        //IF
ELSE                : 'else' ;                      //ELSE

//Whitespace
WS                  : [ \t\r\n]+ -> skip ;          //SKIP WHITESPACE

//Comments
COMMENT             : '*--' ~[\r\n]* -> skip ;      //SKIP COMMENTS
BLOCK_COMMENT       : '**--' .*? '--**' -> skip ;   //SKIP BLOCK COMMENTS

// Parser Rules
expression
: id
| INC expression
| DEC expression
| expression PLUS expression
| expression MINUS expression
| expression MULT expression
| expression DIV expression
| expression MOD expression
| expression EXPONENT expression
| expression ROOT expression
| expression EQ expression
| expression NEQ expression
| expression GT expression
| expression LT expression
| expression GTE expression
| expression LTE expression
| expression AND expression
| expression OR expression
| bracket_expression
| data_literal
| ternary_operator
| function
| function_call
| summation
| prod_summation
;

bracket_expression
: LPAREN expression RPAREN
;

data_literal
: int_lit
| long_lit
| float_lit
| double_lit
| string_lit
| bool_lit
| byte_lit
;

ternary_operator
: to_bool ARROW expression COLON expression
;

to_bool
: QUESTMARK bracket_expression
;

function
: PASS LPAREN parameter_list? RPAREN (TO id)? COLON data_type_function (function_body | (return_lambda SEMICOLON))
;

parameter_list
: parameter (COMMA parameter)*
;

parameter
: id COLON data_type_parameter
;

data_type_parameter
: BOOL
| BYTE
| INT
| LONG
| FLOAT
| DOUBLE
| STRING
;

data_type_function
: data_type_parameter
| VOID
;

end_function
: (function_body | return_lambda)
;

function_body
: LBRACE statement_list RBRACE
;

return_lambda
: ARROW expression
;

statement
: function
| function_call SEMICOLON
| declaration SEMICOLON
| assignment SEMICOLON
| if_statement
| for_loop
| while_loop
| switch_case
| run_catch
| return_statement SEMICOLON
;

declaration
: parameter (ASSIGN expression)?
;

assignment
: id ASSIGN expression
;

if_statement
: IF to_bool function_body (ELSE if_statement)* (ELSE function_body)?
;

for_loop
: RUN LPAREN (declaration | expression)? SEMICOLON to_bool SEMICOLON (assignment | expression)? RPAREN function_body catch_statement?
;

catch_statement
: CATCH LPAREN id RPAREN function_body
;

while_loop
: RUN CHECK to_bool function_body catch_statement?
| RUN function_body CHECK to_bool (SEMICOLON | catch_statement)
;

switch_case
: MATCH bracket_expression LBRACE (IS bracket_expression end_function)+ (ELSE end_function)? RBRACE
;

run_catch
: RUN function_body catch_statement
;

return_statement
: GIVE expression
;

summation
: (int_lit | id) SUMM (int_lit | id) LPAREN (one_parameter_function | id) RPAREN
;

one_parameter_function
: PASS LPAREN parameter RPAREN (TO id)? COLON data_literal end_function
;

prod_summation
: (int_lit | id) PRODSUMM (int_lit | id) LPAREN (one_parameter_function | id) RPAREN
;

function_call
: id LPAREN argument_list? RPAREN
;

argument_list
: expression (COMMA expression)*
;

statement_list
: statement*
;

program
: statement+ EOF
;