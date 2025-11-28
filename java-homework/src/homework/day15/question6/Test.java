package homework.day15.question6;

import homework.day15.question4.Inter;

public class Test {
    public static void main(String[] args) {
        B b=new B(new InterB(){
            @Override
            public void show() {
                System.out.println("匿名内部类实现");
            }
        });
        b.methodB();

        InterB ib=new InterBImpl();
        B b1=new B(ib);
        b1.methodB();
    }
}
