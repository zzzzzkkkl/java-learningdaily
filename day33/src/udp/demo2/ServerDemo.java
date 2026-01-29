package udp.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //UDP组播实现

        //1.创建接收端的Socket对象
        MulticastSocket ms=new MulticastSocket(10000);
        //2.创建一个箱子，用于接收数据
        DatagramPacket dp=new DatagramPacket(new byte[1024],1024);
        //3.把当前计算机绑定一个组播地址，表示添加到这一组
        ms.joinGroup(InetAddress.getByName("224.0.1.0"));
        //4.将数据添加到箱子里
        ms.receive(dp);
        //5.解析数据包，并打印数据
        byte[] data=dp.getData();
        int length=dp.getLength();
        System.out.println(new String(data,0,length));
        //关闭
        ms.close();
    }
}
