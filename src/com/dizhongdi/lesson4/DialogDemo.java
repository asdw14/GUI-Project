package com.dizhongdi.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ClassName:DialogDemo
 * Package:com.dizhongdi.lesson4
 * Description:
 *
 * @Date: 2021/9/18 23:31
 * @Author:dizhongdi
 */
public class DialogDemo extends JFrame{
    public DialogDemo() {
        setVisible(true);
        Container contentPane = getContentPane();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Button button = new Button("弹窗");
        contentPane.setLayout(null);
        setBounds(500,500,500,500);
        button.setBounds(200,200,50,50);
        contentPane.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyJDialg();
            }
        });
    }

    public static void main(String[] args) {
        new DialogDemo();
    }

}
class MyJDialg extends JDialog{
    public MyJDialg() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);
        contentPane.add(new Label("弟中弟"));
    }
}

