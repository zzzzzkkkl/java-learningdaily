package com.ithemia.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        /*键盘录入女婿酒量，如果大于2斤，老丈人给出回应
        否则不回应
         */

        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入女婿酒量:");
        int wine=sc.nextInt();

        //判断
        if(wine>2){
            System.out.println("小伙子不错呦");
        }
    }
}
