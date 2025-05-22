package xyz.ecsv;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.awt.BorderLayout;
import java.awt.Container;


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

        JPanel panel = new JPanel();
        for (int n = 0; n < 10; n++) {
            System.out.println(n);

            JButton button0 = new JButton("0");
            JButton button1 = new JButton("1");
            JButton button2 = new JButton("2");
            JButton button3 = new JButton("3");
            JButton button4 = new JButton("4");
            JButton button5 = new JButton("5");
            JButton button6 = new JButton("6");
            JButton button7 = new JButton("7");
            JButton button8 = new JButton("8");
            JButton button9 = new JButton("9");

            panel.add(button0);
            panel.add(button1);
            panel.add(button2);
            panel.add(button3);
            panel.add(button4);
            panel.add(button5);
            panel.add(button6);
            panel.add(button7);
            panel.add(button8);
            panel.add(button9);
            
            Container contentPane=frame.getContentPane();
            contentPane.add(panel, BorderLayout.CENTER);

        }
////        // 画面上に表示するメッセージ
////        JLabel label = new JLabel("Hello World");
////
////        // メッセージを画面上部に表示させる
////        label.setVerticalAlignment(JLabel.TOP);
////
////        // 画面にメッセージを追加する
////        frame.add(label);
//
//        JButton button0 = new JButton("0");
//        JButton button1 = new JButton("1");
//        JButton button2 = new JButton("2");
//        JButton button3 = new JButton("3");
//        JButton button4 = new JButton("4");
//        JButton button5 = new JButton("5");
//        JButton button6 = new JButton("6");
//        JButton button7 = new JButton("7");
//        JButton button8 = new JButton("8");
//        JButton button9 = new JButton("9");
//
//        panel.add(button0);
//        panel.add(button1);
//        panel.add(button2);
//        panel.add(button3);
//        panel.add(button4);
//        panel.add(button5);
//        panel.add(button6);
//        panel.add(button7);
//        panel.add(button8);
//        panel.add(button9);
//
//        Container contentPane=frame.getContentPane();
//        contentPane.add(panel, BorderLayout.CENTER);
    }

    /**
     * 計算してくれる関数
     * @param text 6 / 7 + 5 * 9みたいに渡す
     */
    private static void aaa(String text) {
        Expression expression = new ExpressionBuilder(text).build();
        double result = expression.evaluate();
        System.out.println(result);  // 6.714285714285714
    }
}