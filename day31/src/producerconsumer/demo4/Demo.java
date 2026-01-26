package producerconsumer.demo4;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        //阻塞队列和生产者消费者
        ArrayBlockingQueue<String> bd=new ArrayBlockingQueue<>(1);

        Foodie f=new Foodie(bd);
        Cooker c=new Cooker(bd);

        f.start();
        c.start();
    }
}
