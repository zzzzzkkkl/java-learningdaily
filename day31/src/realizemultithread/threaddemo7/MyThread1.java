package realizemultithread.threaddemo7;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(getName()+i);
        }
        System.out.println(getName()+":循环执行完");
    }
}
