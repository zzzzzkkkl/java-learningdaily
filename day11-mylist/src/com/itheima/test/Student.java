package com.itheima.test;

public class Student {
    //1、私有化成员变量
    private String name;
    private int age;
    //2、空参构造，有参构造

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }
//3、get、set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
