package com.itheima.interfacedemo5;

public interface InterA {
    public abstract void method();
    public default void show(){
        System.out.println("A接口中的默认方法-------show");
    }
}
