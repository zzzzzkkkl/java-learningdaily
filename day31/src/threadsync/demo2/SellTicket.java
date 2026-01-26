package threadsync.demo2;

public class SellTicket implements  Runnable{
    private int tickets=100;
    private Object obj=new Object();
    @Override
    public void run() {
        while(true){
            synchronized (obj){
                //对可能有安全问题的代码加锁，多线程必须使用同一把锁
                //t1进来后，就会把这段代码锁起来
                if(tickets>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
                    tickets--;
                }
            }
            //t1出来，这段代码的锁就被释放了
        }
    }
}
