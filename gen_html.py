import antlr4 as ant
from antlr.ALangLexer import ALangLexer
from antlr.ALangParser import ALangParser
from antlr.ALangVisitor import ALangVisitor

log = print


htmlTemplate = """
<!DOCTYPE html>
<html>
<head>
<style>
    .read-only-code-container {
        display: flex;
        border-style:solid;
        border-color: gray;
        border-width: 1px;
        padding: 5px 5px 5px 0px;
        line-height: 1.2;
    }
    .line {
        display: flex;
        white-space: pre;
        margin: 0px;
    }
    .lineno {
        /* background-color: #f1f1f1; */
        white-space: pre;
        margin-right: 5px;
    }
    .white-space-pre {
        white-space: pre;
    }
    .lineno-container {
        display: flex;
        flex-direction: column;
        align-items: flex-end;
        margin-right: 5px;
        background-color: #f5f5f5;
    }
    .token-type-var {
        color: blue;
    }
    .token-type-keyword {
        color: #770088;
    }
    .token-type-int {
        color: #116644;
    }
    .token-type-bool {
        color: #493BAB;
    }
    
</style>
</head>
<body>
<div class="read-only-code-container">

<div class="lineno-container">
__lineno__
</div>

<div>
__code__
</div>
</body>
</html>
"""


def genLinenoHtml(maxLineNum: int) -> str:
    htmlElements: list[str] = []
    for i in range(maxLineNum):
        htmlElements.append(f'<div class="line"><span class="lineno">{i+1:4}</span></div>')
    return '\n'.join(htmlElements)


def genHtml(filePath: str, outputPath: str, inferTypeMap: dict[str, str]):
    import os
    input_stream = ant.FileStream(os.path.dirname(__file__)+filePath)
    
    lexer = ALangLexer(input_stream)
    stream = ant.CommonTokenStream(lexer)
    stream.fill()
    htmlElements: list[str] = []

    # 生成行号
    maxLineNum = stream.tokens[-1].line
    log('maxLineNum', maxLineNum)
    linnoHtml = genLinenoHtml(maxLineNum)
    res = htmlTemplate.replace('__lineno__', linnoHtml)


    # 生成代码
    curLineNum = 1
    curColumnNum = 0
    htmlElements.append('<div class="white-space-pre">')
    for token in stream.tokens:
        while curLineNum < token.line:
            curLineNum += 1
            if curColumnNum == 0:
                htmlElements.append(' ')
            htmlElements.append('</div>\n')
            htmlElements.append('<div class="white-space-pre">')
            # 新的一行, col 置 1
            curColumnNum = 0

        while curColumnNum < token.column:
            htmlElements.append(' ')
            curColumnNum += 1

        if token.type == ant.Token.EOF:
            continue

        log(f'{token.text} {token.line} {token.column} {token.type}')
        tokenType = 'unknown'
        if token.type == ALangLexer.VAR:
            tokenType = "var"
        elif token.type == ALangLexer.INT:
            tokenType = "int"
        elif token.type == ALangLexer.BOOL:
            tokenType = "bool"
        else:
            if token.text in {'var', 'if', 'else', 'return', 'function'}:
                tokenType = 'keyword'

        inferType = inferTypeMap.get(f"{token.text}_{token.line}_{token.column}", "")
        htmlElements.append(f'<span class="token-type-{tokenType} infer-type-{inferType}">{token.text}</span>')
        curColumnNum += len(token.text)
    
    htmlElements.append('</div>')
    res = res.replace('__code__', ''.join(htmlElements))
    with open(os.path.dirname(__file__)+outputPath, 'w', encoding='utf-8') as f:
        f.write(res)


if __name__ == '__main__':
    filePath = "/examples/1_var.al"
    filePath = "/examples/6_if.al"
    htmlPath = "/examples/index.html"
    genHtml(filePath, htmlPath, {})