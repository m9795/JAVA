package jangen_game;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class TextMaker {
	
	//テキストを作るメソッド
	static JLabel makeText(String str, int size, Color color) {
		//JLabelクラスをインスタンス化
		JLabel label = new JLabel(str);
		label.setForeground(color);
		label.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, size));
		//テキストの位置を、水平方向の中心にする
		label.setHorizontalAlignment(JLabel.CENTER);
		//テキストの位置を、水平方向の中心にする
		label.setVerticalAlignment(JLabel.CENTER);
		//作ったテキストを返す
		return label;
	}

}
