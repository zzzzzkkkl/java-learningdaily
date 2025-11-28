package com.ithemia.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*某电影院卖了一百张票，序号为1-100
        奇数号的票坐左侧，偶数票号坐右侧
        键盘录入一个整数表示票号
        判断坐哪边
         */

        //键盘录入一个整数，范围是1-100
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的票号：");
        int number = sc.nextInt();

        //判断
        //注意判断是否是有效票号
        if (number < 1 || number > 100) {
            System.out.println("出现错误");
        } else {
            if (number % 2 == 0) {
                System.out.println("坐右边");
            } else {
                System.out.println("坐左边");
            }
        }
    }
}
