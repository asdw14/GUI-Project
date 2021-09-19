package com.dizhongdi.lesson5;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName:JButtonDemo1
 * Package:com.dizhongdi.lesson5
 * Description:
 *
 * @Date: 2021/9/19 18:00
 * @Author:dizhongdi
 */
public class JButtonDemo1 extends JFrame {
    public static void main(String[] args) {
        new JButtonDemo1();
    }

    public JButtonDemo1() {
        setVisible(true);
        setBounds(500,500,500,500);
        JButton button = new JButton();
        ImageIcon icon = new ImageIcon("src/com/dizhongdi/lesson5/dzd.jpg");
        button.setIcon(icon);
        button.setToolTipText("图片按钮");
        Container container = getContentPane();
        container.add(button);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
