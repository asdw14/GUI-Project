package com.dizhongdi.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ClassName:ExDemo
 * Package:com.dizhongdi.lesson1
 * Description:
 *  练习
 * @Date: 2021/9/15 2:45
 * @Author:dizhongdi
 */
public class ExDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Demo");
        frame.setVisible(true);
        frame.setBounds(500,500,500,500);
        frame.setLayout(new GridLayout(2,1));
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));
        panel1.add(new Button("EAST-1"),BorderLayout.EAST);
        panel1.add(new Button("WEST-1"),BorderLayout.WEST);
        panel2.add(new Button("btn1"));
        panel2.add(new Button("btn2"));
        panel1.add(panel2);
        panel3.add(new Button("EAST-2"),BorderLayout.EAST);
        panel3.add(new Button("WEST-2"),BorderLayout.WEST);
        panel4.add(new Button("btn1"));
        panel4.add(new Button("btn2"));
        panel4.add(new Button("btn3"));
        panel4.add(new Button("btn4"));
        panel3.add(panel4);

        frame.add(panel1);
        frame.add(panel3);
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
