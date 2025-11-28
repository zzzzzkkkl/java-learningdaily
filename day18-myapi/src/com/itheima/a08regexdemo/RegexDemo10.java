package com.itheima.a08regexdemo;

public class RegexDemo10 {
    public static void main(String[] args) {
        //捕获分组练习-口吃练习
        /*需求：
        将字符串：我要学编编编编遍程程程程程
        替换成：我要学编程
         */
        String str="我要学编编编编程程程程程";
        //(.) 表示把重复内容的第一个字符看做一组
        // \\1 表示第一字符再次出现
        //+至少出现一次
        //$1 把正则表达式第一组中的数据再拿出来用
        String result=str.replaceAll("(.)\\1+","$1");
        System.out.println(result);
    }
}
