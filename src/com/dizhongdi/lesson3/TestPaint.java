package com.dizhongdi.lesson3;

import java.awt.*;

/**
 * ClassName:TestPaint
 * Package:com.dizhongdi.lesson3
 * Description:
 *      画笔
 * @Date: 2021/9/15 4:25
 * @Author:dizhongdi
 */
public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame{
    public void loadFrame(){
        setSize(500,500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //画笔。画笔需要有颜色，可以画画
        g.setColor(Color.blue);
//        g.drawOval(100,100,100,100);
        //实心的圆
        g.fillOval(100,100,100,100);
        g.setColor(Color.CYAN);
        g.fillRect(100,300,100,100);
    }
}