package test.test2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        /*
        需求：
        客户端：发送数据，接受服务器反馈
        服务器：收到消息后给出反馈
         */

        ServerSocket ss=new ServerSocket(10000);
        Socket accept=ss.accept();

        InputStream is=accept.getInputStream();
        int b;
        while((b=is.read())!=-1){
            System.out.println((char)b);
        }
        System.out.println("看看我执行了吗");

        //输出反馈给客户端
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("你谁啊");
        bw.newLine();
        //强制将缓冲区中暂存的数据，立即写入目标设备
        bw.flush();

        bw.close();
        is.close();
        accept.close();
        ss.close();
    }
}
