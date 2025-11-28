package com.itheima.test;

import java.util.Random;

public class LoopTest5 {
    public static void main(String[] args) {
        /*生成随机数
        随机数范围1-100
         */

        //导包
        //创建对象
       // Random r=new Random();
        //生成随机数
       // int number=r.nextInt()
        //System.out.println(number);

        //生成任意数到任意数之间的随机数，例如7-15
        //1、让这个范围头尾都减去一个值，让这个范围从0开始 -7 0-8
        //2、尾巴+1   0-9
        //3、最终的结果，再加上第一步减去的值
        Random r=new Random();
        int number=r.nextInt(9)+7;//范围是0-8，+7后变成7-15
        System.out.println(number);
    }
}
