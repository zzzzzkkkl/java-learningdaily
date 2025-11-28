package com.itheima.stringdemo;

public class StringDemo8 {
    public static void main(String[] args) {
        /*定义一个方法，实现字符串反转。
        键盘录入一个字符串，调用该方法后，在控制台输出结果
         */
        String result=reverser("abc");
        System.out.println(result);
    }
    public static String reverser(String str){
        //abc
        //倒着遍历
        String result="";
        for (int i = str.length()-1; i >=0; i--) {
            char c=str.charAt(i);
            result=result+c;
        }
        //cba
        return result;
    }
}
