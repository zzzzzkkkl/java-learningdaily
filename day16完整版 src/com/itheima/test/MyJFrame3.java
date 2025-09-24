package com.itheima.test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends MyJFrame implements KeyListener {
    public MyJFrame3(){
        //设置界面的宽高
        this.setSize(603, 680);//单位是像素
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认的居中方式，这样才能按坐标的位置添加组件
        this.setLayout(null);

        //给整个窗体添加键盘监听
        //调用者this：本类对象，当前的界面对象，表示要给整个界面添加监听
        //addKeyListener：表示给本界面添加键盘监听
        //参数this：当时间触发后，会执行本类中的对应代码
        this.addKeyListener(this);

        //让整个界面显示出来
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //细节：
    //1、如果我们按下一个按键没有松开，那么会重复的调用keyPress
    //2、键盘里那么多按键，怎么区分？每个按键都有一个编号与之对应
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("按下松开");
        //获取键盘上每一个按键的编号
        e.getKeyCode();
    }
}
