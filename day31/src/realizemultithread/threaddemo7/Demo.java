package realizemultithread.threaddemo7;

public class Demo {
    public static void main(String[] args) {
        //守护线程

        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();

        t1.setName("小红");
        t2.setName("小兰");

        //将第二个线程设置为守护线程
        //当普通线程执行完之后，那么守护线程就没有继续执行下去的必要了
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
