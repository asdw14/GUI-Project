package com.dizhongdi.lesson5;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName:JScrollDemo
 * Package:com.dizhongdi.lesson4
 * Description:
 *
 * @Date: 2021/9/19 17:12
 * @Author:dizhongdi
 */
public class JScrollDemo extends JFrame {
    public JScrollDemo() {
        setVisible(true);
        Container container = getContentPane();
        JTextArea jTextArea = new JTextArea(20,20);
        jTextArea.setText("弟中弟的练习");
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        container.add(jScrollPane);
        setBounds(500,500,500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}
