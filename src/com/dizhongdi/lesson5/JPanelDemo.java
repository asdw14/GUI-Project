package com.dizhongdi.lesson5;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName:JPanelDemo
 * Package:com.dizhongdi.lesson4
 * Description:
 *
 * @Date: 2021/9/19 16:57
 * @Author:dizhongdi
 */
public class JPanelDemo extends JFrame {
    public JPanelDemo() throws HeadlessException {
        setVisible(true);
        setSize(500,500);
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();
        jPanel1.setLayout(new GridLayout(1,3));
        jPanel1.add(new Button("1"));
        jPanel1.add(new Button("1"));
        jPanel1.add(new Button("1"));
        jPanel2.setLayout(new GridLayout(1,2));
        jPanel2.add(new Button("2"));
        jPanel2.add(new Button("2"));
        jPanel3.setLayout(new GridLayout(2,1));
        jPanel3.add(new Button("3"));
        jPanel3.add(new Button("3"));
        jPanel4.setLayout(new GridLayout(3,2));
        jPanel4.add(new Button("4"));
        jPanel4.add(new Button("4"));
        jPanel4.add(new Button("4"));
        jPanel4.add(new Button("4"));
        jPanel4.add(new Button("4"));
        jPanel4.add(new Button("4"));
        Container container = getContentPane();
        container.setLayout(new GridLayout(2,1,10,10));
        container.add(jPanel1);
        container.add(jPanel3);
        container.add(jPanel4);
        container.add(jPanel2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelDemo();
    }
}
