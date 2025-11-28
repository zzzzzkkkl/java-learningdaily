package com.itheima.test;

public class LoopTest1 {
    public static void main(String[] args) {
        /*逢7过
        从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数时都要说过
        使用程序在控制台打印出1-100之间满足逢七必过规则的数字

        分析：即在1-100挑出来包含7或者是7的倍数的数
         */

        for(int i=1;i<=100;i++){
            //若是7的倍数，个位或十位是7，打印过
            if(i%7==0||i%10==7||i/10%10==7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }


    }
}
