package com.itheima.a01extendsdemo5;

import java.io.BufferedReader;

public class Test {
    public static void main(String[] args) {
        Lecturer l=new Lecturer("zhangsan","001");
        System.out.println(l.getId()+" "+l.getName());
        l.work();

        Buyer b=new Buyer();
        b.setName("lisi");
        b.setId("002");
        System.out.println(b.getName()+" "+b.getId());
        b.work();
    }
}
