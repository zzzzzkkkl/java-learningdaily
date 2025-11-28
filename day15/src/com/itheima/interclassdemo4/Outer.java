package com.itheima.interclassdemo4;

public class Outer {
    int b=20;

    public void s(){
        int a=10;

        //局部内部类
        class Inner{
            String name;
            int age;
            public void m1(){
                System.out.println(b);
                System.out.println(a);
                System.out.println("局部内部类中的method1方法");
            }
            public static void m2(){
                System.out.println("局部内部类中的静态method2方法");
            }
        }
        //创建局部内部类的对象
        Inner i=new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.m1();
        Inner.m2();
    }
}
