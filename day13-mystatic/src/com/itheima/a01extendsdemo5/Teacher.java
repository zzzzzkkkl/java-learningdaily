package com.itheima.a01extendsdemo5;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("教师在工作");
    }
}
