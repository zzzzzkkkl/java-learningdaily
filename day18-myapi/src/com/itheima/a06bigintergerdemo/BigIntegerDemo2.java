package com.itheima.a06bigintergerdemo;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        /*Public BigInteger add（BigInteger val）	加法
        Public BigInteger subtract（BigInteger val）	减法
        Public BigInteger multiply（BigInteger val）	乘法
        Public BigInteger divide（BigInteger val）	除法，获取商
        Public BigInteger[ ] divideAndReminder（BigInteger val）	除法，获取商和余数
        Public Boolean equals（Object x）	比较是否相同
        Public BigInteger pow（int exponent）	次幂
        Public BigInteger max/min（BigInteger val）	返回较大值较小值
        Public int intValue（BigInteger val）	转为int类型整数，超出范围数据有误*/

        //1.创建两个BigInteger对象
        BigInteger bd1=BigInteger.valueOf(10);
        BigInteger bd2=BigInteger.valueOf(5);

        //加法
        BigInteger bd3=bd1.add(bd2);
        System.out.println(bd3);

        //除法，获取商和余数
        BigInteger[] arr=bd1.divideAndRemainder(bd2);
        System.out.println(arr.length);
        System.out.println(arr[0]+" "+arr[1]);

        //次幂
        System.out.println(bd1.pow(2));

        //max
        BigInteger bd4=bd1.max(bd2);
        System.out.println(bd4==bd1);

        //intValue
        BigInteger bd5=BigInteger.valueOf(100);
        int i=bd5.intValue();
        System.out.println(i);
    }
}