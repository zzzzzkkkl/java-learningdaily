package com.itheima.a01extendsdemo3;

public class Student extends Person{
    public Student(){
        super();
        System.out.println("子类的空参构造");
    }
    public Student(String name,int age){
        super(name,age);
    }
}
