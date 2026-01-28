package threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo2 {
    public static void main(String[] args) {
        //非默认任务拒绝策略--ThreadPoolExecutor.DiscardPolicy
        //使用DiscardPolicy这个任务处理策略的时候，不会报错，不推荐

        /*ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 3, 20,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
*/

        /*
        任务0进来，直接去核心线程执行
        任务1进来，核心线程满，任务队列不满，进任务队列等待
        任务2进来，核心满，任务满，只好创建线程池里的非核心线程
        任务3，同2
        任务4，同3

        这时发现都满了，就触发拒绝策略，把任务队列里的赶走
         */
        //DiscardOldestPolicy
        //在线程池中等待最久的任务被丢弃
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(1,3,20,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardOldestPolicy());

        //提交5个任务，但最多只能处理4个任务
        for (int x = 0; x < 5; x++) {
            //定义一个变量，来指定当前执行的任务，这个变量需要final修饰
            /*
            注意：
            在lambda中变量x是不能直接用的，只能先转换为final y
             */
            final int y=x;
            threadPoolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "---->> 执行了任务"+y);
            });
        }
    }
}
