package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class MyJFrame2 extends JFrame implements MouseListener {
    //创建按钮对象
    JButton jtb1=new JButton("点我啊");
    //创建按钮对象
    JButton jtb2=new JButton("再点我啊");
    public MyJFrame2() {
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


        //设置位置和宽高
        jtb1.setBounds(0,0,100,50);
        //给按钮添加对象
        jtb1.addMouseListener(this);


        //把按钮添加到界面当中
        this.getContentPane().add(jtb1);



        //让整个界面显示出来
        this.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标划出");
    }
}
