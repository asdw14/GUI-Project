package com.dizhongdi.lesson1;

import java.awt.*;

/**
 * ClassName:TestFrame
 * Package:com.dizhongdi.lesson1
 * Description:
 *      GUI的第一个界面
 * @Date: 2021/9/15 1:29
 * @Author:dizhongdi
 */
public class TestFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("我的第一个Java程序");
        //设置可见
        frame.setVisible(true);
        //设置背景颜色
        frame.setBackground(new Color(62, 252, 213));
        //设置窗口大小
        frame.setSize(400,400);
        //设置弹出的初始位置
        frame.setLocation(500,600);
        //设置窗口大小不可变
        frame.setResizable(false);
    }
}
