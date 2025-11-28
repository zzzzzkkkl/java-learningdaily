package com.itheima.interclassdemo5;

public class Test {
    public static void main(String[] args) {
        //编写匿名内部类
        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写了有用方法");
            }
        };

        /*new Animal(){
            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };*/
        method(
            new Animal(){
                @Override
                public void eat() {
                    System.out.println("狗吃骨头肉");
                }
            }
        );
    }

    public static void method(Animal a){
        a.eat();
    }
}
