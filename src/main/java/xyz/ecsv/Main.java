package xyz.ecsv;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;


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

        JTextField text = new JTextField();
        text.setColumns(1);
        panel.add(text);
        Container contentPane = frame.getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);

        for (int n = 0; n < 10; n++) {
            System.out.println(n);
            Integer i = Integer.valueOf(n);
            String str = i.toString();

            setButton(frame,  panel, str);
        }
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "+",
                "-",
                "*",
                "/",
                ".",
                "=",
                "c",
                "del"
        ));
        for (String s : list) {
            setButton(frame, panel, s);
        }


////        // 画面上に表示するメッセージ
////        JLabel label = new JLabel("Hello World");
////
////        // メッセージを画面上部に表示させる
////        label.setVerticalAlignment(JLabel.TOP);
////
////        // 画面にメッセージを追加する
////        frame.add(label);

    }

    private static void setButton(JFrame frame, JPanel panel, String buttonName){
        JButton button = new JButton(buttonName);
        panel.add(button);
        Container contentPane = frame.getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);
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