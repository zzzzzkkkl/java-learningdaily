package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        /*定义一个方法判断一个字符串是不是对称的，并在主方法中测试
        例如：“abcba”、“上海自来水来自上海”均为对称字符串
         */
        //1、定义一个字符串
        String str="abcba";
        //2、判断是不是对称的
        boolean flag=check(str);
        System.out.println(flag);
    }
    //方法2
    public static boolean check(String str){
        //将字符串转换为StringBuilder类型
        StringBuilder sb=new StringBuilder(str);
        //利用StringBuilder里的reverse方法，将字符串倒置
        String reStr=sb.reverse().toString();
        //将倒置前后的字符串进行比较
        return str.equals(reStr);
    }
}
