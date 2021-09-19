package com.dizhongdi.lesson4;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * ClassName:ImageIconDemo
 * Package:com.dizhongdi.lesson4
 * Description:
 *
 * @Date: 2021/9/19 16:41
 * @Author:dizhongdi
 */
public class ImageIconDemo extends JFrame {

    public static void main(String[] args) {
        new ImageIconDemo();
    }
    public ImageIconDemo() {
        setVisible(true);
        URL url = ImageIconDemo.class.getResource("/dzd.jpg");
//        ImageIcon imageIcon = new ImageIcon("C:\\Users\\null\\Desktop\\dzd.jpg");
        ImageIcon imageIcon = new ImageIcon("src/com/dizhongdi/lesson4/dzd.jpg");
        JLabel label = new JLabel("imageIcon");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setIcon(imageIcon);
        Container container = getContentPane();
        container.add(label);
        setBounds(500,500,600,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
