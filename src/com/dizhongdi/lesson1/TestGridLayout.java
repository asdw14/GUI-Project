package com.dizhongdi.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ClassName:TestGridLayout
 * Package:com.dizhongdi.lesson1
 * Description:
 *      表格布局
 * @Date: 2021/9/15 2:33
 * @Author:dizhongdi
 */
public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("GridLayout");
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setBackground(Color.orange);
        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        Button btn4 = new Button("btn4");
        Button btn5 = new Button("btn5");
        Button btn6 = new Button("btn6");
        //设置表格布局三行两列
        frame.setLayout(new GridLayout(3,2));
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);

        //监听事件，监听窗口关闭事件
        frame.addWindowListener(new WindowAdapter() {
            //窗口点击关闭需要做的事
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
            }
        });

    }
}
