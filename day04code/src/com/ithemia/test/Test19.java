package com.ithemia.test;

public class Test19 {
    public static void main(String[] args) {
        /*给定两个整数，被除数和除数（都是正数，不超过int的范围
        将两数相除，要求不使用乘法、除法和%
        得到商和余数

        分析：被除数÷除数=商……余数
        int a=100；
        int b=10；
         100-10=90
         90-10=80
         80-10=70
         70-10=60
          ……
         10-10=0 这个0就是余数
         有几个这样的式子，商就是几
         */

        //定义变量记录被除数和除数
        int dividend=10;
        int divisor=3;
        int count=0;//记录有几个式子，即商

        //循环求商和余数,不断地用被除数-除数
        while(dividend>=divisor){
            dividend=dividend-divisor;//被除数更新
            count++;
        }
        System.out.println("余数是："+dividend);
        System.out.println("商是:"+count);
    }
}
