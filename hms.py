"""
.. module:: inference
   :synopsis: An implementation of the Hindley Milner type checking algorithm
              based on the Scala code by Andrew Forrest, the Perl code by
              Nikita Borisov and the paper "Basic Polymorphic Typechecking"
              by Cardelli.
.. moduleauthor:: Robert Smallshire
"""

from __future__ import print_function
from hms_ast import *


log = print
# log = lambda *args, **kwargs: None  # Disable logging by default


# =======================================================#
# Exception types

class InferenceError(Exception):
    """Raised if the type inference algorithm cannot infer types successfully"""

    def __init__(self, message):
        self.__message = message

    message = property(lambda self: self.__message)

    def __str__(self):
        return str(self.message)


class ParseError(Exception):
    """Raised if the type environment supplied for is incomplete"""

    def __init__(self, message):
        self.__message = message

    message = property(lambda self: self.__message)

    def __str__(self):
        return str(self.message)


# =======================================================#
# Types and type constructors

class TypeVariable(object):
    """A type variable standing for an arbitrary type.

    All type variables have a unique id, but names are only assigned lazily,
    when required.
    """

    next_variable_id = 0

    def __init__(self):
        self.id = TypeVariable.next_variable_id
        TypeVariable.next_variable_id += 1
        self.instance = None
        self.__name = None

    next_variable_name = 'a'

    @property
    def name(self):
        """Names are allocated to TypeVariables lazily, so that only TypeVariables
        present after analysis consume names.
        """
        if self.__name is None:
            self.__name = TypeVariable.next_variable_name
            TypeVariable.next_variable_name = chr(ord(TypeVariable.next_variable_name) + 1)
        return self.__name

    def __str__(self):
        if self.instance is not None:
            return str(self.instance)
        else:
            return self.name

    def __repr__(self):
        return "TypeVariable(id = {0})".format(self.id)


class TypeOperator(object):
    """An n-ary type constructor which builds a new type from old"""

    def __init__(self, name, types):
        self.name = name
        self.types = types

    def __str__(self):
        num_types = len(self.types)
        if num_types == 0:
            return self.name
        elif num_types == 2:
            return "({0} {1} {2})".format(str(self.types[0]), self.name, str(self.types[1]))
        else:
            return "{0} {1}" .format(self.name, ' '.join(self.types))


class Function(TypeOperator):
    """A binary type constructor which builds function types"""

    def __init__(self, from_type, to_type):
        super(Function, self).__init__("->", [from_type, to_type])


# Basic types are constructed with a nullary type constructor
Integer = TypeOperator("int", [])  # Basic integer
Bool = TypeOperator("bool", [])  # Basic bool


# =======================================================#
# Type inference machinery

class TypeInfer:
    def __init__(self):
        self._env = {}
        self._symbolType: dict = {}

    def symbolTypeAdd(self, symbolName: str, line: int, col: int, varType: TypeOperator):
        self._symbolType[f"{symbolName}_{line}_{col}"] = str(varType)

    def symbolTypeJson(self):
        import json
        return json.dumps(self._symbolType, ensure_ascii=False, indent=2)

    def setType(self, name: str, hmsType: TypeOperator):
        self._env[name] = hmsType

    def getTypeFromEnv(self, name: str):
        return self._env.get(name, None)

    def getType(self, name: str, non_generic: set) -> TypeOperator:
        """Get the type of identifier name from the type environment env.

        Args:
            name: The identifier name
            env: The type environment mapping from identifier names to types
            non_generic: A set of non-generic TypeVariables

        Raises:
            ParseError: Raised if name is an undefined symbol in the type
                environment.
        """
        if self.getTypeFromEnv(name) is not None:
            return fresh(self.getTypeFromEnv(name), non_generic)
        elif is_integer_literal(name):
            return Integer
        else:
            raise ParseError("Undefined symbol {0}".format(name))

    def analyse(self, node: HmNode, non_generic=None) -> TypeOperator:
        if non_generic is None:
            non_generic = set()

        log('node', type(node))
        if isinstance(node, VarDefine):
            log("infer 变量定义")
            t = self.analyse(node.expression, non_generic)
            self.setType(node.identifier.name, t)
            self.symbolTypeAdd(node.identifier.name, node.symbol.line, node.symbol.column, t)

        if isinstance(node, Identifier):
            to = self.getType(node.name, non_generic)
            self.symbolTypeAdd(node.name, node.symbol.line, node.symbol.column, to)
            return to
        
        elif isinstance(node, Apply):
            log("analyse: Apply")
            fun_type = self.analyse(node.fn, non_generic)
            arg_type = self.analyse(node.arg, non_generic)
            result_type = TypeVariable()
            unify(Function(arg_type, result_type), fun_type)
            return result_type
        
        elif isinstance(node, Lambda):
            log("analyse: Lambda")
            arg_type = TypeVariable()
            new_env = self._env.copy()
            new_env[node.v] = arg_type
            new_non_generic = non_generic.copy()
            new_non_generic.add(arg_type)
            result_type = self.analyse(node.body, new_env, new_non_generic)
            return Function(arg_type, result_type)
        # assert 0, "Unhandled syntax node {0}".format(type(node))


