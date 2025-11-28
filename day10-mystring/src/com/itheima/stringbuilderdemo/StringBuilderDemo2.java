package com.itheima.stringbuilderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb=new StringBuilder("abc");
        //添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);
        //反转
        sb.reverse();
        //获取长度
        int len=sb.length();
        System.out.println(len);

        //打印
        System.out.println(sb);
    }
}
