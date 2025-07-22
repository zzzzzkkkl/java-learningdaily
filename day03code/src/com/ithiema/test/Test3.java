package com.ithiema.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*6是个伟大的数字，键盘录入两个整数
        若其中一个是6，最终结果输出true
        若它们的和是6的倍数，最终结果输出true
        其他情况都是false
         */

        //键盘录入两个整数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数；");
        int a=sc.nextInt();
        System.out.println("请再输入一个整数");
        int b=sc.nextInt();

        //a==6 b==6 (a+b)%6==0 true
        boolean result= a==6||b==6||(a+b)%6==0;
        System.out.println(result);
    }
}
