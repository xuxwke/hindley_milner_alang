from visitor import typeInferFilePath

def main():
    import os
    filePath = "/examples/1_var.al"
    # filePath = "/examples/2_function.al"
    # filePath = "/examples/3_function_retx.al"
    # filePath = "/examples/tmp.al"
    # filePath = "/examples/4_apply_int.al"
    filePath = "/examples/5_apply_args.al"
    # filePath = "/examples/6_if.al"
    
    res = typeInferFilePath(filePath)
    print(res)

    # genHtml(filePath, "/examples/index.html", visitor.symbolTypeMap())

if __name__ == "__main__":
    main()