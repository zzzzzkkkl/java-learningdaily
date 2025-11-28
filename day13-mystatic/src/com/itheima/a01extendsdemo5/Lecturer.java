package com.itheima.a01extendsdemo5;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("讲师在讲课");
    }
}
