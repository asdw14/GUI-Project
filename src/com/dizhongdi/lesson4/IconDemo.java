package com.dizhongdi.lesson4;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName:IconDemo
 * Package:com.dizhongdi.lesson4
 * Description:
 *
 * @Date: 2021/9/19 16:24
 * @Author:dizhongdi
 */
public class IconDemo extends JFrame implements Icon {

    public static void main(String[] args) {
        new IconDemo().init();
    }
    private int width;
    private int height;

    public IconDemo(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public IconDemo() {


    }
    public void init(){
        IconDemo iconDemo = new IconDemo(10, 10);
        JLabel label = new JLabel("IconDemo", iconDemo, SwingConstants.CENTER);
        Container container = getContentPane();
        container.add(label);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}
