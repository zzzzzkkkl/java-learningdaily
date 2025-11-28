package com.itheima.a05objectsdemo;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        //创建学生对象
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("zhangsan",23);
        //比较两个对象的属性值是否相同
        //boolean result=s1.equals(s2);
        //System.out.println(result);

        boolean result=Objects.equals(s1,s2);
        System.out.println(result);
        //细节：
        //1、方法的底层会判断s1是否为null，如果为null，直接返回false
        //2、如果s1不为null，那么就利用s1再次调用equals方法
        //3、此时s1是student类型，所以还是会调用student中的equals方法
        //如果重写了，就比较属性值，如果没有重写，就比较地址值

        Student s3=new Student();
        Student s4=null;
        System.out.println(Objects.isNull(s3));
        System.out.println(Objects.isNull(s4));
        System.out.println(Objects.nonNull(s4));
    }
}
