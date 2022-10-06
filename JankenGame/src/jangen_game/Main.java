package jangen_game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	//じゃんけんの手の配列を作る
	private static String[] hands = {"グー", "チョキ", "パー"};

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
		JPanel headerPanel = PanelMaker.makePanel(Color.BLACK, 640, 50);
		headerPanel.setLayout(new BorderLayout());
		//テキストを作成
		JLabel headerLabel = TextMaker.makeText("「さあ、じゃんけんで勝負だ！」", 24, Color.WHITE);
		//ヘッダーパネルにテキストを追加
		headerPanel.add(headerLabel);
		//ウインドウにヘッダーパネルを追加
		frame.add(headerPanel, BorderLayout.NORTH);	
		
		//コンテンツパネルを作成
		JPanel contentsPanel = PanelMaker.makePanel(Color.WHITE);
		contentsPanel.setLayout(new BorderLayout());
		//テキストを作成
		JLabel contentsLabel = TextMaker.makeText("じゃんけん...", 54, Color.BLACK);
		//コンテンツパネルにテキストを追加
		contentsPanel.add(contentsLabel);
		//ウィンドウにコンテンツパネルを追加
		frame.add(contentsPanel, BorderLayout.CENTER);
		
		//フッターパネル作成
		JPanel footerPanel = PanelMaker.makePanel(Color.BLACK, 640, 50);
		//フッターパネルにレイアウトマネージャーとしてGridLayoutを指定
		footerPanel.setLayout(new GridLayout());
		
		//じゃんけんの手のボタンを作る
		for (String hand : hands) {
			//JButtonクラスをインスタンス化
			JButton button = new JButton(hand);
			button.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 24));
			//ボタンが押されたら、ButtonActionListenerクラスのactionPerformedメソッドを実行
			button.addActionListener(new ButtonActionListener());
			//グーボタンをフッターパネルに追加
			footerPanel.add(button);
		}
		
		
		//ウィンドウにフッターパネルを追加
		frame.add(footerPanel, BorderLayout.SOUTH);
		
		//ウィンドウを表示
		frame.setVisible(true);
	}
	
	//ボタンが押された時のためのクラス
	static class ButtonActionListener implements ActionListener {
		//ボタンが押されたときに呼ばれるメソッド
		public void actionPerformed(ActionEvent e) {
			//押されたボタンを、コンソールに表示
			System.out.println(e.getActionCommand());
		}
	}
	
}
