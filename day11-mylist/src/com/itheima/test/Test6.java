package com.itheima.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        /*main方法中定义一个集合，存入三个用户对象，用户属性：id，username，password
        定义一个方法，根据id查找对应的用户信息，若存在返回索引，若不存在返回-1
         */
        //1、定义一个集合
        ArrayList<User> list=new ArrayList<>();
        //2、创建3个用户对象
        User u1=new User("001","zhangsan","123456");
        User u2=new User("002","lisi","12345678");
        User u3=new User("003","wangwu","1234qwer");
        //3、把用户添加到集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //4、调用方法
        System.out.println(getIndex(list,"001"));
    }
    public static int getIndex(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            String uid=u.getId();
            if(uid.equals(id)){
                return i;
            }
        }
        return -1;
    }
}
