package com.itheima.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        /*键盘接受一个字符串，程序判断该字符串是否对称，打印是或不是
        对称字符串：123321、111
         */
        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        //反转字符串
        String result=new StringBuilder().append(str).reverse().toString();
        //比较
        if(str.equals(result)){
            System.out.println("是");
        }else{
            System.out.println("不是");
        }
    }
}
