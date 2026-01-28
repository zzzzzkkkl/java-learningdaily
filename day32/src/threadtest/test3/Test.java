package threadtest.test3;

public class Test {
    public static void main(String[] args) {
        /*
        需求：同时开启两个线程，共同获取1-100之间的所有数字。
        将输出所有的奇数。
         */

        MyRunnable mr=new MyRunnable();

        Thread t1=new Thread(mr,"线程一");
        Thread t2=new Thread(mr,"线程二");

        t1.start();
        t2.start();
    }
}
