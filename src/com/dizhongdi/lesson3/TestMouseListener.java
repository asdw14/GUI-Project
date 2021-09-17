package com.dizhongdi.lesson3;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName:TestMouseListener
 * Package:com.dizhongdi.lesson3
 * Description:
 *      鼠标监听事件
 * @Date: 2021/9/17 1:23
 * @Author:dizhongdi
 */
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}

class MyFrame extends Frame{
    //存鼠标点击的点
    List<Point> points;
    public MyFrame(String title) {
        super(title);
        setBounds(500,500,600,600);
        points = new ArrayList<>();
        setVisible(true);
        this.addMouseListener(new MyMouseListener());
    }

    @Override
    public void paint(Graphics g) {
        Iterator<Point> iterator = points.iterator();
        while (iterator.hasNext()){
            Point next = iterator.next();
            g.fillOval(next.x,
                    next.y,
                    10,
                    10);
        }
    }

    private class MyMouseListener extends MouseAdapter{
        //鼠标按下
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame frame = (MyFrame) e.getSource();
            //这个点就是鼠标的点
            points.add(new Point(e.getX(),e.getY()));
            //每次点击鼠标都要重新画一遍
            frame.repaint();
        }
    }
}
