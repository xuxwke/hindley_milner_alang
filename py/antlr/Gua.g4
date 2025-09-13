grammar Gua;


//
// 语法定义
// 根据这里的规定，所有语法必须小写开头
// https://github.com/antlr/antlr4/blob/master/doc/parser-rules.md#rule-elements

// 下面的 VAR INT 两个东西是 词法 Token
// VAR INT 的定义在后面


// start 是我们程序的起点
// 随便换成什么名字
// 但是 gl_to_lua.py 里面的这句就要对应地改改 ast = GuaParser(tokens).start()
// 因为这是 ast 的根

// expression 在下面定义
// * 表示重复 0 次或多次
// 意思是我们的程序由多个 expression 组成
start:
    expression*
    ;

// expression 包含 5 种可能
// 这是一种递归定义
// 1, expression + expression
//     这是加法表达式，我们给加号取了个名字叫 op
//     这样就可以在访问 ast 的时候用 op 这个名字得到这个符号
//     通过判断符号是 + 还是 - 来执行不同的操作
// 2, 匹配 log(多个表达式)
//     如你所见这是一个硬编码的 log 语句
//     括号中的表达式可以有多个，用空格分隔
//     我在解释器里面直接把表达式都求值并 log
// 3, 匹配一个数字，这种情况递归就终止了
// 4, 匹配一个赋值语句比如 a = 1 或者 a = b + 1 + 3
// 5, 匹配一个变量名，这种情况递归也终止了

// # 是标签
// 可以在 ast 访问的时候单独有个函数访问这个标签
// 如果没有这个标签
// 就只能在 expression 的访问函数中自己判断当前是哪个类型的 expression
// 那可就太蛋疼了
expression:
    '{' (expression ':' expression ',')* '}'                        # LabelExpressionDictBlock
    |
    'import(' STRING ')' ('.' VAR )?         # LabelExpressionImport
    |
    expression '(' ((expression|function) ',')* (expression|function)? ')'           # LabelExpressionCall
    |
    expression '.new' '(' (expression ',')* expression? ')'           # LabelExpressionCallNewMethod
    |
    expression op=('+' | '-'| '*' | '/' | '%') expression       # LabelExpressionArithmetic
    |
    expression op=('+=' | '-='| '*=' | '/=' | '%=') expression       # LabelExpressionArithmeticEqual
    |
    expression op=('<' | '>' | '==' | '!=' | '>=' | '<=') expression   # LabelExpressionArithmeticCompare
    |
    expression op=('&' | '>>' | '<<' | '|' | '~') expression   # LabelExpressionArithmeticBit
    |
    expression op=('or' | 'and') expression                     # LabelExpressionArithmeticLogical
    |
    'not' expression                                            # LabelExpressionArithmeticLogicalNot
    |
    '-' expression                                                         # LabelExpressionNegativeExpression
    |
    'log' '(' (expression ',')* expression? ')'                 # LabelExpressionLog
    |
    LABEL                                                       # LabelExpressionLabel
    |
    INT                                                         # LabelExpressionLiteralInt
    |
    FLOAT                                                       # LabelExpressionLiteralFloat
    |
    BOOL                                                        # LabelExpressionLiteralBool
    |
    NULL                                                        # LabelExpressionLiteralNull
    |
    THIS                                                        # LabelExpressionLiteralThis
    |
    CLASS                                                        # LabelExpressionLiteralClass
    |
    STRING                                                      # LabelExpressionLiteralString
    |
    LONGSTRING                                                  # LabelExpressionLiteralLongString
    |
    BITNUM                                                       # LabelExpressionLiteralBitNum
    |
    'return' ((expression) ',')* (expression?)             # LabelExpressionReturn
    |
     // 数组/字典赋值
    VAR '[' expression ']' ('[' expression ']')* '=' expression                                    # LabelExpressionListDictSetValue
    |
    'const' VAR '=' 'class' '(' expression? ')' block                       # LabelExpressionClassDefinition
    |
    'const' 'class' '.' VAR '=' function                           # LabelExpressionClassFunctionDefinition
    |
    ('var' | 'const') VAR '=' function                                    # LabelExpressionFunctionDefinition
    |
    ('var' | 'const') VAR '=' expression                                    # LabelExpressionDefinition
    |
    VAR '=' expression                                          # LabelExpressionAssign
    |
    ('var' | 'const') 'class' '.' VAR '=' expression                            # LabelExpressionClassFieldAssign
    |
    ('var' | 'const') 'this' '.' VAR '=' expression                            # LabelExpressionThisAssign
    |
    // 字典:语法
    VAR ':' VAR                                   # LabelExpressionDictExtraDot
    |
    // 数组/字典取值
    VAR ('[' expression ']')*                                  # LabelExpressionListDictGetValue
    |
    // 字典
    ('const' | 'var') VAR '=' '{' expression* '}'            # LabelExpressionVarCreateDict
    |
    // 字典2
    expression '=' '{' expression* '}'                        # LabelExpressionExpressionCreateDict
    |
    // 字典
    expression '=' expression                                    # LabelExpressionEqual
    |
    if_expression
    elseif_expression*
    else_expression?                                            # LabelExpressionIf
    |
    'while' '(' expression ')' block                            # LabelExpressionWhile
    |
    'class' '(' ')' '{' statementFunctionDefinition* '}'        # LabelExpressionClassDefinition
    |
    objectName=VAR '.' methodName=VAR '('  ')'                  # LabelExpressionClassMethodCall
    |
    expression '.' expression                                   # LabelExpressionDot
    |
    // 数组
    '[' (expression ',')* (expression ','?)? ']'                # LabelExpressionListDefinition
    |
    // 字典3
    STRING ':' '{' expression* '}'                        # LabelExpressionDictStringKeyElementDict
    |
    // 字典
    VAR ':' '{' expression* '}'                        # LabelExpressionDictVarKeyElementDict
    |
    // 字典元素
    STRING ':' expression ','                                   # LabelExpressionDictStringKeyElement
    |
    // 字典:语法
    VAR ':' expression ','                                  # LabelExpressionDictVarKeyElement
    |
    VAR                                                         # LabelExpressionVariable
    |
    // for
    'for' '(' expression ';' expression ';' expression ')' block              # LabelExpressionForNormal
    |
    // for in
    'for' '(' VAR ',' VAR 'in' VAR ')' block                    # LabelExpressionForIn
    |
    '(' expression? ')'                                          # LabelExpressionParentheses

    ;



