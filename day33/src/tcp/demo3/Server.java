package tcp.demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //TCP传输中文

        //1.创建对象ServerSocket
        ServerSocket ss=new ServerSocket(10000);
        //2.监听客户端的连接
        Socket socket=ss.accept();
        //3.从连接通道获取输入流读取数据
        InputStream is=socket.getInputStream();
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);

        int b;
        while((b=br.read())!=-1){
            System.out.println((char) b);
        }

        //关闭
        socket.close();
        ss.close();
    }
}
