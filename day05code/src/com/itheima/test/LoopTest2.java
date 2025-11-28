package com.itheima.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*键盘录入一个大于等于2的整数x，计算并返回x的平方根
        结果保留整数

        分析：10的平方根
        1*1=1<10
        2*2=4<10
        3*3=9<10
        4*4=16>10
        所以10的平方根在3-4之间
         */

        //键盘录入一个整数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个大于2的整数");
        int number=sc.nextInt();

        //从1开始循环判断
        for(int i=1;i<number;i++){
            if(i*i<=number&&(i+1)*(i+1)>number){
                System.out.println("平方根是"+i);
            }
        }
    }
}
