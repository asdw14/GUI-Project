package com.dizhongdi.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * ClassName:TestPanel
 * Package:com.dizhongdi.lesson1
 * Description:
 *
 * @Date: 2021/9/15 1:55
 * @Author:dizhongdi
 */
//Panle可以看成一个空间面板，但不能单独存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();
        frame.setVisible(true);
        frame.setBounds(300,300,500,500);
        frame.setBackground(Color.PINK);
        frame.setLayout(null);
        //panel设置坐标，相对于Frame
        panel.setBounds(50,50,300,300);
        panel.setBackground(Color.CYAN);
        frame.add(panel);
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
