import { PyodideInterface, loadPyodide } from 'pyodide';
import * as fs from 'fs';
import * as path from 'path';

import { PyodideFileLoader } from './pyodide-file-loader';


class TokenType {
  constructor(readonly token: string, readonly type: string, readonly line: number, readonly col: number) {}
}


export class TypeInfer {
	private pyLoader: PyodideFileLoader = new PyodideFileLoader();
	private tokenTypeArr = new Array<TokenType>();

	constructor() {

	}

	async setup() {
		await this.pyLoader.setup();
	}

	async typeInferUpdate(documentUri: string, content: string) {
		let res = await this.pyLoader.executePythonFunction('visitor', 'typeInferCode', content);
		let d = JSON.parse(res);
		/*
		token_line_col
		line 从 1 开始
		col 从 0 开始
		{
			"1_1_8": "int",
			"a_1_4": "int"
		}
		*/
		// 把字典转换成数组，数组的元素是 { token, type, line, col }
		for (const [key, value] of Object.entries(d)) {
            // 按 _ 切割
			let words = key.split('_');
			let col = words[-1]
			let line = words[-2]
			let token = words.slice(0, -2).join('_');
			this.tokenTypeArr.push(new TokenType(token, value as string, parseInt(line), parseInt(col)));
        }
	}

	typeInferWithPosition(line: number, character: number, documentUri: string): string {
		// 遍历数组
		for (let i = 0; i < this.tokenTypeArr.length; i++) {
			let t = this.tokenTypeArr[i];
			if (t.line === line && t.col <= character && character <= t.col + t.token.length) {
				return t.type;
			}
		}
		return 'unknown'
	}
}

