package producerconsumer.demo3;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        //创建阻塞队列对象 容量为1
        ArrayBlockingQueue<String> arrayBlockingQueue=new ArrayBlockingQueue<>(1);

        //存储元素
        arrayBlockingQueue.put("汉堡");

        //取元素
        System.out.println(arrayBlockingQueue.take());

        //取不到会阻塞
        System.out.println(arrayBlockingQueue.take());

        System.out.println("程序结束");
    }
}
