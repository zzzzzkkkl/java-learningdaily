package com.itheima.abstractdemo1;

public abstract class Person {
    public abstract void work();
    private String name;
    private int age;
    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
