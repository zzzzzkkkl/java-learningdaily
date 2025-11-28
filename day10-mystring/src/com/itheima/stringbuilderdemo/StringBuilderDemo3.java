package com.itheima.stringbuilderdemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb=new StringBuilder();
        //添加字符
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");
        //把sb变成字符串类型
        String str=sb.toString();
        System.out.println(str);
    }
}
