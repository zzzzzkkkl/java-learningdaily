package test.test6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        //线程池改进

        //创建线程池对象
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                3,//核心线程数量
                16,//线程池总大小
                60,//空闲时间
                TimeUnit.SECONDS,//时间单位
                new ArrayBlockingQueue<>(2),//队列
                Executors.defaultThreadFactory(),//线程工厂
                new ThreadPoolExecutor.AbortPolicy()//阻塞队列
        );

        //1.创建对象并绑定端口
        ServerSocket ss=new ServerSocket(10000);
        while(true){
            //2.等待客户端来连接
            Socket socket=ss.accept();
            //开启一条线程
            //一个用户对应服务端的一条线程
            
            /*new Thread(new test.test5.MyRunnable(socket)).start();*/
            pool.submit(new MyRunnable(socket));
        }
    }
}
