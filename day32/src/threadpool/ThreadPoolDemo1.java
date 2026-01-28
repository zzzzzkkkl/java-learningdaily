package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo1 {
    public static void main(String[] args) throws InterruptedException {
        //创建线程池

        //1.创建一个默认线程池对象
        ExecutorService executorService= Executors.newCachedThreadPool();
        //Executors--帮我们创建线程池对象
        //ExecutorService--帮我们控制线程池

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });

        /*Thread.sleep(2000);*/

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });

        executorService.shutdown();
    }
}
