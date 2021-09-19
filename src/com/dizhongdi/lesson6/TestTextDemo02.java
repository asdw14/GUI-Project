package com.dizhongdi.lesson6;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName:TestTextDemo
 * Package:com.dizhongdi.lesson6
 * Description:
 *      密码框
 * @Date: 2021/9/19 21:33
 * @Author:dizhongdi
 */
public class TestTextDemo02 extends JFrame {
    public static void main(String[] args) {
        new TestTextDemo02();
    }

    public TestTextDemo02() {
        setVisible(true);
        Container contentPane = getContentPane();
        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');
        contentPane.add(passwordField);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
