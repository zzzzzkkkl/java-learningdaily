package tcp.demo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //TCP发送数据

        //1.创建Socket对象
        //细节：在创建对象的同时会连接服务端，如果连不上，代码会报错
        Socket socket=new Socket("127.0.0.1",10000);
        //2.可以从连接通道中获取输出流
        OutputStream os=socket.getOutputStream();
        //写出数据
        os.write("aaa".getBytes());
        //关闭
        os.close();
        socket.close();
    }
}
