package com.itheima.a01polymorphismdemo2;

public class Test {
    public static void main(String[] args) {

    }
    class Animal{
        public void eat(){
            System.out.println("动物吃东西");
        }
    }
    class Dog extends Animal{
        @Override
        public void eat(){
            System.out.println("狗吃东西");
        }
        public void lookhome(){
            System.out.println("狗看家");
        }
    }
    class Cat extends Animal{
        @Override
        public void eat(){
            System.out.println("猫吃小鱼干");
        }
        public void catchMouse(){
            System.out.println("猫抓老鼠");
        }
    }
}
