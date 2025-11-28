package com.itheima.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        /*键盘输入一个正整数，判断该整数是否为一个质数

        分析：质数，就是除了1和他本身，没有别的因子
         */
        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number=sc.nextInt();
        boolean flag=true;

        //循环判断是不是质数
        for(int i=2;i<number;i++){
            if(number%i==0){
                flag=false;
                break;
            }/*else{
                System.out.println(number+"是质数");
            }*/
            if(flag) {
                System.out.println(number + "是质数");
            }else{
                System.out.println("不是质数");
            }
        }
    }
}
