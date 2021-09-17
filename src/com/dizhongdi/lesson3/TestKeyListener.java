package com.dizhongdi.lesson3;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


/**
 * ClassName:TestKeyListener
 * Package:com.dizhongdi.lesson3
 * Description:
 *
 * @Date: 2021/9/17 2:00
 * @Author:dizhongdi
 */
public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}

class KeyFrame extends Frame{
    public KeyFrame() {
        setBounds(500,300,500,500);
        setVisible(true);
        addKeyListener(new MyKeyListener());
    }
    private class MyKeyListener extends KeyAdapter {
        //键盘按下
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode==KeyEvent.VK_UP){
                System.out.println("你按下了上键");
            }
        }
    }
}
