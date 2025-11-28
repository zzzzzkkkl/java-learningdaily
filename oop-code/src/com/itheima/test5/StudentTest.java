package com.itheima.test5;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //Student s=new Student();//空参构造

        //带参构造
        Student ss=new Student("张三",23);
        System.out.println(ss.getName());
        System.out.println(ss.getAge());
    }
}
