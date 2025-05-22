package xyz.ecsv;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String name = "デモアプリ";
        // コンストラクタの引数でアプリタイトルを設定
        JFrame frame = new JFrame(name);
        // デスクトップに表示する画面のサイズ（幅,高さ）
        frame.setSize(500,500);
        // このウィンドウをデスクトップ上に表示する
        frame.setVisible(true);

        // 画面上下左右中央にウィンドウを表示させる
        frame.setLocationRelativeTo(null);

        // 「X」ボタンで画面を閉じたらアプリケーションを終了させる
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 画面上に表示するメッセージ
        JLabel label = new JLabel("Hello World");

        // メッセージを画面上部に表示させる
        label.setVerticalAlignment(JLabel.TOP);

        // 画面にメッセージを追加する
        frame.add(label);
    }
}