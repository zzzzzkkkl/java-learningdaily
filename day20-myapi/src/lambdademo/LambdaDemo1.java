package lambdademo;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //1.利用匿名内部类的形式去调用下面的方法
        //调用一个方法的时候，如果方法的形参是一个接口，那么我们要传递这个接口的实现类对象
        //如果实现类对象只要用到一次，就可以用匿名内部类的形式进行书写
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳");
            }
        });

        //2.利用Lambda表达式进行改写
        method(
                ()->{
                    System.out.println("正在游泳");
                }
        );
    }
    public static void method(Swim s){
        s.swimming();
    }
}
@FunctionalInterface
interface Swim{
    public abstract void swimming();
}
