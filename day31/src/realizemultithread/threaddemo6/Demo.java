package realizemultithread.threaddemo6;

import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) {
        //线程优先级

        MyCallable mc=new MyCallable();
        FutureTask<String> ft=new FutureTask<>(mc);

        Thread t1=new Thread(ft);
        t1.setName("飞机");
        t1.setPriority(10);
        /*System.out.println(t1.getPriority());*/

        t1.start();

        MyCallable mc2=new MyCallable();
        FutureTask<String> ft2=new FutureTask<>(mc2);
        Thread t2=new Thread(ft2);
        t2.setName("坦克");
        t2.setPriority(1);
        t2.start();
    }
}
