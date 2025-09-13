// src/pyodide-file-loader.ts
import { PyodideInterface, loadPyodide } from 'pyodide';
import * as fs from 'fs';
import * as path from 'path';


export interface PythonModule {
    name: string;
    content: string;
    path: string;
}

export class PyodideFileLoader {
    private pyodide: PyodideInterface | null = null;
    private loadedModules: Map<string, string> = new Map();

    constructor(private baseDir: string = path.join(__dirname, '../../..', 'py')) {}

	async setup() {
		// 加载 pyodide
		const pyodide = await loadPyodide();
		this.pyodide = pyodide;
	
		// 安装必要的 Python 包
		await pyodide.loadPackage(['micropip']);
		const micropip = pyodide.pyimport('micropip');
		await micropip.install(['antlr4-python3-runtime']);
		
		// 加载 type_infer 目录下的所有 Python 文件
		// console.log(this.readPythonFile('visitor.py'))
		await this.loadPythonFile('ALangLexer.py')
		await this.loadPythonFile('ALangParser.py')
		await this.loadPythonFile('ALangVisitor.py')
		await this.loadPythonFile('hms_ast.py')
		await this.loadPythonFile('hms.py')
		await this.loadPythonFile('visitor.py')
		console.log('Pyodide and Python environment setup complete.');


		var res = await this.executePythonFunction('visitor', 'typeInferCode', 'var a = 1');
		console.log('Type inference result:', res);
	}

    /**
     * 读取本地 Python 文件
     */
    private readPythonFile(filePath: string): string {
        try {
            const fullPath = path.resolve(this.baseDir, filePath);
            if (!fs.existsSync(fullPath)) {
                throw new Error(`文件不存在: ${fullPath}`);
            }
            
            return fs.readFileSync(fullPath, 'utf-8');
        } catch (error) {
            throw new Error(`读取文件失败: ${filePath}, 错误: ${error}`);
        }
    }

    /**
     * 加载单个 Python 文件到 Pyodide
     */
    async loadPythonFile(relativePath: string, moduleName?: string): Promise<void> {
        if (!this.pyodide) {
            throw new Error('Pyodide 未初始化');
        }

        const content = this.readPythonFile(relativePath);
        const moduleNameToUse = moduleName || path.basename(relativePath, '.py');

        try {
            // 将 Python 代码注入到 Pyodide 中
            await this.pyodide.runPythonAsync(`
                import sys
                from importlib import util
                
                # 创建模块规范
                spec = util.spec_from_loader("${moduleNameToUse}", loader=None)
                module = util.module_from_spec(spec)
                
                # 执行代码
                exec(${JSON.stringify(content)}, module.__dict__)
                
                # 注册到 sys.modules
                sys.modules["${moduleNameToUse}"] = module
            `);

            this.loadedModules.set(moduleNameToUse, relativePath);
            console.log(`已加载模块: ${moduleNameToUse} from ${relativePath}`);

        } catch (error) {
            throw new Error(`加载 Python 文件失败: ${relativePath}, 错误: ${error}`);
        }
    }


    /**
     * 导入已加载的 Python 模块
     */
    importModule<T = any>(moduleName: string): T {
        if (!this.pyodide) {
            throw new Error('Pyodide 未初始化');
        }

        if (!this.loadedModules.has(moduleName)) {
            throw new Error(`模块未加载: ${moduleName}`);
        }

        try {
            return this.pyodide.pyimport(moduleName);
        } catch (error) {
            throw new Error(`导入模块失败: ${moduleName}, 错误: ${error}`);
        }
    }

    /**
     * 执行 Python 文件中的特定函数
     */
    async executePythonFunction(
        moduleName: string, 
        functionName: string, 
        ...args: any[]
    ): Promise<any> {
        const module = this.importModule(moduleName);
        
        try {
            const result = await this.pyodide!.runPythonAsync(`
                import ${moduleName}
                result = ${moduleName}.${functionName}(${args.map(arg => 
                    typeof arg === 'string' ? `"${arg}"` : JSON.stringify(arg)
                ).join(', ')})
                result
            `);

            return result;
        } catch (error) {
            throw new Error(`执行函数失败: ${moduleName}.${functionName}, 错误: ${error}`);
        }
    }

    /**
     * 获取已加载的模块列表
     */
    getLoadedModules(): string[] {
        return Array.from(this.loadedModules.keys());
    }

    /**
     * 检查模块是否已加载
     */
    isModuleLoaded(moduleName: string): boolean {
        return this.loadedModules.has(moduleName);
    }
}