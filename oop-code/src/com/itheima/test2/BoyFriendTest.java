package com.itheima.test2;

public class BoyFriendTest {
    public static void main(String[] args) {
        //创建男朋友的对象
        BoyFriend bf1=new BoyFriend();
        bf1.name="小帅";
        bf1.age=18;
        bf1.gender="帅哥";
        System.out.println(bf1.name);
        System.out.println(bf1.age);
        System.out.println(bf1.gender);

        bf1.eat();
        bf1.sleep();

        System.out.println("===========");
        BoyFriend bf2=new BoyFriend();
        bf2.name="小帅二号";
        bf2.age=18;
        bf2.gender="帅哥";
        System.out.println(bf2.name);
        System.out.println(bf2.age);
        System.out.println(bf2.gender);
    }
}
