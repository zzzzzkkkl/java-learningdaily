package com.ithemia.test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        /*键盘输入星期数，输出工作日还是休息日
        1-5工作日，6-7休息日
         */

        //键盘输入
        Scanner sc=new Scanner(System.in);
        System.out.println("今天是星期几？");
        int day=sc.nextInt();

        //switch或if语句判断
        switch(day){
            case 1,2,3,4,5:
                System.out.println("今天是工作日");
                break;
            case 6,7:
                System.out.println("今天是休息日");
                break;
            default:
                System.out.println("出现错误");
                break;
        }

    }
}
