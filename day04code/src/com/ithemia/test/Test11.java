package com.ithemia.test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*拨打服务电话时，一般会有按键选择，假如你在拨打机票预订电话
        电话语音提示：
        1机票查询
        2机票预订
        3机票改签
        4退出服务
         */

        //键盘输入
        Scanner sc=new Scanner(System.in);
        System.out.println("请按键");
        int a=sc.nextInt();

        //switch语句选择
        switch(a){
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预定");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
                System.out.println("退出服务");
                break;
            default:
                System.out.println("出现错误");
                break;
        }
    }
}
