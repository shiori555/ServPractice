/* *
 * csvに書き込む処理
 * @autohr onitsuka
 *
 */
package fizzbuzz01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MenberWriteClass {
	/**
	 * メインメソッドです
	 * @param args 配列
	 *
	 */

	public static void main(String[] args) {

		/**
		 * 新たに書き直したソース
		 *
		 */
		try {
			File csv = new File("member.csv");
			// FileWriterクラスのオブジェクトを生成する
			FileWriter file = new FileWriter(csv, true);
			// PrintWriterクラスのオブジェクトを生成する
			PrintWriter pw = new PrintWriter(new BufferedWriter(file));

			//ファイルに追記する
			pw.println("鹿島" + "," + 5 + "," + "第五システム統括部" + "," + 1);

			//ファイルを閉じる
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/***
		 * 初めに書いていたソース
		 * try {
		 *		File csv = new File("member.csv");
		 *
		 *		 書き込み
		 *		BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true));
		 *
		 *		 新しいデータ
		 *		bw.write("鹿島" + "," + 5 + "," + "第五システム統括部" + "," + 1);
		 *		bw.newLine();
		 *		bw.close();
		 *
		 *		}catch(FileNotFoundException e) {
		 *		e.printStackTrace();
		 *		}catch(IOException e) {
		 *		e.printStackTrace();
		 *		}
		 *
		 */

	}

}
