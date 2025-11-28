package com.itheima.interfacedemo5;

public interface InterB {
    public default void show(){
        System.out.println("B接口中的默认方法------show");
    }
}
