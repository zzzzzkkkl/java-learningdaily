package com.itheima.a01polymorphismdemo3;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*public void keepPet(Dog dog,String something){
        System.out.println(getAge()+"岁的"+getName()+"养了一只"+dog.getColor()+"的"+dog.getAge()+"岁的狗");
        dog.eat(something);
    }
    public void keepPet(Cat cat,String something){
        System.out.println(getAge()+"岁的"+getName()+"养了一只"+cat.getColor()+"的"+cat.getAge()+"岁的猫");
        cat.eat(something);
    }*/
    //定义一个方法，能接收所有的动物，包括猫狗，方法的形参可以写他的父类
    public void keepPet(Animal a,String something){
        if(a instanceof Dog d){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+a.getColor()+"的"+a.getAge()+"岁的狗");
            d.eat(something);
            d.lookHome();
        }else if(a instanceof Cat c){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+a.getColor()+"的"+a.getAge()+"岁的猫");
            c.eat(something);
        }else{
            System.out.println("没有这种类型的动物");
        }
    }
}
