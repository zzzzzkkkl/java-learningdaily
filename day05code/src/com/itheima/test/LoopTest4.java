package com.itheima.test;

import java.util.Random;



public class LoopTest4 {
    public static void main(String[] args) {
        /*获取一个随机数
        范围是0-10
         */

        //导包
        //创建对象
        Random r=new Random();
        //生成随机数
        int number=r.nextInt(10);//小括号中是随机数的范围，
                            // 从0开始，到这个数-1结束
        System.out.println(number);
    }
}
