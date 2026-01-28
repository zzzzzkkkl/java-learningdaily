package threadtest.test1;

public class MyThread extends Thread{
    /*
    一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒,
    请用多线程模拟卖票过程并打印剩余电影票的数量
     */
    //第一种方式实现多线程-继承Thread类

    //第一种方式，测试类MyThread会创建多次，所以需要加static
    static int ticket=1000;

    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized (MyThread.class){
                //判断票是不是真的为0了，到末尾
                if(ticket==0){
                    break;
                }else{
                    //票不为0，不到末尾
                    try {
                        //模拟卖票这个动作花费的时间
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //票数减少
                    ticket--;
                    System.out.println(getName()+"在卖票，还剩下"+ticket+"张");
                }
            }
        }
    }
}
