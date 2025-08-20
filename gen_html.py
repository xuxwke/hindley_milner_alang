import antlr4 as ant
from antlr.ALangLexer import ALangLexer
from antlr.ALangParser import ALangParser
from antlr.ALangVisitor import ALangVisitor

log = print


htmlTemplate = """
<!DOCTYPE html>
<html>
<body>
__replace__
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
    for token in stream.tokens:
        if token.type == ant.Token.EOF:
            continue
        log(f'{token.text} {token.line} {token.column}')
        inferType = inferTypeMap.get(f"{token.text}_{token.line}_{token.column}", "")
        htmlElements.append(f'<span class="token {inferType}">{token.text}</span>')
    

    res = htmlTemplate.replace('__replace__', '\n'.join(htmlElements))
    with open(os.path.dirname(__file__)+outputPath, 'w', encoding='utf-8') as f:
        f.write(res)


if __name__ == '__main__':
    filePath = "/examples/1_var.al"
    htmlPath = "/examples/index.html"
    genHtml(filePath, htmlPath, {})