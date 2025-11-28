package com.itheima.a08regexdemo;

public class RegexDemo11 {
    public static void main(String[] args) {
        //非捕获分组练习
        //特点：不占用组号
        //(?:) (?=) (?!)都是非捕获分组
        //更多是使用第一个

        // 身份证号的简易正则表达式
        String regex="[1-9]\\d{16}(?!\\d|X|x)";
        System.out.println("421421200511094029".matches(regex));
    }
}
