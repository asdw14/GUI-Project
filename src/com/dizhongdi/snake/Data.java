package com.dizhongdi.snake;

import javax.swing.*;
import java.net.URL;

/**
 * ClassName:Data
 * Package:com.dizhongdi.snake
 * Description:
 *  数据中心
 * @Date: 2021/9/19 22:44
 * @Author:dizhongdi
 */
public class Data {
//    public static URL headerURL = Data.class.getResource("statics/header.png");
//
    public static ImageIcon header = new ImageIcon("src/statics/header.png");

//    public static URL upURL = Data.class.getResource("src/statics/up.png");
//    public static URL downURL = Data.class.getResource("statics/down.png");
//    public static URL leftURL = Data.class.getResource("statics/left.png");
//    public static URL rightURL = Data.class.getResource("statics/right.png");

    public static ImageIcon up = new ImageIcon("src/statics/up.png");
    public static ImageIcon down = new ImageIcon("src/statics/down.png");
    public static ImageIcon left = new ImageIcon("src/statics/left.png");
    public static ImageIcon right = new ImageIcon("src/statics/right.png");

//    public static URL bodyURL = Data.class.getResource("statics/body.png");
    public static ImageIcon body = new ImageIcon("src/statics/body.png");

//    public static URL foodURL = Data.class.getResource("statics/food.png");
    public static ImageIcon food = new ImageIcon("src/statics/food.png");

    public static void main(String[] args) {
        System.out.println(header);
    }
}
