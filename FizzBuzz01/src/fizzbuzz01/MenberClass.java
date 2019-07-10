/* *
 * csvを読み込む処理
 * @autohr onitsuka
 *
 */
package fizzbuzz01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenberClass {

	/**
	 * メインメソッドです
	 * @param args 配列
	 *
	 */

	public static void main(String[] args) {
		try {

			// csvファイルの文字コードが"SJIS"の場合
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("member.csv"), "SJIS"));

			String s;

			// ファイルを行単位で読み込む
			while ((s = br.readLine()) != null) {
				// カンマで分割したString配列を得る
				String array[] = s.split(",");
				// データ数をチェックしたあと代入、プリントする
				if (array.length != 4)
					throw new NumberFormatException();
				String name = array[0];
				int number = Integer.parseInt(array[1]);
				String busho = array[2];
				int gender = Integer.parseInt(array[3]);
				// 内容を出力する
				System.out.println("--------------------------");
				System.out.println("名前：" + name);
				System.out.println("番号：" + String.format("%04d", number));
				System.out.println("部署：" + busho);

				if (gender == 1) {
					System.out.println("性別：" + "男");
				} else if (gender == 0) {
					System.out.println("性別：" + "女");
				} else {
					System.out.println("性別：" + "不明");
				}
				System.out.println("--------------------------");
			}
			br.close();
		} catch (IOException e) {
			System.out.println("入出力エラーがありました");
		} catch (NumberFormatException e) {
			System.out.println("フォーマットエラーがありました");
		}
	}

}
