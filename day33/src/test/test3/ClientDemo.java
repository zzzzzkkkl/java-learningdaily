package test.test3;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        /*
        需求：
        客户端：数据来自于本地文件，接收服务器反馈
        服务器：接收到的数据写入本地文件，给出反馈
         */

        Socket socket=new Socket("127.0.0.1",10000);
        //读取本地文件中的数据到内存，再写出到服务器中
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("mysocketnet\\\\clientdir\\\\a.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        byte[] bys=new byte[1024];
        int len;
        while((len=bis.read())!=-1){
            bos.write(bys,0,len);
        }

        //告诉服务器 仅关闭输出流
        socket.shutdownOutput();

        //接收服务器的反馈
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line=br.readLine();
        System.out.println(line);

        socket.close();
    }
}
