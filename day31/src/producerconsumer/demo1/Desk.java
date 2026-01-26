package producerconsumer.demo1;

public class Desk {
    //定义一个标记
    //true表示有包子，此时允许消费者大吃货吃包子
    //false表示没有包子

    public static boolean flag=false;
    //包子的总数量
    public static int count=10;
    //锁对象
    public static final Object lock=new Object();
}
