package realizemultithread.threaddemo5;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        //线程休眠

        //这里静态方法 Thread.sleep ()
        //不管是是main线程，t1线程、t2线程只要执行到这，就会让当前线程休眠
        System.out.println("睡觉前");
        Thread.sleep(3000);
        System.out.println("睡醒了");

        MyRunnable mr=new MyRunnable();
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);

        //这里启动线程 JVM为线程分配CPU资源，异步执行run方法 多线程的核心
        t1.start();
        t2.start();
    }
}
