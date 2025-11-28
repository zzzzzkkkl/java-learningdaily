package com.itheima.interclassdemo3;

public class Test {
    public static void main(String[] args) {
        //创建静态内部类对象
        //只要是静态的东西，都可以用类名直接获取
        Outer.Inner oi=new Outer.Inner();
        oi.show1();

        Outer.Inner.show2();
    }
}
