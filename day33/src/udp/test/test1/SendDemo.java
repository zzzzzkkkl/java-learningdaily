package udp.test.test1;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        /*需求：
        UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
         */

        //创建发送端的Socket
        DatagramSocket ds=new DatagramSocket();
        //键盘录入数据
        Scanner sc=new Scanner(System.in);
        while(true){
            String s=sc.nextLine();
            if("886".equals(s)){
                //输入的是886 发送数据结束
                break;
            }
            //创建数据，并把数据打包
            byte[] bys=s.getBytes();
            DatagramPacket dp=new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.1.66"),12345);
            //调用send 发送
            ds.send(dp);
        }
        //关闭
        ds.close();
    }
}
