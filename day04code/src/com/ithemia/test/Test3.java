package com.ithemia.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*键盘录入一个整数，表示身上的钱
        如果大于等于100元，就去吃网红餐厅
        否则去吃沙县小吃
         */

        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你有多少钱：");
        int money=sc.nextInt();

        //判断
        if(money>=100){
            System.out.println("去网红餐厅吃饭");
        }else{
            System.out.println("去吃沙县小吃");
        }
    }
}
