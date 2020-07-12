grammar CENW;
//title: 'Title:' + paragraph;
//paragraph : ( LOWERCASE | UPPERCASE | SPACE)*  '\r';
title : 'Title:' content+ (END_OF_PARAGRAPH | EOF);
fiche : title (paragraph)*  EOF (END_OF_PARAGRAPH)?;
paragraph : (content+ ) (END_OF_PARAGRAPH | EOF) //#paragraphWithoutQuestion
            | (content+) question //#paragraphWithQuestion
            | END_OF_PARAGRAPH
            ;
question : QUESTION_START (SPACE | PUNCTUATION | NUMBER | ACCENT | WORD )*? QUESTION_END;
content : (WORD | SPACE | NUMBER | PUNCTUATION| ACCENT |'\n')+;
NUMBER : '-'? INT* '.'? INT+;
SPACE : ' ' | '\t' | '\r';
QUESTION_START : '<<';
QUESTION_END : '>>';
PUNCTUATION : (':' |'.' |  ',' |'_' | '\'' | '"' | '!' |'?' | '-');
WORD : ([a-zA-Z] | ACCENT)+;
INT : '0' | [1-9] [0-9]*;
ACCENT : '\u00C0' .. '\u024F';
END_OF_PARAGRAPH : '\u2029' | '\n\r' | '\r\n';