package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) {
        //pattern：表示正则表达式
        //Matcher：文本匹配器，作用按照正则表达式的规则读取字符串，从头开始读取

        /*有如下文本，按要求爬去数据,找到里面所有的Javaxx*/
        String str="Java自从95年问世以来，经历了许多版本，目前企业中用得最多的是Java8和Java11，因为这两个版本是" +
                "长期支持版本，下一个长期支持版本时Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //1.获取正则表达式的对象
        Pattern p=Pattern.compile("Java\\d{0,2}");
        //2.获取文本匹配器的对象
        Matcher m=p.matcher(str);
        //3.利用循环读取
        while(m.find()){
            String s=m.group();
            System.out.println(s);
        }
    }

    private static void method1(String str) {
        Pattern p=Pattern.compile("Java\\d{0,2}");
        //m：文本匹配器对象
        //p：规则
        //m在str中找符合p规则的子串
        Matcher m=p.matcher(str);
        //拿着文本匹配器从头开始找，有返回true，在底层记录子串的起始索引和结束索引+1
        boolean b=m.find();
        //根据find方法记录的字符串索引进行字符串的截取
        String s1=m.group();
        System.out.println(s1);
    }
}
