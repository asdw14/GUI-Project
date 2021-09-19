package com.dizhongdi.lesson6;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName:TestComboBoxDemo01
 * Package:com.dizhongdi.lesson6
 * Description:
 *      列表
 * @Date: 2021/9/19 21:14
 * @Author:dizhongdi
 */
public class TestComboBoxDemo02 extends JFrame {
    public static void main(String[] args) {
        new TestComboBoxDemo02();
    }

    public TestComboBoxDemo02() {
        setVisible(true);
        Container container = getContentPane();
        String[] strs = {"1,2,3"};
        JList jList = new JList(strs);
        container.add(jList);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
