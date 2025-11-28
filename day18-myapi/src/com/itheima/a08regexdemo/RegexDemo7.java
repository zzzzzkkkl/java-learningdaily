package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {
    public static void main(String[] args) {
        /*贪婪爬取：在爬取数据的时候尽可能多的获取数据
        非贪婪：尽可能少的获取数据

        只写+和*表示贪婪匹配
        +？非贪婪匹配
        *？非贪婪匹配
         */
        String s="Java自从95年问世以来，abbbbbbbbbbbaaaaaaaaaaaaaaaaa经历了较多版本，目前企业中用的最多的是Java8和Java11，因为这两个版本是"
                + "长期支持版本，下一个长期支持版本时Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        String regex="ab+?";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
