package com.dizhongdi.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ClassName:TestBorderLayout
 * Package:com.dizhongdi.lesson1
 * Description:
 *  东西南北中布局
 * @Date: 2021/9/15 2:25
 * @Author:dizhongdi
 */
public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout");
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setBackground(Color.orange);
        Button east = new Button("EAST");
        Button north = new Button("NORTH");
        Button west = new Button("WEST");
        Button south = new Button("SOUTH");
        Button center = new Button("CENTER");

        frame.add(east,BorderLayout.EAST);
        frame.add(north,BorderLayout.NORTH);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(center,BorderLayout.CENTER);
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
