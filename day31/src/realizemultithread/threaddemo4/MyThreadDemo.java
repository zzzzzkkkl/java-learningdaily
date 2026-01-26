package realizemultithread.threaddemo4;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1=new MyThread();
        MyThread my2=new MyThread();

        //将此线程的名字更改为等于参数name
        my1.setName("高铁");
        my2.setName("飞机");

        //Thread(String name)
        MyThread my3=new MyThread("高铁");
        MyThread my4=new MyThread("飞机");

        my1.start();
        my4.start();

        //static Thread currentThread()返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
    }
}
