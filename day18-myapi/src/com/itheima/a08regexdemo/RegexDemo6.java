package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {
        /*有如下文本，按要求爬去数据,找到里面所有的Javaxx
        1).只要Java，不显示版本号
        2).显示版本号
        3).爬取除了版本号为8,11,17的Java版本*/
        String str="Java自从95年问世以来，经历了许多版本，目前企业中用得最多的是Java8和Java11，因为这两个版本是" +
                "长期支持版本，下一个长期支持版本时Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //1.获取正则表达式
        //？理解为前面的数据Java，相当于一个占位符
        //=表示在Java后面要跟随的数据
        //但是获取的时候只获取前半部分，后面的数字部分是不要的
        /*String regex1="Java(?=8|11|17)";
        Pattern p=Pattern.compile(regex1);//规则
        Matcher m=p.matcher(str);//m用来爬取原串
        while(m.find()){//获取在原来的子串里的索引
            System.out.println(m.group());//将索引对应的元素打印
        }*/

        System.out.println("---------------------------");
        String regex2="((?i)Java)(?!8|11|17)";
        Pattern p2=Pattern.compile(regex2);//规则
        Matcher m2=p2.matcher(str);//m用来爬取原串
        while(m2.find()){//获取在原来的子串里的索引
            System.out.println(m2.group());//将索引对应的元素打印
        }
    }
}
