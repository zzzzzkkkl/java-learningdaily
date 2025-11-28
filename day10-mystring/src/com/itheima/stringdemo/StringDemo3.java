package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //键盘录入abc
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        //代码定义一个abc
        String str2="abc";
        //比较
        System.out.println(str==str2);
    }
}
