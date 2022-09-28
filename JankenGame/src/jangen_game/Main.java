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
		JLabel label = new JLabel("「さあ、じゃんけんで勝負だ！」");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("MA ゴシック", Font.PLAIN, 24));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		headerPanel.add(label);
		//ウインドウにヘッダーパネルを追加
		frame.add(headerPanel, BorderLayout.NORTH);	
		
		//コンテンツパネルを作成
		JPanel contentsPanel = makePanel(Color.WHITE);
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
}
