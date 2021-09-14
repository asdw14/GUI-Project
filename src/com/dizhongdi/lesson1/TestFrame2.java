package com.dizhongdi.lesson1;

import java.awt.*;

/**
 * ClassName:TestFrame2
 * Package:com.dizhongdi.lesson1
 * Description:
 *
 * @Date: 2021/9/15 1:43
 * @Author:dizhongdi
 */
public class TestFrame2 {
    public static void main(String[] args) {
        Myframe myframe1 = new Myframe(100, 100, 200, 200, Color.CYAN);
        Myframe myframe2 = new Myframe(100, 300, 200, 200, Color.green);
        Myframe myframe3 = new Myframe(300, 100, 200, 200, Color.PINK);
        Myframe myframe4 = new Myframe(300, 300, 200, 200, Color.GRAY);
    }
}
class Myframe extends Frame{
    static int id = 0;
    public Myframe(int x, int y, int w, int h,Color color) {
        super("Myfarme"+ (++id));
        setBounds(x,y,w,h);
        setVisible(true);
        setBackground(color);
    }
}
