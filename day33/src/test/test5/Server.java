package test.test5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        /*
        服务器只能处理一个客户端请求，接收完一个图片之后，服务器就关闭了。
        优化方案一：使用循环
        弊端：
        第一个用户正在上传数据，第二个用户就来访问了，此时第二个用户是无法成功上传的。
        所以，使用多线程改进
        优化方案二：每来一个用户，就开启多线程处理
         */

        //1.创建对象并绑定端口
        ServerSocket ss=new ServerSocket(10000);
        while(true){
            //2.等待客户端连接
            Socket socket=ss.accept();
            //开启一条线程
            //一个用户端对应服务端一条线程
            new Thread(new MyRunnable(socket)).start();
        }
    }
}
