package com.itheima.a01staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //创建一个集合，存储学生对象
        ArrayList<Student> list=new ArrayList<>();
        Student stu1=new Student("张三",23,"男");
        Student stu2=new Student("lisi",24,"男");
        Student stu3=new Student("wangwu",25,"男");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        int max=StudentUtil.getMaxAge(list);
        System.out.println(max);
    }
}
