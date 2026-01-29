package udp.demo2;

import java.io.IOException;
import java.net.*;

public class ClintDemo {
    public static void main(String[] args) throws IOException {
        //UDP组播实现

        //1.创建发送端的Socket对象
        DatagramSocket ds=new DatagramSocket();
        String s="hello 组播";
        byte[] bys=s.getBytes();
        //确定主机名称的ip地址。主机名可以是ip,也可以是主机名称
        InetAddress address=InetAddress.getByName("224.0.1.0");
        int port=10000;
        //2.创建数据包
        DatagramPacket dp=new DatagramPacket(bys,bys.length,address,port);
        //3.调用发送 发给组播地址
        ds.send(dp);
        //关闭
        ds.close();
    }
}
