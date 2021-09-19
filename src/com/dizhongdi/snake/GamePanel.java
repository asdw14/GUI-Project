package com.dizhongdi.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * ClassName:GamePanel
 * Package:com.dizhongdi.snake
 * Description:
 *  游戏的面板
 * @Date: 2021/9/19 22:56
 * @Author:dizhongdi
 */
public class GamePanel extends JPanel implements KeyListener, ActionListener {

    int length; //蛇的长度
    int[] snakeX = new int[600];    //蛇的X坐标
    int[] snakeY = new int[600];    //蛇的Y坐标
    String fx;
    boolean isStart;    //游戏状态
    //定时器   以ms为单位
    Timer timer = new Timer(100,this);  //100毫秒刷新一次

    int foodX;
    int foodY;
    Random random = new Random();

    //输赢判定
    boolean isFail;

    //积分
    int score;

    public void init(){
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100;       //脑袋的坐标
        snakeX[1] = 75;snakeY[1] = 100;        //第一个身体的坐标
        snakeX[2] = 50;snakeY[2] = 100;        //第二个身体的坐标
        fx="R";     //初始方向向右
        isStart =false;
        //把食物随机分布
        isFail = false;
        foodX = 25 + 25*random.nextInt(34);
        foodY = 75 + 25*random.nextInt(24);

        score = 0;
    }

    public GamePanel() {
        init();
        //获得焦点和键盘监听事件
        this.setFocusable(true);
        this.addKeyListener(this);
        timer.start();  //游戏一开始就启动
    }

    //绘制面板，游戏中所有东西基本都是由这个画笔来画
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);    //清屏
        //绘制静态的面板
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this,g,25,11);    //头部广告栏画上去

        g.fillRect(25,75,850,600);  //默认的游戏界面

        //画食物
        Data.food.paintIcon(this,g,foodX,foodY);

        //画积分
        g.setColor(Color.WHITE);
        g.setFont(new Font("微软雅黑",Font.BOLD,18));   //设置字体
        g.drawString("长度："+length,750,35);
        g.drawString("积分："+score,750,55);

        //把小蛇画上去
        if (fx.equals("R")){
            Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);

        } else if (fx.equals("L")){
            Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);

        }else if (fx.equals("U")){
            Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);

        }else if (fx.equals("D")){
            Data.down.paintIcon(this,g,snakeX[0],snakeY[0]);

        }
        for (int i = 1; i < length; i++) {
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }



        if (isStart==false){
            g.setColor(Color.WHITE);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));   //设置字体
            g.drawString("按下空格开始游戏",300,300);
        }
        if (isFail){
            g.setColor(Color.ORANGE);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));   //设置字体
            g.drawString("游戏失败，按下空格重新开始游戏",150,300);
        }

    }


    //键盘监听事件

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode==KeyEvent.VK_SPACE){    //如果按下的是空格键
            if (isFail){
                //重新开始
                isFail=false;
                init();
            }else {
                isStart = !isStart;   //取反
            }
            repaint();
        }
        if (keyCode==KeyEvent.VK_UP){
            fx="U";
        }else if (keyCode==KeyEvent.VK_DOWN){
            fx="D";
        }else if (keyCode==KeyEvent.VK_LEFT){
            fx="L";
        }else if (keyCode==KeyEvent.VK_RIGHT){
            fx="R";
        }


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (isStart && isFail==false){   //如果游戏是开始状态，就让小蛇动起来
            //蛇吃食物
            if (snakeX[0] ==foodX&&snakeY[0]==foodY){
                //长度++
                length++;
                //分数+10
                score+=10;
                //再次随机食物
                foodX = 25 + 25*random.nextInt(34);
                foodY = 75 + 25*random.nextInt(24);
            }
            for (int i = length-1; i >0; i--) {     //后一节移动到前一节的位置
                snakeX[i] = snakeX[i-1];
                snakeY[i] = snakeY[i-1];
            }
            //边界判断
            if (snakeX[0]>850){
                snakeX[0] = 25;
            }
            //走向
            if(fx.equals("R")){
                snakeX[0] = snakeX[0] + 25;
                //边界判断
                if (snakeX[0]>850){
                    snakeX[0] = 25;
                }
            }else if(fx.equals("L")){
                snakeX[0] = snakeX[0] - 25;
                //边界判断
                if (snakeX[0]<25){
                    snakeX[0] = 850;
                }
            }else if(fx.equals("U")){
                snakeY[0] = snakeY[0] - 25;
                //边界判断
                if (snakeY[0]<75){
                    snakeY[0] = 650;
                }
            } else if(fx.equals("D")){
                snakeY[0] = snakeY[0] + 25;
                //边界判断
                if (snakeY[0]>650){
                    snakeY[0] = 75;
                }
            }
            //失败判定,撞到自己
            for (int i = 1; i < length; i++) {
                if (snakeX[0]==snakeX[i]&&snakeY[0]==snakeY[i]){
                    isFail=true;
                }

            }
            repaint();  //重画页面

        }
        timer.start();  //定时器开启
    }
}
