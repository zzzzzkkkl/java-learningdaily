package com.itheima.a04objectdemo;

public class ObjectDemo3 {
    public static void main(String[] args) {
        String s="abc";
        StringBuilder sb=new StringBuilder("abc");

        System.out.println(s.equals(sb));
        //这里是s调用equals方法
        //s是字符串，所以要看String类里面的equals方法
        //先判断参数是不是字符串
        // 如果是字符串，再比较内部的属性
        //如果不是字符串，直接返回false

        System.out.println(sb.equals(s));
        //这里是sb调用equals方法
        //所以要看StringBuilder中的equals方法
        //StringBuilder中没有重写equals方法，所以使用的是父类Object中的方法
        //而在Object中，equals方法是默认使用==比较两个对象的地址值

    }
}
