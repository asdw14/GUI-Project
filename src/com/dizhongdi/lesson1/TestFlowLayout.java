package com.dizhongdi.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ClassName:TestFlowLayout
 * Package:com.dizhongdi.lesson1
 * Description:
 *      流式布局
 * @Date: 2021/9/15 2:15
 * @Author:dizhongdi
 */
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("流式布局");
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        frame.setBackground(Color.PINK);
        frame.setSize(500,500);
//        frame.setLayout(new FlowLayout());
        //流式布局左
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        //流式布局右
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        //把按钮添加上去
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setVisible(true);
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
