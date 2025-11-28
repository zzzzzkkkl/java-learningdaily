package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        /*键盘录入一个字符串
        统计该字符串中大写字母字符、小写字母字符、数字字符出现的次数
         */
        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        //遍历计数
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z'){//char类型在参与计算时会自动提升为int，查询ASCII表比较
                smallCount++;
            }else if(c>='A'&&c<='Z'){
                bigCount++;
            }else if(c>='0'&&c<='9'){
                numberCount++;
            }
        }
        System.out.println("小写字母有"+smallCount+"个，"+"大写字母有"+bigCount+"个，"+"数字有"+numberCount+"个");
    }
}
