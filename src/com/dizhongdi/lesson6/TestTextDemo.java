package com.dizhongdi.lesson6;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName:TestTextDemo
 * Package:com.dizhongdi.lesson6
 * Description:
 *
 * @Date: 2021/9/19 21:33
 * @Author:dizhongdi
 */
public class TestTextDemo extends JFrame {
    public static void main(String[] args) {
        new TestTextDemo();
    }

    public TestTextDemo() {
        setVisible(true);
        Container contentPane = getContentPane();
        JTextField hello = new JTextField("hello");
        JTextField world = new JTextField("world",20);

        contentPane.add(hello,BorderLayout.NORTH);
        contentPane.add(world,BorderLayout.SOUTH);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
