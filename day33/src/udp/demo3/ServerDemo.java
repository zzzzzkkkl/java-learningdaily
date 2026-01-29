package udp.demo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //UDP广播实现

        //1.创建接收端Socket对象
        DatagramSocket ds=new DatagramSocket(10000);
        //2.创建一个数据包，用于接收数据
        DatagramPacket dp=new DatagramPacket(new byte[1024],1024);
        //3.调用DatagramSocket对象的方法接收数据
        ds.receive(dp);
        //4.解析数据包
        byte[] data=dp.getData();
        int length=dp.getLength();
        System.out.println(new String(data,0,length));
        //关闭
        ds.close();
    }
}
