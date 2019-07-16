package fizzbuzz01;

/* *
 * 3,5 を割り切れるか判定する処理
 * @autohr onitsuka
 *
 * */
public class FizzBuzzAnsClass {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("引数がありません。");
			return;
		}
		if (isNumber(args[0]) == false) {
			System.out.println("引数が数字ではありません。");
			return;
		}
		int num = Integer.parseInt(args[0]);
		System.out.println("引数：" + num);

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 & i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}

	/**
	 * 数字かどうか判定します。
	 *
	 * @param 判定する数字
	 * @return true:数字 / false:数字以外
	 */
	private static boolean isNumber(String num) {
		try {
			Integer.parseInt(num);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}