def fresh(t, non_generic):
    """Makes a copy of a type expression.

    The type t is copied. The the generic variables are duplicated and the
    non_generic variables are shared.

    Args:
        t: A type to be copied.
        non_generic: A set of non-generic TypeVariables
    """
    mappings = {}  # A mapping of TypeVariables to TypeVariables
    log(f"fresh: {t}")
    def freshrec(tp):
        p = prune(tp)
        if isinstance(p, TypeVariable):
            log(f'  fresh TypeVariable')
            if is_generic(p, non_generic):
                log(f'    fresh {p} is_generic')
                if p not in mappings:
                    mappings[p] = TypeVariable()
                return mappings[p]
            else:
                return p
        elif isinstance(p, TypeOperator):
            log(f'  fresh TypeOperator')
            return TypeOperator(p.name, [freshrec(x) for x in p.types])

    return freshrec(t)


def unify(t1, t2):
    """Unify the two types t1 and t2.

    Makes the types t1 and t2 the same.

    Args:
        t1: The first type to be made equivalent
        t2: The second type to be be equivalent

    Returns:
        None

    Raises:
        InferenceError: Raised if the types cannot be unified.
    """
    log(f" unify enter t1({t1}) t2({t2})")
    a = prune(t1)
    b = prune(t2)
    if isinstance(a, TypeVariable):
        log('  unify var')
        if a != b:
            if occurs_in_type(a, b):
                raise InferenceError("recursive unification")
            a.instance = b
    elif isinstance(a, TypeOperator) and isinstance(b, TypeVariable):
        log(f'  unify op({a}) var({b})')
        unify(b, a)
    elif isinstance(a, TypeOperator) and isinstance(b, TypeOperator):
        log('  unify op op')
        if a.name != b.name or len(a.types) != len(b.types):
            raise InferenceError("Type mismatch: {0} != {1}".format(str(a), str(b)))
        for p, q in zip(a.types, b.types):
            log(f'    zip {p}, {q}')
            unify(p, q)
    else:
        assert 0, "Not unified"


def prune(t):
    """Returns the currently defining instance of t.

    As a side effect, collapses the list of type instances. The function Prune
    is used whenever a type expression has to be inspected: it will always
    return a type expression which is either an uninstantiated type variable or
    a type operator; i.e. it will skip instantiated variables, and will
    actually prune them from expressions to remove long chains of instantiated
    variables.

    Args:
        t: The type to be pruned

    Returns:
        An uninstantiated TypeVariable or a TypeOperator
    """
    if isinstance(t, TypeVariable):
        log(f"prune: {t} isinstance TypeVariable")
        if t.instance is not None:
            t.instance = prune(t.instance)
            log(f"prune: {t} pruned to {t.instance}")
            return t.instance
    log(f"prune: {t} not TypeVariable or no instance")
    return t


def is_generic(v, non_generic):
    """Checks whether a given variable occurs in a list of non-generic variables

    Note that a variables in such a list may be instantiated to a type term,
    in which case the variables contained in the type term are considered
    non-generic.

    Note: Must be called with v pre-pruned

    Args:
        v: The TypeVariable to be tested for genericity
        non_generic: A set of non-generic TypeVariables

    Returns:
        True if v is a generic variable, otherwise False
    """
    return not occurs_in(v, non_generic)


def occurs_in_type(v, type2):
    """Checks whether a type variable occurs in a type expression.

    Note: Must be called with v pre-pruned

    Args:
        v:  The TypeVariable to be tested for
        type2: The type in which to search

    Returns:
        True if v occurs in type2, otherwise False
    """
    pruned_type2 = prune(type2)
    if pruned_type2 == v:
        return True
    elif isinstance(pruned_type2, TypeOperator):
        return occurs_in(v, pruned_type2.types)
    return False


def occurs_in(t, types):
    """Checks whether a types variable occurs in any other types.

    Args:
        t:  The TypeVariable to be tested for
        types: The sequence of types in which to search

    Returns:
        True if t occurs in any of types, otherwise False
    """
    return any(occurs_in_type(t, t2) for t2 in types)


def is_integer_literal(name):
    """Checks whether name is an integer literal string.

    Args:
        name: The identifier to check

    Returns:
        True if name is an integer literal, otherwise False
    """
    result = True
    try:
        int(name)
    except ValueError:
        result = False
    return result


# ==================================================================#
# Example code to exercise the above
def analyse(node):
    ti = TypeInfer()
    ti.analyse(node)
    return ti


# def try_exp(env, node):
#     """Try to evaluate a type printing the result or reporting errors.

#     Args:
#         env: The type environment in which to evaluate the expression.
#         node: The root node of the abstract syntax tree of the expression.

#     Returns:
#         None
#     """
#     print(str(node) + " :", end=' ')
#     try:
#         t = analyse(node, env)
#         print(str(t))
#     except (ParseError, InferenceError) as e:
#         print(e)
