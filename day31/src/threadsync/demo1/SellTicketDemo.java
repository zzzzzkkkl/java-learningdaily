package threadsync.demo1;

public class SellTicketDemo {
    public static void main(String[] args) {
        /*
        某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票
        请设计一个程序模拟该电影院卖票
         */
        //创建SellTicket类的对象
        SellTicket st=new SellTicket();

        //创建三个Thread类的对象
        Thread t1=new Thread(st,"窗口1");
        Thread t2=new Thread(st,"窗口2");
        Thread t3=new Thread(st,"窗口3");

        //启动线程
        t1.start();
        t2.start();
        t3.start();

        /*
        结果：相同的票出现了多次
        出现负数票

        原因：线程执行的随机性导致，可能在卖票过程中丢失CPU的执行权，导致出现问题
         */
    }
}
