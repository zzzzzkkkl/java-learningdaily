package realizemultithread.threaddemo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程开启之后需要执行里面的call方法
        MyCallable mc=new MyCallable();
        /*Thread t1=new Thread(mc);*/

        //获取线程执行完毕后的结果，活页也可以作为参数传递给Thread对象
        FutureTask<String> ft=new FutureTask<>(mc);

        //创建线程对象
        Thread t1=new Thread(ft);

        String s=ft.get();
        //开启线程
        t1.start();
        System.out.println(s);
    }
}
