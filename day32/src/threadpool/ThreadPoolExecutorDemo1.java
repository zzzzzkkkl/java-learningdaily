package threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo1 {
    public static void main(String[] args) {
        //非默认任务拒绝策略

        /*
        核心线程数量：1，最大线程池数量为3，任务容器的容量为1，空闲线程的最大存在时间20s
         */
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(1,3,20,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //提交5个任务，而该线程池最多可以处理4个任务
        //当我们使用AbortPolicy()这个任务拒绝策略时，就会抛出异常
        for (int i = 0; i < 5; i++) {
            threadPoolExecutor.submit(()->{
                System.out.println(Thread.currentThread().getName()+"------->>执行了任务");
            });
        }
    }
}
