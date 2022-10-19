package exception;

public class Exception02 {
	public static void main(String[] args) {
		// try-catch-finally文で例外処理
		// tryブロックには、例外が発生する可能性がある処理を記述
		try {
			System.out.println("100 ÷ 0 は？");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		// catchブロックには例外が発生したときに実行する処理を記述
		} catch (ArithmeticException e) {
			System.out.println("例外が発生");
		// finallyブロックには例外発生の有無にかかわらず必ず実行する処理を記述
		} finally {
			System.out.println("プログラム終了");
		}
	}
}
