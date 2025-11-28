package com.itheima.test3;

public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;

    //对每一个私有变量提供get和set方法
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

    public void setAge(int a){
        if(a>=18&&a<=50) {
            age = a;
        }else{
            System.out.println("非法传数");
        }
    }
    public int getAge(){
        return age;
    }

    public void setGender(String g){
        gender=g;
    }
    public String getGender(){
        return gender;
    }
    //行为
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
