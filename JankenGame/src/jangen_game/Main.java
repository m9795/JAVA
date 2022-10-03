package jangen_game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//JFrameクラスをインスタンス化
		JFrame frame = new JFrame("じゃんけんゲーム");
		//ウィンドウのサイズ指定
		frame.setSize(640, 480);
		//ウィンドウの位置を画面中心へ
		frame.setLocationRelativeTo(null);
		//xでアプリ終了させる
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ウィンドウサイズ変更できないようにする
		frame.setResizable(false);
		
		//ヘッダーパネルを作成
		JPanel headerPanel = makePanel(Color.BLACK, 640, 50);
		headerPanel.setLayout(new BorderLayout());
		//テキストを作成
		JLabel headerLabel = makeText("「さあ、じゃんけんで勝負だ！」", 24, Color.WHITE);
		//ヘッダーパネルにテキストを追加
		headerPanel.add(headerLabel);
		//ウインドウにヘッダーパネルを追加
		frame.add(headerPanel, BorderLayout.NORTH);	
		
		//コンテンツパネルを作成
		JPanel contentsPanel = makePanel(Color.WHITE);
		contentsPanel.setLayout(new BorderLayout());
		//テキストを作成
		JLabel contentsLabel = makeText("じゃんけん...", 54, Color.BLACK);
		//コンテンツパネルにテキストを追加
		contentsPanel.add(contentsLabel);
		//ウィンドウにコンテンツパネルを追加
		frame.add(contentsPanel, BorderLayout.CENTER);
		
		//フッターパネル作成
		JPanel footerPanel = makePanel(Color.BLACK, 640, 50);
		//ウィンドウにフッターパネルを追加
		frame.add(footerPanel, BorderLayout.SOUTH);
		
		//ウィンドウを表示
		frame.setVisible(true);
	}
	
	//パネルを作るメソッド(幅と高さを指定する用)
	static JPanel makePanel(Color color, int width, int height) {
		//JPanelクラスをインスタンス化
		JPanel panel = new JPanel();
		//パネルの色を変更する
		panel.setBackground(color);
		//パネルのサイズ設定「横、縦」
		panel.setPreferredSize(new Dimension(width, height));
		//作ったパネルを返す
		return panel;	
	}
	
	//パネルを作るメソッド(幅と高さを指定しない用)
	static JPanel makePanel(Color color) {
		//JPanelクラスをインスタンス化
		JPanel panel = new JPanel();
		//パネルの色を変更する
		panel.setBackground(color);
		//作ったパネルを返す
		return panel;	
	}
	
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
