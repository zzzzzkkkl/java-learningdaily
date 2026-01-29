package test.test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        Socket socket=ss.accept();
        //读取客户端传过来的数据保存到本地
        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("mysocketnet\\\\serverdir\\\\a.jpg"));
        int len;
        //字节缓冲区数组，用来临时存放每次读取到的字节数据
        byte[] bys=new byte[1024];
        while((len=bis.read(bys))!=-1){
            /*
            参数一：要写入哪
            参数二：从索引几开始写
            参数三：值写入本次读到的有效字节数len
             */
            bos.write(bys,0,len);
        }
        bos.close();

        //给客户端发反馈
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        /*
        注意：
        bis,bw都是依附于socket的网络流，所以socket关了就好
        bos是独立的本地文件
        ss是独立的服务端监听套接字
         */
        socket.close();
        ss.close();
    }
}
