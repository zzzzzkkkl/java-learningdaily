package realizemultithread.threaddemo1;

public class MythreadDemo {
    public static void main(String[] args) {
        //实现多线程
        MyThread my1=new MyThread();
        MyThread my2=new MyThread();

        /*my1.run();*/

        //start导致此线程开始执行，java虚拟机调用此线程的run方法
        my1.start();
    }
}
