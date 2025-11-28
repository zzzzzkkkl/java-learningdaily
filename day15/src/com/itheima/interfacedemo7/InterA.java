package com.itheima.interfacedemo7;

public interface InterA {
    public static void show1(){
        System.out.println("show1默认方法开始执行");
        show4();
    }
    public static void show2(){
        System.out.println("show2默认方法开始执行");
        show4();
    }

    public static void show4(){
        System.out.println("记录程序运行的各种细节，这里有100行代码");
    }

}
