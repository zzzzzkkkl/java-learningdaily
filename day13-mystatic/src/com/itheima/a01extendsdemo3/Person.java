package com.itheima.a01extendsdemo3;

public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("父类的空参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
