package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolDemo2 {
    public static void main(String[] args) {
        //创建指定上限的线程池

        //参数：最大值
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        ThreadPoolExecutor pool=(ThreadPoolExecutor) executorService;
        //pool.size():当前线程池的大小
        //线程池的设计是按需创建线程，没有任务时一个线程都没有
        System.out.println(pool.getPoolSize());

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });

        //这里提交两个任务，所以线程池的大小是2
        System.out.println(pool.getPoolSize());

        /*executorService.shutdown();*/
    }
}
