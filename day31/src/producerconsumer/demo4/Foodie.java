package producerconsumer.demo4;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    private ArrayBlockingQueue<String> bd;
    public Foodie(ArrayBlockingQueue<String> bd){
        this.bd=bd;
    }

    @Override
    public void run() {
        while(true){
            try {
                String take=bd.take();
                System.out.println("吃货来吃汉堡"+take);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
