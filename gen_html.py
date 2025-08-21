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
        background-color: #f1f1f1;
        white-space: pre;
        margin-right: 5px;
    }
    .white-space-pre {
        white-space: pre;
    }
</style>
</head>
<body>
<div class="read-only-code-container">
__replace__
</div>
</body>
</html>
"""


def genHtml(filePath: str, outputPath: str, inferTypeMap: dict[str, str]):
    import os
    input_stream = ant.FileStream(os.path.dirname(__file__)+filePath)
    
    lexer = ALangLexer(input_stream)
    stream = ant.CommonTokenStream(lexer)
    stream.fill()
    htmlElements: list[str] = []
    curLineNum = 1
    curColumnNum = 0
    htmlElements.append('<div class="line"><div class="white-space-pre">')
    htmlElements.append(f"<span class='lineno'>   {curLineNum}</span>")
    for token in stream.tokens:
        while curLineNum < token.line:
            htmlElements.append('</div></div>')
            htmlElements.append('\n')
            htmlElements.append('<div class="line"><div class="white-space-pre">')

            curLineNum += 1
            htmlElements.append(f"<span class='lineno'>   {curLineNum}</span>")

            # 新的一行, col 置 1
            curColumnNum = 0

        while curColumnNum < token.column:
            htmlElements.append(' ')
            curColumnNum += 1

        log('colNum', curColumnNum)
        if token.type == ant.Token.EOF:
            continue
        log(f'{token.text} {token.line} {token.column}')
        inferType = inferTypeMap.get(f"{token.text}_{token.line}_{token.column}", "")
        htmlElements.append(f'<span class="token {inferType}">{token.text}</span>')
        curColumnNum += len(token.text)
    
    htmlElements.append('</div></div>')


    res = htmlTemplate.replace('__replace__', ''.join(htmlElements))
    with open(os.path.dirname(__file__)+outputPath, 'w', encoding='utf-8') as f:
        f.write(res)


if __name__ == '__main__':
    filePath = "/examples/1_var.al"
    htmlPath = "/examples/index.html"
    genHtml(filePath, htmlPath, {})