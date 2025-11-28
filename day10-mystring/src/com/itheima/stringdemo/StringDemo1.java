package com.itheima.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //直接赋值
        String s1="abc";
        System.out.println(s1);
        //new
        String s2=new String();
        System.out.println("@"+s2+"!");

        String s3=new String("abc");
        System.out.println(s3);

        char[] chs={'a','b','c','d'};
        String s4=new String(chs);
        System.out.println(s4);

        byte[] bytes={97,98,99,100};
        String s5=new String(bytes);
        System.out.println(s5);
    }
}
