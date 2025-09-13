
# =======================================================#
# Class definitions for the abstract syntax tree nodes
# which comprise the little language for which types
# will be inferred

class HmNode(object):
    def __init__(self, symbol=None):
        self.symbol = symbol

class Lambda(HmNode):
    """Lambda abstraction"""

    def __init__(self, v, body):
        self.v = v
        self.body = body

    def __str__(self):
        return "(fn {v} => {body})".format(v=self.v, body=self.body)


class Identifier(HmNode):
    """Identifier"""

    def __init__(self, name, symbol=None):
        self.name = name
        super().__init__(symbol)

    def __str__(self):
        return self.name


class Apply(HmNode):
    """Function application"""

    def __init__(self, fn, arg):
        self.fn = fn
        self.arg = arg

    def __str__(self):
        return "({fn} {arg})".format(fn=self.fn, arg=self.arg)
    

class VarDefine(HmNode):
    """Variable definition"""

    def __init__(self, identifier: Identifier, expression, symbol=None):
        self.identifier = identifier
        self.expression = expression
        super().__init__(symbol)

    def __str__(self):
        return f"var define {self.identifier.name}"


class Block(HmNode):
    """用于函数体, if else, while 的语句块"""

    def __init__(self):
        self.expressions = []

    def addExpression(self, exp):
        self.expressions.append(exp)

    def __str__(self):
        return "block"
