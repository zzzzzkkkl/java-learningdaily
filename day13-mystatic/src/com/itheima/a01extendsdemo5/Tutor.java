package com.itheima.a01extendsdemo5;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("助教在帮忙");
    }
}
