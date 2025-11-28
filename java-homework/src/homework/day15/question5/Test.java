package homework.day15.question5;

public class Test {
    public static void main(String[] args) {
       A a=new A();
       a.methodA(new InterA() {
           @Override
           public void show() {
               System.out.println("通过匿名内部类实现");
           }
       });
    }
}
