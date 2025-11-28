package com.itheima.test4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入
        //1、遇到空格、制表符、回车就停止接收。这些符号后的数据不会在接收
        //nextInt()；接收整数
        //nextDouble()；接收小数
        //next(),接收字符串
        //2、可以接收空格、制表符。遇到回车不接收
        //nextLine();接收字符串
        /*Scanner sc=new Scanner(System.in);
        System.out.println("请输入下一个整数");
        int num1=sc.nextInt();
        System.out.println(num1);
        System.out.println("请输入第二个整数");
        int num2=sc.nextInt();
        System.out.println(num2);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1=sc.next();
        System.out.println(str1);
        System.out.println("请输入第二个字符串");
        String str2=sc.next();
        System.out.println(str2);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1=sc.nextLine();
        System.out.println(s1);
        System.out.println("请输入第二个字符串");
        String s2=sc.nextLine();
        System.out.println(s2);
    }
}
