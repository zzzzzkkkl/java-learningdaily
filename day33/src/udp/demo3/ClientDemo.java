package udp.demo3;

import java.io.IOException;
import java.net.*;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //UDP广播实现

        //1.创建发送端的Socket对象
        DatagramSocket ds=new DatagramSocket();
        //2.创建存储数据的箱子，将广播地址封装进去
        String s="广播 hello";
        byte[] bys=s.getBytes();
        InetAddress address=InetAddress.getByName("255.255.255.255");
        int port=10000;
        DatagramPacket dp=new DatagramPacket(bys,bys.length,address,port);
        //3.发送数据
        ds.send(dp);
        //关闭
        ds.close();
    }
}
