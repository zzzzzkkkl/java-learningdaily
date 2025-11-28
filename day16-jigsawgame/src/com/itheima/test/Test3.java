package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        //设置界面的宽高
        jFrame.setSize(603,680);//单位是像素
        //设置界面的标题
        jFrame.setTitle("事件演示");
        //设置界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(3);
        //取消默认的居中方式，这样才能按坐标的位置添加组件
        jFrame.setLayout(null);

       //创建按钮对象
        JButton jtb=new JButton("点我啊");
        //设置位置和宽高
        jtb.setBounds(0,0,100,50);
        /*//给按钮添加动作监听
        //jtb：组件对象，表示你要给那个组件添加事件
        //addActionListener:表示我要给组件添加哪个事件监听（动作监听包含鼠标左键点击，空格）
        //参数：表示事件被触发后要执行的代码（这里就表示jtb被左击后执行MyActionListener里的代码）
        jtb.addActionListener(new MyActionListener());
        //把按钮添加到界面中
        jFrame.getContentPane().add(jtb);*/

        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("达咩~不要点我呀");
            }
        });

        //把按钮添加到界面中
        jFrame.getContentPane().add(jtb);

        jFrame.setVisible(true);
    }
}
