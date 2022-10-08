package jangen_game;

public class Judge {
	//じゃんけんの結果のテキストを取得するメソッド
	static String getResultText(int playerHand, int computerHand) {
		//じゃんけんの結果のテキストを代入する変数を初期化
		String resultText = "";
		//じゃんけんの結果を出すための計算
		int result = (playerHand - computerHand + 3) % 3;
		//あいこのとき
		if (result == 0) {
			resultText = "あいこだよ( 'ω' )ノ";
		}
		//プレイヤー負け
		else if (result == 1) {
			resultText = "君の負けだよ( ^O^ )/";
		}
		//プレイヤー価値
		else if (result == 2) {
			resultText = "君の勝ちだよ...(( +_+ ))";
		}
		//結果のテキストを返す
		return resultText;
	}
}
