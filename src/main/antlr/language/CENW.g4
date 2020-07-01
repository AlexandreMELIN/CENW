grammar CENW;
//title: 'Title:' + paragraph;
//paragraph : ( LOWERCASE | UPPERCASE | SPACE)*  '\r';

fiche : (paragraph question?)+ ;
paragraph : paragraph_content+ ('\r')?;
question : QUESTION_START (SPACE | PUNCTUATION | NUMBER | . )*? QUESTION_END;
paragraph_content : (WORD | SPACE | NUMBER | PUNCTUATION |'\n')+;
NUMBER : '-'? INT* '.'? INT+;
SPACE : ' ' | '\t' | '\r';
QUESTION_START : '<<';
QUESTION_END : '>>';
PUNCTUATION : (':' |'.' |  ',' |'_' | '\'' | '"' | '!' |'?');
WORD : [a-zA-Z]+;
INT : '0' | [1-9] [0-9]*;
