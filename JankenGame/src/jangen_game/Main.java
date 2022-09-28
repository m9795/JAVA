package jangen_game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
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
		
		//JPanelクラスをインスタンス化
		JPanel headerPanel = new JPanel();
		//パネルの色を黒にする
		headerPanel.setBackground(Color.BLACK);
		//ヘッダーパネルのサイズ設定
		headerPanel.setPreferredSize(new Dimension(640, 50));
		//ウインドウにヘッダーパネルを追加
		frame.add(headerPanel, BorderLayout.NORTH);	
		
		//コンテンツパネル
		JPanel contentsPanel = new JPanel();
		contentsPanel.setBackground(Color.WHITE);
		frame.add(contentsPanel, BorderLayout.CENTER);
		
		//フッターパネル
		JPanel footerPanel = new JPanel();
		footerPanel.setBackground(Color.BLACK);
		footerPanel.setPreferredSize(new Dimension(640, 50));
		frame.add(footerPanel, BorderLayout.SOUTH);
		
		//ウィンドウを表示
		frame.setVisible(true);
	}

}
