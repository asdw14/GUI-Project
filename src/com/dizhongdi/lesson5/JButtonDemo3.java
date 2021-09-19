package com.dizhongdi.lesson5;

import javax.swing.*;
import javax.swing.plaf.ComboBoxUI;
import java.awt.*;

/**
 * ClassName:JButtonDemo2
 * Package:com.dizhongdi.lesson5
 * Description:
 *
 * @Date: 2021/9/19 18:00
 * @Author:dizhongdi
 */
public class JButtonDemo3 extends JFrame {
    public static void main(String[] args) {
        new JButtonDemo3();
    }

    public JButtonDemo3() {
        setVisible(true);
        setBounds(500,500,500,500);
        //多选框
        JCheckBox checkBox1 = new JCheckBox("JCheckBox1");
        JCheckBox checkBox2 = new JCheckBox("JCheckBox2");
        Container container = getContentPane();
        container.add(checkBox1,BorderLayout.CENTER);
        container.add(checkBox2,BorderLayout.WEST);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
