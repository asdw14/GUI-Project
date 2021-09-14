package com.dizhongdi.lesson;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ClassName:TestActionEventTwo
 * Package:com.dizhongdi.lesson
 * Description:
 *
 * @Date: 2021/9/15 3:08
 * @Author:dizhongdi
 */
public class TestActionEventTwo {
    public static void main(String[] args) {
        Frame frame = new Frame("TestActionEvent");
        Button button = new Button("start");
        Button button2 = new Button("stop");
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.add(button,BorderLayout.SOUTH);
        frame.add(button2,BorderLayout.NORTH);
        frame.setBackground(Color.PINK);
        button.setActionCommand("button2-stop");
        //因为addActionListener（）需要一个ActionListener，所以需要构建一个ActionListener
        MyActionListener2 myActionListener2 = new MyActionListener2();
        button.addActionListener(myActionListener2);
        button2.addActionListener(myActionListener2);
        windowClosing(frame);
    }

    //关闭窗口的事件
    public static void windowClosing(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyActionListener2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮被点击"+ e.getActionCommand());
    }
}

