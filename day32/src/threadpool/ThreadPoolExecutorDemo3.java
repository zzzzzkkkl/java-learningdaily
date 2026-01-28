package threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo3 {
    public static void main(String[] args) {
        //任务拒绝策略--CallerRunsPolicy
        //调用run（），直接绕过线程池执行

        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(1,3,20,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i < 5; i++) {
            threadPoolExecutor.submit(()->{
                System.out.println(Thread.currentThread().getName()+"------>>执行了任务");
            });
        }
    }
}
