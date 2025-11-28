package com.itheima.a01polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        /*Person p=new Person("老王",30);
        Dog dog=new Dog(2,"黑色");
        p.keepPet(dog,"骨头");*/
        Person p=new Person("老王",30);
        Animal a=new Dog(2,"黑色");
        p.keepPet(a,"骨头");

        Cat c=new Cat(1,"白色");
        p.keepPet(c,"小鱼干");
    }
}
