/**
 * Define a grammar called Hello 
 */
grammar Hello;
init :  '[' r1 ':' r2 ']';

r1  : init | ID1 ; 
r2  : init | ID2 ;      // match keyword hello followed by an identifier

ID1 : [a-z]+ | [A-Z]+ | [0-9]+ | [ .]; 
ID2 : [a-z]+ | [A-Z]+ | [0-9]+ | [ .];             // match lower-case identifiers

WS : [\t\r\n]+ -> skip ; // skip spaces, tabs, newlines
