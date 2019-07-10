/* *
 * 3,5 を割り切れるか判定する処理
 * @autohr onitsuka
 *
 */

package fizzbuzz01;

public class FizzBuzz01Class {

	/**
	 * メインメソッドです
	 * @param args 配列
	 *
	 */

	public static void main(String[] args) {

		System.out.print("引数：");
		int input = new java.util.Scanner(System.in).nextInt();

		for (int i = 1; i <= input; i++) {
			// 入力された数字を繰り返し

			if (i % 3 == 0 && i % 5 == 0) {
				// 数字が3で割り切れるかつ5で割り切れる
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				// 数字が3で割り切れる
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				// 数字が5で割り切れる
				System.out.println("Buzz");
			} else {
				// それ以外の数字
				System.out.println(i);
			}
		}
	}

}
