package test.test5;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        /*
        服务器只能处理一个客户端请求，接收完一个图片之后，服务器就关闭了。
        优化方案一：使用循环
        弊端：
        第一个用户正在上传数据，第二个用户就来访问了，此时第二个用户是无法成功上传的。
        所以，使用多线程改进
        优化方案二：每来一个用户，就开启多线程处理
         */

        Socket socket=new Socket("127.0.0.1",10000);
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("mysocketnet\\clientdir\\a.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        byte[] bys=new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

        socket.shutdownOutput();

        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line=br.readLine();
        System.out.println(line);

        socket.close();
    }
}
