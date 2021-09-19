package com.dizhongdi.lesson5;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName:JButtonDemo2
 * Package:com.dizhongdi.lesson5
 * Description:
 *
 * @Date: 2021/9/19 18:00
 * @Author:dizhongdi
 */
public class JButtonDemo2 extends JFrame {
    public static void main(String[] args) {
        new JButtonDemo2();
    }

    public JButtonDemo2() {
        setVisible(true);
        setBounds(500,500,500,500);
        //单选框
        JRadioButton button1 = new JRadioButton("JRadioButton1");
        JRadioButton button2 = new JRadioButton("JRadioButton1");
        JRadioButton button3 = new JRadioButton("JRadioButton1");
        //由于单选框只能选一个，分组，一个组只能选一个
        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);
        Container container = getContentPane();
        container.add(button1,BorderLayout.WEST);
        container.add(button2,BorderLayout.NORTH);
        container.add(button3,BorderLayout.CENTER);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
