package com.itheima.a08regexdemo;

public class RegexDemo9 {
    public static void main(String[] args) {
        //捕获分组的练习

        // \\组号表示把第x组的内容拿出来
        //判断一个字符串的开始字符和结束字符是否一致
        String regex1="(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("17891".matches(regex1));
        System.out.println("a123b".matches(regex1));

        //判断一个字符串的开始字符和结束字符是否一致 可以有多个字符
        System.out.println("-----------------------------");
        String regex2="(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("17891".matches(regex2));
        System.out.println("a123b".matches(regex2));

        System.out.println("--------------------------");
        //判断一个字符串的开始字符和结束字符是否一致 开始部分内部每个字符也需要一致eg.aaa
        // \\2*拿的第二部分的数据重复出现，*表示不止一次    另：在正则外部使用，用$组号
        // (.)把第一个字符单独看成一组
        String regex3="((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("17891".matches(regex2));
        System.out.println("abc123abc".matches(regex2));
    }
}
