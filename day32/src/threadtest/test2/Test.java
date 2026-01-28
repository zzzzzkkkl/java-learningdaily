package threadtest.test2;

public class Test {
    public static void main(String[] args) {
        /*
        需求：
        有100份礼品,两人同时发送，当剩下的礼品小于10份的时候则不再送出。
        利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来.
         */

        //创建MyRunnable类对象
        MyRunnable mr=new MyRunnable();

        //创建Thread类对象，MyRunnable类对象作为参数
        Thread t1=new Thread(mr,"窗口一");
        Thread t2=new Thread(mr,"窗口二");

        //启动线程
        t1.start();
        t2.start();
    }
}
