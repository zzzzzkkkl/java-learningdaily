package test.test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        /*
        需求：
        客户端：多次发送数据
         */

        //1.创建Socket对象并连接服务器
        Socket socket=new Socket("127.0.0.1",10000);
        //2.写出数据
        Scanner sc=new Scanner(System.in);
        OutputStream os=socket.getOutputStream();

        while(true){
            System.out.println("请输入您要发送的信息");
            String str=sc.nextLine();
            if("886".equals(str)){
                break;
            }
            os.write(str.getBytes());
        }
        //关闭
        socket.close();
    }
}
