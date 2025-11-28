package com.itheima.a06bigintergerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntergerDemo1 {
    public static void main(String[] args) {
        //获取一个随机的大整数
        /*for (int i = 0; i < 100; i++) {
            BigInteger bd1=new BigInteger(4,new Random());
            System.out.println(bd1);//0~2^4-1之间的随机数
        }*/

        //获取一个指定的大整数
        //细节：括号里的字符串内必须是整数
        BigInteger bd2=new BigInteger("100");
        System.out.println(bd2);

        //获取指定进制的大整数
        //细节：括号中字符串中的数字必须是整数，且字符串中的数字必须跟进制吻合
        BigInteger bd3=new BigInteger("100",2);
        System.out.println(bd3);

        //静态方法获取BigInteger的对象，内部有优化
        //细节:
        //1、表示范围较小，在long的取值范围之内，超出就不行
        //2、在内部对常用的数字：-16~16进行了优化，提前把-16~16先创建好BigInteger的对象，
        //如果多次获取不会重新创建新的
        BigInteger bd5=BigInteger.valueOf(100);
        System.out.println(bd5);
    }
}