statementFunctionDefinition:
    'var' VAR '=' 'function' '('  ')' '{'
        expression*
    '}'
    ;


//
// 词法定义
// 我们用全大写来表示词法定义

// 这里说明是 Token 永远大写开头
// https://github.com/antlr/antlr4/blob/master/doc/parser-rules.md#rule-elements
// 不让带数字
// 长度至少为 1

    // 'if' '(' expression ')' '{' then '}'
    // ('else' 'if' '(' expression ')' '{' then '}')*
    // ('else' '{' otherwise '}')?    

if_expression:
    'if' '(' expression ')' block;

elseif_expression:
    ('else' 'if' '(' expression ')' block);

else_expression:
    ('else' block);

then:
    expression*;

otherwise:
    expression*;

block:
    '{' expression* '}'       # LabelBlock
    ;

function:
    'function' '(' (expression ',')* expression? ')' block    # LabelFunction
    ;



NULL:
    'null';

THIS:
    'this';

CLASS:
    'class';

BOOL:
    'true' | 'false';

VAR:
    Letter (Letter | Digit)*;

LABEL:
    '::' Letter (Letter | Digit)* '::';

BITNUM:
    '0b' Digit+
    |
    '0x' HexDigit+;

INT:
    '-'? Digit+;

ExponentPart
    : [eE] [+-]? Digit+
    ;

FLOAT:
    Digit+ '.' Digit* ExponentPart?
    | '.' Digit+ ExponentPart?
    | Digit+ ExponentPart
    ;

STRING:
    NORMALSTRING | CHARSTRING
    ;

NORMALSTRING
    : '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

CHARSTRING
    : '\'' ( EscapeSequence | ~('\''|'\\') )* '\''
    ;

LONGSTRING
    : '`' .*? '`'
    ;


fragment
Digit
    : [0-9]
    ;

fragment
HexDigit
    : [0-9a-fA-F]
    ;

fragment Letter:
    [a-zA-Z]
    |
    '_'
    |
    '\u0100'..'\u{1FFFF}'
    ;

fragment
EscapeSequence
    : '\\' [abfnrtvz"'\\]
    | '\\' '\r'? '\n'
    | DecimalEscape
    | HexEscape
    | UtfEscape
    ;

fragment
DecimalEscape
    : '\\' Digit
    | '\\' Digit Digit
    | '\\' [0-2] Digit Digit
    ;

fragment
HexEscape
    : '\\' 'x' HexDigit HexDigit
    ;

fragment
UtfEscape
    : '\\' 'u{' HexDigit+ '}'
    ;


// 空格 tab 回车
// 都跳过
// 抄来的
SPACE:
    [ \t\n]+
    -> skip;


// 这是注释
// 但这是从官方仓库抄来的
// 意思是 // 或者 # 到末尾都跳过
//
// 多行注释的功能是我搜索加猜测尝试读报错弄出来的
// 不信你搜 antlr multiline comment 会发现搜出来的都是不能用的
COMMENT:
    (
        ('//' | '#') ~('\r' | '\n')*
        |
        '/*' .*? '*/'
    )
    -> skip
    ;
