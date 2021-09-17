package com.dizhongdi.lesson3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * ClassName:TestWindowListener
 * Package:com.dizhongdi.lesson3
 * Description:
 *
 * @Date: 2021/9/17 1:47
 * @Author:dizhongdi
 */
public class TestWindowListener {
    public static void main(String[] args) {
        new WindowFrame("窗口监听事件");
    }
}

class WindowFrame extends Frame{
    public WindowFrame(String title) {
        super(title);
        setBounds(500,500,500,500);
        setBackground(Color.PINK);
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("windowClosed");

            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("windowIconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowDeiconified");

            }

            //窗口获得焦点
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated");

            }

            //窗口失去焦点
            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowDeactivated");

            }
        });
        setVisible(true);
    }

    private class MyWindowListener extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            Frame frame = (Frame) e.getSource();
            //不显示窗口
            frame.setVisible(false);
            System.exit(0);
        }
    }
}



