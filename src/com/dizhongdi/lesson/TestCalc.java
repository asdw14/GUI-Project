package com.dizhongdi.lesson;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ClassName:TestCalc
 * Package:com.dizhongdi.lesson
 * Description:
 *      简易计算器
 * @Date: 2021/9/15 3:57
 * @Author:dizhongdi
 */
public class TestCalc {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.loadFrame();
        windowClosing(calculator);
    }
    //关闭窗口的事件
    public static void windowClosing(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class Calculator extends Frame{
    TextField num1 = new TextField(10);
    TextField num2 = new TextField(10);
    TextField num3 = new TextField(20);
    public void loadFrame() {
        setVisible(true);
        pack();
        setLayout(new FlowLayout());
        Button button = new Button("=");

        button.addActionListener(new CalculatorListener());

        Label x = new Label("X");
        add(num1);
        add(x);
        add(num2);
        add(button);
        add(num3);
    }
    private class CalculatorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int text1 = Integer.parseInt(num1.getText());
            int text2 = Integer.parseInt(num2.getText());
            num3.setText(String.valueOf(text1+text2));
        }
    }
}

