package threadsync.demo4;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable{
    private int ticket=100;
    private Object obj=new Object();
    //创建一个锁对象
    private ReentrantLock lock=new ReentrantLock();

    @Override
    public void run() {
        while(true){
            while(true){
                //synchronized (obj){//多个线程必须使用同一把锁
                try {
                    //加锁
                    lock.lock();
                    if(ticket<=0){
                        //卖完了
                        break;
                    }else{
                        Thread.sleep(100);
                        ticket--;
                        System.out.println(Thread.currentThread().getName() + "在卖票,还剩下" + ticket + "张票");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    //解锁
                    lock.unlock();
                }
                //}
            }
        }
    }
}
