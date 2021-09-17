package com.dizhongdi.lesson4;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName:JFrameDemo
 * Package:com.dizhongdi.lesson4
 * Description:
 *
 * @Date: 2021/9/17 2:12
 * @Author:dizhongdi
 */
public class JFrameDemo2 {

    public static void main(String[] args) {
        new MyJframe2().init();
    }
}

class MyJframe2 extends JFrame{
    public void init(){
        Container contentPane = this.getContentPane();
        contentPane.setBackground(Color.CYAN);
        this.setVisible(true);
        this.setBounds(300,300,300,300);
        JLabel label = new JLabel();
        label.setText("JFrame的测试");
        this.add(label);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        //关闭事件
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
