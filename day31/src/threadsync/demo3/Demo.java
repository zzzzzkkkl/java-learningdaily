package threadsync.demo3;

public class Demo {
    public static void main(String[] args) {
        //同步方法解决数据安全问题

        MyRunnable mr=new MyRunnable();
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);

        t1.setName("窗口一");
        t1.setName("窗口二");

        t1.start();
        t2.start();
    }
}
