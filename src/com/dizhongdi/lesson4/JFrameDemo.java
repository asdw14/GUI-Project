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
public class JFrameDemo {
    public void init(){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        //无效
        jFrame.setBackground(Color.PINK);
        jFrame.setBounds(300,300,300,300);
        Label label = new Label();
        label.setText("JFrame的测试");
        jFrame.add(label);
        //关闭事件
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new JFrameDemo().init();
    }
}

