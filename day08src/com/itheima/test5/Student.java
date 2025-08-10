package com.itheima.test5;

public class Student {
    private String name;
    private int age;

    //个自己没写构造方法，虚拟机会自动加一空参构造方法
    /*public Student(){
        System.out.println("看看我执行了吗");
    }*/
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
