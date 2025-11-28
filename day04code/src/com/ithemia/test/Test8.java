package com.ithemia.test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        /*键盘录入星期数，显示今天的减肥活动
        一周内依次干跑步、游泳、慢走、动感单车、拳击、爬山、好好吃一顿
         */

        //键盘输入星期几
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天的日子:");
        int day = sc.nextInt();

        //switch语句判断
        switch (day) {
            case 1:
                System.out.println("今天跑步");
                break;
            case 2:
                System.out.println("今天游泳");
                break;
            case 3:
                System.out.println("今天慢走");
                break;
            case 4:
                System.out.println("今天动感单车");
                break;
            case 5:
                System.out.println("今天拳击");
                break;
            case 6:
                System.out.println("今天爬山");
                break;
            case 7:
                System.out.println("今天好好吃一顿");
                break;
            default:
                System.out.println("出现错误");
                break;
        }
    }
}
