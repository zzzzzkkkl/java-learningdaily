package test.test4;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        /*
        文件名重复
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

        //接受服务器的反馈
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line=br.readLine();
        System.out.println(line);

        //关闭
        socket.close();
    }
}
