package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个
        例如：hello12345world中字母：10个，数字：5个
         */
        //1、键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        //2、把字符串变成字符数组
        char arr[]=str.toCharArray();
        //3、遍历字符数组计数
        int engCount=0;
        int numCount=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>='0'&&arr[i]<='9'){
                numCount++;
            }else{
                engCount++;
            }
        }
        System.out.println("字母："+engCount+"个,"+"数字:"+numCount+"个");
    }
}
