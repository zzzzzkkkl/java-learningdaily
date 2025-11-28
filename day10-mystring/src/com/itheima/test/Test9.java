package com.itheima.test;

public class Test9 {
    public static void main(String[] args) {
        /*现有如下文本：“java语言是面向对象的，java语言是健壮的，java语言是安全的，java是高性能的，java
        语言是跨平台的。”编写程序，统计该文本中java一词出现的次数
         */
        //1、定义字符串
        String str="java语言是面向对象的，java语言是健壮的，java语言是安全的，java是高性能的，java语言是跨平台的。";
        String tar="java";
        //2、调用方法，看java出现几次
        System.out.println(search(str,tar));
    }
    //方法2
    public static int search(String str,String tar){
        int count=0;
        //定义索引变量，表示找到java时的索引
        int index=-1;
        while((index=str.indexOf(tar))!=-1){
            count++;
            //查找过的地方剪切掉
            str=str.substring(index+tar.length());
        }
        return count;
    }
}
