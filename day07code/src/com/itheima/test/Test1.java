package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*计算机票价格
        输入机票原价、月份和头等舱或经济舱
        旺季（5-10月）头等舱9折、经济舱8.5折
        淡季（11月到来年4月）头等舱7折、经济舱6.5折
         */

        //键盘录入机票原价等等
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的机票价格：");
        int price=sc.nextInt();
        System.out.println("请输入月份：");
        int month=sc.nextInt();
        System.out.println("请输入舱型：（0 头等舱 1 经济舱");
        int cabin=sc.nextInt();

        //先判断淡旺季，再判断是否是头等舱
        if(month<=10&&month>=5){
            if(cabin==0){
                System.out.println("打折后的价格是"+price*0.9);
            }else if(cabin==1){
                System.out.println("打折后的价格是"+price*0.85);
            }else{
                System.out.println("没有这种舱位");
            }
        }else if((month>=11&&month<=12)||(month>=1&&month<=4)){
            if(cabin==0){
                System.out.println("打折后的价格是"+price*0.7);
            }else if(cabin==1){
                System.out.println("打折后的价格是"+price*0.65);
            }else{
                System.out.println("没有这种舱位");
            }
        }else{
            System.out.println("输入的月份不合理");
        }
    }
}
