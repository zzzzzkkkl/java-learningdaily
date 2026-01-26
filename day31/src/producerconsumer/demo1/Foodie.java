package producerconsumer.demo1;

public class Foodie extends Thread{
    /*
    消费者
    1。判断桌子上有没有包子
    2.没有就等待 有就吃
    3.吃完之后 唤醒等待的生产者生产包子
    4.包子总数减少
     */

    @Override
    public void run() {
        while(true){
            //加锁
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    if(Desk.flag){
                        //有包子
                        System.out.println("吃货正在吃包子");
                        Desk.flag=false;
                        //通知生产者生产包子、
                        Desk.lock.notifyAll();
                        Desk.count--;
                    }else{
                        //没有包子吃 就等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
