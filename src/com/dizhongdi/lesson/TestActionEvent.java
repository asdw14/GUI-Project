package com.dizhongdi.lesson;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ClassName:TestActionEvent
 * Package:com.dizhongdi.lesson
 * Description:
 *      按下按钮触发一些事件
 * @Date: 2021/9/15 2:55
 * @Author:dizhongdi
 */
public class TestActionEvent {
    public static void main(String[] args) {
        Frame frame = new Frame("TestActionEvent");
        Button button = new Button("button");
        frame.setVisible(true);
        frame.add(button);
        frame.setBackground(Color.PINK);
        //因为addActionListener（）需要一个ActionListener，所以需要构建一个ActionListener
        button.addActionListener(new MyActionListener());
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

class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮被点击");
    }
}
