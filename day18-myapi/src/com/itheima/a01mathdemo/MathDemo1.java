package com.itheima.a01mathdemo;

public class MathDemo1 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-88));
        System.out.println(Math.abs(88));
        //bug
        //int行为例，int取值范围：-2147483648~2147483647
        //-21473648没有与只对应的正数
        System.out.println(Math.absExact(-21473648));

        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(-12.34));

        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(-12.34));

        System.out.println(Math.round(12.34));
        System.out.println(Math.round(-12.34));
        System.out.println(Math.round(12.54));

        System.out.println(Math.max(20,30));

        System.out.println(Math.min(20,30));

        System.out.println(Math.pow(2,3));
        //第二个参数在0-1之间，就是开根号了
        System.out.println(Math.pow(4,0.5));
        System.out.println(Math.pow(2,-2));
        //平方根
        System.out.println(Math.sqrt(4));
        //立方根
        System.out.println(Math.cbrt(8));

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }
}
