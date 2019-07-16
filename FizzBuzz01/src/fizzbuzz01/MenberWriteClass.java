/* *
 * csvに書き込む処理
 * @autohr onitsuka
 *
 */
package fizzbuzz01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author shiori-o
 *
 */
public class MenberWriteClass {
	/**
	 * メインメソッドです
	 * @param args 配列
	 *
	 */

	public static void main(String[] args) {

		try {

			File csv = new File("member.csv");
			// 文字コードを指定する
			PrintWriter pw = new PrintWriter(
					new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csv, true), "Shift-JIS")));

			//ファイルに文字列を書き込む
			pw.println("鹿島" + "," + 5 + "," + "第五システム統括部" + "," + 1);

			//ファイルをクローズする
			pw.close();
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
