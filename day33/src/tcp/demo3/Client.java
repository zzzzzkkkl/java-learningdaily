package tcp.demo3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //TCP传输中文

        //1.创建Socket对象
        Socket socket=new Socket("127.0.0.1",10000);
        //2.可以从连接通道获取输出流
        OutputStream os=socket.getOutputStream();
        //写出数据
        os.write("你好".getBytes());
        //关闭
        os.close();
        socket.close();
    }
}
