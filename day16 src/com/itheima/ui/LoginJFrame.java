package com.itheima.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {

    //把登录界面的设置写在构造方法里,这里相当于空参构造。构造方法就是创建对象时进行初始化的
    public LoginJFrame(){
        //创建登录界面时，同时给这个界面设置一些信息
        this.setSize(488,430);
        //设置界面的标题
        this.setTitle("拼图 登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        this.setVisible(true);//创建的界面默认隐藏，要用setVisiable函数把他显示出来
    }
}
