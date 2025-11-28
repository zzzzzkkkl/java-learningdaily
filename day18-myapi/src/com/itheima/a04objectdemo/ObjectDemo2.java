package com.itheima.a04objectdemo;

public class ObjectDemo2 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();

        boolean result1=s1.equals(s2);
        System.out.println(result1);
    }
}
