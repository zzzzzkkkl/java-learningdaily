package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //1、创建集合
        ArrayList<Student> list=new ArrayList<>();
        //2、键盘录入学生的信息并添加到集合中
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s=new Student();
            System.out.println("请输入学生的姓名");
            String name=sc.next();
            System.out.println("请输入学生的年龄");
            int age=sc.nextInt();
            //把name和age赋给学生对象
            s.setName(name);
            s.setAge(age);
            //把学生对象添加到集合中
            list.add(s);
        }
        //3、遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
