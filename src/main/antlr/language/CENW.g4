grammar CENW;
//title: 'Title:' + paragraph;
//paragraph : ( LOWERCASE | UPPERCASE | SPACE)*  '\r';
title : 'Title:' content+ (END_OF_PARAGRAPH | EOF);
fiche : title (paragraph)*  EOF (END_OF_PARAGRAPH)?;
paragraph : (content+ ) (img)* (END_OF_PARAGRAPH | EOF) //#paragraphWithoutQuestion
            | (content+) question (img)* //#paragraphWithQuestion
            | END_OF_PARAGRAPH
            ;
question : QUESTION_START (SPACE | PUNCTUATION | NUMBER | ACCENT | WORD )*? QUESTION_END;
img : IMG_START img_url IMG_END;
img_url : (WORD | NUMBER | PUNCTUATION| ACCENT)+ IMG_EXTENSION;
content : (WORD | SPACE | NUMBER | PUNCTUATION| ACCENT |'\n')+;
NUMBER : '-'? INT* '.'? INT+;
SPACE : ' ' | '\t' | '\r';
QUESTION_START : '<<';
QUESTION_END : '>>';
IMG_START : '[[';
IMG_END : ']]';
IMG_EXTENSION : '.' (
                        'jpg'
                        | 'png'
                        | 'apng'
                        | 'bmp'
                        | 'gif'
                        | 'svg'
                        | 'webp');
PUNCTUATION : (':' |'.' |  ',' |'_' | '\'' | '"' | '!' |'?' | '-' | '/');
WORD : ([a-zA-Z] | ACCENT)+;
INT : '0' | [1-9] [0-9]*;
ACCENT : '\u00C0' .. '\u024F';
END_OF_PARAGRAPH : '\u2029' | '\n\r' | '\r\n';