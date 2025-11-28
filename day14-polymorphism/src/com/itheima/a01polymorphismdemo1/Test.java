package com.itheima.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("张三");
        s.setAge(20);

        Teacher t=new Teacher();
        t.setName("lisi");
        t.setAge(30);

        Administrator ad=new Administrator();
        ad.setName("管理员");
        ad.setAge(35);

        register(s);
        register(t);
        register(ad);
    }
    public static void register(Person p){
        p.show();
    }
}
