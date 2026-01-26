package producerconsumer.demo1;

import threadsync.demo4.Ticket;

public class Cooker extends Thread {
    //生产者
    /*
    1.判断桌子上是否有包子
    2.有就等待，没有就生产包子
    3.把包子放desk上
    4.唤醒等待的消费者大吃货 吃包子
     */

    @Override
    public void run() {
        while(true){
            //加锁
            synchronized (Desk.lock){
                if(Desk.count==0){
                    //确保汉堡数量为0，生产者消费者都能退出进程
                    //避免死循环
                    break;
                }else{
                    if(!Desk.flag){
                        //桌子上没有包子
                        System.out.println("生产包子");
                        /*
                        注意：
                        这里为什么都用Desk调用呢？
                        Desk里这几个成员变量都用static修饰，不管创建多少desk
                        这些成员只有一份，属于类本身。

                        锁对象必须唯一
                        共享对象必须全局
                         */
                        Desk.flag=true;
                        //唤醒等待的消费者吃包子
                        Desk.lock.notifyAll();
                    }else{
                        try {
                            //桌子上有包子，生产者等待
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
