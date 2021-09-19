package com.dizhongdi.lesson6;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName:TestComboBoxDemo01
 * Package:com.dizhongdi.lesson6
 * Description:
 *      下拉框
 * @Date: 2021/9/19 21:14
 * @Author:dizhongdi
 */
public class TestComboBoxDemo01 extends JFrame {
    public static void main(String[] args) {
        new TestComboBoxDemo01();
    }

    public TestComboBoxDemo01() {
        setVisible(true);
        Container container = getContentPane();
        JComboBox staus = new JComboBox();
        staus.addItem(null);
        staus.addItem("正在热映");
        staus.addItem("已下架");
        staus.addItem("即将上映");
        container.add(staus);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
