package producerconsumer.demo4;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread{
    private ArrayBlockingQueue<String> bd;
    public Cooker(ArrayBlockingQueue<String> bd){
        this.bd=bd;
    }

    @Override
    public void run() {
        while(true){
            try {
                //往阻塞队列里放一个汉堡
                bd.put("汉堡");
                System.out.println("生产一个汉堡");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
