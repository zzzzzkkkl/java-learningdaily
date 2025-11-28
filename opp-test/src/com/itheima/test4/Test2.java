package com.itheima.test4;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //键盘录入的两套体系不能混用
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num=sc.nextInt();
        System.out.println(num);
        System.out.println("请输入一个字符串");
        String line=sc.nextLine();
        System.out.println(line);
    }
}
