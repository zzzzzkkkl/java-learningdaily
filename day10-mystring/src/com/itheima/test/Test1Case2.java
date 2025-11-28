package com.itheima.test;

import java.util.Scanner;

public class Test1Case2 {
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
        //3、将字符串内容变成罗马数字。用switch方法
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            String s=changeLuoMa(c);
            sb.append(s).append(" ");
        }
        System.out.println(sb);
    }
    //3、字符串内容变成罗马数字的方法
    public static String changeLuoMa(char number){
        String str;
       switch(number){
           case'0'->str="";
           case'1'->str="I";
           case'2'->str="II";
           case'3'->str="III";
           case'4'->str="IV";
           case'5'->str="V";
           case'6'->str="VI";
           case'7'->str="VII";
           case'8'->str="VIII";
           case'9'->str="IX";
           default->str="";
       }
       return str;
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
