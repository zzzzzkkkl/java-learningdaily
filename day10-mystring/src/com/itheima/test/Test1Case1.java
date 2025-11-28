package com.itheima.test;

import java.util.Scanner;

public class Test1Case1 {
    public static void main(String[] args) {
        /*键盘录入一个字符串，要求1：只能是数字，要求2：长度小于等于9.将内容转换为罗马数字
        阿拉伯数字跟罗马数字的对比关系：
        注意：罗马数字里面没有0，若键盘输入的数字包含0，可以变成“”（长度为0的字符串）
         */

        //1、键盘录入字符串
        Scanner sc=new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个阿拉伯字符串");
            str=sc.next();
            //2、判断字符串是否合理
            boolean flag=checkStr(str);
            if(flag){
                break;
            }else{
                System.out.println("当前字符串不合规则，请重新输入");
                continue;
            }
        }
        //3、将字符串内容变成罗马数字。查表法，数字跟数据产生对应关系
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            //字符‘0’+0=48，将拿到的字符减48就变成了阿拉伯数字
            int number=c-48;
            String s=changeLuoMa(number);
            sb.append(s).append(" ");
        }
        System.out.println(sb);
    }
    //3、字符串内容变成罗马数字的方法
    public static String changeLuoMa(int number){
        //定义一个数组，存罗马数字。让索引和罗马数字产生对印关系
        String arr[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return arr[number];
    }
    //2、判断字符串是否合理的方法
    public static boolean checkStr(String str){
        if(str.length()>9){
            return false;
        }
        //遍历每个字符，看他是不是数字
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);//根据索引返回字符
            if(c<'0'||c>'9'){
                return false;
            }
        }
        return true;
    }
}
