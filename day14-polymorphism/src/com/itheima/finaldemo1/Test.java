package com.itheima.finaldemo1;

public class Test {
    public static void main(String[] args) {
        final int a=10;
        System.out.println(a);
        
    }
}
class Fu{
    public final void show(){
        System.out.println("父类的show方法");
    }
}
/*class Zi extends Fu{
    public void show(){
        System.out.println("子类的show方法");
    }
}*/
