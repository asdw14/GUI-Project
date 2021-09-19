package com.dizhongdi.snake;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName:StartGame
 * Package:com.dizhongdi.snake
 * Description:
 *
 * @Date: 2021/9/19 22:55
 * @Author:dizhongdi
 */
public class StartGame{

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,900,720);
        frame.add(new GamePanel());

        Container container = frame.getContentPane();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
