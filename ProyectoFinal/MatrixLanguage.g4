grammar MatrixLanguage;

/* 
 *      Matrix Language - Gramatica & Reglas del Lenguaje  

 *      Por: Octavio Augusto Alemán Esparza   A01660702
 *           Erick Daniel Padilla Verdugo     A01740287
 */

/* Parser Rules */

/* Bloque de instrucciones */

program               : tk_main tk_open_brace instructions tk_close_brace tk_semicolon ;

instructions          : instruction | instruction instructions ;

instruction           : var_declaration tk_semicolon | assignation tk_semicolon | write tk_semicolon | matrix_declare ;

var_declaration       : type list ;



/* Casos especificos */

list                 : tk_id | tk_id tk_comma list ;

type                 : tk_number | tk_matrix ;

assignation          : tk_id tk_assign expression ;

expression           : tk_number | matrix | tk_id | addition | subtraction | product | tk_inverse expression;

addition             : tk_number tk_add tk_number;

subtraction          : tk_number tk_subtract tk_number;

product              : tk_number tk_product tk_number;

matrix_declare       : tk_open_bracket tk_number tk_close_bracket  tk_open_bracket tk_number tk_close_bracket  ;

matrix_assignation   : tk_id tk_assign matrix ; 

write                : tk_write tk_id ;

printM               : tk_print_matrix tk_matrix ;

/* Declaracion de Matrices */

matrix        :  tk_open_bracket lines tk_close_bracket ;

lines         : line | line tk_semicolon lines ;

line          : tk_number | tk_number tk_comma tk_number ;

/* Declaracion de Tokens */

tk_main          : 'main' ;

tk_int           : 'int' ;

tk_matrix        : 'matrix' ;

tk_id            : IDENTIFIER ;

tk_number        : NUMBER ;

tk_print_matrix  : 'printM' ;

tk_write         : 'write' ;

tk_semicolon     : ';' ;

tk_comma         : ',' ;

tk_open_brace    : '{' ;

tk_close_brace   : '}' ;

tk_open_par      : '(' ;

tk_close_par     : ')' ;

tk_open_bracket  : '[' ;

tk_close_bracket : ']' ;

tk_assign        : '=' ;

tk_add           : '+' ;

tk_subtract      : '-' ;

tk_product       : '*' ;

tk_inverse       : '^' ;


/* Reglas del Lexer */

IDENTIFIER : [a-zA-Z][a-zA-Z0-9]+ ;

NUMBER     : [0-9]+ ;

WHITESPACE : (' ' | '\t' | '\n' | '\r') -> skip ;

COMMENT    : '//' -> skip ;

TEXT       : '/*' .*? '*/' -> skip ;

