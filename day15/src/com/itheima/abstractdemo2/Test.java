package com.itheima.abstractdemo2;

public class Test {
    public static void main(String[] args) {
        Frog f=new Frog("小绿",1);
        System.out.println(f.getName()+" "+f.getAge());
        f.eat();
        f.drink();

        Animal a=new Frog("大绿",2);
        a.eat();
    }
}
