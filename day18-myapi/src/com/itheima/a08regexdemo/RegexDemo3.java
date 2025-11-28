package com.itheima.a08regexdemo;

public class RegexDemo3 {
    public static void main(String[] args) {
        //验证用户名是否满足要求

        //用户名要求：大小写字母，数字，下划线，一共4-16位
        String redex1 = "\\w{4,16}";
        System.out.println("zhagsna".matches(redex1));

        //身份证号码的简单校验，前十八位是任意数字最后一位是数字或大写、小写x
        String regex2="[1-9]\\d{16}(\\d|X|x)";
        String regex3="[1-9]\\d{16}(\\dXx)";
        System.out.println("410421200511094029".matches(regex2));

        //忽略大小写的书写方式
        //匹配的时候忽略abc的大小写
        String regex4="(?i)abc";
        System.out.println("------------------------------");
        System.out.println("abc".matches(regex4));
        System.out.println("Abc".matches(regex4));
        //只忽略b的大小写
        String regex5="a((?i)b)c";
        System.out.println("-------------------------------");
        System.out.println("abc".matches(regex5));

        //身份证号码的严格校验:拆分，找出每部分的规律编写表达式，将每部分的正则拼接在一起
        //前六位：省份，派出所，市区等信息 第一位不能是0，后面5位是任意数字 【1-9】\\d{5}
        //年份 前半段：18 19 20 （18|19|20）
        //年份 后半段：任意数字出现两次 \\d{2}
        //月份 01-09 10-12：（0【1-9]|1[0-2]
        //日期 01-09 10-19 20-29 30-31 (0[1-9]|[12]\\d|3[01])
        //后面四位 任意数字出现三次 最后一位是大写或小写x \\d{3}[\\dXx]
        String regex6="";
    }
}
