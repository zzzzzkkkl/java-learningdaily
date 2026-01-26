package threadsync.demo1;

public class SellTicket implements Runnable{
    private int tickets=100;
    //重写run 实现卖票
    @Override
    public void run() {
        while(true){
            if(tickets<0){
                //票卖完了 结束线程
                break;
            }else{
                //模拟买票的过程耗时
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //有票
                tickets--;
                System.out.println(Thread.currentThread().getName()+"在卖票，还剩下"+tickets+"张票");
            }
        }
    }
}
