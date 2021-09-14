package com.dizhongdi.lesson;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ClassName:TestText01
 * Package:com.dizhongdi.lesson
 * Description:
 *
 * @Date: 2021/9/15 3:44
 * @Author:dizhongdi
 */
public class TestText01 {
    public static void main(String[] args) {
        windowClosing(new MyFrame());
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

class MyFrame extends Frame{
    public MyFrame(){
        TextField textField = new TextField();
        setVisible(true);
        add(textField);
        pack(); //自适应
        //按下enter就会触发这个输入框的事件
        textField.addActionListener(new MyActionListener03());
        //设置替换编码
        textField.setEchoChar('*');
    }
}

class MyActionListener03 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取一些资源,返回的一个对象
        TextField textField = (TextField) e.getSource();
        //获得输入框的文本
        String text = textField.getText();
        System.out.println(text);
        textField.setText("");
    }
}